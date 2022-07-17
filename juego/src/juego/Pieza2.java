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
public class Pieza2 extends Almacen{
    
    public Pieza2(){
       
    }
    
    @Override
    public HashMap crear(){
        Random random=new Random();
        int color=random.nextInt(3)+1;
        Integer molde[]=new Integer[5];
        molde[0]=color;
        molde[1]=color;
        molde[2]=color;
        molde[3]=color;
        molde[4]=0;
        molde[5]=0;
        HashMap<Integer, Ficha> cas=new HashMap<>();
        for (var i=1;i<=6;i++){
            cas.put(i,new Ficha(molde[i-1]));
        }
        return cas;
    }
}
