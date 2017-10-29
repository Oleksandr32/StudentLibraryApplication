package com.mycompany.studentlibraryapplication.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Alex Lysun
 */

@Entity
@Table (name = "librarians")
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public class Librarian implements Serializable {

    private static final long serialVersionUID = -687991492884005033L;
    
    @Id
    @Column (name = "id", nullable = false, unique = true)
    protected String id;
    
    @Column (name = "first_name", nullable = false)
    protected String firstName;
    @Column (name = "last_name", nullable = false)
    protected String lastName;
    @Column (name = "email", nullable = false)
    protected String email;
    @Column (name = "password", nullable = false)
    protected String password;
    @Column (name = "avatar_url", nullable = false)
    protected String avatarUrl;
    
    public Librarian() {
        avatarUrl = "img/profile/anonym.png";
    }

    public Librarian(String id, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        avatarUrl = "img/profile/anonym.png";
    }

    // getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
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
        if (!(object instanceof Librarian)) {
            return false;
        }
        Librarian other = (Librarian) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Object[" + "id= " + id + ", firstName= " + firstName
                + ", lastName= " + lastName + ", email= " + email + ", password= "
                + password + ", avatarUrl= " + avatarUrl + "]";
    }    
}
