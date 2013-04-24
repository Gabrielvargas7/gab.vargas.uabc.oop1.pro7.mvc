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

/**
 *
 * @author gvargas
 */
public class StudentCreateXmlController implements Controller {

    private StudentServices studentService = new StudentServices();
    private StudentDao      studentDaoJaxb = new StudentDaoJaxb();
    
    
    @Override
    public void processRequest() {
        
        
        ArrayList<Student> studentList = new ArrayList<Student>();
        // add it to the studentList
        studentList.add(studentService.getStudentInitialization1());
        studentList.add(studentService.getStudentInitialization2());
        
        createStudentXml(studentList);
        
    }
    
    
    public void createStudentXml(ArrayList<Student> studentList){

        
        studentDaoJaxb.createXml(studentList);
    }
    
    
    
    
    
}
