/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

/**
 *
 * @author janto
 */
import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import utng.datos.CompositionDAO;
import utng.datos.PropertyDAO;
import utng.modelo.Composition;
import utng.modelo.Property;

@ManagedBean
@SessionScoped
public class CompositionBean implements Serializable {

    private List<Composition> compositions;
    private Composition composition;
    private List<Property> properties;

    public CompositionBean() {
        composition = new Composition();
        composition.setProperty(new Property());
    }

    public String listar() {
        CompositionDAO dao = new CompositionDAO();
        try {
            compositions = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Compositions";
    }

    public String eliminar() {
        CompositionDAO dao = new CompositionDAO();
        try {
            dao.delete(composition);
            compositions = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String agregar() {
        composition = new Composition();
        composition.setProperty(new Property());
        try {
            properties = new PropertyDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Agregar";
    }

    public String guardar() {
        CompositionDAO dao = new CompositionDAO();
        try {
            if (composition.getIdComposition()!= 0) {
                dao.update(composition);
            } else {
                dao.insert(composition);
            }
            compositions = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Composition composition) {
        this.composition = composition;
        try {
            properties = new PropertyDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }

    public List<Composition> getCompositions() {
        return compositions;
    }

    public void setCompositions(List<Composition> compositions) {
        this.compositions = compositions;
    }

    public Composition getComposition() {
        return composition;
    }

    public void setComposition(Composition composition) {
        this.composition = composition;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    
    
}
