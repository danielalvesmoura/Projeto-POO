package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.Persistence;

import java.util.List;
import java.util.ArrayList;

import model.Evento;

public class EventoDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenciaPU");

    public void inserir(Evento evento) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(evento);
        em.getTransaction().commit();
        em.close();

    }

    public List<Evento> listarTodos() {
        EntityManager em = emf.createEntityManager();

        List<Evento> lista = em.createQuery("SELECT e FROM Evento e", Evento.class).getResultList();

        em.close();

        return lista;
    }
}