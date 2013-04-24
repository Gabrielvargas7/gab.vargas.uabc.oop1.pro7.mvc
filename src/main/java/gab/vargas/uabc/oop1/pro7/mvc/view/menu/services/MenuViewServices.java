/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.view.menu.services;

import java.util.Scanner;

/**
 *
 * @author gvargas
 */
public class MenuViewServices {
    
    public static String getValueMainMenu(){
        
        System.out.println("**************************"); 
        System.out.println("0.- Exit "); 
        System.out.println("1.- Student "); 
        System.out.println("2.- Teacher ");
        System.out.println("3.- Course  ");
        System.out.println("4.- Manage Course ");
        System.out.println("5.- Administration ");
        System.out.println("**************************"); 
        
        Scanner scan = new Scanner(System.in); 
        String menuValue = scan.nextLine(); 
        
        return menuValue;
    }
    
    
    public static String getValueAdminMenu(){
        
        System.out.println("**************************"); 
        System.out.println("0.- Exit "); 
        System.out.println("1.- Recreate XML with Default data"); 
        System.out.println("**************************"); 
        
        Scanner scan = new Scanner(System.in); 
        String menuValue = scan.nextLine(); 
        
        return menuValue;
    }

    
    
    public static String getValueProcessCourseMenu(){
        System.out.println("********* "); 
        System.out.println("**************************"); 
        System.out.println("0.- Exit "); 
        System.out.println("1.- Show all the Student of a Course" );
        System.out.println("2.- Add a Student to a Course" );
        System.out.println("3.- Delete a Student front Course " );
        
        System.out.println("**************************"); 
        Scanner scan = new Scanner(System.in); 
        String menuValue = scan.nextLine(); 
        
        return menuValue;
    }

    
   public static String getValueProcessAccountMenu(String type){
        System.out.println("***********"+type); 
        System.out.println("0.- Exit "); 
        System.out.println("1.- Show All "+type); 
        System.out.println("2.- Add New "+type);
        System.out.println("3.- Delete "+type);        
        System.out.println("**************************"); 
        Scanner scan = new Scanner(System.in); 
        String menuValue = scan.nextLine(); 
        
        return menuValue;
    }

    
}
