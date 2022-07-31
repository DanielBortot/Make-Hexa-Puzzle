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
public class Match {
    Pieza pieza;
    Borrador borrador;
    Casilla casPrim;
    Comprobante comp=new Comprobante();
    HashMap<Integer,Ficha> lisPieza=new HashMap<>();
    
    public Match(Borrador borrador, Casilla casPrim){
        this.borrador=borrador;
        this.casPrim=casPrim;
    }
    
    public void ensamblar(Casilla cas,int pos){
        if (pos==1){
            this.ensamblar(cas.vecinos.get("der"),pos++);
        }
        else if (pos==2 || pos==5){
            this.ensamblar(cas.vecinos.get("vert"),pos++);
        }
        else if (pos==3 || pos==4){
            this.ensamblar(cas.vecinos.get("izq"),pos++);
        }
        cas.setFicha(this.lisPieza.get(pos));
        
    }
    
    public void probar(Casilla cas,int pos){
        if (this.comp.comprobar(cas,1,lisPieza)){
            this.ensamblar(cas,1);
            this.borrador.buscar(this.casPrim);
        }
        else{
            System.out.println("No hay espacio");
        }
    }
    
    public void pedirPieza(){
        this.lisPieza=this.pieza.getPieza();
    }
}
