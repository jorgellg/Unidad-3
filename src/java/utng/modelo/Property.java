/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author janto
 */
@Entity
@Table(name = "property")

public class Property implements Serializable
 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_property")
    private Long idProperty;
    
    @Column(length = 100)
    private String transitive;
    @Column(length = 150)
    private String symetric;
    @Column(length = 20)
    private String cyclic;

    public Property() {
        this.idProperty = 0L;
    }

    public Long getIdProperty() {
        return idProperty;
    }

    public void setIdProperty(Long idProperty) {
        this.idProperty = idProperty;
    }

    public String getTransitive() {
        return transitive;
    }

    public void setTransitive(String transitive) {
        this.transitive = transitive;
    }

    public String getSymetric() {
        return symetric;
    }

    public void setSymetric(String symetric) {
        this.symetric = symetric;
    }



    public String getCyclic() {
        return cyclic;
    }

    public void setCyclic(String cyclic) {
        this.cyclic = cyclic;
    }

        
}

