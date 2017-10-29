package com.mycompany.studentlibraryapplication.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alex Lysun
 */
public class HibernateUtil {
    // creation entityMeneger
    public static EntityManager createEntityManager(EntityManagerFactory entityManagerFactory) {
        return entityManagerFactory.createEntityManager();
    }
    
    // creation entityMenegerFactory
    public static EntityManagerFactory createEntityManagerFactory() {
        return Persistence.createEntityManagerFactory("com.mycompany_StudentLibraryApplication_jar_5.2.6.FinalPU");
    }
}
