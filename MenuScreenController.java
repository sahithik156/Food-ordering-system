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
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author akank
 */
public class MenuScreenController implements Initializable {
    private JFXTextField PaneerTikkaQty;
    
    int price;
    java.util.Date date=new java.util.Date();
    java.sql.Date sqlDate=new java.sql.Date(date.getTime());
    java.sql.Time sqlTime=new java.sql.Time(date.getTime());
    /**
     * Initializes the controller class.
     */
    String query,PNum;
    PreparedStatement preparedStmt;
    ResultSet rs;
    int OrderNo;
    Connection connection=DBConnection.getConnection();
    @FXML
    private StackPane stackpane;
    @FXML
    private JFXTextField ManchurianQty;
       @FXML
    private JFXTextField MurgMalaiTikkaQty;
    
    @FXML
    private JFXTextField FishAndChipsQty;
 
    @FXML
    private JFXTextField CashewPaneerQty;
 
    @FXML
    private JFXTextField ChanaMasalaQty;
    @FXML
    private JFXTextField AlooGobiQty;
  
    @FXML
    private JFXTextField ButterChickenQty;
 
    @FXML
    private JFXTextField PrawnKurmaQty;
 
    @FXML
    private JFXTextField MuttonCurryQty;
  
    @FXML
    private JFXTextField CashewTomatoQty;
  
    @FXML
    private JFXTextField ZeeraRiceQty;
 
    @FXML
    private JFXTextField VegDumBiryaniQty;
  
    @FXML
    private JFXTextField VegFriedRiceQty;
 
    @FXML
    private JFXTextField EggFriedRiceQty;
 
    @FXML
    private JFXTextField ChickenFriedRiceQty;

    @FXML
    private JFXTextField ChickenDumBiryaniQty;
  
    @FXML
    private JFXTextField MuttonBiryaniQty;
    @FXML
    private JFXTextField PlainRiceQty;
   
    @FXML
    private JFXTextField ButterNaanQty;
 
    @FXML
    private JFXTextField ButterRotiQty;
  
    
    @FXML
    private JFXTextField GarlicNaanQty;
  
    @FXML
    private JFXTextField KulchaQty;
  
    @FXML
    private JFXTextField AlooParathaQty;
    
    @FXML
    private JFXTextField PulkaQty;
  
    @FXML
    private JFXTextField ChocolateIceCreamQty;
   
    @FXML
    private JFXTextField VanillaIceCreamQty;
 
    @FXML
    private JFXTextField ChocolateMousseQty;
  
    @FXML
    private JFXTextField BrownieQty;
   
    @FXML
    private JFXTextField TiramisuQty;
  
    @FXML
    private JFXTextField RasmalaiQty;
    
    @FXML
    private JFXTextField NutellaSandwichQty;
    
    @FXML
    private RadioButton ChocolateIC;
    
    
    @FXML
    private RadioButton ZeeraR;
    
    @FXML
    private RadioButton ButterN;
    @FXML
    private RadioButton ManchurianM;
    @FXML
    private RadioButton MurgMalaiT;
    @FXML
    private RadioButton FishC;
    @FXML
    private RadioButton CashewP;
    @FXML
    private RadioButton ChanaM;
    @FXML
    private RadioButton AlooG;
    @FXML
    private RadioButton ButterC;
    @FXML
    private RadioButton PrawnK;
    @FXML
    private RadioButton MuttonC;
    @FXML
    private RadioButton CashewT;
    @FXML
    private RadioButton VegDumB;
    @FXML
    private RadioButton VegFriedR;
    @FXML
    private RadioButton EggFriedR;
    @FXML
    private RadioButton ChickenFriedR;
    @FXML
    private RadioButton ChickenDumB;
    @FXML
    private RadioButton MuttonB;
    @FXML
    private RadioButton PlainR;
    
    @FXML
    private RadioButton FrenchF;
    @FXML
    private JFXTextField FrenchFriesQty;
    @FXML
    private RadioButton Paneer65P;
    @FXML
    private JFXTextField Paneer65Qty;
    @FXML
    private RadioButton VegM;
    @FXML
    private JFXTextField VegMomosQty;
    @FXML
    private RadioButton DahiB;
    @FXML
    private JFXTextField DahiBhallaQty;
    @FXML
    private RadioButton KulchaK;
    @FXML
    private RadioButton ButterR;
    @FXML
    private RadioButton GarlicN;
    @FXML
    private RadioButton AlooP;
    @FXML
    private RadioButton PulkaP;
    @FXML
    private RadioButton VanillaIC;
    @FXML
    private RadioButton BrownieB;
    @FXML
    private RadioButton TiramisuT;
    @FXML
    private RadioButton RasmalaiR;
    @FXML
    private RadioButton NutellaS;
    @FXML
    private RadioButton ChocolateM;
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    



   
    @FXML
    private void ManchurianBtn(MouseEvent event) {
       ;
    }

    @FXML
    private void MurgMalaiTikkaBtn(MouseEvent event) {
        
    }

    @FXML
    private void FishAndChipsBtn(MouseEvent event) {
        
    }

    @FXML
    private void CashewPaneerBtn(MouseEvent event) {
    }

    @FXML
    private void ChannaMasalaBtn(MouseEvent event) {
    }

    @FXML
    private void AlooGobiBtn(MouseEvent event) {
    }

    @FXML
    private void ButterChickenBtn(MouseEvent event) {
    }

    @FXML
    private void PrawnKurmaBtn(MouseEvent event) {
    }

    @FXML
    private void MuttonCurryBtn(MouseEvent event) {
    }

    @FXML
    private void CashewTomatoBtn(MouseEvent event) {
    }

    @FXML
    private void ZeeraRiceBtn(MouseEvent event) {
     
    }

    @FXML
    private void VegDumBiryaniBtn(MouseEvent event) {
    }

    @FXML
    private void VegFriedRiceBtn(MouseEvent event) {
    }

    @FXML
    private void EggFriedRiceBtn(MouseEvent event) {
            }

    @FXML
    private void ChickenFriedRiceBtn(MouseEvent event) {
    }

    @FXML
    private void ChickenDumBiryaniBtn(MouseEvent event) {
    }

    @FXML
    private void MuttonBiryaniBtn(MouseEvent event) {
    }

    @FXML
    private void PlainRiceBtn(MouseEvent event) {
    }

    @FXML
    private void KulchaBtn(MouseEvent event) {
        
    }

    @FXML
    private void ButterRotiBtn(MouseEvent event) {
        
    }

    @FXML
    private void GarlicNaanBtn(MouseEvent event) {
       
    }

    @FXML
    private void ButterNaanBtn(MouseEvent event) {
        
      
    }

    @FXML
    private void AlooParathaBtn(MouseEvent event) {
        
    }

    @FXML
    private void PulkaBtn(MouseEvent event) {
      
    }

    @FXML
    private void ChocolateIceCreamBtn(MouseEvent event) {
        
        
    }

    @FXML
    private void VanillaIceCreamBtn(MouseEvent event) {
       
        
    }

    @FXML
    private void ChocolateMousseBtn(MouseEvent event) {
    
    }

    @FXML
    private void BrownieBtn(MouseEvent event) {
        
    }

    @FXML
    private void TiramisuBtn(MouseEvent event) {
      
    }

    @FXML
    private void RasmalaiBtn(MouseEvent event) {
        
    }

    @FXML
    private void NutellaSandwichBtn(MouseEvent event) {
        
    }

    @FXML
   private void OrderBtn(MouseEvent event) {
        try
        {
            
            
            
            
            
            int s=0;
            int ChocolateICSum=0;
            int ZeeraRSum=0;
            int ButterNSum=0,ManchurianSum=0,MurgMalaiTSum=0,FishAndCSum=0,CashewPSum=0,ChanaMSum=0,CashewTSum=0,AlooGobiMSum=0,ButterCSum=0,PrawnKSum=0;
            int MuttonCSum=0,VegDumBSum=0,VegFriedRSum=0,EggFriedRSum=0,ChickenFriedRSum=0,ChickenDumBSum=0,MuttonBSum=0,PlainRSum=0,FrenchFsum=0,Paneer65PSum=0,VegMSum=0,DahiBSum=0;
            int ButterRSum=0,GarlicNSum=0,KulchaKSum=0,AlooPSum=0,PulkaPSum=0,VanillaICSum=0,ChocolateMSum=0,BrownieBSum=0,TiramisuTSum=0,RasmalaiRSum=0,NutellaSSum=0;  
            if(FrenchF.isSelected()&&!(FrenchFriesQty.getText().trim().isEmpty())){
                FrenchFsum=0;
            query="select * from food where food_id=51";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            FrenchFsum=(Integer.parseInt(FrenchFriesQty.getText().trim())*(price));
            }
            if(Paneer65P.isSelected()&&!(Paneer65Qty.getText().trim().isEmpty())){
               Paneer65PSum=0;
            query="select * from food where food_id=52";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            Paneer65PSum=(Integer.parseInt(Paneer65Qty.getText().trim())*(price));
            }
            if(VegM.isSelected()&&!(VegMomosQty.getText().trim().isEmpty())){
                VegMSum=0;
            query="select * from food where food_id=53";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            VegMSum=(Integer.parseInt(VegMomosQty.getText().trim())*(price));
            }
            if(DahiB.isSelected()&&!(DahiBhallaQty.getText().trim().isEmpty())){
                DahiBSum=0;
            query="select * from food where food_id=54";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            DahiBSum=(Integer.parseInt(DahiBhallaQty.getText().trim())*(price));
            }
            
           
            if(ManchurianM.isSelected()&&!(ManchurianQty.getText().trim().isEmpty())){
                ManchurianSum=0;
            query="select * from food where food_id=5";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            ManchurianSum=(Integer.parseInt(ManchurianQty.getText().trim())*(price));
            }
            if(MurgMalaiT.isSelected()&&!(MurgMalaiTikkaQty.getText().trim().isEmpty())){
                MurgMalaiTSum=0;
            query="select * from food where food_id=6";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            MurgMalaiTSum=(Integer.parseInt(MurgMalaiTikkaQty.getText().trim())*(price));
            }
            if(FishC.isSelected()&&!(FishAndChipsQty.getText().trim().isEmpty())){
                FishAndCSum=0;
            query="select * from food where food_id=7";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            FishAndCSum=(Integer.parseInt(FishAndChipsQty.getText().trim())*(price));
            }
            if(CashewP.isSelected()&&!(CashewPaneerQty.getText().trim().isEmpty())){
                CashewPSum=0;
            query="select * from food where food_id=14";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            CashewPSum=(Integer.parseInt(CashewPaneerQty.getText().trim())*(price));
            }
            if(ChanaM.isSelected()&&!(ChanaMasalaQty.getText().trim().isEmpty())){
                ChanaMSum=0;
            query="select * from food where food_id=13";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            ChanaMSum=(Integer.parseInt(ChanaMasalaQty.getText().trim())*(price));
            }
            if(AlooG.isSelected()&&!(AlooGobiQty.getText().trim().isEmpty())){
                AlooGobiMSum=0;
            query="select * from food where food_id=12";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            AlooGobiMSum=(Integer.parseInt(AlooGobiQty.getText().trim())*(price));
            }
            if(CashewT.isSelected()&&!(CashewTomatoQty.getText().trim().isEmpty())){
                CashewTSum=0;
            query="select * from food where food_id=15";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            CashewTSum=(Integer.parseInt(CashewTomatoQty.getText().trim())*(price));
            }
            if(ButterC.isSelected()&&!(ButterChickenQty.getText().trim().isEmpty())){
                ButterCSum=0;
            query="select * from food where food_id=16";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            ButterCSum=(Integer.parseInt(ButterChickenQty.getText().trim())*(price));
            }
            if(PrawnK.isSelected()&&!(PrawnKurmaQty.getText().trim().isEmpty())){
                PrawnKSum=0;
            query="select * from food where food_id=17";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            PrawnKSum=(Integer.parseInt(PrawnKurmaQty.getText().trim())*(price));
            }
            if(MuttonC.isSelected()){
             MuttonCSum=0;
            query="select * from food where food_id=18";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            MuttonCSum=(Integer.parseInt(MuttonCurryQty.getText().trim())*(price));
            }
            if(ZeeraR.isSelected()&&!(ZeeraRiceQty.getText().trim().isEmpty())){
            ZeeraRSum=0;
            query="select * from food where food_id=19";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            ZeeraRSum=(Integer.parseInt(ZeeraRiceQty.getText().trim())*(price));
            }
            if(VegDumB.isSelected()&&!(VegDumBiryaniQty.getText().trim().isEmpty())){
                VegDumBSum=0;
            query="select * from food where food_id=20";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            VegDumBSum=(Integer.parseInt(VegDumBiryaniQty.getText().trim())*(price));
            }
            if(VegFriedR.isSelected()&&!(VegFriedRiceQty.getText().trim().isEmpty())){
                VegFriedRSum=0;
            query="select * from food where food_id=21";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
           VegFriedRSum=(Integer.parseInt(VegFriedRiceQty.getText().trim())*(price));
            }
            if(EggFriedR.isSelected()&&!(EggFriedRiceQty.getText().trim().isEmpty())){
                EggFriedRSum=0;
            query="select * from food where food_id=22";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            EggFriedRSum=(Integer.parseInt(EggFriedRiceQty.getText().trim())*(price));
            }
            if(ChickenFriedR.isSelected()&&!(ChickenFriedRiceQty.getText().trim().isEmpty())){
                ChickenFriedRSum=0;
            query="select * from food where food_id=23";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            ChickenFriedRSum=(Integer.parseInt(ChickenFriedRiceQty.getText().trim())*(price));
            }
            if(ChickenDumB.isSelected()&&!(ChickenDumBiryaniQty.getText().trim().isEmpty())){
                ChickenDumBSum=0;
            query="select * from food where food_id=24";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            ChickenDumBSum=(Integer.parseInt(ChickenDumBiryaniQty.getText().trim())*(price));
            }
            if(MuttonB.isSelected()&&!(MuttonBiryaniQty.getText().trim().isEmpty())){
                MuttonBSum=0;
            query="select * from food where food_id=25";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            MuttonBSum=(Integer.parseInt(MuttonBiryaniQty.getText().trim())*(price));
            }
            if(PlainR.isSelected()&&!(PlainRiceQty.getText().trim().isEmpty())){
                PlainRSum=0;
            query="select * from food where food_id=26";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            PlainRSum=(Integer.parseInt(PlainRiceQty.getText().trim())*(price));
            }
            if(ButterN.isSelected()&&!(ButterNaanQty.getText().trim().isEmpty())){
            ButterNSum=0;
            query="select * from food where food_id=27";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            ButterNSum=(Integer.parseInt(ButterNaanQty.getText().trim())*(price));
            }
            if(ButterR.isSelected()&&!(ButterRotiQty.getText().trim().isEmpty())){
                ButterRSum=0;
            query="select * from food where food_id=28";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            ButterRSum=(Integer.parseInt(ButterRotiQty.getText().trim())*(price));
            }
            if(GarlicN.isSelected()&&!(GarlicNaanQty.getText().trim().isEmpty())){
            GarlicNSum=0;    
            query="select * from food where food_id=29";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            GarlicNSum=(Integer.parseInt(GarlicNaanQty.getText().trim())*(price));
            }
            if(KulchaK.isSelected()&&!(KulchaQty.getText().trim().isEmpty())){
            KulchaKSum=0;    
            query="select * from food where food_id=30";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            KulchaKSum=(Integer.parseInt(KulchaQty.getText().trim())*(price));
            }
            if(AlooP.isSelected()&&!(AlooParathaQty.getText().trim().isEmpty())){
            AlooPSum=0;
            query="select * from food where food_id=31";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            AlooPSum=(Integer.parseInt(AlooParathaQty.getText().trim())*(price));
            }
            if(PulkaP.isSelected()&&!(PulkaQty.getText().trim().isEmpty())){
            PulkaPSum=0;   
            query="select * from food where food_id=32";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            PulkaPSum=(Integer.parseInt(PulkaQty.getText().trim())*(price));
            }
            if(ChocolateIC.isSelected()&&!(ChocolateIceCreamQty.getText().trim().isEmpty())){
            ChocolateICSum=0;
            query="select * from food where food_id=40";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
   
            ChocolateICSum=(Integer.parseInt(ChocolateIceCreamQty.getText().trim())*(price));
            }
            if(VanillaIC.isSelected()&&!(VanillaIceCreamQty.getText().trim().isEmpty())){
            VanillaICSum=0;
            query="select * from food where food_id=41";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            VanillaICSum=(Integer.parseInt(VanillaIceCreamQty.getText().trim())*(price));
            }
            if(ChocolateM.isSelected()&&!(ChocolateMousseQty.getText().trim().isEmpty())){
            ChocolateMSum=0;    
            query="select * from food where food_id=47";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            ChocolateMSum=(Integer.parseInt(ChocolateMousseQty.getText().trim())*(price));
            }
            if(BrownieB.isSelected()&&!(BrownieQty.getText().trim().isEmpty())){
            BrownieBSum=0;  
            query="select * from food where food_id=43";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            BrownieBSum=(Integer.parseInt(BrownieQty.getText().trim())*(price));
            }
            if(TiramisuT.isSelected()&&!(TiramisuQty.getText().trim().isEmpty())){
            TiramisuTSum=0;    
            query="select * from food where food_id=44";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            TiramisuTSum=(Integer.parseInt(TiramisuQty.getText().trim())*(price));
            }
            if(RasmalaiR.isSelected()&&!(RasmalaiQty.getText().trim().isEmpty())){
            RasmalaiRSum=0;
            query="select * from food where food_id=45";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            RasmalaiRSum=(Integer.parseInt(RasmalaiQty.getText().trim())*(price));
            }
            if(NutellaS.isSelected()&&!(NutellaSandwichQty.getText().trim().isEmpty())){
            NutellaSSum=0;    
            query="select * from food where food_id=46";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
        
            price=rs.getInt(4);
           
          
            NutellaSSum=(Integer.parseInt(NutellaSandwichQty.getText().trim())*(price));
            }
            
            s=ZeeraRSum+ButterNSum+ChocolateICSum+ManchurianSum+MurgMalaiTSum+FishAndCSum+CashewPSum+ChanaMSum+CashewTSum+AlooGobiMSum+ButterCSum+PrawnKSum+MuttonCSum+VegDumBSum+VegFriedRSum+EggFriedRSum+ChickenFriedRSum+ChickenDumBSum+MuttonBSum+PlainRSum+FrenchFsum+Paneer65PSum+VegMSum+DahiBSum+ButterRSum+GarlicNSum+KulchaKSum+AlooPSum+PulkaPSum+VanillaICSum+ChocolateMSum+BrownieBSum+TiramisuTSum+RasmalaiRSum+NutellaSSum;
            
           if(s==0)
           {
               JFXDialogLayout dg=new JFXDialogLayout();
        dg.setHeading(new Text("WARNING"));
        dg.setBody(new Text("Food is not selected or quantity not given !"));
        JFXButton ok=new JFXButton("OK");
        JFXDialog d=new JFXDialog(stackpane,dg, JFXDialog.DialogTransition.CENTER);
        ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               d.close();
            }
        });
        dg.setActions(ok);
        d.show();
            
           }
           else{
              int sum=s;
            JFXDialogLayout dl=new JFXDialogLayout();
        dl.setHeading(new Text("TOTAL"));
        dl.setBody(new Text("Your total is coming out to be Rs."+s));
        JFXButton proceed=new JFXButton("Proceed");
        JFXButton cancel=new JFXButton("Cancel");
        
        JFXDialog dialog=new JFXDialog(stackpane,dl, JFXDialog.DialogTransition.CENTER);
        proceed.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                 try{
                query = "select * from customer where login_status=1";
            preparedStmt=(PreparedStatement)connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
            PNum=rs.getString(4);
            
            query = " insert into orders (Pno,Date,Time,Amount)"+" values (?, ?, ?,?)";
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1,PNum);
            preparedStmt.setDate(2,sqlDate);
            preparedStmt.setTime(3,sqlTime);
            preparedStmt.setInt(4,sum);
            preparedStmt.execute();
            
            query = "select * from orders";
            preparedStmt = connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
            OrderNo=rs.getInt(1); 
                }
                catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
                
                
                
                if(FrenchF.isSelected()&&!(FrenchFriesQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,51);
                        preparedStmt.setInt(3,Integer.parseInt(FrenchFriesQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
             
             if(Paneer65P.isSelected()&&!(Paneer65Qty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,52);
                        preparedStmt.setInt(3,Integer.parseInt(Paneer65Qty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
             if(VegM.isSelected()&&!(VegMomosQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,53);
                        preparedStmt.setInt(3,Integer.parseInt(VegMomosQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
             if(DahiB.isSelected()&&!(DahiBhallaQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,54);
                        preparedStmt.setInt(3,Integer.parseInt(DahiBhallaQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                if(ManchurianM.isSelected()&&!(ManchurianQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,5);
                        preparedStmt.setInt(3,Integer.parseInt(ManchurianQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                if(MurgMalaiT.isSelected()&&!(MurgMalaiTikkaQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,6);
                        preparedStmt.setInt(3,Integer.parseInt(MurgMalaiTikkaQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                if(FishC.isSelected()&&!(FishAndChipsQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,7);
                        preparedStmt.setInt(3,Integer.parseInt(FishAndChipsQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                if(CashewP.isSelected()&&!(CashewPaneerQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,14);
                        preparedStmt.setInt(3,Integer.parseInt(CashewPaneerQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                if(ChanaM.isSelected()&&!(ChanaMasalaQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,13);
                        preparedStmt.setInt(3,Integer.parseInt(ChanaMasalaQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                if(AlooG.isSelected()&&!(AlooGobiQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,12);
                        preparedStmt.setInt(3,Integer.parseInt(AlooGobiQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                if(CashewT.isSelected()&&!(CashewTomatoQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,15);
                        preparedStmt.setInt(3,Integer.parseInt(CashewTomatoQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                if(ButterC.isSelected()&&!(ButterChickenQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,16);
                        preparedStmt.setInt(3,Integer.parseInt(ButterChickenQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                if(PrawnK.isSelected()&&!(PrawnKurmaQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,17);
                        preparedStmt.setInt(3,Integer.parseInt(PrawnKurmaQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                if(MuttonC.isSelected()&&!(MuttonCurryQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,18);
                        preparedStmt.setInt(3,Integer.parseInt(MuttonCurryQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                if(ZeeraR.isSelected()&&!(ZeeraRiceQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,19);
                        preparedStmt.setInt(3,Integer.parseInt(ZeeraRiceQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                if(VegDumB.isSelected()&&!(VegDumBiryaniQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,20);
                        preparedStmt.setInt(3,Integer.parseInt(VegDumBiryaniQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                if(VegFriedR.isSelected()&&!(VegFriedRiceQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,21);
                        preparedStmt.setInt(3,Integer.parseInt(VegFriedRiceQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                if(EggFriedR.isSelected()&&!(EggFriedRiceQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,22);
                        preparedStmt.setInt(3,Integer.parseInt(EggFriedRiceQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                if(ChickenFriedR.isSelected()&&!(ChickenFriedRiceQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,23);
                        preparedStmt.setInt(3,Integer.parseInt(ChickenFriedRiceQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                if(ChickenDumB.isSelected()&&!(ChickenDumBiryaniQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,24);
                        preparedStmt.setInt(3,Integer.parseInt(ChickenDumBiryaniQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                if(MuttonB.isSelected()&&!(MuttonBiryaniQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,25);
                        preparedStmt.setInt(3,Integer.parseInt(MuttonBiryaniQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
               if(PlainR.isSelected()&&!(PlainRiceQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,26);
                        preparedStmt.setInt(3,Integer.parseInt(PlainRiceQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
               if(ButterN.isSelected()&&!(ButterNaanQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,27);
                        preparedStmt.setInt(3,Integer.parseInt(ButterNaanQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
               if(ButterR.isSelected()&&!(ButterRotiQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,28);
                        preparedStmt.setInt(3,Integer.parseInt(ButterRotiQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
               if(GarlicN.isSelected()&&!(GarlicNaanQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,29);
                        preparedStmt.setInt(3,Integer.parseInt(GarlicNaanQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
               if(KulchaK.isSelected()&&!(KulchaQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,30);
                        preparedStmt.setInt(3,Integer.parseInt(KulchaQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
               if(AlooP.isSelected()&&!(AlooParathaQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,31);
                        preparedStmt.setInt(3,Integer.parseInt(AlooParathaQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
               if(PulkaP.isSelected()&&!(PulkaQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,32);
                        preparedStmt.setInt(3,Integer.parseInt(PulkaQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
               if(ChocolateIC.isSelected()&&!(ChocolateIceCreamQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,40);
                        preparedStmt.setInt(3,Integer.parseInt(ChocolateIceCreamQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
               if(VanillaIC.isSelected()&&!(VanillaIceCreamQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,41);
                        preparedStmt.setInt(3,Integer.parseInt(VanillaIceCreamQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
               if(ChocolateM.isSelected()&&!(ChocolateMousseQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,47);
                        preparedStmt.setInt(3,Integer.parseInt(ChocolateMousseQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
               if(BrownieB.isSelected()&&!(BrownieQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,43);
                        preparedStmt.setInt(3,Integer.parseInt(BrownieQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
               if(TiramisuT.isSelected()&&!(TiramisuQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,44);
                        preparedStmt.setInt(3,Integer.parseInt(TiramisuQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
               if(RasmalaiR.isSelected()&&!(RasmalaiQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,45);
                        preparedStmt.setInt(3,Integer.parseInt(RasmalaiQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
               if(NutellaS.isSelected()&&!(NutellaSandwichQty.getText().trim().isEmpty())){
                    try {
                        query = " insert into order_details (Order_no,f_id,Quantity)"+" values (?, ?, ?)";
                        preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setInt(1,OrderNo);
                        preparedStmt.setInt(2,46);
                        preparedStmt.setInt(3,Integer.parseInt(NutellaSandwichQty.getText().trim()));
                        preparedStmt.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                Stage deliveryScreen=new Stage();
                        Parent root=null;
                        
                        try {
                            root=FXMLLoader.load(getClass().getResource("DeliveryScreen.fxml"));
                        } catch (IOException ex) {
                            Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        Stage current;
                        current = (Stage)FrenchFriesQty.getScene().getWindow();
                        Scene scene=new Scene(root,1366,730);
                        
                        deliveryScreen.setScene(scene);
                       deliveryScreen.initStyle(StageStyle.TRANSPARENT);
                        Screen screen = Screen.getPrimary();
                        deliveryScreen.setFullScreen(true);
Rectangle2D bounds = screen.getVisualBounds();

deliveryScreen.setX(bounds.getMinX());
deliveryScreen.setY(bounds.getMinY());
deliveryScreen.setWidth(bounds.getWidth());
deliveryScreen.setHeight(bounds.getHeight());
                        current.hide();
                        
                        deliveryScreen.show();
                
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
            
        
        catch(Exception e)
        {
            System.out.println("fail"+e);
            System.out.println("Got an exception!");
      System.err.println(e.getMessage());
        }
   } 
    
   
    @FXML
    private void ExitBtn(MouseEvent event) {
         
       JFXDialogLayout dl=new JFXDialogLayout();
        dl.setHeading(new Text("Close"));
        dl.setBody(new Text("Do you want to exit ?"));
        JFXButton ok=new JFXButton("OK");
        JFXButton cancel=new JFXButton("Cancel");
        
        JFXDialog dialog=new JFXDialog(stackpane,dl, JFXDialog.DialogTransition.CENTER);
        ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                   try{
            query = "select * from customer where login_status=1";
            preparedStmt=(PreparedStatement)connection.prepareStatement(query);
            rs=preparedStmt.executeQuery();
            rs.last();
            PNum=rs.getString(4);
            query = "update customer set Login_status='0' where phone_number='"+PNum+"'";
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
        cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               dialog.close();
            }
        });
        dl.setActions(ok,cancel);
        dialog.show();
    }

    @FXML
    private void PrevOrderBtn(MouseEvent event) {
        Stage prevOrderScreen=new Stage();
                        Parent root=null;
                        
                        try {
                            root=FXMLLoader.load(getClass().getResource("PrevOrderScreen.fxml"));
                        } catch (IOException ex) {
                            Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        Stage current;
                        current = (Stage)FrenchFriesQty.getScene().getWindow();
                        Scene scene=new Scene(root,1366,730);
                        
                        prevOrderScreen.setScene(scene);
                        prevOrderScreen.initStyle(StageStyle.TRANSPARENT);
                         Screen screen = Screen.getPrimary();
                        prevOrderScreen.setFullScreen(true);
Rectangle2D bounds = screen.getVisualBounds();

prevOrderScreen.setX(bounds.getMinX());
prevOrderScreen.setY(bounds.getMinY());
prevOrderScreen.setWidth(bounds.getWidth());
prevOrderScreen.setHeight(bounds.getHeight());
           prevOrderScreen.initStyle(StageStyle.TRANSPARENT);
                        current.hide();
                        
                        prevOrderScreen.show();
        
    }

    
   }
   

    
   
    

