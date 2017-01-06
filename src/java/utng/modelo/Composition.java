/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author janto
 */
@Entity
@Table(name = "composition")
public class Composition implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_composition")
    private Long idComposition;
    @Column(name = "relation", length = 10)
    private String relation;
    @Column(length = 40)
    private String interred;
    
    @ManyToOne
    @JoinColumn(name = "id_property")
    private Property property;

    public Composition() {
        idComposition = 0L;
    }

    public Long getIdComposition() {
        return idComposition;
    }

    public void setIdComposition(Long idComposition) {
        this.idComposition = idComposition;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getInterred() {
        return interred;
    }

    public void setInterred(String interred) {
        this.interred = interred;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

   
}
