package jpa.repository;

import jpa.entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TestRepository {

    @PersistenceContext(unitName = "entiry-pers")
    private EntityManager entityManager;

    public User getUserById(Long id){
        return entityManager.find(User.class, id);
    }
}
