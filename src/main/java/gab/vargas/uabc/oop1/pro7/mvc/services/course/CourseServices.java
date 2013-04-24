/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.services.course;

import gab.vargas.uabc.oop1.pro7.mvc.domain.Course;
import gab.vargas.uabc.oop1.pro7.mvc.domain.Student;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author gvargas
 */
public class CourseServices {
    
   public Course getCourseInitialization1(){
        
        Course course = new Course();
        course.setCourseId(111);
        course.setCourseCode("MATH111");
        course.setCourseName("Math 111");
        course.setCourseNumberUnits(3);
        course.setCoursePrice(100.00);
        course.setCourseMaxStudentsNumber(20);
        
        return course;
    }
    
   public Course getCourseInitialization2(){
        
        Course course = new Course();
        course.setCourseId(222);
        course.setCourseCode("JAVA222");
        course.setCourseName("Java 222");
        course.setCourseNumberUnits(5);
        course.setCoursePrice(150.00);
        course.setCourseMaxStudentsNumber(25);
        return course;
    }

    public void printStudent(ArrayList<Course> courseList) {
        for (Iterator<Course> it = courseList.iterator(); it.hasNext();) {
            Course course = it.next();
            System.out.println(course.toString());    
        }
        
    }

    public Course askCourseInfo() {
        
        Scanner scan;
        Course course = new Course();        
        
        System.out.print("Enter the Course Id: ");
        scan = new Scanner(System.in); 
        course.setCourseId(scan.nextInt()); 
        
        System.out.print("Enter the Course Name: ");
        scan = new Scanner(System.in); 
        course.setCourseName(scan.nextLine()); 
        
        System.out.print("Enter the Course Code: ");
        scan = new Scanner(System.in); 
        course.setCourseCode(scan.nextLine()); 
        
        System.out.print("Enter the Course Number Units: ");
        scan = new Scanner(System.in); 
        course.setCourseNumberUnits(scan.nextInt()); 
        
        System.out.print("Enter the Course Price: ");
        scan = new Scanner(System.in); 
        course.setCoursePrice(scan.nextDouble()); 
        
        System.out.print("Enter the Course Number of Max Student: ");
        scan = new Scanner(System.in); 
        course.setCourseNumberUnits(scan.nextInt()); 
        
        return course;

        
        
        
    }

    public int askCourseId() {
        
        int courseId;
        Scanner scan;
        
        System.out.print("Enter the Course Id: ");
        scan = new Scanner(System.in); 
        courseId = Integer.parseInt(scan.nextLine()); 
        System.out.println("");
        return courseId;
        
    }

    public ArrayList<Course> removeStudent(int courseId, ArrayList<Course> courseList) {
        
            for (Iterator<Course> it = courseList.iterator(); it.hasNext();) {
            Course course = it.next();
                if (course.getCourseId() == courseId) {
                    it.remove();
                }
            }
        return courseList; 

    }
    

    
    
}
