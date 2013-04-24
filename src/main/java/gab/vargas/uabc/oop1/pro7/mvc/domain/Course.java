/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.domain;

/**
 *
 * @author gvargas
 */
public class Course {
    
    private int courseId;
    private String courseName;
    private String courseCode;
    private int courseNumberUnits;
    private Double coursePrice;
    private int courseMaxStudentsNumber;
    

    public Course() {
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getCourseMaxStudentsNumber() {
        return courseMaxStudentsNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseNumberUnits() {
        return courseNumberUnits;
    }

    public Double getCoursePrice() {
        return coursePrice;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseMaxStudentsNumber(int courseMaxStudentsNumber) {
        this.courseMaxStudentsNumber = courseMaxStudentsNumber;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseNumberUnits(int courseNumberUnits) {
        this.courseNumberUnits = courseNumberUnits;
    }

    public void setCoursePrice(Double coursePrice) {
        this.coursePrice = coursePrice;
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", courseName=" + courseName + ", courseCode=" + courseCode + ", courseNumberUnits=" + courseNumberUnits + ", coursePrice=" + coursePrice + ", courseMaxStudentsNumber=" + courseMaxStudentsNumber + '}';
    }
    
    
    

    
}
