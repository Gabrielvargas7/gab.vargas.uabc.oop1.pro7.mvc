/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.controller.course;

import gab.vargas.uabc.oop1.pro7.mvc.controller.Controller;
import gab.vargas.uabc.oop1.pro7.mvc.domain.Course;
import gab.vargas.uabc.oop1.pro7.mvc.repository.course.CourseDao;
import gab.vargas.uabc.oop1.pro7.mvc.repository.course.CourseDaoJaxb;
import gab.vargas.uabc.oop1.pro7.mvc.services.course.CourseServices;
import java.util.ArrayList;

/**
 *
 * @author gvargas
 */
public class CourseDeleteController implements Controller{
    
    
    private CourseServices courseServices = new CourseServices();
    private CourseDao      courseDaoJaxb = new CourseDaoJaxb();

    
    public void processRequest() {
        
        ArrayList<Course> courseList = courseDaoJaxb.getXml();
        
        int courseId = courseServices.askCourseId();
        
        // remove the student from the list 
        courseList = courseServices.removeStudent(courseId,courseList);
        
        createCourseXml(courseList);
        
    }
    
    public void createCourseXml(ArrayList<Course> courseList){
        
        courseDaoJaxb.createXml(courseList);
    }

    
}
