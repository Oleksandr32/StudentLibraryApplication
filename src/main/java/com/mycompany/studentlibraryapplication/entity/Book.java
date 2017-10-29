package com.mycompany.studentlibraryapplication.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Alex Lysun
 */
@Entity
@Table (name = "books")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=1)
public class Book implements Serializable {

    private static final long serialVersionUID = -4125965356358329466L;
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "seq")
    @Column (name = "id", nullable = false)
    private Long id;
    @Column (name = "title", nullable = false)
    private String title;
    @Column (name = "author", nullable = false)
    private String author;
    @Column (name = "quantity", nullable = false)
    private Integer quantity;    
    @ManyToMany (mappedBy = "books", fetch = FetchType.EAGER)
    private List<Student> students = new ArrayList<>(0);

    public Book() {
    }

    public Book(String title, String author, Integer quantity) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    } 

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
        
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }    

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", author=" + author
                + ", quantity=" + quantity + '}';
    }    
}
