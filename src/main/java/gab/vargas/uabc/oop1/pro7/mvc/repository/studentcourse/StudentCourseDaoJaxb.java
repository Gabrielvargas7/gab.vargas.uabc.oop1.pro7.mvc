/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.repository.studentcourse;

import gab.vargas.uabc.oop1.pro7.mvc.domain.StudentCourse;
import gab.vargas.uabc.oop1.pro7.mvc.domain.jaxbhelper.StudentCourseJaxbHelper;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author gvargas
 */
public class StudentCourseDaoJaxb implements StudentCourseDao{

   private static final String STUDENT_COURSE_XML = "./src/main/resources/xml/STUDENT_COURSE-XML.xml";
   private JAXBContext  jaxbContext;
   private StudentCourseJaxbHelper studentCourseJaxbHelper;

    public StudentCourseDaoJaxb() {
        this.studentCourseJaxbHelper = new StudentCourseJaxbHelper();
    }

    
    
    public ArrayList<StudentCourse> getXml() {
        
        ArrayList<StudentCourse> studentCourseList = new ArrayList<StudentCourse>();
       try{
            jaxbContext = JAXBContext.newInstance(StudentCourseJaxbHelper.class);
        
            Unmarshaller um = jaxbContext.createUnmarshaller();
            studentCourseJaxbHelper = (StudentCourseJaxbHelper) um.unmarshal(new FileReader(STUDENT_COURSE_XML));
            studentCourseList = studentCourseJaxbHelper.getStudentCourseList();
        }
        catch (Exception e){
        }
        return studentCourseList;
        
    }

    
    public void createXml(ArrayList<StudentCourse> studentCourseList) {
        
        try{
            studentCourseJaxbHelper.setStudentCourseList(studentCourseList);
            jaxbContext = JAXBContext.newInstance(StudentCourseJaxbHelper.class);
            Marshaller m = jaxbContext.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
           // m.marshal(courseHelper, System.out);
            
            m.marshal(studentCourseJaxbHelper, new File(STUDENT_COURSE_XML));
        }
        catch (Exception e){
        }
        
        
    }
    
    
}
