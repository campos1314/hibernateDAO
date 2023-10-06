package DAOs;

import Models.FilmeModel;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import java.util.List;
//import javax.transaction.Transaction;

public class FilmeModelDAO implements  IFilmeModelDAO {
    private final EntityManager em;
    public FilmeModelDAO(EntityManager em) {
        this.em = em;
    }

    public boolean insert(FilmeModel filme) {
        if (filme != null) {
            this.em.persist(filme);
            return true;
        } else {
            return false;
        }
    }

    public boolean update(FilmeModel filme){
        this.em.merge(filme);
        return true;
    }

    public boolean delete(FilmeModel filme){
        filme = em.merge(filme);
        this.em.remove(filme);
        return true;
    }

    public FilmeModel findById(int id){
        return em.find(FilmeModel.class, id);
    }
    public FilmeModel findByTitulo(String titulo){
        String jpql = "SELECT p FROM FilmeModel AS p WHERE p.titulo = :nome";
        return em.createQuery(jpql, FilmeModel.class)
                .setParameter("nome", titulo)
                .getSingleResult();
    }

    public List<FilmeModel> findAll(){
        String jpql = "SELECT p FROM FilmeModel AS p";
        return em.createQuery(jpql, FilmeModel.class).getResultList();
    }
    public List<FilmeModel> findByGeneroTitulo(String generoTitul){
        String jpql = "SELECT p FROM FilmeModel AS p WHERE p.generoTitulo = ?1";
        return em.createQuery(jpql, FilmeModel.class)
                .setParameter(1, generoTitul).getResultList();
    }

}


