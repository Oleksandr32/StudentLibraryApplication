package com.mycompany.studentlibraryapplication.validation;

/**
 *
 * @author Alex Lysun
 * Validator for signup
 */

public class Validator {
    // patterns
    private static final String LIBRARIAN_ID_PATTERN = "^L\\d{6}";
    private static final String STUDENT_ID_PATTERN = "^S\\d{6}";
    private static final String NAME_PATTERN = "^[A-Z][a-z]*$";
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String PASSWORD_PATTERN = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20}$";
    
    
    /**
    * Validate an id string for librarian.
    * 
    * @param id
    *            the id string.
    * @return true if the librarian id is valid, false otherwise.
    */
    public static boolean validateLibrarianId(final String id) {
        return id.matches(LIBRARIAN_ID_PATTERN);
    }
    
    /**
    * Validate an id string for student.
    * 
    * @param id
    *            the id string.
    * @return true if the student id is valid, false otherwise.
    */
    public static boolean validateStudentId(final String id) {
        return id.matches(STUDENT_ID_PATTERN);
    }
    
    /**
    * Validate an first name or last name string.
    * 
    * @param name
    *            the name string.
    * @return true if the name is valid, false otherwise.
    */
    public static boolean validateName(final String name) {
        return name.matches(NAME_PATTERN);
    }
    
    /**
    * Validate an email string.
    * 
    * @param email
    *            the email string.
    * @return true if the email address is valid, false otherwise.
    */
    public static boolean validateEmail(final String email) {
        return email.matches(EMAIL_PATTERN);
    }
    
    /**
    * Validate an password string.
    * 
    * @param password
    *            the password string.
    * @return true if the password is valid, false otherwise.
    */
    public static boolean validatePassword(final String password) {
        return password.matches(PASSWORD_PATTERN);
    }
}
