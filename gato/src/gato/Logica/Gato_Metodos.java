/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gato.Logica;

import gato.IU.Frm_NuevoJuego;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Cristiam
 */
public class Gato_Metodos {

    Statement s;
    public final int JUGADOR1 = 1;
    public final int JUGADOR2 = 2;
    public boolean TurnoJ1, TurnoJ2,Termino = false;
    public Jugadores jugador1, jugador2;
    public int[] tablero = new int[10];

    public int verificar() {
        if (tablero[1] == tablero[2] && tablero[1] == tablero[3] && tablero[1] != 0) {
            return tablero[1];
        } else if (tablero[4] == tablero[5] && tablero[4] == tablero[6] && tablero[4] != 0) {
            return tablero[4];
        } else if (tablero[7] == tablero[8] && tablero[7] == tablero[9] && tablero[7] != 0) {
            return tablero[7];
        } else if (tablero[1] == tablero[4] && tablero[1] == tablero[7] && tablero[1] != 0) {
            return tablero[1];
        } else if (tablero[2] == tablero[5] && tablero[2] == tablero[8] && tablero[2] != 0) {
            return tablero[2];
        } else if (tablero[3] == tablero[6] && tablero[3] == tablero[9] && tablero[3] != 0) {
            return tablero[3];
        } else if (tablero[3] == tablero[5] && tablero[3] == tablero[7] && tablero[3] != 0) {
            return tablero[3];
        } else if (tablero[1] == tablero[5] && tablero[1] == tablero[9] && tablero[1] != 0) {
            return tablero[1];
        }
        return 0;
    }

    public String ganador() {
        String Ganador = "";
        if (verificar() != 0) {

            /*Asignamos resultados.*/
            if (verificar() == 1) {
                jugador1.gano();
                jugador2.perdio();
                Ganador = jugador1.Nombre;

            } else {
                jugador2.gano();
                jugador1.perdio();
                Ganador = jugador2.Nombre;
            }
        }
        return Ganador;
    }

    public void IniciarJuego(String Nombre1, String Nombre2, ImageIcon Im1, ImageIcon Im2) {
        this.jugador1 = new Jugadores(Nombre1, Im1);
        this.jugador2 = new Jugadores(Nombre2, Im2);

    }
    public boolean TableroLleno(){
   boolean resultado = true;
        for (int i = 1; i < tablero.length; i++) {
            if (tablero[i] == 0) {
                resultado = false;
            }
        }
         return resultado;
    }
    public void Ficha(JLabel ficha) {
        if (TurnoJ1){
                ficha.setIcon(jugador1.Imagen);
                TurnoJ1=false;
                  TurnoJ2=true;
        }else if (TurnoJ2){
             ficha.setIcon(jugador2.Imagen);
               TurnoJ1=true;
                 TurnoJ2=false;

        }
            
            }
   
    
}
