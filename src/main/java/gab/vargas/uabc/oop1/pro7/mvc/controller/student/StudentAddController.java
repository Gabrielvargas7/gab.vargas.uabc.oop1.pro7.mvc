/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.controller.student;

import gab.vargas.uabc.oop1.pro7.mvc.controller.Controller;
import gab.vargas.uabc.oop1.pro7.mvc.domain.Student;
import gab.vargas.uabc.oop1.pro7.mvc.repository.student.StudentDao;
import gab.vargas.uabc.oop1.pro7.mvc.repository.student.StudentDaoJaxb;
import gab.vargas.uabc.oop1.pro7.mvc.services.student.StudentServices;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author gvargas
 */
public class StudentAddController implements Controller{

    private StudentServices studentServices = new StudentServices();
    private StudentDao      studentDaoJaxb = new StudentDaoJaxb();
    
    
    public void processRequest() {
        
         Student student = studentServices.askStudentInfo(); 
         this.insertStudentInfo(student);
    }

    
    private void insertStudentInfo(Student student){
        
        ArrayList<Student> studentList;
        // get the xml file 
        studentList = studentDaoJaxb.getXml();        
        //insert the new student 
        studentList.add(student);
        // create the new xml with the new student 
        studentDaoJaxb.createXml(studentList);

        
    }
    

}
