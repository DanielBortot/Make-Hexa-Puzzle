/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Daniel
 */
public class FinalJuego {
    Almacen almacen;
    Pieza pieza;
    Comprobante comp;
    HashMap<Integer,Ficha> lista=new HashMap<>();
    public FinalJuego(Almacen almacen){
        this.almacen=almacen;
        this.pieza=new Pieza(almacen);
        this.comp=new Comprobante();
    }
    
    public Boolean finalizar(Casilla cas){
        for (int i=1;i<=3;i++){
            this.pieza.setPieza(i);
            for (int j=1;j<=6;j++){
                if (comp.comprobar(cas, 1, this.pieza.getPieza())){
                    return false;
                }
                this.pieza.rotar();
            }
        }
        return true;
    }
    
    public Boolean buscar(Casilla cas,ArrayList<Casilla> lista){
        Boolean b=true;
        if (cas!=null){
            if (cas.getColor()==0){
                b=this.finalizar(cas);
                System.out.println(b);
            }
            if (b==false){
                return b;
            }
            lista.add(cas);
            if (!lista.contains(cas.vecinos.get("der"))){
                b=this.buscar(cas.vecinos.get("der"),lista);
            }
            if (!lista.contains(cas.vecinos.get("izq"))){
                b=this.buscar(cas.vecinos.get("izq"),lista);
            }
            if (!lista.contains(cas.vecinos.get("vert"))){
                b=this.buscar(cas.vecinos.get("vert"),lista);
            }
        }
        //System.out.println(b);
        return b;
    }
    
    
}
