/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.controller.studentcourse;

import gab.vargas.uabc.oop1.pro7.mvc.controller.Controller;
import gab.vargas.uabc.oop1.pro7.mvc.domain.Student;
import gab.vargas.uabc.oop1.pro7.mvc.domain.StudentCourse;
import gab.vargas.uabc.oop1.pro7.mvc.repository.studentcourse.StudentCourseDao;
import gab.vargas.uabc.oop1.pro7.mvc.repository.studentcourse.StudentCourseDaoJaxb;
import gab.vargas.uabc.oop1.pro7.mvc.services.studentcourse.StudentCourseServices;
import java.util.ArrayList;

/**
 *
 * @author gvargas
 */
public class StudentCourseAddController implements Controller{
    
    private StudentCourseServices studentCourseServices = new StudentCourseServices();
    private StudentCourseDao      studentCourseDaoJaxb = new StudentCourseDaoJaxb();
    
    
    public void processRequest() {
        
         StudentCourse studentCourse = studentCourseServices.askStudentInfo(); 
         this.insertStudentInfo(studentCourse);
    }

    
    private void insertStudentInfo(StudentCourse studentCourse){
        
        ArrayList<StudentCourse> studentCourseList;
        // get the xml file 
        studentCourseList = studentCourseDaoJaxb.getXml();        
        //insert the new student 
        studentCourseList.add(studentCourse);
        // create the new xml with the new student 
        studentCourseDaoJaxb.createXml(studentCourseList);

        
    }
    
    
}
