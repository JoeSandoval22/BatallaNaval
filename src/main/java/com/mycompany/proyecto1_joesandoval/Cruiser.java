/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_joesandoval;

/**
 *
 * @author BIBLIOTECA - CC
 */
public class Cruiser extends Vessel {

    public Cruiser(){
        this.vesselName="Crucero";
        this.vesselHealth=3;
    }
    
    @Override
    public void isVesselSunken() {
        if(vesselHealth==0){
            isSunken=true;
            System.out.println("Embarcacion hundida");
        }
        else{
            isSunken=false;
        }
    }

    @Override
    public void receiveShot(Coordinate coordinates) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
