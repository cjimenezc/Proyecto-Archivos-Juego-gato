/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Cristiam
 */
@Entity
@Table(name = "Jugador", catalog = "Gato", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Jugador.findAll", query = "SELECT j FROM Jugador j"),
    @NamedQuery(name = "Jugador.findByIDJugador", query = "SELECT j FROM Jugador j WHERE j.iDJugador = :iDJugador"),
    @NamedQuery(name = "Jugador.findByJugador", query = "SELECT j FROM Jugador j WHERE j.jugador = :jugador"),
    @NamedQuery(name = "Jugador.findByGanes", query = "SELECT j FROM Jugador j WHERE j.ganes = :ganes"),
    @NamedQuery(name = "Jugador.findByPerdidas", query = "SELECT j FROM Jugador j WHERE j.perdidas = :perdidas")})
public class Jugador implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Jugador")
    private Integer iDJugador;
    @Basic(optional = false)
    @Column(name = "Jugador")
    private String jugador;
    @Column(name = "Ganes")
    private Integer ganes;
    @Column(name = "Perdidas")
    private Integer perdidas;

    public Jugador() {
    }

    public Jugador(Integer iDJugador) {
        this.iDJugador = iDJugador;
    }

    public Jugador(Integer iDJugador, String jugador) {
        this.iDJugador = iDJugador;
        this.jugador = jugador;
    }

    public Integer getIDJugador() {
        return iDJugador;
    }

    public void setIDJugador(Integer iDJugador) {
        Integer oldIDJugador = this.iDJugador;
        this.iDJugador = iDJugador;
        changeSupport.firePropertyChange("IDJugador", oldIDJugador, iDJugador);
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        String oldJugador = this.jugador;
        this.jugador = jugador;
        changeSupport.firePropertyChange("jugador", oldJugador, jugador);
    }

    public Integer getGanes() {
        return ganes;
    }

    public void setGanes(Integer ganes) {
        Integer oldGanes = this.ganes;
        this.ganes = ganes;
        changeSupport.firePropertyChange("ganes", oldGanes, ganes);
    }

    public Integer getPerdidas() {
        return perdidas;
    }

    public void setPerdidas(Integer perdidas) {
        Integer oldPerdidas = this.perdidas;
        this.perdidas = perdidas;
        changeSupport.firePropertyChange("perdidas", oldPerdidas, perdidas);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDJugador != null ? iDJugador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugador)) {
            return false;
        }
        Jugador other = (Jugador) object;
        if ((this.iDJugador == null && other.iDJugador != null) || (this.iDJugador != null && !this.iDJugador.equals(other.iDJugador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gato.Jugador[ iDJugador=" + iDJugador + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
