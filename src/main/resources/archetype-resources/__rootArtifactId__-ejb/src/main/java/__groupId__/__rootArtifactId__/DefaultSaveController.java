/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package richtercloud.javaee.data.source.in.application.xml.jar;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author richter
 */
@Stateless
public class DefaultSaveController implements SaveController {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(MyEntity myEntity) {
        entityManager.persist(myEntity);
    }

    @Override
    public List<MyEntity> getAllMyEntities() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<MyEntity> cq = cb.createQuery(MyEntity.class);
        Root<MyEntity> qr = cq.from(MyEntity.class);
        cq.select(qr);
        TypedQuery<MyEntity> tq = entityManager.createQuery(cq);
        List<MyEntity> retValue = tq.getResultList();
        return retValue;
    }
}
