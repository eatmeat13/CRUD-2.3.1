package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;



    public void add(User user) {
        entityManager.persist(user);


    }


    public void delete(int id) {
        entityManager.createQuery("delete from User  where id = :paramId").setParameter("paramId", id).executeUpdate();


    }


    public void update(User user) {
        entityManager.merge(user);

    }


    public List<User> getList() {
        TypedQuery<User> query = entityManager.createQuery("from User", User.class);
        return query.getResultList();

    }


    public User getUser(int id) {
        return entityManager.find(User.class, id );
    }




}
