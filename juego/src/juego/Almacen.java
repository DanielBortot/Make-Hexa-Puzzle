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
    HashMap<Integer, HashMap> almacen=new HashMap<>();
    
    public Almacen(){
        
    }
    
    public HashMap crear(){
        HashMap<Integer, Ficha> cas=new HashMap<>();
        for (var i=1;i<=6;i++){
            cas.put(i,new Ficha(1));
        }
        return cas;
    }
    
    public void almacenar(){
        this.almacen.put(1, crear());
    }
    
    public HashMap getPieza(int pos){
        return this.almacen.get(pos);
    }
    
}
