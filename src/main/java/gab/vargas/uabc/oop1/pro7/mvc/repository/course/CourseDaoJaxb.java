/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.repository.course;

import gab.vargas.uabc.oop1.pro7.mvc.domain.Course;
import gab.vargas.uabc.oop1.pro7.mvc.domain.jaxbhelper.CourseJaxbHelper;
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
public class CourseDaoJaxb implements CourseDao{

   private static final String COURSE_XML = "./src/main/resources/xml/COURSE-XML.xml";
   private JAXBContext  jaxbContext;
   private CourseJaxbHelper courseJaxbHelper;

   
    public CourseDaoJaxb() {
        this.courseJaxbHelper = new CourseJaxbHelper();
    }
   

    @Override
    public void createXml(ArrayList<Course> courseList) {
                
        try{
            courseJaxbHelper.setCourseList(courseList);
            jaxbContext = JAXBContext.newInstance(CourseJaxbHelper.class);
            Marshaller m = jaxbContext.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
           // m.marshal(courseHelper, System.out);
            
            m.marshal(courseJaxbHelper, new File(COURSE_XML));
        }
        catch (Exception e){
        }
        
    }
   
    
    
    
    @Override
    public ArrayList<Course> getXml() {
        
       ArrayList<Course> courseList = new ArrayList<Course>();
       try{
            jaxbContext = JAXBContext.newInstance(CourseJaxbHelper.class);
        
            Unmarshaller um = jaxbContext.createUnmarshaller();
            courseJaxbHelper = (CourseJaxbHelper) um.unmarshal(new FileReader(COURSE_XML));
            courseList = courseJaxbHelper.getCourseList();
        }
        catch (Exception e){
        }
        return courseList;
    }


}
