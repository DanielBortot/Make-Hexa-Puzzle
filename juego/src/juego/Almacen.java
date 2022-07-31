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
public class Almacen {
    HashMap<Integer, HashMap<Integer,Ficha>> almacen=new HashMap<>();
    Generador pieza;
    
    public Almacen(Generador pieza){
        this.pieza=pieza;
    }
    
    public void almacenar(){
        for (int i=1;i<=3;i++){
            if (almacen.get(i)==null){
                almacen.put(i,pieza.crearF());
            }
        }
    }
    
    public HashMap<Integer,Ficha> getPieza(int pos){
        return this.almacen.get(pos);
    }
    
    public void eliminarPieza(int pos){
        this.almacen.remove(pos);
    }
    
}
