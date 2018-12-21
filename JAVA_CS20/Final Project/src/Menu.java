/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
import java.util.*;
public class Menu {
    
    Scanner input = new Scanner(System.in);
    public void menu(){
        First fir = new First();
        Second sec = new Second();
        Third thi = new Third();
        Fourth four = new Fourth();
        System.out.println("_________________________");
        System.out.println("|       Main Menu         |");
        System.out.println("|(F/f).First Year Student |");
        System.out.println("|(S/s).Second Year Student|");
        System.out.println("|(T/t).Third Year Student |");
        System.out.println("|(U/u).Fourth Year Student|");
        System.out.println("|(E/e).EXIT               |");
        System.out.print("\nWhat Year Level are you :");
        String choice = input.next();
        
        
            if("F".equals(choice) || "f".equals(choice)){fir.Fmenu(); }
            else if("S".equals(choice) || "s".equals(choice)){sec.Smenu(); }
            else if("T".equals(choice) || "t".equals(choice)){thi.Tmenu();}
            else if("U".equals(choice) || "u".equals(choice)){four.Umenu();}
            else if("E".equals(choice) || "e".equals(choice)){ System.exit(0); }
            else System.out.print("\nInvalid Input\n"); menu();
}}
