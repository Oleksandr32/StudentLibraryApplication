package com.mycompany.studentlibraryapplication.db;

import com.mycompany.studentlibraryapplication.entity.Book;
import com.mycompany.studentlibraryapplication.utils.HibernateUtil;
import com.mycompany.studentlibraryapplication.entity.Student;

import java.util.List;

/**
 *
 * @author Alex Lysun
 */

public class LibrarianDao extends Dao {
    
    // method returns a list of all students from the database
    public static List<Student> getAllStudents() {
        entityManagerFactory = HibernateUtil.createEntityManagerFactory();
        entityManager = HibernateUtil.createEntityManager(entityManagerFactory);
        transaction = entityManager.getTransaction();
        List<Student> allStudents = null;
        
        try {
            transaction.begin();
                allStudents = entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive())
                transaction.rollback();
            
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        
        return allStudents;
    } // end getAllStudents method
    
    // method returns a student object from the database with given id
    public static Student getStudent(String id) {
        entityManagerFactory = HibernateUtil.createEntityManagerFactory();
        entityManager = HibernateUtil.createEntityManager(entityManagerFactory);
        transaction = entityManager.getTransaction();
        Student student = null;
        
        try {
            transaction.begin();
                student = entityManager.find( Student.class, id );
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive())
                transaction.rollback();
            
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        
        return student;
    } // end getStudent method

    // method adds new book to the library
    @Override
    public boolean addBook(Student student, Book book) {
        entityManagerFactory = HibernateUtil.createEntityManagerFactory();
        entityManager = HibernateUtil.createEntityManager(entityManagerFactory);
        transaction = entityManager.getTransaction();
        List<Book> books = null;
        
        try {
            transaction.begin();
                books = entityManager.createQuery("SELECT b FROM Book b WHERE b.title = :title AND b.author = :author", Book.class)
                        .setParameter( "title", book.getTitle() )
                        .setParameter( "author", book.getAuthor() )
                        .getResultList();
                
                if ( books.isEmpty() )
                    entityManager.persist( book );
                else 
                    return false;
                
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
    } // end addBook method

    // method updates book's in the library
    public static boolean updateQuantity(Book book) {
        entityManagerFactory = HibernateUtil.createEntityManagerFactory();
        entityManager = HibernateUtil.createEntityManager(entityManagerFactory);
        transaction = entityManager.getTransaction();
        List<Book> books = null;
        Book b = null;
        
        try {
            transaction.begin();
                books = entityManager.createQuery("SELECT b FROM Book b WHERE b.title = :title AND b.author = :author", Book.class)
                        .setParameter( "title", book.getTitle() )
                        .setParameter( "author", book.getAuthor() )
                        .getResultList();

                if ( books.isEmpty() )
                    return false;
                else {
                    b = books.get(0);
                    b.setQuantity( b.getQuantity() + book.getQuantity() );
                    
                    entityManager.merge( b );
                }
                
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
    } // end updateQuantity method
}
