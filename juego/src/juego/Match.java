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
public class Match {
    Pieza pieza;
    Borrador borrador;
    Casilla casPrim;
    Comprobante comp=new Comprobante();
    HashMap<Integer,Ficha> lisPieza=new HashMap<>();
    
    public Match(Casilla casPrim, Pieza pieza){
        this.casPrim=casPrim;
        this.borrador=new Borrador();
        this.pieza=pieza;
    }
    
    public void ensamblar(Casilla cas,int pos){
        if (pos==1){
            this.ensamblar(cas.getVecino("der"),pos+1);
        }
        else if (pos==2 || pos==5){
            this.ensamblar(cas.getVecino("vert"),pos+1);
        }
        else if (pos==3 || pos==4){
            this.ensamblar(cas.getVecino("izq"),pos+1);
        }
        if (cas.getColor()==0){
            cas.setFicha(this.lisPieza.get(pos));
        }
    }
    
    public void probar(Casilla cas,int pos){
        this.lisPieza=this.pieza.getPieza();
        
        if (this.comp.comprobar(cas,1,lisPieza)){
            this.ensamblar(cas,1);
            
            ArrayList<Casilla> lista=new ArrayList<>();
            this.borrador.buscar(this.casPrim,lista);
            lista.clear();
        }
        else{
            System.out.println("No hay espacio");
        }
    }
}
