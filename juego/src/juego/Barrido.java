/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author Daniel
 */
public class Barrido {
    public Barrido(){}
    
    public Boolean comprobar(Casilla cas, int pos,int color){
        Boolean b=true;
        
        if (cas!=null){
           
            if (pos==1 ){
                b=this.comprobar(cas.vecinos.get("der"),pos+1,color);
            }
            else if (pos==2 || pos==5){
                b=this.comprobar(cas.vecinos.get("vert"),pos+1,color);
            }
            else if (pos==3 || pos==4){
                b=this.comprobar(cas.vecinos.get("izq"),pos+1,color);
            }
        }
        if (cas==null || color!=cas.getColor() || cas.getColor()==0){
            b=false;
        }
        return b;
    }
}
