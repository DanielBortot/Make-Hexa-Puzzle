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
    Puntaje puntaje;
    public Borrador(){}
    
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
    
    public Integer buscar(Casilla cas,ArrayList<Casilla> lista){
        int cont=0;
        if (cas!=null){
            if (this.recorrer.comprobar(cas,1,cas.getColor())){
                this.Borrar(cas,1);
                cont++;
            }
            lista.add(cas);
            if (!lista.contains(cas.vecinos.get("der"))){
                cont+=this.buscar(cas.vecinos.get("der"),lista);
            }
            if (!lista.contains(cas.vecinos.get("izq"))){
                cont+=this.buscar(cas.vecinos.get("izq"),lista);
            }
            if (!lista.contains(cas.vecinos.get("vert"))){
                cont+=this.buscar(cas.vecinos.get("vert"),lista);
            }
        }
        return cont;
    }
}
