package com.mycompany.studentlibraryapplication.db;

import com.mycompany.studentlibraryapplication.utils.HibernateUtil;
import com.mycompany.studentlibraryapplication.entity.Book;
import com.mycompany.studentlibraryapplication.entity.Librarian;
import com.mycompany.studentlibraryapplication.entity.Student;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Alex Lysun
 */

public abstract class Dao {
    // data fields
    protected static EntityManagerFactory entityManagerFactory = null;
    protected static EntityManager entityManager = null;
    protected static EntityTransaction transaction = null;
    
    /*
    * abstract method
    * method adds new book to the library
    */
    public abstract boolean addBook(Student student, Book book);
    
    // login method
    public static Object login(String id, boolean isLibrarian) {         
        entityManagerFactory = HibernateUtil.createEntityManagerFactory();
        entityManager = HibernateUtil.createEntityManager( entityManagerFactory );
        transaction = entityManager.getTransaction();
        Object person = null;
        
        try {
            transaction.begin();
                if (isLibrarian)
                    person = entityManager.find( Librarian.class, id );
                else
                    person = entityManager.find( Student.class, id );
            transaction.commit();
        } catch(Exception e) {
            if (transaction.isActive())
                transaction.rollback();
            
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    
        return person;
    } // end login method
    
    // signup method
    public static boolean signup(Object person, String id) {        
        entityManagerFactory = HibernateUtil.createEntityManagerFactory();
        entityManager = HibernateUtil.createEntityManager(entityManagerFactory);
        transaction = entityManager.getTransaction();
        Object p = null;
        
        try {
            transaction.begin();
                p = entityManager.find( person.getClass(), id );
                if ( p == null )
                    entityManager.persist(person);
                else
                    return false;
            transaction.commit();
        } catch(Exception e) {
            if (transaction.isActive())
                transaction.rollback();
            
            e.printStackTrace();            
            return false;
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        
        return true;
    } // end signup method
    
    // method returns list of all books from the database
    public static List<Book> getAllBooks() {
        entityManagerFactory = HibernateUtil.createEntityManagerFactory();
        entityManager = HibernateUtil.createEntityManager(entityManagerFactory);
        transaction = entityManager.getTransaction();
        List<Book> allBooks = null;
        
        try {
            transaction.begin();
                allBooks = entityManager.createQuery("SELECT b FROM Book b", Book.class).getResultList();
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive())
                transaction.rollback();
            
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        
        return allBooks;
    } // end getAllBooks method
    
    // method changes avatar url for current student or librarian in database
    public static boolean changeAvatarUrl(Object person) {
        entityManagerFactory = HibernateUtil.createEntityManagerFactory();
        entityManager = HibernateUtil.createEntityManager(entityManagerFactory);
        transaction = entityManager.getTransaction();        
        try {
            transaction.begin();
                entityManager.merge(person);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive())
                transaction.rollback();
            
            e.printStackTrace();
            return false;
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        
        return true;
    } // end changeAvatarUrl method
    
    // method changes password for current student in database
    public static boolean changePassword(Object person) {
        entityManagerFactory = HibernateUtil.createEntityManagerFactory();
        entityManager = HibernateUtil.createEntityManager(entityManagerFactory);
        transaction = entityManager.getTransaction();        
        try {
            transaction.begin();
                entityManager.merge(person);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive())
                transaction.rollback();
            
            e.printStackTrace();
            return false;
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        
        return true;
    } // end changePassword method
    
    // method changes email address for current student or librarian in database
    public static boolean changeEmail(Object person) {        
        entityManagerFactory = HibernateUtil.createEntityManagerFactory();
        entityManager = HibernateUtil.createEntityManager(entityManagerFactory);
        transaction = entityManager.getTransaction();        
        try {
            transaction.begin();
                entityManager.merge(person);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive())
                transaction.rollback();
            
            e.printStackTrace();
            return false;
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        
        return true;
    } // end changeEmail method
}
