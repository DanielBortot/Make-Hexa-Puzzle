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
    
    public GeneradorTri(){
    }
    
    public int getColor(){
        Random rand=new Random();
        return rand.nextInt(4)+1;
    }
    
    @Override
    public HashMap<Integer,Ficha> crearF(){
        this.molde=moldes.getMolde();
        int color=this.getColor();
        
        for (int i=1;i<=6;i++){
            if (this.molde.get(i)==1){
                this.pieza.put(i, new Ficha(color));
            }
            else{
                this.pieza.put(i, new Ficha(0));
            }
        }
        return this.pieza;
    }
}
