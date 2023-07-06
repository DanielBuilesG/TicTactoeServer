/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoeserver;

import org.springframework.stereotype.Component;

/**
 *
 * @author daniel.builes
 */

@Component
public class PlaysDB {
    
    private String jugada= "";
            
    public void PlaysDB(){};
    
    public void setJugada(String jugada){
        this.jugada=jugada;
    }
    
    public String getJugada(){
        String tmp = jugada;
        jugada = "";
        return tmp;
    }
    
}
