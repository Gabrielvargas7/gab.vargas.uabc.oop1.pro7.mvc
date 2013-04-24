/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.domain.jaxbhelper;

import gab.vargas.uabc.oop1.pro7.mvc.domain.Course;
import gab.vargas.uabc.oop1.pro7.mvc.domain.Student;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gvargas
 */
@XmlRootElement(namespace = "gab.vargas.uabc.oop1.pro7.mvc.domain.jaxbhelper")
public class CourseJaxbHelper {
    
    private ArrayList<Course> CourseList;

    public CourseJaxbHelper() {
    }

    public ArrayList<Course> getCourseList() {
        return CourseList;
    }

    public void setCourseList(ArrayList<Course> CourseList) {
        this.CourseList = CourseList;
    }
    
    

}
