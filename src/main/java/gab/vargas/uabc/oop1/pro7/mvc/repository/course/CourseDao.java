/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.repository.course;


import gab.vargas.uabc.oop1.pro7.mvc.domain.Course;
import java.util.ArrayList;

/**
 *
 * @author gvargas
 */
public interface CourseDao {
    
    public void createXml(ArrayList<Course> courseList);
    public ArrayList<Course> getXml();
    
}
