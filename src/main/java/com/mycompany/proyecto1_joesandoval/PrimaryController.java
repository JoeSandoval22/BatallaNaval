package com.mycompany.proyecto1_joesandoval;

import java.io.File;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PrimaryController {
    private Scene creditsScene;
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void aboutTheDeveloper(){
        Stage creditsStage = new Stage();
        creditsStage.setTitle("About the Developer");
        
        Label infoLabel = new Label("System developed by Joe Sandoval Diaz\n\n"+"During the first period of 2025\n\n"+"In the Programming II course  of UNA\n  \n");
        infoLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: georgia; -fx-text-fill: white; -fx-padding: 20px;");
        
        File waterFile = new File("C:/Users/BIBLIOTECA - CC/Documents/Programación II/Agua cristalina.jpg");
        Image background = new Image(waterFile.toURI().toString());
        ImageView backgroundView = new ImageView(background);
        backgroundView.setFitWidth(550);
        backgroundView.setFitHeight(500);
        
        StackPane root = new StackPane();
        root.getChildren().add(backgroundView);
        root.getChildren().add(infoLabel);
        creditsScene = new Scene(root,550,500);
        creditsStage.setScene(creditsScene);
        creditsStage.show();
    }
}
