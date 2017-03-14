/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *Exception that  extend the Exception class
 * @author shanty
 */
public class InvalidStudentException extends Exception {
    /**
     * constructor accepting the m as an argument
     * @param m 
     */
    public InvalidStudentException (String m) {
        super(m);
    }
    
}
