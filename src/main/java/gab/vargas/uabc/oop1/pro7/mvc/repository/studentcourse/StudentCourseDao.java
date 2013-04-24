/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.repository.studentcourse;

import gab.vargas.uabc.oop1.pro7.mvc.domain.StudentCourse;
import java.util.ArrayList;

/**
 *
 * @author gvargas
 */
public interface StudentCourseDao {
    
    public void createXml(ArrayList<StudentCourse> studentCourseList);
    public ArrayList<StudentCourse> getXml();
    
}
