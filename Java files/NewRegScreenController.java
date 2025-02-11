/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagementsystem;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
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
import org.controlsfx.control.Notifications;

/**
 * FXML Controller class
 *
 * @author akank
 */
public class NewRegScreenController implements Initializable {
String sql;
PreparedStatement ps;
ResultSet rs;
    @FXML
    private JFXTextField Name;
    @FXML
    private JFXTextField Email;
    @FXML
    private JFXTextField PhoneNum;
    @FXML
    private JFXTextField Password;
    @FXML
    private StackPane sp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Registration(MouseEvent event) {
        if(Name.getText().toString().equals("")){
            Image image=new Image("delete.png");
                Notifications notification=Notifications.create()
                        .title("Error")
                        .text("Name Is Empty")
                        .hideAfter(Duration.seconds(3))
                        .position(Pos.BOTTOM_LEFT)
                        .graphic(new ImageView(image));
                notification.darkStyle();
                notification.show();
        }else if(PhoneNum.getText().toString().equals("")){
            Image image=new Image("delete.png");
                Notifications notification=Notifications.create()
                        .title("Error")
                        .text("Phone Number Is Empty")
                        .hideAfter(Duration.seconds(3))
                        .position(Pos.BOTTOM_LEFT)
                        .graphic(new ImageView(image));
                notification.darkStyle();
                notification.show();
        }else if(Password.getText().toString().equals("")){
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
        
        try{
        Connection connection=DBConnection.getConnection();
        sql="select * from customer where phone_number='"+PhoneNum.getText().toString().trim()+"'";
        ps=(PreparedStatement)connection.prepareStatement(sql);
        rs=ps.executeQuery();
        if(rs.next()){
            
            JFXDialogLayout dialogl=new JFXDialogLayout();
        dialogl.setHeading(new Text("Close"));
        dialogl.setBody(new Text("Do you want to exit ?"));
        JFXButton yes=new JFXButton("Yes");
        JFXButton no=new JFXButton("No");
        
        JFXDialog dia=new JFXDialog(sp,dialogl, JFXDialog.DialogTransition.CENTER);
        yes.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Stage lScreen=new Stage();
        Parent root=null;
                       try {
                   root=FXMLLoader.load(getClass().getResource("LS.fxml"));
               } catch (Exception e) {
               }
           Stage current=(Stage) Name.getScene().getWindow();
           Scene scene=new Scene(root,700,600);
           lScreen.setScene(scene);
            lScreen.setMaximized(false);
lScreen.setScene(scene);
Screen screen = Screen.getPrimary();
                        lScreen.setFullScreen(true);
Rectangle2D bounds = screen.getVisualBounds();

lScreen.setX(bounds.getMinX());
lScreen.setY(bounds.getMinY());
lScreen.setWidth(bounds.getWidth());
lScreen.setHeight(bounds.getHeight());
           lScreen.initStyle(StageStyle.TRANSPARENT);
           current.hide();
           lScreen.show();
                }
            });
        no.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    dia.close();
                }
            });
        
            dialogl.setActions(yes,no);
        dia.show();
        }  
        else{
        
            
        sql = " insert into customer (name,Email_id,Password,Phone_number)"+" values (?, ?, ?, ?)";
        ps=(PreparedStatement)connection.prepareStatement(sql);
        ps.setString (1,Name.getText().toString().trim());
        ps.setString (2,Email.getText().toString().trim());
        ps.setString(3,Password.getText().toString().trim());
        ps.setString(4,PhoneNum.getText().toString().trim());
        ps.execute();
      
      connection.close();
      Stage lScreen=new Stage();
                       Parent root=null;
                       try {
                   root=FXMLLoader.load(getClass().getResource("LS.fxml"));
               } catch (Exception e) {
               }
           Stage current=(Stage) Name.getScene().getWindow();
           Scene scene=new Scene(root,700,600);
           lScreen.setScene(scene);
           Screen screen = Screen.getPrimary();
                        lScreen.setFullScreen(true);
Rectangle2D bounds = screen.getVisualBounds();

lScreen.setX(bounds.getMinX());
lScreen.setY(bounds.getMinY());
lScreen.setWidth(bounds.getWidth());
lScreen.setHeight(bounds.getHeight());
           lScreen.initStyle(StageStyle.TRANSPARENT);
           current.hide();
           lScreen.show();
        }
        }
        catch(Exception e)
        {
            System.out.println("fail"+e);
            System.out.println("Got an exception!");
      System.err.println(e.getMessage());
        }
    }
    }

    @FXML
    private void Cancel(MouseEvent event) {
        JFXDialogLayout dialogl=new JFXDialogLayout();
        dialogl.setHeading(new Text("Close"));
        dialogl.setBody(new Text("Do you want to exit ?"));
        JFXButton ok=new JFXButton("OK");
        JFXButton cancel=new JFXButton("Cancel");
        
        JFXDialog dia=new JFXDialog(sp,dialogl, JFXDialog.DialogTransition.CENTER);
        ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               dia.close();
            }
        });
        dialogl.setActions(ok,cancel);
        dia.show();
    }

    @FXML
    private void Back_to_login(MouseEvent event) {
        Stage lScreen=new Stage();
        Parent root=null;
                       try {
                   root=FXMLLoader.load(getClass().getResource("LS.fxml"));
               } catch (Exception e) {
               }
           Stage current=(Stage) Name.getScene().getWindow();
           Scene scene=new Scene(root,700,600);
           lScreen.setScene(scene);
            lScreen.setMaximized(false);
lScreen.setScene(scene);
Screen screen = Screen.getPrimary();
                        lScreen.setFullScreen(true);
Rectangle2D bounds = screen.getVisualBounds();

lScreen.setX(bounds.getMinX());
lScreen.setY(bounds.getMinY());
lScreen.setWidth(bounds.getWidth());
lScreen.setHeight(bounds.getHeight());
           lScreen.initStyle(StageStyle.TRANSPARENT);
           current.hide();
           lScreen.show();
    }
    
}
