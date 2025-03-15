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
public abstract class Vessel {
    protected String vesselName;
    protected int vesselSize;
    protected int vesselHealth;
    protected boolean isSunken=false;
    protected List<Coordinate>coordinateList;
    
    public Vessel(){
        
    }
    
    public abstract void isVesselSunken();
    public abstract void receiveShot(Coordinate coordinates);
}
