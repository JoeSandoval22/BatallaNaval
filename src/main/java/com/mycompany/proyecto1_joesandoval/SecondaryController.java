package com.mycompany.proyecto1_joesandoval;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML 
    private void switchToMainMenu() throws IOException{
        App.setRoot("primary");
    }
    
    @FXML
    private void changeToPlay() throws IOException{
        App.setRoot("GameBoard");
    }
}