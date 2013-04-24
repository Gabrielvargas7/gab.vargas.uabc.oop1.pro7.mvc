/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.controller.course;

import gab.vargas.uabc.oop1.pro7.mvc.controller.Controller;
import gab.vargas.uabc.oop1.pro7.mvc.repository.course.CourseDao;
import gab.vargas.uabc.oop1.pro7.mvc.repository.course.CourseDaoJaxb;
import gab.vargas.uabc.oop1.pro7.mvc.services.course.CourseServices;

/**
 *
 * @author gvargas
 */
public class CourseShowController implements Controller{

    private CourseServices courseServices = new CourseServices();
    private CourseDao      courseDaoJaxb = new CourseDaoJaxb();

    
    public void processRequest() {
        
        courseServices.printStudent(courseDaoJaxb.getXml());        
    
    }
    
    
    
    
    
}
