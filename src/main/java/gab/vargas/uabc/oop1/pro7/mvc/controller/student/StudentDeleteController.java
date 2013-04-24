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

/**
 *
 * @author gvargas
 */
public class StudentDeleteController implements Controller{

    private StudentServices studentService = new StudentServices();
    private StudentDao      studentDaoJaxb = new StudentDaoJaxb();
    
    
    public void processRequest() {
        
        ArrayList<Student> studentList = studentDaoJaxb.getXml();
        
        int studentId = studentService.askStudentId();
        
        // remove the student from the list 
        studentList = studentService.removeStudent(studentId,studentList);
        
        createStudentXml(studentList);
        
    }
    
    public void createStudentXml(ArrayList<Student> studentList){
        
        studentDaoJaxb.createXml(studentList);
    }
    
    
    

    
    
    
    
    
    
    
    
    
}
