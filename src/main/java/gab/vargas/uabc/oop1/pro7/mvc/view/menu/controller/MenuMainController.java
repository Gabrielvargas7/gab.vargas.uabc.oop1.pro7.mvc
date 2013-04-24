/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.view.menu.controller;


import gab.vargas.uabc.oop1.pro7.mvc.controller.Controller;
import gab.vargas.uabc.oop1.pro7.mvc.controller.course.CourseAddController;
import gab.vargas.uabc.oop1.pro7.mvc.controller.course.CourseCreateXmlController;
import gab.vargas.uabc.oop1.pro7.mvc.controller.course.CourseDeleteController;
import gab.vargas.uabc.oop1.pro7.mvc.controller.course.CourseShowController;
import gab.vargas.uabc.oop1.pro7.mvc.controller.student.StudentAddController;
import gab.vargas.uabc.oop1.pro7.mvc.controller.student.StudentCreateXmlController;
import gab.vargas.uabc.oop1.pro7.mvc.controller.student.StudentDeleteController;
import gab.vargas.uabc.oop1.pro7.mvc.controller.student.StudentShowController;
import gab.vargas.uabc.oop1.pro7.mvc.controller.studentcourse.StudentCourseAddController;
import gab.vargas.uabc.oop1.pro7.mvc.controller.studentcourse.StudentCourseCreateXmlController;
import gab.vargas.uabc.oop1.pro7.mvc.controller.studentcourse.StudentCourseDeleteController;
import gab.vargas.uabc.oop1.pro7.mvc.controller.studentcourse.StudentCourseShowController;
import gab.vargas.uabc.oop1.pro7.mvc.view.menu.services.MenuVariablesServices;
import gab.vargas.uabc.oop1.pro7.mvc.view.menu.services.MenuViewServices;

import java.util.HashMap;

/**
 *
 * @author gvargas
 */
public class MenuMainController extends MenuVariablesServices{
    

    public void processRequest() {
        
        
        HashMap<String,String> map = new HashMap<String,String>();
        String mainMenu;
        String accountMenu;
        String processCourseMenu;
        String adminMenu;
        

        do{
            mainMenu = MenuViewServices.getValueMainMenu();
            accountMenu = String.valueOf(VALUE_EXIT);
            processCourseMenu = String.valueOf(VALUE_EXIT);
            adminMenu = String.valueOf(VALUE_EXIT);
            
            
            int intMainMenu  = Integer.parseInt(mainMenu);
            
            map.put(MAIN_MENU, mainMenu);  
            
            switch (intMainMenu) {
                case VALUE_STUDENT: accountMenu = MenuViewServices.getValueProcessAccountMenu(STUDENT);
                        map.put(ACCOUNT_MENU,accountMenu);  
                        AccountTask(map);
                        break;
                case VALUE_TEACHER: accountMenu = MenuViewServices.getValueProcessAccountMenu(TEACHER);
                        map.put(ACCOUNT_MENU,accountMenu);  
                        AccountTask(map);
                        break;
                case VALUE_COURSE: accountMenu = MenuViewServices.getValueProcessAccountMenu(COURSE);
                        map.put(ACCOUNT_MENU,accountMenu);  
                        AccountTask(map);
                        break;
                case VALUE_PROCESS_COURSE: processCourseMenu = MenuViewServices.getValueProcessCourseMenu();
                        map.put(PROCESS_COURSE_MENU,processCourseMenu);  
                        ProcessCourseTask(map);
                        break;
                case VALUE_ADMINISTRATION: adminMenu = MenuViewServices.getValueAdminMenu();
                        map.put(ADMIN_MENU,adminMenu);  
                        AdminTask(map);
                        break;        
            }
             map.clear();
            if (mainMenu.equals(String.valueOf(VALUE_EXIT))) 
            break;        
                    
        }while(true);        
        
    }
    
    
    private static void AdminTask(HashMap<String,String> task){
        
        
            int intTask  = Integer.parseInt(task.get(ADMIN_MENU));
            
            switch (intTask) {
                case VALUE_DEFAULT_DATA : // Create Student XML File
                                          Controller studentCreateXmlController = new StudentCreateXmlController();
                                          studentCreateXmlController.processRequest();
                                          // Create Course XML File
                                          Controller courseCreateXmlController = new CourseCreateXmlController();
                                          courseCreateXmlController.processRequest();
                                          // Create StudentCourse XML File
                                          Controller studentCourseCreateXmlController = new StudentCourseCreateXmlController();
                                          studentCourseCreateXmlController.processRequest();
                                          
                                          break;
            }
    }
    
    
    private static void AccountTask(HashMap<String,String> task){
        
        
            int intMainMenuTask     = Integer.parseInt(task.get(MAIN_MENU));
            int intAccountMenuTask  = Integer.parseInt(task.get(ACCOUNT_MENU));
            
            //Student 
            if (intMainMenuTask == VALUE_STUDENT){
            
                switch (intAccountMenuTask) {
                    
                    // add new student to the xml file 
                    case VALUE_ADD:     Controller studentAddController = new StudentAddController();
                                        studentAddController.processRequest();
                                        break;
                    // show all the student on    
                    case VALUE_SHOW:    Controller studentShowController = new StudentShowController();
                                        studentShowController.processRequest(); 
                                        break;
                    case VALUE_DELETE:  Controller studentDeleteController = new StudentDeleteController();
                                        studentDeleteController.processRequest(); 
                                        break;
                }
            }
            
            // Course 
            if (intMainMenuTask == VALUE_COURSE){
            
                switch (intAccountMenuTask) {
                    
                    // add new course to the xml file 
                    case VALUE_ADD:    Controller courseAddController = new CourseAddController();
                                        courseAddController.processRequest();
                                        break;
                    // show all the course on    
                    case VALUE_SHOW:    Controller courseShowController = new CourseShowController();
                                        courseShowController.processRequest(); 
                                        break;
                    case VALUE_DELETE:  Controller courseDeleteController = new CourseDeleteController();
                                        courseDeleteController.processRequest(); 
                                        break;
                }
            }
            
    }
    
    
    private static void ProcessCourseTask(HashMap<String,String> task){
        
        
            int intMainMenuTask     = Integer.parseInt(task.get(MAIN_MENU));
            int intProcessCourseMenuTask  = Integer.parseInt(task.get(PROCESS_COURSE_MENU));
            
            //Process Student to a course
            if (intMainMenuTask == VALUE_PROCESS_COURSE){
            
                switch (intProcessCourseMenuTask) {
                    
                    // add a student to the course
                    case VALUE_ADD:     Controller studentCourseAddController = new StudentCourseAddController();
                                        studentCourseAddController.processRequest();
                                        break;
                    // show all the student of the course
                    case VALUE_SHOW:    Controller studentCourseShowController = new StudentCourseShowController();
                                        studentCourseShowController.processRequest(); 
                                        break;
                     // delete a student front a course   
                    case VALUE_DELETE:  Controller studentCourseDeleteController = new StudentCourseDeleteController();
                                        studentCourseDeleteController.processRequest(); 
                                        break;
                }
            }
    }
    
    
}
