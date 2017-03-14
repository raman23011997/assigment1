/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Shanty
 */
public class Course {
    /**
     * instance variables to store an Instructor, course code, a course name, room, a DayOfWeek object, a LocalTime object for the start of class, and the maximum number of students allowed in the course.
     */
    private String coursecode,coursename,room,description;
    private DayOfWeek day;
    private int maxNumberOfStudents,duration;
    private LocalTime starttime;
    private ArrayList<Student> students;/**
     * arraylist to store students
     */
    private Instructor prof;
    
    public Course(String ccode,String cname,String cdesc,String room,Instructor prof,DayOfWeek day,LocalTime timeofclass,int duration,int studentmax){
        /**
         * •	A constructor that accepts arguments in the following order:  course code, course name, course description, room, Instructor, course day (DayOfWeek object), start time (LocalTime object), duration in hours and the max number of students
        
        */
        coursecode=ccode;
        coursename=cname;/**
         * directly set the value of the instance variable to what the user input
         */
        description=cdesc;
        setProf(prof);
        /**
         * method forwarded for further validation
         */
        setDayOfClass(day);
        setStartTime(timeofclass);
        setMaxNumberOfStudents(studentmax);
        this.room=room;
        students = new ArrayList<>();/**
         * initialize the arraylist
         */
    this.duration=duration;
   
    }
/**
 * get method that return duration of class
    
    */
    public int getDuration() {
        return duration;
    }
/**
 * get method that return Students
    
    */
    public ArrayList<Student> getStudents() {
      return students;  
    }
    /**
 * get method that return course code
    
    */
    public String getCourseCode() {
        return coursecode;
    }
    /**
     * 
    add student validate if student is in good standing and  if there is space in the class else it will throw the invalid Student exception
    */
    public void addStudent(Student student) throws InvalidStudentException {
        if (student.inGoodStanding() && students.size() < this.maxNumberOfStudents) {
            students.add(student);
        } else {
            throw new InvalidStudentException("Student can't be added.");
        }
    }
/**
 * validates whether if the professor can teach that subject otherwise throw an arguement
 * @param prof 
 */
    public void setProf(Instructor prof) {
        if (prof.canTeach(coursecode)){
        this.prof = prof;
        } else {
            throw new IllegalArgumentException(" Prof cannot teach this course.");
        }
    }
    
    /**
     * satDayOfClass validates if the class  is on the weekends then throw an exception
     * @param day 
     */
    
  public void setDayOfClass(DayOfWeek day){
      if(day==DayOfWeek.SATURDAY || day==DayOfWeek.SUNDAY){
          throw new IllegalArgumentException("Its a  holiday");
      }else{
          this.day=day;
      }
          
      }
/**
 * get method the the maximum number of student in the  class
  
  */
    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }
/**
 * set method which validates the number of students in the class
 * if number of students is less than 10 or it is over 50 it will throw an exception
 * @param maxStudents 
 */

    public void setMaxNumberOfStudents(int maxStudents) {
        if(maxStudents>=10 && maxStudents<=50)
        maxNumberOfStudents = maxStudents;
        else
            throw new IllegalArgumentException("maximum number of children should be in between 10-50");
            
    }
    
  /**
   * get method which return the description
   * @return 
   */
    public String getDescription() {
        return description;
    }
/**
   * get method which return the coursename
   * @return 
   */
    public String getCourseName() {
        return coursename;
    }
    /**
   * get method which return the room
   * @return 
   */

    public String getRoom() {
        return room;
    }
/**
   * get method which return the day
   * @return 
   */
    public DayOfWeek getDayOfClass() {
        return day;
    }
/**
 * validates if it is between 8:00 am and 6:00 pm.  otherwise an IllegalArgumentException will be thrown
 * @param startTime 
 */
    public void setStartTime(LocalTime startTime) {
         
        if(startTime.isBefore(LocalTime.of(8,0)) || startTime.isAfter(LocalTime.of(18,0)) ){
            throw new IllegalArgumentException("children should be in between 10-50");
        }else 
        this.starttime = startTime;
    }
    /**
     * to string method that return with the course name, a space and then the course code
     * @return 
     */

    @Override
    public String toString() {
        return  coursename+" "+coursecode;
    }

    /**
     * get method all the instance variable are listed below
     * @return 
     */

    public LocalTime getStartTime() {
        return starttime;
    } 

    public String getCoursecode() {
        return coursecode;
    }

    public String getCoursename() {
        return coursename;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public LocalTime getStarttime() {
        return starttime;
    }

    public Instructor getProf() {
        return prof;
    }

    /**
     * a method to show the average number of years students registered in the class have been at the college
     * @return 
     */
    
    public double averageStudentTimeAtCollege() {
        if (students.isEmpty()) {
            return 0;
        }else { 
            int sum = 0;
            for(int i = 0 ;i < students.size(); i++) {
                sum += students.get(i).getYearsAtCollege();
            }
        
            return (double) sum / students.size();
        }
        
        
        
        
    }
    
    /**
     * return the number of students
     * @return 
     */

   public int getNumberOfStudentsEnrolled() {
              return students.size();
    }
/**
 * return a String with the Student’s name registered in the course.  Each Student should use their “toString” method and put a new line character after students
 * @return 
 */
   public  String showClassList() {
           String m="";
        for(int i=0 ; i< students.size() ; i++){
          m = m + String.format("%s%n",students.get(i));
        
    } return m;
   }
}
  
