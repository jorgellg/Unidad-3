/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.PropertyDAO;
import utng.modelo.Property;

/**
 *
 * @author janto
 */
@ManagedBean
@SessionScoped
public class PropertyBean implements Serializable {

    private List<Property> properties;
    private Property property;

    public String listar() {
        PropertyDAO dao = new PropertyDAO();
        try {
            properties = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Properties";
    }

    public String eliminar() {
        PropertyDAO dao = new PropertyDAO();
        try {
            dao.delete(property);
            properties = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String agregar() {
        property = new Property();
        return "Agregar";
    }

    public String guardar() {
        PropertyDAO dao = new PropertyDAO();
        try {
            if (property.getIdProperty()!= 0) {
                dao.update(property);
            } else {
                dao.insert(property);
            }
            properties = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Property property) {
        this.property = property;
        return "Editar";
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    

}
