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
public class Casilla<T> {
    Ficha ficha;
    HashMap<String, T> vecinos = new HashMap<>();
    
    public Casilla(Ficha ficha){
        this.ficha=ficha;
    }
    
    public void insertar(T cas, String lado){
        vecinos.put(lado,cas);
    }
    
    public void limpiar(){
        this.ficha.cambColor(0);
    }
    
    public void ensamblar(T der, T izq, T vert){
        this.vecinos.put("der", der);
        this.vecinos.put("izq", izq);
        if (vert!=null){
            this.vecinos.put("vert", vert);
        }
    }
}
