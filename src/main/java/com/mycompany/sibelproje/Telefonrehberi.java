/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sibelproje;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "telefonrehberi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefonrehberi.findAll", query = "SELECT t FROM Telefonrehberi t")
    , @NamedQuery(name = "Telefonrehberi.findById", query = "SELECT t FROM Telefonrehberi t WHERE t.id = :id")
    , @NamedQuery(name = "Telefonrehberi.findByNumara", query = "SELECT t FROM Telefonrehberi t WHERE t.numara = :numara")})
public class Telefonrehberi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "ad")
    private String ad;
    @Basic(optional = false)
    @Lob
    @Column(name = "soyad")
    private String soyad;
    @Basic(optional = false)
    @Column(name = "numara")
    private String numara;

    public Telefonrehberi() {
    }

    public Telefonrehberi(Integer id) {
        this.id = id;
    }

    public Telefonrehberi(Integer id, String ad, String soyad, String numara) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.numara = numara;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefonrehberi)) {
            return false;
        }
        Telefonrehberi other = (Telefonrehberi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.sibelproje.Telefonrehberi[ id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", numara=" + numara +  " ]";
   
    }
    
}
