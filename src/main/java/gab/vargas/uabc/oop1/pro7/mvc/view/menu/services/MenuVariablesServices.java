/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.view.menu.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gvargas
 */
public abstract class MenuVariablesServices {
    
    
    public final static String MAIN_MENU = "mainMenu";
    public final static String ACCOUNT_MENU = "accountMenu";
    public final static String STUDENT = "Student";
    public final static String TEACHER = "Teacher";
    public final static String COURSE = "Course";
    public final static String PROCESS_COURSE_MENU = "processCourseMenu";
    public final static String ADMIN_MENU = "adminMenu";
    
    //Main Menu Values 
    public final static int VALUE_EXIT = 0;
    public final static int VALUE_STUDENT = 1;
    public final static int VALUE_TEACHER = 2;
    public final static int VALUE_COURSE = 3;
    public final static int VALUE_PROCESS_COURSE= 4;
    public final static int VALUE_ADMINISTRATION= 5;
    
    // Account Menu Values 
    public final static int VALUE_SHOW = 1;
    public final static int VALUE_ADD = 2;
    public final static int VALUE_DELETE = 3;
    
    // Admin Menu Values 
    
    public final static int VALUE_DEFAULT_DATA = 1;
    
}
