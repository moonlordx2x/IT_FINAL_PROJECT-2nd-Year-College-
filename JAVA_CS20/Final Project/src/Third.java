
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
public class Third {
    Menu menu = new Menu();
    Scanner input = new Scanner(System.in);
    public static int sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9,num =0,totals = 0,total =0,toal = 0,tol = 0,sum1 =0,sum2 =0;
    public static double grade1 =0 , grade2 = 0 , grade3 = 0, grade4 = 0, grade5 = 0 , grade6 = 0 , grade7 = 0 , grade8 = 0 , grade9 = 0,ncm =0,care =0,bio = 0,ncm4 = 0,ncm5 = 0,nres1 = 0;
    public static String[] subject = new String[5000];
    
    //SUBJECT LIST
    public void Tarray(){
        //FIRST
    subject[1272] = "  1272      NCM103N       Care of Clients w/Problem in Oxygenation,fluid"
            + "& Electrolyte Balance, Metabolism & Edocrine        8     0     1    5         14            NCM102N";
    subject[1271] = "  1271       Humanities                Humanities(World Civilization and Literature)             3     0    0     0         3          NONE";
    subject[1062] = "  1062       RIZAL                     Life & Works of Dr.Jose Rizal                             3     0    0     0         3          NONE";
    
    //SECOND
    subject[1273] = "  1273      NCM104N       Care of Clients w/Problem in Inflammatory"
            + "& Immuhologic Response, Perception & Coordination     5     0     1    3         9            NCM103N";
    subject[1274] = "  1274      NCM105N       Care of Clients w/ Maladaptive Patterns of Behavior                    4     0    0     2         6          NCM103N";
    subject[1978] = "  1978       NRES1                     Nursing Research 1                                        3     0    0     0         3          BIOSTAT";
    subject[1275] = "  1275       PHILHIST                  Phillipine History, Government & Constitution             3     0    0     0         3          NONE";
    
    //SUMMER
    subject[2086] = "  2086       NRES2                     Nursing Research 2                                        3     0    0     0         3          NRES1";
    subject[2087] = "  2087       ELECTIVE1                 Elective Course 1(51 hours)                               3     0    0     0         3          NCM104N,NCM105N";
    }
    
    //THIRD YEAR MENU
    public void Tmenu(){
        
        System.out.println("\nThird Year Student\n");
        System.out.print("(A/a)First Semester\n(B/b)Second Semester\n(C/c)Summer\n(D/d)Main Menu\n(E/e)Exit\nEnter your choice :");
        String choice = input.next();
        
             if("A".equals(choice) || "a".equals(choice)){Tsem1();}
        else if("B".equals(choice) || "b".equals(choice)){Tsem2();}
        else if("C".equals(choice) || "c".equals(choice)){Tsummer();}
        else if("D".equals(choice) || "d".equals(choice)){menu.menu();}
        else if("E".equals(choice) || "e".equals(choice)){System.exit(0);}
        else System.out.print("\nInvalid Input\n");Tmenu();
    }
   
    //THIRD YEAR FIRST SEMESTER
    public void Tsem1(){
        Tarray();
    System.out.println("=================================================================================================================================================");
        System.out.println("\nEnter your Grades for this Subjects :");
        System.out.print("Care of Mother,Child & Family&Population Group at rick or w/Problems :");
        ncm = input.nextDouble();
        System.out.println("=================================================================================================================================================");
        
        System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
         System.out.print(" THIRD YEAR,FIRST SEMESTER\n");
         if(ncm >=1.0 && ncm <=3.5){System.out.println(subject[1272]);total+=14;}else System.out.print("");
         System.out.println(subject[1271]);total+=3;
         System.out.println(subject[1062]);total+=3;
         System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+total+"\n");
         System.out.println("=================================================================================================================================================");
         System.out.println("Entered Range 1-3");
             int sub;
             for(int i = 1;i<=1;i++){
             System.out.print("Enter Subject Needed :");
             sub = input.nextInt();
             if(sub == 3){T3();}
             else if(sub == 2){T2();}
             else if(sub == 1){T1();}
             else 
                 i-=1;System.out.println("INVALID INPUT");
             }
         
    }
    
    //SUBJECTS ENTERED
    public void T3(){
        Tarray();
          System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1272 || sub1 == 1271 || sub1 == 1062);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1272 || sub2 == 1271 || sub2 == 1062);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1272 || sub3 == 1271 || sub3 == 1062);
             else i-=1;
             }
             
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" THIRD YEAR,SECOND SEMESTER\n");
             
             if(sub1 == 1272){if(ncm >=1.0 && ncm <=3.5){System.out.println(subject[sub1]);totals+=14;}else System.out.print("");}
             else if(sub1 == 1271){System.out.println(subject[sub1]);totals+=3;}
             else if(sub1 == 1062){System.out.println(subject[sub1]);totals+=3;}
             
             if(sub2 == 1272){if(ncm >=1.0 && ncm <=3.5){System.out.println(subject[sub2]);totals+=14;}else System.out.print("");}
             else if(sub2 == 1271){System.out.println(subject[sub2]);totals+=3;}
             else if(sub2 == 1062){System.out.println(subject[sub2]);totals+=3;}
             
             if(sub3 == 1272){if(ncm >=1.0 && ncm <=3.5){System.out.println(subject[sub3]);totals+=14;}else System.out.print("");}
             else if(sub3 == 1271){System.out.println(subject[sub3]);totals+=3;}
             else if(sub3 == 1062){System.out.println(subject[sub3]);totals+=3;}
             
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

             }else Tmenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nProceed to Second Semester (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    Tsem2();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    Tmenu();
                }
                else 
                    System.out.println("Invalid Input");
                    Tmenu();
           System.out.println("=================================================================================================================================================");
            }Tmenu();
    
 }
    public void T2(){
             Tarray();
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1272 || sub1 == 1271 || sub1 == 1062);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1272 || sub2 == 1271 || sub2 == 1062);
             else i-=1;
             }
             
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" THIRD YEAR,SECOND SEMESTER\n");
             
             if(sub1 == 1272){if(ncm >=1.0 && ncm <=3.5){System.out.println(subject[sub1]);totals+=14;}else System.out.print("");}
             else if(sub1 == 1271){System.out.println(subject[sub1]);totals+=3;}
             else if(sub1 == 1062){System.out.println(subject[sub1]);totals+=3;}
             
             if(sub2 == 1272){if(ncm >=1.0 && ncm <=3.5){System.out.println(subject[sub2]);totals+=14;}else System.out.print("");}
             else if(sub2 == 1271){System.out.println(subject[sub2]);totals+=3;}
             else if(sub2 == 1062){System.out.println(subject[sub2]);totals+=3;}
             
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

             }else Tmenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nProceed to Second Semester (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    Tsem2();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    Tmenu();
                }
                else 
                    System.out.println("Invalid Input");
                    Tmenu();
           System.out.println("=================================================================================================================================================");
            }Tmenu();
    
    }
    public void T1(){
             Tarray();
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1272 || sub1 == 1271 || sub1 == 1062);
             else i-=1;
             }
              System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" THIRD YEAR,SECOND SEMESTER\n");
             
             if(sub1 == 1272){if(ncm >=1.0 && ncm <=3.5){System.out.println(subject[sub1]);totals+=14;}else System.out.print("");}
             else if(sub1 == 1271){System.out.println(subject[sub1]);totals+=3;}
             else if(sub1 == 1062){System.out.println(subject[sub1]);totals+=3;}
             
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

             }else Tmenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nProceed to Second Semester (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    Tsem2();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    Tmenu();
                }
                else 
                    System.out.println("Invalid Input");
                    Tmenu();
           System.out.println("=================================================================================================================================================");
            }Tmenu();
    
             
    }
    
    //THIRD YEAR SECOND SEMESTER
    public void Tsem2(){
    Tarray();
    System.out.println("=================================================================================================================================================");
    System.out.println("\nEnter your Grades for this Subjects :");
        System.out.print("Care of Clients w/Problem in Oxygenation,fluid"
            + "& Electrolyte Balance, Metabolism & Edocrine  :");
        care = input.nextDouble();
        System.out.print("Biostatistics  :");
        bio = input.nextDouble();
        
        System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
         System.out.print(" THIRD YEAR,SECOND SEMESTER\n");
        if(care >= 1.0 && care <=3.5){System.out.println(subject[1273]);toal+=9;System.out.println(subject[1274]);toal+=6;}else System.out.print("");
        if(bio >=1.0 && bio <=3.5){System.out.println(subject[1978]);toal+=3;}else System.out.print("");
        System.out.println(subject[1275]);toal+=3;
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+toal+"\n");
        System.out.println("=================================================================================================================================================");
         System.out.println("Entered Range 1-4");
             int sub;
             for(int i = 1;i<=1;i++){
             System.out.print("Enter Subject Needed :");
             sub = input.nextInt();
             if(sub == 4){t4();}
             else if(sub == 3){t3();}
             else if(sub == 2){t2();}
             else if(sub == 1){t1();}
             else 
                 i-=1;System.out.println("INVALID INPUT");
             }
    }
    
    //SUBJECTS ENTERED
    public void t4(){
             Tarray();
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1273 || sub1 == 1274 || sub1 == 1978 || sub1 == 1275);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1273 || sub2 == 1274 || sub2 == 1978 || sub2 == 1275);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1273 || sub3 == 1274 || sub3 == 1978 || sub3 == 1275);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 1273 || sub4 == 1274 || sub4 == 1978 || sub4 == 1275);
             else i-=1;
             }
             
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" THIRD YEAR,SECOND SEMESTER\n");
             
             if(sub1 == 1273){if(care >=1.0 && care <=3.5){System.out.println(subject[sub1]);tol+=9;}else System.out.print("");}
             else if(sub1 == 1274){if(care >=1.0 && care <=3.5){System.out.println(subject[sub1]);tol+=6;}else System.out.print("");}
             else if(sub1 == 1978){System.out.println(subject[sub1]);tol+=3;}
             else if(sub1 == 1275){System.out.println(subject[sub1]);tol+=3;}
             
             if(sub2 == 1273){if(care >=1.0 && care <=3.5){System.out.println(subject[sub2]);tol+=9;}else System.out.print("");}
             else if(sub2 == 1274){if(care >=1.0 && care <=3.5){System.out.println(subject[sub2]);tol+=6;}else System.out.print("");}
             else if(sub2 == 1978){System.out.println(subject[sub2]);tol+=3;}
             else if(sub2 == 1275){System.out.println(subject[sub2]);tol+=3;}
             
             if(sub3 == 1273){if(care >=1.0 && care <=3.5){System.out.println(subject[sub3]);tol+=9;}else System.out.print("");}
             else if(sub3 == 1274){if(care >=1.0 && care <=3.5){System.out.println(subject[sub3]);tol+=6;}else System.out.print("");}
             else if(sub3 == 1978){System.out.println(subject[sub3]);tol+=3;}
             else if(sub3 == 1275){System.out.println(subject[sub3]);tol+=3;}
             
             if(sub4 == 1273){if(care >=1.0 && care <=3.5){System.out.println(subject[sub4]);tol+=9;}else System.out.print("");}
             else if(sub4 == 1274){if(care >=1.0 && care <=3.5){System.out.println(subject[sub4]);tol+=6;}else System.out.print("");}
             else if(sub4 == 1978){System.out.println(subject[sub4]);tol+=3;}
             else if(sub4 == 1275){System.out.println(subject[sub4]);tol+=3;}
             
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

             }else Tmenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nProceed to Summer (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    Tsummer();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    Tmenu();
                }
                else 
                    System.out.println("Invalid Input");
                    Tmenu();
           System.out.println("=================================================================================================================================================");
            }Tmenu();
    
    }
    public void t3(){
             Tarray();
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1273 || sub1 == 1274 || sub1 == 1978 || sub1 == 1275);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1273 || sub2 == 1274 || sub2 == 1978 || sub2 == 1275);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1273 || sub3 == 1274 || sub3 == 1978 || sub3 == 1275);
             else i-=1;
             }
             
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" THIRD YEAR,SECOND SEMESTER\n");
             
             if(sub1 == 1273){if(care >=1.0 && care <=3.5){System.out.println(subject[sub1]);tol+=9;}else System.out.print("");}
             else if(sub1 == 1274){if(care >=1.0 && care <=3.5){System.out.println(subject[sub1]);tol+=6;}else System.out.print("");}
             else if(sub1 == 1978){System.out.println(subject[sub1]);tol+=3;}
             else if(sub1 == 1275){System.out.println(subject[sub1]);tol+=3;}
             
             if(sub2 == 1273){if(care >=1.0 && care <=3.5){System.out.println(subject[sub2]);tol+=9;}else System.out.print("");}
             else if(sub2 == 1274){if(care >=1.0 && care <=3.5){System.out.println(subject[sub2]);tol+=6;}else System.out.print("");}
             else if(sub2 == 1978){System.out.println(subject[sub2]);tol+=3;}
             else if(sub2 == 1275){System.out.println(subject[sub2]);tol+=3;}
             
             if(sub3 == 1273){if(care >=1.0 && care <=3.5){System.out.println(subject[sub3]);tol+=9;}else System.out.print("");}
             else if(sub3 == 1274){if(care >=1.0 && care <=3.5){System.out.println(subject[sub3]);tol+=6;}else System.out.print("");}
             else if(sub3 == 1978){System.out.println(subject[sub3]);tol+=3;}
             else if(sub3 == 1275){System.out.println(subject[sub3]);tol+=3;}
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+tol+"\n");
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

             }else Tmenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nProceed to Summer (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    Tsummer();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    Tmenu();
                }
                else 
                    System.out.println("Invalid Input");
                    Tmenu();
           System.out.println("=================================================================================================================================================");
            }Tmenu();
    
    }
    public void t2(){
             Tarray();
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1273 || sub1 == 1274 || sub1 == 1978 || sub1 == 1275);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1273 || sub2 == 1274 || sub2 == 1978 || sub2 == 1275);
             else i-=1;
             }
             
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" THIRD YEAR,SECOND SEMESTER\n");
             
             if(sub1 == 1273){if(care >=1.0 && care <=3.5){System.out.println(subject[sub1]);tol+=9;}else System.out.print("");}
             else if(sub1 == 1274){if(care >=1.0 && care <=3.5){System.out.println(subject[sub1]);tol+=6;}else System.out.print("");}
             else if(sub1 == 1978){System.out.println(subject[sub1]);tol+=3;}
             else if(sub1 == 1275){System.out.println(subject[sub1]);tol+=3;}
             
             if(sub2 == 1273){if(care >=1.0 && care <=3.5){System.out.println(subject[sub2]);tol+=9;}else System.out.print("");}
             else if(sub2 == 1274){if(care >=1.0 && care <=3.5){System.out.println(subject[sub2]);tol+=6;}else System.out.print("");}
             else if(sub2 == 1978){System.out.println(subject[sub2]);tol+=3;}
             else if(sub2 == 1275){System.out.println(subject[sub2]);tol+=3;}
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+tol+"\n");
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

             }else Tmenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nProceed to Summer (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    Tsummer();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    Tmenu();
                }
                else 
                    System.out.println("Invalid Input");
                    Tmenu();
           System.out.println("=================================================================================================================================================");
            }Tmenu();
    
    }
    public void t1(){
             Tarray();
             System.out.println("=================================================================================================================================================");
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1273 || sub1 == 1274 || sub1 == 1978 || sub1 == 1275);
             else i-=1;
             }
             
             System.out.println("=================================================================================================================================================");
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" THIRD YEAR,SECOND SEMESTER\n");
             
             if(sub1 == 1273){if(care >=1.0 && care <=3.5){System.out.println(subject[sub1]);tol+=9;}else System.out.print("");}
             else if(sub1 == 1274){if(care >=1.0 && care <=3.5){System.out.println(subject[sub1]);tol+=6;}else System.out.print("");}
             else if(sub1 == 1978){System.out.println(subject[sub1]);tol+=3;}
             else if(sub1 == 1275){System.out.println(subject[sub1]);tol+=3;}
             
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+tol+"\n");
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

             }else Tmenu();
             System.out.println("=================================================================================================================================================");
             System.out.print("\nProceed to Summer (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    Tsummer();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    Tmenu();
                }
                else 
                    System.out.println("Invalid Input");
                    Tmenu();
           System.out.println("=================================================================================================================================================");
            }Tmenu();
    
    }
    
    public void Tsummer(){
    Tarray();
    System.out.println("=================================================================================================================================================");
    System.out.println("\nEnter your Grades for this Subjects :");
        System.out.print("Care of Clients w/Problem in Inflammatory"
            + "& Immuhologic Response, Perception & Coordination : ");
        ncm4 = input.nextDouble();
        System.out.print("Care of Clients w/ Maladaptive Patterns of Behavior :");
        ncm5 = input.nextDouble();
        System.out.print("Nursing Research 1 :");
        nres1 = input.nextDouble();
        
        System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
         System.out.print(" THIRD YEAR,SUMMER\n");
         if(ncm4 >=1.0 && ncm4 <=3.5 && ncm5 >=1.0 && ncm5 <=3.5){System.out.println(subject[2087]);sum1+=3;}else System.out.print("");
         if(nres1 >=1.0 && nres1 <=3.5){System.out.println(subject[2086]);sum1+=3;}else System.out.print("");
         System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+sum1+"\n");
         System.out.println("=================================================================================================================================================");
        System.out.print("Enter your Grades (Y/y || N/n):");
        String answer = input.next();
        
        if("Y".equals(answer) || "y".equals(answer)){
            if(ncm4 >=1.0 && ncm4 <=3.5 && ncm5 >=1.0 && ncm5 <=3.5){
                System.out.print(subject[2087]+" :");
                grade1 = input.nextDouble();}
            
            if(nres1 >=1.0 && nres1 <=3.5){
                System.out.print(subject[2086]+" :");
                grade2 = input.nextDouble();}
            System.out.println("=================================================================================================================================================");
            System.out.print("\nSee The Result (Y/y || N/n) :");
            String ans = input.next();
            if("Y".equals(ans) || "y".equals(ans)){
              if(grade1 >=1.0 && grade1 <=3.5){
                System.out.println(subject[2087]+" : Passed");
            }
              else
                    System.out.println(subject[2087]+" : Failed");
            }
            if(grade2 >=1.0 && grade2 <=3.5){
                System.out.println(subject[2086]+" :Passed");
            }
            else 
                System.out.println(subject[2086]+" : Failed");
        }else Tmenu();
        System.out.println("=================================================================================================================================================");
                System.out.print("\nProceed to Main Menu (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                   menu.menu();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    Tmenu();
                }
                else 
                    System.exit(0);
        System.out.println("=================================================================================================================================================");
    }
    
}
