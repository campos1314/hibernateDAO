package DAOs;

import Models.FilmeModel;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import java.util.List;
//import javax.transaction.Transaction;

public class FilmeModelDAO implements  IFilmeModelDAO {
    private EntityManager em;
    public FilmeModelDAO(EntityManager em) {
        this.em = em;
    }


    @Override
    public FilmeModel findByTitulo(String titulo) {
        return em.createQuery("FROM FilmeModel WHERE titulo = :titulo", FilmeModel.class)
                .setParameter("titulo", titulo)
                .uniqueResult();
    }


    @Override
    public List<FilmeModel> findAll() {
        return em.createQuery("FROM FilmeModel", FilmeModel.class).list();
    }

    @Override
    public boolean insert(FilmeModel f) {
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(f);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public boolean update(FilmeModel f) {
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(f);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }



    @Override
    public boolean delete(FilmeModel f) {
        Transaction transaction = null;
        try {
            transaction = em.beginTransaction();
            em.delete(f);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

}

