/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Shanty
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Person invalidPerson = new Person("Anita", "Job", "31 Employment Ave", "Happivale", "ON","T382B2", LocalDate.of(2000, Month.MAY, 10));    
         System.out.printf("your postal code is %s %d"+invalidPerson.toString());
        // TODO code application logic here
    }
    
}
