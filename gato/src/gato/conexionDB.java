/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Cristiam
 */
public class conexionDB {
   
    public static Connection Con;
    protected Connection cn;
    protected Statement st;

    public void conexionDB() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.Con = DriverManager.getConnection("jdbc:sqlserver://JIMENEZ;" + "database = Gato;" + "user = sa;" + "password = Cessna123");
            this.st = Con.createStatement();
            System.out.println("Conexion Establecida");
        } catch (SQLException e1) {
            System.out.println("ERROR SQL:" + e1.getMessage());

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
    public void InsertarJugador(String prueba,int gane,int perdida,int empate){
        try {
            st = Con.createStatement();
            st.executeUpdate("INSERT INTO dbo.Jugadores(Jugador,Ganes,Perdidas,Empates)" + "VALUES('" +prueba+ "','" +gane+ "','" +perdida+ "','" +empate+ "')" );
        } catch (Exception e) {
            System.out.println("ERROR CONEXION:" + e.getMessage());
        }
    }
    
}
