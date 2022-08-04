/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author Daniel
 */
public class Almacen {
    HashMap<Integer, HashMap> almacen=new HashMap<>();
    ArrayList<Generador> piezas=new ArrayList<>();
    
    public Almacen(Generador pieza1,Generador pieza2,Generador pieza3){
        this.piezas.add(pieza1);
        this.piezas.add(pieza2);
        this.piezas.add(pieza3);
    }
    
    public void almacenar(){
        for (int i=1;i<=3;i++){
            if (!this.almacen.containsKey(i)){
                this.almacen.put(i,this.piezas.get(i-1).crearF());
            }
        }
        
        System.out.println("");
    }
    
    public HashMap<Integer,Ficha> getPieza(int pos){
        return this.almacen.get(pos);
    }
    
    public void eliminarPieza(int pos){
        this.almacen.remove(pos);
        this.almacenar();
    }
    
}
