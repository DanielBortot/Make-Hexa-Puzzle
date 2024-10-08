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
public class ComodinPieza<T extends Pieza> implements Comodin<T>{
    Puntaje puntaje;
    int costo;
    public ComodinPieza(Puntaje puntaje, int costo){
        this.puntaje=puntaje;
        this.costo=costo;
    }
    
    @Override
    public void eliminar(Pieza pieza){
        if (this.puntaje.getPuntaje()>costo){
            this.puntaje.Restar(costo);
            pieza.eliminarPieza();
            this.costo*=2;
        }
    }
    
    public Integer getCosto(){
        return this.costo;
    }
}
