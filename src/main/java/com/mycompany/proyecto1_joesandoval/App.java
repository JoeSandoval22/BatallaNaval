package com.mycompany.proyecto1_joesandoval;

import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        File mainFile = new File("C:/Users/BIBLIOTECA - CC/Documents/Programación II/MainMarineford.jpg");
        Image mainBackground = new Image(mainFile.toURI().toString());
        ImageView mainBackgroundView = new ImageView(mainBackground);
        mainBackgroundView.setFitWidth(600);
        mainBackgroundView.setFitHeight(400);
        
        Parent rootParent = loadFXML("primary");
        StackPane rootPane = new StackPane();
        rootPane.getChildren().add(mainBackgroundView);
        rootPane.getChildren().add(rootParent);
        
        scene = new Scene(rootPane, 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
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