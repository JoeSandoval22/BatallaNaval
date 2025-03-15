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
    
    public Board(){
        this.sea = new char[10][15];
        int rows,columns;
        for(rows=0;rows<10;rows++){
            for(columns=0;columns<15;columns++){
                sea[rows][columns]='~';
            }
        }
    }
    
    public void showSea(){
        int rows,columns;
        for(rows=0;rows<10;rows++){
            for(columns=0;columns<15;columns++){
                System.out.println(sea[rows][columns]+" ");
            }
        }
    }
    
    public void addVessel(Vessel vessel,Coordinate coordinates,boolean isHorizontal){
        
    }
}
