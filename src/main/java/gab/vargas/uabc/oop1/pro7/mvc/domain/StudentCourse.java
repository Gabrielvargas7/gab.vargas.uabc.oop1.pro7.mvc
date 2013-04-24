/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.domain;

/**
 *
 * @author gvargas
 */
public class StudentCourse {
    
    private int courseId;
    private int studentId;

    public StudentCourse() {
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "StudentCourse{" + "courseId=" + courseId + ", studentId=" + studentId + '}';
    }
    
    
    
    
    
}
