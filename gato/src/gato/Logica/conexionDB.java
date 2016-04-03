
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gato.Logica;

import gato.IU.Frm_NuevoJuego;
import static java.awt.Event.DELETE;
import java.sql.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Cristiam
 */
public class conexionDB {

    Gato_Metodos Metodos = Frm_NuevoJuego.jugador;

    public static Connection Con;
    protected Connection cn;
    protected Statement st;
    protected ResultSet rs;

    public void conexionDB() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.Con = DriverManager.getConnection("jdbc:sqlserver://JIMENEZ;" + "database = Gato;" + "user = sa;" + "password = Cessna123");
            this.st = Con.createStatement();
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null, "ERROR SQL:" + e1.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Connection getcon() {
        return Con;
    }

    public void setCon(Connection cn) {
        this.Con = cn;
    }

    public Statement getst() {
        return st;
    }

    public void setst(Connection st) {
        this.Con = st;
    }

    public void InsertarJugador1() {
        try {
            st = Con.createStatement();
            st.executeUpdate("INSERT INTO dbo.Jugadores(Jugador,Ganes,Empates,Perdidas)" + "VALUES('" + Metodos.jugador1.Nombre + "','" + Metodos.jugador1.GANADOS + "','" + Metodos.jugador1.EMPATADOS + "','" + Metodos.jugador1.PERDIDOS + "')");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR CONEXION:" + e.getMessage());
        }

    }

    public void InsertarJugador2() {
        try {
            st = Con.createStatement();
            st.executeUpdate("INSERT INTO dbo.Jugadores(Jugador,Ganes,Empates,Perdidas)" + "VALUES('" + Metodos.jugador2.Nombre + "','" + Metodos.jugador2.GANADOS + "','" + Metodos.jugador2.EMPATADOS + "','" + Metodos.jugador2.PERDIDOS + "')");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR CONEXION:" + e.getMessage());
        }

    }
    public void ActualizarJugador1() {
        try {
            st = Con.createStatement();
            st.executeUpdate("UPDATE Jugadores SET Jugador= '" + Metodos.jugador1.Nombre + "',Ganes = Jugadores.Ganes +'"+  Metodos.jugador2.GANADOS + "',Empates = Jugadores.Empates +'"+  Metodos.jugador2.EMPATADOS + "',Perdidas = Jugadores.Perdidas +'"+  Metodos.jugador2.PERDIDOS + "' WHERE  Jugadores.Jugador = '" + Metodos.jugador1.Nombre + "'");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR CONEXION:" + e.getMessage());
        }

    }
    
    public void ActualizarJugador2() {
        try {
            st = Con.createStatement();
            st.executeUpdate("UPDATE Jugadores SET Jugador= '" + Metodos.jugador2.Nombre + "',Ganes = Jugadores.Ganes +'"+  Metodos.jugador2.GANADOS + "',Empates = Jugadores.Empates +'"+  Metodos.jugador2.EMPATADOS + "',Perdidas = Jugadores.Perdidas +'"+  Metodos.jugador2.PERDIDOS + "' WHERE  Jugadores.Jugador = '" + Metodos.jugador2.Nombre + "'");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR CONEXION:" + e.getMessage());
        }

    }
    

    public void InsertarPartida() {
        try {
            st = Con.createStatement();
            st.executeUpdate("INSERT INTO dbo.Juego(F1,F2,F3,F4,F5,F6,F7,F8,F9,Jugador1,Ganados1,Empates1,Perdidos1,Jugador2,Ganados2,Empates2,Perdidos2)" + "VALUES('" + Metodos.tablero[1] + "','" + Metodos.tablero[2] + "','" + Metodos.tablero[3] + "','" + Metodos.tablero[4] + "','" + Metodos.tablero[5] + "','" + Metodos.tablero[6] + "','" + Metodos.tablero[7] + "','" + Metodos.tablero[8] + "','" + Metodos.tablero[9] + "','" + Metodos.jugador1.Nombre + "','" + Metodos.jugador1.GANADOS + "','" + Metodos.jugador1.EMPATADOS + "','" + Metodos.jugador1.PERDIDOS + "','" + Metodos.jugador2.Nombre + "','" + Metodos.jugador2.GANADOS + "','" + Metodos.jugador2.EMPATADOS + "','" + Metodos.jugador2.PERDIDOS + "')");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR CONEXION:" + e.getMessage());

        }
    }

    public void Seleccionar_Partida() {

        try {
            rs = st.executeQuery("SELECT * FROM Juego");
            rs.next();

            Metodos.tablero[1] = rs.getInt(1);
            Metodos.tablero[2] = rs.getInt(2);
            Metodos.tablero[3] = rs.getInt(3);
            Metodos.tablero[4] = rs.getInt(4);
            Metodos.tablero[5] = rs.getInt(5);
            Metodos.tablero[6] = rs.getInt(6);
            Metodos.tablero[7] = rs.getInt(7);
            Metodos.tablero[8] = rs.getInt(8);
            Metodos.tablero[9] = rs.getInt(9);
            Metodos.jugador1.Nombre = rs.getString(10);
            Metodos.jugador1.GANADOS = rs.getInt(11);
            Metodos.jugador1.EMPATADOS = rs.getInt(12);
            Metodos.jugador1.PERDIDOS = rs.getInt(13);
            Metodos.jugador2.Nombre = rs.getString(14);
            Metodos.jugador2.GANADOS = rs.getInt(15);
            Metodos.jugador2.EMPATADOS = rs.getInt(16);
            Metodos.jugador2.GANADOS = rs.getInt(17);
            st.executeUpdate("DELETE FROM dbo.Jugadores");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR CONSULTA: " + ex.getMessage());
        }
    }

    public void eliminar_Partida() {
        try {
            st.execute("DELETE  FROM Juego");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR Al ELIMINAR : " + ex.getMessage());
        }
    }

    public Boolean Buscar_Jugador(String Jugador) {
        int contador=1;
        try {
            st = Con.createStatement();
            rs = st.executeQuery("SELECT*  FROM Jugadores");
            while (rs.next()) {
                if (Jugador.equals(rs.getString("Jugador"))) {
                    return true;
                }
                contador++;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR CONEXION:" + e.getMessage());
        }

        return false;
    }
}
