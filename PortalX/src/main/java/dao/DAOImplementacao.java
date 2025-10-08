package dao;

import model.Evento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public abstract  class DAOImplementacao<T, ID> implements DAOGenerico<T, ID> {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenciaPU");

    @Override
    public T inserir(T objeto) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        em.close();

        return objeto;
    }

    @Override
    public T alterar(T objeto) {
        return null;
    }

    @Override
    public T buscarPorId(ID T) {
        return null;
    }

//    @Override
//    public List<T> buscarTodos() {
//        EntityManager em = emf.createEntityManager();
//
//        List<T> lista = em.createQuery("SELECT t FROM :tipo t", T.class).setParameter("tipo",T).getResultList();
//
//        em.close();
//
//        return lista;
//    }
}
