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
public class Match {
    Casilla cas;
    Almacen piezas;
    
    public Match(Casilla cas, Almacen pieza){
        this.cas=cas;
        this.piezas=pieza;
    }
    
    public void comparar(int pos){
        HashMap pieza=this.piezas.getPieza(pos);
        cas.vecinos.get("der");
    }
}
