/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagementsystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 *
 * @author srees
 */
public class SplashScreenController implements Initializable {
    private Label label;
    @FXML
    private ImageView image;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       FadeTransition fadeT=new FadeTransition(Duration.millis(3000),image);
       fadeT.setFromValue(1.0);
       fadeT.setToValue(0);
       fadeT.setOnFinished(new EventHandler<ActionEvent> (){
           public void handle (ActionEvent event){
               Stage lScreen=new Stage();
                       Parent root=null;
                       try {
                   root=FXMLLoader.load(getClass().getResource("LS.fxml"));
               } catch (Exception e) {
               }
           Stage current=(Stage) image.getScene().getWindow();
           Scene scene=new Scene(root,700,600);
           lScreen.setScene(scene);
           lScreen.initStyle(StageStyle.TRANSPARENT);
          lScreen.setMaximized(false);
lScreen.setScene(scene);
Screen screen = Screen.getPrimary();
                        lScreen.setFullScreen(true);
Rectangle2D bounds = screen.getVisualBounds();

lScreen.setX(bounds.getMinX());
lScreen.setY(bounds.getMinY());
lScreen.setWidth(bounds.getWidth());
lScreen.setHeight(bounds.getHeight());
           current.hide();
           lScreen.show();
           }
                   
       });
       fadeT.play();
       
    }    
    
}