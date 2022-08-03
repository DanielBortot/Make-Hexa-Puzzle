/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;
import java.util.Random;
/**
 *
 * @author Daniel
 */
public class Puntaje {
    int puntaje;
    public Puntaje(){}
    
    public void contar(int numF, int cant){
        Random rand=new Random();
        if (cant>=1){
            this.puntaje+=numF+70*(rand.nextInt(cant+1)+1);
        }
        else{
            this.puntaje+=numF;
        }
        
    }
    
}
