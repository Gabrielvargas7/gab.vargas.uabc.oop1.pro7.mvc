/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.services.student;

import gab.vargas.uabc.oop1.pro7.mvc.domain.Student;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author gvargas
 */
public class StudentServices {
    
     public void printStudent(ArrayList<Student> studentList){
        
        for (Iterator<Student> it = studentList.iterator(); it.hasNext();) {
            Student student = it.next();
            System.out.println(student.toString());    
        }
    }
     
      public Student askStudentInfo(){

        Scanner scan;
        Student student = new Student();
        
        System.out.print("Enter the Student Id: ");
        scan = new Scanner(System.in); 
        student.setStudentId(Integer.parseInt(scan.nextLine())); 
        
        System.out.print("Enter the First Name: ");
        scan = new Scanner(System.in); 
        student.setFirstName(scan.nextLine()); 
        
        System.out.print("Enter the Last Name: ");
        scan = new Scanner(System.in); 
        student.setLastName(scan.nextLine()); 
        
        System.out.print("Enter the Email: ");
        scan = new Scanner(System.in); 
        student.setEmail(scan.nextLine()); 
        
        student.setStatus("enable"); 
        
        student.setCreatedDate(new Date()); 
        
        System.out.print("Enter the Address: ");
        scan = new Scanner(System.in); 
        student.setAddress(scan.nextLine()); 
        
        System.out.print("Enter the City: ");
        scan = new Scanner(System.in); 
        student.setAddressCity(scan.nextLine()); 
        
        System.out.print("Enter the State: ");
        scan = new Scanner(System.in); 
        student.setAddressState(scan.nextLine()); 
        
        System.out.print("Enter the Zip Code: ");
        scan = new Scanner(System.in); 
        student.setAddressZipCode(scan.nextLine()); 
        
        System.out.print("Enter the Country: ");
        scan = new Scanner(System.in); 
        student.setAddressCountry(scan.nextLine()); 
        
        System.out.print("Enter the Home Phone: ");
        scan = new Scanner(System.in); 
        student.setPhoneHome(scan.nextLine()); 
        
        System.out.print("Enter the Mobile Phone: ");
        scan = new Scanner(System.in); 
        student.setPhoneMobile(scan.nextLine()); 
        
        return student;
    }
      
      
      public Student getStudentInitialization1(){
        
        Student student1 = new Student();
        student1.setStudentId(1);
        student1.setFirstName("Tom");
        student1.setLastName("Lee"); 
        student1.setEmail("tom@gmail.com");
        student1.setStatus("enable"); // enable or disable 
        
        student1.setCreatedDate(new Date());
        student1.setAddress("Nonne St");
        student1.setAddressCity("Los Angeles");
        student1.setAddressState("CA");
        student1.setAddressZipCode("92555");
        student1.setAddressCountry("USA");
        student1.setPhoneHome("395-559-8658");
        student1.setPhoneMobile("395-865-9634");
        
        return student1;
    }
    
    public Student getStudentInitialization2(){
        
        Student student2 = new Student();
        student2.setStudentId(2);
        student2.setFirstName("John");
        student2.setLastName("Kams"); 
        student2.setEmail("john@gmail.com");
        student2.setStatus("enable"); // enable or disable 
        student2.setCreatedDate(new Date());
        student2.setAddress("Clinton St");
        student2.setAddressCity("San Diego");
        student2.setAddressState("CA");
        student2.setAddressZipCode("98635");
        student2.setAddressCountry("USA");
        student2.setPhoneHome("251-968-7752");
        student2.setPhoneMobile("251-556-6653");
        
        return student2;
        
    }
    
    public int askStudentId(){

        int studentId;
        Scanner scan;
        
        System.out.print("Enter the Student Id: ");
        scan = new Scanner(System.in); 
        studentId = Integer.parseInt(scan.nextLine()); 
        System.out.println("");
        return studentId;
        
    }
    
    // remove the student from the list 
    public ArrayList<Student> removeStudent(int studentId,ArrayList<Student> studentList){
        
            for (Iterator<Student> it = studentList.iterator(); it.hasNext();) {
            Student student = it.next();
                if (student.getStudentId() == studentId) {
                    it.remove();
                }
            }
            
        return studentList; 
    }
    
    
}
