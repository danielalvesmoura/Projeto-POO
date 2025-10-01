package dao;

import model.Feedback;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class FeedbackDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenciaPU");

    public void inserir(Feedback feedback) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(feedback);
        em.getTransaction().commit();
        em.close();

    }

    public List<Feedback> listarTodos() {
        EntityManager em = emf.createEntityManager();

        List<Feedback> lista = em.createQuery("SELECT f FROM Feedback f", Feedback.class).getResultList();

        em.close();

        return lista;
    }
}