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
    public ComodinPieza(){
    }
    
    @Override
    public void eliminar(Pieza pieza){
        pieza.eliminarPieza();
    }
}
