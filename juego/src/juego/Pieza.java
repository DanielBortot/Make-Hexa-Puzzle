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
public class Pieza {
    Almacen almacen;
    RotarF rotacion=new RotarF();
    HashMap<Integer,Ficha> pieza=new HashMap<>();
    int numPieza;
    
    public Pieza(Almacen almacen){
        this.almacen=almacen;
    }
    
    public void setPieza(int pos){
        this.pieza=this.almacen.getPieza(pos);
        this.numPieza=pos;
    }
    
    public HashMap<Integer,Ficha> getPieza(){
        return this.pieza;
    }
    
    public void rotar(int pos){
        this.rotacion.rotar(this.pieza);
    }
    
    public void eliminarPieza(){
        this.pieza.clear();
        this.almacen.eliminarPieza(numPieza);
        this.numPieza=0;
    }
}
