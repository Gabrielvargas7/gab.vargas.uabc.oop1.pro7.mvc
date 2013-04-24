/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.domain.jaxbhelper;

import gab.vargas.uabc.oop1.pro7.mvc.domain.Student;
import gab.vargas.uabc.oop1.pro7.mvc.domain.StudentCourse;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gvargas
 */
@XmlRootElement(namespace = "gab.vargas.uabc.oop1.pro7.mvc.domain.jaxbhelper")
public class StudentCourseJaxbHelper {
    
    private ArrayList<StudentCourse> studentCourseList;

    public StudentCourseJaxbHelper() {
    }

    public ArrayList<StudentCourse> getStudentCourseList() {
        return studentCourseList;
    }

    public void setStudentCourseList(ArrayList<StudentCourse> studentCourseList) {
        this.studentCourseList = studentCourseList;
    }
    
    
}
