/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;
import java.util.ArrayList;
/**
 *
 * @author Daniel
 */
public class Borrador {
    Barrido recorrer=new Barrido();
    
    public Borrador(){
    }
    
    public void Borrar(Casilla cas,int pos){
        if (cas!=null){
            cas.limpiar();
            if (pos==1 ){
                this.Borrar(cas.vecinos.get("der"),pos+1);
            }
            else if (pos==2 || pos==5){
                this.Borrar(cas.vecinos.get("vert"),pos+1);
            }
            else if (pos==3 || pos==4){
                this.Borrar(cas.vecinos.get("izq"),pos+1);
            }
        }
    }
    
    public void buscar(Casilla cas,ArrayList<Casilla> lista){
        //if (cas==null){System.out.println(cas);}
        if (cas!=null){
            //System.out.println(cas.getColor());
            if (this.recorrer.comprobar(cas,1,cas.getColor())){
                
                this.Borrar(cas,1);
            }
            lista.add(cas);
            if (!lista.contains(cas.vecinos.get("der"))){
                this.buscar(cas.vecinos.get("der"),lista);
            }
            if (!lista.contains(cas.vecinos.get("izq"))){
                this.buscar(cas.vecinos.get("izq"),lista);
            }
            if (!lista.contains(cas.vecinos.get("vert"))){
                this.buscar(cas.vecinos.get("vert"),lista);
            }
        }
    }
}
