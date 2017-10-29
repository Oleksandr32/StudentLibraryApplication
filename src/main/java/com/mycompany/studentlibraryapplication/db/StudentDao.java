package com.mycompany.studentlibraryapplication.db;

import com.mycompany.studentlibraryapplication.utils.HibernateUtil;
import com.mycompany.studentlibraryapplication.entity.Book;
import com.mycompany.studentlibraryapplication.entity.Student;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Alex Lysun
 */
public class StudentDao extends Dao {    
    
    //
    public static void addBook(Student student) {        
        entityManagerFactory = HibernateUtil.createEntityManagerFactory();
        entityManager = HibernateUtil.createEntityManager(entityManagerFactory);
        transaction = entityManager.getTransaction();
        
        try {
            transaction.begin();
                Book b1 = new Book("Gern", "Leandr", 8);
                student.getBooks().add(b1);
                student.getDates().add(new Date());
                //student.getBooks().add(b2);
               // student.getDate().add(new Date());
                entityManager.merge(student);
            transaction.commit();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }   

    // method returns a book object from the database with given id
    public static Book getBook(String title, String author) {
        entityManagerFactory = HibernateUtil.createEntityManagerFactory();
        entityManager = HibernateUtil.createEntityManager(entityManagerFactory);
        transaction = entityManager.getTransaction();
        Book book = null;
        
        try {
            transaction.begin();
                book = entityManager.createQuery( "SELECT b FROM Book b WHERE b.title = :title AND b.author = :author", Book.class )
                        .setParameter( "title", title )
                        .setParameter( "author", author )
                        .getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive())
                transaction.rollback();
            
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        
        return book;
    } // end getBook method
    
    // method adds book to student 
    @Override
    public boolean addBook(Student student, Book book) {
        entityManagerFactory = HibernateUtil.createEntityManagerFactory();
        entityManager = HibernateUtil.createEntityManager(entityManagerFactory);
        transaction = entityManager.getTransaction();
        try {
            transaction.begin();
                book.setQuantity( book.getQuantity() - 1 );
                book.getStudents().add( student );
                student.getBooks().add( book );
                student.getDates().add( new Date() );   
                
                // insert this event to history table in database with status "add"
                entityManager.createNativeQuery("INSERT INTO history(id, title, author, action) values(?, ?, ?, ?)")
                        .setParameter( 1, student.getId() )
                        .setParameter( 2, book.getTitle() )
                        .setParameter( 3, book.getAuthor() )
                        .setParameter( 4, "add" )
                        .executeUpdate();
                
                entityManager.merge( student );
            transaction.commit();
        } catch (Exception e) {
            if ( transaction.isActive() )
                transaction.rollback();
            
            e.printStackTrace();
            return false;
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        
        return true;
    } // end addBook method
    
    // method removes the book from the student 
    public static boolean removeBook(Student student, Book book) {
        entityManagerFactory = HibernateUtil.createEntityManagerFactory();
        entityManager = HibernateUtil.createEntityManager(entityManagerFactory);
        transaction = entityManager.getTransaction();
        try {
            transaction.begin();
                book.setQuantity( book.getQuantity() + 1 );
                entityManager.merge( book );
                book.getStudents().remove( student );
                int index = student.getBooks().indexOf( book );
                student.getBooks().remove( book );
                student.getDates().remove( index );     
                
                // insert this event to history table in database with status "remove"
                entityManager.createNativeQuery("INSERT INTO history(id, title, author, action) values(?, ?, ?, ?)")
                        .setParameter( 1, student.getId() )
                        .setParameter( 2, book.getTitle() )
                        .setParameter( 3, book.getAuthor() )
                        .setParameter( 4, "remove" )
                        .executeUpdate();
                
                entityManager.merge( student );
            transaction.commit();
        } catch (Exception e) {
            if ( transaction.isActive() )
                transaction.rollback();
            
            e.printStackTrace();
            return false;
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        
        return true;
    } // end removeBook method
    
    // method returns a history info from the database for current student with given id
    public static List<Object[]> getHistory(String id) {
        entityManagerFactory = HibernateUtil.createEntityManagerFactory();
        entityManager = HibernateUtil.createEntityManager(entityManagerFactory);
        transaction = entityManager.getTransaction();
        List<Object[]> history = null;  

        try {
            transaction.begin();
                history = (List<Object[]>) entityManager.createNativeQuery( "SELECT * FROM history WHERE id = ?" )
                        .setParameter( 1, id )
                        .getResultList();
                        
            transaction.commit();
        } catch (Exception e) {
            if ( transaction.isActive() )
                transaction.rollback();
            
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        
        return history;
    } // end getHistory method
}
