/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagementsystem;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import static ordermanagementsystem.DBConnection.connection;

/**
 * FXML Controller class
 *
 * @author akank
 */

public class PrevOrderScreenController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TableColumn<Prev,Integer> OrderNo;

    @FXML
    private TableColumn<Prev,Date> Date;

    @FXML
    private TableColumn<Prev,Time> Time;

    @FXML
    private TableColumn<Prev,String> FoodItem;

    @FXML
    private TableColumn<Prev,Integer> Qty;
    @FXML
    private TableView<Prev> prevO;
   // Connection conn=DBConnection.getConnection();
    ObservableList<Prev> listM;
    int index=-1;
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    @FXML
    private TableColumn<Prev,Integer> AmountT;
    @FXML
    private StackPane stackpa;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        OrderNo.setCellValueFactory(new PropertyValueFactory<Prev,Integer>("OrderNo"));
        Date.setCellValueFactory(new PropertyValueFactory<Prev,Date>("sqlDate"));
        Time.setCellValueFactory(new PropertyValueFactory<Prev,Time>("sqlTime"));
      //  AmountT.setCellValueFactory(new PropertyValueFactory<Prev,Integer>("Total"));
        FoodItem.setCellValueFactory(new PropertyValueFactory<Prev,String>("Item"));
        Qty.setCellValueFactory(new PropertyValueFactory<Prev,Integer>("Qty"));
        
        listM=PrevDb.getDataUsers();
        prevO.setItems(listM);
    }    

    @FXML
    private void BackToMenuBtn(MouseEvent event) {
       Stage menuScreen=new Stage();
                        Parent root=null;
                        
                        try {
                            root=FXMLLoader.load(getClass().getResource("MenuScreen.fxml"));
                        } catch (IOException ex) {
                            Logger.getLogger(LSController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        Stage current=(Stage)prevO.getScene().getWindow();
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

    @FXML
    private void ExitBtn(MouseEvent event) {
        
        JFXDialogLayout dialogl=new JFXDialogLayout();
        dialogl.setHeading(new Text("Close"));
        dialogl.setBody(new Text("Do you want to exit ?"));
        JFXButton yes=new JFXButton("Yes");
        JFXButton no=new JFXButton("No");
        
        JFXDialog dia=new JFXDialog(stackpa,dialogl, JFXDialog.DialogTransition.CENTER);
       yes.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    
         try{
      String  query = "select * from customer where login_status=1";
      PreparedStatement      preparedStmt=(PreparedStatement)connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
           String PNum=rs.getString(4);
            query = "update customer set Login_status='0' where phone_number='"+PNum+"'";
                    preparedStmt=(PreparedStatement)connection.prepareStatement(query);
                    preparedStmt.execute();
                    System.exit(0);
        }
        catch(Exception e)
        {
            System.out.println("fail"+e);
            System.out.println("Got an exception!");
      System.err.println(e.getMessage());
        }
                }});
       no.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    dia.close();
                }
            });
        
            dialogl.setActions(yes,no);
        dia.show();
      
        
        
        
       
    }
    
}
