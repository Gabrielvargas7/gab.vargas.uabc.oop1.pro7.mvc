/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.controller.studentcourse;


import gab.vargas.uabc.oop1.pro7.mvc.controller.Controller;
import gab.vargas.uabc.oop1.pro7.mvc.domain.StudentCourse;
import gab.vargas.uabc.oop1.pro7.mvc.repository.studentcourse.StudentCourseDao;
import gab.vargas.uabc.oop1.pro7.mvc.repository.studentcourse.StudentCourseDaoJaxb;
import gab.vargas.uabc.oop1.pro7.mvc.services.studentcourse.StudentCourseServices;
import java.util.ArrayList;

/**
 *
 * @author gvargas
 */
public class StudentCourseDeleteController implements Controller
{
    
    private StudentCourseServices studentCourseServices = new StudentCourseServices();
    private StudentCourseDao      studentCourseDaoJaxb = new StudentCourseDaoJaxb();
    
    public void processRequest() {
        
        ArrayList<StudentCourse> studentCourseList = studentCourseDaoJaxb.getXml();
        
        int studentId = studentCourseServices.askStudentId();
        
        // remove the student from the list 
        studentCourseList = studentCourseServices.removeStudentCourse(studentId,studentCourseList);
        
        createStudentXml(studentCourseList);
        
    }
    
    public void createStudentXml(ArrayList<StudentCourse> studentCourseList){
        
        studentCourseDaoJaxb.createXml(studentCourseList);
    }
    
    
}
