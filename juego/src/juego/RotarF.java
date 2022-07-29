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
public class RotarF {
    
    public RotarF(){
    }
    
    public void rotar(HashMap<Integer,Ficha> pieza){
        Ficha x=null,y=null;
        x=pieza.get(1);
        for (int i=1;i<=6;i++){
            if (i<6){
                y=pieza.get(i+1);
                pieza.put(i+1, x);
                x=y;
            }
            else{
                pieza.put(1,y);
            }
        }
    } 
}
