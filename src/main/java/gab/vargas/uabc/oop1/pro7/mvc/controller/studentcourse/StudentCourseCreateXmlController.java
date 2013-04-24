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
public class StudentCourseCreateXmlController implements Controller{
    
    
    private StudentCourseServices studentCourseServices = new StudentCourseServices();
    private StudentCourseDao      studentCourseDaoJaxb = new StudentCourseDaoJaxb();
    
    
    public void processRequest() {
        
        ArrayList<StudentCourse> studentCourseList = new ArrayList<StudentCourse>();
        // add it to the studentList
        studentCourseList.add(studentCourseServices.getStudentCourseInitialization1());
        studentCourseList.add(studentCourseServices.getStudentCourseInitialization2());
        studentCourseList.add(studentCourseServices.getStudentCourseInitialization3());
        
        createCourseXml(studentCourseList);

        
        
    }
    
    public void createCourseXml(ArrayList<StudentCourse> studentCourseList){
        studentCourseDaoJaxb.createXml(studentCourseList);
    }

    
}
