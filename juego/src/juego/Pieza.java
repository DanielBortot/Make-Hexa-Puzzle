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
        this.pieza.clear();
        this.pieza.putAll(this.almacen.getPieza(pos));
        this.numPieza=pos;
    }
    
    public HashMap<Integer,Ficha> getPieza(){
        return this.pieza;
    }
    
    public void rotar(){
        this.rotacion.rotar(this.pieza);
    }
    
    public void eliminarPieza(){
        this.pieza.clear();
        this.almacen.eliminarPieza(numPieza);
        this.numPieza=0;
    }
    
    public Integer contFichas(){
        int cont=0;
        for (int i=1;i<=6;i++){
            if (this.pieza.get(i).getColor()!=0){
                cont++;
            }
        }
        return cont;
    }
}
