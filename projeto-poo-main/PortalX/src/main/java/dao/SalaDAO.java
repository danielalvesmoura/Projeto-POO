package dao;

import model.Sala;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class SalaDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenciaPU");

    public void inserir(Sala sala) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(sala);
        em.getTransaction().commit();
        em.close();

    }

    public List<Sala> listarTodos() {
        EntityManager em = emf.createEntityManager();

        List<Sala> lista = em.createQuery("SELECT s FROM Sala s", Sala.class).getResultList();

        em.close();

        return lista;
    }
}