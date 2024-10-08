/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;
import java.util.HashMap;
import java.util.Random;
/**
 *
 * @author Daniel
 */
public class GeneradorTri extends Generador {
    
    public GeneradorTri(Moldes moldes){
        this.moldes=moldes;
    }
    
    public int getColor(){
        Random rand=new Random();
        return rand.nextInt(4)+1;
    }
    
    @Override
    public HashMap crearF(){
        this.molde.clear();
        this.pieza.clear();
        this.molde.putAll(this.moldes.getMolde());
        int color=this.getColor();
        for (int i=1;i<=6;i++){
            
            if (this.molde.get(i)==1){
                this.pieza.put(i, new Ficha(color));
            }
            else{
                this.pieza.put(i, new Ficha(0));
            }
        }
        
        System.out.println("");
        return this.pieza;
    }
}
