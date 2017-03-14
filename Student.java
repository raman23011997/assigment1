/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Shanty
 */
public class Student extends Person{
    /**
     * instance variable ate initiated
     */
    private LocalDate enrollmentdate;
    private int studentNumber;
    private boolean isgood;
    private String major;
    /**
     * constructor that accept the following arguement
     * @param firstname
     * @param lastname
     * @param streetaddress
     * @param city
     * @param province
     * @param postalcode
     * @param birthdate
     * @param course
     * @param studentNumber
     * @param enrollmentdate 
     */
    public Student(String firstname, String lastname, String streetaddress, String city, String province, String postalcode, LocalDate birthdate,String course,int studentNumber,LocalDate enrollmentdate) {
        super(firstname, lastname, streetaddress, city, province, postalcode, birthdate);
        setBirthday(birthdate);
        setStudentNumber( studentNumber);
       major=course;
       isgood=true;
       this.enrollmentdate=enrollmentdate;
       
    }
    /**
     * get method that return the year of enrollment
     * @return 
     */
    public int getYearEnrolled(){
        
        int yearenrolled=enrollmentdate.getYear();
        
        
        return  yearenrolled;
    }
    /**
     * returns the amount of whole years a Student has been enrolled
     * @return 
     */
    public int 	getYearsAtCollege(){
        LocalDate year=LocalDate.now();
        int a=Period.between( enrollmentdate,year).getYears();
        return a;
    }
    /**
     * method accepts a LocalDate as an argument, validates if the birthday falls in the range of 14-90 years of age
     * @param birthdate 
     */
    public void setBirthday(LocalDate birthdate){
        
         LocalDate year1=LocalDate.now();
        int ageatsenrolled=Period.between(birthdate,year1).getYears();
        
        if(ageatsenrolled>=14 && ageatsenrolled<=90 ){
            super.setBirthday(birthdate);
        }else {
            throw new IllegalArgumentException("age should be between 14-90");
        }
   
    }
    
    /**
     * method will return true or false depending on the student is in good standing or not
     * @return 
     */
    public boolean inGoodStanding(){
        if(isgood==true){
            return true;
        }else{
            return false;
        }
       
    }

    public String getMajor() {
        return major;
    }/**
     * updates the instance variable holding whether or not the student is in good standing to be true
     * @return 
     */
    public boolean reinstateStudent(){
           isgood=true;
               return isgood;
           
       } /**
        * to suspend the student and put them in status where they cannot enroll in a course
        * @return 
        */
     public boolean suspendStudent(){
         isgood=false;
               return isgood;
           }/**
            * validates that the student number is a positive number or throws an IllegalArgumentException if it is 0 or negative
            * @param studentNumber 
            */
public void setStudentNumber(int studentNumber) 
    {
        this.studentNumber = studentNumber;
        if(studentNumber <= 0)
            throw new IllegalArgumentException("Student number must be greater than 0");
        
        
    }
/**
 * get method that return the enrollement date
 * @return 
 */

    public LocalDate getEnrollmentdate() {
        return enrollmentdate;
    }

   
/**
 * method that validates the enrollment date
 * @param enrollmentdate 
 */
    public void setEnrollmentdate(LocalDate enrollmentdate) {
        this.enrollmentdate = enrollmentdate;
    }
/**
 * set method for the instance variable
 * @param isgood 
 */
    public void setIsgood(boolean isgood) {
        this.isgood = isgood;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    

    public boolean isIsgood() {
        return isgood;
    }
    
    /**
     * method to override the super class toString() method with first name, last name and student number
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() +", student number is "+studentNumber;
    }
     

    
    
    
  
}