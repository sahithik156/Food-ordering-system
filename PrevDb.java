/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import static ordermanagementsystem.DBConnection.connection;


/**
 *
 * @author srees
 */
public class PrevDb {
    
    
    public static ObservableList<Prev> getDataUsers(){
        Connection conn=DBConnection.getConnection();
        ObservableList<Prev> list=FXCollections.observableArrayList();
        try {
            String query = "select * from customer where login_status=1";
           PreparedStatement preparedStmt=(PreparedStatement)connection.prepareStatement(query);
           ResultSet rsp=preparedStmt.executeQuery();
            rsp.last();
           String PNum=rsp.getString(4);
            PreparedStatement ps=conn.prepareStatement("select o.order_no,o.date,o.time,f.name,od.quantity from orders as o natural join order_details as od natural join food as f where o.order_no=od.order_no and f.food_id=od.f_id and o.Pno="+PNum);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                list.add(new Prev(Integer.parseInt(rs.getString("Order_no")),Integer.parseInt(rs.getString("quantity")),rs.getString("name"), rs.getDate("date"), rs.getTime("time")));
            }
        } catch (Exception e) {
            System.out.println("error :"+e);
        }
        
        
        
        
        return list;
        
    }
}
