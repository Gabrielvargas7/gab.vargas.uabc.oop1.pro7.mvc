/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.domain.jaxbhelper;

import gab.vargas.uabc.oop1.pro7.mvc.domain.Student;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gvargas
 */
@XmlRootElement(namespace = "gab.vargas.uabc.oop1.pro7.mvc.domain.jaxbhelper")
public class StudentJaxbHelper {
    
    
    private ArrayList<Student> studentList;

    public StudentJaxbHelper() {
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    

    
    
    
    
}
