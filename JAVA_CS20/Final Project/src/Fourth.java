
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Fourth {
    Scanner input = new Scanner(System.in);
    Menu menu = new Menu();
    public static int sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9,num =0,totals = 0,total =0,toal = 0,tol = 0,sum1 =0,sum2 =0;
    public static double grade1 =0 , grade2 = 0 , grade3 = 0, grade4 = 0, grade5 = 0 , grade6 = 0 , grade7 = 0 , grade8 = 0 , grade9 = 0,elec =0,care =0,bio = 0,ncm4 = 0,ncm5 = 0,nres1 = 0;
    public static double a1 = 0, a2 = 0 , a3 = 0, a4 = 0;
    public static String[] subject = new String[5000];
    
    //LIST OF SUBJECT
    public void Uarray(){
        
        //FIRST SEMESTER
     subject[1276] = "  1276      NCM106       Care of Clients w/Problem in Cellular Aberration,"
            + "Acute Biologic Crisis,Including Emergency & Disaster Nursing     6     0     2    3         11            NCM104N,NCM105N,ELECTIVE1";
    subject[1278] = "  1278       NCM107A                   Nursing LeaderShip & Management(Lecture)                  4     0    0     0         4          ELECTIVE1";
    subject[1277] = "  1277       CA1                       Competency Appraisal 1                                    3     0    0     0         3          NCM104N,NCM105N";
    subject[2088] = "  2088       ELECTIVE2                 Elective Course 2(51 hours)                               3     0    0     0         3          ELECTIVE1";
    
    //SECOND SEMESTER
    
    
     subject[2090] = "  2090       NCM107B                   Nursing LeaderShip & Management(RLE)                     0     0    0     3         3          ELECTIVE1";
     subject[2089] = "  2089       INP                       Intensive Nursing Program (408 hrs)                      0     0    0     8         8          NCM106,NCM107,CA1";
     subject[1279] = "  1279       CA2                       Competency Appraisal 2                                   3     0    0     0         4          NCM106,NCM107,CA1";
    
    }
    
    //FOURTH YEAR MENU
    public void Umenu(){
    System.out.println("\nFourth Year Student\n");
        System.out.print("(A/a)First Semester\n(B/b)Second Semester\n(C/c)Main Menu\n(E/e)Exit\nEnter your choice :");
        String choice = input.next();
        
        if("A".equals(choice) || "a".equals(choice)){Usem1();}
        else if("B".equals(choice) || "b".equals(choice)){Usem2();}
        else if("C".equals(choice) || "c".equals(choice)){ menu.menu();}
        else if("E".equals(choice) || "e".equals(choice)){System.exit(0);}
        else System.out.print("\nInvalid Input\n");Umenu();
    
}
    
    //FIRST SEMESTER
    public void Usem1(){
        Uarray();
        System.out.println("=================================================================================================================================================");
        System.out.println("\nEnter your Grades for this Subjects :");
        System.out.print("Care of Clients w/Problem in Inflammatory"
            + "& Immuhologic Response, Perception & Coordination :");
        ncm4 = input.nextDouble();
        System.out.print("Care of Clients w/ Maladaptive Patterns of Behavior :");
        ncm5 = input.nextDouble();
        System.out.print("Elective Course 1 :");
        care = input.nextDouble();
        
        System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
         System.out.print(" FOURTH YEAR,FIRST SEMESTER\n");
         if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[1276]);total+=11;}else System.out.print("");
         if(care >=1.0 && care<=3.5){System.out.println(subject[1278]);total+=4;}else System.out.print("");
         if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[1277]);total+=3;}else System.out.print("");
         if(care >=1.0 && care<=3.5){System.out.println(subject[2088]);total+=3;}else System.out.print("");
         System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+total+"\n");
         System.out.println("=================================================================================================================================================");
         System.out.println("Entered Range 1-4");
         int sub;
             for(int i = 1;i<=1;i++){
             System.out.print("Enter Subject Needed :");
             sub = input.nextInt();
             if(sub == 4){U4();}
             else if(sub == 3){U3();}
             else if(sub == 2){U2();}
             else if(sub == 1){U1();}
             else 
                 i-=1;System.out.println("INVALID INPUT");
             }
    }
    
    //SUBJECTS ENTERED
    public void U4(){
             Uarray();
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1276 || sub1 == 1278 || sub1 == 1277 || sub1 == 2088);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1276 || sub2 == 1278 || sub2 == 1277 || sub2 == 2088);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1276 || sub3 == 1278 || sub3 == 1277 || sub3 == 2088);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 1276 || sub4 == 1278 || sub4 == 1277 || sub4 == 2088);
             else i-=1;
             }
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FOURTH YEAR,SECOND SEMESTER\n");
             
             if(sub1 == 1276){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub1]);totals+=11;}else System.out.print("");}
             else if(sub1 == 1278){if(care >=1.0 && care<=3.5){System.out.println(subject[sub1]);totals+=4;}else System.out.print("");}
             else if(sub1 == 1277){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub1]);totals+=3;}else System.out.print("");}
             else if(sub1 == 2088){if(care >=1.0 && care<=3.5){System.out.println(subject[sub1]);totals+=3;}else System.out.print("");}
             
             if(sub2 == 1276){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub2]);totals+=11;}else System.out.print("");}
             else if(sub2 == 1278){if(care >=1.0 && care<=3.5){System.out.println(subject[sub2]);totals+=4;}else System.out.print("");}
             else if(sub2 == 1277){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub2]);totals+=3;}else System.out.print("");}
             else if(sub2 == 2088){if(care >=1.0 && care<=3.5){System.out.println(subject[sub2]);totals+=3;}else System.out.print("");}
             
             if(sub3 == 1276){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub3]);totals+=11;}else System.out.print("");}
             else if(sub3 == 1278){if(care >=1.0 && care<=3.5){System.out.println(subject[sub3]);totals+=4;}else System.out.print("");}
             else if(sub3 == 1277){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub3]);totals+=3;}else System.out.print("");}
             else if(sub3 == 2088){if(care >=1.0 && care<=3.5){System.out.println(subject[sub3]);totals+=3;}else System.out.print("");}
             
             if(sub4 == 1276){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub4]);totals+=11;}else System.out.print("");}
             else if(sub4 == 1278){if(care >=1.0 && care<=3.5){System.out.println(subject[sub4]);totals+=4;}else System.out.print("");}
             else if(sub4 == 1277){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub4]);totals+=3;}else System.out.print("");}
             else if(sub4 == 2088){if(care >=1.0 && care<=3.5){System.out.println(subject[sub4]);totals+=3;}else System.out.print("");}
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+totals+"\n");
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
              
              if(grade4 >=1.0 && grade4 <=3.5)
                    System.out.println(subject[sub4]+" : Passed");
              else  System.out.println(subject[sub4]+" : Failed");

             }else Umenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nProceed to Second Semester (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    Usem2();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    Umenu();
                }
                else 
                    System.out.println("Invalid Input");
                    Umenu();
           System.out.println("=================================================================================================================================================");
            }Umenu();
    
    }
    public void U3(){
             Uarray();
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1276 || sub1 == 1278 || sub1 == 1277 || sub1 == 2088);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1276 || sub2 == 1278 || sub2 == 1277 || sub2 == 2088);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1276 || sub3 == 1278 || sub3 == 1277 || sub3 == 2088);
             else i-=1;
             }
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FOURTH YEAR,SECOND SEMESTER\n");
             
             if(sub1 == 1276){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub1]);totals+=11;}else System.out.print("");}
             else if(sub1 == 1278){if(care >=1.0 && care<=3.5){System.out.println(subject[sub1]);totals+=4;}else System.out.print("");}
             else if(sub1 == 1277){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub1]);totals+=3;}else System.out.print("");}
             else if(sub1 == 2088){if(care >=1.0 && care<=3.5){System.out.println(subject[sub1]);totals+=3;}else System.out.print("");}
             
             if(sub2 == 1276){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub2]);totals+=11;}else System.out.print("");}
             else if(sub2 == 1278){if(care >=1.0 && care<=3.5){System.out.println(subject[sub2]);totals+=4;}else System.out.print("");}
             else if(sub2 == 1277){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub2]);totals+=3;}else System.out.print("");}
             else if(sub2 == 2088){if(care >=1.0 && care<=3.5){System.out.println(subject[sub2]);totals+=3;}else System.out.print("");}
             
             if(sub3 == 1276){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub3]);totals+=11;}else System.out.print("");}
             else if(sub3 == 1278){if(care >=1.0 && care<=3.5){System.out.println(subject[sub3]);totals+=4;}else System.out.print("");}
             else if(sub3 == 1277){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub3]);totals+=3;}else System.out.print("");}
             else if(sub3 == 2088){if(care >=1.0 && care<=3.5){System.out.println(subject[sub3]);totals+=3;}else System.out.print("");}
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+totals+"\n");
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
              

             }else Umenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nProceed to Second Semester (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    Usem2();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    Umenu();
                }
                else 
                    System.out.println("Invalid Input");
                    Umenu();
           System.out.println("=================================================================================================================================================");
            }Umenu();
    
    }
    public void U2(){
             Uarray();
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1276 || sub1 == 1278 || sub1 == 1277 || sub1 == 2088);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1276 || sub2 == 1278 || sub2 == 1277 || sub2 == 2088);
             else i-=1;
             }
             
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FOURTH YEAR,SECOND SEMESTER\n");
             
             if(sub1 == 1276){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub1]);totals+=11;}else System.out.print("");}
             else if(sub1 == 1278){if(care >=1.0 && care<=3.5){System.out.println(subject[sub1]);totals+=4;}else System.out.print("");}
             else if(sub1 == 1277){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub1]);totals+=3;}else System.out.print("");}
             else if(sub1 == 2088){if(care >=1.0 && care<=3.5){System.out.println(subject[sub1]);totals+=3;}else System.out.print("");}
             
             if(sub2 == 1276){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub2]);totals+=11;}else System.out.print("");}
             else if(sub2 == 1278){if(care >=1.0 && care<=3.5){System.out.println(subject[sub2]);totals+=4;}else System.out.print("");}
             else if(sub2 == 1277){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub2]);totals+=3;}else System.out.print("");}
             else if(sub2 == 2088){if(care >=1.0 && care<=3.5){System.out.println(subject[sub2]);totals+=3;}else System.out.print("");}
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+totals+"\n");
             System.out.println("=================================================================================================================================================");
         
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){

             System.out.print(subject[sub1]+" :");
             grade1 = input.nextDouble();
             System.out.print(subject[sub2]+" :");
             grade2 = input.nextDouble();
             
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

             }else Umenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nProceed to Second Semester (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    Usem2();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    Umenu();
                }
                else 
                    System.out.println("Invalid Input");
                    Umenu();
           System.out.println("=================================================================================================================================================");
            }Umenu();
    
    }
    public void U1(){
    
             Uarray();
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1276 || sub1 == 1278 || sub1 == 1277 || sub1 == 2088);
             else i-=1;
             }
             
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FOURTH YEAR,SECOND SEMESTER\n");
             
             if(sub1 == 1276){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub1]);totals+=11;}else System.out.print("");}
             else if(sub1 == 1278){if(care >=1.0 && care<=3.5){System.out.println(subject[sub1]);totals+=4;}else System.out.print("");}
             else if(sub1 == 1277){if(ncm4 >=1.0 && ncm4<=3.5 && ncm5>=1.0 && ncm5<=3.5 && care >=1.0 && care<=3.5){System.out.println(subject[sub1]);totals+=3;}else System.out.print("");}
             else if(sub1 == 2088){if(care >=1.0 && care<=3.5){System.out.println(subject[sub1]);totals+=3;}else System.out.print("");}
             
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+totals+"\n");
             System.out.println("=================================================================================================================================================");
         
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){

             System.out.print(subject[sub1]+" :");
             grade1 = input.nextDouble();
             
             //RESULT FOR ENTERED GRADES
             System.out.println("=================================================================================================================================================");
             System.out.print("\nSee the Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {
                
              if(grade1 >=1.0 && grade1 <=3.5)
                    System.out.println(subject[sub1]+" : Passed");
              else  System.out.println(subject[sub1]+" : Failed");


             }else Umenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nProceed to Second Semester (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    Usem2();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    Umenu();
                }
                else 
                    System.out.println("Invalid Input");
                    Umenu();
           System.out.println("=================================================================================================================================================");
            }Umenu();
    
    }
    
    
    public void Usem2(){
        Uarray();
        System.out.println("=================================================================================================================================================");
        System.out.println("\nEnter your Grades for this Subjects :");
        System.out.print("Elective Course 1 :");
        a1 = input.nextDouble();
        System.out.print("Care of Clients w/Problem in Cellular Aberration,"
            + "Acute Biologic Crisis,Including Emergency & Disaster Nursing  :");
        a2 = input.nextDouble();
        System.out.print("Nursing LeaderShip & Management(Lecture) :");
        a3 = input.nextDouble();
        System.out.print("Competency Appraisal 1 :");
        a4 = input.nextDouble();
        
        System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
         System.out.print(" FOURTH YEAR,SECOND SEMESTER\n");
         if(a1 >=1.0 && a2<=3.5){System.out.println(subject[2090]);toal+=3;}else System.out.print("");
         if(a2>=1.0 && a2<=3.5 && a3 >=1.0 && a3<=3.5 && a4>=1.0 && a4<=3.5){System.out.println(subject[2089]);toal+=8;}else System.out.print("");
         if(a2>=1.0 && a2<=3.5 && a3 >=1.0 && a3<=3.5 && a4>=1.0 && a4<=3.5){System.out.println(subject[1279]);toal+=3;}else System.out.print("");
         System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+toal+"\n");
         System.out.println("=================================================================================================================================================");
         System.out.println("Entered Range 1-3");
         int sub;
             for(int i = 1;i<=1;i++){
             System.out.print("Enter Subject Needed :");
             sub = input.nextInt();
             if(sub == 3){u3();}
             else if(sub == 2){u2();}
             else if(sub == 1){u1();}
             else 
                 i-=1;System.out.println("INVALID INPUT");
             }
    }
    
    public void u3(){
              Uarray();
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 2090 || sub1 == 2089 || sub1 == 1279);
             else i-=1;
             }
              for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 2090 || sub2 == 2089 || sub2 == 1279);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 2090 || sub3 == 2089 || sub3 == 1279);
             else i-=1;
             }
             
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FOURTH YEAR,SECOND SEMESTER\n");
             
             if(sub1 == 2090){if(a1 >=1.0 && a2<=3.5){System.out.println(subject[sub1]);tol+=3;}else System.out.print("");}
             else if(sub1 == 2089){if(a2>=1.0 && a2<=3.5 && a3 >=1.0 && a3<=3.5 && a4>=1.0 && a4<=3.5){System.out.println(subject[sub1]);tol+=8;}else System.out.print("");}
             else if(sub1 == 1279){if(a2>=1.0 && a2<=3.5 && a3 >=1.0 && a3<=3.5 && a4>=1.0 && a4<=3.5){System.out.println(subject[sub1]);tol+=3;}else System.out.print("");}
             
             if(sub2 == 2090){if(a1 >=1.0 && a2<=3.5){System.out.println(subject[sub2]);tol+=3;}else System.out.print("");}
             else if(sub2 == 2089){if(a2>=1.0 && a2<=3.5 && a3 >=1.0 && a3<=3.5 && a4>=1.0 && a4<=3.5){System.out.println(subject[sub2]);tol+=8;}else System.out.print("");}
             else if(sub2 == 1279){if(a2>=1.0 && a2<=3.5 && a3 >=1.0 && a3<=3.5 && a4>=1.0 && a4<=3.5){System.out.println(subject[sub2]);tol+=3;}else System.out.print("");}
             
             if(sub3 == 2090){if(a1 >=1.0 && a2<=3.5){System.out.println(subject[sub3]);tol+=3;}else System.out.print("");}
             else if(sub3 == 2089){if(a2>=1.0 && a2<=3.5 && a3 >=1.0 && a3<=3.5 && a4>=1.0 && a4<=3.5){System.out.println(subject[sub3]);tol+=8;}else System.out.print("");}
             else if(sub3 == 1279){if(a2>=1.0 && a2<=3.5 && a3 >=1.0 && a3<=3.5 && a4>=1.0 && a4<=3.5){System.out.println(subject[sub3]);tol+=3;}else System.out.print("");}
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+tol+"\n");
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
              

             }else Umenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nProceed to Main Menu (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    Umenu();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    System.exit(0);
                }
                else 
                    System.out.println("Invalid Input");
                    Umenu();
           System.out.println("=================================================================================================================================================");
            }Umenu();
    
    }
    public void u2(){
    Uarray();
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 2090 || sub1 == 2089 || sub1 == 1279);
             else i-=1;
             }
              for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 2090 || sub2 == 2089 || sub2 == 1279);
             else i-=1;
             }
             
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FOURTH YEAR,SECOND SEMESTER\n");
             
             if(sub1 == 2090){if(a1 >=1.0 && a2<=3.5){System.out.println(subject[sub1]);tol+=3;}else System.out.print("");}
             else if(sub1 == 2089){if(a2>=1.0 && a2<=3.5 && a3 >=1.0 && a3<=3.5 && a4>=1.0 && a4<=3.5){System.out.println(subject[sub1]);tol+=8;}else System.out.print("");}
             else if(sub1 == 1279){if(a2>=1.0 && a2<=3.5 && a3 >=1.0 && a3<=3.5 && a4>=1.0 && a4<=3.5){System.out.println(subject[sub1]);tol+=3;}else System.out.print("");}
             
             if(sub2 == 2090){if(a1 >=1.0 && a2<=3.5){System.out.println(subject[sub2]);tol+=3;}else System.out.print("");}
             else if(sub2 == 2089){if(a2>=1.0 && a2<=3.5 && a3 >=1.0 && a3<=3.5 && a4>=1.0 && a4<=3.5){System.out.println(subject[sub2]);tol+=8;}else System.out.print("");}
             else if(sub2 == 1279){if(a2>=1.0 && a2<=3.5 && a3 >=1.0 && a3<=3.5 && a4>=1.0 && a4<=3.5){System.out.println(subject[sub2]);tol+=3;}else System.out.print("");}
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+tol+"\n");
             System.out.println("=================================================================================================================================================");
         
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){

             System.out.print(subject[sub1]+" :");
             grade1 = input.nextDouble();
             System.out.print(subject[sub2]+" :");
             grade2 = input.nextDouble();
             
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

             }else Umenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nProceed to Main Menu (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    Umenu();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    System.exit(0);
                }
                else 
                    System.out.println("Invalid Input");
                    Umenu();
           System.out.println("=================================================================================================================================================");
            }Umenu();
    
    
    }
    public void u1(){
             Uarray();
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 2090 || sub1 == 2089 || sub1 == 1279);
             else i-=1;
             }
             
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FOURTH YEAR,SECOND SEMESTER\n");
             
             if(sub1 == 2090){if(a1 >=1.0 && a2<=3.5){System.out.println(subject[sub1]);tol+=3;}else System.out.print("");}
             else if(sub1 == 2089){if(a2>=1.0 && a2<=3.5 && a3 >=1.0 && a3<=3.5 && a4>=1.0 && a4<=3.5){System.out.println(subject[sub1]);tol+=8;}else System.out.print("");}
             else if(sub1 == 1279){if(a2>=1.0 && a2<=3.5 && a3 >=1.0 && a3<=3.5 && a4>=1.0 && a4<=3.5){System.out.println(subject[sub1]);tol+=3;}else System.out.print("");}
             
             if(sub2 == 2090){if(a1 >=1.0 && a2<=3.5){System.out.println(subject[sub2]);tol+=3;}else System.out.print("");}
             else if(sub2 == 2089){if(a2>=1.0 && a2<=3.5 && a3 >=1.0 && a3<=3.5 && a4>=1.0 && a4<=3.5){System.out.println(subject[sub2]);tol+=8;}else System.out.print("");}
             else if(sub2 == 1279){if(a2>=1.0 && a2<=3.5 && a3 >=1.0 && a3<=3.5 && a4>=1.0 && a4<=3.5){System.out.println(subject[sub2]);tol+=3;}else System.out.print("");}
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+tol+"\n");
             System.out.println("=================================================================================================================================================");
         
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){

             System.out.print(subject[sub1]+" :");
             grade1 = input.nextDouble();
   
             //RESULT FOR ENTERED GRADES
             System.out.println("=================================================================================================================================================");
             System.out.print("\nSee the Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {
                
              if(grade1 >=1.0 && grade1 <=3.5)
                    System.out.println(subject[sub1]+" : Passed");
              else  System.out.println(subject[sub1]+" : Failed");


             }else Umenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nProceed to Main Menu (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    Umenu();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    System.exit(0);
                }
                else 
                    System.out.println("Invalid Input");
                    Umenu();
           System.out.println("=================================================================================================================================================");
            }Umenu();
    
    
    
    }
}
