package dao;

import model.Palestrante;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class PalestranteDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenciaPU");

    public void inserir(Palestrante palestrante) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(palestrante);
        em.getTransaction().commit();
        em.close();

    }

    public List<Palestrante> listarTodos() {
        EntityManager em = emf.createEntityManager();

        List<Palestrante> lista = em.createQuery("SELECT p FROM Palestrante p", Palestrante.class).getResultList();

        em.close();

        return lista;
    }
}