/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.services.studentcourse;

import gab.vargas.uabc.oop1.pro7.mvc.domain.Course;
import gab.vargas.uabc.oop1.pro7.mvc.domain.Student;
import gab.vargas.uabc.oop1.pro7.mvc.domain.StudentCourse;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author gvargas
 */
public class StudentCourseServices {
    
    public void printStudentCourse(ArrayList<StudentCourse> studentCourseList){
        
        for (Iterator<StudentCourse> studentCourseList_it = studentCourseList.iterator(); studentCourseList_it.hasNext();) {
            StudentCourse studentCourse = studentCourseList_it.next();
            System.out.println(studentCourse.toString());    
            
        }
    }
     
    
    
    public StudentCourse getStudentCourseInitialization1(){
        
        StudentCourse studentCourse = new StudentCourse();
        studentCourse.setCourseId(111);
        studentCourse.setStudentId(1);
        return studentCourse;
    }
    
    public StudentCourse getStudentCourseInitialization2(){
        
        StudentCourse studentCourse = new StudentCourse();
        studentCourse.setCourseId(222);
        studentCourse.setStudentId(1);
        return studentCourse;
    }
    
    public StudentCourse getStudentCourseInitialization3(){
        
        StudentCourse studentCourse = new StudentCourse();
        studentCourse.setCourseId(222);
        studentCourse.setStudentId(2);
        return studentCourse;
    }

public StudentCourse askStudentInfo(){

        Scanner scan;
        StudentCourse studentCourse = new StudentCourse();
        
        System.out.print("Enter the Student Id: ");
        scan = new Scanner(System.in); 
        studentCourse.setStudentId(Integer.parseInt(scan.nextLine())); 
        
        System.out.print("Enter the Course Id: ");
        scan = new Scanner(System.in); 
        studentCourse.setCourseId(scan.nextInt()); 
        
        
        return studentCourse;
    }

    public int askStudentId() {
        
        Scanner scan;
        int studentId; 
        
        System.out.print("Enter the Student Id: ");
        scan = new Scanner(System.in); 
        studentId = scan.nextInt(); 
        
        return studentId;
        
    }

    public ArrayList<StudentCourse> removeStudentCourse(int studentId, ArrayList<StudentCourse> studentCourseList) {
        
        for (Iterator<StudentCourse> it = studentCourseList.iterator(); it.hasNext();) {
            StudentCourse studentCourse = it.next();
                if (studentCourse.getStudentId() == studentId) {
                    it.remove();
                }
            }
            
        return studentCourseList; 
    }


    
}
