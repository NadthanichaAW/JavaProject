/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamepj;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Lenovo
 */
public class GamePj extends Application {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        launch(args); 
        // TODO code application logic here
    }

    @Override
    public void start(Stage stage) throws Exception {
     Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
     Scene scene = new Scene(root);
     stage.setScene(scene);
     stage.show(); 
    
    }
    
}
