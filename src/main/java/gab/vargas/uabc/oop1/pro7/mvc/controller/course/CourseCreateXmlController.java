/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.controller.course;

import gab.vargas.uabc.oop1.pro7.mvc.controller.Controller;
import gab.vargas.uabc.oop1.pro7.mvc.domain.Course;
import gab.vargas.uabc.oop1.pro7.mvc.domain.Student;
import gab.vargas.uabc.oop1.pro7.mvc.repository.course.CourseDao;
import gab.vargas.uabc.oop1.pro7.mvc.repository.course.CourseDaoJaxb;
import gab.vargas.uabc.oop1.pro7.mvc.repository.student.StudentDao;
import gab.vargas.uabc.oop1.pro7.mvc.repository.student.StudentDaoJaxb;
import gab.vargas.uabc.oop1.pro7.mvc.services.course.CourseServices;
import gab.vargas.uabc.oop1.pro7.mvc.services.student.StudentServices;
import java.util.ArrayList;

/**
 *
 * @author gvargas
 */
public class CourseCreateXmlController implements Controller{

    private CourseServices courseServices = new CourseServices();
    private CourseDao      courseDaoJaxb = new CourseDaoJaxb();
    
    
    public void processRequest() {
        
        ArrayList<Course> courseList = new ArrayList<Course>();
        // add it to the studentList
        courseList.add(courseServices.getCourseInitialization1());
        courseList.add(courseServices.getCourseInitialization2());
        
        createCourseXml(courseList);

        
        
    }
    
    public void createCourseXml(ArrayList<Course> courseList){
        courseDaoJaxb.createXml(courseList);
    }
    
    
    
}
