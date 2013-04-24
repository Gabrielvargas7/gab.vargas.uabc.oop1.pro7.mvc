/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.controller.studentcourse;

import gab.vargas.uabc.oop1.pro7.mvc.controller.Controller;
import gab.vargas.uabc.oop1.pro7.mvc.repository.course.CourseDao;
import gab.vargas.uabc.oop1.pro7.mvc.repository.course.CourseDaoJaxb;
import gab.vargas.uabc.oop1.pro7.mvc.repository.student.StudentDao;
import gab.vargas.uabc.oop1.pro7.mvc.repository.student.StudentDaoJaxb;
import gab.vargas.uabc.oop1.pro7.mvc.repository.studentcourse.StudentCourseDao;
import gab.vargas.uabc.oop1.pro7.mvc.repository.studentcourse.StudentCourseDaoJaxb;
import gab.vargas.uabc.oop1.pro7.mvc.services.studentcourse.StudentCourseServices;

/**
 *
 * @author gvargas
 */
public class StudentCourseShowController implements Controller{

    private StudentCourseServices studentCourseServices = new StudentCourseServices();
    private StudentCourseDao      studentCourseDaoJaxb = new StudentCourseDaoJaxb();
    
    public void processRequest() {
        
       studentCourseServices.printStudentCourse(studentCourseDaoJaxb.getXml());        
    }
    
    
}
