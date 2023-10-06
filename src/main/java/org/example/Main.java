package org.example;

import DAOs.FilmeModelDAO;
import Models.FilmeModel;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        FilmeModel filme1 =  new FilmeModel("Oppenheimer", 2023, "21 Jul 2023", 180, "Biography, Drama, History");
        EntityManager em = JPAUtil.getEntityManager();
        var dao = new FilmeModelDAO(em);

        em.getTransaction().begin();
        //dao.insert(filme1);
        var x = dao.findByGeneroTitulo("Drama");
        System.out.println(x.toString());
        //y.setTitulo("Oppenheimer");
        //em.flush();

        var listinha = dao.findAll();


        em.getTransaction().commit();
        em.close();

        System.out.println(listinha.toString());



    }
}
