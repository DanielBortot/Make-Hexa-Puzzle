/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;
import java.util.HashMap;
/**
 *
 * @author Daniel
 */
public class Casilla {
    Ficha ficha;
    HashMap<String, Casilla> vecinos = new HashMap<>();
    
    public Casilla(Ficha ficha){
        this.ficha=ficha;
    }
    
    public void ensamblar(Casilla der, Casilla izq, Casilla vert){
        if (der!=null){this.vecinos.put("der", der);}
        if (izq!=null){this.vecinos.put("izq", izq);}
        if (vert!=null){this.vecinos.put("vert", vert);}
    }
    
    public void limpiar(){
        this.ficha.limpiar();
    }
    
    public Integer getColor(){
        return this.ficha.getColor();
    }
    
    public void setFicha(Ficha f){
        this.ficha=f;
    }
}
