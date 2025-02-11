/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagementsystem;

/**
 *
 * @author srees
 */
import java.sql.Date;
import java.sql.Time;

public class Prev {
    int OrderNo,Qty;
    String item;
    java.sql.Date sqlDate;
    java.sql.Time sqlTime;

    public Prev(int OrderNo,int Qty, String item, Date sqlDate, Time sqlTime) {
        this.OrderNo = OrderNo;
       
        this.Qty = Qty;
        this.item = item;
        this.sqlDate = sqlDate;
        this.sqlTime = sqlTime;
    }

    public int getOrderNo() {
        return OrderNo;
    }

   
    public int getQty() {
        return Qty;
    }

    public String getItem() {
        return item;
    }

    public Date getSqlDate() {
        return sqlDate;
    }

    public Time getSqlTime() {
        return sqlTime;
    }

    public void setOrderNo(int OrderNo) {
        this.OrderNo = OrderNo;
    }

    

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setSqlDate(Date sqlDate) {
        this.sqlDate = sqlDate;
    }

    public void setSqlTime(Time sqlTime) {
        this.sqlTime = sqlTime;
    }
    
    
}


