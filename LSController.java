/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagementsystem;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import static javax.swing.Spring.height;
import org.controlsfx.control.Notifications;

/**
 * FXML Controller class
 *
 * @author srees
 */
public class LSController implements Initializable {

    @FXML
    private JFXTextField phone_number;
    @FXML
    private JFXPasswordField password;
    @FXML
    private StackPane stackp;
    
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   

    @FXML
    private void login(MouseEvent event) {
        
        if(phone_number.getText().toString().equals("")){
            Image image=new Image("delete.png");
                Notifications notification=Notifications.create()
                        .title("Error")
                        .text("Phone number Is Empty")
                        .hideAfter(Duration.seconds(3))
                        .position(Pos.BOTTOM_LEFT)
                        .graphic(new ImageView(image));
                notification.darkStyle();
                notification.show();
        }else if(password.getText().toString().equals("")){
            Image image=new Image("delete.png");
                Notifications notification=Notifications.create()
                        .title("Error")
                        .text("Password Is Empty")
                        .hideAfter(Duration.seconds(3))
                        .position(Pos.BOTTOM_LEFT)
                        .graphic(new ImageView(image));
                notification.darkStyle();
                notification.show();
        }
        else{
        boolean isExist=false;
        
        String userPass="";
        
        
        try {
            String sql="select * from customer where phone_number='"+phone_number.getText().toString().trim()+"'";
        Connection connection=DBConnection.getConnection();
            PreparedStatement ps=(PreparedStatement)connection.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
           if(!(rs.next())){
               JFXDialogLayout di=new JFXDialogLayout();
        di.setHeading(new Text("WARNING"));
        di.setBody(new Text("Invalid Phone number and password, do you want to resgister?"));
        JFXButton yes=new JFXButton("Yes");
        JFXButton no=new JFXButton("No");
        
        JFXDialog dial=new JFXDialog(stackp,di, JFXDialog.DialogTransition.CENTER);
        yes.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage newRegScreen=new Stage();
                        Parent root=null;
                        
                        try {
                            root=FXMLLoader.load(getClass().getResource("NewRegScreen.fxml"));
                        } catch (IOException ex) {
                            Logger.getLogger(LSController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        Stage current=(Stage)phone_number.getScene().getWindow();
                        Scene scene=new Scene(root,1366,730);
                        
                        newRegScreen.setScene(scene);
                        newRegScreen.initStyle(StageStyle.TRANSPARENT);
                        Screen screen = Screen.getPrimary();
                        newRegScreen.setFullScreen(true);
Rectangle2D bounds = screen.getVisualBounds();

newRegScreen.setX(bounds.getMinX());
newRegScreen.setY(bounds.getMinY());
newRegScreen.setWidth(bounds.getWidth());
newRegScreen.setHeight(bounds.getHeight());
                        current.hide();
                        
                        newRegScreen.show();
            }
        });
        no.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               dial.close();
            }
        });
        di.setActions(yes,no);
        dial.show();
    }
            
            
           // while(rs.next())
           else{
                isExist=true;
                userPass=rs.getString(3);
                if(password.getText().toString().trim().equals(userPass)){
                    sql = "update customer set Login_status='1' where phone_number='"+phone_number.getText().toString().trim()+"'";
                    ps=(PreparedStatement)connection.prepareStatement(sql);
                    ps.execute();
                    
                    Stage menuScreen=new Stage();
                        Parent root=null;
                        
                        try {
                            root=FXMLLoader.load(getClass().getResource("MenuScreen.fxml"));
                        } catch (IOException ex) {
                            Logger.getLogger(LSController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        Stage current=(Stage)phone_number.getScene().getWindow();
                        Scene scene=new Scene(root,1366,730);
                       
menuScreen.setMaximized(false);
menuScreen.setScene(scene);

                       Screen screen = Screen.getPrimary();
                        menuScreen.setFullScreen(true);
Rectangle2D bounds = screen.getVisualBounds();

menuScreen.setX(bounds.getMinX());
menuScreen.setY(bounds.getMinY());
menuScreen.setWidth(bounds.getWidth());
menuScreen.setHeight(bounds.getHeight());
                        menuScreen.initStyle(StageStyle.TRANSPARENT);
                        
                        current.hide();
                        
                        menuScreen.show();
                }
                else{
                
                Image image=new Image("delete.png");
                Notifications notification=Notifications.create()
                        .title("Error")
                        .text("Check Your username and password again")
                        .hideAfter(Duration.seconds(3))
                        .position(Pos.BOTTOM_LEFT)
                        .graphic(new ImageView(image));
                notification.darkStyle();
                notification.show();
            }
                
            }
        
            
        }
        
        catch (SQLException ex) {
            Logger.getLogger(LSController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
        
    }

    

    @FXML
    private void userRegistration(MouseEvent event) {
        Stage newRegScreen=new Stage();
                        Parent root=null;
                        
                        try {
                            root=FXMLLoader.load(getClass().getResource("NewRegScreen.fxml"));
                        } catch (IOException ex) {
                            Logger.getLogger(LSController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        Stage current=(Stage)phone_number.getScene().getWindow();
                        Scene scene=new Scene(root,1366,730);
                        
                        newRegScreen.setScene(scene);
                       newRegScreen.setMaximized(false);
newRegScreen.setScene(scene);
Screen screen = Screen.getPrimary();
                        newRegScreen.setFullScreen(true);
Rectangle2D bounds = screen.getVisualBounds();

newRegScreen.setX(bounds.getMinX());
newRegScreen.setY(bounds.getMinY());
newRegScreen.setWidth(bounds.getWidth());
newRegScreen.setHeight(bounds.getHeight());
                        newRegScreen.initStyle(StageStyle.TRANSPARENT);
                        
                        current.hide();
                        
                        newRegScreen.show();
        
    }

    @FXML
    private void exit(MouseEvent event) {
        JFXDialogLayout dl=new JFXDialogLayout();
        dl.setHeading(new Text("Close"));
        dl.setBody(new Text("Do you want to exit ?"));
        JFXButton ok=new JFXButton("OK");
        JFXButton cancel=new JFXButton("Cancel");
        
        JFXDialog dialog=new JFXDialog(stackp,dl, JFXDialog.DialogTransition.CENTER);
        ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               dialog.close();
            }
        });
        dl.setActions(ok,cancel);
        dialog.show();
    }

}
    

