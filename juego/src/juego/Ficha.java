/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author Daniel
 */
public class Ficha {
    int color;
    
    public Ficha(int color){
        this.color=color;
    }
    
    public void limpiar(){
        this.color=0;
    }
    
    public Integer getColor(){
        return this.color;
    }
    
    
}
