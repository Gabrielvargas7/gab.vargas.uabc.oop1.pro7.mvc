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
public class CourseAddController implements Controller{
    
    
    private CourseServices courseServices = new CourseServices();
    private CourseDao      courseDaoJaxb = new CourseDaoJaxb();

    
    public void processRequest() {
        
         Course course = courseServices.askCourseInfo(); 
         this.insertCourseInfo(course);
    }

    
    private void insertCourseInfo(Course course){
        
        ArrayList<Course> courseList;
        // get the xml file 
        courseList = courseDaoJaxb.getXml();        
        //insert the new student 
        courseList.add(course);
        // create the new xml with the new student 
        courseDaoJaxb.createXml(courseList);

        
    }
}
