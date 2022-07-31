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
public class Comprobante {
    
    public Comprobante(){}
    
    public Boolean comprobar(Casilla cas,int pos,HashMap<Integer,Ficha> lisPieza){
        Boolean b=true;
        
        if (cas!=null){
            if (pos==1 ){
                b=this.comprobar(cas.vecinos.get("der"),pos++,lisPieza);
            }
            else if (pos==2 || pos==5){
                b=this.comprobar(cas.vecinos.get("vert"),pos++,lisPieza);
            }
            else if (pos==3 || pos==4){
                b=this.comprobar(cas.vecinos.get("izq"),pos++,lisPieza);
            }
        }
        if (cas==null || (cas.getColor()!=0 && lisPieza.get(pos).getColor()!=0)){
            b=false;
        }
        return b;
    }
}
