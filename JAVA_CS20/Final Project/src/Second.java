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
public class Second {
    Menu menu = new Menu();
    Scanner input = new Scanner(System.in);
    public static int totals = 0,toal = 0,toals = 0,total =0,t = 0,o = 0,sub1, sub2,sub3,sub4,sub5,sub6,sub7;
    public static double grade1=0, grade2=0, grade3=0, grade4 =0,grade5 =0,grade6=0,grade7=0;
    public static double health= 0, nurse =0 ,human =0,philo = 0 , logic =0 ,english = 0;
    public static double care = 0,chem2 = 0,bio2 = 0,math = 0,chem1 = 0,bio1 = 0,eng1 = 0,pe3 = 0;
    public static String [] subject = new String[5000];
    public static String [] subjects = new String[5000];
    
    
    //LIST OF SUBJECTS
    public void Sarray(){
        subject[1266] = "  1266          NCM101N                  Care of Mother,Child & Family(RLE-204hrs)                4     0     1    3         8            HA,NCM100M,BIO1";
        subject[1267] = "  1267          CHN                      Community Health Nursing                                 3     0   0.5   1.5        5            HA,NCM100M,BIO1";
        subject[1005] = "  1005          BIO2                     Microbiology & Parasitologu                              3     2     0    0         5            BIO1";
        subject[1025] = "  1025          ENG2                     Writing in the Discipline                                3     0     0    0         3            ENG1";
        subject[2007] = "  2007          HS1                      Biothics                                                 3     0     0    0         3            PHILO1,HUM1";
        subject[2015] = "  2015          PE3                      Individual & Dual Sports                                 0     2     0    0         2            NONE";
        subject[1063] = "  1063          SOCSC4                   Intro to Economics w/ Taxation & Agrarian Ref.           3     0     0    0         3            NONE";
    
        subjects[1268] = " 1268          NCM102N      Care of Mother,Child & Family&Population Group at rick or w/Problems  5     0    1    5         11          NCM101N";
        subjects[1959] = " 1959          NUDIET                   Nutrition & Diet Theraphy                                 3     1    0    0         4           CHEM2,BIO2";
        subjects[1068] = " 1068          PHARMA1                  Pharmacology                                              3     0    0    0         3           MATH1,CHEM1,BIO1";
        subjects[1442] = " 1442          ENG3                     Speech and Oral Communication                             3     0    0    0         3           ENG1";
        subjects[1051] = " 1051          PE4                      Team Sports                                               0     2    0    0         2           PE3";
        subjects[1449] = " 1449          PHYS1                    College Physics 1                                         3     3    0    0         4           MATH1";
    
        subject[1269] = "   1269          INFO                         Informatics                                         2     1    0     0         3          MATH1";
        subject[1270] = "   1270          BIOSTAT                      Biostatistics                                       3     0    0     0         3          MATH1";
        subject[2085] = "   2085          HEALTHED                     Health Education                                    3     0    0     0         3          NONE";
    }
    
    //SECOND YEAR MENU
    public void Smenu(){
        System.out.println("\nSecond Year Student\n");
        System.out.print("(A/a)First Semester\n(B/b)Second Semester\n(C/c)Summer\n(D/d)Main Menu\n(E/e)Exit\nEnter your choice :");
        String choice = input.next();
        
             if("A".equals(choice) || "a".equals(choice)){Ssem1();}
        else if("B".equals(choice) || "b".equals(choice)){Ssem2();}
        else if("C".equals(choice) || "c".equals(choice)){Ssummer();}
        else if("D".equals(choice) || "d".equals(choice)){menu.menu();}
        else if("E".equals(choice) || "e".equals(choice)){System.exit(0);}
        else System.out.print("\nInvalid Input\n");Smenu();
    }
    
    //SECOND YEAR , FIRST SEMESTER
    public void Ssem1(){
        Sarray();
        System.out.println("=================================================================================================================================================");
        //Prerequisite subjects
        System.out.println("\nEnter your Grades for this Subjects :");
        System.out.print("Health Assessment :");
        health = input.nextDouble();
        System.out.print("Fundamentals of Nursing Practice :");
        nurse = input.nextDouble();
        System.out.print("Human Anatomy & Physiology :");
        human = input.nextDouble();
        System.out.print("Philosopy of Man :");
        philo = input.nextDouble();
        System.out.print("Philosophy & Logic :");
        logic = input.nextDouble();
        System.out.print("Study & Thinking Skills in English : ");
        english = input.nextDouble();
        
         System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
         System.out.print(" SECOND YEAR,FIRST SEMESTER\n");
         if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[1266]);totals+=8;}else System.out.print("");
        if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[1267]);totals+=5;}else System.out.print("");
        if(human >=1.0 && human <=3.5){System.out.println(subject[1005]);totals+=5;}else System.out.print("");
        if(english >=1.0 && english <=3.5){System.out.println(subject[1025]);totals+=3;}else System.out.print("");
        if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[2007]);totals+=3;}else System.out.print("");
         System.out.println(subject[2015]);totals+=2;
         System.out.println(subject[1063]);totals+=3;
         System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+totals+"\n");
         System.out.println("=================================================================================================================================================");
         System.out.println("Entered Range 2-7");
         int sub;
             for(int i = 1;i<=1;i++){
             System.out.print("Enter Subject Needed :");
             sub = input.nextInt();
             if(sub == 7){S7();}
             else if(sub == 6){S6();}
             else if(sub == 5){S5();}
             else if(sub == 4){S4();}
             else if(sub == 3){S3();}
             else if(sub == 2){S2();}
             else 
                 i-=1;System.out.println("INVALID INPUT");
             }
    }
    
    //NUMBERS OF SUBJECT ENTERED FOR FIRST SEMESTER
    public void S7(){
            System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1266 || sub1 == 1267 || sub1 == 1005 || sub1 == 1025 || sub1 == 2007 || sub1 == 2015 || sub1 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1266 || sub2 == 1267 || sub2 == 1005 || sub2 == 1025 || sub2 == 2007 || sub2 == 2015 || sub2 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1266 || sub3 == 1267 || sub3 == 1005 || sub3 == 1025 || sub3 == 2007 || sub3 == 2015 || sub3 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 1266 || sub4 == 1267 || sub4 == 1005 || sub4 == 1025 || sub4 == 2007 || sub4 == 2015 || sub4 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("5.Enter Offercode :");
             sub5 = input.nextInt();
             if(sub5 == 1266 || sub5 == 1267 || sub5 == 1005 || sub5 == 1025 || sub5 == 2007 || sub5 == 2015 || sub5 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("6.Enter Offercode :");
             sub6 = input.nextInt();
             if(sub6 == 1266 || sub6 == 1267 || sub6 == 1005 || sub6 == 1025 || sub6 == 2007 || sub6 == 2015 || sub6 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("7.Enter Offercode :");
             sub7 = input.nextInt();
             if(sub7 == 1266 || sub7 == 1267 || sub7 == 1005 || sub7 == 1025 || sub7 == 2007 || sub7 == 2015 || sub7 == 1063);
             else i-=1;
             }
             System.out.println("=================================================================================================================================================");
             //List of Subjects Entered
             
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" SECOND YEAR,SECOND SEMESTER\n");
             if(sub1 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=8;}else System.out.print("");}
             else if(sub1 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=5;}else System.out.print("");}
             else if(sub1 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=5;}else System.out.print("");}
             else if(sub1 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub1]);toal+=3;}else System.out.print("");}
             else if(sub1 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub1]);toal+=3;}else System.out.print("");}
             else if(sub1 == 2015){System.out.println(subject[sub1]);toal+=2;}
             else if(sub1 == 1063){System.out.println(subject[sub1]);toal+=3;}
             
             if(sub2 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=8;}else System.out.print("");}
             else if(sub2 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=5;}else System.out.print("");}
             else if(sub2 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=5;}else System.out.print("");}
             else if(sub2 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub2]);toal+=3;}else System.out.print("");}
             else if(sub2 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub2]);toal+=3;}else System.out.print("");}
             else if(sub2 == 2015){System.out.println(subject[sub2]);toal+=2;}
             else if(sub2 == 1063){System.out.println(subject[sub2]);toal+=3;}
             
             if(sub3 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub3]);toal+=8;}else System.out.print("");}
             else if(sub3 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub3]);toal+=5;}else System.out.print("");}
             else if(sub3 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub3]);toal+=5;}else System.out.print("");}
             else if(sub3 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub3]);toal+=3;}else System.out.print("");}
             else if(sub3 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub3]);toal+=3;}else System.out.print("");}
             else if(sub3 == 2015){System.out.println(subject[sub3]);toal+=2;}
             else if(sub3 == 1063){System.out.println(subject[sub3]);toal+=3;}
             
             if(sub4 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub4]);toal+=8;}else System.out.print("");}
             else if(sub4 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub4]);toal+=5;}else System.out.print("");}
             else if(sub4 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub4]);toal+=5;}else System.out.print("");}
             else if(sub4 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub4]);toal+=3;}else System.out.print("");}
             else if(sub4 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub4]);toal+=3;}else System.out.print("");}
             else if(sub4 == 2015){System.out.println(subject[sub4]);toal+=2;}
             else if(sub4 == 1063){System.out.println(subject[sub4]);toal+=3;}
             
             if(sub5 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub5]);toal+=8;}else System.out.print("");}
             else if(sub5 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub5]);toal+=5;}else System.out.print("");}
             else if(sub5 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub5]);toal+=5;}else System.out.print("");}
             else if(sub5 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub5]);toal+=3;}else System.out.print("");}
             else if(sub5 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub5]);toal+=3;}else System.out.print("");}
             else if(sub5 == 2015){System.out.println(subject[sub5]);toal+=2;}
             else if(sub5 == 1063){System.out.println(subject[sub5]);toal+=3;}
             
             if(sub6 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub6]);toal+=8;}else System.out.print("");}
             else if(sub6 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub6]);toal+=5;}else System.out.print("");}
             else if(sub6 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub6]);toal+=5;}else System.out.print("");}
             else if(sub6 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub6]);toal+=3;}else System.out.print("");}
             else if(sub6 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub6]);toal+=3;}else System.out.print("");}
             else if(sub6 == 2015){System.out.println(subject[sub6]);toal+=2;}
             else if(sub6 == 1063){System.out.println(subject[sub6]);toal+=3;}
             
             if(sub7 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub7]);toal+=8;}else System.out.print("");}
             else if(sub7 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub7]);toal+=5;}else System.out.print("");}
             else if(sub7 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub7]);toal+=5;}else System.out.print("");}
             else if(sub7 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub7]);toal+=3;}else System.out.print("");}
             else if(sub7 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub7]);toal+=3;}else System.out.print("");}
             else if(sub7 == 2015){System.out.println(subject[sub7]);toal+=2;}
             else if(sub7 == 1063){System.out.println(subject[sub7]);toal+=3;}
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     "+toal+"\n");
             System.out.println("=================================================================================================================================================\n");
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){
             System.out.print(subject[sub1]+" :");
             grade1 = input.nextDouble();
             System.out.print(subject[sub2]+" :");
             grade2 = input.nextDouble();
             System.out.print(subject[sub3]+" :");
             grade3 = input.nextDouble();
             System.out.print(subject[sub4]+" :");
             grade4 = input.nextDouble();
             System.out.print(subject[sub5]+" :");
             grade5 = input.nextDouble();
             System.out.print(subject[sub6]+" :");
             grade6 = input.nextDouble();     
             System.out.print(subject[sub7]+" :");
             grade7 = input.nextDouble();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nSee the Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {
               if(grade1 >=1.0 && grade1 <=3.5)System.out.println(subject[sub1]+" : Passed");
                                  else         System.out.println(subject[sub1]+" : Failed");
                 
               if(grade2 >=1.0 && grade2<=3.5) System.out.println(subject[sub2]+" : Passed");
                                  else         System.out.println(subject[sub2]+" : Failed");
                
               if(grade3 >=1.0 && grade3 <=3.5)System.out.println(subject[sub3]+" : Passed");
                                  else         System.out.println(subject[sub3]+" : Failed");

               if(grade4 >=1.0 && grade4 <=3.5)System.out.println(subject[sub4]+" : Passed");
                                  else         System.out.println(subject[sub4]+" : Failed");
                 
               if(grade5 >=1.0 && grade5 <=3.5)System.out.println(subject[sub5]+" : Passed");
                                  else         System.out.println(subject[sub5]+" : Failed");
                 
               if(grade6 >=1.0 && grade6 <=3.5)System.out.println(subject[sub6]+" : Passed");
                                  else         System.out.println(subject[sub6]+" : Failed");
        
               if(grade7 >=1.0 && grade7 <=3.5)System.out.println(subject[sub7]+" : Passed");
                                  else         System.out.println(subject[sub7]+" : Failed");
               System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to Second Year Second Semester (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    Ssem2();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    menu.menu();
                }
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);
             System.out.println("=================================================================================================================================================");}
else Smenu();}else Smenu();}
    public void S6(){
             //OfferCode Area
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1266 || sub1 == 1267 || sub1 == 1005 || sub1 == 1025 || sub1 == 2007 || sub1 == 2015 || sub1 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1266 || sub2 == 1267 || sub2 == 1005 || sub2 == 1025 || sub2 == 2007 || sub2 == 2015 || sub2 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1266 || sub3 == 1267 || sub3 == 1005 || sub3 == 1025 || sub3 == 2007 || sub3 == 2015 || sub3 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 1266 || sub4 == 1267 || sub4 == 1005 || sub4 == 1025 || sub4 == 2007 || sub4 == 2015 || sub4 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("5.Enter Offercode :");
             sub5 = input.nextInt();
             if(sub5 == 1266 || sub5 == 1267 || sub5 == 1005 || sub5 == 1025 || sub5 == 2007 || sub5 == 2015 || sub5 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("6.Enter Offercode :");
             sub6 = input.nextInt();
             if(sub6 == 1266 || sub6 == 1267 || sub6 == 1005 || sub6 == 1025 || sub6 == 2007 || sub6 == 2015 || sub6 == 1063);
             else i-=1;
             }
             
             //List of Subjects Entered
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" SECOND YEAR,SECOND SEMESTER\n");
             if(sub1 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=8;}else System.out.print("");}
             else if(sub1 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=5;}else System.out.print("");}
             else if(sub1 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=5;}else System.out.print("");}
             else if(sub1 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub1]);toal+=3;}else System.out.print("");}
             else if(sub1 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub1]);toal+=3;}else System.out.print("");}
             else if(sub1 == 2015){System.out.println(subject[sub1]);toal+=2;}
             else if(sub1 == 1063){System.out.println(subject[sub1]);toal+=3;}
             
             if(sub2 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=8;}else System.out.print("");}
             else if(sub2 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=5;}else System.out.print("");}
             else if(sub2 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=5;}else System.out.print("");}
             else if(sub2 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub2]);toal+=3;}else System.out.print("");}
             else if(sub2 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub2]);toal+=3;}else System.out.print("");}
             else if(sub2 == 2015){System.out.println(subject[sub2]);toal+=2;}
             else if(sub2 == 1063){System.out.println(subject[sub2]);toal+=3;}
             
             if(sub3 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub3]);toal+=8;}else System.out.print("");}
             else if(sub3 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub3]);toal+=5;}else System.out.print("");}
             else if(sub3 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub3]);toal+=5;}else System.out.print("");}
             else if(sub3 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub3]);toal+=3;}else System.out.print("");}
             else if(sub3 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub3]);toal+=3;}else System.out.print("");}
             else if(sub3 == 2015){System.out.println(subject[sub3]);toal+=2;}
             else if(sub3 == 1063){System.out.println(subject[sub3]);toal+=3;}
             
             if(sub4 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub4]);toal+=8;}else System.out.print("");}
             else if(sub4 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub4]);toal+=5;}else System.out.print("");}
             else if(sub4 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub4]);toal+=5;}else System.out.print("");}
             else if(sub4 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub4]);toal+=3;}else System.out.print("");}
             else if(sub4 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub4]);toal+=3;}else System.out.print("");}
             else if(sub4 == 2015){System.out.println(subject[sub4]);toal+=2;}
             else if(sub4 == 1063){System.out.println(subject[sub4]);toal+=3;}
             
             if(sub5 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub5]);toal+=8;}else System.out.print("");}
             else if(sub5 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub5]);toal+=5;}else System.out.print("");}
             else if(sub5 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub5]);toal+=5;}else System.out.print("");}
             else if(sub5 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub5]);toal+=3;}else System.out.print("");}
             else if(sub5 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub5]);toal+=3;}else System.out.print("");}
             else if(sub5 == 2015){System.out.println(subject[sub5]);toal+=2;}
             else if(sub5 == 1063){System.out.println(subject[sub5]);toal+=3;}
             
             if(sub6 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub6]);toal+=8;}else System.out.print("");}
             else if(sub6 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub6]);toal+=5;}else System.out.print("");}
             else if(sub6 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub6]);toal+=5;}else System.out.print("");}
             else if(sub6 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub6]);toal+=3;}else System.out.print("");}
             else if(sub6 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub6]);toal+=3;}else System.out.print("");}
             else if(sub6 == 2015){System.out.println(subject[sub6]);toal+=2;}
             else if(sub6 == 1063){System.out.println(subject[sub6]);toal+=3;}
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     "+toal+"\n");
             System.out.println("=================================================================================================================================================");
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){
             System.out.print(subject[sub1]+" :");
             grade1 = input.nextDouble();
             System.out.print(subject[sub2]+" :");
             grade2 = input.nextDouble();
             System.out.print(subject[sub3]+" :");
             grade3 = input.nextDouble();
             System.out.print(subject[sub4]+" :");
             grade4 = input.nextDouble();
             System.out.print(subject[sub5]+" :");
             grade5 = input.nextDouble();
             System.out.print(subject[sub6]+" :");
             grade6 = input.nextDouble();     
  System.out.println("=================================================================================================================================================");
             System.out.print("\nSee the Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {
               if(grade1 >=1.0 && grade1 <=3.5)System.out.println(subject[sub1]+" : Passed");
                                  else         System.out.println(subject[sub1]+" : Failed");
                 
               if(grade2 >=1.0 && grade2<=3.5) System.out.println(subject[sub2]+" : Passed");
                                  else         System.out.println(subject[sub2]+" : Failed");
                
               if(grade3 >=1.0 && grade3 <=3.5)System.out.println(subject[sub3]+" : Passed");
                                  else         System.out.println(subject[sub3]+" : Failed");

               if(grade4 >=1.0 && grade4 <=3.5)System.out.println(subject[sub4]+" : Passed");
                                  else         System.out.println(subject[sub4]+" : Failed");
                 
               if(grade5 >=1.0 && grade5 <=3.5)System.out.println(subject[sub5]+" : Passed");
                                  else         System.out.println(subject[sub5]+" : Failed");
                 
               if(grade6 >=1.0 && grade6 <=3.5)System.out.println(subject[sub6]+" : Passed");
                                  else         System.out.println(subject[sub6]+" : Failed");
       System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to Second Year Second Semester (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers)){ Ssem2();}
                else if("N".equals(answers) || "n".equals(answers)) { menu.menu();}
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);}
else Smenu();}else Smenu();}
    public void S5(){
             //OfferCode Area
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1266 || sub1 == 1267 || sub1 == 1005 || sub1 == 1025 || sub1 == 2007 || sub1 == 2015 || sub1 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1266 || sub2 == 1267 || sub2 == 1005 || sub2 == 1025 || sub2 == 2007 || sub2 == 2015 || sub2 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1266 || sub3 == 1267 || sub3 == 1005 || sub3 == 1025 || sub3 == 2007 || sub3 == 2015 || sub3 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 1266 || sub4 == 1267 || sub4 == 1005 || sub4 == 1025 || sub4 == 2007 || sub4 == 2015 || sub4 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("5.Enter Offercode :");
             sub5 = input.nextInt();
             if(sub5 == 1266 || sub5 == 1267 || sub5 == 1005 || sub5 == 1025 || sub5 == 2007 || sub5 == 2015 || sub5 == 1063);
             else i-=1;
             }
             //List of Subjects Entered
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" SECOND YEAR,SECOND SEMESTER\n");
             if(sub1 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=8;}else System.out.print("");}
             else if(sub1 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=5;}else System.out.print("");}
             else if(sub1 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=5;}else System.out.print("");}
             else if(sub1 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub1]);toal+=3;}else System.out.print("");}
             else if(sub1 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub1]);toal+=3;}else System.out.print("");}
             else if(sub1 == 2015){System.out.println(subject[sub1]);toal+=2;}
             else if(sub1 == 1063){System.out.println(subject[sub1]);toal+=3;}
             
             if(sub2 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=8;}else System.out.print("");}
             else if(sub2 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=5;}else System.out.print("");}
             else if(sub2 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=5;}else System.out.print("");}
             else if(sub2 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub2]);toal+=3;}else System.out.print("");}
             else if(sub2 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub2]);toal+=3;}else System.out.print("");}
             else if(sub2 == 2015){System.out.println(subject[sub2]);toal+=2;}
             else if(sub2 == 1063){System.out.println(subject[sub2]);toal+=3;}
             
             if(sub3 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub3]);toal+=8;}else System.out.print("");}
             else if(sub3 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub3]);toal+=5;}else System.out.print("");}
             else if(sub3 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub3]);toal+=5;}else System.out.print("");}
             else if(sub3 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub3]);toal+=3;}else System.out.print("");}
             else if(sub3 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub3]);toal+=3;}else System.out.print("");}
             else if(sub3 == 2015){System.out.println(subject[sub3]);toal+=2;}
             else if(sub3 == 1063){System.out.println(subject[sub3]);toal+=3;}
             
             if(sub4 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub4]);toal+=8;}else System.out.print("");}
             else if(sub4 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub4]);toal+=5;}else System.out.print("");}
             else if(sub4 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub4]);toal+=5;}else System.out.print("");}
             else if(sub4 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub4]);toal+=3;}else System.out.print("");}
             else if(sub4 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub4]);toal+=3;}else System.out.print("");}
             else if(sub4 == 2015){System.out.println(subject[sub4]);toal+=2;}
             else if(sub4 == 1063){System.out.println(subject[sub4]);toal+=3;}
             
             if(sub5 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub5]);toal+=8;}else System.out.print("");}
             else if(sub5 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub5]);toal+=5;}else System.out.print("");}
             else if(sub5 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub5]);toal+=5;}else System.out.print("");}
             else if(sub5 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub5]);toal+=3;}else System.out.print("");}
             else if(sub5 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub5]);toal+=3;}else System.out.print("");}
             else if(sub5 == 2015){System.out.println(subject[sub5]);toal+=2;}
             else if(sub5 == 1063){System.out.println(subject[sub5]);toal+=3;}
            
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     "+toal+"\n");
             System.out.println("=================================================================================================================================================");
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){
             System.out.print(subject[sub1]+" :");
             grade1 = input.nextDouble();
             System.out.print(subject[sub2]+" :");
             grade2 = input.nextDouble();
             System.out.print(subject[sub3]+" :");
             grade3 = input.nextDouble();
             System.out.print(subject[sub4]+" :");
             grade4 = input.nextDouble();
             System.out.print(subject[sub5]+" :");
             grade5 = input.nextDouble();
            System.out.println("=================================================================================================================================================");
             System.out.print("\nSee the Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {
               if(grade1 >=1.0 && grade1 <=3.5)System.out.println(subject[sub1]+" : Passed");
                                  else         System.out.println(subject[sub1]+" : Failed");
                 
               if(grade2 >=1.0 && grade2<=3.5) System.out.println(subject[sub2]+" : Passed");
                                  else         System.out.println(subject[sub2]+" : Failed");
                
               if(grade3 >=1.0 && grade3 <=3.5)System.out.println(subject[sub3]+" : Passed");
                                  else         System.out.println(subject[sub3]+" : Failed");

               if(grade4 >=1.0 && grade4 <=3.5)System.out.println(subject[sub4]+" : Passed");
                                  else         System.out.println(subject[sub4]+" : Failed");
                 
               if(grade5 >=1.0 && grade5 <=3.5)System.out.println(subject[sub5]+" : Passed");
                                  else         System.out.println(subject[sub5]+" : Failed");
 System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to Second Year Second Semester (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers)){ Ssem2();}
                else if("N".equals(answers) || "n".equals(answers)) { menu.menu();}
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);}
else Smenu();}else Smenu();
    }
    public void S4(){
             //OfferCode Area
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1266 || sub1 == 1267 || sub1 == 1005 || sub1 == 1025 || sub1 == 2007 || sub1 == 2015 || sub1 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1266 || sub2 == 1267 || sub2 == 1005 || sub2 == 1025 || sub2 == 2007 || sub2 == 2015 || sub2 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1266 || sub3 == 1267 || sub3 == 1005 || sub3 == 1025 || sub3 == 2007 || sub3 == 2015 || sub3 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 1266 || sub4 == 1267 || sub4 == 1005 || sub4 == 1025 || sub4 == 2007 || sub4 == 2015 || sub4 == 1063);
             else i-=1;
             }
             
             //List of Subjects Entered
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" SECOND YEAR,SECOND SEMESTER\n");
             if(sub1 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=8;}else System.out.print("");}
             else if(sub1 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=5;}else System.out.print("");}
             else if(sub1 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=5;}else System.out.print("");}
             else if(sub1 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub1]);toal+=3;}else System.out.print("");}
             else if(sub1 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub1]);toal+=3;}else System.out.print("");}
             else if(sub1 == 2015){System.out.println(subject[sub1]);toal+=2;}
             else if(sub1 == 1063){System.out.println(subject[sub1]);toal+=3;}
             
             if(sub2 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=8;}else System.out.print("");}
             else if(sub2 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=5;}else System.out.print("");}
             else if(sub2 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=5;}else System.out.print("");}
             else if(sub2 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub2]);toal+=3;}else System.out.print("");}
             else if(sub2 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub2]);toal+=3;}else System.out.print("");}
             else if(sub2 == 2015){System.out.println(subject[sub2]);toal+=2;}
             else if(sub2 == 1063){System.out.println(subject[sub2]);toal+=3;}
             
             if(sub3 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub3]);toal+=8;}else System.out.print("");}
             else if(sub3 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub3]);toal+=5;}else System.out.print("");}
             else if(sub3 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub3]);toal+=5;}else System.out.print("");}
             else if(sub3 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub3]);toal+=3;}else System.out.print("");}
             else if(sub3 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub3]);toal+=3;}else System.out.print("");}
             else if(sub3 == 2015){System.out.println(subject[sub3]);toal+=2;}
             else if(sub3 == 1063){System.out.println(subject[sub3]);toal+=3;}
             
             if(sub4 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub4]);toal+=8;}else System.out.print("");}
             else if(sub4 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub4]);toal+=5;}else System.out.print("");}
             else if(sub4 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub4]);toal+=5;}else System.out.print("");}
             else if(sub4 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub4]);toal+=3;}else System.out.print("");}
             else if(sub4 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub4]);toal+=3;}else System.out.print("");}
             else if(sub4 == 2015){System.out.println(subject[sub4]);toal+=2;}
             else if(sub4 == 1063){System.out.println(subject[sub4]);toal+=3;}
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     "+toal+"\n");
             System.out.println("=================================================================================================================================================");
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){
             System.out.print(subject[sub1]+" :");
             grade1 = input.nextDouble();
             System.out.print(subject[sub2]+" :");
             grade2 = input.nextDouble();
             System.out.print(subject[sub3]+" :");
             grade3 = input.nextDouble();
             System.out.print(subject[sub4]+" :");
             grade4 = input.nextDouble();
            System.out.println("=================================================================================================================================================");
             System.out.print("\nSee the Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {
               if(grade1 >=1.0 && grade1 <=3.5)System.out.println(subject[sub1]+" : Passed");
                                  else         System.out.println(subject[sub1]+" : Failed");
                 
               if(grade2 >=1.0 && grade2<=3.5) System.out.println(subject[sub2]+" : Passed");
                                  else         System.out.println(subject[sub2]+" : Failed");
                
               if(grade3 >=1.0 && grade3 <=3.5)System.out.println(subject[sub3]+" : Passed");
                                  else         System.out.println(subject[sub3]+" : Failed");

               if(grade4 >=1.0 && grade4 <=3.5)System.out.println(subject[sub4]+" : Passed");
                                  else         System.out.println(subject[sub4]+" : Failed");
                 System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to Second Year Second Semester (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers)){ Ssem2();}
                else if("N".equals(answers) || "n".equals(answers)) { menu.menu();}
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);}
else Smenu();}else Smenu();
    }
    public void S3(){
             //OfferCode Area
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1266 || sub1 == 1267 || sub1 == 1005 || sub1 == 1025 || sub1 == 2007 || sub1 == 2015 || sub1 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1266 || sub2 == 1267 || sub2 == 1005 || sub2 == 1025 || sub2 == 2007 || sub2 == 2015 || sub2 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1266 || sub3 == 1267 || sub3 == 1005 || sub3 == 1025 || sub3 == 2007 || sub3 == 2015 || sub3 == 1063);
             else i-=1;
             }
             //List of Subjects Entered
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" SECOND YEAR,SECOND SEMESTER\n");
             if(sub1 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=8;}else System.out.print("");}
             else if(sub1 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=5;}else System.out.print("");}
             else if(sub1 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=5;}else System.out.print("");}
             else if(sub1 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub1]);toal+=3;}else System.out.print("");}
             else if(sub1 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub1]);toal+=3;}else System.out.print("");}
             else if(sub1 == 2015){System.out.println(subject[sub1]);toal+=2;}
             else if(sub1 == 1063){System.out.println(subject[sub1]);toal+=3;}
             
             if(sub2 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=8;}else System.out.print("");}
             else if(sub2 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=5;}else System.out.print("");}
             else if(sub2 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=5;}else System.out.print("");}
             else if(sub2 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub2]);toal+=3;}else System.out.print("");}
             else if(sub2 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub2]);toal+=3;}else System.out.print("");}
             else if(sub2 == 2015){System.out.println(subject[sub2]);toal+=2;}
             else if(sub2 == 1063){System.out.println(subject[sub2]);toal+=3;}
             
             if(sub3 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub3]);toal+=8;}else System.out.print("");}
             else if(sub3 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub3]);toal+=5;}else System.out.print("");}
             else if(sub3 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub3]);toal+=5;}else System.out.print("");}
             else if(sub3 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub3]);toal+=3;}else System.out.print("");}
             else if(sub3 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub3]);toal+=3;}else System.out.print("");}
             else if(sub3 == 2015){System.out.println(subject[sub3]);toal+=2;}
             else if(sub3 == 1063){System.out.println(subject[sub3]);toal+=3;}
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     "+toal+"\n");
             System.out.println("=================================================================================================================================================");
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){
             System.out.print(subject[sub1]+" :");
             grade1 = input.nextDouble();
             System.out.print(subject[sub2]+" :");
             grade2 = input.nextDouble();
             System.out.print(subject[sub3]+" :");
             grade3 = input.nextDouble();
             System.out.print(subject[sub4]+" :");
 System.out.println("=================================================================================================================================================");
             System.out.print("\nSee the Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {
               if(grade1 >=1.0 && grade1 <=3.5)System.out.println(subject[sub1]+" : Passed");
                                  else         System.out.println(subject[sub1]+" : Failed");
                 
               if(grade2 >=1.0 && grade2<=3.5) System.out.println(subject[sub2]+" : Passed");
                                  else         System.out.println(subject[sub2]+" : Failed");
                
               if(grade3 >=1.0 && grade3 <=3.5)System.out.println(subject[sub3]+" : Passed");
                                  else         System.out.println(subject[sub3]+" : Failed");
System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to Second Year Second Semester (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers)){ Ssem2();}
                else if("N".equals(answers) || "n".equals(answers)) { menu.menu();}
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);}
else Smenu();}else Smenu();
    }
    public void S2(){
             Sarray();
             //OfferCode Area
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1266 || sub1 == 1267 || sub1 == 1005 || sub1 == 1025 || sub1 == 2007 || sub1 == 2015 || sub1 == 1063);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1266 || sub2 == 1267 || sub2 == 1005 || sub2 == 1025 || sub2 == 2007 || sub2 == 2015 || sub2 == 1063);
             else i-=1;
             }
             System.out.println("=================================================================================================================================================");
             //List of Subjects Entered
             System.out.println("\n");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" SECOND YEAR,SECOND SEMESTER\n");
             if(sub1 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=8;}else System.out.print("");}
             else if(sub1 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=5;}else System.out.print("");}
             else if(sub1 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub1]);toal+=5;}else System.out.print("");}
             else if(sub1 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub1]);toal+=3;}else System.out.print("");}
             else if(sub1 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub1]);toal+=3;}else System.out.print("");}
             else if(sub1 == 2015){System.out.println(subject[sub1]);toal+=2;}
             else if(sub1 == 1063){System.out.println(subject[sub1]);toal+=3;}
             
             if(sub2 ==1266){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=8;}else System.out.print("");}
             else if(sub2 ==1267){if(health >=1.0 && health <=3.5 && nurse >=1.0 && nurse <=3.5 && human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=5;}else System.out.print("");}
             else if(sub2 == 1005){if(human >=1.0 && human <=3.5){System.out.println(subject[sub2]);toal+=5;}else System.out.print("");}
             else if(sub2 == 1025){if(english >=1.0 && english <=3.5){System.out.println(subject[sub2]);toal+=3;}else System.out.print("");}
             else if(sub2 == 2007){if(logic >=1.0 && logic <=3.5 && philo >=1.0 && philo <=3.5){System.out.println(subject[sub2]);toal+=3;}else System.out.print("");}
             else if(sub2 == 2015){System.out.println(subject[sub2]);toal+=2;}
             else if(sub2 == 1063){System.out.println(subject[sub2]);toal+=3;}
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     "+toal+"\n");
             System.out.println("=================================================================================================================================================");
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){
             System.out.print(subject[sub1]+" :");
             grade1 = input.nextDouble();
             System.out.print(subject[sub2]+" :");
             grade2 = input.nextDouble();
             System.out.print(subject[sub3]+" :");
             System.out.println("=================================================================================================================================================");
             System.out.print("\nSee the Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {
               if(grade1 >=1.0 && grade1 <=3.5)System.out.println(subject[sub1]+" : Passed");
                                  else         System.out.println(subject[sub1]+" : Failed");
                 
               if(grade2 >=1.0 && grade2<=3.5) System.out.println(subject[sub2]+" : Passed");
                                  else         System.out.println(subject[sub2]+" : Failed");
                System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to Second Year Second Semester (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers)){ Ssem2();}
                else if("N".equals(answers) || "n".equals(answers)) { menu.menu();}
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);}
else Smenu();}else Smenu();
    }
    
    //SECOND YEAR , SECOND SEMESTER
    public void Ssem2(){
        Sarray();
        System.out.println("=================================================================================================================================================");
             System.out.print("\nEnter your Grades for this Subjects :\n");
             System.out.print("Care of Mother,Child & Family :");
             care = input.nextDouble();
             System.out.print("Biochemistry :");
             chem2 = input.nextDouble();
             System.out.print("Microbiology & Parasitology :");
             bio2 = input.nextDouble();
             System.out.print("College Algebra :");
             math = input.nextDouble();
             System.out.print("General Chemistry (Organic & inorganic) :");
             chem1 = input.nextDouble();
             System.out.print("Human Anatomy & Physiology :");
             bio1 = input.nextDouble();
             System.out.print("Study & Thinking Skills in English :");
             eng1 = input.nextDouble();
             System.out.print("Individual & Dual Sports :");
             pe3 = input.nextDouble();
             
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n");
        if(care >=1.0 && care <=3.5){System.out.println(subjects[1268]);toals+=11;}else System.out.println("");
        if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[1959]);toals+=4;}else System.out.println("");
        if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[1068]);toals+=3;}else System.out.println("");
        if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[1442]);toals+=3;}else System.out.println("");
        if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[1051]);toals+=2;}else System.out.println("");
        if(math >=1.0 && math <=3.5){System.out.println(subjects[1449]);toals+=4;}else System.out.println("");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+toals+"\n");
        System.out.println("=================================================================================================================================================");
        System.out.println("Entered Range 3-6");
             int sub;
             for(int i = 1;i<=1;i++){
             System.out.print("Enter Subject Needed :");
             sub = input.nextInt();
             if(sub == 6){s6();}
             else if(sub == 5){s5();}
             else if(sub == 4){s4();}
             else if(sub == 3){s3();}
             else 
                 i-=1;System.out.println("INVALID INPUT");
             }
    }
    
    //NUMBERS OF SUBJECT ENTERED FOR SECOND SEMESTER
    public void s6(){
             Sarray();
             //OfferCode Area
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1268 || sub1 == 1959 || sub1 == 1068 || sub1 == 1442 || sub1 == 1051 || sub1 == 1449);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1268 || sub2 == 1959 || sub2 == 1068 || sub2 == 1442 || sub2 == 1051 || sub2 == 1449);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1268 || sub3 == 1959 || sub3 == 1068 || sub3 == 1442 || sub3 == 1051 || sub3 == 1449);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 1268 || sub4 == 1959 || sub4 == 1068 || sub4 == 1442 || sub4 == 1051 || sub4 == 1449);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("5.Enter Offercode :");
             sub5 = input.nextInt();
             if(sub5 == 1268 || sub5 == 1959 || sub5 == 1068 || sub5 == 1442 || sub5 == 1051 || sub5 == 1449);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("6.Enter Offercode :");
             sub6 = input.nextInt();
             if(sub6 == 1268 || sub6 == 1959 || sub6 == 1068 || sub6 == 1442 || sub6 == 1051 || sub6 == 1449);
             else i-=1;
             }
             
             //SUBJECT ENTERED
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n");
             //FOR SUB1
             if(sub1 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub1]);total+=11;}else System.out.println("");}
             else if(sub1 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub1]);total+=4;}else System.out.println("");}
             else if(sub1 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub1]);total+=3;}else System.out.println("");}
             else if(sub1 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub1]);total+=3;}else System.out.println("");}
             else if(sub1 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub1]);total+=2;}else System.out.println("");}
             else if(sub1 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub1]);total+=4;}else System.out.println("");}
             //FOR SUB2
             if(sub2 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub2]);total+=11;}else System.out.println("");}
             else if(sub2 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub2]);total+=4;}else System.out.println("");}
             else if(sub2 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub2]);total+=3;}else System.out.println("");}
             else if(sub2 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub2]);total+=3;}else System.out.println("");}
             else if(sub2 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub2]);total+=2;}else System.out.println("");}
             else if(sub2 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub2]);total+=4;}else System.out.println("");}
             //FOR SUB3
             if(sub3 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub3]);total+=11;}else System.out.println("");}
             else if(sub3 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub3]);total+=4;}else System.out.println("");}
             else if(sub3 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub3]);total+=3;}else System.out.println("");}
             else if(sub3 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub3]);total+=3;}else System.out.println("");}
             else if(sub3 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub3]);total+=2;}else System.out.println("");}
             else if(sub3 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub3]);total+=4;}else System.out.println("");}
             //FOR SUB4
             if(sub4 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub4]);total+=11;}else System.out.println("");}
             else if(sub4 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub4]);total+=4;}else System.out.println("");}
             else if(sub4 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub4]);total+=3;}else System.out.println("");}
             else if(sub4 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub4]);total+=3;}else System.out.println("");}
             else if(sub4 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub4]);total+=2;}else System.out.println("");}
             else if(sub4 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub4]);total+=4;}else System.out.println("");}
             //FOR SUB5
             if(sub5 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub5]);total+=11;}else System.out.println("");}
             else if(sub5 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub5]);total+=4;}else System.out.println("");}
             else if(sub5 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub5]);total+=3;}else System.out.println("");}
             else if(sub5 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub5]);total+=3;}else System.out.println("");}
             else if(sub5 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub5]);total+=2;}else System.out.println("");}
             else if(sub5 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub5]);totals+=4;}else System.out.println("");}
             //FOR SUB6
             if(sub6 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub6]);total+=11;}else System.out.println("");}
             else if(sub6 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub6]);total+=4;}else System.out.println("");}
             else if(sub6 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub6]);total+=3;}else System.out.println("");}
             else if(sub6 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub6]);total+=3;}else System.out.println("");}
             else if(sub6 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub6]);total+=2;}else System.out.println("");}
             else if(sub6 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub6]);total+=4;}else System.out.println("");}
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+total+"\n");
             System.out.println("=================================================================================================================================================");
             //FOR GRADES
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){
             System.out.print(subjects[sub1]+" :");
             grade1 = input.nextDouble();
             System.out.print(subjects[sub2]+" :");
             grade2 = input.nextDouble();
             System.out.print(subjects[sub3]+" :");
             grade3 = input.nextDouble();
             System.out.print(subjects[sub4]+" :");
             grade4 = input.nextDouble();
             System.out.print(subjects[sub5]+" :");
             grade5 = input.nextDouble();
             System.out.print(subjects[sub6]+" :");
             grade6 = input.nextDouble();
             System.out.println("=================================================================================================================================================");
             //RESULT FOR ENTERED GRADES
             System.out.print("\nSee the Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {
                if(grade1 >=1.0 && grade1 <=3.5)
                      System.out.println(subjects[sub1]+" : Passed");
                else  System.out.println(subjects[sub1]+" : Failed");
                 
                if(grade2 >=1.0 && grade2<=3.5)
                      System.out.println(subjects[sub2]+" : Passed");
                else  System.out.println(subjects[sub2]+" : Failed");
                
                if(grade3 >=1.0 && grade3 <=3.5)
                      System.out.println(subjects[sub3]+" : Passed");
                else  System.out.println(subjects[sub3]+" : Failed");
                
                if(grade4 >=1.0 && grade4 <=3.5)
                      System.out.println(subjects[sub4]+" : Passed");
                else  System.out.println(subjects[sub4]+" : Failed");
                    
                if(grade5 >=1.0 && grade5 <=3.5)
                      System.out.println(subjects[sub5]+" : Passed");
                else  System.out.println(subjects[sub5]+" : Failed");
                   
                if(grade6 >=1.0 && grade6 <=3.5)
                      System.out.println(subjects[sub6]+" : Passed");
                else  System.out.println(subjects[sub6]+" : Failed");
                 
             }else Smenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to Second Year Summer (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers)){
                    Ssummer();}
                else if("N".equals(answers) || "n".equals(answers)){
                    Smenu();}
                else 
                    System.out.println("Invalid Input");
                    menu.menu();
            }else Smenu();   
    }
    public void s5(){
             Sarray();
             //OfferCode Area
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1268 || sub1 == 1959 || sub1 == 1068 || sub1 == 1442 || sub1 == 1051 || sub1 == 1449);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1268 || sub2 == 1959 || sub2 == 1068 || sub2 == 1442 || sub2 == 1051 || sub2 == 1449);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1268 || sub3 == 1959 || sub3 == 1068 || sub3 == 1442 || sub3 == 1051 || sub3 == 1449);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 1268 || sub4 == 1959 || sub4 == 1068 || sub4 == 1442 || sub4 == 1051 || sub4 == 1449);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("5.Enter Offercode :");
             sub5 = input.nextInt();
             if(sub5 == 1268 || sub5 == 1959 || sub5 == 1068 || sub5 == 1442 || sub5 == 1051 || sub5 == 1449);
             else i-=1;
             }
             
             //SUBJECT ENTERED
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n");
             //FOR SUB1
             if(sub1 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub1]);total+=11;}else System.out.println("");}
             else if(sub1 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub1]);total+=4;}else System.out.println("");}
             else if(sub1 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub1]);total+=3;}else System.out.println("");}
             else if(sub1 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub1]);total+=3;}else System.out.println("");}
             else if(sub1 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub1]);total+=2;}else System.out.println("");}
             else if(sub1 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub1]);total+=4;}else System.out.println("");}
             //FOR SUB2
             if(sub2 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub2]);total+=11;}else System.out.println("");}
             else if(sub2 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub2]);total+=4;}else System.out.println("");}
             else if(sub2 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub2]);total+=3;}else System.out.println("");}
             else if(sub2 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub2]);total+=3;}else System.out.println("");}
             else if(sub2 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub2]);total+=2;}else System.out.println("");}
             else if(sub2 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub2]);total+=4;}else System.out.println("");}
             //FOR SUB3
             if(sub3 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub3]);total+=11;}else System.out.println("");}
             else if(sub3 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub3]);total+=4;}else System.out.println("");}
             else if(sub3 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub3]);total+=3;}else System.out.println("");}
             else if(sub3 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub3]);total+=3;}else System.out.println("");}
             else if(sub3 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub3]);total+=2;}else System.out.println("");}
             else if(sub3 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub3]);total+=4;}else System.out.println("");}
             //FOR SUB4
             if(sub4 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub4]);total+=11;}else System.out.println("");}
             else if(sub4 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub4]);total+=4;}else System.out.println("");}
             else if(sub4 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub4]);total+=3;}else System.out.println("");}
             else if(sub4 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub4]);total+=3;}else System.out.println("");}
             else if(sub4 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub4]);total+=2;}else System.out.println("");}
             else if(sub4 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub4]);total+=4;}else System.out.println("");}
             //FOR SUB5
             if(sub5 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub5]);total+=11;}else System.out.println("");}
             else if(sub5 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub5]);total+=4;}else System.out.println("");}
             else if(sub5 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub5]);total+=3;}else System.out.println("");}
             else if(sub5 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub5]);total+=3;}else System.out.println("");}
             else if(sub5 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub5]);total+=2;}else System.out.println("");}
             else if(sub5 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub5]);totals+=4;}else System.out.println("");}
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+total+"\n");
             System.out.println("=================================================================================================================================================");
             //FOR GRADES
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){
             System.out.print(subjects[sub1]+" :");
             grade1 = input.nextDouble();
             System.out.print(subjects[sub2]+" :");
             grade2 = input.nextDouble();
             System.out.print(subjects[sub3]+" :");
             grade3 = input.nextDouble();
             System.out.print(subjects[sub4]+" :");
             grade4 = input.nextDouble();
             System.out.print(subjects[sub5]+" :");
             grade5 = input.nextDouble();
             System.out.println("=================================================================================================================================================");
             //RESULT FOR ENTERED GRADES
             System.out.print("\nSee the Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {
                if(grade1 >=1.0 && grade1 <=3.5)
                      System.out.println(subjects[sub1]+" : Passed");
                else  System.out.println(subjects[sub1]+" : Failed");
                 
                if(grade2 >=1.0 && grade2<=3.5)
                      System.out.println(subjects[sub2]+" : Passed");
                else  System.out.println(subjects[sub2]+" : Failed");
                
                if(grade3 >=1.0 && grade3 <=3.5)
                      System.out.println(subjects[sub3]+" : Passed");
                else  System.out.println(subjects[sub3]+" : Failed");
                
                if(grade4 >=1.0 && grade4 <=3.5)
                      System.out.println(subjects[sub4]+" : Passed");
                else  System.out.println(subjects[sub4]+" : Failed");
                    
                if(grade5 >=1.0 && grade5 <=3.5)
                      System.out.println(subjects[sub5]+" : Passed");
                else  System.out.println(subjects[sub5]+" : Failed");
                
                }else Smenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to Second Year Summer (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers)){
                    Ssummer();}
                else if("N".equals(answers) || "n".equals(answers)){
                    Smenu();}
                else 
                    System.out.println("Invalid Input");
                    menu.menu();
            }else Smenu();
    }
    public void s4(){
             Sarray();
             System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1268 || sub1 == 1959 || sub1 == 1068 || sub1 == 1442 || sub1 == 1051 || sub1 == 1449);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1268 || sub2 == 1959 || sub2 == 1068 || sub2 == 1442 || sub2 == 1051 || sub2 == 1449);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1268 || sub3 == 1959 || sub3 == 1068 || sub3 == 1442 || sub3 == 1051 || sub3 == 1449);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 1268 || sub4 == 1959 || sub4 == 1068 || sub4 == 1442 || sub4 == 1051 || sub4 == 1449);
             else i-=1;
             }
             
             //SUBJECT ENTERED
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n");
             //FOR SUB1
             if(sub1 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub1]);total+=11;}else System.out.println("");}
             else if(sub1 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub1]);total+=4;}else System.out.println("");}
             else if(sub1 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub1]);total+=3;}else System.out.println("");}
             else if(sub1 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub1]);total+=3;}else System.out.println("");}
             else if(sub1 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub1]);total+=2;}else System.out.println("");}
             else if(sub1 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub1]);total+=4;}else System.out.println("");}
             //FOR SUB2
             if(sub2 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub2]);total+=11;}else System.out.println("");}
             else if(sub2 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub2]);total+=4;}else System.out.println("");}
             else if(sub2 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub2]);total+=3;}else System.out.println("");}
             else if(sub2 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub2]);total+=3;}else System.out.println("");}
             else if(sub2 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub2]);total+=2;}else System.out.println("");}
             else if(sub2 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub2]);total+=4;}else System.out.println("");}
             //FOR SUB3
             if(sub3 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub3]);total+=11;}else System.out.println("");}
             else if(sub3 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub3]);total+=4;}else System.out.println("");}
             else if(sub3 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub3]);total+=3;}else System.out.println("");}
             else if(sub3 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub3]);total+=3;}else System.out.println("");}
             else if(sub3 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub3]);total+=2;}else System.out.println("");}
             else if(sub3 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub3]);total+=4;}else System.out.println("");}
             //FOR SUB4
             if(sub4 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub4]);total+=11;}else System.out.println("");}
             else if(sub4 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub4]);total+=4;}else System.out.println("");}
             else if(sub4 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub4]);total+=3;}else System.out.println("");}
             else if(sub4 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub4]);total+=3;}else System.out.println("");}
             else if(sub4 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub4]);total+=2;}else System.out.println("");}
             else if(sub4 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub4]);total+=4;}else System.out.println("");}
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+total+"\n");
             System.out.println("=================================================================================================================================================");
             //FOR GRADES
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){
             System.out.print(subjects[sub1]+" :");
             grade1 = input.nextDouble();
             System.out.print(subjects[sub2]+" :");
             grade2 = input.nextDouble();
             System.out.print(subjects[sub3]+" :");
             grade3 = input.nextDouble();
             System.out.print(subjects[sub4]+" :");
             grade4 = input.nextDouble();
             System.out.println("=================================================================================================================================================");
             //RESULT FOR ENTERED GRADES
             System.out.print("\nSee the Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {
                if(grade1 >=1.0 && grade1 <=3.5)
                      System.out.println(subjects[sub1]+" : Passed");
                else  System.out.println(subjects[sub1]+" : Failed");
                 
                if(grade2 >=1.0 && grade2<=3.5)
                      System.out.println(subjects[sub2]+" : Passed");
                else  System.out.println(subjects[sub2]+" : Failed");
                
                if(grade3 >=1.0 && grade3 <=3.5)
                      System.out.println(subjects[sub3]+" : Passed");
                else  System.out.println(subjects[sub3]+" : Failed");
                
                if(grade4 >=1.0 && grade4 <=3.5)
                      System.out.println(subjects[sub4]+" : Passed");
                else  System.out.println(subjects[sub4]+" : Failed");
                
                }else Smenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to Second Year Summer (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers)){
                    Ssummer();}
                else if("N".equals(answers) || "n".equals(answers)){
                    Smenu();}
                else 
                    System.out.println("Invalid Input");
                    menu.menu();
            }else Smenu();
    }
    public void s3(){
             Sarray();
             //OfferCode Area
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1268 || sub1 == 1959 || sub1 == 1068 || sub1 == 1442 || sub1 == 1051 || sub1 == 1449);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1268 || sub2 == 1959 || sub2 == 1068 || sub2 == 1442 || sub2 == 1051 || sub2 == 1449);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1268 || sub3 == 1959 || sub3 == 1068 || sub3 == 1442 || sub3 == 1051 || sub3 == 1449);
             else i-=1;
             }
             System.out.println("=================================================================================================================================================");
             //SUBJECT ENTERED
             System.out.println("\n");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n");
             //FOR SUB1
             if(sub1 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub1]);total+=11;}else System.out.println("");}
             else if(sub1 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub1]);total+=4;}else System.out.println("");}
             else if(sub1 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub1]);total+=3;}else System.out.println("");}
             else if(sub1 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub1]);total+=3;}else System.out.println("");}
             else if(sub1 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub1]);total+=2;}else System.out.println("");}
             else if(sub1 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub1]);total+=4;}else System.out.println("");}
             //FOR SUB2
             if(sub2 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub2]);total+=11;}else System.out.println("");}
             else if(sub2 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub2]);total+=4;}else System.out.println("");}
             else if(sub2 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub2]);total+=3;}else System.out.println("");}
             else if(sub2 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub2]);total+=3;}else System.out.println("");}
             else if(sub2 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub2]);total+=2;}else System.out.println("");}
             else if(sub2 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub2]);total+=4;}else System.out.println("");}
             //FOR SUB3
             if(sub3 == 1268){if(care >=1.0 && care <=3.5){System.out.println(subjects[sub3]);total+=11;}else System.out.println("");}
             else if(sub3 == 1959){if(chem2 >=1.0 && chem2 <=3.5 && bio2 >=1.0 && bio2 <=3.5){System.out.println(subjects[sub3]);total+=4;}else System.out.println("");}
             else if(sub3 == 1068){if(math >=1.0 && math <=3.5 && chem1 >=1.0 && chem1 <=3.5 && bio1 >=1.0 && bio1 <=3.5){System.out.println(subjects[sub3]);total+=3;}else System.out.println("");}
             else if(sub3 == 1442){if(eng1 >=1.0 && eng1 <=3.5){System.out.println(subjects[sub3]);total+=3;}else System.out.println("");}
             else if(sub3 == 1051){if(pe3 >=1.0 && pe3 <=3.5){System.out.println(subjects[sub3]);total+=2;}else System.out.println("");}
             else if(sub3 == 1449){if(math >=1.0 && math <=3.5){System.out.println(subjects[sub3]);total+=4;}else System.out.println("");}
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+total+"\n");
              //FOR GRADES
              System.out.println("=================================================================================================================================================");
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){
             System.out.print(subjects[sub1]+" :");
             grade1 = input.nextDouble();
             System.out.print(subjects[sub2]+" :");
             grade2 = input.nextDouble();
             System.out.print(subjects[sub3]+" :");
             grade3 = input.nextDouble();
             System.out.println("=================================================================================================================================================");
             //RESULT FOR ENTERED GRADES
             System.out.print("\nSee the Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {
                if(grade1 >=1.0 && grade1 <=3.5)
                      System.out.println(subjects[sub1]+" : Passed");
                else  System.out.println(subjects[sub1]+" : Failed");
                 
                if(grade2 >=1.0 && grade2<=3.5)
                      System.out.println(subjects[sub2]+" : Passed");
                else  System.out.println(subjects[sub2]+" : Failed");
                
                if(grade3 >=1.0 && grade3 <=3.5)
                      System.out.println(subjects[sub3]+" : Passed");
                else  System.out.println(subjects[sub3]+" : Failed");
                
                }else Smenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to Second Year Summer (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers)){
                    Ssummer();}
                else if("N".equals(answers) || "n".equals(answers)){
                    Smenu();}
                else 
                    System.out.println("Invalid Input");
                    menu.menu();
            }else Smenu();
    }
    
    //SECOND YEAR , SUMMER
    public void Ssummer(){
        Sarray();
        System.out.println("=================================================================================================================================================");
        System.out.println("\nEnter you Grades for this Subject :");
        System.out.print("College Algebra :");
        math = input.nextDouble();
        
         System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
         System.out.print(" FIRSY YEAR,SECOND SEMESTER\n");
         if(math >=1.0 && math <=3.5){System.out.println(subject[1269]);t+=3;System.out.println(subject[1270]);t+=3;}
         System.out.println(subject[2085]);t+=3;
         System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     "+t+"\n");
         System.out.println("=================================================================================================================================================");
         System.out.println("Entered Range 1-3");
         
             int sub;
             for(int i = 1;i<=1;i++){
             System.out.print("Enter Subject Needed :");
             sub = input.nextInt();
             if(sub == 3){ss3();}
             else if(sub == 2){ss2();}
             else if(sub == 1){ss1();}
             else 
                 i-=1;System.out.println("INVALID INPUT");
             }
    }
    
    //NUMBERS OF SUBJECT ENTERED FOR SUMMER
    public void ss3(){
             Sarray();
             //OfferCode Area
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1269 || sub1 == 1270 || sub1 == 2085);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1269 || sub2 == 1270 || sub2 == 2085);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1269 || sub3 == 1270 || sub3 == 2085);
             else i-=1;
             }
              //SUBJECT ENTERED
              System.out.println("=================================================================================================================================================");
              System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" SECOND YEAR,SUMMER\n");
             if(sub1 == 1269){if(math >=1.0 && math <=3.5){System.out.println(subject[sub1]);o+=3;}else System.out.println("");}
             else if(sub1 == 1270){if(math >=1.0 && math <=3.5){System.out.println(subject[sub1]);o+=3;}else System.out.println("");}
             else if(sub1 == 2085){System.out.println(subject[sub1]);o+=3;}
             
             if(sub2 == 1269){if(math >=1.0 && math <=3.5){System.out.println(subject[sub2]);o+=3;}else System.out.println("");}
             else if(sub2 == 1270){if(math >=1.0 && math <=3.5){System.out.println(subject[sub2]);o+=3;}else System.out.println("");}
             else if(sub2 == 2085){System.out.println(subject[sub2]);o+=3;}
             
             if(sub3 == 1269){if(math >=1.0 && math <=3.5){System.out.println(subject[sub3]);o+=3;}else System.out.println("");}
             else if(sub3 == 1270){if(math >=75 && math <=100){System.out.println(subject[sub3]);o+=3;}else System.out.println("");}
             else if(sub3 == 2085){System.out.println(subject[sub3]);o+=3;}
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     "+o+"\n");
             System.out.println("=================================================================================================================================================");
             //FOR GRADES
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){

             System.out.print(subject[sub1]+" :");
             grade1 = input.nextDouble();
             System.out.print(subject[sub2]+" :");
             grade2 = input.nextDouble();
             System.out.print(subject[sub3]+" :");
             grade3 = input.nextDouble();
             //RESULT FOR ENTERED GRADES
             System.out.println("=================================================================================================================================================");
             System.out.print("\nSee the Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {
                
              if(grade1 >=1.0 && grade1 <=3.5)
                    System.out.println(subject[sub1]+" : Passed");
              else  System.out.println(subject[sub1]+" : Failed");

              if(grade2 >=1.0 && grade2<=3.5)
                    System.out.println(subject[sub2]+" : Passed");
              else  System.out.println(subject[sub2]+" : Failed");

              if(grade3 >=1.0 && grade3 <=3.5)
                    System.out.println(subject[sub3]+" : Passed");
              else  System.out.println(subject[sub3]+" : Failed");

             }else Smenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nProceed to Main Menu (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    menu.menu();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    Smenu();
                }
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);
           System.out.println("=================================================================================================================================================");
            }Smenu();
    }
    public void ss2(){
             Sarray();
             System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1269 || sub1 == 1270 || sub1 == 2085);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1269 || sub2 == 1270 || sub2 == 2085);
             else i-=1;
             }
             //SUBJECT ENTERED
              System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" SECOND YEAR,SUMMER\n");
             if(sub1 == 1269){if(math >=1.0 && math <=3.5){System.out.println(subject[sub1]);o+=3;}else System.out.println("");}
             else if(sub1 == 1270){if(math >=1.0 && math <=3.5){System.out.println(subject[sub1]);o+=3;}else System.out.println("");}
             else if(sub1 == 2085){System.out.println(subject[sub1]);o+=3;}
             
             if(sub2 == 1269){if(math >=1.0 && math <=3.5){System.out.println(subject[sub2]);o+=3;}else System.out.println("");}
             else if(sub2 == 1270){if(math >=1.0 && math <=3.5){System.out.println(subject[sub2]);o+=3;}else System.out.println("");}
             else if(sub2 == 2085){System.out.println(subject[sub2]);o+=3;}
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     "+o+"\n");
             //FOR GRADES
             System.out.println("=================================================================================================================================================");
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){

             System.out.print(subject[sub1]+" :");
             grade1 = input.nextDouble();
             System.out.print(subject[sub2]+" :");
             grade2 = input.nextDouble();
            
             //RESULT FOR ENTERED GRADES
             System.out.print("\n\nSee the Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {
                
              if(grade1 >=1.0 && grade1 <=3.5)
                    System.out.println(subject[sub1]+" : Passed");
              else  System.out.println(subject[sub1]+" : Failed");

              if(grade2 >=1.0 && grade2<=3.5)
                    System.out.println(subject[sub2]+" : Passed");
              else  System.out.println(subject[sub2]+" : Failed");
              }else Smenu();
             System.out.println("=================================================================================================================================================");
               System.out.print("\nProceed to Main Menu (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers)){
                    menu.menu();
                }
                else if("N".equals(answers) || "n".equals(answers)){
                    Smenu();
                }
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);
                    System.out.println("=================================================================================================================================================");
     }Smenu();
    }
    public void ss1(){
             Sarray();
             //OfferCode Area
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1269 || sub1 == 1270 || sub1 == 2085);
             else i-=1;
             }
             //SUBJECT ENTERED
              System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" SECOND YEAR,SUMMER\n");
             if(sub1 == 1269){if(math >=1.0 && math <=3.5){System.out.println(subject[sub1]);o+=3;}else System.out.println("");}
             else if(sub1 == 1270){if(math >=1.0 && math <=3.5){System.out.println(subject[sub1]);o+=3;}else System.out.println("");}
             else if(sub1 == 2085){System.out.println(subject[sub1]);o+=3;}
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     "+o+"\n");
             //FOR GRADES
             System.out.println("=================================================================================================================================================");
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){

             System.out.print(subject[sub1]+" :");
             grade1 = input.nextDouble();
             System.out.println("=================================================================================================================================================");
             //RESULT FOR ENTERED GRADES
             System.out.print("\n\nSee the Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {
                
              if(grade1 >=1.0 && grade1 <=3.5)
                    System.out.println(subject[sub1]+" : Passed");
              else  System.out.println(subject[sub1]+" : Failed");
            }else Smenu();
             System.out.println("=================================================================================================================================================");
               System.out.print("\nProceed to Main Menu (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers)){
                    menu.menu();
                }
                else if("N".equals(answers) || "n".equals(answers)){
                    Smenu();
                }
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);
                    System.out.println("=================================================================================================================================================");
      }Smenu();        
    }
}
