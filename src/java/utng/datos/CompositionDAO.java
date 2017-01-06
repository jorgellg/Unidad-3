/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Composition;

/**
 *
 * @author janto
 */
public class CompositionDAO extends DAO<Composition> {

    public CompositionDAO() {
        super(new Composition());
    }

    public Composition getOneById(Composition composition) throws HibernateException {
        return super.getOneById(composition.getIdComposition());
    }
}
