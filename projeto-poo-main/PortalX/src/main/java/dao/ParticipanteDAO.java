package dao;

import model.Participante;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ParticipanteDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenciaPU");

    public void inserir(Participante participante) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(participante);
        em.getTransaction().commit();
        em.close();

    }

    public List<Participante> listarTodos() {
        EntityManager em = emf.createEntityManager();

        List<Participante> lista = em.createQuery("SELECT p FROM Participante p", Participante.class).getResultList();

        em.close();

        return lista;
    }
}