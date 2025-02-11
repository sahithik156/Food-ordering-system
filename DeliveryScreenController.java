/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagementsystem;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.controlsfx.control.Notifications;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author akank
 */
public class DeliveryScreenController implements Initializable {

    @FXML
    private JFXTextField PinCode;
    @FXML
    private JFXTextField City;
    @FXML
    private JFXTextField State;
    @FXML
    private JFXTextArea StreetAddress;
    String query,PNum;
    int OrderNum,t,tc;
    PreparedStatement preparedStmt;
    ResultSet rs;
    Connection connection=DBConnection.getConnection();
    @FXML
    private StackPane sp;
    @FXML
    private RadioButton CreditCardBtn;
    @FXML
    private ToggleGroup tg;
    @FXML
    private RadioButton DebitCardBtn;
    @FXML
    private RadioButton UPIBtn;
    @FXML
    private RadioButton CODBtn;
    @FXML
    private JFXTextField Total;
    @FXML
    private RadioButton Save5Coupon;
    @FXML
    private JFXTextField TotalCoupon;
    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try{
        query = "select * from orders";
                    
                    preparedStmt=(PreparedStatement)connection.prepareStatement(query);
                    rs=preparedStmt.executeQuery();
                    rs.last();
                    t=rs.getInt(5);
        Total.setText(String.valueOf(t));
        }
        catch(Exception e)
        {
            System.out.println("fail"+e);
            System.out.println("Got an exception!");
      System.err.println(e.getMessage());
        }
        
        
    }    

    @FXML
    private void DelAdrConfirm(MouseEvent event) {
                 
        
        if(PinCode.getText().toString().equals("")){
            Image image=new Image("delete.png");
                Notifications notification=Notifications.create()
                        .title("Error")
                        .text("Pin code Is Empty")
                        .hideAfter(Duration.seconds(3))
                        .position(Pos.BOTTOM_LEFT)
                        .graphic(new ImageView(image));
                notification.darkStyle();
                notification.show();
        }else if(StreetAddress.getText().toString().equals("")){
            Image image=new Image("delete.png");
                Notifications notification=Notifications.create()
                        .title("Error")
                        .text("Street Address Is Empty")
                        .hideAfter(Duration.seconds(3))
                        .position(Pos.BOTTOM_LEFT)
                        .graphic(new ImageView(image));
                notification.darkStyle();
                notification.show();
        }else if(City.getText().toString().equals("")){
            Image image=new Image("delete.png");
                Notifications notification=Notifications.create()
                        .title("Error")
                        .text("City Is Empty")
                        .hideAfter(Duration.seconds(3))
                        .position(Pos.BOTTOM_LEFT)
                        .graphic(new ImageView(image));
                notification.darkStyle();
                notification.show();
        }else if(State.getText().toString().equals("")){
            Image image=new Image("delete.png");
                Notifications notification=Notifications.create()
                        .title("Error")
                        .text("State Is Empty")
                        .hideAfter(Duration.seconds(3))
                        .position(Pos.BOTTOM_LEFT)
                        .graphic(new ImageView(image));
                notification.darkStyle();
                notification.show();
        }
        else{
        try{
            int a=(int)(Math.random()*(45))+15;
            String s=Integer.toString(a);
            boolean payment=false;
            if(CreditCardBtn.isSelected()){
                payment=true;
                
            }
            else if(DebitCardBtn.isSelected()){
                payment=true;
                
            }
            else if(UPIBtn.isSelected()){
                payment=true;
                
            }
            else if(CODBtn.isSelected()){
                payment=true;
              
            }
            if(payment==true){
                TotalCoupon.setText("");
                    if(Save5Coupon.isSelected()){
                    
                        tc=0;
                    try{
                    query = "select * from orders";
                    
                    preparedStmt=(PreparedStatement)connection.prepareStatement(query);
                    rs=preparedStmt.executeQuery();
                    rs.last();
                    t=rs.getInt(5);
                    PNum=rs.getString(2);
                    
                    if(t>1000){
                        tc=t-(t/20);
                        TotalCoupon.setText(String.valueOf(tc));
                        JFXDialogLayout dl=new JFXDialogLayout();
                        dl.setHeading(new Text("5% OFF"));
                        dl.setBody(new Text("Coupon applied !!"));
                        JFXButton ok=new JFXButton("OK");
            
                        JFXDialog dialog=new JFXDialog(sp,dl, JFXDialog.DialogTransition.CENTER); 
                        ok.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            dialog.close();
                                             JFXDialogLayout dl=new JFXDialogLayout();
            dl.setHeading(new Text("ESTIMATED DELIVERY TIME"));
            dl.setBody(new Text("You can expect your order in "+s+" min"));
            JFXButton proceed=new JFXButton("Proceed");
            JFXButton cancel=new JFXButton("Cancel");
            JFXDialog dialog=new JFXDialog(sp,dl, JFXDialog.DialogTransition.CENTER);
             proceed.setOnAction(new EventHandler<ActionEvent>() {
           
           
             
            @Override
            public void handle(ActionEvent event) {
                try {
                    
                    query = "select * from orders";
                    
                    preparedStmt=(PreparedStatement)connection.prepareStatement(query);
                    
                    rs=preparedStmt.executeQuery();
                    rs.last();
                    OrderNum=rs.getInt(1);
                   
                        
                            query = "update orders set Amount='"+tc+"' where Pno='"+PNum+"' and Order_no='"+OrderNum+"'";
                    preparedStmt=(PreparedStatement)connection.prepareStatement(query);
                    preparedStmt.execute();
                            query = "update orders set Discount='5' where Pno='"+PNum+"' and Order_no='"+OrderNum+"'";
                    preparedStmt=(PreparedStatement)connection.prepareStatement(query);
                    preparedStmt.execute();
                        
                        
                    
              
                    query = " insert into delivery (Ono,delivery_time,City,Pincode,Street_address,State)"+" values (?, ?, ?, ?, ?, ?)";
                    preparedStmt = connection.prepareStatement(query);
                    preparedStmt.setInt(1,OrderNum);
                    preparedStmt.setInt(2,a);
                    preparedStmt.setString(3,City.getText().toString().trim());
                    preparedStmt.setString(4,PinCode.getText().toString().trim());
                    preparedStmt.setString(5,StreetAddress.getText().toString().trim());
                    preparedStmt.setString(6,State.getText().toString().trim());
                    preparedStmt.execute();
                    query = " insert into payment (Payment_type,O_no)"+" values (?, ?)";
                    preparedStmt=(PreparedStatement)connection.prepareStatement(query);
                    if(CreditCardBtn.isSelected()){
                        preparedStmt.setString(1,"Credit Card");
                        ;
                    preparedStmt.setInt(2,OrderNum);
                    preparedStmt.execute();
                    }
                    if(DebitCardBtn.isSelected()){
                       
                        preparedStmt.setString(1,"Debit Card");
                  
                    preparedStmt.setInt(2,OrderNum);
                    preparedStmt.execute();
                    }
                    if(UPIBtn.isSelected()){
                        preparedStmt.setString(1,"UPI");
                  
                    preparedStmt.setInt(2,OrderNum);
                    preparedStmt.execute();
                    }
                    if(CODBtn.isSelected()){
                        preparedStmt.setString(1,"COD");
                
                    preparedStmt.setInt(2,OrderNum);
                    preparedStmt.execute();
                    }
                    
                     Stage billScreen=new Stage();
                        Parent root=null;
                        
                        try {
                            root=FXMLLoader.load(getClass().getResource("BillScreen.fxml"));
                        } catch (IOException ex) {
                            Logger.getLogger(LSController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        Stage current=(Stage)PinCode.getScene().getWindow();
                        Scene scene=new Scene(root,1366,730);
                        
                        billScreen.setScene(scene);
                        billScreen.initStyle(StageStyle.TRANSPARENT);
                        Screen screen = Screen.getPrimary();
                        billScreen.setFullScreen(true);
Rectangle2D bounds = screen.getVisualBounds();

billScreen.setX(bounds.getMinX());
billScreen.setY(bounds.getMinY());
billScreen.setWidth(bounds.getWidth());
billScreen.setHeight(bounds.getHeight());
                        current.hide();
                        
                        billScreen.show();
                } catch (SQLException ex) {
                    Logger.getLogger(DeliveryScreenController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            });
             cancel.setOnAction(new EventHandler<ActionEvent>() {
                     @Override
                     public void handle(ActionEvent event) {
                        dialog.close();
                     }
                 });
        
            dl.setActions(proceed,cancel);
            dialog.show();
                        
                        }
                        });
                        dl.setActions(ok);
                        dialog.show();
                    }
                    else{
                             
                        
                        JFXDialogLayout dl=new JFXDialogLayout();
                        dl.setHeading(new Text("SORRY"));
                        dl.setBody(new Text("Coupon not applicable"));
                        JFXButton ok=new JFXButton("OK");
            
                        JFXDialog dialog=new JFXDialog(sp,dl, JFXDialog.DialogTransition.CENTER); 
                        ok.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            dialog.close();
                                             JFXDialogLayout dl=new JFXDialogLayout();
            dl.setHeading(new Text("ESTIMATED DELIVERY TIME"));
            dl.setBody(new Text("You can expect your order in "+s+" min"));
            JFXButton proceed=new JFXButton("Proceed");
            JFXButton cancel=new JFXButton("Cancel");
            JFXDialog dialog=new JFXDialog(sp,dl, JFXDialog.DialogTransition.CENTER);
             proceed.setOnAction(new EventHandler<ActionEvent>() {
           
           
             
            @Override
            public void handle(ActionEvent event) {
                try {
                    
                    query = "select * from orders";
                    
                    preparedStmt=(PreparedStatement)connection.prepareStatement(query);
                    
                    rs=preparedStmt.executeQuery();
                    rs.last();
                    OrderNum=rs.getInt(1);
                 
                    query = " insert into delivery (Ono,delivery_time,City,Pincode,Street_address,State)"+" values (?, ?, ?, ?, ?, ?)";
                    preparedStmt = connection.prepareStatement(query);
                    preparedStmt.setInt(1,OrderNum);
                    preparedStmt.setInt(2,a);
                    preparedStmt.setString(3,City.getText().toString().trim());
                    preparedStmt.setString(4,PinCode.getText().toString().trim());
                    preparedStmt.setString(5,StreetAddress.getText().toString().trim());
                    preparedStmt.setString(6,State.getText().toString().trim());
                    preparedStmt.execute();
                    query = " insert into payment (Payment_type,O_no)"+" values (?, ?)";
                    preparedStmt=(PreparedStatement)connection.prepareStatement(query);
                    if(CreditCardBtn.isSelected()){
                        preparedStmt.setString(1,"Credit Card");
                        ;
                    preparedStmt.setInt(2,OrderNum);
                    preparedStmt.execute();
                    }
                    if(DebitCardBtn.isSelected()){
                       
                        preparedStmt.setString(1,"Debit Card");
                  
                    preparedStmt.setInt(2,OrderNum);
                    preparedStmt.execute();
                    }
                    if(UPIBtn.isSelected()){
                        preparedStmt.setString(1,"UPI");
                  
                    preparedStmt.setInt(2,OrderNum);
                    preparedStmt.execute();
                    }
                    if(CODBtn.isSelected()){
                        preparedStmt.setString(1,"COD");
                
                    preparedStmt.setInt(2,OrderNum);
                    preparedStmt.execute();
                    }
                    
                     Stage billScreen=new Stage();
                        Parent root=null;
                        
                        try {
                            root=FXMLLoader.load(getClass().getResource("BillScreen.fxml"));
                        } catch (IOException ex) {
                            Logger.getLogger(LSController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        Stage current=(Stage)PinCode.getScene().getWindow();
                        Scene scene=new Scene(root,1366,730);
                        
                        billScreen.setScene(scene);
                        billScreen.initStyle(StageStyle.TRANSPARENT);
                        Screen screen = Screen.getPrimary();
                        billScreen.setFullScreen(true);
Rectangle2D bounds = screen.getVisualBounds();

billScreen.setX(bounds.getMinX());
billScreen.setY(bounds.getMinY());
billScreen.setWidth(bounds.getWidth());
billScreen.setHeight(bounds.getHeight());
                        current.hide();
                        
                        billScreen.show();
                } catch (SQLException ex) {
                    Logger.getLogger(DeliveryScreenController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            });
             cancel.setOnAction(new EventHandler<ActionEvent>() {
                     @Override
                     public void handle(ActionEvent event) {
                        dialog.close();
                     }
                 });
        
            dl.setActions(proceed,cancel);
            dialog.show();
                        
                        }
                        });
                        dl.setActions(ok);
                        dialog.show();
                    }
                    
                    
        }
        catch(Exception e)
        {
            System.out.println("fail"+e);
            System.out.println("Got an exception!");
      System.err.println(e.getMessage());
        }
                
            }
                    else{
                              
                        
                        
                                            JFXDialogLayout dl=new JFXDialogLayout();
            dl.setHeading(new Text("ESTIMATED DELIVERY TIME"));
            dl.setBody(new Text("You can expect your order in "+s+" min"));
            JFXButton proceed=new JFXButton("Proceed");
            JFXButton cancel=new JFXButton("Cancel");
            JFXDialog dialog=new JFXDialog(sp,dl, JFXDialog.DialogTransition.CENTER);
             proceed.setOnAction(new EventHandler<ActionEvent>() {
           
           
             
            @Override
            public void handle(ActionEvent event) {
                try {
                    
                    query = "select * from orders";
                    
                    preparedStmt=(PreparedStatement)connection.prepareStatement(query);
                    
                    rs=preparedStmt.executeQuery();
                    rs.last();
                    OrderNum=rs.getInt(1);
                 
                    query = " insert into delivery (Ono,delivery_time,City,Pincode,Street_address,State)"+" values (?, ?, ?, ?, ?, ?)";
                    preparedStmt = connection.prepareStatement(query);
                    preparedStmt.setInt(1,OrderNum);
                    preparedStmt.setInt(2,a);
                    preparedStmt.setString(3,City.getText().toString().trim());
                    preparedStmt.setString(4,PinCode.getText().toString().trim());
                    preparedStmt.setString(5,StreetAddress.getText().toString().trim());
                    preparedStmt.setString(6,State.getText().toString().trim());
                    preparedStmt.execute();
                    query = " insert into payment (Payment_type,O_no)"+" values (?, ?)";
                    preparedStmt=(PreparedStatement)connection.prepareStatement(query);
                    if(CreditCardBtn.isSelected()){
                        preparedStmt.setString(1,"Credit Card");
                        ;
                    preparedStmt.setInt(2,OrderNum);
                    preparedStmt.execute();
                    }
                    if(DebitCardBtn.isSelected()){
                       
                        preparedStmt.setString(1,"Debit Card");
                  
                    preparedStmt.setInt(2,OrderNum);
                    preparedStmt.execute();
                    }
                    if(UPIBtn.isSelected()){
                        preparedStmt.setString(1,"UPI");
                  
                    preparedStmt.setInt(2,OrderNum);
                    preparedStmt.execute();
                    }
                    if(CODBtn.isSelected()){
                        preparedStmt.setString(1,"COD");
                
                    preparedStmt.setInt(2,OrderNum);
                    preparedStmt.execute();
                    }
                    
                     Stage billScreen=new Stage();
                        Parent root=null;
                        
                        try {
                            root=FXMLLoader.load(getClass().getResource("BillScreen.fxml"));
                        } catch (IOException ex) {
                            Logger.getLogger(LSController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        Stage current=(Stage)PinCode.getScene().getWindow();
                        Scene scene=new Scene(root,1366,730);
                        
                        billScreen.setScene(scene);
                        billScreen.initStyle(StageStyle.TRANSPARENT);
                        Screen screen = Screen.getPrimary();
                        billScreen.setFullScreen(true);
Rectangle2D bounds = screen.getVisualBounds();

billScreen.setX(bounds.getMinX());
billScreen.setY(bounds.getMinY());
billScreen.setWidth(bounds.getWidth());
billScreen.setHeight(bounds.getHeight());
                        current.hide();
                        
                        billScreen.show();
                } catch (SQLException ex) {
                    Logger.getLogger(DeliveryScreenController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            });
             cancel.setOnAction(new EventHandler<ActionEvent>() {
                     @Override
                     public void handle(ActionEvent event) {
                        dialog.close();
                     }
                 });
        
            dl.setActions(proceed,cancel);
            dialog.show();
                        
                        
                    }
            }
            else{                
                JFXDialogLayout dl=new JFXDialogLayout();
            dl.setHeading(new Text("WARNING"));
            dl.setBody(new Text("Payment mode not selected"));
            JFXButton ok=new JFXButton("OK");
            
            JFXDialog dialog=new JFXDialog(sp,dl, JFXDialog.DialogTransition.CENTER); 
            ok.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        
                        dialog.close();
                    }
                });
            dl.setActions(ok);
            dialog.show();
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
    private void ExitBtn(MouseEvent event) {
       JFXDialogLayout dl=new JFXDialogLayout();
            dl.setHeading(new Text("WARNING"));
            dl.setBody(new Text("Do you want to exit ?"));
            JFXButton yes=new JFXButton("Yes");
            JFXButton no=new JFXButton("No");
            JFXDialog dialog=new JFXDialog(sp,dl, JFXDialog.DialogTransition.CENTER); 
          yes.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               try{
            query = "select * from orders";
            preparedStmt=(PreparedStatement)connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
            OrderNum=rs.getInt(1);
            PNum=rs.getString(2);
            query = "update customer set Login_status='0' where phone_number='"+PNum+"'";
                    preparedStmt=(PreparedStatement)connection.prepareStatement(query);
                    preparedStmt.execute();
            query = "delete from orders where Order_no='"+OrderNum+"'";
            preparedStmt=(PreparedStatement)connection.prepareStatement(query);
            preparedStmt.execute();
            query = "delete from order_details where Order_no='"+OrderNum+"'";
            preparedStmt=(PreparedStatement)connection.prepareStatement(query);
            preparedStmt.execute();
                   
            
        }
        catch(Exception e)
        {
            System.out.println("fail"+e);
            System.out.println("Got an exception!");
      System.err.println(e.getMessage());
        }
               System.exit(0);
                         }
       });
  no.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               dialog.close();
           }
       });
    dl.setActions(yes,no);
            dialog.show();
}


}
