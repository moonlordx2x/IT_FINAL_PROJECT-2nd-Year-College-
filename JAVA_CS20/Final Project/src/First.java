
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
public class First {
    INDEX main = new INDEX();
    Menu menu = new Menu();
    Scanner input = new Scanner(System.in);
    public static String[] subjects = new String[5000];
    public static String[] summer = new String[5000];
    
    public static int sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9,sub10,num =0,totals = 0,total =0,totalsz = 0;
    public static double grade1 =0 , grade2 = 0 , grade3 = 0, grade4 = 0, grade5 = 0 , grade6 = 0 , grade7 = 0 , grade8 = 0 , grade9 = 0;
    public static double english = 0,filipino = 0,nurse = 0,nstp = 0;
    public static String subton1;
    
    
    //LIST OF SUBJECTS
    public void Farray(){
    subjects[4545] = "________________________________________________________________________________________________________________________________________"; 
        subjects[1083] = "  1083          ENG1                   Study & Thinking Skills in English                        3     0     0    0         3            EPP";
        subjects[1570] = "  1570          FIL2                   Pagbasa at Pagsulat Tungo sa Pananaliksik                 3     0     0    0         3            FIL1";
        subjects[1975] = "  1975          SOCSC3                 Society &Culture w/Family Planning&Drug Abuse Prevention  3     0     0    0         3            NONE";
        subjects[1205] = "  1205          HUM1                   Philosophy & Logic                                        3     0     0    0         3            NONE";
        subjects[1003] = "  1003          BIO1                   Human Anatomy & Physiology                                3     2     0    0         5            NONE";
        subjects[1263] = "  1263          NCM100N                Fundamentals of Nursing Practice                          3     2     0    0         5            TFN";
        subjects[1050] = "  1050          PE2                    Rhythmic Activities & Aquatics                            0     2     0    0         2            NONE";
        subjects[1256] = "  1256          REED2                  The Apostolic Life & Teachings of Pope John Paul          3     0     0    0         3            NONE";
        subjects[1242] = "  1242          NSTP2-CWTS             Civic Welfare Training Services 1                         3     0     0    0         3            NSTP1-CWTS";
        subjects[2172] = "  2172          NSTP2-LTS              Literacy Training Services 1                                                                      NSTP1-LTS";
        subjects[3535] = "----------------------------------------------------------------------------------------------------------------------------------------";
        
        summer[4545] = "______________________________________________________________________________________________________________________";
        summer[1265] = " 1265          HA                     Health Assessment                    \t\t         2     0     1    0         3            NCM100N,BIO1";
        summer[1010] = " 1010          CHEM2                  Biochemistry                         \t\t         3     2     0    0         5            CHEM1";
        summer[3535] = "----------------------------------------------------------------------------------------------------------------------";
         
        
        subjects[2224] = "  2224         EPP                      English Proficiency Program                               3     0     0    0         3            NONE";
        subjects[1133] = "  1133         FIL1                     Komunikasyon sa Akademikong Pilipino                      3     0     0    0         3            NONE";
        subjects[1173] = "  1173         MATH1                    College Algebra                                           3     0     0    0         3            NONE";
        subjects[1009] = "  1009         CHEM1                    General Chemistry(Organic & Inorganic)                    3     2     0    0         5            NONE";
        subjects[1232] = "  1232         TFN                      Theoretical Foundations in Nursing                        3     0     0    0         3            NONE";
        subjects[1227] = "  1227         PHILO1                   Philosophy of Man                                         3     0     0    0         3            NONE";
        subjects[1103] = "  1103         SOCSC1                   General Psychology                                        3     0     0    0         3            NONE";
        subjects[1202] = "  1202         PE1                      Self-Testing Activities and Gymnastics                    0     2     0    0         2            NONE";
        subjects[1135] = "  1135         REED1                    The Encyclical Life & Teachings of Pope John Paul II      3     0     0    0         3            NONE";
        subjects[1048] = "  1048         NSTP1-CWTS               Civic Welfare Training Services 1                         3     0     0    0                      NONE";
        subjects[2171] = "  2171         NSTP1-LTS                Literacy Training Services 1                              3     0     0    0         3            NONE";
        
    }
    
    //SEMESTER MENU
    public void Fmenu(){
        //Semester Menu
        System.out.println("\nFirst Year Student\n");
         System.out.print("(A/a)First Semester\n(B/b)Second Semester\n(C/c)Summer\n(D/d)Main Menu\n(E/e)Exit\nEnter your choice :");
        String choice = input.next();
        
         if("A".equals(choice) || "a".equals(choice)){sem1(); }
         else if("B".equals(choice) || "b".equals(choice)){sem2();}
         else if("C".equals(choice) || "c".equals(choice)){ summer();}
         else if("D".equals(choice) || "d".equals(choice)){menu.menu();}
         else if("E".equals(choice) || "e".equals(choice)){ System.exit(0);}
         else System.out.print("\nInvalid Input\n");Fmenu();
    }
    
    //FIRST YEAR FIRST SEMESTER
    public void sem1(){
        System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
         System.out.print(" FIRSY YEAR,FIRST SEMESTER\n");
        System.out.println("2224         EPP                      English Proficiency Program                               3     0     0    0         3            NONE");
        System.out.println("1133         FIL1                     Komunikasyon sa Akademikong Pilipino                      3     0     0    0         3            NONE");
        System.out.println("1173         MATH1                    College Algebra                                           3     0     0    0         3            NONE");
        System.out.println("1009         CHEM1                    General Chemistry(Organic & Inorganic)                    3     2     0    0         5            NONE");
        System.out.println("1232         TFN                      Theoretical Foundations in Nursing                        3     0     0    0         3            NONE");
        System.out.println("1227         PHILO1                   Philosophy of Man                                         3     0     0    0         3            NONE");
        System.out.println("1103         SOCSC1                   General Psychology                                        3     0     0    0         3            NONE");
        System.out.println("1202         PE1                      Self-Testing Activities and Gymnastics                    0     2     0    0         2            NONE");
        System.out.println("1135         REED1                    The Encyclical Life & Teachings of Pope John Paul II      3     0     0    0         3            NONE");
        System.out.println("1048         NSTP1-CWTS               Civic Welfare Training Services 1                         3     0     0    0                      NONE");
        System.out.println("2171         NSTP1-LTS                Literacy Training Services 1                              3     0     0    0         3            NONE");
        
        
        
        System.out.println("Entered Range 1-10");
         int sub;
             for(int i = 1;i<=1;i++){
             System.out.print("Enter Subject Needed :");
             String subton = input.next();
             if("9".equals(subton)){Snine1();}
             else if("10".equals(subton)){Sten1();}
             else if("8".equals(subton)){Seight1();}
             else if("7".equals(subton)){Sseven1();}
             else if("6".equals(subton)){Ssix1();}
             else if("5".equals(subton)){Sfive1();}
             else if("4".equals(subton)){Sfour1();}
             else if("3".equals(subton)){Sthree1();}
             else if("2".equals(subton)){Stwo1();}
             else if("1".equals(subton)){Sone1();}
             else 
                 i-=1;System.out.println("INVALID INPUT");
             }
}
    public void Sten1(){
             Farray();
             System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 2224 || sub1 == 1173 || sub1 == 1232 || sub1 == 1103 || sub1 == 1202 || sub1 == 1048 || sub1 == 2171||
                sub1 == 1133 || sub1 == 1009 || sub1 == 1227 || sub1 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 2224 || sub2 == 1173 || sub2 == 1232 || sub2 == 1103 || sub2 == 1202 || sub2 == 1048 || sub2 == 2171||
                sub2 == 1133 || sub2 == 1009 || sub2 == 1227 || sub2 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 2224 || sub3 == 1173 || sub3 == 1232 || sub3 == 1103 || sub3 == 1202 || sub3 == 1048 || sub3 == 2171||
                sub3 == 1133 || sub3 == 1009 || sub3 == 1227 || sub3 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 2224 || sub4 == 1173 || sub4 == 1232 || sub4 == 1103 || sub4 == 1202 || sub4 == 1048 || sub4 == 2171||
                sub4 == 1133 || sub4 == 1009 || sub4 == 1227 || sub4 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("5.Enter Offercode :");
             sub5 = input.nextInt();
             if(sub5 == 2224 || sub5 == 1173 || sub5 == 1232 || sub5 == 1103 || sub5 == 1202 || sub5 == 1048 || sub5 == 2171||
                sub5 == 1133 || sub5 == 1009 || sub5 == 1227 || sub5 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("6.Enter Offercode :");
             sub6 = input.nextInt();
             if(sub6 == 2224 || sub6 == 1173 || sub6 == 1232 || sub6 == 1103 || sub6 == 1202 || sub6 == 1048 || sub6 == 2171||
                sub6 == 1133 || sub6 == 1009 || sub6 == 1227 || sub6 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("7.Enter Offercode :");
             sub7 = input.nextInt();
             if(sub7 == 2224 || sub7 == 1173 || sub7 == 1232 || sub7 == 1103 || sub7 == 1202 || sub7 == 1048 || sub7 == 2171||
                sub7 == 1133 || sub7 == 1009 || sub7 == 1227 || sub7 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("8.Enter Offercode :");
             sub8 = input.nextInt();
             if(sub8 == 2224 || sub8 == 1173 || sub8 == 1232 || sub8 == 1103 || sub8 == 1202 || sub8 == 1048 || sub8 == 2171||
                sub8 == 1133 || sub8 == 1009 || sub8 == 1227 || sub8 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("9.Enter Offercode :");
             sub9 = input.nextInt();
             if(sub9 == 2224 || sub9 == 1173 || sub9 == 1232 || sub9 == 1103 || sub9 == 1202 || sub9 == 1048 || sub9 == 2171||
                sub9 == 1133 || sub9 == 1009 || sub9 == 1227 || sub9 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("10.Enter Offercode :");
             sub10 = input.nextInt();
             if(sub10 == 2224 || sub10 == 1173 || sub10 == 1232 || sub10 == 1103 || sub10 == 1202 || sub10 == 1048 || sub10 == 2171||
                sub10 == 1133 || sub10 == 1009 || sub10 == 1227 || sub10 == 1135);
             else i-=1;
             }
             System.out.println("=================================================================================================================================================");
             //Subject Entered
             System.out.println("\n");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n");
             //for sub1
             if(sub1 == 2224){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1133){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1173){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1009){System.out.println(subjects[sub1]);totalsz+=5;}
             else if (sub1 == 1232){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1227){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1103){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1202){System.out.println(subjects[sub1]);totalsz+=2;}
             else if (sub1 == 1135){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1048){System.out.println(subjects[sub1]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub1 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub1]);totalsz+=3;}
             //for sub2
             if(sub2 == 2224){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1133){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1173){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1009){System.out.println(subjects[sub2]);totalsz+=5;}
             else if (sub2 == 1232){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1227){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1103){System.out.println(subjects[sub2]);totalsz+=2;}
             else if (sub2 == 1202){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1135){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1048){System.out.println(subjects[sub2]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub2 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub2]);totalsz+=3;}
             //for sub4
             if(sub3 == 2224){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1133){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1173){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1009){System.out.println(subjects[sub3]);totalsz+=5;}
             else if (sub3 == 1232){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1227){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1103){System.out.println(subjects[sub3]);totalsz+=2;}
             else if (sub3 == 1202){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1135){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1048){System.out.println(subjects[sub3]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub3 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub3]);totalsz+=3;}
             //for sub4
             if(sub4 == 2224){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1133){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1173){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1009){System.out.println(subjects[sub4]);totalsz+=5;}
             else if (sub4 == 1232){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1227){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1103){System.out.println(subjects[sub4]);totalsz+=2;}
             else if (sub4 == 1202){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1135){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1048){System.out.println(subjects[sub4]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub4 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub4]);totalsz+=3;}
             //for sub5
             if(sub5 == 2224){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1133){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1173){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1009){System.out.println(subjects[sub5]);totalsz+=5;}
             else if (sub5 == 1232){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1227){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1103){System.out.println(subjects[sub5]);totalsz+=2;}
             else if (sub5 == 1202){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1135){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1048){System.out.println(subjects[sub5]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub5 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub5]);totalsz+=3;}
             //for sub6
             if(sub6 == 2224){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1133){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1173){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1009){System.out.println(subjects[sub6]);totalsz+=5;}
             else if (sub6 == 1232){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1227){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1103){System.out.println(subjects[sub6]);totalsz+=2;}
             else if (sub6 == 1202){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1135){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1048){System.out.println(subjects[sub6]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub6 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub6]);totalsz+=3;}
             
             if(sub7 == 2224){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1133){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1173){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1009){System.out.println(subjects[sub7]);totalsz+=5;}
             else if (sub7 == 1232){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1227){System.out.println(subjects[sub7]);totalsz+=2;}
             else if (sub7 == 1103){System.out.println(subjects[sub7]);totalsz+=2;}
             else if (sub7 == 1202){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1135){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1048){System.out.println(subjects[sub7]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub7 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub7]);totalsz+=3;}
             
             if(sub8 == 2224){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1133){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1173){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1009){System.out.println(subjects[sub8]);totalsz+=5;}
             else if (sub8 == 1232){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1227){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1103){System.out.println(subjects[sub8]);totalsz+=2;}
             else if (sub8 == 1202){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1135){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1048){System.out.println(subjects[sub8]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub8 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub8]);totalsz+=3;}
             
             if(sub9 == 2224){System.out.println(subjects[sub9]);totalsz+=3;}
             else if (sub9 == 1133){System.out.println(subjects[sub9]);totalsz+=3;}
             else if (sub9 == 1173){System.out.println(subjects[sub9]);totalsz+=3;}
             else if (sub9 == 1009){System.out.println(subjects[sub9]);totalsz+=5;}
             else if (sub9 == 1232){System.out.println(subjects[sub9]);totalsz+=3;}
             else if (sub9 == 1227){System.out.println(subjects[sub9]);totalsz+=3;}
             else if (sub9 == 1103){System.out.println(subjects[sub9]);totalsz+=2;}
             else if (sub9 == 1202){System.out.println(subjects[sub9]);totalsz+=3;}
             else if (sub9 == 1135){System.out.println(subjects[sub9]);totalsz+=3;}
             else if (sub9 == 1048){System.out.println(subjects[sub9]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub9 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub9]);totalsz+=3;}
             
             if(sub10 == 2224){System.out.println(subjects[sub10]);totalsz+=3;}
             else if (sub10 == 1133){System.out.println(subjects[sub10]);totalsz+=3;}
             else if (sub10 == 1173){System.out.println(subjects[sub10]);totalsz+=3;}
             else if (sub10 == 1009){System.out.println(subjects[sub10]);totalsz+=5;}
             else if (sub10 == 1232){System.out.println(subjects[sub10]);totalsz+=3;}
             else if (sub10 == 1227){System.out.println(subjects[sub10]);totalsz+=3;}
             else if (sub10 == 1103){System.out.println(subjects[sub10]);totalsz+=3;}
             else if (sub10 == 1202){System.out.println(subjects[sub10]);totalsz+=2;}
             else if (sub10 == 1135){System.out.println(subjects[sub10]);totalsz+=3;}
             else if (sub10 == 1048){System.out.println(subjects[sub10]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub10 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub10]);totalsz+=3;}
             
             System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totalsz+"\n");
             System.out.println("=================================================================================================================================================");
             
             
             for(int i = 1; i<=1;i++){
                 System.out.print("Proceed to Second Semester (Y/y or N/n) :");
                 String proceed = input.next();
                 if("Y".equals(proceed) || "y".equals(proceed)){
                     sem2();
                 }
                 else if("Y".equals(proceed) || "n".equals(proceed)){
                 Fmenu();
                 }
                 else
                     System.out.println("Invalid input");
                 i-=1;
             }
    }
    public void Snine1(){
        
             Farray();
             System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 2224 || sub1 == 1173 || sub1 == 1232 || sub1 == 1103 || sub1 == 1202 || sub1 == 1048 || sub1 == 2171||
                sub1 == 1133 || sub1 == 1009 || sub1 == 1227 || sub1 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 2224 || sub2 == 1173 || sub2 == 1232 || sub2 == 1103 || sub2 == 1202 || sub2 == 1048 || sub2 == 2171||
                sub2 == 1133 || sub2 == 1009 || sub2 == 1227 || sub2 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 2224 || sub3 == 1173 || sub3 == 1232 || sub3 == 1103 || sub3 == 1202 || sub3 == 1048 || sub3 == 2171||
                sub3 == 1133 || sub3 == 1009 || sub3 == 1227 || sub3 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 2224 || sub4 == 1173 || sub4 == 1232 || sub4 == 1103 || sub4 == 1202 || sub4 == 1048 || sub4 == 2171||
                sub4 == 1133 || sub4 == 1009 || sub4 == 1227 || sub4 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("5.Enter Offercode :");
             sub5 = input.nextInt();
             if(sub5 == 2224 || sub5 == 1173 || sub5 == 1232 || sub5 == 1103 || sub5 == 1202 || sub5 == 1048 || sub5 == 2171||
                sub5 == 1133 || sub5 == 1009 || sub5 == 1227 || sub5 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("6.Enter Offercode :");
             sub6 = input.nextInt();
             if(sub6 == 2224 || sub6 == 1173 || sub6 == 1232 || sub6 == 1103 || sub6 == 1202 || sub6 == 1048 || sub6 == 2171||
                sub6 == 1133 || sub6 == 1009 || sub6 == 1227 || sub6 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("7.Enter Offercode :");
             sub7 = input.nextInt();
             if(sub7 == 2224 || sub7 == 1173 || sub7 == 1232 || sub7 == 1103 || sub7 == 1202 || sub7 == 1048 || sub7 == 2171||
                sub7 == 1133 || sub7 == 1009 || sub7 == 1227 || sub7 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("8.Enter Offercode :");
             sub8 = input.nextInt();
             if(sub8 == 2224 || sub8 == 1173 || sub8 == 1232 || sub8 == 1103 || sub8 == 1202 || sub8 == 1048 || sub8 == 2171||
                sub8 == 1133 || sub8 == 1009 || sub8 == 1227 || sub8 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("9.Enter Offercode :");
             sub9 = input.nextInt();
             if(sub9 == 2224 || sub9 == 1173 || sub9 == 1232 || sub9 == 1103 || sub9 == 1202 || sub9 == 1048 || sub9 == 2171||
                sub9 == 1133 || sub9 == 1009 || sub9 == 1227 || sub9 == 1135);
             else i-=1;
             }
             System.out.println("=================================================================================================================================================");
             //Subject Entered
             System.out.println("\n");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n");
             //for sub1
             if(sub1 == 2224){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1133){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1173){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1009){System.out.println(subjects[sub1]);totalsz+=5;}
             else if (sub1 == 1232){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1227){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1103){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1202){System.out.println(subjects[sub1]);totalsz+=2;}
             else if (sub1 == 1135){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1048){System.out.println(subjects[sub1]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub1 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub1]);totalsz+=3;}
             //for sub2
             if(sub2 == 2224){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1133){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1173){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1009){System.out.println(subjects[sub2]);totalsz+=5;}
             else if (sub2 == 1232){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1227){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1103){System.out.println(subjects[sub2]);totalsz+=2;}
             else if (sub2 == 1202){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1135){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1048){System.out.println(subjects[sub2]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub2 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub2]);totalsz+=3;}
             //for sub4
             if(sub3 == 2224){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1133){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1173){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1009){System.out.println(subjects[sub3]);totalsz+=5;}
             else if (sub3 == 1232){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1227){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1103){System.out.println(subjects[sub3]);totalsz+=2;}
             else if (sub3 == 1202){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1135){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1048){System.out.println(subjects[sub3]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub3 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub3]);totalsz+=3;}
             //for sub4
             if(sub4 == 2224){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1133){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1173){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1009){System.out.println(subjects[sub4]);totalsz+=5;}
             else if (sub4 == 1232){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1227){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1103){System.out.println(subjects[sub4]);totalsz+=2;}
             else if (sub4 == 1202){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1135){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1048){System.out.println(subjects[sub4]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub4 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub4]);totalsz+=3;}
             //for sub5
             if(sub5 == 2224){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1133){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1173){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1009){System.out.println(subjects[sub5]);totalsz+=5;}
             else if (sub5 == 1232){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1227){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1103){System.out.println(subjects[sub5]);totalsz+=2;}
             else if (sub5 == 1202){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1135){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1048){System.out.println(subjects[sub5]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub5 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub5]);totalsz+=3;}
             //for sub6
             if(sub6 == 2224){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1133){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1173){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1009){System.out.println(subjects[sub6]);totalsz+=5;}
             else if (sub6 == 1232){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1227){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1103){System.out.println(subjects[sub6]);totalsz+=2;}
             else if (sub6 == 1202){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1135){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1048){System.out.println(subjects[sub6]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub6 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub6]);totalsz+=3;}
             
             if(sub7 == 2224){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1133){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1173){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1009){System.out.println(subjects[sub7]);totalsz+=5;}
             else if (sub7 == 1232){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1227){System.out.println(subjects[sub7]);totalsz+=2;}
             else if (sub7 == 1103){System.out.println(subjects[sub7]);totalsz+=2;}
             else if (sub7 == 1202){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1135){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1048){System.out.println(subjects[sub7]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub7 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub7]);totalsz+=3;}
             
             if(sub8 == 2224){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1133){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1173){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1009){System.out.println(subjects[sub8]);totalsz+=5;}
             else if (sub8 == 1232){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1227){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1103){System.out.println(subjects[sub8]);totalsz+=2;}
             else if (sub8 == 1202){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1135){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1048){System.out.println(subjects[sub8]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub8 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub8]);totalsz+=3;}
             
             if(sub9 == 2224){System.out.println(subjects[sub9]);totalsz+=3;}
             else if (sub9 == 1133){System.out.println(subjects[sub9]);totalsz+=3;}
             else if (sub9 == 1173){System.out.println(subjects[sub9]);totalsz+=3;}
             else if (sub9 == 1009){System.out.println(subjects[sub9]);totalsz+=5;}
             else if (sub9 == 1232){System.out.println(subjects[sub9]);totalsz+=3;}
             else if (sub9 == 1227){System.out.println(subjects[sub9]);totalsz+=3;}
             else if (sub9 == 1103){System.out.println(subjects[sub9]);totalsz+=2;}
             else if (sub9 == 1202){System.out.println(subjects[sub9]);totalsz+=3;}
             else if (sub9 == 1135){System.out.println(subjects[sub9]);totalsz+=3;}
             else if (sub9 == 1048){System.out.println(subjects[sub9]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub9 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub9]);totalsz+=3;}
             System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totalsz+"\n");
             System.out.println("=================================================================================================================================================");
             
             
             for(int i = 1; i<=1;i++){
                 System.out.print("Proceed to Second Semester (Y/y or N/n) :");
                 String proceed = input.next();
                 if("Y".equals(proceed) || "y".equals(proceed)){
                     sem2();
                 }
                 else if("Y".equals(proceed) || "n".equals(proceed)){
                 Fmenu();
                 }
                 else
                     System.out.println("Invalid input");
                 i-=1;
             }
             }
    public void Seight1(){
    Farray();
             System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 2224 || sub1 == 1173 || sub1 == 1232 || sub1 == 1103 || sub1 == 1202 || sub1 == 1048 || sub1 == 2171||
                sub1 == 1133 || sub1 == 1009 || sub1 == 1227 || sub1 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 2224 || sub2 == 1173 || sub2 == 1232 || sub2 == 1103 || sub2 == 1202 || sub2 == 1048 || sub2 == 2171||
                sub2 == 1133 || sub2 == 1009 || sub2 == 1227 || sub2 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 2224 || sub3 == 1173 || sub3 == 1232 || sub3 == 1103 || sub3 == 1202 || sub3 == 1048 || sub3 == 2171||
                sub3 == 1133 || sub3 == 1009 || sub3 == 1227 || sub3 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 2224 || sub4 == 1173 || sub4 == 1232 || sub4 == 1103 || sub4 == 1202 || sub4 == 1048 || sub4 == 2171||
                sub4 == 1133 || sub4 == 1009 || sub4 == 1227 || sub4 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("5.Enter Offercode :");
             sub5 = input.nextInt();
             if(sub5 == 2224 || sub5 == 1173 || sub5 == 1232 || sub5 == 1103 || sub5 == 1202 || sub5 == 1048 || sub5 == 2171||
                sub5 == 1133 || sub5 == 1009 || sub5 == 1227 || sub5 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("6.Enter Offercode :");
             sub6 = input.nextInt();
             if(sub6 == 2224 || sub6 == 1173 || sub6 == 1232 || sub6 == 1103 || sub6 == 1202 || sub6 == 1048 || sub6 == 2171||
                sub6 == 1133 || sub6 == 1009 || sub6 == 1227 || sub6 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("7.Enter Offercode :");
             sub7 = input.nextInt();
             if(sub7 == 2224 || sub7 == 1173 || sub7 == 1232 || sub7 == 1103 || sub7 == 1202 || sub7 == 1048 || sub7 == 2171||
                sub7 == 1133 || sub7 == 1009 || sub7 == 1227 || sub7 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("8.Enter Offercode :");
             sub8 = input.nextInt();
             if(sub8 == 2224 || sub8 == 1173 || sub8 == 1232 || sub8 == 1103 || sub8 == 1202 || sub8 == 1048 || sub8 == 2171||
                sub8 == 1133 || sub8 == 1009 || sub8 == 1227 || sub8 == 1135);
             else i-=1;
             }
             
             System.out.println("=================================================================================================================================================");
             //Subject Entered
             System.out.println("\n");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n");
             //for sub1
             if(sub1 == 2224){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1133){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1173){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1009){System.out.println(subjects[sub1]);totalsz+=5;}
             else if (sub1 == 1232){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1227){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1103){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1202){System.out.println(subjects[sub1]);totalsz+=2;}
             else if (sub1 == 1135){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1048){System.out.println(subjects[sub1]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub1 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub1]);totalsz+=3;}
             //for sub2
             if(sub2 == 2224){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1133){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1173){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1009){System.out.println(subjects[sub2]);totalsz+=5;}
             else if (sub2 == 1232){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1227){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1103){System.out.println(subjects[sub2]);totalsz+=2;}
             else if (sub2 == 1202){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1135){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1048){System.out.println(subjects[sub2]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub2 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub2]);totalsz+=3;}
             //for sub4
             if(sub3 == 2224){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1133){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1173){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1009){System.out.println(subjects[sub3]);totalsz+=5;}
             else if (sub3 == 1232){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1227){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1103){System.out.println(subjects[sub3]);totalsz+=2;}
             else if (sub3 == 1202){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1135){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1048){System.out.println(subjects[sub3]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub3 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub3]);totalsz+=3;}
             //for sub4
             if(sub4 == 2224){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1133){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1173){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1009){System.out.println(subjects[sub4]);totalsz+=5;}
             else if (sub4 == 1232){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1227){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1103){System.out.println(subjects[sub4]);totalsz+=2;}
             else if (sub4 == 1202){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1135){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1048){System.out.println(subjects[sub4]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub4 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub4]);totalsz+=3;}
             //for sub5
             if(sub5 == 2224){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1133){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1173){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1009){System.out.println(subjects[sub5]);totalsz+=5;}
             else if (sub5 == 1232){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1227){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1103){System.out.println(subjects[sub5]);totalsz+=2;}
             else if (sub5 == 1202){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1135){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1048){System.out.println(subjects[sub5]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub5 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub5]);totalsz+=3;}
             //for sub6
             if(sub6 == 2224){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1133){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1173){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1009){System.out.println(subjects[sub6]);totalsz+=5;}
             else if (sub6 == 1232){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1227){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1103){System.out.println(subjects[sub6]);totalsz+=2;}
             else if (sub6 == 1202){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1135){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1048){System.out.println(subjects[sub6]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub6 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub6]);totalsz+=3;}
             
             if(sub7 == 2224){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1133){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1173){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1009){System.out.println(subjects[sub7]);totalsz+=5;}
             else if (sub7 == 1232){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1227){System.out.println(subjects[sub7]);totalsz+=2;}
             else if (sub7 == 1103){System.out.println(subjects[sub7]);totalsz+=2;}
             else if (sub7 == 1202){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1135){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1048){System.out.println(subjects[sub7]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub7 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub7]);totalsz+=3;}
             
             if(sub8 == 2224){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1133){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1173){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1009){System.out.println(subjects[sub8]);totalsz+=5;}
             else if (sub8 == 1232){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1227){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1103){System.out.println(subjects[sub8]);totalsz+=2;}
             else if (sub8 == 1202){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1135){System.out.println(subjects[sub8]);totalsz+=3;}
             else if (sub8 == 1048){System.out.println(subjects[sub8]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub8 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub8]);totalsz+=3;}
             
             System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totalsz+"\n");
             System.out.println("=================================================================================================================================================");
             
             
             for(int i = 1; i<=1;i++){
                 System.out.print("Proceed to Second Semester (Y/y or N/n) :");
                 String proceed = input.next();
                 if("Y".equals(proceed) || "y".equals(proceed)){
                     sem2();
                 }
                 else if("Y".equals(proceed) || "n".equals(proceed)){
                 Fmenu();
                 }
                 else
                     System.out.println("Invalid input");
                 i-=1;
             }
    }
    public void Sseven1(){
    Farray();
             System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 2224 || sub1 == 1173 || sub1 == 1232 || sub1 == 1103 || sub1 == 1202 || sub1 == 1048 || sub1 == 2171||
                sub1 == 1133 || sub1 == 1009 || sub1 == 1227 || sub1 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 2224 || sub2 == 1173 || sub2 == 1232 || sub2 == 1103 || sub2 == 1202 || sub2 == 1048 || sub2 == 2171||
                sub2 == 1133 || sub2 == 1009 || sub2 == 1227 || sub2 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 2224 || sub3 == 1173 || sub3 == 1232 || sub3 == 1103 || sub3 == 1202 || sub3 == 1048 || sub3 == 2171||
                sub3 == 1133 || sub3 == 1009 || sub3 == 1227 || sub3 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 2224 || sub4 == 1173 || sub4 == 1232 || sub4 == 1103 || sub4 == 1202 || sub4 == 1048 || sub4 == 2171||
                sub4 == 1133 || sub4 == 1009 || sub4 == 1227 || sub4 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("5.Enter Offercode :");
             sub5 = input.nextInt();
             if(sub5 == 2224 || sub5 == 1173 || sub5 == 1232 || sub5 == 1103 || sub5 == 1202 || sub5 == 1048 || sub5 == 2171||
                sub5 == 1133 || sub5 == 1009 || sub5 == 1227 || sub5 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("6.Enter Offercode :");
             sub6 = input.nextInt();
             if(sub6 == 2224 || sub6 == 1173 || sub6 == 1232 || sub6 == 1103 || sub6 == 1202 || sub6 == 1048 || sub6 == 2171||
                sub6 == 1133 || sub6 == 1009 || sub6 == 1227 || sub6 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("7.Enter Offercode :");
             sub7 = input.nextInt();
             if(sub7 == 2224 || sub7 == 1173 || sub7 == 1232 || sub7 == 1103 || sub7 == 1202 || sub7 == 1048 || sub7 == 2171||
                sub7 == 1133 || sub7 == 1009 || sub7 == 1227 || sub7 == 1135);
             else i-=1;
             }
             
             System.out.println("=================================================================================================================================================");
             //Subject Entered
             System.out.println("\n");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n");
             //for sub1
             if(sub1 == 2224){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1133){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1173){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1009){System.out.println(subjects[sub1]);totalsz+=5;}
             else if (sub1 == 1232){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1227){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1103){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1202){System.out.println(subjects[sub1]);totalsz+=2;}
             else if (sub1 == 1135){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1048){System.out.println(subjects[sub1]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub1 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub1]);totalsz+=3;}
             //for sub2
             if(sub2 == 2224){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1133){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1173){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1009){System.out.println(subjects[sub2]);totalsz+=5;}
             else if (sub2 == 1232){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1227){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1103){System.out.println(subjects[sub2]);totalsz+=2;}
             else if (sub2 == 1202){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1135){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1048){System.out.println(subjects[sub2]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub2 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub2]);totalsz+=3;}
             //for sub4
             if(sub3 == 2224){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1133){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1173){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1009){System.out.println(subjects[sub3]);totalsz+=5;}
             else if (sub3 == 1232){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1227){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1103){System.out.println(subjects[sub3]);totalsz+=2;}
             else if (sub3 == 1202){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1135){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1048){System.out.println(subjects[sub3]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub3 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub3]);totalsz+=3;}
             //for sub4
             if(sub4 == 2224){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1133){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1173){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1009){System.out.println(subjects[sub4]);totalsz+=5;}
             else if (sub4 == 1232){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1227){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1103){System.out.println(subjects[sub4]);totalsz+=2;}
             else if (sub4 == 1202){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1135){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1048){System.out.println(subjects[sub4]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub4 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub4]);totalsz+=3;}
             //for sub5
             if(sub5 == 2224){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1133){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1173){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1009){System.out.println(subjects[sub5]);totalsz+=5;}
             else if (sub5 == 1232){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1227){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1103){System.out.println(subjects[sub5]);totalsz+=2;}
             else if (sub5 == 1202){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1135){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1048){System.out.println(subjects[sub5]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub5 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub5]);totalsz+=3;}
             //for sub6
             if(sub6 == 2224){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1133){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1173){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1009){System.out.println(subjects[sub6]);totalsz+=5;}
             else if (sub6 == 1232){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1227){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1103){System.out.println(subjects[sub6]);totalsz+=2;}
             else if (sub6 == 1202){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1135){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1048){System.out.println(subjects[sub6]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub6 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub6]);totalsz+=3;}
             
             if(sub7 == 2224){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1133){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1173){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1009){System.out.println(subjects[sub7]);totalsz+=5;}
             else if (sub7 == 1232){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1227){System.out.println(subjects[sub7]);totalsz+=2;}
             else if (sub7 == 1103){System.out.println(subjects[sub7]);totalsz+=2;}
             else if (sub7 == 1202){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1135){System.out.println(subjects[sub7]);totalsz+=3;}
             else if (sub7 == 1048){System.out.println(subjects[sub7]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub7 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub7]);totalsz+=3;}
             
             System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totalsz+"\n");
             System.out.println("=================================================================================================================================================");
             
             
             for(int i = 1; i<=1;i++){
                 System.out.print("Proceed to Second Semester (Y/y or N/n) :");
                 String proceed = input.next();
                 if("Y".equals(proceed) || "y".equals(proceed)){
                     sem2();
                 }
                 else if("Y".equals(proceed) || "n".equals(proceed)){
                 Fmenu();
                 }
                 else
                     System.out.println("Invalid input");
                 i-=1;
             }
}
    public void Ssix1(){
             Farray();
             System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 2224 || sub1 == 1173 || sub1 == 1232 || sub1 == 1103 || sub1 == 1202 || sub1 == 1048 || sub1 == 2171||
                sub1 == 1133 || sub1 == 1009 || sub1 == 1227 || sub1 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 2224 || sub2 == 1173 || sub2 == 1232 || sub2 == 1103 || sub2 == 1202 || sub2 == 1048 || sub2 == 2171||
                sub2 == 1133 || sub2 == 1009 || sub2 == 1227 || sub2 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 2224 || sub3 == 1173 || sub3 == 1232 || sub3 == 1103 || sub3 == 1202 || sub3 == 1048 || sub3 == 2171||
                sub3 == 1133 || sub3 == 1009 || sub3 == 1227 || sub3 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 2224 || sub4 == 1173 || sub4 == 1232 || sub4 == 1103 || sub4 == 1202 || sub4 == 1048 || sub4 == 2171||
                sub4 == 1133 || sub4 == 1009 || sub4 == 1227 || sub4 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("5.Enter Offercode :");
             sub5 = input.nextInt();
             if(sub5 == 2224 || sub5 == 1173 || sub5 == 1232 || sub5 == 1103 || sub5 == 1202 || sub5 == 1048 || sub5 == 2171||
                sub5 == 1133 || sub5 == 1009 || sub5 == 1227 || sub5 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("6.Enter Offercode :");
             sub6 = input.nextInt();
             if(sub6 == 2224 || sub6 == 1173 || sub6 == 1232 || sub6 == 1103 || sub6 == 1202 || sub6 == 1048 || sub6 == 2171||
                sub6 == 1133 || sub6 == 1009 || sub6 == 1227 || sub6 == 1135);
             else i-=1;
             }
             
             System.out.println("=================================================================================================================================================");
             //Subject Entered
             System.out.println("\n");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n");
             //for sub1
             if(sub1 == 2224){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1133){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1173){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1009){System.out.println(subjects[sub1]);totalsz+=5;}
             else if (sub1 == 1232){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1227){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1103){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1202){System.out.println(subjects[sub1]);totalsz+=2;}
             else if (sub1 == 1135){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1048){System.out.println(subjects[sub1]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub1 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub1]);totalsz+=3;}
             //for sub2
             if(sub2 == 2224){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1133){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1173){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1009){System.out.println(subjects[sub2]);totalsz+=5;}
             else if (sub2 == 1232){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1227){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1103){System.out.println(subjects[sub2]);totalsz+=2;}
             else if (sub2 == 1202){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1135){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1048){System.out.println(subjects[sub2]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub2 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub2]);totalsz+=3;}
             //for sub4
             if(sub3 == 2224){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1133){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1173){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1009){System.out.println(subjects[sub3]);totalsz+=5;}
             else if (sub3 == 1232){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1227){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1103){System.out.println(subjects[sub3]);totalsz+=2;}
             else if (sub3 == 1202){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1135){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1048){System.out.println(subjects[sub3]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub3 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub3]);totalsz+=3;}
             //for sub4
             if(sub4 == 2224){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1133){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1173){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1009){System.out.println(subjects[sub4]);totalsz+=5;}
             else if (sub4 == 1232){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1227){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1103){System.out.println(subjects[sub4]);totalsz+=2;}
             else if (sub4 == 1202){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1135){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1048){System.out.println(subjects[sub4]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub4 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub4]);totalsz+=3;}
             //for sub5
             if(sub5 == 2224){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1133){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1173){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1009){System.out.println(subjects[sub5]);totalsz+=5;}
             else if (sub5 == 1232){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1227){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1103){System.out.println(subjects[sub5]);totalsz+=2;}
             else if (sub5 == 1202){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1135){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1048){System.out.println(subjects[sub5]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub5 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub5]);totalsz+=3;}
             //for sub6
             if(sub6 == 2224){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1133){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1173){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1009){System.out.println(subjects[sub6]);totalsz+=5;}
             else if (sub6 == 1232){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1227){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1103){System.out.println(subjects[sub6]);totalsz+=2;}
             else if (sub6 == 1202){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1135){System.out.println(subjects[sub6]);totalsz+=3;}
             else if (sub6 == 1048){System.out.println(subjects[sub6]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub6 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub6]);totalsz+=3;}
             
             System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totalsz+"\n");
             System.out.println("=================================================================================================================================================");
             
             
             for(int i = 1; i<=1;i++){
                 System.out.print("Proceed to Second Semester (Y/y or N/n) :");
                 String proceed = input.next();
                 if("Y".equals(proceed) || "y".equals(proceed)){
                     sem2();
                 }
                 else if("Y".equals(proceed) || "n".equals(proceed)){
                 Fmenu();
                 }
                 else
                     System.out.println("Invalid input");
                 i-=1;
             }
    }
    public void Sfive1(){
              Farray();
             System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 2224 || sub1 == 1173 || sub1 == 1232 || sub1 == 1103 || sub1 == 1202 || sub1 == 1048 || sub1 == 2171||
                sub1 == 1133 || sub1 == 1009 || sub1 == 1227 || sub1 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 2224 || sub2 == 1173 || sub2 == 1232 || sub2 == 1103 || sub2 == 1202 || sub2 == 1048 || sub2 == 2171||
                sub2 == 1133 || sub2 == 1009 || sub2 == 1227 || sub2 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 2224 || sub3 == 1173 || sub3 == 1232 || sub3 == 1103 || sub3 == 1202 || sub3 == 1048 || sub3 == 2171||
                sub3 == 1133 || sub3 == 1009 || sub3 == 1227 || sub3 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 2224 || sub4 == 1173 || sub4 == 1232 || sub4 == 1103 || sub4 == 1202 || sub4 == 1048 || sub4 == 2171||
                sub4 == 1133 || sub4 == 1009 || sub4 == 1227 || sub4 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("5.Enter Offercode :");
             sub5 = input.nextInt();
             if(sub5 == 2224 || sub5 == 1173 || sub5 == 1232 || sub5 == 1103 || sub5 == 1202 || sub5 == 1048 || sub5 == 2171||
                sub5 == 1133 || sub5 == 1009 || sub5 == 1227 || sub5 == 1135);
             else i-=1;
             }
             
             
             System.out.println("=================================================================================================================================================");
             //Subject Entered
             System.out.println("\n");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,FIRST SEMESTER\n");
             //for sub1
             if(sub1 == 2224){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1133){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1173){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1009){System.out.println(subjects[sub1]);totalsz+=5;}
             else if (sub1 == 1232){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1227){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1103){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1202){System.out.println(subjects[sub1]);totalsz+=2;}
             else if (sub1 == 1135){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1048){System.out.println(subjects[sub1]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub1 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub1]);totalsz+=3;}
             //for sub2
             if(sub2 == 2224){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1133){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1173){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1009){System.out.println(subjects[sub2]);totalsz+=5;}
             else if (sub2 == 1232){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1227){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1103){System.out.println(subjects[sub2]);totalsz+=2;}
             else if (sub2 == 1202){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1135){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1048){System.out.println(subjects[sub2]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub2 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub2]);totalsz+=3;}
             //for sub4
             if(sub3 == 2224){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1133){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1173){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1009){System.out.println(subjects[sub3]);totalsz+=5;}
             else if (sub3 == 1232){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1227){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1103){System.out.println(subjects[sub3]);totalsz+=2;}
             else if (sub3 == 1202){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1135){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1048){System.out.println(subjects[sub3]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub3 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub3]);totalsz+=3;}
             //for sub4
             if(sub4 == 2224){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1133){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1173){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1009){System.out.println(subjects[sub4]);totalsz+=5;}
             else if (sub4 == 1232){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1227){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1103){System.out.println(subjects[sub4]);totalsz+=2;}
             else if (sub4 == 1202){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1135){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1048){System.out.println(subjects[sub4]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub4 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub4]);totalsz+=3;}
             //for sub5
             if(sub5 == 2224){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1133){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1173){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1009){System.out.println(subjects[sub5]);totalsz+=5;}
             else if (sub5 == 1232){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1227){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1103){System.out.println(subjects[sub5]);totalsz+=2;}
             else if (sub5 == 1202){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1135){System.out.println(subjects[sub5]);totalsz+=3;}
             else if (sub5 == 1048){System.out.println(subjects[sub5]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub5 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub5]);totalsz+=3;}
             //for sub6
             
             System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totalsz+"\n");
             System.out.println("=================================================================================================================================================");
             
             
             for(int i = 1; i<=1;i++){
                 System.out.print("Proceed to Second Semester (Y/y or N/n) :");
                 String proceed = input.next();
                 if("Y".equals(proceed) || "y".equals(proceed)){
                     sem2();
                 }
                 else if("Y".equals(proceed) || "n".equals(proceed)){
                 Fmenu();
                 }
                 else
                     System.out.println("Invalid input");
                 i-=1;
             }    
    }
    public void Sfour1(){
     Farray();
             System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 2224 || sub1 == 1173 || sub1 == 1232 || sub1 == 1103 || sub1 == 1202 || sub1 == 1048 || sub1 == 2171||
                sub1 == 1133 || sub1 == 1009 || sub1 == 1227 || sub1 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 2224 || sub2 == 1173 || sub2 == 1232 || sub2 == 1103 || sub2 == 1202 || sub2 == 1048 || sub2 == 2171||
                sub2 == 1133 || sub2 == 1009 || sub2 == 1227 || sub2 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 2224 || sub3 == 1173 || sub3 == 1232 || sub3 == 1103 || sub3 == 1202 || sub3 == 1048 || sub3 == 2171||
                sub3 == 1133 || sub3 == 1009 || sub3 == 1227 || sub3 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 2224 || sub4 == 1173 || sub4 == 1232 || sub4 == 1103 || sub4 == 1202 || sub4 == 1048 || sub4 == 2171||
                sub4 == 1133 || sub4 == 1009 || sub4 == 1227 || sub4 == 1135);
             else i-=1;
             }
              System.out.println("=================================================================================================================================================");
             //Subject Entered
             System.out.println("\n");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,FIRST SEMESTER\n");
             //for sub1
             if(sub1 == 2224){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1133){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1173){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1009){System.out.println(subjects[sub1]);totalsz+=5;}
             else if (sub1 == 1232){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1227){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1103){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1202){System.out.println(subjects[sub1]);totalsz+=2;}
             else if (sub1 == 1135){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1048){System.out.println(subjects[sub1]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub1 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub1]);totalsz+=3;}
             //for sub2
             if(sub2 == 2224){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1133){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1173){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1009){System.out.println(subjects[sub2]);totalsz+=5;}
             else if (sub2 == 1232){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1227){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1103){System.out.println(subjects[sub2]);totalsz+=2;}
             else if (sub2 == 1202){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1135){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1048){System.out.println(subjects[sub2]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub2 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub2]);totalsz+=3;}
             //for sub4
             if(sub3 == 2224){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1133){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1173){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1009){System.out.println(subjects[sub3]);totalsz+=5;}
             else if (sub3 == 1232){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1227){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1103){System.out.println(subjects[sub3]);totalsz+=2;}
             else if (sub3 == 1202){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1135){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1048){System.out.println(subjects[sub3]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub3 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub3]);totalsz+=3;}
             //for sub4
             if(sub4 == 2224){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1133){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1173){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1009){System.out.println(subjects[sub4]);totalsz+=5;}
             else if (sub4 == 1232){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1227){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1103){System.out.println(subjects[sub4]);totalsz+=2;}
             else if (sub4 == 1202){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1135){System.out.println(subjects[sub4]);totalsz+=3;}
             else if (sub4 == 1048){System.out.println(subjects[sub4]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub4 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub4]);totalsz+=3;}
             //for sub5
             
             System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totalsz+"\n");
             System.out.println("=================================================================================================================================================");
             
             
             for(int i = 1; i<=1;i++){
                 System.out.print("Proceed to Second Semester (Y/y or N/n) :");
                 String proceed = input.next();
                 if("Y".equals(proceed) || "y".equals(proceed)){
                     sem2();
                 }
                 else if("Y".equals(proceed) || "n".equals(proceed)){
                 Fmenu();
                 }
                 else
                     System.out.println("Invalid input");
                 i-=1;
             }    
    }
    public void Sthree1(){
     Farray();
             System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 2224 || sub1 == 1173 || sub1 == 1232 || sub1 == 1103 || sub1 == 1202 || sub1 == 1048 || sub1 == 2171||
                sub1 == 1133 || sub1 == 1009 || sub1 == 1227 || sub1 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 2224 || sub2 == 1173 || sub2 == 1232 || sub2 == 1103 || sub2 == 1202 || sub2 == 1048 || sub2 == 2171||
                sub2 == 1133 || sub2 == 1009 || sub2 == 1227 || sub2 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 2224 || sub3 == 1173 || sub3 == 1232 || sub3 == 1103 || sub3 == 1202 || sub3 == 1048 || sub3 == 2171||
                sub3 == 1133 || sub3 == 1009 || sub3 == 1227 || sub3 == 1135);
             else i-=1;
             }
            
           System.out.println("=================================================================================================================================================");
             //Subject Entered
             System.out.println("\n");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,FIRST SEMESTER\n");
             //for sub1
             if(sub1 == 2224){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1133){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1173){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1009){System.out.println(subjects[sub1]);totalsz+=5;}
             else if (sub1 == 1232){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1227){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1103){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1202){System.out.println(subjects[sub1]);totalsz+=2;}
             else if (sub1 == 1135){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1048){System.out.println(subjects[sub1]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub1 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub1]);totalsz+=3;}
             //for sub2
             if(sub2 == 2224){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1133){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1173){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1009){System.out.println(subjects[sub2]);totalsz+=5;}
             else if (sub2 == 1232){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1227){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1103){System.out.println(subjects[sub2]);totalsz+=2;}
             else if (sub2 == 1202){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1135){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1048){System.out.println(subjects[sub2]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub2 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub2]);totalsz+=3;}
             //for sub4
             if(sub3 == 2224){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1133){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1173){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1009){System.out.println(subjects[sub3]);totalsz+=5;}
             else if (sub3 == 1232){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1227){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1103){System.out.println(subjects[sub3]);totalsz+=2;}
             else if (sub3 == 1202){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1135){System.out.println(subjects[sub3]);totalsz+=3;}
             else if (sub3 == 1048){System.out.println(subjects[sub3]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub3 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub3]);totalsz+=3;}
             //for sub4
             
              System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totalsz+"\n");
             System.out.println("=================================================================================================================================================");
             
             
             for(int i = 1; i<=1;i++){
                 System.out.print("Proceed to Second Semester (Y/y or N/n) :");
                 String proceed = input.next();
                 if("Y".equals(proceed) || "y".equals(proceed)){
                     sem2();
                 }
                 else if("Y".equals(proceed) || "n".equals(proceed)){
                 Fmenu();
                 }
                 else
                     System.out.println("Invalid input");
                 i-=1;
             }    
    }
    public void Stwo1(){
    Farray();
             System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 2224 || sub1 == 1173 || sub1 == 1232 || sub1 == 1103 || sub1 == 1202 || sub1 == 1048 || sub1 == 2171||
                sub1 == 1133 || sub1 == 1009 || sub1 == 1227 || sub1 == 1135);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 2224 || sub2 == 1173 || sub2 == 1232 || sub2 == 1103 || sub2 == 1202 || sub2 == 1048 || sub2 == 2171||
                sub2 == 1133 || sub2 == 1009 || sub2 == 1227 || sub2 == 1135);
             else i-=1;
             }
             
          System.out.println("=================================================================================================================================================");
             //Subject Entered
             System.out.println("\n");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,FIRST SEMESTER\n");
             //for sub1
             if(sub1 == 2224){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1133){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1173){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1009){System.out.println(subjects[sub1]);totalsz+=5;}
             else if (sub1 == 1232){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1227){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1103){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1202){System.out.println(subjects[sub1]);totalsz+=2;}
             else if (sub1 == 1135){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1048){System.out.println(subjects[sub1]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub1 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub1]);totalsz+=3;}
             //for sub2
             if(sub2 == 2224){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1133){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1173){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1009){System.out.println(subjects[sub2]);totalsz+=5;}
             else if (sub2 == 1232){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1227){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1103){System.out.println(subjects[sub2]);totalsz+=2;}
             else if (sub2 == 1202){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1135){System.out.println(subjects[sub2]);totalsz+=3;}
             else if (sub2 == 1048){System.out.println(subjects[sub2]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub2 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub2]);totalsz+=3;}
             //for sub4
             
              System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totalsz+"\n");
             System.out.println("=================================================================================================================================================");
             
             
             for(int i = 1; i<=1;i++){
                 System.out.print("Proceed to Second Semester (Y/y or N/n) :");
                 String proceed = input.next();
                 if("Y".equals(proceed) || "y".equals(proceed)){
                     sem2();
                 }
                 else if("Y".equals(proceed) || "n".equals(proceed)){
                 Fmenu();
                 }
                 else
                     System.out.println("Invalid input");
                 i-=1;
             }    
    }
    public void Sone1(){
     Farray();
             System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 2224 || sub1 == 1173 || sub1 == 1232 || sub1 == 1103 || sub1 == 1202 || sub1 == 1048 || sub1 == 2171||
                sub1 == 1133 || sub1 == 1009 || sub1 == 1227 || sub1 == 1135);
             else i-=1;
             }
             
             System.out.println("=================================================================================================================================================");
             //Subject Entered
             System.out.println("\n");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,FIRST SEMESTER\n");
             //for sub1
             if(sub1 == 2224){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1133){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1173){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1009){System.out.println(subjects[sub1]);totalsz+=5;}
             else if (sub1 == 1232){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1227){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1103){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1202){System.out.println(subjects[sub1]);totalsz+=2;}
             else if (sub1 == 1135){System.out.println(subjects[sub1]);totalsz+=3;}
             else if (sub1 == 1048){System.out.println(subjects[sub1]);System.out.println(subjects[2171]);totalsz+=3;}
             else if (sub1 == 2171){System.out.println(subjects[1048]);System.out.println(subjects[sub1]);totalsz+=3;}
             
             for(int i = 1; i<=1;i++){
                 System.out.print("Proceed to Second Semester (Y/y or N/n) :");
                 String proceed = input.next();
                 if("Y".equals(proceed) || "y".equals(proceed)){
                     sem2();
                 }
                 else if("Y".equals(proceed) || "n".equals(proceed)){
                 Fmenu();
                 }
                 else
                     System.out.println("Invalid input");
                 i-=1;
             }    
    }
    //FIRST YEAR SECOND SEMESTER
    public void sem2(){
    Farray();
    System.out.println("=================================================================================================================================================");
    System.out.print("\nEnter Your Grades for this Subjects :\n");
    for(int y = 1;y<=1;y++){  
        System.out.print("English Proficiency Program :");
        english = input.nextDouble();
        if(english >= 1.0 && english <= 5.0){System.out.print("");}
        
        else {System.out.println("Invalid Input");y-=1; }
    }
    for(int y = 1;y<=1;y++){
        System.out.print("Komunikasyon sa Akademikong Pilipino :");
        filipino = input.nextDouble();
        if(filipino >= 1.0 && filipino <= 5.0){System.out.print("");}
        
        else {System.out.println("Invalid Input");y-=1; }
    }
    for(int y = 1;y<=1;y++){
        System.out.print("Theoretical Foundations in Nursing :");
        nurse = input.nextDouble();
        if(nurse >= 1.0 && nurse <= 5.0){System.out.print("");}
        
        else {System.out.println("Invalid Input");y-=1; }
    }
    for(int y = 1;y<=1;y++){
        System.out.print("Civic Welfare Training Services 1 & Literacy Training Services 1  :");
        nstp = input.nextDouble();
        if(nstp >= 1.0 && nstp <= 5.0){System.out.print("");}
        else {System.out.println("Invalid Input");y-=1; }
    }
        System.out.println("=================================================================================================================================================");
        System.out.println("\nAvailable Subjects for this Semester :");
        System.out.println(subjects[4545]);
        System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
         System.out.print(" FIRSY YEAR,SECOND SEMESTER\n");
        if(english >=1.0 && english <=3.5) {System.out.println(subjects[1083]);num+=3;}
        if(filipino >=1.0 && filipino <=3.5) {System.out.println(subjects[1570]);num+=3;}
        System.out.println(subjects[1975]);num+=3;
        System.out.println(subjects[1205]);num+=3;
        System.out.println(subjects[1003]);num+=5;
        if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[1263]);num+=5;}
        System.out.println(subjects[1050]);num+=2;
        System.out.println(subjects[1256]);num+=3;
        if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[2172]);num+=3;}
        System.out.println(subjects[3535]); 
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+num+"\n");
       System.out.println("=================================================================================================================================================");
        // equals to 9
         System.out.println("Entered Range 5-9");
         int sub;
             for(int i = 1;i<=1;i++){
             System.out.print("Enter Subject Needed :");
             sub = input.nextInt();
             if(sub == 9){Snine();}
             else if(sub == 8){Seight();}
             else if(sub == 7){Sseven();}
             else if(sub == 6){Ssix();}
             else if(sub == 5){Sfive();}
             else if(sub == 4){Sfour();}
             else if(sub == 3){Sthree();}
             else if(sub == 2){Stwo();}
             else if(sub == 1){Sone();}
             else 
                 i-=1;System.out.println("INVALID INPUT");
             }
    }
    
    //NUMBERS OF SUBJECT ENTERED FOR SECOND SEMESTER
    public void Snine(){
             Farray();
             System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1083 || sub1 == 1003 || sub1 == 1570 || sub1 == 1975 || sub1 == 1205 || sub1 == 1263 || sub1 == 1050||
                sub1 == 1256 || sub1 == 1242 || sub1 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1083 || sub2 == 1003 || sub2 == 1570 || sub2 == 1975 || sub2 == 1205 || sub2 == 1263 || sub2 == 1050||
                sub2 == 1256 || sub2 == 1242 || sub2 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1083 || sub3 == 1003 || sub3 == 1570 || sub3 == 1975 || sub3 == 1205 || sub3 == 1263 || sub3 == 1050||
                sub3 == 1256 || sub3 == 1242 || sub3 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 1083 || sub4 == 1003 || sub4 == 1570 || sub4 == 1975 || sub4 == 1205 || sub4 == 1263 || sub4 == 1050||
                sub4 == 1256 || sub4 == 1242 || sub4 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("5.Enter Offercode :");
             sub5 = input.nextInt();
             if(sub5 == 1083 || sub5 == 1003 || sub5 == 1570 || sub5 == 1975 || sub5 == 1205 || sub5 == 1263 || sub5 == 1050||
                sub5 == 1256 || sub5 == 1242 || sub5 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("6.Enter Offercode :");
             sub6 = input.nextInt();
             if(sub6 == 1083 || sub6 == 1003 || sub6 == 1570 || sub6 == 1975 || sub6 == 1205 || sub6 == 1263 || sub6 == 1050||
                sub6 == 1256 || sub6 == 1242 || sub6 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("7.Enter Offercode :");
             sub7 = input.nextInt();
             if(sub7 == 1083 || sub7 == 1003 || sub7 == 1570 || sub7 == 1975 || sub7 == 1205 || sub7 == 1263 || sub7 == 1050||
                sub7 == 1256 || sub7 == 1242 || sub7 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("8.Enter Offercode :");
             sub8 = input.nextInt();
             if(sub8 == 1083 || sub8 == 1003 || sub8 == 1570 || sub8 == 1975 || sub8 == 1205 || sub8 == 1263 || sub8 == 1050||
                sub8 == 1256 || sub8 == 1242 || sub8 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("9.Enter Offercode :");
             sub9 = input.nextInt();
             if(sub9 == 1083 || sub9 == 1003 || sub9 == 1570 || sub9 == 1975 || sub9 == 1205 || sub9 == 1263 || sub9 == 1050||
                sub9 == 1256 || sub9 == 1242 || sub9 == 2172);
             else i-=1;
             }
             System.out.println("=================================================================================================================================================");
             //Subject Entered
             System.out.println("\n");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n");
             //for sub1
             if(sub1 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1003){System.out.println(subjects[sub1]);totals+=5;}
             else if (sub1 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1975){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1205){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub1]);totals+=5;}}
             else if (sub1 == 1050){System.out.println(subjects[sub1]);totals+=2;}
             else if (sub1 == 1256){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub1]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub1 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             //for sub2
             if(sub2 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             else if (sub2 == 1003){System.out.println(subjects[sub2]);totals+=5;}
             else if (sub2 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             else if (sub2 == 1975){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1205){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub2]);totals+=5;}}
             else if (sub2 == 1050){System.out.println(subjects[sub2]);totals+=2;}
             else if (sub2 == 1256){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub2]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub2 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             //for sub4
             if(sub3 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             else if (sub3 == 1003){System.out.println(subjects[sub3]);totals+=5;}
             else if (sub3 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             else if (sub3 == 1975){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1205){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub3]);totals+=5;}}
             else if (sub3 == 1050){System.out.println(subjects[sub3]);totals+=2;}
             else if (sub3 == 1256){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub3]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub3 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             //for sub4
             if(sub4 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             else if (sub4 == 1003){System.out.println(subjects[sub4]);totals+=5;}
             else if (sub4 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             else if (sub4 == 1975){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1205){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub4]);totals+=5;}}
             else if (sub4 == 1050){System.out.println(subjects[sub4]);totals+=2;}
             else if (sub4 == 1256){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub4]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub4 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             //for sub5
             if(sub5 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub5]);totals+=3;}else System.out.print("");}
             else if (sub5 == 1003){System.out.println(subjects[sub5]);totals+=5;}
             else if (sub5 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub5]);totals+=3;}else System.out.print("");}
             else if (sub5 == 1975){System.out.println(subjects[sub5]);totals+=3;}
             else if (sub5 == 1205){System.out.println(subjects[sub5]);totals+=3;}
             else if (sub5 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub5]);totals+=5;}}
             else if (sub5 == 1050){System.out.println(subjects[sub5]);totals+=2;}
             else if (sub5 == 1256){System.out.println(subjects[sub5]);totals+=3;}
             else if (sub5 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub5]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub5 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub5]);totals+=3;}else System.out.print("");}
             //for sub6
             if(sub6 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub6]);totals+=3;}else System.out.print("");}
             else if (sub6 == 1003){System.out.println(subjects[sub6]);totals+=5;}
             else if (sub6 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub6]);totals+=3;}else System.out.print("");}
             else if (sub6 == 1975){System.out.println(subjects[sub6]);totals+=3;}
             else if (sub6 == 1205){System.out.println(subjects[sub6]);totals+=3;}
             else if (sub6 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub6]);totals+=5;}}
             else if (sub6 == 1050){System.out.println(subjects[sub6]);totals+=2;}
             else if (sub6 == 1256){System.out.println(subjects[sub6]);totals+=3;}
             else if (sub6 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub6]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub6 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub6]);totals+=3;}else System.out.print("");}
             
             if(sub7 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub7]);totals+=3;}else System.out.print("");}
             else if (sub7 == 1003){System.out.println(subjects[sub7]);totals+=5;}
             else if (sub7 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub7]);totals+=3;}else System.out.print("");}
             else if (sub7 == 1975){System.out.println(subjects[sub7]);totals+=3;}
             else if (sub7 == 1205){System.out.println(subjects[sub7]);totals+=3;}
             else if (sub7 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub7]);totals+=5;}}
             else if (sub7 == 1050){System.out.println(subjects[sub7]);totals+=2;}
             else if (sub7 == 1256){System.out.println(subjects[sub7]);totals+=3;}
             else if (sub7 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub7]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub7 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub7]);totals+=3;}else System.out.print("");}
             
             if(sub8 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub8]);totals+=3;}else System.out.print("");}
             else if (sub8 == 1003){System.out.println(subjects[sub8]);totals+=5;}
             else if (sub8 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub8]);totals+=3;}else System.out.print("");}
             else if (sub8 == 1975){System.out.println(subjects[sub8]);totals+=3;}
             else if (sub8 == 1205){System.out.println(subjects[sub8]);totals+=3;}
             else if (sub8 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub8]);totals+=5;}}
             else if (sub8 == 1050){System.out.println(subjects[sub8]);totals+=2;}
             else if (sub8 == 1256){System.out.println(subjects[sub8]);totals+=3;}
             else if (sub8 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub8]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub8 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub8]);totals+=3;}else System.out.print("");}
             
             if(sub9 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub9]);totals+=3;}else System.out.print("");}
             else if (sub9 == 1003){System.out.println(subjects[sub9]);totals+=5;}
             else if (sub9 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub9]);totals+=3;}else System.out.print("");}
             else if (sub9 == 1975){System.out.println(subjects[sub9]);totals+=3;}
             else if (sub9 == 1205){System.out.println(subjects[sub9]);totals+=3;}
             else if (sub9 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub9]);totals+=5;}}
             else if (sub9 == 1050){System.out.println(subjects[sub9]);totals+=2;}
             else if (sub9 == 1256){System.out.println(subjects[sub9]);totals+=3;}
             else if (sub9 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub9]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub9 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub9]);totals+=3;}else System.out.print("");}
             System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totals+"\n");
             System.out.println("=================================================================================================================================================");
             //Inputs for Grades for Subject Entered
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){
 
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub1]+" :");
             grade1 = input.nextDouble();
             if(grade1 >=1.0 && grade1<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub2]+" :");
             grade2 = input.nextDouble();
             if(grade2 >=1.0 && grade2 <=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub3]+" :");
             grade3 = input.nextDouble();
             if(grade3 >=1.0 && grade3<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub4]+" :");
             grade4 = input.nextDouble();
             if(grade4 >=1.0 && grade4<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub5]+" :");
             grade5 = input.nextDouble();
             if(grade5 >=1.0 && grade5<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub6]+" :");
             grade6 = input.nextDouble();
             if(grade6 >=1.0 && grade6 <=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub7]+" :");
             grade7 = input.nextDouble();
             if(grade7 >=1.0 && grade7<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub8]+" :");
             grade8 = input.nextDouble();
             if(grade8 >=1.0 && grade8<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub9]+" :");
             grade9 = input.nextDouble();
             if(grade9 >=1.0 && grade9<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             System.out.println("=================================================================================================================================================");
             //Output result of the Entered Grades
             System.out.print("\nSee The Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {
                 
                 
              if(grade1 >=1.0 && grade1 <=3.5)
                     System.out.println(subjects[sub1]+" : Passed");
              else   System.out.println(subjects[sub1]+" : Failed");
                 
              if(grade2 >=1.0 && grade2<=3.5)
                     System.out.println(subjects[sub2]+" : Passed");
              else   System.out.println(subjects[sub2]+" : Failed");

              if(grade3 >=1.0 && grade3 <=3.5)
                     System.out.println(subjects[sub3]+" : Passed");
              else   System.out.println(subjects[sub3]+" : Failed");
 
              if(grade4 >=1.0 && grade4 <=3.5){
                     System.out.println(subjects[sub4]+" : Passed");}
              else   System.out.println(subjects[sub4]+" : Failed");
 
              if(grade5 >=1.0 && grade5 <=3.5)
                     System.out.println(subjects[sub5]+" : Passed");
              else   System.out.println(subjects[sub5]+" : Failed");

              if(grade6 >=1.0 && grade6 <=3.5)
                     System.out.println(subjects[sub6]+" : Passed");
              else   System.out.println(subjects[sub6]+" : Failed");
                 
              if(grade7 >=1.0 && grade7 <=3.5)
                     System.out.println(subjects[sub7]+" : Passed");
              else   System.out.println(subjects[sub7]+" : Failed");

              if(grade8 >=1.0 && grade8 <=3.5)
                     System.out.println(subjects[sub8]+" : Passed");
              else   System.out.println(subjects[sub8]+" : Failed");
              
              if(grade9 >=1.0&& grade9 <=3.5){
                     System.out.println(subjects[sub9]+" : Passed");}
              else   System.out.println(subjects[sub9]+" : Failed");
             System.out.println("=================================================================================================================================================");
             
             System.out.print("\nContinue to First Year Summer (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    summer();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    menu.menu();
                }
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);
                    System.out.println("=================================================================================================================================================");
}else Fmenu();}else Fmenu();}
    public void Seight(){
    Farray();
    System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1083 || sub1 == 1003 || sub1 == 1570 || sub1 == 1975 || sub1 == 1205 || sub1 == 1263 || sub1 == 1050||
                sub1 == 1256 || sub1 == 1242 || sub1 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1083 || sub2 == 1003 || sub2 == 1570 || sub2 == 1975 || sub2 == 1205 || sub2 == 1263 || sub2 == 1050||
                sub2 == 1256 || sub2 == 1242 || sub2 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1083 || sub3 == 1003 || sub3 == 1570 || sub3 == 1975 || sub3 == 1205 || sub3 == 1263 || sub3 == 1050||
                sub3 == 1256 || sub3 == 1242 || sub3 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 1083 || sub4 == 1003 || sub4 == 1570 || sub4 == 1975 || sub4 == 1205 || sub4 == 1263 || sub4 == 1050||
                sub4 == 1256 || sub4 == 1242 || sub4 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("5.Enter Offercode :");
             sub5 = input.nextInt();
             if(sub5 == 1083 || sub5 == 1003 || sub5 == 1570 || sub5 == 1975 || sub5 == 1205 || sub5 == 1263 || sub5 == 1050||
                sub5 == 1256 || sub5 == 1242 || sub5 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("6.Enter Offercode :");
             sub6 = input.nextInt();
             if(sub6 == 1083 || sub6 == 1003 || sub6 == 1570 || sub6 == 1975 || sub6 == 1205 || sub6 == 1263 || sub6 == 1050||
                sub6 == 1256 || sub6 == 1242 || sub6 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("7.Enter Offercode :");
             sub7 = input.nextInt();
             if(sub7 == 1083 || sub7 == 1003 || sub7 == 1570 || sub7 == 1975 || sub7 == 1205 || sub7 == 1263 || sub7 == 1050||
                sub7 == 1256 || sub7 == 1242 || sub7 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("8.Enter Offercode :");
             sub8 = input.nextInt();
             if(sub8 == 1083 || sub8 == 1003 || sub8 == 1570 || sub8 == 1975 || sub8 == 1205 || sub8 == 1263 || sub8 == 1050||
                sub8 == 1256 || sub8 == 1242 || sub8 == 2172);
             else i-=1;
             }
             System.out.println("=================================================================================================================================================");
             //ENTERED SUBJECTS
             System.out.println("\n");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n");
             //FOR sub1
             if(sub1 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1003){System.out.println(subjects[sub1]);totals+=5;}
             else if (sub1 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1975){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1205){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub1]);totals+=5;}}
             else if (sub1 == 1050){System.out.println(subjects[sub1]);totals+=2;}
             else if (sub1 == 1256){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub1]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub1 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             //for sub2
             if(sub2 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             else if (sub2 == 1003){System.out.println(subjects[sub2]);totals+=5;}
             else if (sub2 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             else if (sub2 == 1975){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1205){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub2]);totals+=5;}}
             else if (sub2 == 1050){System.out.println(subjects[sub2]);totals+=2;}
             else if (sub2 == 1256){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub2]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub2 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             //for sub3
             if(sub3 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             else if (sub3 == 1003){System.out.println(subjects[sub3]);totals+=5;}
             else if (sub3 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             else if (sub3 == 1975){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1205){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub3]);totals+=5;}}
             else if (sub3 == 1050){System.out.println(subjects[sub3]);totals+=2;}
             else if (sub3 == 1256){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub3]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub3 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             //for sub4
             if(sub4 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             else if (sub4 == 1003){System.out.println(subjects[sub4]);totals+=5;}
             else if (sub4 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             else if (sub4 == 1975){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1205){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub4]);totals+=5;}}
             else if (sub4 == 1050){System.out.println(subjects[sub4]);totals+=2;}
             else if (sub4 == 1256){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub4]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub4 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             //for sub5
             if(sub5 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub5]);totals+=3;}else System.out.print("");}
             else if (sub5 == 1003){System.out.println(subjects[sub5]);totals+=5;}
             else if (sub5 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub5]);totals+=3;}else System.out.print("");}
             else if (sub5 == 1975){System.out.println(subjects[sub5]);totals+=3;}
             else if (sub5 == 1205){System.out.println(subjects[sub5]);totals+=3;}
             else if (sub5 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub5]);totals+=5;}}
             else if (sub5 == 1050){System.out.println(subjects[sub5]);totals+=2;}
             else if (sub5 == 1256){System.out.println(subjects[sub5]);totals+=3;}
             else if (sub5 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub5]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub5 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub5]);totals+=3;}else System.out.print("");}
             //for sub6
             if(sub6 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub6]);totals+=3;}else System.out.print("");}
             else if (sub6 == 1003){System.out.println(subjects[sub6]);totals+=5;}
             else if (sub6 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub6]);totals+=3;}else System.out.print("");}
             else if (sub6 == 1975){System.out.println(subjects[sub6]);totals+=3;}
             else if (sub6 == 1205){System.out.println(subjects[sub6]);totals+=3;}
             else if (sub6 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub6]);totals+=5;}}
             else if (sub6 == 1050){System.out.println(subjects[sub6]);totals+=2;}
             else if (sub6 == 1256){System.out.println(subjects[sub6]);totals+=3;}
             else if (sub6 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub6]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub6 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub6]);totals+=3;}else System.out.print("");}
             //for sub7
             if(sub7 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub7]);totals+=3;}else System.out.print("");}
             else if (sub7 == 1003){System.out.println(subjects[sub7]);totals+=5;}
             else if (sub7 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub7]);totals+=3;}else System.out.print("");}
             else if (sub7 == 1975){System.out.println(subjects[sub7]);totals+=3;}
             else if (sub7 == 1205){System.out.println(subjects[sub7]);totals+=3;}
             else if (sub7 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub7]);totals+=5;}}
             else if (sub7 == 1050){System.out.println(subjects[sub7]);totals+=2;}
             else if (sub7 == 1256){System.out.println(subjects[sub7]);totals+=3;}
             else if (sub7 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub7]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub7 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub7]);totals+=3;}else System.out.print("");}
             //for sub8
             if(sub8 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub8]);totals+=3;}else System.out.print("");}
             else if (sub8 == 1003){System.out.println(subjects[sub8]);totals+=5;}
             else if (sub8 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub8]);totals+=3;}else System.out.print("");}
             else if (sub8 == 1975){System.out.println(subjects[sub8]);totals+=3;}
             else if (sub8 == 1205){System.out.println(subjects[sub8]);totals+=3;}
             else if (sub8 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub8]);totals+=5;}}
             else if (sub8 == 1050){System.out.println(subjects[sub8]);totals+=2;}
             else if (sub8 == 1256){System.out.println(subjects[sub8]);totals+=3;}
             else if (sub8 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub8]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub8 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub8]);totals+=3;}else System.out.print("");}
             
             System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totals+"\n");
             System.out.println("=================================================================================================================================================");
             //Inputs for Grades for Entered Subjects
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){   
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub1]+" :");
             grade1 = input.nextDouble();
             if(grade1 >=1.0 && grade1<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub2]+" :");
             grade2 = input.nextDouble();
             if(grade2 >=1.0 && grade2 <=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub3]+" :");
             grade3 = input.nextDouble();
             if(grade3 >=1.0 && grade3<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub4]+" :");
             grade4 = input.nextDouble();
             if(grade4 >=1.0 && grade4<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub5]+" :");
             grade5 = input.nextDouble();
             if(grade5 >=1.0 && grade5<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub6]+" :");
             grade6 = input.nextDouble();
             if(grade6 >=1.0 && grade6 <=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub7]+" :");
             grade7 = input.nextDouble();
             if(grade7 >=1.0 && grade7<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub8]+" :");
             grade8 = input.nextDouble();
             if(grade8 >=1.0 && grade8<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             System.out.println("=================================================================================================================================================");
             //Result of grades entered
             System.out.print("\nSee The Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action)){ 
              if(grade1 >=1.0 && grade1 <=3.5)
                     System.out.println(subjects[sub1]+" : Passed");
              else   System.out.println(subjects[sub1]+" : Failed");
                 
              if(grade2 >=1.0 && grade2<=3.5)
                     System.out.println(subjects[sub2]+" : Passed");
              else   System.out.println(subjects[sub2]+" : Failed");

              if(grade3 >=1.0 && grade3 <=3.5)
                     System.out.println(subjects[sub3]+" : Passed");
              else   System.out.println(subjects[sub3]+" : Failed");
 
              if(grade4 >=1.0 && grade4 <=3.5){
                     System.out.println(subjects[sub4]+" : Passed");}
              else   System.out.println(subjects[sub4]+" : Failed");
 
              if(grade5 >=1.0 && grade5 <=3.5)
                     System.out.println(subjects[sub5]+" : Passed");
              else   System.out.println(subjects[sub5]+" : Failed");

              if(grade6 >=1.0 && grade6 <=3.5)
                     System.out.println(subjects[sub6]+" : Passed");
              else   System.out.println(subjects[sub6]+" : Failed");
                 
              if(grade7 >=1.0 && grade7 <=3.5)
                     System.out.println(subjects[sub7]+" : Passed");
              else   System.out.println(subjects[sub7]+" : Failed");

              if(grade8 >=1.0 && grade8 <=3.5)
                     System.out.println(subjects[sub8]+" : Passed");
              else   System.out.println(subjects[sub8]+" : Failed");
             
              System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to First Year Summer (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    summer();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    menu.menu();
                }
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);
                    System.out.println("=================================================================================================================================================");
         }else Fmenu();
      }else Fmenu();
    }
    public void Sseven(){
    Farray();
    System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1083 || sub1 == 1003 || sub1 == 1570 || sub1 == 1975 || sub1 == 1205 || sub1 == 1263 || sub1 == 1050||
                sub1 == 1256 || sub1 == 1242 || sub1 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1083 || sub2 == 1003 || sub2 == 1570 || sub2 == 1975 || sub2 == 1205 || sub2 == 1263 || sub2 == 1050||
                sub2 == 1256 || sub2 == 1242 || sub2 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1083 || sub3 == 1003 || sub3 == 1570 || sub3 == 1975 || sub3 == 1205 || sub3 == 1263 || sub3 == 1050||
                sub3 == 1256 || sub3 == 1242 || sub3 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 1083 || sub4 == 1003 || sub4 == 1570 || sub4 == 1975 || sub4 == 1205 || sub4 == 1263 || sub4 == 1050||
                sub4 == 1256 || sub4 == 1242 || sub4 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("5.Enter Offercode :");
             sub5 = input.nextInt();
             if(sub5 == 1083 || sub5 == 1003 || sub5 == 1570 || sub5 == 1975 || sub5 == 1205 || sub5 == 1263 || sub5 == 1050||
                sub5 == 1256 || sub5 == 1242 || sub5 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("6.Enter Offercode :");
             sub6 = input.nextInt();
             if(sub6 == 1083 || sub6 == 1003 || sub6 == 1570 || sub6 == 1975 || sub6 == 1205 || sub6 == 1263 || sub6 == 1050||
                sub6 == 1256 || sub6 == 1242 || sub6 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("7.Enter Offercode :");
             sub7 = input.nextInt();
             if(sub7 == 1083 || sub7 == 1003 || sub7 == 1570 || sub7 == 1975 || sub7 == 1205 || sub7 == 1263 || sub7 == 1050||
                sub7 == 1256 || sub7 == 1242 || sub7 == 2172);
             else i-=1;
             }
             System.out.println("=================================================================================================================================================");
             System.out.println("\n");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n"); 
             
                   if(sub1 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1003){System.out.println(subjects[sub1]);totals+=5;}
             else if (sub1 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1975){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1205){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub1]);totals+=5;}}
             else if (sub1 == 1050){System.out.println(subjects[sub1]);totals+=2;}
             else if (sub1 == 1256){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub1]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub1 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             
             if(sub2 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             else if (sub2 == 1003){System.out.println(subjects[sub2]);totals+=5;}
             else if (sub2 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             else if (sub2 == 1975){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1205){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub2]);totals+=5;}}
             else if (sub2 == 1050){System.out.println(subjects[sub2]);totals+=2;}
             else if (sub2 == 1256){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub2]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub2 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             
             if(sub3 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             else if (sub3 == 1003){System.out.println(subjects[sub3]);totals+=5;}
             else if (sub3 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             else if (sub3 == 1975){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1205){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub3]);totals+=5;}}
             else if (sub3 == 1050){System.out.println(subjects[sub3]);totals+=2;}
             else if (sub3 == 1256){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub3]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub3 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             
             if(sub4 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             else if (sub4 == 1003){System.out.println(subjects[sub4]);totals+=5;}
             else if (sub4 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             else if (sub4 == 1975){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1205){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub4]);totals+=5;}}
             else if (sub4 == 1050){System.out.println(subjects[sub4]);totals+=2;}
             else if (sub4 == 1256){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub4]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub4 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             
             if(sub5 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub5]);totals+=3;}else System.out.print("");}
             else if (sub5 == 1003){System.out.println(subjects[sub5]);totals+=5;}
             else if (sub5 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub5]);totals+=3;}else System.out.print("");}
             else if (sub5 == 1975){System.out.println(subjects[sub5]);totals+=3;}
             else if (sub5 == 1205){System.out.println(subjects[sub5]);totals+=3;}
             else if (sub5 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub5]);totals+=5;}}
             else if (sub5 == 1050){System.out.println(subjects[sub5]);totals+=2;}
             else if (sub5 == 1256){System.out.println(subjects[sub5]);totals+=3;}
             else if (sub5 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub5]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub5 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub5]);totals+=3;}else System.out.print("");}
             
             if(sub6 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub6]);totals+=3;}else System.out.print("");}
             else if (sub6 == 1003){System.out.println(subjects[sub6]);totals+=5;}
             else if (sub6 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub6]);totals+=3;}else System.out.print("");}
             else if (sub6 == 1975){System.out.println(subjects[sub6]);totals+=3;}
             else if (sub6 == 1205){System.out.println(subjects[sub6]);totals+=3;}
             else if (sub6 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub6]);totals+=5;}}
             else if (sub6 == 1050){System.out.println(subjects[sub6]);totals+=2;}
             else if (sub6 == 1256){System.out.println(subjects[sub6]);totals+=3;}
             else if (sub6 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub6]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub6 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub6]);totals+=3;}else System.out.print("");}
             
             if(sub7 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub7]);totals+=3;}else System.out.print("");}
             else if (sub7 == 1003){System.out.println(subjects[sub7]);totals+=5;}
             else if (sub7 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub7]);totals+=3;}else System.out.print("");}
             else if (sub7 == 1975){System.out.println(subjects[sub7]);totals+=3;}
             else if (sub7 == 1205){System.out.println(subjects[sub7]);totals+=3;}
             else if (sub7 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub7]);totals+=5;}}
             else if (sub7 == 1050){System.out.println(subjects[sub7]);totals+=2;}
             else if (sub7 == 1256){System.out.println(subjects[sub7]);totals+=3;}
             else if (sub7 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub7]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub7 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub7]);totals+=3;}else System.out.print("");}
    
             System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totals+"\n");
             System.out.println("=================================================================================================================================================");
             //Inputs for Grades for Entered Subjects
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){   
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub1]+" :");
             grade1 = input.nextDouble();
             if(grade1 >=1.0 && grade1<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub2]+" :");
             grade2 = input.nextDouble();
             if(grade2 >=1.0 && grade2 <=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub3]+" :");
             grade3 = input.nextDouble();
             if(grade3 >=1.0 && grade3<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub4]+" :");
             grade4 = input.nextDouble();
             if(grade4 >=1.0 && grade4<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub5]+" :");
             grade5 = input.nextDouble();
             if(grade5 >=1.0 && grade5<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub6]+" :");
             grade6 = input.nextDouble();
             if(grade6 >=1.0 && grade6 <=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub7]+" :");
             grade7 = input.nextDouble();
             if(grade7 >=1.0 && grade7<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             System.out.println("=================================================================================================================================================");
             System.out.print("\nSee The Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {    
              if(grade1 >=1.0 && grade1 <=3.5)
                     System.out.println(subjects[sub1]+" : Passed");
              else   System.out.println(subjects[sub1]+" : Failed");
                 
              if(grade2 >=1.0 && grade2<=3.5)
                     System.out.println(subjects[sub2]+" : Passed");
              else   System.out.println(subjects[sub2]+" : Failed");

              if(grade3 >=1.0 && grade3 <=3.5)
                     System.out.println(subjects[sub3]+" : Passed");
              else   System.out.println(subjects[sub3]+" : Failed");
 
              if(grade4 >=1.0 && grade4 <=3.5){
                     System.out.println(subjects[sub4]+" : Passed");}
              else   System.out.println(subjects[sub4]+" : Failed");
 
              if(grade5 >=1.0 && grade5 <=3.5)
                     System.out.println(subjects[sub5]+" : Passed");
              else   System.out.println(subjects[sub5]+" : Failed");

              if(grade6 >=1.0 && grade6 <=3.5)
                     System.out.println(subjects[sub6]+" : Passed");
              else   System.out.println(subjects[sub6]+" : Failed");
                 
              if(grade7 >=1.0 && grade7 <=3.5)
                     System.out.println(subjects[sub7]+" : Passed");
              else   System.out.println(subjects[sub7]+" : Failed");

             System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to First Year Summer (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    summer();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    menu.menu();
                }
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);
                    System.out.println("=================================================================================================================================================");
      }else Fmenu();
    }else Fmenu();
}
    public void Ssix(){
             Farray();
             System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1083 || sub1 == 1003 || sub1 == 1570 || sub1 == 1975 || sub1 == 1205 || sub1 == 1263 || sub1 == 1050||
                sub1 == 1256 || sub1 == 1242 || sub1 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1083 || sub2 == 1003 || sub2 == 1570 || sub2 == 1975 || sub2 == 1205 || sub2 == 1263 || sub2 == 1050||
                sub2 == 1256 || sub2 == 1242 || sub2 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1083 || sub3 == 1003 || sub3 == 1570 || sub3 == 1975 || sub3 == 1205 || sub3 == 1263 || sub3 == 1050||
                sub3 == 1256 || sub3 == 1242 || sub3 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 1083 || sub4 == 1003 || sub4 == 1570 || sub4 == 1975 || sub4 == 1205 || sub4 == 1263 || sub4 == 1050||
                sub4 == 1256 || sub4 == 1242 || sub4 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("5.Enter Offercode :");
             sub5 = input.nextInt();
             if(sub5 == 1083 || sub5 == 1003 || sub5 == 1570 || sub5 == 1975 || sub5 == 1205 || sub5 == 1263 || sub5 == 1050||
                sub5 == 1256 || sub5 == 1242 || sub5 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("6.Enter Offercode :");
             sub6 = input.nextInt();
             if(sub6 == 1083 || sub6 == 1003 || sub6 == 1570 || sub6 == 1975 || sub6 == 1205 || sub6 == 1263 || sub6 == 1050||
                sub6 == 1256 || sub6 == 1242 || sub6 == 2172);
             else i-=1;
             }
             System.out.println("=================================================================================================================================================");
             System.out.println("\n");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n"); 
             if(sub1 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1003){System.out.println(subjects[sub1]);totals+=5;}
             else if (sub1 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1975){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1205){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub1]);totals+=5;}}
             else if (sub1 == 1050){System.out.println(subjects[sub1]);totals+=2;}
             else if (sub1 == 1256){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub1]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub1 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             
             if(sub2 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             else if (sub2 == 1003){System.out.println(subjects[sub2]);totals+=5;}
             else if (sub2 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             else if (sub2 == 1975){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1205){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub2]);totals+=5;}}
             else if (sub2 == 1050){System.out.println(subjects[sub2]);totals+=2;}
             else if (sub2 == 1256){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub2]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub2 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             
             if(sub3 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             else if (sub3 == 1003){System.out.println(subjects[sub3]);totals+=5;}
             else if (sub3 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             else if (sub3 == 1975){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1205){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub3]);totals+=5;}}
             else if (sub3 == 1050){System.out.println(subjects[sub3]);totals+=2;}
             else if (sub3 == 1256){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub3]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub3 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             
             if(sub4 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             else if (sub4 == 1003){System.out.println(subjects[sub4]);totals+=5;}
             else if (sub4 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             else if (sub4 == 1975){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1205){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub4]);totals+=5;}}
             else if (sub4 == 1050){System.out.println(subjects[sub4]);totals+=2;}
             else if (sub4 == 1256){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub4]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub4 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             
             if(sub5 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub5]);totals+=3;}else System.out.print("");}
             else if (sub5 == 1003){System.out.println(subjects[sub5]);totals+=5;}
             else if (sub5 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub5]);totals+=3;}else System.out.print("");}
             else if (sub5 == 1975){System.out.println(subjects[sub5]);totals+=3;}
             else if (sub5 == 1205){System.out.println(subjects[sub5]);totals+=3;}
             else if (sub5 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub5]);totals+=5;}}
             else if (sub5 == 1050){System.out.println(subjects[sub5]);totals+=2;}
             else if (sub5 == 1256){System.out.println(subjects[sub5]);totals+=3;}
             else if (sub5 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub5]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub5 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub5]);totals+=3;}else System.out.print("");}
             
             if(sub6 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub6]);totals+=3;}else System.out.print("");}
             else if (sub6 == 1003){System.out.println(subjects[sub6]);totals+=5;}
             else if (sub6 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub6]);totals+=3;}else System.out.print("");}
             else if (sub6 == 1975){System.out.println(subjects[sub6]);totals+=3;}
             else if (sub6 == 1205){System.out.println(subjects[sub6]);totals+=3;}
             else if (sub6 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub6]);totals+=5;}}
             else if (sub6 == 1050){System.out.println(subjects[sub6]);totals+=2;}
             else if (sub6 == 1256){System.out.println(subjects[sub6]);totals+=3;}
             else if (sub6 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub6]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub6 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub6]);totals+=3;}else System.out.print("");}
             
              System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totals+"\n");
             System.out.println("=================================================================================================================================================");
             //Inputs for Grades for Entered Subjects
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){   
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub1]+" :");
             grade1 = input.nextDouble();
             if(grade1 >=1.0 && grade1<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub2]+" :");
             grade2 = input.nextDouble();
             if(grade2 >=1.0 && grade2 <=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub3]+" :");
             grade3 = input.nextDouble();
             if(grade3 >=1.0 && grade3<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub4]+" :");
             grade4 = input.nextDouble();
             if(grade4 >=1.0 && grade4<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub5]+" :");
             grade5 = input.nextDouble();
             if(grade5 >=1.0 && grade5<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub6]+" :");
             grade6 = input.nextDouble();
             if(grade6 >=1.0 && grade6 <=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             
             System.out.println("=================================================================================================================================================");
             System.out.print("\nSee The Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {
              if(grade1 >=1.0 && grade1 <=3.5)
                     System.out.println(subjects[sub1]+" : Passed");
              else   System.out.println(subjects[sub1]+" : Failed");
                 
              if(grade2 >=1.0 && grade2<=3.5)
                     System.out.println(subjects[sub2]+" : Passed");
              else   System.out.println(subjects[sub2]+" : Failed");

              if(grade3 >=1.0 && grade3 <=3.5)
                     System.out.println(subjects[sub3]+" : Passed");
              else   System.out.println(subjects[sub3]+" : Failed");
 
              if(grade4 >=1.0 && grade4 <=3.5){
                     System.out.println(subjects[sub4]+" : Passed");}
              else   System.out.println(subjects[sub4]+" : Failed");
 
              if(grade5 >=1.0 && grade5 <=3.5)
                     System.out.println(subjects[sub5]+" : Passed");
              else   System.out.println(subjects[sub5]+" : Failed");

              if(grade6 >=1.0 && grade6 <=3.5)
                     System.out.println(subjects[sub6]+" : Passed");
              else   System.out.println(subjects[sub6]+" : Failed");
                 
             System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to First Year Summer (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    summer();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    menu.menu();
                }
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);
                    System.out.println("=================================================================================================================================================");
       }else Fmenu();
      }else Fmenu();
    }
    public void Sfive(){
             Farray();
             System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1083 || sub1 == 1003 || sub1 == 1570 || sub1 == 1975 || sub1 == 1205 || sub1 == 1263 || sub1 == 1050||
                sub1 == 1256 || sub1 == 1242 || sub1 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1083 || sub2 == 1003 || sub2 == 1570 || sub2 == 1975 || sub2 == 1205 || sub2 == 1263 || sub2 == 1050||
                sub2 == 1256 || sub2 == 1242 || sub2 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1083 || sub3 == 1003 || sub3 == 1570 || sub3 == 1975 || sub3 == 1205 || sub3 == 1263 || sub3 == 1050||
                sub3 == 1256 || sub3 == 1242 || sub3 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 1083 || sub4 == 1003 || sub4 == 1570 || sub4 == 1975 || sub4 == 1205 || sub4 == 1263 || sub4 == 1050||
                sub4 == 1256 || sub4 == 1242 || sub4 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("5.Enter Offercode :");
             sub5 = input.nextInt();
             if(sub5 == 1083 || sub5 == 1003 || sub5 == 1570 || sub5 == 1975 || sub5 == 1205 || sub5 == 1263 || sub5 == 1050||
                sub5 == 1256 || sub5 == 1242 || sub5 == 2172);
             else i-=1;
             }
             
             System.out.println("=================================================================================================================================================");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n"); 
             if(sub1 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1003){System.out.println(subjects[sub1]);totals+=5;}
             else if (sub1 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1975){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1205){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub1]);totals+=5;}}
             else if (sub1 == 1050){System.out.println(subjects[sub1]);totals+=2;}
             else if (sub1 == 1256){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub1]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub1 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             
             if(sub2 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             else if (sub2 == 1003){System.out.println(subjects[sub2]);totals+=5;}
             else if (sub2 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             else if (sub2 == 1975){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1205){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub2]);totals+=5;}}
             else if (sub2 == 1050){System.out.println(subjects[sub2]);totals+=2;}
             else if (sub2 == 1256){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub2]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub2 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             
             if(sub3 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             else if (sub3 == 1003){System.out.println(subjects[sub3]);totals+=5;}
             else if (sub3 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             else if (sub3 == 1975){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1205){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub3]);totals+=5;}}
             else if (sub3 == 1050){System.out.println(subjects[sub3]);totals+=2;}
             else if (sub3 == 1256){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub3]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub3 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             
             if(sub4 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             else if (sub4 == 1003){System.out.println(subjects[sub4]);totals+=5;}
             else if (sub4 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             else if (sub4 == 1975){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1205){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub4]);totals+=5;}}
             else if (sub4 == 1050){System.out.println(subjects[sub4]);totals+=2;}
             else if (sub4 == 1256){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub4]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub4 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             
             if(sub5 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub5]);totals+=3;}else System.out.print("");}
             else if (sub5 == 1003){System.out.println(subjects[sub5]);totals+=5;}
             else if (sub5 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub5]);totals+=3;}else System.out.print("");}
             else if (sub5 == 1975){System.out.println(subjects[sub5]);totals+=3;}
             else if (sub5 == 1205){System.out.println(subjects[sub5]);totals+=3;}
             else if (sub5 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub5]);totals+=5;}}
             else if (sub5 == 1050){System.out.println(subjects[sub5]);totals+=2;}
             else if (sub5 == 1256){System.out.println(subjects[sub5]);totals+=3;}
             else if (sub5 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub5]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub5 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub5]);totals+=3;}else System.out.print("");}
             
              System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totals+"\n");
             System.out.println("=================================================================================================================================================");
             //Inputs for Grades for Entered Subjects
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){   
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub1]+" :");
             grade1 = input.nextDouble();
             if(grade1 >=1.0 && grade1<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub2]+" :");
             grade2 = input.nextDouble();
             if(grade2 >=1.0 && grade2 <=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub3]+" :");
             grade3 = input.nextDouble();
             if(grade3 >=1.0 && grade3<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub4]+" :");
             grade4 = input.nextDouble();
             if(grade4 >=1.0 && grade4<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub5]+" :");
             grade5 = input.nextDouble();
             if(grade5 >=1.0 && grade5<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             System.out.println("=================================================================================================================================================");
             System.out.print("\nSee The Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {  
              if(grade1 >=1.0 && grade1 <=3.5)
                     System.out.println(subjects[sub1]+" : Passed");
              else   System.out.println(subjects[sub1]+" : Failed");
                 
              if(grade2 >=1.0 && grade2<=3.5)
                     System.out.println(subjects[sub2]+" : Passed");
              else   System.out.println(subjects[sub2]+" : Failed");

              if(grade3 >=1.0 && grade3 <=3.5)
                     System.out.println(subjects[sub3]+" : Passed");
              else   System.out.println(subjects[sub3]+" : Failed");
 
              if(grade4 >=1.0 && grade4 <=3.5){
                     System.out.println(subjects[sub4]+" : Passed");}
              else   System.out.println(subjects[sub4]+" : Failed");
 
              if(grade5 >=1.0 && grade5 <=3.5)
                     System.out.println(subjects[sub5]+" : Passed");
              else   System.out.println(subjects[sub5]+" : Failed");
                 
             System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to First Year Summer (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    summer();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    menu.menu();
                }
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);
                    System.out.println("=================================================================================================================================================");
       }else Fmenu();
      }else Fmenu();       
    }
    public void Sfour(){
    Farray();
             System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1083 || sub1 == 1003 || sub1 == 1570 || sub1 == 1975 || sub1 == 1205 || sub1 == 1263 || sub1 == 1050||
                sub1 == 1256 || sub1 == 1242 || sub1 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1083 || sub2 == 1003 || sub2 == 1570 || sub2 == 1975 || sub2 == 1205 || sub2 == 1263 || sub2 == 1050||
                sub2 == 1256 || sub2 == 1242 || sub2 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1083 || sub3 == 1003 || sub3 == 1570 || sub3 == 1975 || sub3 == 1205 || sub3 == 1263 || sub3 == 1050||
                sub3 == 1256 || sub3 == 1242 || sub3 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("4.Enter Offercode :");
             sub4 = input.nextInt();
             if(sub4 == 1083 || sub4 == 1003 || sub4 == 1570 || sub4 == 1975 || sub4 == 1205 || sub4 == 1263 || sub4 == 1050||
                sub4 == 1256 || sub4 == 1242 || sub4 == 2172);
             else i-=1;
             }
             
             System.out.println("=================================================================================================================================================");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n"); 
             if(sub1 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1003){System.out.println(subjects[sub1]);totals+=5;}
             else if (sub1 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1975){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1205){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub1]);totals+=5;}}
             else if (sub1 == 1050){System.out.println(subjects[sub1]);totals+=2;}
             else if (sub1 == 1256){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub1]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub1 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             
             if(sub2 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             else if (sub2 == 1003){System.out.println(subjects[sub2]);totals+=5;}
             else if (sub2 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             else if (sub2 == 1975){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1205){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub2]);totals+=5;}}
             else if (sub2 == 1050){System.out.println(subjects[sub2]);totals+=2;}
             else if (sub2 == 1256){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub2]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub2 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             
             if(sub3 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             else if (sub3 == 1003){System.out.println(subjects[sub3]);totals+=5;}
             else if (sub3 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             else if (sub3 == 1975){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1205){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub3]);totals+=5;}}
             else if (sub3 == 1050){System.out.println(subjects[sub3]);totals+=2;}
             else if (sub3 == 1256){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub3]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub3 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             
             if(sub4 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             else if (sub4 == 1003){System.out.println(subjects[sub4]);totals+=5;}
             else if (sub4 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             else if (sub4 == 1975){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1205){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub4]);totals+=5;}}
             else if (sub4 == 1050){System.out.println(subjects[sub4]);totals+=2;}
             else if (sub4 == 1256){System.out.println(subjects[sub4]);totals+=3;}
             else if (sub4 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub4]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub4 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub4]);totals+=3;}else System.out.print("");}
             
               System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totals+"\n");
             System.out.println("=================================================================================================================================================");
             //Inputs for Grades for Entered Subjects
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub1]+" :");
             grade1 = input.nextDouble();
             if(grade1 >=1.0 && grade1<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub2]+" :");
             grade2 = input.nextDouble();
             if(grade2 >=1.0 && grade2 <=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub3]+" :");
             grade3 = input.nextDouble();
             if(grade3 >=1.0 && grade3<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub4]+" :");
             grade4 = input.nextDouble();
             if(grade4 >=1.0 && grade4<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             System.out.println("=================================================================================================================================================");
             System.out.print("\nSee The Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {  
                 
              if(grade1 >=1.0 && grade1 <=3.5)
                     System.out.println(subjects[sub1]+" : Passed");
              else   System.out.println(subjects[sub1]+" : Failed");
                 
              if(grade2 >=1.0 && grade2<=3.5)
                     System.out.println(subjects[sub2]+" : Passed");
              else   System.out.println(subjects[sub2]+" : Failed");

              if(grade3 >=1.0 && grade3 <=3.5)
                     System.out.println(subjects[sub3]+" : Passed");
              else   System.out.println(subjects[sub3]+" : Failed");
 
              if(grade4 >=1.0 && grade4 <=3.5){
                     System.out.println(subjects[sub4]+" : Passed");}
              else   System.out.println(subjects[sub4]+" : Failed");
             
             System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to First Year Summer (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    summer();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    menu.menu();
                }
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);
                    System.out.println("=================================================================================================================================================");
       }else Fmenu();
      }else Fmenu();      
    }
    public void Sthree(){Farray();
             System.out.println("=================================================================================================================================================");
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1083 || sub1 == 1003 || sub1 == 1570 || sub1 == 1975 || sub1 == 1205 || sub1 == 1263 || sub1 == 1050||
                sub1 == 1256 || sub1 == 1242 || sub1 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1083 || sub2 == 1003 || sub2 == 1570 || sub2 == 1975 || sub2 == 1205 || sub2 == 1263 || sub2 == 1050||
                sub2 == 1256 || sub2 == 1242 || sub2 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("3.Enter Offercode :");
             sub3 = input.nextInt();
             if(sub3 == 1083 || sub3 == 1003 || sub3 == 1570 || sub3 == 1975 || sub3 == 1205 || sub3 == 1263 || sub3 == 1050||
                sub3 == 1256 || sub3 == 1242 || sub3 == 2172);
             else i-=1;
             }
             System.out.println("=================================================================================================================================================");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n"); 
             if(sub1 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1003){System.out.println(subjects[sub1]);totals+=5;}
             else if (sub1 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1975){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1205){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub1]);totals+=5;}}
             else if (sub1 == 1050){System.out.println(subjects[sub1]);totals+=2;}
             else if (sub1 == 1256){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub1]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub1 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             
             if(sub2 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             else if (sub2 == 1003){System.out.println(subjects[sub2]);totals+=5;}
             else if (sub2 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             else if (sub2 == 1975){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1205){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub2]);totals+=5;}}
             else if (sub2 == 1050){System.out.println(subjects[sub2]);totals+=2;}
             else if (sub2 == 1256){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub2]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub2 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             
             if(sub3 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             else if (sub3 == 1003){System.out.println(subjects[sub3]);totals+=5;}
             else if (sub3 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             else if (sub3 == 1975){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1205){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub3]);totals+=5;}}
             else if (sub3 == 1050){System.out.println(subjects[sub3]);totals+=2;}
             else if (sub3 == 1256){System.out.println(subjects[sub3]);totals+=3;}
             else if (sub3 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub3]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub3 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub3]);totals+=3;}else System.out.print("");}
             
               System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totals+"\n");
             System.out.println("=================================================================================================================================================");
             //Inputs for Grades for Entered Subjects
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub1]+" :");
             grade1 = input.nextDouble();
             if(grade1 >=1.0 && grade1<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub2]+" :");
             grade2 = input.nextDouble();
             if(grade2 >=1.0 && grade2 <=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub3]+" :");
             grade3 = input.nextDouble();
             if(grade3 >=1.0 && grade3<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             System.out.println("=================================================================================================================================================");
             System.out.print("\nSee The Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {  
                 
              if(grade1 >=1.0 && grade1 <=3.5)
                     System.out.println(subjects[sub1]+" : Passed");
              else   System.out.println(subjects[sub1]+" : Failed");
                 
              if(grade2 >=1.0 && grade2<=3.5)
                     System.out.println(subjects[sub2]+" : Passed");
              else   System.out.println(subjects[sub2]+" : Failed");

              if(grade3 >=1.0 && grade3 <=3.5)
                     System.out.println(subjects[sub3]+" : Passed");
              else   System.out.println(subjects[sub3]+" : Failed");
             System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to First Year Summer (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    summer();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    menu.menu();
                }
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);
                    System.out.println("=================================================================================================================================================");
       }else Fmenu();
      }else Fmenu();
    }
    public void Stwo(){
             //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1083 || sub1 == 1003 || sub1 == 1570 || sub1 == 1975 || sub1 == 1205 || sub1 == 1263 || sub1 == 1050||
                sub1 == 1256 || sub1 == 1242 || sub1 == 2172);
             else i-=1;
             }
             for(int i = 1;i<=1;i++){
             System.out.print("2.Enter Offercode :");
             sub2 = input.nextInt();
             if(sub2 == 1083 || sub2 == 1003 || sub2 == 1570 || sub2 == 1975 || sub2 == 1205 || sub2 == 1263 || sub2 == 1050||
                sub2 == 1256 || sub2 == 1242 || sub2 == 2172);
             else i-=1;
             }

             System.out.println("=================================================================================================================================================");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n"); 
             if(sub1 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1003){System.out.println(subjects[sub1]);totals+=5;}
             else if (sub1 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1975){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1205){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub1]);totals+=5;}}
             else if (sub1 == 1050){System.out.println(subjects[sub1]);totals+=2;}
             else if (sub1 == 1256){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub1]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub1 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             
             if(sub2 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             else if (sub2 == 1003){System.out.println(subjects[sub2]);totals+=5;}
             else if (sub2 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
             else if (sub2 == 1975){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1205){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub2]);totals+=5;}}
             else if (sub2 == 1050){System.out.println(subjects[sub2]);totals+=2;}
             else if (sub2 == 1256){System.out.println(subjects[sub2]);totals+=3;}
             else if (sub2 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub2]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub2 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub2]);totals+=3;}else System.out.print("");}
         
               System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totals+"\n");
             System.out.println("=================================================================================================================================================");
             //Inputs for Grades for Entered Subjects
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub1]+" :");
             grade1 = input.nextDouble();
             if(grade1 >=1.0 && grade1<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub2]+" :");
             grade2 = input.nextDouble();
             if(grade2 >=1.0 && grade2 <=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             System.out.println("=================================================================================================================================================");
             System.out.print("\nSee The Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {  
                 
              if(grade1 >=1.0 && grade1 <=3.5)
                     System.out.println(subjects[sub1]+" : Passed");
              else   System.out.println(subjects[sub1]+" : Failed");
                 
              if(grade2 >=1.0 && grade2<=3.5)
                     System.out.println(subjects[sub2]+" : Passed");
              else   System.out.println(subjects[sub2]+" : Failed");

             System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to First Year Summer (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    summer();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    menu.menu();
                }
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);
                    System.out.println("=================================================================================================================================================");
       }else Fmenu();
      }else Fmenu();
    }
    public void Sone(){ //OfferCode Area
             for(int i = 1;i<=1;i++){
             System.out.print("1.Enter Offercode :");
             sub1 = input.nextInt();
             if(sub1 == 1083 || sub1 == 1003 || sub1 == 1570 || sub1 == 1975 || sub1 == 1205 || sub1 == 1263 || sub1 == 1050||
                sub1 == 1256 || sub1 == 1242 || sub1 == 2172);
             else i-=1;
             }
             System.out.println("=================================================================================================================================================");
             System.out.println(subjects[4545]);
             System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
             System.out.print(" FIRSY YEAR,SECOND SEMESTER\n"); 
             if(sub1 == 1083){if(english >=1.0 && english <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1003){System.out.println(subjects[sub1]);totals+=5;}
             else if (sub1 == 1570){if(filipino >=1.0 && filipino <=3.5){System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             else if (sub1 == 1975){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1205){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1263){if(nurse >=1.0 && nurse <=3.5){System.out.println(subjects[sub1]);totals+=5;}}
             else if (sub1 == 1050){System.out.println(subjects[sub1]);totals+=2;}
             else if (sub1 == 1256){System.out.println(subjects[sub1]);totals+=3;}
             else if (sub1 == 1242){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[sub1]);System.out.println(subjects[2172]);totals+=3;}else System.out.print("");}
             else if (sub1 == 2172){if(nstp >=1.0 && nstp <=3.5){System.out.println(subjects[1242]);System.out.println(subjects[sub1]);totals+=3;}else System.out.print("");}
             
               System.out.println(subjects[3535]); 
             System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+totals+"\n");
             System.out.println("=================================================================================================================================================");
             //Inputs for Grades for Entered Subjects
             System.out.print("Enter your Grades (Y/y || N/n):");
             String answer = input.next();
             if("Y".equals(answer) || "y".equals(answer)){
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub1]+" :");
             grade1 = input.nextDouble();
             if(grade1 >=1.0 && grade1<=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             for(int y =1;y<=1;y++){    
             System.out.print(subjects[sub2]+" :");
             grade2 = input.nextDouble();
             if(grade2 >=1.0 && grade2 <=5.0){System.out.print("");}
             else {System.out.println("Invalid Input ");y-=1;}
             }
             System.out.println("=================================================================================================================================================");
             System.out.print("\nSee The Result (Y/y || N/n) :");
             String action = input.next();
             if("Y".equals(action) || "y".equals(action))
             {  
                 
              if(grade1 >=1.0 && grade1 <=3.5)
                     System.out.println(subjects[sub1]+" : Passed");
              else   System.out.println(subjects[sub1]+" : Failed");
             System.out.println("=================================================================================================================================================");
             System.out.print("\nContinue to First Year Summer (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                    summer();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    menu.menu();
                }
                else 
                    System.out.println("Invalid Input");
                    System.exit(0);
                    System.out.println("=================================================================================================================================================");
       }else Fmenu();
      }else Fmenu();
    }
    
    //FIRST YEAR SUMMER
    public void summer(){
            Farray();
            //Enter Grades
            System.out.println("=================================================================================================================================================");
        System.out.print("\nEnter Your Grades for this Subjects :\n");
        double nursing = 0;
        double bio = 0;
        double chem = 0;
        for(int y =1;y<=1;y++){
        System.out.print("Fundamentals of Nursing Practice :");
        nursing = input.nextDouble();
            if(nursing >=1.0 && nursing<=5.0){System.out.print("");}
            else {System.out.println("Invalid Input");y-=1;}
        }
        for(int y = 1;y<=1;y++){
        System.out.print("Human Anatomy & Physiology :");
         bio = input.nextDouble();
            if(bio >=1.0 && bio <= 5.0){System.out.print("");}
            else {System.out.println("Invalid Input");y-=1;}
        }
        for(int y = 1;y<=1;y++){
        System.out.print("General Chemistry(Organic & Inorganic) :");
        chem = input.nextDouble();
            if(chem >=1.0 && chem<= 5.0){System.out.print("");}
            else {System.out.println("Invalid Input");y-=1;}
        }
        System.out.println("\n");
        System.out.println("=================================================================================================================================================");
        System.out.print("|OFFER CODE| |SUBJCODE| |GRADE| |FROM||               DESCRIPTION                             ||Lec| |Lab| |SL| |CL| |Credit units| |Pre/Co-Requisites\n");
        System.out.print(" FIRSY YEAR,SUMMER\n");
        if(nursing >=1.0 && nursing <=3.5 && bio >=1.0 && bio <=3.5){System.out.println(summer[1265]);total+=3;}
        if(chem >=1.0 && chem <=3.5){System.out.println(summer[1010]);total+=5;}
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    "+total+"\n");
        System.out.println("=================================================================================================================================================");
        System.out.print("Enter your Grades (Y/y || N/n):");
        String answer = input.next();
        
        if("Y".equals(answer) || "y".equals(answer)){
            if(nursing >=1.0 && nursing <=3.5 && bio >=1.0 && bio <=3.5){
                System.out.print(summer[1265]+" :");
                grade1 = input.nextDouble();}
            
            if(chem >=1.0 && chem <=3.5){
                System.out.print(summer[1010]+" :");
                grade2 = input.nextDouble();}
            System.out.println("=================================================================================================================================================");
            System.out.print("\nSee The Result (Y/y || N/n) :");
            String ans = input.next();
            if("Y".equals(ans) || "y".equals(ans)){
              if(grade1 >=1.0 && grade1 <=3.5){
                System.out.println(summer[1265]+" : Passed");
            }
              else
                    System.out.println(summer[1265]+" : Failed");
            
            if(grade2 >=1.0 && grade2 <=3.5){
                System.out.println(summer[1010]+" :Passed");
            }
            else 
                System.out.println(summer[1010]+" : Failed");
            } else Fmenu();
        }else Fmenu();
        System.out.println("=================================================================================================================================================");
                System.out.print("\nProceed to Main Menu (Y/y || N/n) :");
                String answers = input.next();
                if("Y".equals(answers) || "y".equals(answers))
                {
                   menu.menu();
                }
                else if("N".equals(answers) || "n".equals(answers))
                {
                    Fmenu();
                }
                else 
                    System.exit(0);
        System.out.println("=================================================================================================================================================");
    } 
}