package com.mycompany.week7_lab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    @Override
    public void start(Stage primaryStage)
    {

        Image img1 = new Image("domestic-dog_thumb_4x3.jpg");
        ImageView imgView1 = new ImageView(img1);
        
        Image img2 = new Image("67586673.jpg");
        ImageView imgView2 = new ImageView(img2);

        StackPane pane = new StackPane(imgView1);
        pane.setStyle("-fx-background-color: white");
        
         Scene scene = new Scene(pane, 500, 350);
         
        Image logo1 = new Image("https://i.natgeofe.com/n/4f5aaece-3300-41a4-b2a8-ed2708a0a27c/domestic-dog_thumb_4x3.jpg");
        Image logo2 = new Image("https://static.toiimg.com/photo/msid-67586673/67586673.jpg?3918697");
        imgView1.setViewport(new Rectangle2D(200, 80, 70, 60));
        imgView2.setViewport(new Rectangle2D(200, 80, 70, 60));

        primaryStage.setTitle("Image Display");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        


    }


    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
