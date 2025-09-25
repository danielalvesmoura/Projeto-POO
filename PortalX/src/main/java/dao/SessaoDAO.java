package dao;

import model.Sessao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class SessaoDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenciaPU");

    public void inserir(Sessao sessao) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(sessao);
        em.getTransaction().commit();
        em.close();

    }

    public List<Sessao> listarTodos() {
        EntityManager em = emf.createEntityManager();

        List<Sessao> lista = em.createQuery("SELECT s FROM Sessao s", Sessao.class).getResultList();

        em.close();

        return lista;
    }
}