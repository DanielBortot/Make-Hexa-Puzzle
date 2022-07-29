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
public abstract class Generador {
    HashMap<Integer,Ficha> pieza=new HashMap<>();
    HashMap<Integer,Integer> molde=new HashMap<>();
    Moldes moldes;
    public Generador(){
    }
    
    public abstract HashMap crearF();
}
