/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Casilla cas1=new Casilla(new Ficha(0));
        Casilla cas2=new Casilla(new Ficha(0));
        Casilla cas3=new Casilla(new Ficha(0));
        Casilla cas4=new Casilla(new Ficha(0));
        Casilla cas5=new Casilla(new Ficha(0));
        Casilla cas6=new Casilla(new Ficha(0));
        Casilla cas7=new Casilla(new Ficha(0));
        Casilla cas8=new Casilla(new Ficha(0));
        Casilla cas9=new Casilla(new Ficha(0));
        Casilla cas10=new Casilla(new Ficha(0));
        Casilla cas11=new Casilla(new Ficha(0));
        Casilla cas12=new Casilla(new Ficha(0));
        Casilla cas13=new Casilla(new Ficha(0));
        Casilla cas14=new Casilla(new Ficha(0));
        Casilla cas15=new Casilla(new Ficha(0));
        Casilla cas16=new Casilla(new Ficha(0));
        Casilla cas17=new Casilla(new Ficha(0));
        Casilla cas18=new Casilla(new Ficha(0));
        Casilla cas19=new Casilla(new Ficha(0));
        Casilla cas20=new Casilla(new Ficha(0));
        Casilla cas21=new Casilla(new Ficha(0));
        Casilla cas22=new Casilla(new Ficha(0));
        Casilla cas23=new Casilla(new Ficha(0));
        Casilla cas24=new Casilla(new Ficha(0));
        Casilla cas25=new Casilla(new Ficha(0));
        Casilla cas26=new Casilla(new Ficha(0));
        Casilla cas27=new Casilla(new Ficha(0));
        Casilla cas28=new Casilla(new Ficha(0));
        Casilla cas29=new Casilla(new Ficha(0));
        Casilla cas30=new Casilla(new Ficha(0));
        Casilla cas31=new Casilla(new Ficha(0));
        Casilla cas32=new Casilla(new Ficha(0));
        Casilla cas33=new Casilla(new Ficha(0));
        Casilla cas34=new Casilla(new Ficha(0));
        Casilla cas35=new Casilla(new Ficha(0));
        Casilla cas36=new Casilla(new Ficha(0));
        Casilla cas37=new Casilla(new Ficha(0));
        Casilla cas38=new Casilla(new Ficha(0));
        Casilla cas39=new Casilla(new Ficha(0));
        Casilla cas40=new Casilla(new Ficha(0));
        Casilla cas41=new Casilla(new Ficha(0));
        Casilla cas42=new Casilla(new Ficha(0));
        Casilla cas43=new Casilla(new Ficha(0));
        Casilla cas44=new Casilla(new Ficha(0));
        Casilla cas45=new Casilla(new Ficha(0));
        Casilla cas46=new Casilla(new Ficha(0));
        Casilla cas47=new Casilla(new Ficha(0));
        Casilla cas48=new Casilla(new Ficha(0));
        Casilla cas49=new Casilla(new Ficha(0));
        Casilla cas50=new Casilla(new Ficha(0));
        Casilla cas51=new Casilla(new Ficha(0));
        Casilla cas52=new Casilla(new Ficha(0));
        Casilla cas53=new Casilla(new Ficha(0));
        Casilla cas54=new Casilla(new Ficha(0));
        
        cas1.ensamblar(cas2, null, cas9);
        cas2.ensamblar(cas3, cas1, null);
        cas3.ensamblar(cas4, cas2, cas11);
        cas4.ensamblar(cas5, cas3, null);
        cas5.ensamblar(cas6, cas4, cas13);
        cas6.ensamblar(cas7, cas5, null);
        cas7.ensamblar(null, cas6, cas15);
        
        cas8.ensamblar(cas9, null, cas18);
        cas9.ensamblar(cas10, cas8, cas1);
        cas10.ensamblar(cas11, cas9, cas20);
        cas11.ensamblar(cas12, cas10, cas3);
        cas12.ensamblar(cas13, cas11, cas22);
        cas13.ensamblar(cas14, cas12, cas5);
        cas14.ensamblar(cas15, cas13, cas24);
        cas15.ensamblar(cas16, cas14, cas7);
        cas16.ensamblar(null, cas15, cas26);
        
        cas17.ensamblar(cas18, null, cas28);
        cas18.ensamblar(cas19, cas17, cas8);
        cas19.ensamblar(cas20, cas18, cas30);
        cas20.ensamblar(cas21, cas19, cas10);
        cas21.ensamblar(cas22, cas20, cas32);
        cas22.ensamblar(cas23, cas21, cas12);
        cas23.ensamblar(cas24, cas22, cas34);
        cas24.ensamblar(cas25, cas23, cas14);
        cas25.ensamblar(cas26, cas24, cas36);
        cas26.ensamblar(cas27, cas25, cas16);
        cas27.ensamblar(null, cas26, cas38);
        
        cas28.ensamblar(cas29, null, cas17);
        cas29.ensamblar(cas30, cas28, cas39);
        cas30.ensamblar(cas31, cas29, cas19);
        cas31.ensamblar(cas32, cas30, cas41);
        cas32.ensamblar(cas33, cas31, cas21);
        cas33.ensamblar(cas34, cas32, cas43);
        cas34.ensamblar(cas35, cas33, cas23);
        cas35.ensamblar(cas36, cas34, cas45);
        cas36.ensamblar(cas37, cas35, cas25);
        cas37.ensamblar(cas38, cas36, cas47);
        cas38.ensamblar(null, cas37, cas27);
        
        cas39.ensamblar(cas40, null, cas29);
        cas40.ensamblar(cas41, cas39, cas48);
        cas41.ensamblar(cas42, cas40, cas31);
        cas42.ensamblar(cas43, cas41, cas50);
        cas43.ensamblar(cas44, cas42, cas33);
        cas44.ensamblar(cas45, cas43, cas52);
        cas45.ensamblar(cas46, cas44, cas35);
        cas46.ensamblar(cas47, cas45, cas54);
        cas47.ensamblar(null, cas46, cas37);
        
        cas48.ensamblar(cas49, null, cas40);
        cas49.ensamblar(cas50, cas48, null);
        cas50.ensamblar(cas51, cas49, cas42);
        cas51.ensamblar(cas52, cas50, null);
        cas52.ensamblar(cas53, cas51, cas44);
        cas53.ensamblar(cas54, cas52, null);
        cas54.ensamblar(null, cas53, cas46);
        
        HashMap<Integer,Casilla> listaCas=new HashMap<>();
        listaCas.put(1,cas1);
        listaCas.put(2,cas2);
        listaCas.put(3,cas3);
        listaCas.put(4,cas4);
        listaCas.put(5,cas5);
        listaCas.put(6,cas6);
        listaCas.put(7,cas7);
        listaCas.put(8,cas8);
        listaCas.put(9,cas9);
        listaCas.put(10,cas10);
        listaCas.put(11,cas11);
        listaCas.put(12,cas12);
        listaCas.put(13,cas13);
        listaCas.put(14,cas14);
        listaCas.put(15,cas15);
        listaCas.put(16,cas16);
        listaCas.put(17,cas17);
        listaCas.put(18,cas18);
        listaCas.put(19,cas19);
        listaCas.put(20,cas20);
        listaCas.put(21,cas21);
        listaCas.put(22,cas22);
        listaCas.put(23,cas23);
        listaCas.put(24,cas24);
        listaCas.put(25,cas25);
        listaCas.put(26,cas26);
        listaCas.put(27,cas27);
        listaCas.put(28,cas28);
        listaCas.put(29,cas29);
        listaCas.put(30,cas30);
        listaCas.put(31,cas31);
        listaCas.put(32,cas32);
        listaCas.put(33,cas33);
        listaCas.put(34,cas34);
        listaCas.put(35,cas35);
        listaCas.put(36,cas36);
        listaCas.put(37,cas37);
        listaCas.put(38,cas38);
        listaCas.put(39,cas39);
        listaCas.put(40,cas40);
        listaCas.put(41,cas41);
        listaCas.put(42,cas42);
        listaCas.put(43,cas43);
        listaCas.put(44,cas44);
        listaCas.put(45,cas45);
        listaCas.put(46,cas46);
        listaCas.put(47,cas47);
        listaCas.put(48,cas48);
        listaCas.put(49,cas49);
        listaCas.put(50,cas50);
        listaCas.put(51,cas51);
        listaCas.put(52,cas52);
        listaCas.put(53,cas53);
        listaCas.put(54,cas54);
        
        HashMap<Integer,Pieza> listaPieza=new HashMap<>();
        
        
        ArrayList<Casilla> listaC=new ArrayList<>();
        listaC.add(cas1);
        listaC.add(cas8);
        listaC.add(cas17);
        listaC.add(cas28);
        listaC.add(cas39);
        listaC.add(cas48);
        
        Tablero tablero=new Tablero(listaC,6);
        PrinPiezas prinPiezas=new PrinPiezas();
        
        Puntaje puntaje=new Puntaje();
        ComodinFicha martillo=new ComodinFicha(puntaje,5);
        ComodinPieza basura=new ComodinPieza(puntaje,2);
        Moldes molde=new MoldeTri();
        Generador genTri1=new GeneradorTri(molde);
        Generador genTri2=new GeneradorTri(molde);
        Generador genTri3=new GeneradorTri(molde);
     
        Almacen almacen=new Almacen(genTri1,genTri2,genTri3);
        
        FinalJuego fin=new FinalJuego(almacen);
        
        Pieza pieza1=new Pieza(almacen);
        Pieza pieza2=new Pieza(almacen);
        Pieza pieza3=new Pieza(almacen);
        listaPieza.put(1,pieza1);
        listaPieza.put(2,pieza2);
        listaPieza.put(3,pieza3);
        
        Match match=new Match(cas1,puntaje);
        ArrayList<Casilla> lisFin=new ArrayList<>();
        //Borrador borrador=new Borrador();
        almacen.almacenar();
        pieza1.setPieza(1);
        pieza2.setPieza(2);
        pieza3.setPieza(3);
        
      
        
        
        Scanner entrada=new Scanner(System.in);
        int piezaN,casillaN,op;
        do{
            System.out.println("Puntaje: "+puntaje.puntaje);
            System.out.println("");
            tablero.imprimir();
            prinPiezas.imprimir(pieza1, pieza2, pieza3);
            
            do{
                System.out.print("Ingrese el numero de la pieza: ");
                piezaN=entrada.nextInt();
            } while (piezaN<1 || piezaN>3);
            
            do{
                System.out.flush();
                System.out.println("Puntaje: "+puntaje.puntaje);
                System.out.println("");
                tablero.imprimir();
                prinPiezas.imprimir(pieza1, pieza2, pieza3);
                
                System.out.print("Desea rotar 1/0: ");
                op=entrada.nextInt();
                
                if (op==1){
                    listaPieza.get(piezaN).rotar();
                }
            }while(op==1);
            
            System.out.print("Ingrese la posicion de la casilla: ");
            casillaN=entrada.nextInt();
            if (casillaN>=1 && casillaN<=54){
                match.probar(listaCas.get(casillaN),1, listaPieza.get(piezaN));
            }
            
            System.out.println("Puntaje: "+puntaje.puntaje);
            System.out.println("");
            tablero.imprimir();
            prinPiezas.imprimir(pieza1, pieza2, pieza3);
            
            System.out.print("Desea usar comodin? 1/0: ");
            op=entrada.nextInt();
            if (op==1){
                System.out.print("1-Martillo ("+martillo.getCosto()+"pts) Basura ("+basura.getCosto()+"pts): ");
                op=entrada.nextInt();
                if (op==1){
                    System.out.print("Ingresa la casilla que quieres eliminar: ");
                    op=entrada.nextInt();
                    if (op>=1 && op<=54){martillo.eliminar(listaCas.get(op));}
                }
                else if (op==2){
                    System.out.print("Ingresa la pieza que quieres eliminar: ");
                    op=entrada.nextInt();
                    if (op>=1 && op<=3){basura.eliminar(listaPieza.get(op));}
                }
            }
            lisFin.clear();
                
        }while (!fin.buscar(cas1,lisFin,true));
        
        entrada.nextLine();
        tablero.imprimir();
        lisFin.clear();
        
        
    }
    
}
