/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author Daniel
 * @param <T>
 */
public class ComodinFicha<T extends Casilla> implements Comodin<T>{
    Puntaje puntaje;
    int costo;
    public ComodinFicha(Puntaje puntaje, int costo){
        this.puntaje=puntaje;
        this.costo=costo;
    }

    
    @Override
    public void eliminar(Casilla cas){
        if (this.puntaje.getPuntaje()>costo && cas.getColor()!=0){
            cas.limpiar();
            this.costo*=2;
        }
    }
    
    public Integer getCosto(){
        return this.costo;
    }
}
