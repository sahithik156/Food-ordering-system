/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagementsystem;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author srees
 */
public class BillScreenController implements Initializable {
    java.util.Date dt=new java.util.Date();
    java.sql.Date sqlDate=new java.sql.Date(dt.getTime());
    java.sql.Time sqlTime=new java.sql.Time(dt.getTime());
    @FXML
    private JFXTextField Ono;
    @FXML
    private JFXTextField Total;
    String query,PNum,PaymentMode;
    int OrderNo,tot,p,d;
    PreparedStatement preparedStmt;
    ResultSet rs;
    Connection connection=DBConnection.getConnection();
    @FXML
    private JFXTextField PayMode;
    @FXML
    private JFXTextArea OrderList;
    @FXML
    private JFXTextArea Qty;
    @FXML
    private JFXTextField Name;
    @FXML
    private JFXTextArea price;
    @FXML
    private JFXTextArea symbol;
    @FXML
    private JFXTextField date;
    @FXML
    private JFXTextField time;
    @FXML
    private JFXTextField Dis;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try{
            query = "select * from customer where login_status=1";
            preparedStmt=(PreparedStatement)connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
            PNum=rs.getString(4);
            Name.setText(rs.getString(1));
            query = "update customer set Login_status='0' where phone_number='"+PNum+"'";
                    preparedStmt=(PreparedStatement)connection.prepareStatement(query);
                    preparedStmt.execute();
            query = "select * from orders";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
            OrderNo=rs.getInt(1); 
            tot=rs.getInt(5); 
            d=rs.getInt(6);
            query="select * from payment where O_no='"+OrderNo+"'";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
            PaymentMode=rs.getString(2);
            query="select name, Quantity, price from order_details join food on order_details.f_id=food.food_id where order_details.Order_no='"+OrderNo+"'";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            OrderList.setText("");
            Qty.setText("");
            price.setText("");
            symbol.setText("");
            date.setText(sqlDate.toString());
            time.setText(sqlTime.toString());
            while(rs.next()){
                symbol.appendText("x"+"\n"+"\n");
                price.appendText(String.valueOf(rs.getString(3))+"\n"+"\n");
                OrderList.appendText(rs.getString(1)+"\n"+"\n");
                Qty.appendText(rs.getString(2)+"\n"+"\n");
            }
            if(d==0){
                Dis.setText("0");
            }
            else{
                Dis.setText("5%");
            }
            
      Ono.setText(String.valueOf(OrderNo));
      Total.setText("Rs "+String.valueOf(tot));
      PayMode.setText(PaymentMode);
      
        }
            catch(Exception e)
        {
            System.out.println("fail"+e);
            System.out.println("Got an exception!");
      System.err.println(e.getMessage());
        }
          
      
    }    
    
    
}
