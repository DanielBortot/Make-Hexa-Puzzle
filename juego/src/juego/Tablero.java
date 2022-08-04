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
public class Tablero {
    ArrayList<Casilla> listaC=new ArrayList<>();
    int filas;
    
    public Tablero(ArrayList<Casilla> c,Integer filas){
        this.listaC.addAll(c);
        this.filas=filas;
    }
    
    public void imprimir2(Casilla c){
        if (c!=null){
            System.out.print(c.getColor()+" ");
            this.imprimir2(c.getVecino("der"));
        }
    }
    
    public void imprimir(){
        for (int i=0;i<this.filas;i++){
            if (i==0 || i==this.filas-1){
                System.out.print("                  ");
            }
            else if (i==1 || i==this.filas-2){
                System.out.print("                ");
            }
            else if (i==2 || i==this.filas-3){
                System.out.print("              ");
            }
            this.imprimir2(this.listaC.get(i));
            System.out.println("");
        }
        System.out.println("");
        
    }
    
}
