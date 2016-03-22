/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

/**
 *
 * @author Cristiam
 */
public class Jugadores {
    public String Nombre;
     public int GANADOS;
     public int PERDIDOS;
     public int EMPATADOS;
     
     public Jugadores(String Nom,int Ganes,int perdidas,int empates){
       this.Nombre = Nom;
        GANADOS = 0;
        PERDIDOS = 0;
        EMPATADOS = 0;
        
     }
     public void gano(){
         
     }
     public void perdio(){
         
     }
}
