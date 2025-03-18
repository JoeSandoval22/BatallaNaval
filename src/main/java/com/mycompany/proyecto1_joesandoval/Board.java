/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_joesandoval;

import java.util.List;

/**
 *
 * @author BIBLIOTECA - CC
 */
public class Board {
    private List<Vessel>vesselList;
    private char sea[][];
    private static final int ROWS = 10;
    private static final int COLUMNS = 15;
    
    public Board(){
        this.sea = new char[ROWS][COLUMNS];
        int rows,columns;
        for(rows=0;rows<ROWS;rows++){
            for(columns=0;columns<COLUMNS;columns++){
                sea[rows][columns]='~';
            }
        }
    }
    
    public void showSea(){
        Coordinate coordinates;
        int rows,columns;
        for(rows=0;rows<10;rows++){
            for(columns=0;columns<15;columns++){
                
            }
        }
    }
    
    public void addVessel(Vessel vessel,Coordinate coordinates,boolean isHorizontal){
        
    }
}
