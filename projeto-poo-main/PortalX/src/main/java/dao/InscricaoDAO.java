package dao;

import model.Inscricao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class InscricaoDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenciaPU");

    public void inserir(Inscricao inscricao) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(inscricao);
        em.getTransaction().commit();
        em.close();

    }

    public List<Inscricao> listarTodos() {
        EntityManager em = emf.createEntityManager();

        List<Inscricao> lista = em.createQuery("SELECT f FROM Feedback f", Inscricao.class).getResultList();

        em.close();

        return lista;
    }
}