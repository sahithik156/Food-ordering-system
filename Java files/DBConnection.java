/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagementsystem;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author akank
 */
public class DBConnection {
   static Connection connection=null;
    public static Connection getConnection(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
	   
            connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","Bts@2013");
         
            
        } catch (Exception e) {
        }
        
        return connection;
    }
    
    
    public static void main(String[] args) {
        getConnection();
    }
}
