/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.repository.student;

import gab.vargas.uabc.oop1.pro7.mvc.domain.Student;
import java.util.ArrayList;

/**
 *
 * @author gvargas
 */
public interface StudentDao {
        
    public void createXml(ArrayList<Student> studentList);
    public ArrayList<Student> getXml();
    
}
