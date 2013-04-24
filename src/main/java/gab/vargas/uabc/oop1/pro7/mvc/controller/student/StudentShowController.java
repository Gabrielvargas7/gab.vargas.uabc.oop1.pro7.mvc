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
import java.util.Iterator;

/**
 *
 * @author gvargas
 */
public class StudentShowController implements Controller {
    
    private StudentServices studentServices = new StudentServices();
    private StudentDao      studentDaoJaxb  = new StudentDaoJaxb();


    public void processRequest() {
        // Short 
        // get the student list and set in the print student service 
        
        studentServices.printStudent(studentDaoJaxb.getXml());        
        
    }
            
    
    
    
}
