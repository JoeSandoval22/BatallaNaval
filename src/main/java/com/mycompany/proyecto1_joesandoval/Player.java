/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_joesandoval;

/**
 *
 * @author BIBLIOTECA - CC
 */
public abstract class Player {
    protected String playerName;
    protected Board playerOne;
    protected Board playerTwo;
    
    public Player(){
        playerOne = new Board();
        playerTwo = new Board();
    }
    
    public abstract void addVessel();
    public abstract void makeShot(Coordinate coordinates);
    
    public void receiveShot(){
        
    }
            
}
