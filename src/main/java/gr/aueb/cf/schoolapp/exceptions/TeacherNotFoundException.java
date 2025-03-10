package gr.aueb.cf.schoolapp.exceptions;

import gr.aueb.cf.schoolapp.model.Teacher;

import java.io.Serial;

public class TeacherNotFoundException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public TeacherNotFoundException(String message) {
        super(message);
    }
}
