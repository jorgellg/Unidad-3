/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Property;

/**
 *
 * @author janto
 */
public class PropertyDAO extends DAO<Property> {
        public PropertyDAO() {
        super(new Property());
    }

    public Property getOneById(Property property) throws HibernateException {
        return super.getOneById(property.getIdProperty());
    }
   
}
