/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.repository.student;


import gab.vargas.uabc.oop1.pro7.mvc.domain.Student;
import gab.vargas.uabc.oop1.pro7.mvc.domain.jaxbhelper.StudentJaxbHelper;
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
public class StudentDaoJaxb implements StudentDao{

    
   private static final String STUDENT_XML = "./src/main/resources/xml/STUDENT-XML.xml";
   private JAXBContext  jaxbContext;
   private StudentJaxbHelper studentJaxbHelper;

   
    public StudentDaoJaxb() {
        this.studentJaxbHelper = new StudentJaxbHelper();
    }
   

    @Override
    public void createXml(ArrayList<Student> studentList) {
                
        try{
            studentJaxbHelper.setStudentList(studentList );
            jaxbContext = JAXBContext.newInstance(StudentJaxbHelper.class);
            Marshaller m = jaxbContext.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
           // m.marshal(courseHelper, System.out);
            
            m.marshal(studentJaxbHelper, new File(STUDENT_XML));
        }
        catch (Exception e){
        }
        
    }
   
    
    
    
    @Override
    public ArrayList<Student> getXml() {
        
       ArrayList<Student> studentList = new ArrayList<Student>();
       try{
            jaxbContext = JAXBContext.newInstance(StudentJaxbHelper.class);
        
            Unmarshaller um = jaxbContext.createUnmarshaller();
            studentJaxbHelper = (StudentJaxbHelper) um.unmarshal(new FileReader(STUDENT_XML));
            studentList = studentJaxbHelper.getStudentList();
        }
        catch (Exception e){
        }
        return studentList;
    }

  
    

    
    
}
