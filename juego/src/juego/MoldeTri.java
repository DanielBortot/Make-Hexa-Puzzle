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
public class MoldeTri extends Moldes {
    
    @Override
    public HashMap getMolde(){
        HashMap<Integer,Integer> molde1=new HashMap<>();
        HashMap<Integer,Integer> molde2=new HashMap<>();
        HashMap<Integer,Integer> molde3=new HashMap<>();
        HashMap<Integer,Integer> molde4=new HashMap<>();
        HashMap<Integer,Integer> molde5=new HashMap<>();
        HashMap<Integer,Integer> molde6=new HashMap<>();
        HashMap<Integer,Integer> molde7=new HashMap<>();
        Random rand=new Random();
        int op=rand.nextInt(7)+1;
        int i=rand.nextInt(6)+1;
        
        if (op==1){
            int k=1;
            for (int aux=1;aux<=6;i++){
                if (k==1){
                    molde1.put(i,1);
                    i++;
                    k=0;
                }
                else{
                    molde1.put(i, 0);
                    i++;
                    k=1;
                }
                if (i>6){
                    i=1;
                }
            }
            return molde1;
        }
        
        else if (op==2){
            int k=3;
            for (int aux=1;aux<=6;i++){
                if (k>0){
                    molde2.put(i,1);
                    k--;
                }
                else{
                    molde2.put(i, 0);
                }
                i++;
                if (i>6){
                    i=1;
                }
            }
            return molde2;
        }
        
        else if (op==3){
            int k=2;
            for (int aux=1;aux<=6;i++){
                if (k>0){
                    molde3.put(i,1);
                    k--;
                }
                else{
                    molde3.put(i, 0);
                }
                i++;
                if (i>6){
                    i=1;
                }
            }
            return molde3;
        }
        
        else if (op==4){
            int k=4;
            for (int aux=1;aux<=6;i++){
                if (k>0){
                    molde4.put(i,1);
                    k--;
                }
                else{
                    molde4.put(i, 0);
                }
                i++;
                if (i>6){
                    i=1;
                }
            }
            return molde4;
        }
        
        else if (op==5){
            int k=1;
            for (int aux=1;aux<=6;i++){
                if (k>0){
                    molde5.put(i,1);
                    k--;
                }
                else{
                    molde5.put(i, 0);
                }
                i++;
                if (i>6){
                    i=1;
                }
            }
            return molde5;
        }
        
        else if (op==6){
            int k=5;
            for (int aux=1;aux<=6;i++){
                if (k>0){
                    molde6.put(i,1);
                    k--;
                }
                else{
                    molde6.put(i, 0);
                }
                i++;
                if (i>6){
                    i=1;
                }
            }
            return molde6;
        }
        
        else{
            int k=1;
            int p=3;
            for (int aux=1;aux<=6;i++){
                if (k>0 && p>0){
                    molde7.put(i,1);
                    k--;
                }
                else{
                    molde7.put(i, 0);
                    k++;
                }
                p--;
                i++;
                if (i>6){
                    i=1;
                }
            }
            return molde7;
        }
    }
}
