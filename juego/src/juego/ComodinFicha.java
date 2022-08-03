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
    public ComodinFicha(){
    }
    
    @Override
    public void eliminar(Casilla cas){
        cas.limpiar();
    }
}
