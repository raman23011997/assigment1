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
public  class Person {
    /**
     * created instance variables
     */
     private String FirstName,LastName,StreetAddress,city,province,postalCode;
     private LocalDate Birthdate;
     /**
      * A constructor that accept first name, last name, street address, city, province, postal code, and birthdate as an arguement
      */
    public Person(String firstname,String lastname,String streetaddress,String  city,String province, String postalcode, LocalDate birthdate){
        FirstName=firstname;/**
         * validate all the inputs
         */
        LastName=lastname;
        StreetAddress=streetaddress;
        this.city=city;
        this.province=province;
        setPostalCode(postalcode);/**
         * method forwarded for validation
         */
       
    Birthdate=birthdate;
    }
    
    /**
     * method validates that postal code is equal to 6 otherwise throw an exception
     */
    public void setPostalCode(String pc){
        
        if(pc.length()==6){
        postalCode = pc.toUpperCase();
        }
        else{
        throw new IllegalArgumentException("Postal code should have 6 characters ");}
    }
/**
   * GET METHOD FOR ALL INSTANCE VARIABLES
   */

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }
  
    

    public String getCity() {
        return city;
    }

    public String getStreetAddress() {
        return StreetAddress;
    }
/**
 * set method for all the instance variable are all below
 * @param FirstName 
 */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setStreetAddress(String StreetAddress) {
        this.StreetAddress = StreetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public LocalDate getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(LocalDate Birthdate) {
        this.Birthdate = Birthdate;
    }
/**
 * method called changeAddress() that accepts the street, city, province,and postal code as arguments
 * @param street
 * @param city
 * @param province
 * @param postalCoDe 
 */
  public void changeAddress(String street,String city,String province,String postalCoDe){
      this.StreetAddress=street;
      this.city=city;
      this.province=province;
       setPostalCode(postalCoDe);
  } 

    public String getProvince() {
        return province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public LocalDate getBirthday() {
   
        return Birthdate;
    }

   public int getYearBorn(){
       int r=Birthdate.getYear();
       return r;
   }
    /**
     * will return the age of the person
     */
    public int getAge(){
        LocalDate time=LocalDate.now();
        int age=Period.between(Birthdate, time).getYears();
        return age;
    }/**
     * this method return the full address of the person
     */
    public String getFullAddress(){
        return StreetAddress+", "+ city+ ", "+ province+", "+ postalCode;
    }
    /**
     * this method set the birthdate
     * @param birthdate 
     */
    
    public void setBirthday(LocalDate birthdate)
    {
        this.Birthdate = birthdate;
    }
    /**
     * this method return the first name and the last name
     * @return 
     */
    public String toString(){
        return FirstName+" "+LastName;
    }
    }

