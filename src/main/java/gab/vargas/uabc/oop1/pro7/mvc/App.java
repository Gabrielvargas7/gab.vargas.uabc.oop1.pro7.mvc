package gab.vargas.uabc.oop1.pro7.mvc;

import gab.vargas.uabc.oop1.pro7.mvc.controller.Controller;
import gab.vargas.uabc.oop1.pro7.mvc.controller.student.StudentAddController;
import gab.vargas.uabc.oop1.pro7.mvc.controller.student.StudentCreateXmlController;
import gab.vargas.uabc.oop1.pro7.mvc.controller.student.StudentDeleteController;
import gab.vargas.uabc.oop1.pro7.mvc.controller.student.StudentShowController;
import gab.vargas.uabc.oop1.pro7.mvc.view.menu.controller.MenuMainController;


import java.util.HashMap;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
        
        MenuMainController menuController = new MenuMainController();
        menuController.processRequest();
        
    }
}
