/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */import java.util.*;
public class men {
    Scanner input = new Scanner(System.in);
    public void men2(){
        Menu men = new Menu();
    System.out.print("Name :");
        String name = input.nextLine();
        System.out.println("==================================================");
        System.out.println("||Use Capital Letter or Small Letter||");
        System.out.println("==================================================");
        
    name();
    }


public void name(){
     Menu men = new Menu();
System.out.print("\nWant to proceed (Y/y || N/n) :");
        String answer = input.next();
        
        if("Y".equals(answer) || "y".equals(answer))
        {
            men.menu();
        }
        else if("N".equals(answer) || "n".equals(answer)) {
            
            System.exit(0);}
        else 
            System.out.println("Invalid input");
        name();
}
}