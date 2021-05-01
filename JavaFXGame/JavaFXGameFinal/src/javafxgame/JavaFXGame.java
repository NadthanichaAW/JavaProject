/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author beaut
 */
public class JavaFXGame extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        String musicFile = "leave.mp3";     // For example

        Media sound = new Media(getClass().getResource(musicFile).toExternalForm());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);     
        mediaPlayer.setVolume(0.2);
        mediaPlayer.play();
        
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLGame.fxml"));
        stage.initStyle(StageStyle.TRANSPARENT); //no show Top bar
        Scene scene = new Scene(root);
        scene.setFill(javafx.scene.paint.Color.TRANSPARENT);
        stage.setScene(scene);
        stage.setTitle("Game");
        Image imageback = new Image("/JavaFXGAME/images/crownWin.png");
        stage.getIcons().add(imageback);
        stage.show();
    }
}
