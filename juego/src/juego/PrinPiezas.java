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
public class PrinPiezas {
    HashMap<Integer,Ficha> lista1=new HashMap<>();
    HashMap<Integer,Ficha> lista2=new HashMap<>();
    HashMap<Integer,Ficha> lista3=new HashMap<>();
    
    public PrinPiezas(){}
    
    public void imprimir(Pieza pieza1, Pieza pieza2, Pieza pieza3){
        this.lista1.putAll(pieza1.getPieza());
        this.lista2.putAll(pieza2.getPieza());
        this.lista3.putAll(pieza3.getPieza());
        System.out.println("      Pieza 1       Pieza 2        Pieza3");
        System.out.print("     "+lista1.get(1).getColor()+"   "+lista1.get(2).getColor()+"   "+lista1.get(3).getColor());
        System.out.print("     "+lista2.get(1).getColor()+"   "+lista2.get(2).getColor()+"   "+lista2.get(3).getColor());
        System.out.print("     "+lista3.get(1).getColor()+"   "+lista3.get(2).getColor()+"   "+lista3.get(3).getColor());
        System.out.println("");
        System.out.print("     "+lista1.get(4).getColor()+"   "+lista1.get(5).getColor()+"   "+lista1.get(6).getColor());
        System.out.print("     "+lista2.get(4).getColor()+"   "+lista2.get(5).getColor()+"   "+lista2.get(6).getColor());
        System.out.print("     "+lista3.get(4).getColor()+"   "+lista3.get(5).getColor()+"   "+lista3.get(6).getColor());
        
        System.out.println("");
        System.out.println("");
        this.lista1.clear();
        this.lista2.clear();
        this.lista3.clear();
    }
}
