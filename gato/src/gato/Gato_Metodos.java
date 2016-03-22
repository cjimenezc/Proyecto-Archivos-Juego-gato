/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

import gato.Jugadores;
import gato.MDI_Gato;
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
    public boolean seleccionado = true;
    Jugadores jugador1, jugador2;
    int[] tablero = new int[9];

    public int verificar() {
        if (tablero[0] == tablero[1] && tablero[0] == tablero[2] && tablero[0] != 0) {
            return tablero[0];
        } else if (tablero[3] == tablero[4] && tablero[3] == tablero[5] && tablero[3] != 0) {
            return tablero[3];
        } else if (tablero[6] == tablero[7] && tablero[6] == tablero[8] && tablero[6] != 0) {
            return tablero[6];
        } /*Columnas*/ else if (tablero[0] == tablero[3] && tablero[0] == tablero[6] && tablero[0] != 0) {
            return tablero[0];
        } else if (tablero[1] == tablero[4] && tablero[1] == tablero[7] && tablero[1] != 0) {
            return tablero[1];
        } else if (tablero[2] == tablero[5] && tablero[2] == tablero[8] && tablero[2] != 0) {
            return tablero[2];
        } /*Diagonales*/ else if (tablero[0] == tablero[4] && tablero[0] == tablero[8] && tablero[0] != 0) {
            return tablero[0];
        } else if (tablero[2] == tablero[4] && tablero[2] == tablero[6] && tablero[2] != 0) {
            return tablero[2];
        }
        return 0;
    }

    public void ganador() {
        if (verificar() != 0) {

            /*Asignamos resultados.*/
            if (verificar() == 1) {
                jugador1.gano();
                jugador2.perdio();

            } else {
                jugador2.gano();
                jugador1.perdio();

            }
        }
    }

    public ImageIcon Obtener_Imagen() {
        ImageIcon ficha = null;
        if (seleccionado = true) {
            ImageIcon X = new ImageIcon(getClass().getResource("/Recursos/x gato.png"));
            ficha = X;
        }
        if (seleccionado = false) {
            ImageIcon O = new ImageIcon(getClass().getResource("/Recursos/x gato.png"));
            ficha = O;
        }
        return ficha;
    }

}
