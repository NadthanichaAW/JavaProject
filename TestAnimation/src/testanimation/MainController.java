/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testanimation;

import animatefx.animation.Bounce;



import animatefx.animation.JackInTheBox;


import animatefx.animation.ZoomIn;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.effect.Bloom;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Color; 


import javafx.scene.shape.Circle;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;



/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class MainController implements Initializable {

    @FXML
    private Circle circle1;
    @FXML
    private Circle circle2;
    @FXML
    private Circle circle3;
    @FXML
    private Rectangle rectPath;
    @FXML
    private Circle circle4;

    JackInTheBox jack = new JackInTheBox();
    ZoomIn zoom = new ZoomIn();
    Path path = new Path();
    PathTransition pathTransition = new PathTransition();
    TranslateTransition tran = new TranslateTransition();
    TranslateTransition tran2 = new TranslateTransition();
    FadeTransition fade = new FadeTransition();
    
    @FXML
    private Text deeja;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       new Bounce(circle1).setCycleCount(4).setDelay(Duration.valueOf("500ms")).play();
       new Bounce(circle2).setCycleCount(4).setDelay(Duration.valueOf("1000ms")).play();
       new Bounce(circle3).setCycleCount(4).setDelay(Duration.valueOf("1100ms")).play();               
       new Bounce(circle4).setCycleCount(4).setDelay(Duration.valueOf("1200ms")).play();
      
       
            
       fade.setDuration(Duration.millis(4000));
       fade.setNode(deeja);
       fade.setFromValue(0);
       fade.setToValue(1);
       fade.play();

       
        //new FadeIn(deeja).setDelay(Duration.valueOf("100ms")).play();
       //pathTransition.setNode(deeja); 
      //zoom.setNode(deeja);
      //zoom.setDelay(Duration.valueOf("500"));
      //zoom.play();
       //pathTransition.setDelay(Duration.seconds(2));
       //pathTransition.setDuration(Duration.valueOf("80000ms"));
       //pathTransition.play();
       //tran2.setDuration(Duration.seconds(120));
       tran2.play();
        RotateTransition RC = new RotateTransition();
        Image image = new Image("/testanimation/backsidecard.jpg");
        
        
        Glow glow = new Glow();        
        glow.setLevel(10);
        
        Bloom bloom = new Bloom();
        bloom.setThreshold(0.9);
        
        deeja.setEffect(glow);
        //deeja.setEffect(bloom);
        rectPath.setEffect(glow);
        
             
        rectPath.setFill(new ImagePattern(image));
       
        RC.setNode(rectPath);
        RC.setAxis(Rotate.Y_AXIS);
        RC.setFromAngle(0);
        RC.setToAngle(60);
        RC.setInterpolator(Interpolator.LINEAR);       
        RC.setDuration(Duration.millis(2500));
        RC.setCycleCount(100);
        RC.setAutoReverse(true);
        RC.play();       
        //jack.setNode(rectPath);
        pathTransition.setNode(rectPath);
        pathTransition.setPath(path);
        //tran.setNode(rectPath);
        path.getElements().add(new MoveTo(50,50));
        path.getElements().add(new LineTo(50,-50));                 
        //pathTransition.setDelay(Duration.ONE);
        //jack.setDelay(Duration.ONE);
        pathTransition.setDuration(Duration.valueOf("800ms"));               
        //pathTransition.setOrientation(OrientationType.NONE);
        pathTransition.setCycleCount(100);
        pathTransition.setAutoReverse(true);
        //tran.setDelay(Duration.valueOf("1000ms"));
        //tran.setToX(100);
        //tran.setToY(-250);
        
        //jack.play();
        pathTransition.play();        
        //tran.play();
       /*
        jack.setNode(card2_2);
            TCplayer2_2PT.setNode(card2_2);
            TCplayer2_2PT.setPath(TCplayer2_2P);
            TCplayer2_2.setNode(card2_2);
            scaleTran.setNode(card2_2);
            TCplayer2_2P.getElements().add(new MoveTo(960, 223));
            TCplayer2_2P.getElements().add(new CubicCurveTo(960, -100, 360, -100, 77, 110));//(pointstart,pointstart,theekhong-x,theekhong-y,left-right[point2],up-down[point2])
            TCplayer2_2PT.setDelay(Duration.ONE);
            jack.setDelay(Duration.ONE);
            TCplayer2_2.setDelay(Duration.valueOf("3000ms"));
            scaleTran.setDelay(Duration.valueOf("3000ms"));
            scaleTran.setToX(0.6);
            scaleTran.setToY(0.6);
//            TCplayer2_2.setDuration(Duration.millis(2000));
            
            TCplayer2_2.setToY(-250);
            TCplayer2_2.setToX(150);
            jack.play();
            TCplayer2_2PT.play();
            TCplayer2_2.play();
            scaleTran.play();
       */
       /*
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to Logout!");
        alert.setContentText("Do you want to Logout?");
        alert.show();
      
        
       JLabel msgSkip = new JLabel( " was skipped!");
       msgSkip.setFont(new Font("Tahoma",Font.BOLD, 48));
       JOptionPane.showMessageDialog(null, msgSkip);
         */
     

        


    }    
    
}
