/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;
/**
 *
 * @author Daniel
 */
public class Puntaje {
    int puntaje;
    public Puntaje(){}
    
    public void contar(int numF, int cant){
        if (cant>=1){
            this.puntaje+=numF+70*cant;
        }
        else{
            this.puntaje+=numF;
        }
        
    }
    
    public Integer getPuntaje(){
        return this.puntaje;
    }
    
}
