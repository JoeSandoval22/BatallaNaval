package com.mycompany.proyecto1_joesandoval;

import java.io.File;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.layout.VBox;

public class PrimaryController {
    private Scene creditsScene;
    
    @FXML
    private ImageView mainImage;
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void aboutTheDeveloper(){
        Stage creditsStage = new Stage();
        creditsStage.setTitle("About the Developer");
        
        Label infoLabel = new Label("System developed by Joe Sandoval Diaz\n\n"+"During the first period of 2025\n\n"+"In the Programming II course  of UNA\n  \n");
        infoLabel.setStyle("-fx-font-size: 20px; -fx-font-family: 'Algerian'; -fx-text-fill: Black; -fx-padding: 20px;");
        
        File waterFile = new File("C:/Users/BIBLIOTECA - CC/Documents/Programación II/Fondo.jpg");
        Image background = new Image(waterFile.toURI().toString());
        ImageView backgroundView = new ImageView(background);
        backgroundView.setFitWidth(600);
        backgroundView.setFitHeight(400);
        
        StackPane root = new StackPane();
        root.getChildren().add(backgroundView);
        root.getChildren().add(infoLabel);
        creditsScene = new Scene(root,600,400);
        creditsStage.setScene(creditsScene);
        creditsStage.show();
    }
    
    @FXML
    public void exitGame(){
        Platform.exit();
    }
    
    
    public void initializeImage(){
        
    }
}
