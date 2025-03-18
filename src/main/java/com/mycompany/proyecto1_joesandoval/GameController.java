/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_joesandoval;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

/**
 *
 * @author BIBLIOTECA - CC
 */
public class GameController {
    
    @FXML 
    GridPane seaPlayerOneCell = new GridPane();
    @FXML
    GridPane seaPlayerTwoCell = new GridPane();
    @FXML
    private void addCellsToSea(){
        for(int rows=0;rows<10;rows++){
            for(int columns=0;columns<10;columns++){
                Button seaButton = new Button();
                seaButton.setPrefSize(33, 10);
                seaButton.setStyle("-fx-background-color:#38b6ff;-fx-border-color:black");
                seaPlayerOneCell.add(seaButton, rows, columns);   
            }
        }
        
        for(int rows=0;rows<10;rows++){
            for(int columns=0;columns<10;columns++){
                Button seaButton = new Button();
                seaButton.setPrefSize(33, 10);
                seaButton.setStyle("-fx-background-color:#38b6ff;-fx-border-color:black");
                seaPlayerTwoCell.add(seaButton, rows, columns);
            }
        }
    }
    
    @FXML
    private void changeToPlay() throws IOException{
        App.setRoot("Secondary");
    }
}
