include \masm32\include\masm32rt.inc

.data
;------------------------------------------------------- Head Part -------------------------------------------------------------------
header  db 10,10,10,10,9,9,"              ST. JOHN PAUL II COLLEGE OF DAVAO                                  ",13,10,0
header2 db "_______________________________________________________________________________________________________",13,10,0
header3 db "Ecoland Drive, Matina, Davao City, 8000 Philippines - TEL nos. 297-8755, 297-2033, 299-3375(Telefax)",13,10,0
header4 db "  ",13,10,0
header5 db "                             A Five-Year Course Leading To The Degree",13,10,0
header6 db "                          Bachelor of Science in Electronics Engineering(BSECE)",13,10,0
header7 db "                              Government Recognition No. 006-S2005",13,10,0
header8 db "                Revised Curriculum Effective 2013-2014, CMO No.53 Series of 2006",13,10,0
;------------------------------------------------------- Head Part End-------------------------------------------------------------------

;------------------------------------------------------- Display Area -------------------------------------------------------------------
names  db 10,"Name : ",0
down dd 10,10," ",13,10,0
down2 dd 10,10,10,10,10,10,10," ",0
menu   db 10,"        Main Menu         ",13,10,0
first  db 10,"|(F/f).First Year Student |",13,10,0
second db 10,"|(S/s).Second Year Student|",13,10,0				;------------ Year Level Area
third  db 10,"|(T/t).Third Year Student |",13,10,0
fourth db 10,"|(U/u).Fourth Year Student|",13,10,0
fifth  db 10,"|(V/v).Fifth Year Student|",13,10,0
choice db 10,"| What Year Level are you : ",0

firststudent  db 10,10,"|   First Year Student   |",13,10,0
secondstudent db 10,"|   Second Year Student   |",13,10,0
thirdstudent  db 10,"|   Third Year Student   |",13,10,0		;------------- Year level of student
fouthstudent  db 10,"|   Fouth Year Student   |",13,10,0
fifthstudent  db 10,"|   Fifth Year Student   |",13,10,0

sem1   db 10,"(A/a)First Semester",13,10,0
sem2   db 10,"(B/b)Second Semester",13,10,0
sem3   db 10,"(C/c)Summer",13,10,0								;-------------- Semester Selection
sem4   db 10,"(C/c)Main Menu",13,10,0	
main   db 10,"(D/d)Main Menu",13,10,0
yearlevel db 10,"Enter your choice :",0

;sem4  db 10,"First Semester",13,10,0

ensub1  db 10,10,"ENTER OFFERCODE1 : ",0
ensub2  db 10,10,"ENTER OFFERCODE2 : ",0
ensub3  db 10,10,"ENTER OFFERCODE3 : ",0
ensub4  db 10,10,"ENTER OFFERCODE4 : ",0
ensub5  db 10,10,"ENTER OFFERCODE5 : ",0							;-------------- Offercode area
ensub6  db 10,10,"ENTER OFFERCODE6 : ",0
ensub7  db 10,10,"ENTER OFFERCODE7 : ",0
ensub8  db 10,10,"ENTER OFFERCODE8 : ",0
ensub9  db 10,10,"ENTER OFFERCODE9 : ",0
ensub10 db 10,10,"ENTER OFFERCODE10 : ",0

available1 db 10,10,10,"SUBJECTS AVAILABLE FOR THIS SEMESTER",13,10,0
subj2 db  10,10,10,"Subjects That Enrolled in this Semester",13,10,0
subj db 10,10,10,"Enter Offercode Subjects You Want to Enroll: ",13,10,0
display1 db 10,10,"Add More Subject (Y/N) : ",0


proceed1 db 10,10,"Want to Proceed to Second SEMESTER (Y/N): ",0
proceed2 db 10,10,"Want to Proceed to Summer (Y/N): ",0
proceed3 db 10,10,"Want to Proceed to Main Menu (Y/N): ",0

Requisites db 10,10,"PRE-Requisites SUBJECTS FOR THIS SEMESTER (75 - 100)",13,10,0
output db 10,10,10,"Please Input Grades ",13,10,0
list1 db 10,"Students",13,10,0 
user1 db 10,"Neil Bryan Lagrimas",13,10,0
user2 db 10,"Charles Karlo Leguarda",13,10,0
user3 db 10,"Ricky Lanchinebre",13,10,0
user4 db 10,"Ransom Cailing",13,10,0
user5 db 10,"Jericho Cachuala",13,10,0

;------------------------------------------------------- Display Area End ---------------------------------------------------------------


;------------------------------------------------------* Subject for FirstYear *----------------------------------------------------------

										;-------------- First Semester -----------------
			heads db 10,10,10,			"_______________________________________________________________________",13,10,0
			head1 db "FIRST YEAR FIRST SEMESTER",13,10,0
			head2 db 10,"OFFERCODE | SUBCODE     |  DESCRIPTION                            |UNITS |PRE-Requisites",13,10,0
			sub1  db 10,"1173    | MATH1 ______|  College Algebra                         3     NONE",13,10,0
			sub2  db 10,"1137    | MATH12______|  Plane & Spherical Trigonometry          3     NONE",13,10,0
			sub3  db 10,"1111    | DRAW11______|  Engineering Drawing 1                   2     NONE",13,10,0
			sub4  db 10,"1109    | CS100 ______|  Computer Fundamentals                   4     NONE",13,10,0
			sub5  db 10,"2244    | EPP   ______|  English Proficiency Program             3     NONE",13,10,0
			sub6  db 10,"1227    | PHILO1______|  Philosophy of Man                       3     NONE",13,10,0
			sub7  db 10,"1103    | SOCSC1______|  General Psychology                      3     NONE",13,10,0
			sub8  db 10,"1202    | PE1   ______|  Self-Testing Activities and Gymnastics  2     NONE",13,10,0
			sub9  db 10,"1048    | NSTP1-CWTS__|  Civic Welfare Training Services 1       3     NONE",13,10,0
			sub10 db 10,"2171    | NSTP1-LTS___|  Literacy Training Services 1            ",13,10,0
			unit1s db 10,"                                                                 26",13,10,0
			space1 db 10,"                                                                     ",0
										;-------------- First Semester End -------------
										
										;-------------- Second Semester ----------------
			head3 db "FIRST YEAR SECOND SEMESTER",13,10,0
			head4 db 10,"OFFERCODE | SUBCODE     |  DESCRIPTION                            |UNITS |PRE-Requisites",13,10,0
			sub11 db 10,"2094  | MATH11A     |  Advanced Algebra                            3  MATH1",13,10,0
			sub12 db 10,"2268  | MATH13A     |  Plane & Solid Geometry                      4  MATH12",13,10,0
			sub13 db 10,"1432  | DRAW12      |  Engineering Drawing 2                       2  DRAW11",13,10,0
			sub14 db 10,"1433  | EE11        |  Basic Electrical/Electronics Shop Practise  3  NONE",13,10,0
			sub15 db 10,"2028  | CS12        |  Operating Systems                           4  CS100",13,10,0
			sub16 db 10,"2029  | CS13        |  Multimedia Systems                          1  CS100",13,10,0
			sub17 db 10,"1083  | ENG1        |  Study & Thinking Skills in English          3  EPP",13,10,0
			sub18 db 10,"1066  | SOCSC2      |  Philippines History & Government            3  NONE",13,10,0
			sub19 db 10,"1050  | PE2         |  Rhythmic Activities & Aquatics              2  PE1",13,10,0
			sub20 db 10,"1242  | NSTP2-CWTS  |  Civic Welfare Training Services 2           3  NSTP1-CWTS",13,10,0
			sub21 db 10,"2172  | NSTP2-LTS   |  Literacy Training Services 2                   NSTP1-LTS",13,10,0
			
			pre   db 10,"MATH1  : ",0
			pre1  db 10,"MATH12 : ",0
			pre2  db 10,"DRAW11 : ",0
			pre3  db 10,"CS100  : ",0
			pre4  db 10,"EPP    : ",0
			pre5  db 10,"PE1    : ",0
			pre6  db 10,"NSTP1-CWTS && NSTP1-LTS : ",0
			
										;-------------- Second Semester End ------------
										
										;-------------- Summer -------------------------
			head5 db "FIRST YEAR SUMMER",13,10,0
			head6 db 10,"OFFERCODE | SUBCODE     |  DESCRIPTION                            |UNITS |PRE-Requisites",13,10,0
			sub22 db "A.1431  | MATH14      |  Plane & Solid Analytic Geometry             4  MATH13A & MATH12",13,10,0
			sub23 db "B.1288  | SOCSC5      |  Personality Development,social graces       3  NONE",13,10,0
			
			pre7  db 10,"MATH13A  : ",0
			pre8  db 10,"MATH12   : ",0
										;-------------- Summer End ---------------------

;------------------------------------------------------* Subject for FirstYear End *------------------------------------------------------

;------------------------------------------------------* Subject for SecondYear *---------------------------------------------------------
									
										;--------------* FIRST SEMESTER *--------------
			head7 db 	   				"SECOND YEAR FIRST SEMESTER",13,10,0
			head8 db 	10,				"OFFERCODE | SUBCODE     |  DESCRIPTION                            |UNITS |PRE-Requisites",13,10,0
			sub24 db 	10,				"1437      | MATH21 _____|  Differential Calculus                      4     MATH13A & MATH14",10,0
			sub25 db 	10,				"1439      | DRAW21 _____|  Advanced Engineering Drawing - CAD         3     DRAW11 && CS100",13,10,0
			sub26 db 	10,				"1441      | CHEM11 _____|  General Chemistry 1                        4     NONE",13,10,0
			sub27 db 	10,				"1133      | FIL1   _____|  Komunikasyon sa Akademikong Pilipino       3     NONE",13,10,0
			sub28 db 	10,				"2015      | PE3    _____|  Individual & Dual Sports                   2     PE1",13,10,0
			sub29 db 	10,				"1025      | ENG2   _____|  Writing in the Discipline                  3     ENG1",13,10,0
			sub30 db 	10,				"1135      | REED1  _____|  The Preambles of Faith                     3     NONE",13,10,0
			sub31 db 	10,				"1062      | RIZAL  _____|  Life & Works of Dr.Jose Rizal              3     NONE",13,10,0
			s	  db    10,		        "                                                                     25",13,10,0
			
			pre9  db 10,"MATH13A : ",0
			pre10 db 10,"MATH14  : ",0
			pre11 db 10,"DRAW11  : ",0
			pre12 db 10,"CS100   : ",0
			pre13 db 10,"PE1     : ",0
			pre14 db 10,"ENG1    : ",0
												;--------------* SECOND SEMESTER *--------------
			head9  db 	   				"SECOND YEAR SECOND SEMESTER",13,10,0
			head10 db 	10,				"OFFERCODE | SUBCODE     |  DESCRIPTION                            |UNITS |PRE-Requisites",13,10,0
			sub32  db 	10,				"1438      | MATH22 _____|  Integral Calculus                          4     MATH210",10,0
			sub33  db 	10,				"1975      | SOCSC3 _____|  Society and Culture w/ Family Planning     3     NONE",13,10,0
			sub34  db 	10,				"1570      | FIL2   _____|  Pagbasa at Pagsulat Tungo sa Pananaliksik  3     FIL1",13,10,0
			sub35  db 	10,				"1051      | PE4    _____|  Team Sports                                2     PE3",13,10,0
			sub36  db 	10,				"1442      | ENG3   _____|  Speech and Oral Communication              3     ENG1",13,10,0
			sub37  db 	10,				"1256      | REED2  _____|  The Life & works Of Pope John Paul II      3     NONE",13,10,0
			sub38  db 	10,				"1041      | MATH212_____|  Applied Discrete Mathematics               3     MATH11A",13,10,0
			sub39  db 	10,				"1449      | PHYS1  _____|  College Physics1                           4     MATH11A & MATH12",13,10,0
			
			pre15 db 10,"MATH210 : ",0
			pre16 db 10,"FIL1    : ",0
			pre17 db 10,"PE3     : ",0
			pre18 db 10,"ENG1    : ",0
			pre19 db 10,"MATH11A : ",0
			pre20 db 10,"MATH12  : ",0
												;--------------* SUMMER *-----------------------
			head11 db 	   				"SECOND YEAR SUMMER",13,10,0
			head12 db 	10,				"OFFERCODE | SUBCODE     |  DESCRIPTION                            |UNITS |PRE-Requisites",13,10,0
			sub40  db 	10,				"1454      | PHY32  _____|  College Physics 2 :Heat,Electricity         4     PHYS1",10,0
			sub41  db 	10,				"1456      | ES31   _____|  Environmental Science                       3     CHEM11",13,10,0
			sub42  db 	10,				"1474      | POLSCI _____|  Politics and Governance with PHConstitution 3     NONE",13,10,0
			
			pre21 db 10,"PHYS1  : ",0
			pre22 db 10,"CHEM11 : ",0

;------------------------------------------------------* Subject for SecondYear End *-----------------------------------------------------
;------------------------------------------------------* Subject for ThirdYear *----------------------------------------------------------
				
												;----------------* First Semester *-----------------------
			head13 db 	   				"THIRD YEAR FIRST SEMESTER",13,10,0
			head14 db 	10,				"OFFERCODE | SUBCODE     |  DESCRIPTION                            |UNITS |PRE-Requisites",13,10,0
			sub43  db 	10,				"2127      | EE50   _____|  Circuit Analysis 1                        4     PHYS2,MATH22, && MATH23",13,10,0
			sub44  db 	10,				"2123      | MECH31A ____|  Statics of Rigid Bodies                   3     PHYS1 && MATH22",13,10,0
			sub45  db 	10,				"1452      | MECH32  ____|  Thermodynamics                            3     PHYS1 && MATH22",13,10,0
			sub46  db 	10,				"1444      | MATH23  ____|  Differential Equations                    3     MATH22",13,10,0
			sub47  db 	10,				"1026      | ENG4    ____|  Technical Writing                         3     ENG2",13,10,0
			sub48  db 	10,				"2128      | ECE310  ____|  Electronics 1: Electronic Devices         4     PHYS2 && MATH22",13,10,0
			sub49  db 	10,				"2129      | MATH60  ____|  Vector Analysis                           3     MATH22",13,10,0
			sub50  db 	10,				"1063      | SOCSC4  ____|  Intro to Economics w/ Taxation            3     NONE",13,10,0
			sub51  db 	10,				"2118      | CISCO1  ____|  Data Communication and Networking         3     CS100",13,10,0
			
			pre23  db 10,"PHYS2  : ",0
			pre24  db 10,"MATH22 : ",0
			pre25  db 10,"MATH23 : ",0
			pre26  db 10,"PHYS1  : ",0
			pre27  db 10,"ENG2   : ",0
			pre28  db 10,"CS100  : ",0
											;----------------* First Semester End *-----------------------
											;----------------* Second Semester *-----------------------
		    head15 db 	   				"THIRD YEAR SECOND SEMESTER",13,10,0
			head16 db 	10,				"OFFERCODE | SUBCODE     |  DESCRIPTION                            |UNITS |PRE-Requisites",13,10,0
			sub52  db 	10,				"1450      | MATH31 _____|  Advanced Engineering Mathematics        3      MATH23 ",13,10,0
			sub53  db 	10,				"1465      | MATH32  ____|  Numerical Methods                       3      MATH22 & CS11 ",13,10,0
			sub54  db 	10,				"2124      | MECH31B ____|  Dynamic of Rigid Bodies                 3      MECH31A ",13,10,0
			sub55  db 	10,				"2130      | EE51    ____|  Circuit Analysis 2                      4      EE50 ",13,10,0
			sub56  db 	10,				"2027      | CS11    ____|  Computer Programming 1                  3      CS100 ",13,10,0
			sub57  db 	10,				"2131      | ECE320  ____|  Electronics 2: Electronic Circuit       4      ECE310 ",13,10,0
			sub58  db 	10,				"2132      | EE60    ____|  Electromagnetics                        3      MATH60,PHYS2,MATH22",13,10,0
			sub59  db 	10,				"1044      | MGT4A   ____|  Human Behavior in Organization          3      NONE",13,10,0
			
			pre29  db 10,"MATH23   : ",0
			pre30  db 10,"MATH22   : ",0
			pre31  db 10,"CS11     : ",0
			pre32  db 10,"MECH31A  : ",0
			pre33  db 10,"EE50     : ",0
			pre34  db 10,"CS100    : ",0
			pre35  db 10,"ECE310   : ",0
			pre36  db 10,"MATH60   :", 0
			pre37  db 10 ,"PHSY2   :", 0 
											;----------------* Second Semester End *-----------------------
											;----------------* Summer *-----------------------
											
		    head17 db 	   				"THIRD YEAR Summer",13,10,0
			head18 db 	10,				"OFFERCODE | SUBCODE     |  DESCRIPTION                            |UNITS |PRE-Requisites",13,10,0
			sub60  db 	10,				"2133      | ECE300  ____|  ECE Practicum 1                           3    THIRD YEAR STANDING ",13,10,0
			sub61  db 	10,				"2134      | ECE410  ____|  Communications Theory 1:                  4    ECE320,MATH31,EE51",13,10,0
			
			pre38  db 10,"THIRD YEAR STANDING   : ",0
			pre39  db 10,"ECE320                : ",0		
			pre40  db 10,"MATH31                : ",0
			pre41  db 10,"EE51                  : ",0		
											
			
											;----------------* Summer End *-----------------------
											
;------------------------------------------------------* Subject for ThirdYear End *------------------------------------------------------


;------------------------------------------------------* Subject for FourthYear *----------------------------------------------------------	
		
;------------------------------------------------------* First Semester *----------------------------------------------------------								
			head19 db 	   				"FOURTH YEAR FIRST SEMESTER",13,10,0
			head20 db 	10,				"OFFERCODE | SUBCODE     |  DESCRIPTION                            |UNITS |PRE-Requisites",13,10,0
			sub62  db 	10,				"1982      | STAT1   ____|  Probability & Statistics                  3    MATH11A ",13,10,0
			sub63  db 	10,				"1110      | CS422   ____|  Operation Research                        3    MATH14",13,10,0
			sub64  db 	10,				"2125      | MECH36  ____|  Mechanics of Deformable Bodies            3    MECH31A",13,10,0
			sub65  db 	10,				"2139      | ECE420  ____|  Communication Theory 2:                   4    ECE410",13,10,0
			sub66  db 	10,				"2135      | CpE401  ____|  Logic Circuits & Switching Theory         4    EE50,ECE310  ",13,10,0
			sub67  db 	10,				"2136      | ECE313  ____|  Signals Spectra & Signal Processing       4    MATH31,STAT1",13,10,0	
			sub68  db 	10,				"2137      | ECE551  ____|  Introduction to Robotics                  4    CpE401,CS11",13,10,0		

			pre42  db 10,"MATH11A  : ",0
			pre43  db 10,"MATH14   : ",0		
			pre44  db 10,"MECH31A  : ",0
			pre45  db 10,"ECE410   : ",0	
            pre46  db 10,"EE50     : ",0
			pre47  db 10,"ECE310   : ",0
			pre48  db 10,"MATH31   : ",0
			pre49  db 10,"ECE410   : ",0	
			pre50  db 10,"CpE410   : ",0	
			pre51  db 10,"CS11     : ",0			
			;------------------------------------------------------* First Semester End *----------------------------------------------------------	
			;------------------------------------------------------* Second Semester *----------------------------------------------------------
			head21 db 	   				"FOURTH YEAR SECOND SEMESTER",13,10,0
			head22 db 	10,				"OFFERCODE | SUBCODE     |  DESCRIPTION                            |UNITS |PRE-Requisites",13,10,0
			sub69  db 	10,				"1498      | ES32    ____|  Engineering Management                    3    4th YEAR STANDING ",13,10,0
			sub70  db 	10,				"1469      | ES41    ____|  Engineering Economy & Accounting          3    MATH11A",13,10,0
			sub71  db 	10,				"2138      | EE70    ____|  Energy Conversion                         4    EE60,EE51",13,10,0
			sub72  db 	10,				"1526      | ES42    ____|  Engineering Material                      3    CHEM11,PHYS2",13,10,0
			sub73  db 	10,				"2144      | ECE510  ____|  Comm. Theory 3: Transmission Media        4    ECE420,EE60  ",13,10,0
			sub74  db 	10,				"2140      | CpE420  ____|  Advanced Logic Circuit Design             4    CpE401",13,10,0	
			sub75  db 	10,				"2141      | ECE552  ____|  Introduction to Power Electronics         4    ECE310,EE60",13,10,0		
			
			pre52  db 10,"4th YEAR STANDING    : ",0
			pre53  db 10,"MATH11A              : ",0		
			pre54  db 10,"EE60                 : ",0
			pre55  db 10,"EE51                 : ",0	
            pre56  db 10,"CHEM11               : ",0
			pre57  db 10,"PHYS2                : ",0
			pre58  db 10,"ECE420               : ",0
			pre59  db 10,"CpE401               : ",0	
			pre70  db 10,"ECE310               : ",0	
     	;------------------------------------------------------* Second Semester End*----------------------------------------------------------
		;------------------------------------------------------* Summer *----------------------------------------------------------
		    head23 db 	   				"FOURTH YEAR SUMMER",13,10,0
			head24 db 	10,				"OFFERCODE | SUBCODE     |  DESCRIPTION                            |UNITS |PRE-Requisites",13,10,0
			sub76  db 	10,				"2142      | ECE400  ____|  ECE Practicum 2                           3    4th YEAR STANDING ",13,10,0
			
			pre71  db 10,"4th YEAR STANDING    : ",0	
			;------------------------------------------------------* Summer End *----------------------------------------------------------
			;------------------------------------------------------* Subject for FifthYear*----------------------------------------------------------
			;------------------------------------------------------* First Semester * -----------------------------------------------------
			head25 db 	   				"FIFTH YEAR FIRST SEMESTER",13,10,0
			head26 db 	10,				"OFFERCODE | SUBCODE     |  DESCRIPTION                            |UNITS |PRE-Requisites",13,10,0
			sub77  db 	10,				"2143      | CpE410  ____|  Feedback & Control System                 4     MATH31,EE51,ECE320 ",13,10,0
			sub78  db 	10,				"2145      | CpE450  ____|  Microprocessor Systems                    4     CpE402,CS11,ECE310",13,10,0
			sub79  db 	10,				"2146      | ECE330  ____|  Industrial Electronics                    4     ECE320",13,10,0
			sub80  db 	10,				"1532      | ECE550  ____|  ECE Laws, Contracts & Specifications      3     5TH YEAR STANDING",13,10,0
			sub81  db 	10,				"2147      | ECE500  ____|  Field Trips & Seminars                    1     5TH YEAR STANDING",13,10,0
			sub82  db 	10,				"2148      | ECE553  ____|  Wireless Communication                    4     ECE510",13,10,0	
			
			pre72  db 10,"MATH31             : ",0             
			pre73  db 10,"EE51               : ",0
			pre74  db 10,"ECE320             : ",0
			pre75  db 10,"CpE402             : ",0
			pre76  db 10,"CS11               : ",0
			pre77  db 10,"ECE310             : ",0
			;pre78  db 10,"ECE320             : ",0
			pre79  db 10,"5TH YEAR STANDING  : ",0
			;pre80  db 10,"5TH YEAR STANDING  : ",0
			pre81  db 10,"ECE510             : ",0
			;----------------------------------------------------* First Semester End *-------------------------------------------------------
			;----------------------------------------------------* Subject for FifthYear *----------------------------------------------------
			;----------------------------------------------------* Second Semester *-------------------------------------------------------
			head27 db 	   				"FIFTH YEAR SECOND SEMESTER",13,10,0
			head28 db 	10,				"OFFERCODE | SUBCODE      |  DESCRIPTION                             |UNITS |PRE-Requisites",13,10,0
			sub83  db 	10,				"1481      | ES51     ____| Safety Engineering                          2    5th YEAR STANDING ",13,10,0
			sub84  db 	10,				"2126      | PHYS3    ____| College Physics 3: Sources of Energy        3    PHYS2",13,10,0
			sub85  db 	10,				"2149      | ECE520   ____| Data Communications                         4    ECE420",13,10,0
			sub86  db 	10,				"2150      | ECE501   ____| ECE Design Project                          4    CpE450",13,10,0
			sub87  db 	10,				"2151      | EE100    ____| Instrumentation & Control                   3    CpE410  ",13,10,0
			sub88  db 	10,				"2152      | ECE554   ____| Communication Systems Design                4    ECE553",13,10,0	
			sub89  db 	10,				"2174      | MATH1000 ____| Mathematics Review Course                   3    6TH YEAR STANDING",13,10,0		
			
			pre82  db 10,"5TH YEAR STANDING    : ",0             
			pre83  db 10,"PHYS2                : ",0
			pre84  db 10,"ECE420               : ",0
			pre85  db 10,"CpE450               : ",0
			pre86  db 10,"CpE410               : ",0
			pre87  db 10,"ECE553               : ",0
			pre88  db 10,"6TH YEAR STANDNING   : ",0
            ;--------------------------------------------------* Second Semester End *------------------------------------------------------
			;--------------------------------------------------* Fifth Year End *-----------------------------------------------------------
			
											
											
											

.data?
		name1 db 50 dup(?)			
		choice2 db 50 dup(?)
										;--------------First Input Area ---------------------------
										
						yearlevel1 db 50 dup(?)
						
				a1 dd 50 dup(?)			; ------------- First Semester Input Area -----------------------
				a2 dd 50 dup(?)			
				a3 dd 50 dup(?)		
				a4 dd 50 dup(?)
				a5 dd 50 dup(?)
				a6 dd 50 dup(?)
				a7 dd 50 dup(?)
				a8 dd 50 dup(?)
				a9 dd 50 dup(?)
				
				b1 dd 50 dup(?)
				b2 dd 50 dup(?)
				b3 dd 50 dup(?)
				b4 dd 50 dup(?)
				b5 dd 50 dup(?)
				b6 dd 50 dup(?)
				b7 dd 50 dup(?)
				b8 dd 50 dup(?)
				b9 dd 50 dup(?)
				
				dis1 db 50 dup(?)
				dis2 db 50 dup(?)
				dis3 db 50 dup(?)
				dis4 db 50 dup(?)
				dis5 db 50 dup(?)
				dis6 db 50 dup(?)
				dis7 db 50 dup(?)
				dis8 db 50 dup(?)
				dis9 db 50 dup(?)
				
				default1 dd 50 dup(?)
				unit1  dd 50 dup(?)
				unit2  dd 50 dup(?)
				unit3  dd 50 dup(?)
				unit4  dd 50 dup(?)
				unit5  dd 50 dup(?)
				unit6  dd 50 dup(?)
				unit7  dd 50 dup(?)
				unit8  dd 50 dup(?)
				unit9  dd 50 dup(?)
				total1 dd 50 dup(?)
				
				ceed1 db 50 dup(?)			; ------------- First Semester Input Area End -----------------------
				
				spre  dd 50 dup(?)          ; ------------- Second Semester Input ------------------------------
				spre1 dd 50 dup(?)
				spre2 dd 50 dup(?)
				spre3 dd 50 dup(?)
				spre4 dd 50 dup(?)
				spre5 dd 50 dup(?)
				spre6 dd 50 dup(?)
				spre7 dd 50 dup(?)
				spre8 dd 50 dup(?)
				spre9 dd 50 dup(?)
				
				default2 dd 50 dup(?)
				unit11  dd 50 dup(?)
				unit12  dd 50 dup(?)
				unit13  dd 50 dup(?)
				unit14  dd 50 dup(?)
				unit15  dd 50 dup(?)
				unit16  dd 50 dup(?)
				unit17  dd 50 dup(?)
				unit18  dd 50 dup(?)
				unit19  dd 50 dup(?)
				unit20  dd 50 dup(?)
				total2 dd 50  dup(?)
				
				c1  dd 50 dup(?)
				c2  dd 50 dup(?)
				c3  dd 50 dup(?)
				c4  dd 50 dup(?)
				c5  dd 50 dup(?)
				c6  dd 50 dup(?)
				c7  dd 50 dup(?)
				c8  dd 50 dup(?)
				c9  dd 50 dup(?)
				c10 dd 50 dup(?)
				
				d1  dd 50 dup(?)
				d2  dd 50 dup(?)
				d3  dd 50 dup(?)
				d4  dd 50 dup(?)
				d5  dd 50 dup(?)
				d6  dd 50 dup(?)
				d7  dd 50 dup(?)
				d8  dd 50 dup(?)
				d9  dd 50 dup(?)
				d10 dd 50 dup(?)
				
				dis10 db 50 dup(?)
				dis11 db 50 dup(?)
				dis12 db 50 dup(?)
				dis13 db 50 dup(?)
				dis14 db 50 dup(?)
				dis15 db 50 dup(?)
				dis16 db 50 dup(?)
				dis17 db 50 dup(?)
				dis18 db 50 dup(?)
				dis19 db 50 dup(?)
				
			  default3 dd 50 dup(?)
				unit21 dd 50 dup(?)
				unit22 dd 50 dup(?)
				unit23 dd 50 dup(?)
				unit24 dd 50 dup(?)
				unit25 dd 50 dup(?)
				unit26 dd 50 dup(?)
				unit27 dd 50 dup(?)
				unit28 dd 50 dup(?)
				unit29 dd 50 dup(?)
				unit30 dd 50 dup(?)
				unit31 dd 50 dup(?)
				total3 dd 50 dup(?)
				
				ceed2 db 50 dup(?) 		; ------------- Second Semester Input End ------------------------------
				
				spre10 dd 50 dup(?)		;--------------- Summer Input ---------------------------------	
				spre11 dd 50 dup(?)
			  default4 dd 50 dup(?)
			  default5 dd 50 dup(?)
			  
			  unit32 dd 50 dup(?)
			  unit33 dd 50 dup(?)
			  total4 dd 50 dup(?)
			  
			  e1 dd 50 dup(?)
			  e2 dd 50 dup(?)
			  
			  f1 dd 50 dup(?)
			  f2 dd 50 dup(?)
			  
			  dis20 db 50 dup(?)
			  dis21 db 50 dup(?)
			  unit34 dd 50 dup(?)
			  unit35 dd 50 dup(?)
			  total5 dd 50 dup(?)
			  
			  ceed3 db 50 dup(?)
										;--------------First Input Area End ----------------------- FirstYear Input End ---------
										
										
;-----------------------------------------------------------------* SecondYear Input *--------------------------------------------------------------------------
										
										; ------------------------ First semester input --------------
			yearlevel2 db 50 dup(?)
			spre12 dd 50 dup(?)
			spre13 dd 50 dup(?)
			spre14 dd 50 dup(?)
			spre15 dd 50 dup(?)
			spre16 dd 50 dup(?)
			spre17 dd 50 dup(?)
			
			 default6 dd 50 dup(?)
			 unit36 dd 50 dup(?)
			 unit37 dd 50 dup(?)
			 unit38 dd 50 dup(?)
			 unit39 dd 50 dup(?)
			 unit40 dd 50 dup(?)
			 unit41 dd 50 dup(?)
			 unit42 dd 50 dup(?)
			 unit43 dd 50 dup(?)
			 total6 dd 50 dup(?)
			 
			g1  dd 50 dup(?)
			g2  dd 50 dup(?)
			g3  dd 50 dup(?)
			g4  dd 50 dup(?)
			g5  dd 50 dup(?)
			g6  dd 50 dup(?)
			g7  dd 50 dup(?)
			g8  dd 50 dup(?)
			
			h1  dd 50 dup(?)
			h2  dd 50 dup(?)
			h3  dd 50 dup(?)
			h4  dd 50 dup(?)
			h5  dd 50 dup(?)
			h6  dd 50 dup(?)
			h7  dd 50 dup(?)
			h8  dd 50 dup(?)
			
			dis22 db 50 dup(?)
			dis23 db 50 dup(?)
			dis24 db 50 dup(?)
			dis25 db 50 dup(?)
			dis26 db 50 dup(?)
			dis27 db 50 dup(?)
			dis28 db 50 dup(?)
			dis29 db 50 dup(?)
			
			default7 dd 50 dup(?)
			
			unit44 dd 50 dup(?)
			unit45 dd 50 dup(?)
			unit46 dd 50 dup(?)
			unit47 dd 50 dup(?)
			unit48 dd 50 dup(?)
			unit49 dd 50 dup(?)
			unit50 dd 50 dup(?)
			unit51 dd 50 dup(?)
			total7 dd 50 dup(?)
			
			ceed4 db 50 dup(?)				; ------------------------ First semester input End --------------
			
			spre18 dd 50 dup(?)				;------------------------- Second Semester input  ------------
			spre19 dd 50 dup(?)
			spre20 dd 50 dup(?)
			spre21 dd 50 dup(?)
			spre22 dd 50 dup(?)
			spre23 dd 50 dup(?)
			
			default8 dd 50 dup(?)
			unit52 dd 50 dup(?)
			unit53 dd 50 dup(?)
			unit54 dd 50 dup(?)
			unit55 dd 50 dup(?)
			unit56 dd 50 dup(?)
			unit57 dd 50 dup(?)
			unit58 dd 50 dup(?)
			unit59 dd 50 dup(?)
			total8 dd 50 dup(?)
			
			i1  dd 50 dup(?)
			i2  dd 50 dup(?)
			i3  dd 50 dup(?)
			i4  dd 50 dup(?)
			i5  dd 50 dup(?)
			i6  dd 50 dup(?)
			i7  dd 50 dup(?)
			i8  dd 50 dup(?)
			
			j1  dd 50 dup(?)
			j2  dd 50 dup(?)
			j3  dd 50 dup(?)
			j4  dd 50 dup(?)
			j5  dd 50 dup(?)
			j6  dd 50 dup(?)
			j7  dd 50 dup(?)
			j8  dd 50 dup(?)
			
			dis30 db 50 dup(?)
			dis31 db 50 dup(?)
			dis32 db 50 dup(?)
			dis33 db 50 dup(?)
			dis34 db 50 dup(?)
			dis35 db 50 dup(?)
			dis36 db 50 dup(?)
			dis37 db 50 dup(?)
			
			default9 dd 50 dup(?)
			unit60 dd 50 dup(?)
			unit61 dd 50 dup(?)
			unit62 dd 50 dup(?)
			unit63 dd 50 dup(?)
			unit64 dd 50 dup(?)
			unit65 dd 50 dup(?)
			unit66 dd 50 dup(?)
			unit67 dd 50 dup(?)
			total9 dd 50 dup(?)
			
			ceed5 db 50 dup(?)						;------------------------- Second Semester input  End ------------
			
													;------------------------- Summer input --------------------------
			spre24 dd 50 dup(?)
			spre25 dd 50 dup(?)
			
			  default10 dd 50 dup(?)
			  default11 dd 50 dup(?)
			  
			  unit68 dd 50 dup(?)
			  unit69 dd 50 dup(?)
			  unit70 dd 50 dup(?)
			  total10 dd 50 dup(?)
			  
			  k1 dd 50 dup(?)
			  k2 dd 50 dup(?)
			  k3 dd 50 dup(?)
			  
			  l1 dd 50 dup(?)
			  l2 dd 50 dup(?)
			  l3 dd 50 dup(?)
			  
			  dis38 db 50 dup(?)
			  dis39 db 50 dup(?)
			  dis40 db 50 dup(?)
			  unit71 dd 50 dup(?)
			  unit72 dd 50 dup(?)
			  unit73 dd 50 dup(?)
			  total11 dd 50 dup(?)
			  
			  ceed6 db 50 dup(?)					;---------------------------- SECOND YEAR INPUT END ----------------------------------
													
													;---------------------------- THIRD YEAR INPUT ------------------------------
													
				yearlevel3 db 50 dup(?)  			 ;---------------------------- First SEMESTER INPUT ------------------------------
				
				input1 dd 50 dup(?)
				input2 dd 50 dup(?)
				input3 dd 50 dup(?)
				input4 dd 50 dup(?)
				input5 dd 50 dup(?)
				input6 dd 50 dup(?)
				
				settings1 dd 50 dup(?)
				settings2 dd 50 dup(?)
				
				credits1 dd 50 dup(?)
				credits2 dd 50 dup(?)
				credits3 dd 50 dup(?)
				credits4 dd 50 dup(?)
				credits5 dd 50 dup(?)
				credits6 dd 50 dup(?)
				credits7 dd 50 dup(?)
				credits8 dd 50 dup(?)
				credits9 dd 50 dup(?)
				compute1 dd 50 dup(?)
				
				m1 dd 50 dup(?)
				m2 dd 50 dup(?)
				m3 dd 50 dup(?)
				m4 dd 50 dup(?)
				m5 dd 50 dup(?)
				m6 dd 50 dup(?)
				m7 dd 50 dup(?)
				m8 dd 50 dup(?)
				m9 dd 50 dup(?)
				
				n1 db 50 dup(?)
				n2 db 50 dup(?)
				n3 db 50 dup(?)
				n4 db 50 dup(?)
				n5 db 50 dup(?)
				n6 db 50 dup(?)
				n7 db 50 dup(?)
				n8 db 50 dup(?)
				n9 db 50 dup(?)
				
				compute2 dd 50 dup(?)
				credits10 dd 50 dup(?)
				credits11 dd 50 dup(?)
				credits12 dd 50 dup(?)
				credits13 dd 50 dup(?)
				credits14 dd 50 dup(?)
				credits15 dd 50 dup(?)
				credits16 dd 50 dup(?)
				credits17 dd 50 dup(?)
				credits18 dd 50 dup(?)
				
				ceed7 db 50 dup(?)					;---------------------------- First SEMESTER INPUT End------------------------------
				
				input7 dd 50 dup(?)					;---------------------------- Second SEMESTER INPUT ------------------------------
				input8 dd 50 dup(?)
				input9 dd 50 dup(?)
				input10 dd 50 dup(?)
				input11 dd 50 dup(?)
				input12 dd 50 dup(?)
				input13 dd 50 dup(?)
				input14 dd 50 dup(?)
				input15 dd 50 dup(?)
				
				settings3 dd 50 dup(?)
				settings4 dd 50 dup(?)
				
				credits19 dd 50 dup(?)
				credits20 dd 50 dup(?)
				credits21 dd 50 dup(?)
				credits22 dd 50 dup(?)
				credits23 dd 50 dup(?)
				credits24 dd 50 dup(?)
				credits25 dd 50 dup(?)
				credits26 dd 50 dup(?)
				credits27 dd 50 dup(?)
				compute3 dd 50 dup(?)
				
				o1 dd 50 dup(?)
				o2 dd 50 dup(?)
				o3 dd 50 dup(?)
				o4 dd 50 dup(?)
				o5 dd 50 dup(?)
				o6 dd 50 dup(?)
				o7 dd 50 dup(?)
				o8 dd 50 dup(?)
				o9 dd 50 dup(?)
				
				p1 db 50 dup(?)
				p2 db 50 dup(?)
				p3 db 50 dup(?)
				p4 db 50 dup(?)
				p5 db 50 dup(?)
				p6 db 50 dup(?)
				p7 db 50 dup(?)
				p8 db 50 dup(?)
				p9 db 50 dup(?)
				
				compute4 dd 50 dup(?)
				credits28 dd 50 dup(?)
				credits29 dd 50 dup(?)
				credits30 dd 50 dup(?)
				credits31 dd 50 dup(?)
				credits32 dd 50 dup(?)
				credits33 dd 50 dup(?)
				credits34 dd 50 dup(?)
				credits35 dd 50 dup(?)
				credits36 dd 50 dup(?)
				
				ceed8 db 50 dup(?)					;---------------------------- Second SEMESTER INPUT End------------------------------
				
				input16 dd 50 dup(?)				;---------------------------- Summer INPUT ------------------------------
				input17 dd 50 dup(?)
				input18 dd 50 dup(?)
				input19 dd 50 dup(?)
				
				settings5 dd 50 dup(?)
				settings6 dd 50 dup(?)
				
				credits37 dd 50 dup(?)
				credits38 dd 50 dup(?)
				
				compute5 dd 50 dup(?)
				compute6 dd 50 dup(?)
				
				credits39 dd 50 dup(?)
				credits40 dd 50 dup(?)
				
				q1 dd 50 dup(?)
				q2 dd 50 dup(?)
				
				r1 db 50 dup(?)
				r2 db 50 dup(?)
				
				ceed9 db 50 dup(?)					;---------------------------- Summer INPUT End -----------------------------
				
				yearlevel4 db 50 dup(?)				;---------------------------- FOURTH YEAR  -----------------------------
				
				
				asus1 dd 50 dup(?)				;---------------------------- First SEMESTER  -----------------------------
				asus2 dd 50 dup(?)
				asus3 dd 50 dup(?)
				asus4 dd 50 dup(?)
				asus5 dd 50 dup(?)
				asus6 dd 50 dup(?)
				asus7 dd 50 dup(?)
				asus8 dd 50 dup(?)
				asus9 dd 50 dup(?)
				asus10 dd 50 dup(?)
				asus11 dd 50 dup(?)
				
				rog1 dd 50 dup(?)
				rog2 dd 50 dup(?)
				
				razer1 dd 50 dup(?)
				razer2 dd 50 dup(?)
				
				acer1  dd 50 dup(?)
				acer2  dd 50 dup(?)
				acer3  dd 50 dup(?)
				acer4  dd 50 dup(?)
				acer5  dd 50 dup(?)
				acer6  dd 50 dup(?)
				acer7  dd 50 dup(?)
				
				s1  dd 50 dup(?)
				s2  dd 50 dup(?)
				s3  dd 50 dup(?)
				s4  dd 50 dup(?)
				s5  dd 50 dup(?)
				s6  dd 50 dup(?)
				s7	dd 50 dup(?)
				
				t1  db 50 dup(?)
				t2  db 50 dup(?)
				t3  db 50 dup(?)
				t4  db 50 dup(?)
				t5  db 50 dup(?)
				t6  db 50 dup(?)
				t7  db 50 dup(?)
				
				dell1 dd 50 dup(?)
				dell2 dd 50 dup(?)
				dell3 dd 50 dup(?)
				dell4 dd 50 dup(?)
				dell5 dd 50 dup(?)
				dell6 dd 50 dup(?)
				dell7 dd 50 dup(?)
				
				ceed10 db 50 dup(?)				;---------------------------- First SEMESTER  END-----------------------------
				
				flag1 dd 50 dup(?)				;---------------------------- Second SEMESTER --------------------------------
				flag2 dd 50 dup(?)
				flag3 dd 50 dup(?)
				flag4 dd 50 dup(?)
				flag5 dd 50 dup(?)
				flag6 dd 50 dup(?)
				flag7 dd 50 dup(?)
				flag8 dd 50 dup(?)
				flag9 dd 50 dup(?)
				
				black1 dd 50 dup(?)
				black2 dd 50 dup(?)
				black3 dd 50 dup(?)
				black4 dd 50 dup(?)
				
				rogue1 dd 50 dup(?)
				rogue2 dd 50 dup(?)
				rogue3 dd 50 dup(?)
				rogue4 dd 50 dup(?)
				rogue5 dd 50 dup(?)
				rogue6 dd 50 dup(?)
				rogue7 dd 50 dup(?)
				
				u1  dd 50 dup(?)
				u2  dd 50 dup(?)
				u3  dd 50 dup(?)
				u4  dd 50 dup(?)
				u5  dd 50 dup(?)
				u6  dd 50 dup(?)
				u7  dd 50 dup(?)
				
				v1  db 50 dup(?)
				v2  db 50 dup(?)
				v3  db 50 dup(?)
				v4  db 50 dup(?)
				v5  db 50 dup(?)
				v6  db 50 dup(?)
				v7  db 50 dup(?)
				
				unity1 dd 50 dup(?)
				unity2 dd 50 dup(?)
				unity3 dd 50 dup(?)
				unity4 dd 50 dup(?)
				unity5 dd 50 dup(?)
				unity6 dd 50 dup(?)
				unity7 dd 50 dup(?)
				
				ceed11  db 50 dup(?)				;---------------------------- Second SEMESTER End ------------------------------
				
				toshiba1  dd 50 dup(?)
				mouse1 dd 50 dup(?)
				mouse2 dd 5o dup(?)
				mouse3 dd 5o dup(?)
				mouse4 dd 5o dup(?)
				lenovo1 dd 50 dup(?)
				
				wx1 dd 50 dup(?)
				
				key1 dd 50 dup(?)
				
				ceed12 db 50 dup(?)				;--------------------------------FourthYear END -----------------------------
				
				yearlevel5 db 50 dup(?)
												
				star1 dd 50 dup(?)
				star2 dd 50 dup(?)
				star3 dd 50 dup(?)
				star4 dd 50 dup(?)
				star5 dd 50 dup(?)
				star6 dd 50 dup(?)
				star7 dd 50 dup(?)
				star8 dd 50 dup(?)
				star9 dd 50 dup(?)
				star10 dd 50 dup(?)
				
				galaxy1 dd 50 dup(?)
				galaxy2 dd 50 dup(?)
				galaxy3 dd 50 dup(?)
				galaxy4 dd 50 dup(?)
				
				moon1 dd 50 dup(?)
				moon2 dd 50 dup(?)
				moon3 dd 50 dup(?)
				moon4 dd 50 dup(?)
				moon5 dd 50 dup(?)
				moon6 dd 50 dup(?)
				
				w1 dd 50 dup(?)
				w2 dd 50 dup(?)
				w3 dd 50 dup(?)
				w4 dd 50 dup(?)
				w5 dd 50 dup(?)
				w6 dd 50 dup(?)
				
				x1 db 50 dup(?)
				x2 db 50 dup(?)
				x3 db 50 dup(?)
				x4 db 50 dup(?)
				x5 db 50 dup(?)
				x6 db 50 dup(?)
				
				comet1 dd 50 dup(?)
				comet2 dd 50 dup(?)
				comet3 dd 50 dup(?)
				comet4 dd 50 dup(?)
				comet5 dd 50 dup(?)
				comet6 dd 50 dup(?)
				
				ceed13 db 50 dup(?)
				
				naruto1 dd 50 dup(?)
				naruto2 dd 50 dup(?)
				naruto3 dd 50 dup(?)
				naruto4 dd 50 dup(?)
				naruto5 dd 50 dup(?)
				naruto6 dd 50 dup(?)
				naruto7 dd 50 dup(?)
				
				tobi1 dd 50 dup(?)
				tobi2 dd 50 dup(?)
				tobi3 dd 50 dup(?)
				tobi4 dd 50 dup(?)
				
				sasuke1 dd 50 dup(?)
				sasuke2 dd 50 dup(?)
				sasuke3 dd 50 dup(?)
				sasuke4 dd 50 dup(?)
				sasuke5 dd 50 dup(?)
				sasuke6 dd 50 dup(?)
				sasuke7 dd 50 dup(?)
				
				y1 dd 50 dup(?)
				y2 dd 50 dup(?)
				y3 dd 50 dup(?)
				y4 dd 50 dup(?)
				y5 dd 50 dup(?)
				y6 dd 50 dup(?)
				y7 dd 50 dup(?)
				
				z1 db 50 dup(?)
				z2 db 50 dup(?)
				z3 db 50 dup(?)
				z4 db 50 dup(?)
				z5 db 50 dup(?)
				z6 db 50 dup(?)
				z7 db 50 dup(?)
				
				sakura1 dd 50 dup(?)
				sakura2 dd 50 dup(?)
				sakura3 dd 50 dup(?)
				sakura4 dd 50 dup(?)
				sakura5 dd 50 dup(?)
				sakura6 dd 50 dup(?)
				sakura7 dd 50 dup(?)
				
				ceed14 db 50 dup(?)
.code


start:
			invoke ClearScreen
			invoke StdOut,addr header
			invoke StdOut,addr header2
			invoke StdOut,addr header3
			invoke StdOut,addr header4
			invoke StdOut,addr header5
			invoke StdOut,addr header6
			invoke StdOut,addr header7
			invoke StdOut,addr header8
			
			invoke StdOut,addr names
			invoke StdIn,addr name1,50
			invoke StdOut,addr down
			invoke StdOut,addr menu
			invoke StdOut,addr first
			invoke StdOut,addr second
			invoke StdOut,addr third
			invoke StdOut,addr fourth
			invoke StdOut,addr fifth
			invoke StdOut,addr choice
			invoke StdIn,addr choice2,50
			
			.if choice2 == 'F' || choice2 == 'f'
			jmp FirstYear
			.elseif choice2 == 'S' || choice2 == 's'
			jmp SecondYear
			.elseif choice2 == 'T' || choice2 == 't'
			jmp ThirdYear
			.elseif choice2 == 'U' || choice2 == 'u'
			jmp FourthYear
			.elseif choice2 == 'V' || choice2 == 'v'
			jmp FifthYear
			.else
			jmp start
			.endif
FirstYear:									; ------------------------------ First Year College -----------------------

		invoke ClearScreen
		invoke StdOut,addr header
		invoke StdOut,addr header2
		invoke StdOut,addr header3
		invoke StdOut,addr header4
		invoke StdOut,addr header5
		invoke StdOut,addr header6
		invoke StdOut,addr header7
		invoke StdOut,addr header8
		invoke StdOut,addr names
		invoke StdOut,addr name1
		invoke StdOut,addr down
		invoke StdOut,addr firststudent
		invoke StdOut,addr sem1
		invoke StdOut,addr sem2
		invoke StdOut,addr sem3
		invoke StdOut,addr main
		invoke StdOut,addr yearlevel
		invoke StdIn,addr yearlevel1,50
		
		.if yearlevel1 == 'A' || yearlevel1 == 'a'
	     invoke ClearScreen
		jmp FirstYearFirstSemester
		.elseif yearlevel1 == 'B' || yearlevel1 == 'b'
		jmp FirstYearSecondSemester
		.elseif yearlevel1 == 'C' || yearlevel1 == 'c'
		jmp FirstYearSummer
		.elseif yearlevel1 == 'D' || yearlevel1 == 'd'
		jmp start
		.else 
		jmp FirstYear
		.endif
		
		
FirstYearFirstSemester:						; ------------------------------ First Semester --------------------------
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr available1
				invoke StdOut,addr heads
				invoke StdOut,addr head1
				invoke StdOut,addr head2
				invoke StdOut,addr heads
				invoke StdOut,addr sub1
				invoke StdOut,addr sub2
				invoke StdOut,addr sub3
				invoke StdOut,addr sub4
				invoke StdOut,addr sub5
				invoke StdOut,addr sub6
				invoke StdOut,addr sub7
				invoke StdOut,addr sub8
				invoke StdOut,addr sub9
				invoke StdOut,addr sub10
				invoke StdOut,addr unit1s
				invoke StdOut,addr subj
				
		offer1: 							;--------------------------------First Input ------------------------
				invoke StdOut,addr ensub1
				invoke StdIn,addr a1,50
				mov[a1 + eax],0
				invoke StripLF,addr a1
				invoke atodw,addr a1
				mov b1,eax
				.if b1 == 1173 || b1 == 1137 || b1 == 1111 || b1 == 1109 || b1 == 2244 || b1 == 1227 || b1 == 1103 || b1 == 1202 || b1 == 1048 || b1 == 2171
				jmp ques1
				.else
				jmp offer1
				.endif
		ques1:
				invoke StdOut,addr display1
				invoke StdIn,addr dis1,50
				.if dis1 == 'Y' || dis1 == 'y'
				jmp offer2
				.elseif dis1 == 'N' || dis1 == 'n'
				jmp SubjectDisplay1
				.else
				jmp ques1
				.endif
		offer2: 							;--------------------------------Second Input ------------------------	
				invoke StdOut,addr ensub2
				invoke StdIn,addr a2,50
				mov[a2 + eax],0
				invoke StripLF,addr a2
				invoke atodw,addr a2
				mov b2,eax
				.if b2 == 1173 || b2 == 1137 || b2 == 1111 || b2 == 1109 || b2 == 2244 || b2 == 1227 || b2 == 1103 || b2 == 1202 || b2 == 1048 || b2 == 2171
				jmp ques2
				.else
				jmp offer2
				.endif
		ques2:
				invoke StdOut,addr display1
				invoke StdIn,addr dis2,50
				.if dis2 == 'Y' || dis2 == 'y'
				jmp offer3
				.elseif dis2 == 'N' || dis2 == 'n'
				jmp SubjectDisplay1
				.else
				jmp ques2
				.endif
				
		offer3: 							;--------------------------------Third Input ------------------------	
				invoke StdOut,addr ensub3
				invoke StdIn,addr a3,50
				mov[a3 + eax],0
				invoke StripLF,addr a3
				invoke atodw,addr a3
				mov b3,eax
				.if b3 == 1173 || b3 == 1137 || b3 == 1111 || b3 == 1109 || b3 == 2244 || b3 == 1227 || b3 == 1103 || b3 == 1202 || b3 == 1048 || b3 == 2171
				jmp ques3
				.else
				jmp offer3
				.endif
		ques3:
				invoke StdOut,addr display1
				invoke StdIn,addr dis3,50
				.if dis2 == 'Y' || dis3 == 'y'
				jmp offer4
				.elseif dis3 == 'N' || dis3 == 'n'
				jmp SubjectDisplay1
				.else
				jmp ques2
				.endif
				
		offer4: 							;--------------------------------Fourth Input ------------------------	
				invoke StdOut,addr ensub4
				invoke StdIn,addr a4,50
				mov[a4 + eax],0
				invoke StripLF,addr a4
				invoke atodw,addr a4
				mov b4,eax
				.if b4 == 1173 || b4 == 1137 || b4 == 1111 || b4 == 1109 || b4 == 2244 || b4 == 1227 || b4 == 1103 || b4 == 1202 || b4 == 1048 || b4 == 2171
				jmp ques4
				.else
				jmp offer4
				.endif
		ques4:
				invoke StdOut,addr display1
				invoke StdIn,addr dis4,50
				.if dis4 == 'Y' || dis4 == 'y'
				jmp offer5
				.elseif dis4 == 'N' || dis4 == 'n'
				jmp SubjectDisplay1
				.else
				jmp ques4
				.endif
				
		offer5: 							;--------------------------------Fifth Input ------------------------	
				invoke StdOut,addr ensub5
				invoke StdIn,addr a5,50
				mov[a5 + eax],0
				invoke StripLF,addr a5
				invoke atodw,addr a5
				mov b5,eax
				.if b5 == 1173 || b5 == 1137 || b5 == 1111 || b5 == 1109 || b5 == 2244 || b5 == 1227 || b5 == 1103 || b5 == 1202 || b5 == 1048 || b5 == 2171
				jmp ques5
				.else
				jmp offer5
				.endif
		ques5:
				invoke StdOut,addr display1
				invoke StdIn,addr dis5,50
				.if dis5 == 'Y' || dis5 == 'y'
				jmp offer6
				.elseif dis5 == 'N' || dis5 == 'n'
				jmp SubjectDisplay1
				.else
				jmp ques5
				.endif
		
		offer6: 							;--------------------------------Sixth Input ------------------------	
				invoke StdOut,addr ensub6
				invoke StdIn,addr a6,50
				mov[a6 + eax],0
				invoke StripLF,addr a6
				invoke atodw,addr a6
				mov b6,eax
				.if b6 == 1173 || b6 == 1137 || b6 == 1111 || b6 == 1109 || b6 == 2244 || b6 == 1227 || b6 == 1103 || b6 == 1202 || b6 == 1048 || b6 == 2171
				jmp ques6
				.else
				jmp offer6
				.endif
		ques6:
				invoke StdOut,addr display1
				invoke StdIn,addr dis6,50
				.if dis6 == 'Y' || dis6 == 'y'
				jmp offer7
				.elseif dis6 == 'N' || dis6 == 'n'
				jmp SubjectDisplay1
				.else
				jmp ques6
				.endif
		
		offer7: 							;--------------------------------Seventh Input ------------------------	
				invoke StdOut,addr ensub7
				invoke StdIn,addr a7,50
				mov[a7 + eax],0
				invoke StripLF,addr a7
				invoke atodw,addr a7
				mov b7,eax
				.if b7 == 1173 || b7 == 1137 || b7 == 1111 || b7 == 1109 || b7 == 2244 || b7 == 1227 || b7 == 1103 || b7 == 1202 || b7 == 1048 || b7 == 2171
				jmp ques7
				.else
				jmp offer7
				.endif
		ques7:
				invoke StdOut,addr display1
				invoke StdIn,addr dis7,50
				.if dis7 == 'Y' || dis7 == 'y'
				jmp offer8
				.elseif dis7 == 'N' || dis7 == 'n'
				jmp SubjectDisplay1
				.else
				jmp ques7
				.endif
		
		offer8: 							;--------------------------------Eight Input ------------------------	
				invoke StdOut,addr ensub8
				invoke StdIn,addr a8,50
				mov[a8 + eax],0
				invoke StripLF,addr a8
				invoke atodw,addr a8
				mov b8,eax
				.if b8 == 1173 || b8 == 1137 || b8 == 1111 || b8 == 1109 || b8 == 2244 || b8 == 1227 || b8 == 1103 || b8 == 1202 || b8 == 1048 || b8 == 2171
				jmp ques8
				.else
				jmp offer8
				.endif
		ques8:
				invoke StdOut,addr display1
				invoke StdIn,addr dis8,50
				.if dis8 == 'Y' || dis8 == 'y'
				jmp offer9
				.elseif dis8 == 'N' || dis8 == 'n'
				jmp SubjectDisplay1
				.else
				jmp ques8
				.endif
		offer9: 							;--------------------------------Nineth Input ------------------------	
				invoke StdOut,addr ensub9
				invoke StdIn,addr a9,50
				mov[a9 + eax],0
				invoke StripLF,addr a9
				invoke atodw,addr a9
				mov b9,eax
				.if b9 == 1173 || b9 == 1137 || b9 == 1111 || b9 == 1109 || b9 == 2244 || b9 == 1227 || b9 == 1103 || b9 == 1202 || b9 == 1048 || b9 == 2171
				jmp SubjectDisplay1
				.else
				jmp offer9
				.endif
				
		
		SubjectDisplay1:			; ----------------------------------Enrolled Subjects --------
							mov default1,'0'
							mov [default1 + eax],0
							invoke StripLF,addr default1
							invoke atodw,addr default1
							mov ebx,eax
							
							invoke ClearScreen
							invoke StdOut,addr header
							invoke StdOut,addr header2
							invoke StdOut,addr header3
							invoke StdOut,addr header4
							invoke StdOut,addr header5
							invoke StdOut,addr header6
							invoke StdOut,addr header7
							invoke StdOut,addr header8
							invoke StdOut,addr names
							invoke StdOut,addr name1
							invoke StdOut,addr subj2
							invoke StdOut,addr heads
							invoke StdOut,addr head1
							invoke StdOut,addr head2
							
				.if b1 == 1173    ;----------------------------------First output Subject -----------------------------
								invoke StdOut,addr sub1
								mov unit1,'3'
								mov[unit1 + eax],0
								invoke StripLF,addr unit1
								invoke atodw,addr unit1
								add ebx,eax
				.elseif b1 == 1137 
								invoke StdOut,addr sub2
								mov unit2,'3'
								mov[unit2 + eax],0					
								invoke StripLF,addr unit2
								invoke atodw,addr unit2
								add ebx,eax
				.elseif b1 == 1111
								invoke StdOut,addr sub3
								mov unit3,'2'
								mov[unit3 + eax],0
								invoke StripLF,addr unit3
								invoke atodw,addr unit3
								add ebx,eax
				.elseif b1 == 1109
								invoke StdOut,addr sub4
								mov unit4,'4'
								mov[unit4 + eax],0
								invoke StripLF,addr unit4
								invoke atodw,addr unit4
								add ebx,eax
				.elseif b1 == 2244
								invoke StdOut,addr sub5
								mov unit5,'3'
								mov[unit5 + eax],0
								invoke StripLF,addr unit5
								invoke atodw,addr unit5
								add ebx,eax
				.elseif b1 == 1227
								invoke StdOut,addr sub6
								mov unit6,'3'
								mov[unit6 + eax],0
								invoke StripLF,addr unit6
								invoke atodw,addr unit6
								add ebx,eax
				.elseif b1 == 1103 
								invoke StdOut,addr sub7
								mov unit7,'3'
								mov[unit7 + eax],0
								invoke StripLF,addr unit7
								invoke atodw,addr unit7
								add ebx,eax
				.elseif b1 == 1202
								invoke StdOut,addr sub8
								mov unit8,'2'
								mov[unit8 + eax],0
								invoke StripLF,addr unit8
								invoke atodw,addr unit8
								add ebx,eax
				.elseif b1 == 1048 || b1 == 2171
								invoke StdOut,addr sub9
								invoke StdOut,addr sub10
								mov unit9,'3'
								mov[unit9 + eax],0
								invoke StripLF,addr unit9
								invoke atodw,addr unit9
								add ebx,eax
				.endif
				
				
				.if b2 == 1173				;----------------------------------Second output Subject -----------------------------
								invoke StdOut,addr sub1
								mov unit1,'3'
								mov[unit1 + eax],0
								invoke StripLF,addr unit1
								invoke atodw,addr unit1
								add ebx,eax
				.elseif b2 == 1137 
								invoke StdOut,addr sub2
								mov unit2,'3'
								mov[unit2 + eax],0					
								invoke StripLF,addr unit2
								invoke atodw,addr unit2
								add ebx,eax
				.elseif b2 == 1111
								invoke StdOut,addr sub3
								mov unit3,'2'
								mov[unit3 + eax],0
								invoke StripLF,addr unit3
								invoke atodw,addr unit3
								add ebx,eax
				.elseif b2 == 1109
								invoke StdOut,addr sub4
								mov unit4,'4'
								mov[unit4 + eax],0
								invoke StripLF,addr unit4
								invoke atodw,addr unit4
								add ebx,eax
				.elseif b2 == 2244
								invoke StdOut,addr sub5
								mov unit5,'3'
								mov[unit5 + eax],0
								invoke StripLF,addr unit5
								invoke atodw,addr unit5
								add ebx,eax
				.elseif b2 == 1227
								invoke StdOut,addr sub6
								mov unit6,'3'
								mov[unit6 + eax],0
								invoke StripLF,addr unit6
								invoke atodw,addr unit6
								add ebx,eax
				.elseif b2 == 1103 
								invoke StdOut,addr sub7
								mov unit7,'3'
								mov[unit7 + eax],0
								invoke StripLF,addr unit7
								invoke atodw,addr unit7
								add ebx,eax
				.elseif b2 == 1202
								invoke StdOut,addr sub8
								mov unit8,'2'
								mov[unit8 + eax],0
								invoke StripLF,addr unit8
								invoke atodw,addr unit8
								add ebx,eax
				.elseif b2 == 1048 || b1 == 2171
								invoke StdOut,addr sub9
								invoke StdOut,addr sub10
								mov unit9,'3'
								mov[unit9 + eax],0
								invoke StripLF,addr unit9
								invoke atodw,addr unit9
								add ebx,eax
				.endif
				
				.if b3 == 1173				;----------------------------------Third output Subject -----------------------------
								invoke StdOut,addr sub1
								mov unit1,'3'
								mov[unit1 + eax],0
								invoke StripLF,addr unit1
								invoke atodw,addr unit1
								add ebx,eax
				.elseif b3 == 1137 
								invoke StdOut,addr sub2
								mov unit2,'3'
								mov[unit2 + eax],0					
								invoke StripLF,addr unit2
								invoke atodw,addr unit2
								add ebx,eax
				.elseif b3 == 1111
								invoke StdOut,addr sub3
								mov unit3,'2'
								mov[unit3 + eax],0
								invoke StripLF,addr unit3
								invoke atodw,addr unit3
								add ebx,eax
				.elseif b3 == 1109
								invoke StdOut,addr sub4
								mov unit4,'4'
								mov[unit4 + eax],0
								invoke StripLF,addr unit4
								invoke atodw,addr unit4
								add ebx,eax
				.elseif b3 == 2244
								invoke StdOut,addr sub5
								mov unit5,'3'
								mov[unit5 + eax],0
								invoke StripLF,addr unit5
								invoke atodw,addr unit5
								add ebx,eax
				.elseif b3 == 1227
								invoke StdOut,addr sub6
								mov unit6,'3'
								mov[unit6 + eax],0
								invoke StripLF,addr unit6
								invoke atodw,addr unit6
								add ebx,eax
				.elseif b3 == 1103 
								invoke StdOut,addr sub7
								mov unit7,'3'
								mov[unit7 + eax],0
								invoke StripLF,addr unit7
								invoke atodw,addr unit7
								add ebx,eax
				.elseif b3 == 1202
								invoke StdOut,addr sub8
								mov unit8,'2'
								mov[unit8 + eax],0
								invoke StripLF,addr unit8
								invoke atodw,addr unit8
								add ebx,eax
				.elseif b3 == 1048 || b1 == 2171
								invoke StdOut,addr sub9
								invoke StdOut,addr sub10
								mov unit9,'3'
								mov[unit9 + eax],0
								invoke StripLF,addr unit9
								invoke atodw,addr unit9
								add ebx,eax
				.endif
				
				.if b4 == 1173				;----------------------------------Fourth output Subject -----------------------------
								invoke StdOut,addr sub1
								mov unit1,'3'
								mov[unit1 + eax],0
								invoke StripLF,addr unit1
								invoke atodw,addr unit1
								add ebx,eax
				.elseif b4 == 1137 
								invoke StdOut,addr sub2
								mov unit2,'3'
								mov[unit2 + eax],0					
								invoke StripLF,addr unit2
								invoke atodw,addr unit2
								add ebx,eax
				.elseif b4 == 1111
								invoke StdOut,addr sub3
								mov unit3,'2'
								mov[unit3 + eax],0
								invoke StripLF,addr unit3
								invoke atodw,addr unit3
								add ebx,eax
				.elseif b4 == 1109
								invoke StdOut,addr sub4
								mov unit4,'4'
								mov[unit4 + eax],0
								invoke StripLF,addr unit4
								invoke atodw,addr unit4
								add ebx,eax
				.elseif b4 == 2244
								invoke StdOut,addr sub5
								mov unit5,'3'
								mov[unit5 + eax],0
								invoke StripLF,addr unit5
								invoke atodw,addr unit5
								add ebx,eax
				.elseif b4 == 1227
								invoke StdOut,addr sub6
								mov unit6,'3'
								mov[unit6 + eax],0
								invoke StripLF,addr unit6
								invoke atodw,addr unit6
								add ebx,eax
				.elseif b4 == 1103 
								invoke StdOut,addr sub7
								mov unit7,'3'
								mov[unit7 + eax],0
								invoke StripLF,addr unit7
								invoke atodw,addr unit7
								add ebx,eax
				.elseif b4 == 1202
								invoke StdOut,addr sub8
								mov unit8,'2'
								mov[unit8 + eax],0
								invoke StripLF,addr unit8
								invoke atodw,addr unit8
								add ebx,eax
				.elseif b4 == 1048 || b1 == 2171
								invoke StdOut,addr sub9
								invoke StdOut,addr sub10
								mov unit9,'3'
								mov[unit9 + eax],0
								invoke StripLF,addr unit9
								invoke atodw,addr unit9
								add ebx,eax
				.endif
				
				.if b5 == 1173				;----------------------------------Fifth output Subject -----------------------------
								invoke StdOut,addr sub1
								mov unit1,'3'
								mov[unit1 + eax],0
								invoke StripLF,addr unit1
								invoke atodw,addr unit1
								add ebx,eax
				.elseif b5 == 1137 
								invoke StdOut,addr sub2
								mov unit2,'3'
								mov[unit2 + eax],0					
								invoke StripLF,addr unit2
								invoke atodw,addr unit2
								add ebx,eax
				.elseif b5 == 1111
								invoke StdOut,addr sub3
								mov unit3,'2'
								mov[unit3 + eax],0
								invoke StripLF,addr unit3
								invoke atodw,addr unit3
								add ebx,eax
				.elseif b5 == 1109
								invoke StdOut,addr sub4
								mov unit4,'4'
								mov[unit4 + eax],0
								invoke StripLF,addr unit4
								invoke atodw,addr unit4
								add ebx,eax
				.elseif b5 == 2244
								invoke StdOut,addr sub5
								mov unit5,'3'
								mov[unit5 + eax],0
								invoke StripLF,addr unit5
								invoke atodw,addr unit5
								add ebx,eax
				.elseif b5 == 1227
								invoke StdOut,addr sub6
								mov unit6,'3'
								mov[unit6 + eax],0
								invoke StripLF,addr unit6
								invoke atodw,addr unit6
								add ebx,eax
				.elseif b5 == 1103 
								invoke StdOut,addr sub7
								mov unit7,'3'
								mov[unit7 + eax],0
								invoke StripLF,addr unit7
								invoke atodw,addr unit7
								add ebx,eax
				.elseif b5 == 1202
								invoke StdOut,addr sub8
								mov unit8,'2'
								mov[unit8 + eax],0
								invoke StripLF,addr unit8
								invoke atodw,addr unit8
								add ebx,eax
				.elseif b5 == 1048 || b1 == 2171
								invoke StdOut,addr sub9
								invoke StdOut,addr sub10
								mov unit9,'3'
								mov[unit9 + eax],0
								invoke StripLF,addr unit9
								invoke atodw,addr unit9
								add ebx,eax
				.endif
				
				.if b6 == 1173				;----------------------------------Sixth output Subject -----------------------------
								invoke StdOut,addr sub1
								mov unit1,'3'
								mov[unit1 + eax],0
								invoke StripLF,addr unit1
								invoke atodw,addr unit1
								add ebx,eax
				.elseif b6 == 1137 
								invoke StdOut,addr sub2
								mov unit2,'3'
								mov[unit2 + eax],0					
								invoke StripLF,addr unit2
								invoke atodw,addr unit2
								add ebx,eax
				.elseif b6 == 1111
								invoke StdOut,addr sub3
								mov unit3,'2'
								mov[unit3 + eax],0
								invoke StripLF,addr unit3
								invoke atodw,addr unit3
								add ebx,eax
				.elseif b6 == 1109
								invoke StdOut,addr sub4
								mov unit4,'4'
								mov[unit4 + eax],0
								invoke StripLF,addr unit4
								invoke atodw,addr unit4
								add ebx,eax
				.elseif b6 == 2244
								invoke StdOut,addr sub5
								mov unit5,'3'
								mov[unit5 + eax],0
								invoke StripLF,addr unit5
								invoke atodw,addr unit5
								add ebx,eax
				.elseif b6 == 1227
								invoke StdOut,addr sub6
								mov unit6,'3'
								mov[unit6 + eax],0
								invoke StripLF,addr unit6
								invoke atodw,addr unit6
								add ebx,eax
				.elseif b6 == 1103 
								invoke StdOut,addr sub7
								mov unit7,'3'
								mov[unit7 + eax],0
								invoke StripLF,addr unit7
								invoke atodw,addr unit7
								add ebx,eax
				.elseif b6 == 1202
								invoke StdOut,addr sub8
								mov unit8,'2'
								mov[unit8 + eax],0
								invoke StripLF,addr unit8
								invoke atodw,addr unit8
								add ebx,eax
				.elseif b6 == 1048 || b1 == 2171
								invoke StdOut,addr sub9
								invoke StdOut,addr sub10
								mov unit9,'3'
								mov[unit9 + eax],0
								invoke StripLF,addr unit9
								invoke atodw,addr unit9
								add ebx,eax
				.endif
				
				.if b7 == 1173				;----------------------------------Seventh output Subject -----------------------------
								invoke StdOut,addr sub1
								mov unit1,'3'
								mov[unit1 + eax],0
								invoke StripLF,addr unit1
								invoke atodw,addr unit1
								add ebx,eax
				.elseif b7 == 1137 
								invoke StdOut,addr sub2
								mov unit2,'3'
								mov[unit2 + eax],0					
								invoke StripLF,addr unit2
								invoke atodw,addr unit2
								add ebx,eax
				.elseif b7 == 1111
								invoke StdOut,addr sub3
								mov unit3,'2'
								mov[unit3 + eax],0
								invoke StripLF,addr unit3
								invoke atodw,addr unit3
								add ebx,eax
				.elseif b7 == 1109
								invoke StdOut,addr sub4
								mov unit4,'4'
								mov[unit4 + eax],0
								invoke StripLF,addr unit4
								invoke atodw,addr unit4
								add ebx,eax
				.elseif b7 == 2244
								invoke StdOut,addr sub5
								mov unit5,'3'
								mov[unit5 + eax],0
								invoke StripLF,addr unit5
								invoke atodw,addr unit5
								add ebx,eax
				.elseif b7 == 1227
								invoke StdOut,addr sub6
								mov unit6,'3'
								mov[unit6 + eax],0
								invoke StripLF,addr unit6
								invoke atodw,addr unit6
								add ebx,eax
				.elseif b7 == 1103 
								invoke StdOut,addr sub7
								mov unit7,'3'
								mov[unit7 + eax],0
								invoke StripLF,addr unit7
								invoke atodw,addr unit7
								add ebx,eax
				.elseif b7 == 1202
								invoke StdOut,addr sub8
								mov unit8,'2'
								mov[unit8 + eax],0
								invoke StripLF,addr unit8
								invoke atodw,addr unit8
								add ebx,eax
				.elseif b7 == 1048 || b1 == 2171
								invoke StdOut,addr sub9
								invoke StdOut,addr sub10
								mov unit9,'3'
								mov[unit9 + eax],0
								invoke StripLF,addr unit9
								invoke atodw,addr unit9
								add ebx,eax
				.endif
				
				
				.if b8 == 1173				;----------------------------------Eight output Subject -----------------------------
								invoke StdOut,addr sub1
								mov unit1,'3'
								mov[unit1 + eax],0
								invoke StripLF,addr unit1
								invoke atodw,addr unit1
								add ebx,eax
				.elseif b8 == 1137 
								invoke StdOut,addr sub2
								mov unit2,'3'
								mov[unit2 + eax],0					
								invoke StripLF,addr unit2
								invoke atodw,addr unit2
								add ebx,eax
				.elseif b8 == 1111
								invoke StdOut,addr sub3
								mov unit3,'2'
								mov[unit3 + eax],0
								invoke StripLF,addr unit3
								invoke atodw,addr unit3
								add ebx,eax
				.elseif b8 == 1109
								invoke StdOut,addr sub4
								mov unit4,'4'
								mov[unit4 + eax],0
								invoke StripLF,addr unit4
								invoke atodw,addr unit4
								add ebx,eax
				.elseif b8 == 2244
								invoke StdOut,addr sub5
								mov unit5,'3'
								mov[unit5 + eax],0
								invoke StripLF,addr unit5
								invoke atodw,addr unit5
								add ebx,eax
				.elseif b8 == 1227
								invoke StdOut,addr sub6
								mov unit6,'3'
								mov[unit6 + eax],0
								invoke StripLF,addr unit6
								invoke atodw,addr unit6
								add ebx,eax
				.elseif b8 == 1103 
								invoke StdOut,addr sub7
								mov unit7,'3'
								mov[unit7 + eax],0
								invoke StripLF,addr unit7
								invoke atodw,addr unit7
								add ebx,eax
				.elseif b8 == 1202
								invoke StdOut,addr sub8
								mov unit8,'2'
								mov[unit8 + eax],0
								invoke StripLF,addr unit8
								invoke atodw,addr unit8
								add ebx,eax
				.elseif b8 == 1048 || b1 == 2171
								invoke StdOut,addr sub9
								invoke StdOut,addr sub10
								mov unit9,'3'
								mov[unit9 + eax],0
								invoke StripLF,addr unit9
								invoke atodw,addr unit9
								add ebx,eax
				.endif
				
				.if b9 == 1173				;----------------------------------Nineth output Subject -----------------------------
								invoke StdOut,addr sub1
								mov unit1,'3'
								mov[unit1 + eax],0
								invoke StripLF,addr unit1
								invoke atodw,addr unit1
								add ebx,eax
				.elseif b9 == 1137 
								invoke StdOut,addr sub2
								mov unit2,'3'
								mov[unit2 + eax],0					
								invoke StripLF,addr unit2
								invoke atodw,addr unit2
								add ebx,eax
				.elseif b9 == 1111
								invoke StdOut,addr sub3
								mov unit3,'2'
								mov[unit3 + eax],0
								invoke StripLF,addr unit3
								invoke atodw,addr unit3
								add ebx,eax
				.elseif b9 == 1109
								invoke StdOut,addr sub4
								mov unit4,'4'
								mov[unit4 + eax],0
								invoke StripLF,addr unit4
								invoke atodw,addr unit4
								add ebx,eax
				.elseif b9 == 2244
								invoke StdOut,addr sub5
								mov unit5,'3'
								mov[unit5 + eax],0
								invoke StripLF,addr unit5
								invoke atodw,addr unit5
								add ebx,eax
				.elseif b9 == 1227
								invoke StdOut,addr sub6
								mov unit6,'3'
								mov[unit6 + eax],0
								invoke StripLF,addr unit6
								invoke atodw,addr unit6
								add ebx,eax
				.elseif b9 == 1103 
								invoke StdOut,addr sub7
								mov unit7,'3'
								mov[unit7 + eax],0
								invoke StripLF,addr unit7
								invoke atodw,addr unit7
								add ebx,eax
				.elseif b9 == 1202
								invoke StdOut,addr sub8
								mov unit8,'2'
								mov[unit8 + eax],0
								invoke StripLF,addr unit8
								invoke atodw,addr unit8
								add ebx,eax
				.elseif b9 == 1048 || b1 == 2171
								invoke StdOut,addr sub9
								invoke StdOut,addr sub10
								mov unit9,'3'
								mov[unit9 + eax],0
								invoke StripLF,addr unit9
								invoke atodw,addr unit9
								add ebx,eax
				.endif
								
				invoke dwtoa,ebx,addr total1
				invoke StdOut,addr space1
				invoke StdOut,addr total1
				
				invoke StdOut,addr list1
				invoke StdOut,addr user1
				invoke StdOut,addr user2
				invoke StdOut,addr user3
				invoke StdOut,addr user4
				invoke StdOut,addr user5
				
			ceed : 
					invoke StdOut,addr proceed1
					invoke StdIn,addr ceed1,50
					.if ceed1 == 'Y' || ceed1 == 'y'
					jmp FirstYearSecondSemester
					.elseif ceed1 == 'N' || ceed1 == 'n'
					jmp FirstYear
					.else
					jmp ceed
					.endif			; ------------------------------ First Semester End--------------------------
					
FirstYearSecondSemester :			; ------------------------------ *Second Semester* --------------------------
				invoke ClearScreen
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr firststudent
				invoke StdOut,addr Requisites
				invoke StdOut,addr output
				
				invoke StdOut,addr pre				; ------------------------ Pre-Requisites Subject Input
				invoke StdIn,addr spre,50
				mov[spre + eax],0
				invoke StripLF,addr spre
				invoke atodw,addr spre
				mov spre,eax
				
				invoke StdOut,addr pre1
				invoke StdIn,addr spre1,50
				mov[spre1 + eax],0
				invoke StripLF,addr spre1
				invoke atodw,addr spre1
				mov spre1,eax
				
				invoke StdOut,addr pre2
				invoke StdIn,addr spre2,50
				mov[spre2 + eax],0
				invoke StripLF,addr spre2
				invoke atodw,addr spre2
				mov spre2,eax
				
				invoke StdOut,addr pre3
				invoke StdIn,addr spre3,50
				mov[spre3 + eax],0
				invoke StripLF,addr spre3
				invoke atodw,addr spre3
				mov spre3,eax
				
				invoke StdOut,addr pre4			
				invoke StdIn,addr spre4,50
				mov[spre4 + eax],0
				invoke StripLF,addr spre4
				invoke atodw,addr spre4
				mov spre4,eax
				
				invoke StdOut,addr pre5
				invoke StdIn,addr spre5,50
				mov[spre5 + eax],0
				invoke StripLF,addr spre5
				invoke atodw,addr spre5
				mov spre5,eax
				
				invoke StdOut,addr pre6
				invoke StdIn,addr spre6,50
				mov[spre6 + eax],0
				invoke StripLF,addr spre6
				invoke atodw,addr spre6
				mov spre6,eax
				
				invoke ClearScreen
				mov default2,'0'
				mov [default2 + eax],0
				invoke StripLF,addr default2
				invoke atodw,addr default2
				mov ebx,eax
				
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr available1
				invoke StdOut,addr heads
				invoke StdOut,addr head3
				invoke StdOut,addr head4
				
				.if spre >=75 && spre <=100
				invoke StdOut,addr sub11
				mov unit11,'3'
				mov[unit11 + eax],0
				invoke StripLF,addr unit11
				invoke atodw,addr unit11
				add ebx,eax
				.endif
				
				.if spre1 >=75 && spre1 <=100
				invoke StdOut,addr sub12
				mov unit12,'4'
				mov[unit12 + eax],0
				invoke StripLF,addr unit12
				invoke atodw,addr unit12
				add ebx,eax
				.endif
				
				.if spre2 >=75 && spre2 <=100
				invoke StdOut,addr sub13
				mov unit13,'2'
				mov[unit13 + eax],0
				invoke StripLF,addr unit13
				invoke atodw,addr unit13
				add ebx,eax
				.endif
				
				invoke StdOut,addr sub14
				mov unit14,'3'
				mov[unit14 + eax],0
				invoke StripLF,addr unit14
				invoke atodw,addr unit14
				add ebx,eax
				
				.if spre3 >=75 && spre3 <=100
				invoke StdOut,addr sub15
				invoke StdOut,addr sub16
				mov unit15,'5'
				mov[unit15 + eax],0
				invoke StripLF,addr unit15
				invoke atodw,addr unit15
				add ebx,eax
				.endif
				
				.if spre4 >=75 && spre4 <=100
				invoke StdOut,addr sub17
				mov unit16,'3'
				mov[unit16 + eax],0
				invoke StripLF,addr unit16
				invoke atodw,addr unit16
				add ebx,eax
				.endif
				
				invoke StdOut,addr sub18
				mov unit17,'3'
				mov[unit17 + eax],0
				invoke StripLF,addr unit17
				invoke atodw,addr unit17
				add ebx,eax
				
				.if spre5 >=75 && spre5 <=100
				invoke StdOut,addr sub19
				mov unit18,'2'
				mov[unit18 + eax],0
				invoke StripLF,addr unit18
				invoke atodw,addr unit18
				add ebx,eax
				.endif
				
				.if spre6 >=75 && spre6 <=100
				invoke StdOut,addr sub20
				invoke StdOut,addr sub21
				mov unit19,'3'
				mov[unit19 + eax],0
				invoke StripLF,addr unit19
				invoke atodw,addr unit19
				add ebx,eax
				.endif
				
				
				invoke dwtoa,ebx,addr total2
				invoke StdOut,addr space1
				invoke StdOut,addr total2
				
				
				invoke StdOut,addr subj
				
		offer1s: 							;--------------------------------First Input ------------------------
				invoke StdOut,addr ensub1
				invoke StdIn,addr c1,50
				mov[c1 + eax],0
				invoke StripLF,addr c1
				invoke atodw,addr c1
				mov d1,eax
				.if d1 == 2094 || d1 == 2268 || d1 == 1432 || d1 == 1433 || d1 == 2028 || d1 == 2029 || d1 == 1083 || d1 == 1066 || d1 == 1050 || d1 == 1242 || d1 == 2172
				jmp ques1s
				.else
				jmp offer1s
				.endif
		ques1s:
				invoke StdOut,addr display1
				invoke StdIn,addr dis10,50
				.if dis10 == 'Y' || dis10 == 'y'
				jmp offer2s
				.elseif dis10 == 'N' || dis10 == 'n'
				jmp SubjectDisplay2
				.else
				jmp ques1s
				.endif
				
		offer2s: 							;--------------------------------Second Input ------------------------
				invoke StdOut,addr ensub2
				invoke StdIn,addr c2,50
				mov[c2 + eax],0
				invoke StripLF,addr c2
				invoke atodw,addr c2
				mov d2,eax
				.if d2 == 2094 || d2 == 2268 || d2 == 1432 || d2 == 1433 || d2 == 2028 || d2 == 2029 || d2 == 1083 || d2 == 1066 || d2 == 1050 || d2 == 1242 || d2 == 2172
				jmp ques2s
				.else
				jmp offer2s
				.endif
		ques2s:
				invoke StdOut,addr display1
				invoke StdIn,addr dis11,50
				.if dis11 == 'Y' || dis11 == 'y'
				jmp offer3s
				.elseif dis11 == 'N' || dis11 == 'n'
				jmp SubjectDisplay2
				.else
				jmp ques2s
				.endif
								
		offer3s: 							;--------------------------------Third Input ------------------------
				invoke StdOut,addr ensub3
				invoke StdIn,addr c3,50
				mov[c3 + eax],0
				invoke StripLF,addr c3
				invoke atodw,addr c3
				mov d3,eax
				.if d3 == 2094 || d3 == 2268 || d3 == 1432 || d3 == 1433 || d3 == 2028 || d3 == 2029 || d3 == 1083 || d3 == 1066 || d3 == 1050 || d3 == 1242 || d3 == 2172
				jmp ques3s
				.else
				jmp offer3s
				.endif
		ques3s:
				invoke StdOut,addr display1
				invoke StdIn,addr dis12,50
				.if dis12 == 'Y' || dis12 == 'y'
				jmp offer4s
				.elseif dis12 == 'N' || dis12 == 'n'
				jmp SubjectDisplay2
				.else
				jmp ques3s
				.endif
										
		offer4s: 							;--------------------------------Fourth Input ------------------------
				invoke StdOut,addr ensub4
				invoke StdIn,addr c4,50
				mov[c4 + eax],0
				invoke StripLF,addr c4
				invoke atodw,addr c4
				mov d4,eax
				.if d4 == 2094 || d4 == 2268 || d4 == 1432 || d4 == 1433 || d4 == 2028 || d4 == 2029 || d4 == 1083 || d4 == 1066 || d4 == 1050 || d4 == 1242 || d4 == 2172
				jmp ques4s
				.else
				jmp offer4s
				.endif
		ques4s:
				invoke StdOut,addr display1
				invoke StdIn,addr dis13,50
				.if dis13 == 'Y' || dis13 == 'y'
				jmp offer5s
				.elseif dis13 == 'N' || dis13 == 'n'
				jmp SubjectDisplay2
				.else
				jmp ques4s
				.endif
												
		offer5s: 							;--------------------------------Fifth Input ------------------------
				invoke StdOut,addr ensub5
				invoke StdIn,addr c5,50
				mov[c5 + eax],0
				invoke StripLF,addr c5
				invoke atodw,addr c5
				mov d5,eax
				.if d5 == 2094 || d5 == 2268 || d5 == 1432 || d5 == 1433 || d5 == 2028 || d5 == 2029 || d5 == 1083 || d5 == 1066 || d5 == 1050 || d5 == 1242 || d5 == 2172
				jmp ques5s
				.else
				jmp offer5s
				.endif
		ques5s:
				invoke StdOut,addr display1
				invoke StdIn,addr dis13,50
				.if dis13 == 'Y' || dis13 == 'y'
				jmp offer6s
				.elseif dis13 == 'N' || dis13 == 'n'
				jmp SubjectDisplay2
				.else
				jmp ques5s
				.endif
														
		offer6s: 							;--------------------------------Sixth Input ------------------------
				invoke StdOut,addr ensub6
				invoke StdIn,addr c6,50
				mov[c6 + eax],0
				invoke StripLF,addr c6
				invoke atodw,addr c6
				mov d6,eax
				.if d6 == 2094 || d6 == 2268 || d6 == 1432 || d6 == 1433 || d6 == 2028 || d6 == 2029 || d6 == 1083 || d6 == 1066 || d6 == 1050 || d6 == 1242 || d6 == 2172
				jmp ques6s
				.else
				jmp offer6s
				.endif
		ques6s:
				invoke StdOut,addr display1
				invoke StdIn,addr dis14,50
				.if dis14 == 'Y' || dis14 == 'y'
				jmp offer7s
				.elseif dis14 == 'N' || dis14 == 'n'
				jmp SubjectDisplay2
				.else
				jmp ques6s
				.endif
		
		offer7s: 							;--------------------------------Seventh Input ------------------------
				invoke StdOut,addr ensub7
				invoke StdIn,addr c7,50
				mov[c7 + eax],0
				invoke StripLF,addr c7
				invoke atodw,addr c7
				mov d7,eax
				.if d7 == 2094 || d7 == 2268 || d7 == 1432 || d7 == 1433 || d7 == 2028 || d7 == 2029 || d7 == 1083 || d7 == 1066 || d7 == 1050 || d7 == 1242 || d7 == 2172
				jmp ques7s
				.else
				jmp offer7s
				.endif
		ques7s:
				invoke StdOut,addr display1
				invoke StdIn,addr dis15,50
				.if dis15 == 'Y' || dis15 == 'y'
				jmp offer8s
				.elseif dis15 == 'N' || dis15 == 'n'
				jmp SubjectDisplay2
				.else
				jmp ques7s
				.endif
				
		offer8s: 							;--------------------------------Eight Input ------------------------
				invoke StdOut,addr ensub8
				invoke StdIn,addr c8,50
				mov[c8 + eax],0
				invoke StripLF,addr c8
				invoke atodw,addr c8
				mov d8,eax
				.if d8 == 2094 || d8 == 2268 || d8 == 1432 || d8 == 1433 || d8 == 2028 || d8 == 2029 || d8 == 1083 || d8 == 1066 || d8 == 1050 || d8 == 1242 || d8 == 2172
				jmp ques8s
				.else
				jmp offer8s
				.endif
		ques8s:
				invoke StdOut,addr display1
				invoke StdIn,addr dis16,50
				.if dis16 == 'Y' || dis16 == 'y'
				jmp offer9s
				.elseif dis16 == 'N' || dis16 == 'n'
				jmp SubjectDisplay2
				.else
				jmp ques8s
				.endif
				
		offer9s: 							;--------------------------------Nineth Input ------------------------
				invoke StdOut,addr ensub9
				invoke StdIn,addr c9,50
				mov[c9 + eax],0
				invoke StripLF,addr c9
				invoke atodw,addr c9
				mov d9,eax
				.if d9 == 2094 || d9 == 2268 || d9 == 1432 || d9 == 1433 || d9 == 2028 || d9 == 2029 || d9 == 1083 || d9 == 1066 || d9 == 1050 || d9 == 1242 || d9 == 2172
				jmp ques9s
				.else
				jmp offer9s
				.endif
		ques9s:
				invoke StdOut,addr display1
				invoke StdIn,addr dis17,50
				.if dis17 == 'Y' || dis17 == 'y'
				jmp offer10s
				.elseif dis17 == 'N' || dis17 == 'n'
				jmp SubjectDisplay2
				.else
				jmp ques9s
				.endif
		offer10s: 							;--------------------------------Tenth Input ------------------------
				invoke StdOut,addr ensub10
				invoke StdIn,addr c10,50
				mov[c10 + eax],0
				invoke StripLF,addr c10
				invoke atodw,addr c10
				mov d10,eax
				.if d10 == 2094 || d10 == 2268 || d10 == 1432 || d10 == 1433 || d10 == 2028 || d10 == 2029 || d10 == 1083 || d10 == 1066 || d10 == 1050 || d10 == 1242 || d10 == 2172
				jmp SubjectDisplay2
				.else
				jmp offer10s
				.endif
		
		
		
SubjectDisplay2:

					mov default3,'0'
					mov [default3 + eax],0
					invoke StripLF,addr default3
					invoke atodw,addr default3
					mov ebx,eax
			
					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr subj2
					invoke StdOut,addr heads
					invoke StdOut,addr head3
					invoke StdOut,addr head4
					
					
				.if d1 == 2094    ;----------------------------------First output Subject -----------------------------
								invoke StdOut,addr sub11
								mov unit21,'3'
								mov[unit21 + eax],0
								invoke StripLF,addr unit21
								invoke atodw,addr unit21
								add ebx,eax
				.elseif d1 == 2268
								invoke StdOut,addr sub12
								mov unit22,'4'
								mov[unit22 + eax],0
								invoke StripLF,addr unit22
								invoke atodw,addr unit22
								add ebx,eax
				.elseif d1 == 1432
								invoke StdOut,addr sub13
								mov unit23,'2'
								mov[unit23 + eax],0
								invoke StripLF,addr unit23
								invoke atodw,addr unit23
								add ebx,eax
				.elseif d1 == 1433
								invoke StdOut,addr sub14
								mov unit24,'3'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d1 == 2028
								invoke StdOut,addr sub15
								mov unit24,'4'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d1 == 2029
								invoke StdOut,addr sub16
								mov unit25,'1'
								mov[unit25 + eax],0
								invoke StripLF,addr unit25
								invoke atodw,addr unit25
								add ebx,eax
				.elseif d1 == 1083
								invoke StdOut,addr sub17
								mov unit26,'3'
								mov[unit26 + eax],0
								invoke StripLF,addr unit26
								invoke atodw,addr unit26
								add ebx,eax
				.elseif d1 == 1066
								invoke StdOut,addr sub18
								mov unit27,'3'
								mov[unit27 + eax],0
								invoke StripLF,addr unit27
								invoke atodw,addr unit27
								add ebx,eax
				.elseif d1 == 1050
								invoke StdOut,addr sub19
								mov unit28,'2'
								mov[unit28 + eax],0
								invoke StripLF,addr unit28
								invoke atodw,addr unit28
								add ebx,eax
				.elseif d1 == 1242 && d1 == 2172
								invoke StdOut,addr sub20
								invoke StdOut,addr sub21
								mov unit29,'3'
								mov[unit29 + eax],0
								invoke StripLF,addr unit29
								invoke atodw,addr unit29
								add ebx,eax
				.endif
								
				.if d2 == 2094    ;------------------------------------- Second output Subject -----------------------------
								invoke StdOut,addr sub11
								mov unit21,'3'
								mov[unit21 + eax],0
								invoke StripLF,addr unit21
								invoke atodw,addr unit21
								add ebx,eax
				.elseif d2 == 2268
								invoke StdOut,addr sub12
								mov unit22,'4'
								mov[unit22 + eax],0
								invoke StripLF,addr unit22
								invoke atodw,addr unit22
								add ebx,eax
				.elseif d2 == 1432
								invoke StdOut,addr sub13
								mov unit23,'2'
								mov[unit23 + eax],0
								invoke StripLF,addr unit23
								invoke atodw,addr unit23
								add ebx,eax
				.elseif d2 == 1433
								invoke StdOut,addr sub14
								mov unit24,'3'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d2 == 2028
								invoke StdOut,addr sub15
								mov unit24,'4'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d2 == 2029
								invoke StdOut,addr sub16
								mov unit25,'1'
								mov[unit25 + eax],0
								invoke StripLF,addr unit25
								invoke atodw,addr unit25
								add ebx,eax
				.elseif d2 == 1083
								invoke StdOut,addr sub17
								mov unit26,'3'
								mov[unit26 + eax],0
								invoke StripLF,addr unit26
								invoke atodw,addr unit26
								add ebx,eax
				.elseif d2 == 1066
								invoke StdOut,addr sub18
								mov unit27,'3'
								mov[unit27 + eax],0
								invoke StripLF,addr unit27
								invoke atodw,addr unit27
								add ebx,eax
				.elseif d2 == 1050
								invoke StdOut,addr sub19
								mov unit28,'2'
								mov[unit28 + eax],0
								invoke StripLF,addr unit28
								invoke atodw,addr unit28
								add ebx,eax
				.elseif d2 == 1242 && d2 == 2172
								invoke StdOut,addr sub20
								invoke StdOut,addr sub21
								mov unit29,'3'
								mov[unit29 + eax],0
								invoke StripLF,addr unit29
								invoke atodw,addr unit29
								add ebx,eax
				.endif
				
				.if d3 == 2094    ;------------------------------------- Third output Subject -----------------------------
								invoke StdOut,addr sub11
								mov unit21,'3'
								mov[unit21 + eax],0
								invoke StripLF,addr unit21
								invoke atodw,addr unit21
								add ebx,eax
				.elseif d3 == 2268
								invoke StdOut,addr sub12
								mov unit22,'4'
								mov[unit22 + eax],0
								invoke StripLF,addr unit22
								invoke atodw,addr unit22
								add ebx,eax
				.elseif d3 == 1432
								invoke StdOut,addr sub13
								mov unit23,'2'
								mov[unit23 + eax],0
								invoke StripLF,addr unit23
								invoke atodw,addr unit23
								add ebx,eax
				.elseif d3 == 1433
								invoke StdOut,addr sub14
								mov unit24,'3'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d3 == 2028
								invoke StdOut,addr sub15
								mov unit24,'4'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d3 == 2029
								invoke StdOut,addr sub16
								mov unit25,'1'
								mov[unit25 + eax],0
								invoke StripLF,addr unit25
								invoke atodw,addr unit25
								add ebx,eax
				.elseif d3 == 1083
								invoke StdOut,addr sub17
								mov unit26,'3'
								mov[unit26 + eax],0
								invoke StripLF,addr unit26
								invoke atodw,addr unit26
								add ebx,eax
				.elseif d3 == 1066
								invoke StdOut,addr sub18
								mov unit27,'3'
								mov[unit27 + eax],0
								invoke StripLF,addr unit27
								invoke atodw,addr unit27
								add ebx,eax
				.elseif d3 == 1050
								invoke StdOut,addr sub19
								mov unit28,'2'
								mov[unit28 + eax],0
								invoke StripLF,addr unit28
								invoke atodw,addr unit28
								add ebx,eax
				.elseif d3 == 1242 && d3 == 2172
								invoke StdOut,addr sub20
								invoke StdOut,addr sub21
								mov unit29,'3'
								mov[unit29 + eax],0
								invoke StripLF,addr unit29
								invoke atodw,addr unit29
								add ebx,eax
				.endif				
				
				.if d4 == 2094    ;------------------------------------- Fourth output Subject -----------------------------
								invoke StdOut,addr sub11
								mov unit21,'3'
								mov[unit21 + eax],0
								invoke StripLF,addr unit21
								invoke atodw,addr unit21
								add ebx,eax
				.elseif d4 == 2268
								invoke StdOut,addr sub12
								mov unit22,'4'
								mov[unit22 + eax],0
								invoke StripLF,addr unit22
								invoke atodw,addr unit22
								add ebx,eax
				.elseif d4 == 1432
								invoke StdOut,addr sub13
								mov unit23,'2'
								mov[unit23 + eax],0
								invoke StripLF,addr unit23
								invoke atodw,addr unit23
								add ebx,eax
				.elseif d4 == 1433
								invoke StdOut,addr sub14
								mov unit24,'3'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d4 == 2028
								invoke StdOut,addr sub15
								mov unit24,'4'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d4 == 2029
								invoke StdOut,addr sub16
								mov unit25,'1'
								mov[unit25 + eax],0
								invoke StripLF,addr unit25
								invoke atodw,addr unit25
								add ebx,eax
				.elseif d4 == 1083
								invoke StdOut,addr sub17
								mov unit26,'3'
								mov[unit26 + eax],0
								invoke StripLF,addr unit26
								invoke atodw,addr unit26
								add ebx,eax
				.elseif d4 == 1066
								invoke StdOut,addr sub18
								mov unit27,'3'
								mov[unit27 + eax],0
								invoke StripLF,addr unit27
								invoke atodw,addr unit27
								add ebx,eax
				.elseif d4 == 1050
								invoke StdOut,addr sub19
								mov unit28,'2'
								mov[unit28 + eax],0
								invoke StripLF,addr unit28
								invoke atodw,addr unit28
								add ebx,eax
				.elseif d4 == 1242 && d4 == 2172
								invoke StdOut,addr sub20
								invoke StdOut,addr sub21
								mov unit29,'3'
								mov[unit29 + eax],0
								invoke StripLF,addr unit29
								invoke atodw,addr unit29
								add ebx,eax
				.endif
				
				.if d5 == 2094    ;------------------------------------- Fifth output Subject -----------------------------
								invoke StdOut,addr sub11
								mov unit21,'3'
								mov[unit21 + eax],0
								invoke StripLF,addr unit21
								invoke atodw,addr unit21
								add ebx,eax
				.elseif d5 == 2268
								invoke StdOut,addr sub12
								mov unit22,'4'
								mov[unit22 + eax],0
								invoke StripLF,addr unit22
								invoke atodw,addr unit22
								add ebx,eax
				.elseif d5 == 1432
								invoke StdOut,addr sub13
								mov unit23,'2'
								mov[unit23 + eax],0
								invoke StripLF,addr unit23
								invoke atodw,addr unit23
								add ebx,eax
				.elseif d5 == 1433
								invoke StdOut,addr sub14
								mov unit24,'3'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d5 == 2028
								invoke StdOut,addr sub15
								mov unit24,'4'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d5 == 2029
								invoke StdOut,addr sub16
								mov unit25,'1'
								mov[unit25 + eax],0
								invoke StripLF,addr unit25
								invoke atodw,addr unit25
								add ebx,eax
				.elseif d5 == 1083
								invoke StdOut,addr sub17
								mov unit26,'3'
								mov[unit26 + eax],0
								invoke StripLF,addr unit26
								invoke atodw,addr unit26
								add ebx,eax
				.elseif d5 == 1066
								invoke StdOut,addr sub18
								mov unit27,'3'
								mov[unit27 + eax],0
								invoke StripLF,addr unit27
								invoke atodw,addr unit27
								add ebx,eax
				.elseif d5 == 1050
								invoke StdOut,addr sub19
								mov unit28,'2'
								mov[unit28 + eax],0
								invoke StripLF,addr unit28
								invoke atodw,addr unit28
								add ebx,eax
				.elseif d5 == 1242 && d5 == 2172
								invoke StdOut,addr sub20
								invoke StdOut,addr sub21
								mov unit29,'3'
								mov[unit29 + eax],0
								invoke StripLF,addr unit29
								invoke atodw,addr unit29
								add ebx,eax
				.endif
				
				.if d6 == 2094    ;------------------------------------- Sixth output Subject -----------------------------
								invoke StdOut,addr sub11
								mov unit21,'3'
								mov[unit21 + eax],0
								invoke StripLF,addr unit21
								invoke atodw,addr unit21
								add ebx,eax
				.elseif d6 == 2268
								invoke StdOut,addr sub12
								mov unit22,'4'
								mov[unit22 + eax],0
								invoke StripLF,addr unit22
								invoke atodw,addr unit22
								add ebx,eax
				.elseif d6 == 1432
								invoke StdOut,addr sub13
								mov unit23,'2'
								mov[unit23 + eax],0
								invoke StripLF,addr unit23
								invoke atodw,addr unit23
								add ebx,eax
				.elseif d6 == 1433
								invoke StdOut,addr sub14
								mov unit24,'3'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d6 == 2028
								invoke StdOut,addr sub15
								mov unit24,'4'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d6 == 2029
								invoke StdOut,addr sub16
								mov unit25,'1'
								mov[unit25 + eax],0
								invoke StripLF,addr unit25
								invoke atodw,addr unit25
								add ebx,eax
				.elseif d6 == 1083
								invoke StdOut,addr sub17
								mov unit26,'3'
								mov[unit26 + eax],0
								invoke StripLF,addr unit26
								invoke atodw,addr unit26
								add ebx,eax
				.elseif d6 == 1066
								invoke StdOut,addr sub18
								mov unit27,'3'
								mov[unit27 + eax],0
								invoke StripLF,addr unit27
								invoke atodw,addr unit27
								add ebx,eax
				.elseif d6 == 1050
								invoke StdOut,addr sub19
								mov unit28,'2'
								mov[unit28 + eax],0
								invoke StripLF,addr unit28
								invoke atodw,addr unit28
								add ebx,eax
				.elseif d6 == 1242 && d6 == 2172
								invoke StdOut,addr sub20
								invoke StdOut,addr sub21
								mov unit29,'3'
								mov[unit29 + eax],0
								invoke StripLF,addr unit29
								invoke atodw,addr unit29
								add ebx,eax
				.endif
				
				.if d7 == 2094    ;------------------------------------- Seventh output Subject -----------------------------
								invoke StdOut,addr sub11
								mov unit21,'3'
								mov[unit21 + eax],0
								invoke StripLF,addr unit21
								invoke atodw,addr unit21
								add ebx,eax
				.elseif d7 == 2268
								invoke StdOut,addr sub12
								mov unit22,'4'
								mov[unit22 + eax],0
								invoke StripLF,addr unit22
								invoke atodw,addr unit22
								add ebx,eax
				.elseif d7 == 1432
								invoke StdOut,addr sub13
								mov unit23,'2'
								mov[unit23 + eax],0
								invoke StripLF,addr unit23
								invoke atodw,addr unit23
								add ebx,eax
				.elseif d7 == 1433
								invoke StdOut,addr sub14
								mov unit24,'3'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d7 == 2028
								invoke StdOut,addr sub15
								mov unit24,'4'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d7 == 2029
								invoke StdOut,addr sub16
								mov unit25,'1'
								mov[unit25 + eax],0
								invoke StripLF,addr unit25
								invoke atodw,addr unit25
								add ebx,eax
				.elseif d7 == 1083
								invoke StdOut,addr sub17
								mov unit26,'3'
								mov[unit26 + eax],0
								invoke StripLF,addr unit26
								invoke atodw,addr unit26
								add ebx,eax
				.elseif d7 == 1066
								invoke StdOut,addr sub18
								mov unit27,'3'
								mov[unit27 + eax],0
								invoke StripLF,addr unit27
								invoke atodw,addr unit27
								add ebx,eax
				.elseif d7 == 1050
								invoke StdOut,addr sub19
								mov unit28,'2'
								mov[unit28 + eax],0
								invoke StripLF,addr unit28
								invoke atodw,addr unit28
								add ebx,eax
				.elseif d7 == 1242 && d7 == 2172
								invoke StdOut,addr sub20
								invoke StdOut,addr sub21
								mov unit29,'3'
								mov[unit29 + eax],0
								invoke StripLF,addr unit29
								invoke atodw,addr unit29
								add ebx,eax
				.endif
				
				
				.if d8 == 2094    ;------------------------------------- Eight output Subject -----------------------------
								invoke StdOut,addr sub11
								mov unit21,'3'
								mov[unit21 + eax],0
								invoke StripLF,addr unit21
								invoke atodw,addr unit21
								add ebx,eax
				.elseif d8 == 2268
								invoke StdOut,addr sub12
								mov unit22,'4'
								mov[unit22 + eax],0
								invoke StripLF,addr unit22
								invoke atodw,addr unit22
								add ebx,eax
				.elseif d8 == 1432
								invoke StdOut,addr sub13
								mov unit23,'2'
								mov[unit23 + eax],0
								invoke StripLF,addr unit23
								invoke atodw,addr unit23
								add ebx,eax
				.elseif d8 == 1433
								invoke StdOut,addr sub14
								mov unit24,'3'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d8 == 2028
								invoke StdOut,addr sub15
								mov unit24,'4'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d8 == 2029
								invoke StdOut,addr sub16
								mov unit25,'1'
								mov[unit25 + eax],0
								invoke StripLF,addr unit25
								invoke atodw,addr unit25
								add ebx,eax
				.elseif d8 == 1083
								invoke StdOut,addr sub17
								mov unit26,'3'
								mov[unit26 + eax],0
								invoke StripLF,addr unit26
								invoke atodw,addr unit26
								add ebx,eax
				.elseif d8 == 1066
								invoke StdOut,addr sub18
								mov unit27,'3'
								mov[unit27 + eax],0
								invoke StripLF,addr unit27
								invoke atodw,addr unit27
								add ebx,eax
				.elseif d8 == 1050
								invoke StdOut,addr sub19
								mov unit28,'2'
								mov[unit28 + eax],0
								invoke StripLF,addr unit28
								invoke atodw,addr unit28
								add ebx,eax
				.elseif d8 == 1242 && d8 == 2172
								invoke StdOut,addr sub20
								invoke StdOut,addr sub21
								mov unit29,'3'
								mov[unit29 + eax],0
								invoke StripLF,addr unit29
								invoke atodw,addr unit29
								add ebx,eax
				.endif
				
				.if d9 == 2094    ;------------------------------------- Nineth output Subject -----------------------------
								invoke StdOut,addr sub11
								mov unit21,'3'
								mov[unit21 + eax],0
								invoke StripLF,addr unit21
								invoke atodw,addr unit21
								add ebx,eax
				.elseif d9 == 2268
								invoke StdOut,addr sub12
								mov unit22,'4'
								mov[unit22 + eax],0
								invoke StripLF,addr unit22
								invoke atodw,addr unit22
								add ebx,eax
				.elseif d9 == 1432
								invoke StdOut,addr sub13
								mov unit23,'2'
								mov[unit23 + eax],0
								invoke StripLF,addr unit23
								invoke atodw,addr unit23
								add ebx,eax
				.elseif d9 == 1433
								invoke StdOut,addr sub14
								mov unit24,'3'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d9 == 2028
								invoke StdOut,addr sub15
								mov unit24,'4'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d9 == 2029
								invoke StdOut,addr sub16
								mov unit25,'1'
								mov[unit25 + eax],0
								invoke StripLF,addr unit25
								invoke atodw,addr unit25
								add ebx,eax
				.elseif d9 == 1083
								invoke StdOut,addr sub17
								mov unit26,'3'
								mov[unit26 + eax],0
								invoke StripLF,addr unit26
								invoke atodw,addr unit26
								add ebx,eax
				.elseif d9 == 1066
								invoke StdOut,addr sub18
								mov unit27,'3'
								mov[unit27 + eax],0
								invoke StripLF,addr unit27
								invoke atodw,addr unit27
								add ebx,eax
				.elseif d9 == 1050
								invoke StdOut,addr sub19
								mov unit28,'2'
								mov[unit28 + eax],0
								invoke StripLF,addr unit28
								invoke atodw,addr unit28
								add ebx,eax
				.elseif d9 == 1242 && d9 == 2172
								invoke StdOut,addr sub20
								invoke StdOut,addr sub21
								mov unit29,'3'
								mov[unit29 + eax],0
								invoke StripLF,addr unit29
								invoke atodw,addr unit29
								add ebx,eax
				.endif
				
				.if d10 == 2094    ;------------------------------------- Tenth output Subject -----------------------------
								invoke StdOut,addr sub11
								mov unit21,'3'
								mov[unit21 + eax],0
								invoke StripLF,addr unit21
								invoke atodw,addr unit21
								add ebx,eax
				.elseif d10 == 2268
								invoke StdOut,addr sub12
								mov unit22,'4'
								mov[unit22 + eax],0
								invoke StripLF,addr unit22
								invoke atodw,addr unit22
								add ebx,eax
				.elseif d10 == 1432
								invoke StdOut,addr sub13
								mov unit23,'2'
								mov[unit23 + eax],0
								invoke StripLF,addr unit23
								invoke atodw,addr unit23
								add ebx,eax
				.elseif d10 == 1433
								invoke StdOut,addr sub14
								mov unit24,'3'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d10 == 2028
								invoke StdOut,addr sub15
								mov unit24,'4'
								mov[unit24 + eax],0
								invoke StripLF,addr unit24
								invoke atodw,addr unit24
								add ebx,eax
				.elseif d10 == 2029
								invoke StdOut,addr sub16
								mov unit25,'1'
								mov[unit25 + eax],0
								invoke StripLF,addr unit25
								invoke atodw,addr unit25
								add ebx,eax
				.elseif d10 == 1083
								invoke StdOut,addr sub17
								mov unit26,'3'
								mov[unit26 + eax],0
								invoke StripLF,addr unit26
								invoke atodw,addr unit26
								add ebx,eax
				.elseif d10 == 1066
								invoke StdOut,addr sub18
								mov unit27,'3'
								mov[unit27 + eax],0
								invoke StripLF,addr unit27
								invoke atodw,addr unit27
								add ebx,eax
				.elseif d10 == 1050
								invoke StdOut,addr sub19
								mov unit28,'2'
								mov[unit28 + eax],0
								invoke StripLF,addr unit28
								invoke atodw,addr unit28
								add ebx,eax
				.elseif d10 == 1242 && d10 == 2172
								invoke StdOut,addr sub20
								invoke StdOut,addr sub21
								mov unit29,'3'
								mov[unit29 + eax],0
								invoke StripLF,addr unit29
								invoke atodw,addr unit29
								add ebx,eax
				.endif
				
				invoke dwtoa,ebx,addr total3
				invoke StdOut,addr space1
				invoke StdOut,addr total3
				
								
				invoke StdOut,addr list1
				invoke StdOut,addr user1
				invoke StdOut,addr user2
				invoke StdOut,addr user3
				invoke StdOut,addr user4
				invoke StdOut,addr user5
				
				ceeds: 
					invoke StdOut,addr proceed2
					invoke StdIn,addr ceed2,50
					.if ceed2 == 'Y' || ceed2 == 'y'
					jmp FirstYearSummer
					.elseif ceed2 == 'N' || ceed2 == 'n'
					jmp FirstYear
					.else
					jmp ceeds
					.endif			; ------------------------------ Second Semester End --------------------------
					
FirstYearSummer:					; ------------------------------ Summer  --------------------------------------
				invoke ClearScreen
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr firststudent
				invoke StdOut,addr Requisites
				invoke StdOut,addr output
				
				invoke StdOut,addr pre7
				invoke StdIn,addr spre10,50
				mov[spre10 + eax],0
				invoke StripLF,addr spre10
				invoke atodw,addr spre10
				mov spre10,eax
				
				invoke StdOut,addr pre8
				invoke StdIn,addr spre11,50
				mov[spre11 + eax],0
				invoke StripLF,addr spre11
				invoke atodw,addr spre11
				mov spre11,eax
				
				invoke ClearScreen
				mov default4,'0'
				mov [default4 + eax],0
				invoke StripLF,addr default4
				invoke atodw,addr default4
				mov ebx,eax
				
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr available1
				invoke StdOut,addr heads
				invoke StdOut,addr head5
				invoke StdOut,addr head6
				
				.if spre10 >=75 && spre10 <=100 && spre11 >=75 && spre11
				invoke StdOut,addr sub22
				mov unit32,'4'
				mov[unit32 + eax],0
				invoke StripLF,addr unit32
				invoke atodw,addr unit32
				add ebx,eax
				.endif
				
				invoke StdOut,addr sub23
				mov unit33,'3'
				mov [unit33 + eax],0
				invoke StripLF,addr unit33
				invoke atodw,addr unit33
				add ebx,eax
				
				invoke dwtoa,ebx,addr total4
				invoke StdOut,addr space1
				invoke StdOut,addr total4
				
				invoke StdOut,addr subj
				
		offer1sum: 							;--------------------------------First Input ------------------------
				invoke StdOut,addr ensub1
				invoke StdIn,addr e1,50
				mov[e1 + eax],0
				invoke StripLF,addr e1
				invoke atodw,addr e1
				mov f1,eax
				.if f1 == 1431 || f1 == 1288
				jmp ques1sum
				.else
				jmp offer1sum
				.endif
		ques1sum:
				invoke StdOut,addr display1
				invoke StdIn,addr dis20,50
				.if dis20 == 'Y' || dis20 == 'y'
				jmp offer2sum
				.elseif dis20 == 'N' || dis20 == 'n'
				jmp SubjectDisplay3
				.else
				jmp ques1sum
				.endif
				
		offer2sum: 							;--------------------------------Second Input ------------------------
				invoke StdOut,addr ensub2
				invoke StdIn,addr e2,50
				mov[e2 + eax],0
				invoke StripLF,addr e2
				invoke atodw,addr e2
				mov f2,eax
				.if f2 == 1431 || f2 == 1288
				jmp SubjectDisplay3
				.else
				jmp offer2s
				.endif
SubjectDisplay3:

					mov default5,'0'
					mov [default5 + eax],0
					invoke StripLF,addr default5
					invoke atodw,addr default5
					mov ebx,eax
			
					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr subj2
					invoke StdOut,addr heads
					invoke StdOut,addr head5
					invoke StdOut,addr head6
					
					
				.if f1 == 1431   ;----------------------------------First output Subject -----------------------------
								invoke StdOut,addr sub22
								mov unit34,'4'
								mov[unit34 + eax],0
								invoke StripLF,addr unit34
								invoke atodw,addr unit34
								add ebx,eax
				.elseif f1 == 1288
								invoke StdOut,addr sub23
								mov unit35,'3'
								mov[unit35 + eax],0
								invoke StripLF,addr unit35
								invoke atodw,addr unit35
								add ebx,eax
				.endif
				
				.if f2 == 1431   ;----------------------------------Second  output Subject -----------------------------
								invoke StdOut,addr sub22
								mov unit34,'4'
								mov[unit34 + eax],0
								invoke StripLF,addr unit34
								invoke atodw,addr unit34
								add ebx,eax
				.elseif f2 == 1288
								invoke StdOut,addr sub23
								mov unit35,'3'
								mov[unit35 + eax],0
								invoke StripLF,addr unit35
								invoke atodw,addr unit35
								add ebx,eax
				.endif
				
				invoke dwtoa,ebx,addr total5
				invoke StdOut,addr space1
				invoke StdOut,addr total5
								
				invoke StdOut,addr list1
				invoke StdOut,addr user1
				invoke StdOut,addr user2
				invoke StdOut,addr user3
				invoke StdOut,addr user4
				invoke StdOut,addr user5
				
				ceeds1: 
					invoke StdOut,addr proceed3
					invoke StdIn,addr ceed3,50
					.if ceed3 == 'Y' || ceed3 == 'y'
					jmp FirstYear
					.elseif ceed3 == 'N' || ceed3 == 'n'
					jmp Exit_
					.else
					jmp ceeds1
					.endif			; ------------------------------ Summer End -------------------------- FirstYear End ----------------------------------
					
					
SecondYear:									; ------------------------------ Second Year College -----------------------
			invoke ClearScreen
			invoke StdOut,addr header
			invoke StdOut,addr header2
			invoke StdOut,addr header3
			invoke StdOut,addr header4
			invoke StdOut,addr header5
			invoke StdOut,addr header6
			invoke StdOut,addr header7
			invoke StdOut,addr header8
			invoke StdOut,addr names
			invoke StdOut,addr name1
			invoke StdOut,addr down
			invoke StdOut,addr secondstudent
			invoke StdOut,addr sem1
			invoke StdOut,addr sem2
			invoke StdOut,addr sem3
			invoke StdOut,addr main
			invoke StdOut,addr yearlevel
			invoke StdIn,addr yearlevel2,50
		
			.if yearlevel2 == 'A' || yearlevel2 == 'a'
			invoke ClearScreen
			jmp SecondYearFirstSemester
			.elseif yearlevel2 == 'B' || yearlevel2 == 'b'
			invoke ClearScreen
			jmp SecondYearSecondSemester
			.elseif yearlevel2 == 'C' || yearlevel2 == 'c'
			invoke ClearScreen
			jmp SecondYearSecondSummer
			.elseif yearlevel2 == 'D' || yearlevel2 == 'd'
			jmp start
			.else 
			jmp SecondYear
			.endif


SecondYearFirstSemester:
					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr secondstudent
					invoke StdOut,addr Requisites
					invoke StdOut,addr output
														;----------------------Pre-Requisites Subjects -------------------
					invoke StdOut,addr pre9
					invoke StdIn,addr spre12,50
					mov[spre12 + eax],0
					invoke StripLF,addr spre12
					invoke atodw,addr spre12
					mov spre12,eax
				
					invoke StdOut,addr pre10
					invoke StdIn,addr spre13,50
					mov[spre13 + eax],0
					invoke StripLF,addr spre13
					invoke atodw,addr spre13
					mov spre13,eax
					
					invoke StdOut,addr pre11
					invoke StdIn,addr spre14,50
					mov[spre14 + eax],0
					invoke StripLF,addr spre14
					invoke atodw,addr spre14
					mov spre14,eax
					
					invoke StdOut,addr pre12
					invoke StdIn,addr spre15,50
					mov[spre15 + eax],0
					invoke StripLF,addr spre15
					invoke atodw,addr spre15
					mov spre15,eax
					
					invoke StdOut,addr pre13
					invoke StdIn,addr spre16,50
					mov[spre16 + eax],0
					invoke StripLF,addr spre16
					invoke atodw,addr spre16
					mov spre16,eax
					
					invoke StdOut,addr pre14
					invoke StdIn,addr spre17,50
					mov[spre17 + eax],0
					invoke StripLF,addr spre17
					invoke atodw,addr spre17
					mov spre17,eax
														;------------------------------SUBJECT DISPLAY ---------------------------------------
					invoke ClearScreen
					mov default6,'0'
					mov [default6 + eax],0
					invoke StripLF,addr default6
					invoke atodw,addr default6
					mov ebx,eax
					
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr available1
					invoke StdOut,addr heads
					invoke StdOut,addr head7
					invoke StdOut,addr head8
					
				.if spre12 >=75 && spre12 <=100 && spre13 >=75 && spre13
				invoke StdOut,addr sub24
				mov unit36,'4'
				mov[unit36 + eax],0
				invoke StripLF,addr unit36
				invoke atodw,addr unit36
				add ebx,eax
				.endif
				
				.if spre15 >=75 && spre15 <=100 && spre14 >=75 && spre14
				invoke StdOut,addr sub25
				mov unit36,'3'
				mov[unit36 + eax],0
				invoke StripLF,addr unit36
				invoke atodw,addr unit36
				add ebx,eax
				.endif
				
				invoke StdOut,addr sub26
				invoke StdOut,addr sub27
				mov unit37,'7'
				mov[unit37 + eax],0
				invoke StripLF,addr unit37
				invoke atodw,addr unit37
				add ebx,eax
				
				.if spre16 >=75 && spre16 <=100
				invoke StdOut,addr sub28
				mov unit38,'2'
				mov[unit38 + eax],0
				invoke StripLF,addr unit38
				invoke atodw,addr unit38
				add ebx,eax
				.endif
				
				.if spre17 >=75 && spre17 <=100
				invoke StdOut,addr sub29
				mov unit39,'3'
				mov[unit39 + eax],0
				invoke StripLF,addr unit39
				invoke atodw,addr unit39
				add ebx,eax
				.endif
				
				invoke StdOut,addr sub30
				invoke StdOut,addr sub31
				mov unit40,'6'
				mov[unit40 + eax],0
				invoke StripLF,addr unit40
				invoke atodw,addr unit40
				add ebx,eax
				
				invoke dwtoa,ebx,addr total6
				invoke StdOut,addr space1
				invoke StdOut,addr total6
				
				invoke StdOut,addr subj
				
		offer1sec: 								;--------------------------------First Input ------------------------
				invoke StdOut,addr ensub1
				invoke StdIn,addr g1,50
				mov[g1 + eax],0
				invoke StripLF,addr g1
				invoke atodw,addr g1
				mov h1,eax
				.if h1 == 1437 || h1 == 1439 || h1 == 1441 || h1 == 1133 || h1 == 2015 || h1 == 1025 || h1 == 1135 || h1 == 1062
				jmp ques1sec
				.else
				jmp offer1sec
				.endif
		ques1sec:
				invoke StdOut,addr display1
				invoke StdIn,addr dis22,50
				.if dis22 == 'Y' || dis22 == 'y'
				jmp offer2sec
				.elseif dis22 == 'N' || dis22 == 'n'
				jmp SubjectDisplay4
				.else
				jmp ques1sec
				.endif
				
		offer2sec: 								;--------------------------------Second Input ------------------------
				invoke StdOut,addr ensub2
				invoke StdIn,addr g2,50
				mov[g2 + eax],0
				invoke StripLF,addr g2
				invoke atodw,addr g2
				mov h2,eax
				.if h2 == 1437 || h2 == 1439 || h2 == 1441 || h2 == 1133 || h2 == 2015 || h2 == 1025 || h2 == 1135 || h2 == 1062
				jmp ques2sec
				.else
				jmp offer2sec
				.endif
		ques2sec:
				invoke StdOut,addr display1
				invoke StdIn,addr dis23,50
				.if dis23 == 'Y' || dis23 == 'y'
				jmp offer3sec
				.elseif dis23 == 'N' || dis23 == 'n'
				jmp SubjectDisplay4
				.else
				jmp ques2sec
				.endif
				
		offer3sec: 								;--------------------------------Third Input ------------------------
				invoke StdOut,addr ensub3
				invoke StdIn,addr g3,50
				mov[g3 + eax],0
				invoke StripLF,addr g3
				invoke atodw,addr g3
				mov h3,eax
				.if h3 == 1437 || h3 == 1439 || h3 == 1441 || h3 == 1133 || h3 == 2015 || h3 == 1025 || h3 == 1135 || h3 == 1062
				jmp ques3sec
				.else
				jmp offer3sec
				.endif
		ques3sec:
				invoke StdOut,addr display1
				invoke StdIn,addr dis24,50
				.if dis24 == 'Y' || dis24 == 'y'
				jmp offer4sec
				.elseif dis24 == 'N' || dis24 == 'n'
				jmp SubjectDisplay4
				.else
				jmp ques3sec
				.endif
		offer4sec: 								;--------------------------------Fourth Input ------------------------
				invoke StdOut,addr ensub4
				invoke StdIn,addr g4,50
				mov[g4 + eax],0
				invoke StripLF,addr g4
				invoke atodw,addr g4
				mov h4,eax
				.if h4 == 1437 || h4 == 1439 || h4 == 1441 || h4 == 1133 || h4 == 2015 || h4 == 1025 || h4 == 1135 || h4 == 1062
				jmp ques4sec
				.else
				jmp offer4sec
				.endif
		ques4sec:
				invoke StdOut,addr display1
				invoke StdIn,addr dis25,50
				.if dis25 == 'Y' || dis25 == 'y'
				jmp offer5sec
				.elseif dis25 == 'N' || dis25 == 'n'
				jmp SubjectDisplay4
				.else
				jmp ques4sec
				.endif
		
		offer5sec: 								;--------------------------------Fifth Input ------------------------
				invoke StdOut,addr ensub5
				invoke StdIn,addr g5,50
				mov[g5 + eax],0
				invoke StripLF,addr g5
				invoke atodw,addr g5
				mov h5,eax
				.if h5 == 1437 || h5 == 1439 || h5 == 1441 || h5 == 1133 || h5 == 2015 || h5 == 1025 || h5 == 1135 || h5 == 1062
				jmp ques5sec
				.else
				jmp offer5sec
				.endif
		ques5sec:
				invoke StdOut,addr display1
				invoke StdIn,addr dis26,50
				.if dis26 == 'Y' || dis26 == 'y'
				jmp offer6sec
				.elseif dis26 == 'N' || dis26 == 'n'
				jmp SubjectDisplay4
				.else
				jmp ques5sec
				.endif
				
		offer6sec: 								;--------------------------------Sixth Input ------------------------
				invoke StdOut,addr ensub6
				invoke StdIn,addr g6,50
				mov[g6 + eax],0
				invoke StripLF,addr g6
				invoke atodw,addr g6
				mov h6,eax
				.if h6 == 1437 || h6 == 1439 || h6 == 1441 || h6 == 1133 || h6 == 2015 || h6 == 1025 || h6 == 1135 || h6 == 1062
				jmp ques6sec
				.else
				jmp offer6sec
				.endif
		ques6sec:
				invoke StdOut,addr display1
				invoke StdIn,addr dis27,50
				.if dis27 == 'Y' || dis27 == 'y'
				jmp offer7sec
				.elseif dis27 == 'N' || dis27 == 'n'
				jmp SubjectDisplay4
				.else
				jmp ques6sec
				.endif
				
		offer7sec: 								;--------------------------------Seventh Input ------------------------
				invoke StdOut,addr ensub7
				invoke StdIn,addr g7,50
				mov[g7 + eax],0
				invoke StripLF,addr g7
				invoke atodw,addr g7
				mov h7,eax
				.if h7 == 1437 || h7 == 1439 || h7 == 1441 || h7 == 1133 || h7 == 2015 || h7 == 1025 || h7 == 1135 || h7 == 1062
				jmp ques7sec
				.else
				jmp offer7sec
				.endif
		ques7sec:
				invoke StdOut,addr display1
				invoke StdIn,addr dis28,50
				.if dis28 == 'Y' || dis28 == 'y'
				jmp offer8sec
				.elseif dis28 == 'N' || dis28 == 'n'
				jmp SubjectDisplay4
				.else
				jmp ques7sec
				.endif
				
		offer8sec: 								;--------------------------------Eigth Input ------------------------
				invoke StdOut,addr ensub8
				invoke StdIn,addr g8,50
				mov[g8 + eax],0
				invoke StripLF,addr g8
				invoke atodw,addr g8
				mov h8,eax
				.if h8 == 1437 || h8 == 1439 || h8 == 1441 || h8 == 1133 || h8 == 2015 || h8 == 1025 || h8 == 1135 || h8 == 1062
				jmp SubjectDisplay4
				.else
				jmp offer8sec
				.endif		
SubjectDisplay4:

					mov default7,'0'
					mov [default7 + eax],0
					invoke StripLF,addr default7
					invoke atodw,addr default7
					mov ebx,eax
			
					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr subj2
					invoke StdOut,addr heads
					invoke StdOut,addr head7
					invoke StdOut,addr head8
					
			.if h1 == 1437   ;----------------------------------First output Subject -----------------------------
								invoke StdOut,addr sub24
								mov unit44,'4'
								mov[unit44 + eax],0
								invoke StripLF,addr unit44
								invoke atodw,addr unit44
								add ebx,eax
			.elseif h1 == 1439 
								invoke StdOut,addr sub25
								mov unit45,'3'
								mov[unit45 + eax],0
								invoke StripLF,addr unit45
								invoke atodw,addr unit45
								add ebx,eax
			.elseif h1 == 1441 
								invoke StdOut,addr sub26
								mov unit46,'4'
								mov[unit46 + eax],0
								invoke StripLF,addr unit46
								invoke atodw,addr unit46
								add ebx,eax
			.elseif h1 == 1133 
								invoke StdOut,addr sub27
								mov unit47,'3'
								mov[unit47 + eax],0
								invoke StripLF,addr unit47
								invoke atodw,addr unit47
								add ebx,eax
			.elseif h1 == 2015 
								invoke StdOut,addr sub28
								mov unit48,'2'
								mov[unit48 + eax],0
								invoke StripLF,addr unit48
								invoke atodw,addr unit48
								add ebx,eax
			.elseif h1 == 1025 
								invoke StdOut,addr sub29
								mov unit49,'3'
								mov[unit49 + eax],0
								invoke StripLF,addr unit49
								invoke atodw,addr unit49
								add ebx,eax
			.elseif h1 == 1135 
								invoke StdOut,addr sub30
								mov unit50,'3'
								mov[unit50 + eax],0
								invoke StripLF,addr unit50
								invoke atodw,addr unit50
								add ebx,eax
			.elseif h1 == 1062 
								invoke StdOut,addr sub31
								mov unit51,'3'
								mov[unit51 + eax],0
								invoke StripLF,addr unit51
								invoke atodw,addr unit51
								add ebx,eax
			.endif
			
			.if h2 == 1437   ;----------------------------------Second output Subject -----------------------------
								invoke StdOut,addr sub24
								mov unit44,'4'
								mov[unit44 + eax],0
								invoke StripLF,addr unit44
								invoke atodw,addr unit44
								add ebx,eax
			.elseif h2 == 1439 
								invoke StdOut,addr sub25
								mov unit45,'3'
								mov[unit45 + eax],0
								invoke StripLF,addr unit45
								invoke atodw,addr unit45
								add ebx,eax
			.elseif h2 == 1441 
								invoke StdOut,addr sub26
								mov unit46,'4'
								mov[unit46 + eax],0
								invoke StripLF,addr unit46
								invoke atodw,addr unit46
								add ebx,eax
			.elseif h2 == 1133 
								invoke StdOut,addr sub27
								mov unit47,'3'
								mov[unit47 + eax],0
								invoke StripLF,addr unit47
								invoke atodw,addr unit47
								add ebx,eax
			.elseif h2 == 2015 
								invoke StdOut,addr sub28
								mov unit48,'2'
								mov[unit48 + eax],0
								invoke StripLF,addr unit48
								invoke atodw,addr unit48
								add ebx,eax
			.elseif h2 == 1025 
								invoke StdOut,addr sub29
								mov unit49,'3'
								mov[unit49 + eax],0
								invoke StripLF,addr unit49
								invoke atodw,addr unit49
								add ebx,eax
			.elseif h2 == 1135 
								invoke StdOut,addr sub30
								mov unit50,'3'
								mov[unit50 + eax],0
								invoke StripLF,addr unit50
								invoke atodw,addr unit50
								add ebx,eax
			.elseif h2 == 1062 
								invoke StdOut,addr sub31
								mov unit51,'3'
								mov[unit51 + eax],0
								invoke StripLF,addr unit51
								invoke atodw,addr unit51
								add ebx,eax
			.endif
			
			.if h3 == 1437   ;----------------------------------Third output Subject -----------------------------
								invoke StdOut,addr sub24
								mov unit44,'4'
								mov[unit44 + eax],0
								invoke StripLF,addr unit44
								invoke atodw,addr unit44
								add ebx,eax
			.elseif h3 == 1439 
								invoke StdOut,addr sub25
								mov unit45,'3'
								mov[unit45 + eax],0
								invoke StripLF,addr unit45
								invoke atodw,addr unit45
								add ebx,eax
			.elseif h3 == 1441 
								invoke StdOut,addr sub26
								mov unit46,'4'
								mov[unit46 + eax],0
								invoke StripLF,addr unit46
								invoke atodw,addr unit46
								add ebx,eax
			.elseif h3 == 1133 
								invoke StdOut,addr sub27
								mov unit47,'3'
								mov[unit47 + eax],0
								invoke StripLF,addr unit47
								invoke atodw,addr unit47
								add ebx,eax
			.elseif h3 == 2015 
								invoke StdOut,addr sub28
								mov unit48,'2'
								mov[unit48 + eax],0
								invoke StripLF,addr unit48
								invoke atodw,addr unit48
								add ebx,eax
			.elseif h3 == 1025 
								invoke StdOut,addr sub29
								mov unit49,'3'
								mov[unit49 + eax],0
								invoke StripLF,addr unit49
								invoke atodw,addr unit49
								add ebx,eax
			.elseif h3 == 1135 
								invoke StdOut,addr sub30
								mov unit50,'3'
								mov[unit50 + eax],0
								invoke StripLF,addr unit50
								invoke atodw,addr unit50
								add ebx,eax
			.elseif h3 == 1062 
								invoke StdOut,addr sub31
								mov unit51,'3'
								mov[unit51 + eax],0
								invoke StripLF,addr unit51
								invoke atodw,addr unit51
								add ebx,eax
			.endif
			
			.if h4 == 1437   ;----------------------------------Fourth output Subject -----------------------------
								invoke StdOut,addr sub24
								mov unit44,'4'
								mov[unit44 + eax],0
								invoke StripLF,addr unit44
								invoke atodw,addr unit44
								add ebx,eax
			.elseif h4 == 1439 
								invoke StdOut,addr sub25
								mov unit45,'3'
								mov[unit45 + eax],0
								invoke StripLF,addr unit45
								invoke atodw,addr unit45
								add ebx,eax
			.elseif h4 == 1441 
								invoke StdOut,addr sub26
								mov unit46,'4'
								mov[unit46 + eax],0
								invoke StripLF,addr unit46
								invoke atodw,addr unit46
								add ebx,eax
			.elseif h4 == 1133 
								invoke StdOut,addr sub27
								mov unit47,'3'
								mov[unit47 + eax],0
								invoke StripLF,addr unit47
								invoke atodw,addr unit47
								add ebx,eax
			.elseif h4 == 2015 
								invoke StdOut,addr sub28
								mov unit48,'2'
								mov[unit48 + eax],0
								invoke StripLF,addr unit48
								invoke atodw,addr unit48
								add ebx,eax
			.elseif h4 == 1025 
								invoke StdOut,addr sub29
								mov unit49,'3'
								mov[unit49 + eax],0
								invoke StripLF,addr unit49
								invoke atodw,addr unit49
								add ebx,eax
			.elseif h4 == 1135 
								invoke StdOut,addr sub30
								mov unit50,'3'
								mov[unit50 + eax],0
								invoke StripLF,addr unit50
								invoke atodw,addr unit50
								add ebx,eax
			.elseif h4 == 1062 
								invoke StdOut,addr sub31
								mov unit51,'3'
								mov[unit51 + eax],0
								invoke StripLF,addr unit51
								invoke atodw,addr unit51
								add ebx,eax
			.endif
			
			.if h5 == 1437   ;----------------------------------Fifth output Subject -----------------------------
								invoke StdOut,addr sub24
								mov unit44,'4'
								mov[unit44 + eax],0
								invoke StripLF,addr unit44
								invoke atodw,addr unit44
								add ebx,eax
			.elseif h5 == 1439 
								invoke StdOut,addr sub25
								mov unit45,'3'
								mov[unit45 + eax],0
								invoke StripLF,addr unit45
								invoke atodw,addr unit45
								add ebx,eax
			.elseif h5 == 1441 
								invoke StdOut,addr sub26
								mov unit46,'4'
								mov[unit46 + eax],0
								invoke StripLF,addr unit46
								invoke atodw,addr unit46
								add ebx,eax
			.elseif h5 == 1133 
								invoke StdOut,addr sub27
								mov unit47,'3'
								mov[unit47 + eax],0
								invoke StripLF,addr unit47
								invoke atodw,addr unit47
								add ebx,eax
			.elseif h5 == 2015 
								invoke StdOut,addr sub28
								mov unit48,'2'
								mov[unit48 + eax],0
								invoke StripLF,addr unit48
								invoke atodw,addr unit48
								add ebx,eax
			.elseif h5 == 1025 
								invoke StdOut,addr sub29
								mov unit49,'3'
								mov[unit49 + eax],0
								invoke StripLF,addr unit49
								invoke atodw,addr unit49
								add ebx,eax
			.elseif h5 == 1135 
								invoke StdOut,addr sub30
								mov unit50,'3'
								mov[unit50 + eax],0
								invoke StripLF,addr unit50
								invoke atodw,addr unit50
								add ebx,eax
			.elseif h5 == 1062 
								invoke StdOut,addr sub31
								mov unit51,'3'
								mov[unit51 + eax],0
								invoke StripLF,addr unit51
								invoke atodw,addr unit51
								add ebx,eax
			.endif
			
			.if h6 == 1437   ;----------------------------------Sixth output Subject -----------------------------
								invoke StdOut,addr sub24
								mov unit44,'4'
								mov[unit44 + eax],0
								invoke StripLF,addr unit44
								invoke atodw,addr unit44
								add ebx,eax
			.elseif h6 == 1439 
								invoke StdOut,addr sub25
								mov unit45,'3'
								mov[unit45 + eax],0
								invoke StripLF,addr unit45
								invoke atodw,addr unit45
								add ebx,eax
			.elseif h6 == 1441 
								invoke StdOut,addr sub26
								mov unit46,'4'
								mov[unit46 + eax],0
								invoke StripLF,addr unit46
								invoke atodw,addr unit46
								add ebx,eax
			.elseif h6 == 1133 
								invoke StdOut,addr sub27
								mov unit47,'3'
								mov[unit47 + eax],0
								invoke StripLF,addr unit47
								invoke atodw,addr unit47
								add ebx,eax
			.elseif h6 == 2015 
								invoke StdOut,addr sub28
								mov unit48,'2'
								mov[unit48 + eax],0
								invoke StripLF,addr unit48
								invoke atodw,addr unit48
								add ebx,eax
			.elseif h6 == 1025 
								invoke StdOut,addr sub29
								mov unit49,'3'
								mov[unit49 + eax],0
								invoke StripLF,addr unit49
								invoke atodw,addr unit49
								add ebx,eax
			.elseif h6 == 1135 
								invoke StdOut,addr sub30
								mov unit50,'3'
								mov[unit50 + eax],0
								invoke StripLF,addr unit50
								invoke atodw,addr unit50
								add ebx,eax
			.elseif h6 == 1062 
								invoke StdOut,addr sub31
								mov unit51,'3'
								mov[unit51 + eax],0
								invoke StripLF,addr unit51
								invoke atodw,addr unit51
								add ebx,eax
			.endif
			
			.if h7 == 1437   ;----------------------------------Seventh output Subject -----------------------------
								invoke StdOut,addr sub24
								mov unit44,'4'
								mov[unit44 + eax],0
								invoke StripLF,addr unit44
								invoke atodw,addr unit44
								add ebx,eax
			.elseif h7 == 1439 
								invoke StdOut,addr sub25
								mov unit45,'3'
								mov[unit45 + eax],0
								invoke StripLF,addr unit45
								invoke atodw,addr unit45
								add ebx,eax
			.elseif h7 == 1441 
								invoke StdOut,addr sub26
								mov unit46,'4'
								mov[unit46 + eax],0
								invoke StripLF,addr unit46
								invoke atodw,addr unit46
								add ebx,eax
			.elseif h7 == 1133 
								invoke StdOut,addr sub27
								mov unit47,'3'
								mov[unit47 + eax],0
								invoke StripLF,addr unit47
								invoke atodw,addr unit47
								add ebx,eax
			.elseif h7 == 2015 
								invoke StdOut,addr sub28
								mov unit48,'2'
								mov[unit48 + eax],0
								invoke StripLF,addr unit48
								invoke atodw,addr unit48
								add ebx,eax
			.elseif h7 == 1025 
								invoke StdOut,addr sub29
								mov unit49,'3'
								mov[unit49 + eax],0
								invoke StripLF,addr unit49
								invoke atodw,addr unit49
								add ebx,eax
			.elseif h7 == 1135 
								invoke StdOut,addr sub30
								mov unit50,'3'
								mov[unit50 + eax],0
								invoke StripLF,addr unit50
								invoke atodw,addr unit50
								add ebx,eax
			.elseif h7 == 1062 
								invoke StdOut,addr sub31
								mov unit51,'3'
								mov[unit51 + eax],0
								invoke StripLF,addr unit51
								invoke atodw,addr unit51
								add ebx,eax
			.endif
			
			.if h8 == 1437   ;----------------------------------Eight output Subject -----------------------------
								invoke StdOut,addr sub24
								mov unit44,'4'
								mov[unit44 + eax],0
								invoke StripLF,addr unit44
								invoke atodw,addr unit44
								add ebx,eax
			.elseif h8 == 1439 
								invoke StdOut,addr sub25
								mov unit45,'3'
								mov[unit45 + eax],0
								invoke StripLF,addr unit45
								invoke atodw,addr unit45
								add ebx,eax
			.elseif h8 == 1441 
								invoke StdOut,addr sub26
								mov unit46,'4'
								mov[unit46 + eax],0
								invoke StripLF,addr unit46
								invoke atodw,addr unit46
								add ebx,eax
			.elseif h8 == 1133 
								invoke StdOut,addr sub27
								mov unit47,'3'
								mov[unit47 + eax],0
								invoke StripLF,addr unit47
								invoke atodw,addr unit47
								add ebx,eax
			.elseif h8 == 2015 
								invoke StdOut,addr sub28
								mov unit48,'2'
								mov[unit48 + eax],0
								invoke StripLF,addr unit48
								invoke atodw,addr unit48
								add ebx,eax
			.elseif h8 == 1025 
								invoke StdOut,addr sub29
								mov unit49,'3'
								mov[unit49 + eax],0
								invoke StripLF,addr unit49
								invoke atodw,addr unit49
								add ebx,eax
			.elseif h8 == 1135 
								invoke StdOut,addr sub30
								mov unit50,'3'
								mov[unit50 + eax],0
								invoke StripLF,addr unit50
								invoke atodw,addr unit50
								add ebx,eax
			.elseif h8 == 1062 
								invoke StdOut,addr sub31
								mov unit51,'3'
								mov[unit51 + eax],0
								invoke StripLF,addr unit51
								invoke atodw,addr unit51
								add ebx,eax
			.endif
			
			invoke dwtoa,ebx,addr total7
			invoke StdOut,addr space1
			invoke StdOut,addr total7
							
				invoke StdOut,addr list1
				invoke StdOut,addr user1
				invoke StdOut,addr user2
				invoke StdOut,addr user3
				invoke StdOut,addr user4
				invoke StdOut,addr user5
				
			ceeds2: 
					invoke StdOut,addr proceed1
					invoke StdIn,addr ceed4,50
					.if ceed4 == 'Y' || ceed4 == 'y'
					jmp SecondYearSecondSemester
					.elseif ceed4 == 'N' || ceed4 == 'n'
					jmp SecondYear
					.else
					jmp ceeds2
					.endif					;----------------------- First SEMESTER end --------------------------
					
SecondYearSecondSemester:
					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr secondstudent
					invoke StdOut,addr Requisites
					invoke StdOut,addr output
												;-----------------* Pre-Requisites SUBJECTS *------------------------------------
					invoke StdOut,addr pre15				
					invoke StdIn,addr spre18,50
					mov[spre18 + eax],0
					invoke StripLF,addr spre18
					invoke atodw,addr spre18
					mov spre18,eax
				
					invoke StdOut,addr pre16
					invoke StdIn,addr spre19,50
					mov[spre19 + eax],0
					invoke StripLF,addr spre19
					invoke atodw,addr spre19
					mov spre19,eax
					
					invoke StdOut,addr pre17
					invoke StdIn,addr spre20,50
					mov[spre20 + eax],0
					invoke StripLF,addr spre20
					invoke atodw,addr spre20
					mov spre20,eax
					
					invoke StdOut,addr pre18
					invoke StdIn,addr spre21,50
					mov[spre21 + eax],0
					invoke StripLF,addr spre21
					invoke atodw,addr spre21
					mov spre21,eax
					
					invoke StdOut,addr pre19
					invoke StdIn,addr spre22,50
					mov[spre22 + eax],0
					invoke StripLF,addr spre22
					invoke atodw,addr spre22
					mov spre22,eax
					
					invoke StdOut,addr pre20
					invoke StdIn,addr spre23,50
					mov[spre23 + eax],0
					invoke StripLF,addr spre23
					invoke atodw,addr spre23
					mov spre23,eax
													;-----------------* SUBJECTS DISPLAY *------------------------------------
					invoke ClearScreen
					mov default8,'0'
					mov [default8 + eax],0
					invoke StripLF,addr default8
					invoke atodw,addr default8
					mov ebx,eax
					
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr available1
					invoke StdOut,addr heads
					invoke StdOut,addr head9
					invoke StdOut,addr head10
					
				.if spre18 >=75 && spre18 <=100
				invoke StdOut,addr sub32
				mov unit52,'4'
				mov[unit52 + eax],0
				invoke StripLF,addr unit52
				invoke atodw,addr unit52
				add ebx,eax
				.endif
				
				invoke StdOut,addr sub33
				mov unit53,'3'
				mov[unit53 + eax],0
				invoke StripLF,addr unit53
				invoke atodw,addr unit53
				add ebx,eax
				
				.if spre19 >=75 && spre19 <=100
				invoke StdOut,addr sub34
				mov unit54,'3'
				mov[unit54 + eax],0
				invoke StripLF,addr unit54
				invoke atodw,addr unit54
				add ebx,eax
				.endif
				
				.if spre20 >=75 && spre20 <=100
				invoke StdOut,addr sub35
				mov unit55,'2'
				mov[unit55 + eax],0
				invoke StripLF,addr unit55
				invoke atodw,addr unit55
				add ebx,eax
				.endif
				
				.if spre21 >=75 && spre21 <=100
				invoke StdOut,addr sub36
				mov unit56,'3'
				mov[unit56 + eax],0
				invoke StripLF,addr unit56
				invoke atodw,addr unit56
				add ebx,eax
				.endif
				
				invoke StdOut,addr sub37
				mov unit57,'3'
				mov[unit57 + eax],0
				invoke StripLF,addr unit57
				invoke atodw,addr unit57
				add ebx,eax
				
				.if spre22 >=75 && spre22 <=100
				invoke StdOut,addr sub36
				mov unit58,'3'
				mov[unit58 + eax],0
				invoke StripLF,addr unit58
				invoke atodw,addr unit58
				add ebx,eax
				.endif
				
				.if spre22 >=75 && spre22 <=100 && spre23 >=75 && spre23 <=100
				invoke StdOut,addr sub37
				mov unit59,'4'
				mov[unit59 + eax],0
				invoke StripLF,addr unit59
				invoke atodw,addr unit59
				add ebx,eax
				.endif
				
				invoke dwtoa,ebx,addr total8
				invoke StdOut,addr space1
				invoke StdOut,addr total8
				
				invoke StdOut,addr subj
				
		offer1sec2: 								;--------------------------------First Input ------------------------
				invoke StdOut,addr ensub1
				invoke StdIn,addr i1,50
				mov[i1 + eax],0
				invoke StripLF,addr i1
				invoke atodw,addr i1
				mov j1,eax
				.if j1 == 1438 || j1 == 1975 || j1 == 1570 || j1 == 1051 || j1 == 1442 || j1 == 1256 || j1 == 1041 || j1 == 1449
				jmp ques1sec2
				.else
				jmp offer1sec2
				.endif
		ques1sec2:
				invoke StdOut,addr display1
				invoke StdIn,addr dis30,50
				.if dis30 == 'Y' || dis30 == 'y'
				jmp offer2sec2
				.elseif dis30 == 'N' || dis30 == 'n'
				jmp SubjectDisplay5
				.else
				jmp ques1sec2
				.endif
				
		offer2sec2: 								;--------------------------------Second Input ------------------------
				invoke StdOut,addr ensub2
				invoke StdIn,addr i2,50
				mov[i2 + eax],0
				invoke StripLF,addr i2
				invoke atodw,addr i2
				mov j2,eax
				.if j2 == 1438 || j2 == 1975 || j2 == 1570 || j2 == 1051 || j2 == 1442 || j2 == 1256 || j2 == 1041 || j2 == 1449
				jmp ques2sec2
				.else
				jmp offer2sec2
				.endif
		ques2sec2:
				invoke StdOut,addr display1
				invoke StdIn,addr dis31,50
				.if dis31 == 'Y' || dis31 == 'y'
				jmp offer3sec2
				.elseif dis31 == 'N' || dis31 == 'n'
				jmp SubjectDisplay5
				.else
				jmp ques2sec2
				.endif
		
		offer3sec2: 								;--------------------------------Third Input ------------------------
				invoke StdOut,addr ensub3
				invoke StdIn,addr i3,50
				mov[i3 + eax],0
				invoke StripLF,addr i3
				invoke atodw,addr i3
				mov j3,eax
				.if j3 == 1438 || j3 == 1975 || j3 == 1570 || j3 == 1051 || j3 == 1442 || j3 == 1256 || j3 == 1041 || j3 == 1449
				jmp ques3sec2
				.else
				jmp offer3sec2
				.endif
		ques3sec2:
				invoke StdOut,addr display1
				invoke StdIn,addr dis32,50
				.if dis32 == 'Y' || dis32 == 'y'
				jmp offer4sec2
				.elseif dis32 == 'N' || dis32 == 'n'
				jmp SubjectDisplay5
				.else
				jmp ques3sec2
				.endif
		
		offer4sec2: 								;--------------------------------Fourth Input ------------------------
				invoke StdOut,addr ensub4
				invoke StdIn,addr i4,50
				mov[i4 + eax],0
				invoke StripLF,addr i4
				invoke atodw,addr i4
				mov j4,eax
				.if j4 == 1438 || j4 == 1975 || j4 == 1570 || j4 == 1051 || j4 == 1442 || j4 == 1256 || j4 == 1041 || j4 == 1449
				jmp ques4sec2
				.else
				jmp offer4sec2
				.endif
		ques4sec2:
				invoke StdOut,addr display1
				invoke StdIn,addr dis33,50
				.if dis33 == 'Y' || dis33 == 'y'
				jmp offer5sec2
				.elseif dis33 == 'N' || dis33 == 'n'
				jmp SubjectDisplay5
				.else
				jmp ques4sec2
				.endif
		
		offer5sec2: 								;--------------------------------Fifth Input ------------------------
				invoke StdOut,addr ensub5
				invoke StdIn,addr i5,50
				mov[i5 + eax],0
				invoke StripLF,addr i5
				invoke atodw,addr i5
				mov j5,eax
				.if j5 == 1438 || j5 == 1975 || j5 == 1570 || j5 == 1051 || j5 == 1442 || j5 == 1256 || j5 == 1041 || j5 == 1449
				jmp ques5sec2
				.else
				jmp offer5sec2
				.endif
		ques5sec2:
				invoke StdOut,addr display1
				invoke StdIn,addr dis34,50
				.if dis34 == 'Y' || dis34 == 'y'
				jmp offer6sec2
				.elseif dis34 == 'N' || dis34 == 'n'
				jmp SubjectDisplay5
				.else
				jmp ques5sec2
				.endif
				
		offer6sec2: 								;--------------------------------Sixth Input ------------------------
				invoke StdOut,addr ensub6
				invoke StdIn,addr i6,50
				mov[i6 + eax],0
				invoke StripLF,addr i6
				invoke atodw,addr i6
				mov j6,eax
				.if j6 == 1438 || j6 == 1975 || j6 == 1570 || j6 == 1051 || j6 == 1442 || j6 == 1256 || j6 == 1041 || j6 == 1449
				jmp ques6sec2
				.else
				jmp offer6sec2
				.endif
		ques6sec2:
				invoke StdOut,addr display1
				invoke StdIn,addr dis35,50
				.if dis35 == 'Y' || dis35 == 'y'
				jmp offer7sec2
				.elseif dis35 == 'N' || dis35 == 'n'
				jmp SubjectDisplay5
				.else
				jmp ques6sec2
				.endif
				
		offer7sec2: 								;--------------------------------Seventh Input ------------------------
				invoke StdOut,addr ensub7
				invoke StdIn,addr i7,50
				mov[i7 + eax],0
				invoke StripLF,addr i7
				invoke atodw,addr i7
				mov j7,eax
				.if j7 == 1438 || j7 == 1975 || j7 == 1570 || j7 == 1051 || j7 == 1442 || j7 == 1256 || j7 == 1041 || j7 == 1449
				jmp ques7sec2
				.else
				jmp offer7sec2
				.endif
		ques7sec2:
				invoke StdOut,addr display1
				invoke StdIn,addr dis36,50
				.if dis36 == 'Y' || dis36 == 'y'
				jmp offer8sec2
				.elseif dis36 == 'N' || dis36 == 'n'
				jmp SubjectDisplay5
				.else
				jmp ques6sec2
				.endif
		
		offer8sec2: 								;--------------------------------Eight Input ------------------------
				invoke StdOut,addr ensub8
				invoke StdIn,addr i8,50
				mov[i8 + eax],0
				invoke StripLF,addr i8
				invoke atodw,addr i8
				mov j8,eax
				.if j8 == 1438 || j8 == 1975 || j8 == 1570 || j8 == 1051 || j8 == 1442 || j8 == 1256 || j8 == 1041 || j8 == 1449
				jmp SubjectDisplay5
				.else
				jmp offer8sec2
				.endif
SubjectDisplay5:
			
					mov default9,'0'
					mov [default7 + eax],0
					invoke StripLF,addr default7
					invoke atodw,addr default7
					mov ebx,eax
			
					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr subj2
					invoke StdOut,addr heads
					invoke StdOut,addr head9
					invoke StdOut,addr head10
					
			.if j1 == 1438   ;----------------------------------First output Subject -----------------------------
								invoke StdOut,addr sub32
								mov unit60,'4'
								mov[unit60 + eax],0
								invoke StripLF,addr unit60
								invoke atodw,addr unit60
								add ebx,eax
			.elseif j1 == 1975 
								invoke StdOut,addr sub33
								mov unit61,'3'
								mov[unit61 + eax],0
								invoke StripLF,addr unit61
								invoke atodw,addr unit61
								add ebx,eax
			.elseif j1 == 1570 
								invoke StdOut,addr sub34
								mov unit62,'3'
								mov[unit62 + eax],0
								invoke StripLF,addr unit62
								invoke atodw,addr unit62
								add ebx,eax
			.elseif j1 == 1051 
								invoke StdOut,addr sub35
								mov unit63,'2'
								mov[unit63 + eax],0
								invoke StripLF,addr unit63
								invoke atodw,addr unit63
								add ebx,eax
			.elseif j1 == 1442 
								invoke StdOut,addr sub36
								mov unit64,'3'
								mov[unit64 + eax],0
								invoke StripLF,addr unit64
								invoke atodw,addr unit64
								add ebx,eax
			.elseif j1 == 1256 
								invoke StdOut,addr sub37
								mov unit65,'3'
								mov[unit65 + eax],0
								invoke StripLF,addr unit65
								invoke atodw,addr unit65
								add ebx,eax
			.elseif j1 == 1041 
								invoke StdOut,addr sub38
								mov unit66,'3'
								mov[unit66 + eax],0
								invoke StripLF,addr unit66
								invoke atodw,addr unit66
								add ebx,eax
			.elseif j1 == 1449 
								invoke StdOut,addr sub39
								mov unit67,'4'
								mov[unit67 + eax],0
								invoke StripLF,addr unit67
								invoke atodw,addr unit67
								add ebx,eax
			.endif
			
			.if j2 == 1438   ;----------------------------------Second output Subject -----------------------------
								invoke StdOut,addr sub32
								mov unit60,'4'
								mov[unit60 + eax],0
								invoke StripLF,addr unit60
								invoke atodw,addr unit60
								add ebx,eax
			.elseif j2 == 1975 
								invoke StdOut,addr sub33
								mov unit61,'3'
								mov[unit61 + eax],0
								invoke StripLF,addr unit61
								invoke atodw,addr unit61
								add ebx,eax
			.elseif j2 == 1570 
								invoke StdOut,addr sub34
								mov unit62,'3'
								mov[unit62 + eax],0
								invoke StripLF,addr unit62
								invoke atodw,addr unit62
								add ebx,eax
			.elseif j2 == 1051 
								invoke StdOut,addr sub35
								mov unit63,'2'
								mov[unit63 + eax],0
								invoke StripLF,addr unit63
								invoke atodw,addr unit63
								add ebx,eax
			.elseif j2 == 1442 
								invoke StdOut,addr sub36
								mov unit64,'3'
								mov[unit64 + eax],0
								invoke StripLF,addr unit64
								invoke atodw,addr unit64
								add ebx,eax
			.elseif j2 == 1256 
								invoke StdOut,addr sub37
								mov unit65,'3'
								mov[unit65 + eax],0
								invoke StripLF,addr unit65
								invoke atodw,addr unit65
								add ebx,eax
			.elseif j2 == 1041 
								invoke StdOut,addr sub38
								mov unit66,'3'
								mov[unit66 + eax],0
								invoke StripLF,addr unit66
								invoke atodw,addr unit66
								add ebx,eax
			.elseif j2 == 1449 
								invoke StdOut,addr sub39
								mov unit67,'4'
								mov[unit67 + eax],0
								invoke StripLF,addr unit67
								invoke atodw,addr unit67
								add ebx,eax
			.endif
			
			.if j3 == 1438   ;----------------------------------Third output Subject -----------------------------
								invoke StdOut,addr sub32
								mov unit60,'4'
								mov[unit60 + eax],0
								invoke StripLF,addr unit60
								invoke atodw,addr unit60
								add ebx,eax
			.elseif j3 == 1975 
								invoke StdOut,addr sub33
								mov unit61,'3'
								mov[unit61 + eax],0
								invoke StripLF,addr unit61
								invoke atodw,addr unit61
								add ebx,eax
			.elseif j3 == 1570 
								invoke StdOut,addr sub34
								mov unit62,'3'
								mov[unit62 + eax],0
								invoke StripLF,addr unit62
								invoke atodw,addr unit62
								add ebx,eax
			.elseif j3 == 1051 
								invoke StdOut,addr sub35
								mov unit63,'2'
								mov[unit63 + eax],0
								invoke StripLF,addr unit63
								invoke atodw,addr unit63
								add ebx,eax
			.elseif j3 == 1442 
								invoke StdOut,addr sub36
								mov unit64,'3'
								mov[unit64 + eax],0
								invoke StripLF,addr unit64
								invoke atodw,addr unit64
								add ebx,eax
			.elseif j3 == 1256 
								invoke StdOut,addr sub37
								mov unit65,'3'
								mov[unit65 + eax],0
								invoke StripLF,addr unit65
								invoke atodw,addr unit65
								add ebx,eax
			.elseif j3 == 1041 
								invoke StdOut,addr sub38
								mov unit66,'3'
								mov[unit66 + eax],0
								invoke StripLF,addr unit66
								invoke atodw,addr unit66
								add ebx,eax
			.elseif j3 == 1449 
								invoke StdOut,addr sub39
								mov unit67,'4'
								mov[unit67 + eax],0
								invoke StripLF,addr unit67
								invoke atodw,addr unit67
								add ebx,eax
			.endif
			
			.if j4 == 1438   ;----------------------------------Fourth output Subject -----------------------------
								invoke StdOut,addr sub32
								mov unit60,'4'
								mov[unit60 + eax],0
								invoke StripLF,addr unit60
								invoke atodw,addr unit60
								add ebx,eax
			.elseif j4 == 1975 
								invoke StdOut,addr sub33
								mov unit61,'3'
								mov[unit61 + eax],0
								invoke StripLF,addr unit61
								invoke atodw,addr unit61
								add ebx,eax
			.elseif j4 == 1570 
								invoke StdOut,addr sub34
								mov unit62,'3'
								mov[unit62 + eax],0
								invoke StripLF,addr unit62
								invoke atodw,addr unit62
								add ebx,eax
			.elseif j4 == 1051 
								invoke StdOut,addr sub35
								mov unit63,'2'
								mov[unit63 + eax],0
								invoke StripLF,addr unit63
								invoke atodw,addr unit63
								add ebx,eax
			.elseif j4 == 1442 
								invoke StdOut,addr sub36
								mov unit64,'3'
								mov[unit64 + eax],0
								invoke StripLF,addr unit64
								invoke atodw,addr unit64
								add ebx,eax
			.elseif j4 == 1256 
								invoke StdOut,addr sub37
								mov unit65,'3'
								mov[unit65 + eax],0
								invoke StripLF,addr unit65
								invoke atodw,addr unit65
								add ebx,eax
			.elseif j4 == 1041 
								invoke StdOut,addr sub38
								mov unit66,'3'
								mov[unit66 + eax],0
								invoke StripLF,addr unit66
								invoke atodw,addr unit66
								add ebx,eax
			.elseif j4 == 1449 
								invoke StdOut,addr sub39
								mov unit67,'4'
								mov[unit67 + eax],0
								invoke StripLF,addr unit67
								invoke atodw,addr unit67
								add ebx,eax
			.endif
			
			.if j5 == 1438   ;----------------------------------Fifth output Subject -----------------------------
								invoke StdOut,addr sub32
								mov unit60,'4'
								mov[unit60 + eax],0
								invoke StripLF,addr unit60
								invoke atodw,addr unit60
								add ebx,eax
			.elseif j5 == 1975 
								invoke StdOut,addr sub33
								mov unit61,'3'
								mov[unit61 + eax],0
								invoke StripLF,addr unit61
								invoke atodw,addr unit61
								add ebx,eax
			.elseif j5== 1570 
								invoke StdOut,addr sub34
								mov unit62,'3'
								mov[unit62 + eax],0
								invoke StripLF,addr unit62
								invoke atodw,addr unit62
								add ebx,eax
			.elseif j5 == 1051 
								invoke StdOut,addr sub35
								mov unit63,'2'
								mov[unit63 + eax],0
								invoke StripLF,addr unit63
								invoke atodw,addr unit63
								add ebx,eax
			.elseif j5 == 1442 
								invoke StdOut,addr sub36
								mov unit64,'3'
								mov[unit64 + eax],0
								invoke StripLF,addr unit64
								invoke atodw,addr unit64
								add ebx,eax
			.elseif j5 == 1256 
								invoke StdOut,addr sub37
								mov unit65,'3'
								mov[unit65 + eax],0
								invoke StripLF,addr unit65
								invoke atodw,addr unit65
								add ebx,eax
			.elseif j5 == 1041 
								invoke StdOut,addr sub38
								mov unit66,'3'
								mov[unit66 + eax],0
								invoke StripLF,addr unit66
								invoke atodw,addr unit66
								add ebx,eax
			.elseif j5 == 1449 
								invoke StdOut,addr sub39
								mov unit67,'4'
								mov[unit67 + eax],0
								invoke StripLF,addr unit67
								invoke atodw,addr unit67
								add ebx,eax
			.endif
			
			.if j6 == 1438   ;----------------------------------Sixth output Subject -----------------------------
								invoke StdOut,addr sub32
								mov unit60,'4'
								mov[unit60 + eax],0
								invoke StripLF,addr unit60
								invoke atodw,addr unit60
								add ebx,eax
			.elseif j6 == 1975 
								invoke StdOut,addr sub33
								mov unit61,'3'
								mov[unit61 + eax],0
								invoke StripLF,addr unit61
								invoke atodw,addr unit61
								add ebx,eax
			.elseif j6 == 1570 
								invoke StdOut,addr sub34
								mov unit62,'3'
								mov[unit62 + eax],0
								invoke StripLF,addr unit62
								invoke atodw,addr unit62
								add ebx,eax
			.elseif j6 == 1051 
								invoke StdOut,addr sub35
								mov unit63,'2'
								mov[unit63 + eax],0
								invoke StripLF,addr unit63
								invoke atodw,addr unit63
								add ebx,eax
			.elseif j6 == 1442 
								invoke StdOut,addr sub36
								mov unit64,'3'
								mov[unit64 + eax],0
								invoke StripLF,addr unit64
								invoke atodw,addr unit64
								add ebx,eax
			.elseif j6 == 1256 
								invoke StdOut,addr sub37
								mov unit65,'3'
								mov[unit65 + eax],0
								invoke StripLF,addr unit65
								invoke atodw,addr unit65
								add ebx,eax
			.elseif j6 == 1041 
								invoke StdOut,addr sub38
								mov unit66,'3'
								mov[unit66 + eax],0
								invoke StripLF,addr unit66
								invoke atodw,addr unit66
								add ebx,eax
			.elseif j6 == 1449 
								invoke StdOut,addr sub39
								mov unit67,'4'
								mov[unit67 + eax],0
								invoke StripLF,addr unit67
								invoke atodw,addr unit67
								add ebx,eax
			.endif
			
			.if j7 == 1438   ;----------------------------------Seventh output Subject -----------------------------
								invoke StdOut,addr sub32
								mov unit60,'4'
								mov[unit60 + eax],0
								invoke StripLF,addr unit60
								invoke atodw,addr unit60
								add ebx,eax
			.elseif j7 == 1975 
								invoke StdOut,addr sub33
								mov unit61,'3'
								mov[unit61 + eax],0
								invoke StripLF,addr unit61
								invoke atodw,addr unit61
								add ebx,eax
			.elseif j7 == 1570 
								invoke StdOut,addr sub34
								mov unit62,'3'
								mov[unit62 + eax],0
								invoke StripLF,addr unit62
								invoke atodw,addr unit62
								add ebx,eax
			.elseif j7 == 1051 
								invoke StdOut,addr sub35
								mov unit63,'2'
								mov[unit63 + eax],0
								invoke StripLF,addr unit63
								invoke atodw,addr unit63
								add ebx,eax
			.elseif j7 == 1442 
								invoke StdOut,addr sub36
								mov unit64,'3'
								mov[unit64 + eax],0
								invoke StripLF,addr unit64
								invoke atodw,addr unit64
								add ebx,eax
			.elseif j7 == 1256 
								invoke StdOut,addr sub37
								mov unit65,'3'
								mov[unit65 + eax],0
								invoke StripLF,addr unit65
								invoke atodw,addr unit65
								add ebx,eax
			.elseif j7 == 1041 
								invoke StdOut,addr sub38
								mov unit66,'3'
								mov[unit66 + eax],0
								invoke StripLF,addr unit66
								invoke atodw,addr unit66
								add ebx,eax
			.elseif j7 == 1449 
								invoke StdOut,addr sub39
								mov unit67,'4'
								mov[unit67 + eax],0
								invoke StripLF,addr unit67
								invoke atodw,addr unit67
								add ebx,eax
			.endif
			
			.if j8 == 1438   ;----------------------------------Eight output Subject -----------------------------
								invoke StdOut,addr sub32
								mov unit60,'4'
								mov[unit60 + eax],0
								invoke StripLF,addr unit60
								invoke atodw,addr unit60
								add ebx,eax
			.elseif j8 == 1975 
								invoke StdOut,addr sub33
								mov unit61,'3'
								mov[unit61 + eax],0
								invoke StripLF,addr unit61
								invoke atodw,addr unit61
								add ebx,eax
			.elseif j8 == 1570 
								invoke StdOut,addr sub34
								mov unit62,'3'
								mov[unit62 + eax],0
								invoke StripLF,addr unit62
								invoke atodw,addr unit62
								add ebx,eax
			.elseif j8 == 1051 
								invoke StdOut,addr sub35
								mov unit63,'2'
								mov[unit63 + eax],0
								invoke StripLF,addr unit63
								invoke atodw,addr unit63
								add ebx,eax
			.elseif j8 == 1442 
								invoke StdOut,addr sub36
								mov unit64,'3'
								mov[unit64 + eax],0
								invoke StripLF,addr unit64
								invoke atodw,addr unit64
								add ebx,eax
			.elseif j8 == 1256 
								invoke StdOut,addr sub37
								mov unit65,'3'
								mov[unit65 + eax],0
								invoke StripLF,addr unit65
								invoke atodw,addr unit65
								add ebx,eax
			.elseif j8 == 1041 
								invoke StdOut,addr sub38
								mov unit66,'3'
								mov[unit66 + eax],0
								invoke StripLF,addr unit66
								invoke atodw,addr unit66
								add ebx,eax
			.elseif j8 == 1449 
								invoke StdOut,addr sub39
								mov unit67,'4'
								mov[unit67 + eax],0
								invoke StripLF,addr unit67
								invoke atodw,addr unit67
								add ebx,eax
			.endif
			
			invoke dwtoa,ebx,addr total9
			invoke StdOut,addr space1
			invoke StdOut,addr total9
			
							
				invoke StdOut,addr list1
				invoke StdOut,addr user1
				invoke StdOut,addr user2
				invoke StdOut,addr user3
				invoke StdOut,addr user4
				invoke StdOut,addr user5
				
			ceeds3: 
					invoke StdOut,addr proceed2
					invoke StdIn,addr ceed5,50
					.if ceed5 == 'Y' || ceed5 == 'y'
					jmp SecondYearSecondSummer
					.elseif ceed5 == 'N' || ceed5 == 'n'
					jmp SecondYear
					.else
					jmp ceeds3
					.endif
					
SecondYearSecondSummer:

					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr secondstudent
					invoke StdOut,addr Requisites
					invoke StdOut,addr output
					
				invoke StdOut,addr pre21
				invoke StdIn,addr spre24,50
				mov[spre24 + eax],0
				invoke StripLF,addr spre24
				invoke atodw,addr spre24
				mov spre24,eax
				
				invoke StdOut,addr pre22
				invoke StdIn,addr spre25,50
				mov[spre25 + eax],0
				invoke StripLF,addr spre25
				invoke atodw,addr spre25
				mov spre25,eax
				
				invoke ClearScreen
				mov default10,'0'
				mov [default10 + eax],0
				invoke StripLF,addr default10
					invoke atodw,addr default10
				mov ebx,eax
			
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr available1
				invoke StdOut,addr heads
				invoke StdOut,addr head11
				invoke StdOut,addr head12
				
				.if spre24 >=75 && spre24 <=100
				invoke StdOut,addr sub40
				mov unit68,'4'
				mov[unit68 + eax],0
				invoke StripLF,addr unit68
				invoke atodw,addr unit68
				add ebx,eax
				.endif
				
				.if spre25 >=75 && spre25 <=100
				invoke StdOut,addr sub41
				mov unit69,'3'
				mov[unit69 + eax],0
				invoke StripLF,addr unit69
				invoke atodw,addr unit69
				add ebx,eax
				.endif
				
				invoke StdOut,addr sub42
				mov unit70,'3'
				mov[unit70 + eax],0
				invoke StripLF,addr unit70
				invoke atodw,addr unit70
				add ebx,eax
				
				invoke dwtoa,ebx,addr total10
				invoke StdOut,addr space1
				invoke StdOut,addr total10
				
				invoke StdOut,addr subj
				
		offer1sec3: 								;--------------------------------First Input ------------------------
				invoke StdOut,addr ensub1
				invoke StdIn,addr k1,50
				mov[k1 + eax],0
				invoke StripLF,addr k1
				invoke atodw,addr k1
				mov l1,eax
				.if l1 == 1454 || l1 == 1456 || l1 == 1474
				jmp ques1sec3
				.else
				jmp offer1sec3
				.endif
		ques1sec3:
				invoke StdOut,addr display1
				invoke StdIn,addr dis38,50
				.if dis38 == 'Y' || dis38 == 'y'
				jmp offer2sec3
				.elseif dis38 == 'N' || dis38 == 'n'
				jmp SubjectDisplay6
				.else
				jmp ques1sec2
				.endif
		
		offer2sec3: 								;--------------------------------Second Input ------------------------
				invoke StdOut,addr ensub2
				invoke StdIn,addr k2,50
				mov[k2 + eax],0
				invoke StripLF,addr k2
				invoke atodw,addr k2
				mov l2,eax
				.if l2 == 1454 || l2 == 1456 || l2 == 1474
				jmp ques2sec3
				.else
				jmp offer2sec3
				.endif
		ques2sec3:
				invoke StdOut,addr display1
				invoke StdIn,addr dis39,50
				.if dis39 == 'Y' || dis39 == 'y'
				jmp offer3sec3
				.elseif dis39 == 'N' || dis39 == 'n'
				jmp SubjectDisplay6
				.else
				jmp ques1sec2
				.endif
		
		offer3sec3: 								;--------------------------------Third Input ------------------------
				invoke StdOut,addr ensub3
				invoke StdIn,addr k3,50
				mov[k3 + eax],0
				invoke StripLF,addr k3
				invoke atodw,addr k3
				mov l3,eax
				.if l3 == 1454 || l3 == 1456 || l3 == 1474
				jmp SubjectDisplay6
				.else
				jmp offer3sec3
				.endif
				
SubjectDisplay6:

					mov default11,'0'
					mov [default11 + eax],0
					invoke StripLF,addr default11
					invoke atodw,addr default11
					mov ebx,eax
			
					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr subj2
					invoke StdOut,addr heads
					invoke StdOut,addr head11
					invoke StdOut,addr head12
					
				.if l1 == 1454 
								invoke StdOut,addr sub40
								mov unit71,'4'
								mov[unit71 + eax],0
								invoke StripLF,addr unit71
								invoke atodw,addr unit71
								add ebx,eax
				.elseif l1 == 1456 
								invoke StdOut,addr sub41
								mov unit72,'3'
								mov[unit72 + eax],0
								invoke StripLF,addr unit72
								invoke atodw,addr unit72
								add ebx,eax
				.elseif l1 == 1474 
								invoke StdOut,addr sub42
								mov unit73,'3'
								mov[unit73 + eax],0
								invoke StripLF,addr unit73
								invoke atodw,addr unit73
								add ebx,eax
				.endif
				
				.if l2 == 1454 
								invoke StdOut,addr sub40
								mov unit71,'4'
								mov[unit71 + eax],0
								invoke StripLF,addr unit71
								invoke atodw,addr unit71
								add ebx,eax
				.elseif l2 == 1456 
								invoke StdOut,addr sub41
								mov unit72,'3'
								mov[unit72 + eax],0
								invoke StripLF,addr unit72
								invoke atodw,addr unit72
								add ebx,eax
				.elseif l2 == 1474 
								invoke StdOut,addr sub42
								mov unit73,'3'
								mov[unit73 + eax],0
								invoke StripLF,addr unit73
								invoke atodw,addr unit73
								add ebx,eax
				.endif
				
				.if l3 == 1454 
								invoke StdOut,addr sub40
								mov unit71,'4'
								mov[unit71 + eax],0
								invoke StripLF,addr unit71
								invoke atodw,addr unit71
								add ebx,eax
				.elseif l3 == 1456 
								invoke StdOut,addr sub41
								mov unit72,'3'
								mov[unit72 + eax],0
								invoke StripLF,addr unit72
								invoke atodw,addr unit72
								add ebx,eax
				.elseif l3 == 1474 
								invoke StdOut,addr sub42
								mov unit73,'3'
								mov[unit73 + eax],0
								invoke StripLF,addr unit73
								invoke atodw,addr unit73
								add ebx,eax
				.endif
				
				invoke dwtoa,ebx,addr total11
				invoke StdOut,addr space1
				invoke StdOut,addr total11
								
				invoke StdOut,addr list1
				invoke StdOut,addr user1
				invoke StdOut,addr user2
				invoke StdOut,addr user3
				invoke StdOut,addr user4
				invoke StdOut,addr user5
				
				
			ceeds4: 
					invoke StdOut,addr proceed3
					invoke StdIn,addr ceed6,50
					.if ceed6 == 'Y' || ceed6 == 'y'
					jmp SecondYear
					.elseif ceed4 == 'N' || ceed6 == 'n'
					jmp Exit_
					.else
					jmp ceeds4
					.endif
ThirdYear:
			invoke ClearScreen
			invoke StdOut,addr header
			invoke StdOut,addr header2
			invoke StdOut,addr header3
			invoke StdOut,addr header4
			invoke StdOut,addr header5
			invoke StdOut,addr header6
			invoke StdOut,addr header7
			invoke StdOut,addr header8
			invoke StdOut,addr names
			invoke StdOut,addr name1
			invoke StdOut,addr down
			invoke StdOut,addr thirdstudent
			invoke StdOut,addr sem1
			invoke StdOut,addr sem2
			invoke StdOut,addr sem3
			invoke StdOut,addr main
			invoke StdOut,addr yearlevel
			invoke StdIn,addr yearlevel3,50
		
		.if yearlevel3 == 'A' || yearlevel3 == 'a'
	     invoke ClearScreen
		jmp ThirdYearFirstSemester
		.elseif yearlevel3 == 'B' || yearlevel3 == 'b'
		invoke ClearScreen
		jmp ThirdYearSecondSemester
		.elseif yearlevel3 == 'C' || yearlevel3 == 'c'
		invoke ClearScreen
		jmp ThirdYearSummer
		.elseif yearlevel3 == 'D' || yearlevel3 == 'd'
		jmp start
		.else
		jmp ThirdYear
		.endif

ThirdYearFirstSemester:

					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr thirdstudent
					invoke StdOut,addr Requisites
					invoke StdOut,addr output
					
					invoke StdOut,addr pre23				
					invoke StdIn,addr input1,50
					mov[input1 + eax],0
					invoke StripLF,addr input1
					invoke atodw,addr input1
					mov input1,eax
					
					invoke StdOut,addr pre24				
					invoke StdIn,addr input2,50
					mov[input2 + eax],0
					invoke StripLF,addr input2
					invoke atodw,addr input2
					mov input2,eax
					
					invoke StdOut,addr pre25				
					invoke StdIn,addr input3,50
					mov[input3 + eax],0
					invoke StripLF,addr input3
					invoke atodw,addr input3
					mov input3,eax
					
					invoke StdOut,addr pre26				
					invoke StdIn,addr input4,50
					mov[input4 + eax],0
					invoke StripLF,addr input4
					invoke atodw,addr input4
					mov input4,eax
					
					invoke StdOut,addr pre27				
					invoke StdIn,addr input5,50
					mov[input5 + eax],0
					invoke StripLF,addr input5
					invoke atodw,addr input5
					mov input5,eax
					
					invoke StdOut,addr pre28				
					invoke StdIn,addr input6,50
					mov[input6 + eax],0
					invoke StripLF,addr input6
					invoke atodw,addr input6
					mov input6,eax
					
				invoke ClearScreen
				mov settings1,'0'
				mov [settings1 + eax],0
				invoke StripLF,addr settings1
					invoke atodw,addr settings1
				mov ebx,eax
			
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr heads
				invoke StdOut,addr available1
				invoke StdOut,addr head13
				invoke StdOut,addr head14
				
				.if input1 >=75 && input1 <=100 && input2 >=75 && input2 <=100 && input3 >=75 && input3 <=100
				invoke StdOut,addr sub43
				mov credits1,'4'
				mov[credits1 + eax],0
				invoke StripLF,addr credits1
				invoke atodw,addr credits1
				add ebx,eax
				.endif
				
				.if input4 >=75 && input4 <=100 && input2 >=75 && input2 <=100
				invoke StdOut,addr sub44
				mov credits2,'3'
				mov[credits2 + eax],0
				invoke StripLF,addr credits2
				invoke atodw,addr credits2
				add ebx,eax
				.endif
				
				.if input4 >=75 && input4 <=100 && input2 >=75 && input2 <=100
				invoke StdOut,addr sub45
				mov credits3,'3'
				mov[credits3 + eax],0
				invoke StripLF,addr credits3
				invoke atodw,addr credits3
				add ebx,eax
				.endif
				
				.if input2 >=75 && input2 <=100
				invoke StdOut,addr sub46
				mov credits4,'3'
				mov[credits4 + eax],0
				invoke StripLF,addr credits4
				invoke atodw,addr credits4
				add ebx,eax
				.endif
				
				.if input5 >=75 && input5 <=100
				invoke StdOut,addr sub47
				mov credits5,'3'
				mov[credits5 + eax],0
				invoke StripLF,addr credits5
				invoke atodw,addr credits5
				add ebx,eax
				.endif
				
				.if input1 >=75 && input1 <=100 && input2 >=75 && input2 <=100
				invoke StdOut,addr sub48
				mov credits6,'4'
				mov[credits6 + eax],0
				invoke StripLF,addr credits6
				invoke atodw,addr credits6
				add ebx,eax
				.endif
				
				.if input2 >=75 && input2 <=100
				invoke StdOut,addr sub49
				mov credits7,'3'
				mov[credits7 + eax],0
				invoke StripLF,addr credits7
				invoke atodw,addr credits7
				add ebx,eax
				.endif
				
				invoke StdOut,addr sub50
				mov credits8,'3'
				mov[credits8 + eax],0
				invoke StripLF,addr credits8
				invoke atodw,addr credits8
				add ebx,eax
				
				.if input6 >=75 && input6 <=100
				invoke StdOut,addr sub51
				mov credits9,'3'
				mov[credits9 + eax],0
				invoke StripLF,addr credits9
				invoke atodw,addr credits9
				add ebx,eax
				.endif
				
				invoke dwtoa,ebx,addr compute1
				invoke StdOut,addr space1
				invoke StdOut,addr compute1
				
				invoke StdOut,addr subj
				
		offer1third: 								;--------------------------------First Input ------------------------
				invoke StdOut,addr ensub1
				invoke StdIn,addr m1,50
				mov[m1 + eax],0
				invoke StripLF,addr m1
				invoke atodw,addr m1
				mov m1,eax
				.if m1 == 2127 || m1 == 2123 || m1 == 1452 || m1 == 1444 || m1 == 1026 || m1 == 2128 || m1 == 2129 || m1 == 1063 || m1 == 2118
				jmp ques1third
				.else
				jmp offer1third
				.endif
		ques1third:
				invoke StdOut,addr display1
				invoke StdIn,addr n1,50
				.if n1 == 'Y' || n1 == 'y'
				jmp offer2third
				.elseif n1 == 'N' || n1 == 'n'
				jmp SubjectDisplay7
				.else
				jmp ques1third
				.endif
				
		offer2third: 								;--------------------------------Second Input ------------------------
				invoke StdOut,addr ensub2
				invoke StdIn,addr m2,50
				mov[m2 + eax],0
				invoke StripLF,addr m2
				invoke atodw,addr m2
				mov m2,eax
				.if m2 == 2127 || m2 == 2123 || m2 == 1452 || m2 == 1444 || m2 == 1026 || m2 == 2128 || m2 == 2129 || m2 == 1063 || m2 == 2118
				jmp ques2third
				.else
				jmp offer2third
				.endif
		ques2third:
				invoke StdOut,addr display1
				invoke StdIn,addr n2,50
				.if n2 == 'Y' || n2 == 'y'
				jmp offer3third
				.elseif n2 == 'N' || n2 == 'n'
				jmp SubjectDisplay7
				.else
				jmp ques2third
				.endif
					
		offer3third: 								;--------------------------------Third Input ------------------------
				invoke StdOut,addr ensub3
				invoke StdIn,addr m3,50
				mov[m3 + eax],0
				invoke StripLF,addr m3
				invoke atodw,addr m3
				mov m3,eax
				.if m3 == 2127 || m3 == 2123 || m3 == 1452 || m3 == 1444 || m3 == 1026 || m3 == 2128 || m3 == 2129 || m3 == 1063 || m3 == 2118
				jmp ques3third
				.else
				jmp offer3third
				.endif
		ques3third:
				invoke StdOut,addr display1
				invoke StdIn,addr n3,50
				.if n3 == 'Y' || n3 == 'y'
				jmp offer4third
				.elseif n3 == 'N' || n3 == 'n'
				jmp SubjectDisplay7
				.else
				jmp ques3third
				.endif
					
		offer4third: 								;--------------------------------Fourth Input ------------------------
				invoke StdOut,addr ensub4
				invoke StdIn,addr m4,50
				mov[m4 + eax],0
				invoke StripLF,addr m4
				invoke atodw,addr m4
				mov m4,eax
				.if m4 == 2127 || m4 == 2123 || m4 == 1452 || m4 == 1444 || m4 == 1026 || m4 == 2128 || m4 == 2129 || m4 == 1063 || m4 == 2118
				jmp ques4third
				.else
				jmp offer4third
				.endif
		ques4third:
				invoke StdOut,addr display1
				invoke StdIn,addr n4,50
				.if n4 == 'Y' || n4 == 'y'
				jmp offer5third
				.elseif n4 == 'N' || n4 == 'n'
				jmp SubjectDisplay7
				.else
				jmp ques4third
				.endif
					
		offer5third: 								;--------------------------------Fifth Input ------------------------
				invoke StdOut,addr ensub5
				invoke StdIn,addr m5,50
				mov[m5 + eax],0
				invoke StripLF,addr m5
				invoke atodw,addr m5
				mov m5,eax
				.if m5 == 2127 || m5 == 2123 || m5 == 1452 || m5 == 1444 || m5 == 1026 || m5 == 2128 || m5 == 2129 || m5 == 1063 || m5 == 2118
				jmp ques5third
				.else
				jmp offer5third
				.endif
		ques5third:
				invoke StdOut,addr display1
				invoke StdIn,addr n5,50
				.if n5 == 'Y' || n5 == 'y'
				jmp offer6third
				.elseif n5 == 'N' || n5 == 'n'
				jmp SubjectDisplay7
				.else
				jmp ques5third
				.endif
					
		offer6third: 								;--------------------------------Sixth Input ------------------------
				invoke StdOut,addr ensub6
				invoke StdIn,addr m6,50
				mov[m6 + eax],0
				invoke StripLF,addr m6
				invoke atodw,addr m6
				mov m6,eax
				.if m6 == 2127 || m6 == 2123 || m6 == 1452 || m6 == 1444 || m6 == 1026 || m6 == 2128 || m6 == 2129 || m6 == 1063 || m6 == 2118
				jmp ques6third
				.else
				jmp offer6third
				.endif
		ques6third:
				invoke StdOut,addr display1
				invoke StdIn,addr n6,50
				.if n6 == 'Y' || n6 == 'y'
				jmp offer7third
				.elseif n6 == 'N' || n6 == 'n'
				jmp SubjectDisplay7
				.else
				jmp ques6third
				.endif
					
		offer7third: 								;--------------------------------Seventh Input ------------------------
				invoke StdOut,addr ensub7
				invoke StdIn,addr m7,50
				mov[m7 + eax],0
				invoke StripLF,addr m7
				invoke atodw,addr m7
				mov m7,eax
				.if m7 == 2127 || m7 == 2123 || m7 == 1452 || m7 == 1444 || m7 == 1026 || m7 == 2128 || m7 == 2129 || m7 == 1063 || m7 == 2118
				jmp ques7third
				.else
				jmp offer7third
				.endif
		ques7third:
				invoke StdOut,addr display1
				invoke StdIn,addr n7,50
				.if n7 == 'Y' || n7 == 'y'
				jmp offer8third
				.elseif n7 == 'N' || n7 == 'n'
				jmp SubjectDisplay7
				.else
				jmp ques7third
				.endif
		
		offer8third: 								;--------------------------------Eight Input ------------------------
				invoke StdOut,addr ensub8
				invoke StdIn,addr m8,50
				mov[m8 + eax],0
				invoke StripLF,addr m8
				invoke atodw,addr m8
				mov m8,eax
				.if m8 == 2127 || m8 == 2123 || m8 == 1452 || m8 == 1444 || m8 == 1026 || m8 == 2128 || m8 == 2129 || m8 == 1063 || m8 == 2118
				jmp ques8third
				.else
				jmp offer8third
				.endif
		ques8third:
				invoke StdOut,addr display1
				invoke StdIn,addr n8,50
				.if n8 == 'Y' || n8 == 'y'
				jmp offer9third
				.elseif n8 == 'N' || n8 == 'n'
				jmp SubjectDisplay7
				.else
				jmp ques8third
				.endif
						
		offer9third: 								;--------------------------------Nineth Input ------------------------
				invoke StdOut,addr ensub9
				invoke StdIn,addr m9,50
				mov[m9 + eax],0
				invoke StripLF,addr m9
				invoke atodw,addr m9
				mov m9,eax
				.if m9 == 2127 || m9 == 2123 || m9 == 1452 || m9 == 1444 || m9 == 1026 || m9 == 2128 || m9 == 2129 || m9 == 1063 || m9 == 2118
				jmp SubjectDisplay7
				.else
				jmp offer9third
				.endif
					
					
SubjectDisplay7:
			
					mov settings2,'0'
					mov [settings2 + eax],0
					invoke StripLF,addr settings2
					invoke atodw,addr settings2
					mov ebx,eax
			
					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr subj2
					invoke StdOut,addr heads
					invoke StdOut,addr head13
					invoke StdOut,addr head14
					
			.if m1 == 2127 
								invoke StdOut,addr sub43
								mov credits10,'4'
								mov[credits10 + eax],0
								invoke StripLF,addr credits10
								invoke atodw,addr credits10
								add ebx,eax
			.elseif m1 == 2123 
								invoke StdOut,addr sub44
								mov credits11,'3'
								mov[credits11 + eax],0
								invoke StripLF,addr credits11
								invoke atodw,addr credits11
								add ebx,eax
			.elseif m1 == 1452 
								invoke StdOut,addr sub45
								mov credits12,'3'
								mov[credits12 + eax],0
								invoke StripLF,addr credits12
								invoke atodw,addr credits12
								add ebx,eax
			.elseif m1 == 1444 
								invoke StdOut,addr sub46
								mov credits13,'3'
								mov[credits13 + eax],0
								invoke StripLF,addr credits13
								invoke atodw,addr credits13
								add ebx,eax
			.elseif m1 == 1026 
								invoke StdOut,addr sub47
								mov credits14,'3'
								mov[credits14 + eax],0
								invoke StripLF,addr credits14
								invoke atodw,addr credits14
								add ebx,eax
			.elseif m1 == 2128 
								invoke StdOut,addr sub48
								mov credits15,'4'
								mov[credits15 + eax],0
								invoke StripLF,addr credits15
								invoke atodw,addr credits15
								add ebx,eax
			.elseif m1 == 2129 
								invoke StdOut,addr sub49
								mov credits16,'3'
								mov[credits16 + eax],0
								invoke StripLF,addr credits16
								invoke atodw,addr credits16
								add ebx,eax
			.elseif m1 == 1063 
								invoke StdOut,addr sub50
								mov credits17,'3'
								mov[credits17 + eax],0
								invoke StripLF,addr credits17
								invoke atodw,addr credits17
								add ebx,eax
			.elseif m1 == 2118 
								invoke StdOut,addr sub51
								mov credits18,'3'
								mov[credits18 + eax],0
								invoke StripLF,addr credits18
								invoke atodw,addr credits18
								add ebx,eax
			.endif
			
			.if m2 == 2127 
								invoke StdOut,addr sub43
								mov credits10,'4'
								mov[credits10 + eax],0
								invoke StripLF,addr credits10
								invoke atodw,addr credits10
								add ebx,eax
			.elseif m2 == 2123 
								invoke StdOut,addr sub44
								mov credits11,'3'
								mov[credits11 + eax],0
								invoke StripLF,addr credits11
								invoke atodw,addr credits11
								add ebx,eax
			.elseif m2 == 1452 
								invoke StdOut,addr sub45
								mov credits12,'3'
								mov[credits12 + eax],0
								invoke StripLF,addr credits12
								invoke atodw,addr credits12
								add ebx,eax
			.elseif m2 == 1444 
								invoke StdOut,addr sub46
								mov credits13,'3'
								mov[credits13 + eax],0
								invoke StripLF,addr credits13
								invoke atodw,addr credits13
								add ebx,eax
			.elseif m2 == 1026 
								invoke StdOut,addr sub47
								mov credits14,'3'
								mov[credits14 + eax],0
								invoke StripLF,addr credits14
								invoke atodw,addr credits14
								add ebx,eax
			.elseif m2 == 2128 
								invoke StdOut,addr sub48
								mov credits15,'4'
								mov[credits15 + eax],0
								invoke StripLF,addr credits15
								invoke atodw,addr credits15
								add ebx,eax
			.elseif m2 == 2129 
								invoke StdOut,addr sub49
								mov credits16,'3'
								mov[credits16 + eax],0
								invoke StripLF,addr credits16
								invoke atodw,addr credits16
								add ebx,eax
			.elseif m2 == 1063 
								invoke StdOut,addr sub50
								mov credits17,'3'
								mov[credits17 + eax],0
								invoke StripLF,addr credits17
								invoke atodw,addr credits17
								add ebx,eax
			.elseif m2 == 2118 
								invoke StdOut,addr sub51
								mov credits18,'3'
								mov[credits18 + eax],0
								invoke StripLF,addr credits18
								invoke atodw,addr credits18
								add ebx,eax
			.endif
			
			.if m3 == 2127 
								invoke StdOut,addr sub43
								mov credits10,'4'
								mov[credits10 + eax],0
								invoke StripLF,addr credits10
								invoke atodw,addr credits10
								add ebx,eax
			.elseif m3 == 2123 
								invoke StdOut,addr sub44
								mov credits11,'3'
								mov[credits11 + eax],0
								invoke StripLF,addr credits11
								invoke atodw,addr credits11
								add ebx,eax
			.elseif m3 == 1452 
								invoke StdOut,addr sub45
								mov credits12,'3'
								mov[credits12 + eax],0
								invoke StripLF,addr credits12
								invoke atodw,addr credits12
								add ebx,eax
			.elseif m3 == 1444 
								invoke StdOut,addr sub46
								mov credits13,'3'
								mov[credits13 + eax],0
								invoke StripLF,addr credits13
								invoke atodw,addr credits13
								add ebx,eax
			.elseif m3 == 1026 
								invoke StdOut,addr sub47
								mov credits14,'3'
								mov[credits14 + eax],0
								invoke StripLF,addr credits14
								invoke atodw,addr credits14
								add ebx,eax
			.elseif m3 == 2128 
								invoke StdOut,addr sub48
								mov credits15,'4'
								mov[credits15 + eax],0
								invoke StripLF,addr credits15
								invoke atodw,addr credits15
								add ebx,eax
			.elseif m3 == 2129 
								invoke StdOut,addr sub49
								mov credits16,'3'
								mov[credits16 + eax],0
								invoke StripLF,addr credits16
								invoke atodw,addr credits16
								add ebx,eax
			.elseif m3 == 1063 
								invoke StdOut,addr sub50
								mov credits17,'3'
								mov[credits17 + eax],0
								invoke StripLF,addr credits17
								invoke atodw,addr credits17
								add ebx,eax
			.elseif m3 == 2118 
								invoke StdOut,addr sub51
								mov credits18,'3'
								mov[credits18 + eax],0
								invoke StripLF,addr credits18
								invoke atodw,addr credits18
								add ebx,eax
			.endif
			
			.if m4 == 2127 
								invoke StdOut,addr sub43
								mov credits10,'4'
								mov[credits10 + eax],0
								invoke StripLF,addr credits10
								invoke atodw,addr credits10
								add ebx,eax
			.elseif m4 == 2123 
								invoke StdOut,addr sub44
								mov credits11,'3'
								mov[credits11 + eax],0
								invoke StripLF,addr credits11
								invoke atodw,addr credits11
								add ebx,eax
			.elseif m4 == 1452 
								invoke StdOut,addr sub45
								mov credits12,'3'
								mov[credits12 + eax],0
								invoke StripLF,addr credits12
								invoke atodw,addr credits12
								add ebx,eax
			.elseif m4 == 1444 
								invoke StdOut,addr sub46
								mov credits13,'3'
								mov[credits13 + eax],0
								invoke StripLF,addr credits13
								invoke atodw,addr credits13
								add ebx,eax
			.elseif m4 == 1026 
								invoke StdOut,addr sub47
								mov credits14,'3'
								mov[credits14 + eax],0
								invoke StripLF,addr credits14
								invoke atodw,addr credits14
								add ebx,eax
			.elseif m4 == 2128 
								invoke StdOut,addr sub48
								mov credits15,'4'
								mov[credits15 + eax],0
								invoke StripLF,addr credits15
								invoke atodw,addr credits15
								add ebx,eax
			.elseif m4 == 2129 
								invoke StdOut,addr sub49
								mov credits16,'3'
								mov[credits16 + eax],0
								invoke StripLF,addr credits16
								invoke atodw,addr credits16
								add ebx,eax
			.elseif m4 == 1063 
								invoke StdOut,addr sub50
								mov credits17,'3'
								mov[credits17 + eax],0
								invoke StripLF,addr credits17
								invoke atodw,addr credits17
								add ebx,eax
			.elseif m4 == 2118 
								invoke StdOut,addr sub51
								mov credits18,'3'
								mov[credits18 + eax],0
								invoke StripLF,addr credits18
								invoke atodw,addr credits18
								add ebx,eax
			.endif
			
			.if m5 == 2127 
								invoke StdOut,addr sub43
								mov credits10,'4'
								mov[credits10 + eax],0
								invoke StripLF,addr credits10
								invoke atodw,addr credits10
								add ebx,eax
			.elseif m5 == 2123 
								invoke StdOut,addr sub44
								mov credits11,'3'
								mov[credits11 + eax],0
								invoke StripLF,addr credits11
								invoke atodw,addr credits11
								add ebx,eax
			.elseif m5 == 1452 
								invoke StdOut,addr sub45
								mov credits12,'3'
								mov[credits12 + eax],0
								invoke StripLF,addr credits12
								invoke atodw,addr credits12
								add ebx,eax
			.elseif m5 == 1444 
								invoke StdOut,addr sub46
								mov credits13,'3'
								mov[credits13 + eax],0
								invoke StripLF,addr credits13
								invoke atodw,addr credits13
								add ebx,eax
			.elseif m5 == 1026 
								invoke StdOut,addr sub47
								mov credits14,'3'
								mov[credits14 + eax],0
								invoke StripLF,addr credits14
								invoke atodw,addr credits14
								add ebx,eax
			.elseif m5 == 2128 
								invoke StdOut,addr sub48
								mov credits15,'4'
								mov[credits15 + eax],0
								invoke StripLF,addr credits15
								invoke atodw,addr credits15
								add ebx,eax
			.elseif m5 == 2129 
								invoke StdOut,addr sub49
								mov credits16,'3'
								mov[credits16 + eax],0
								invoke StripLF,addr credits16
								invoke atodw,addr credits16
								add ebx,eax
			.elseif m5 == 1063 
								invoke StdOut,addr sub50
								mov credits17,'3'
								mov[credits17 + eax],0
								invoke StripLF,addr credits17
								invoke atodw,addr credits17
								add ebx,eax
			.elseif m5 == 2118 
								invoke StdOut,addr sub51
								mov credits18,'3'
								mov[credits18 + eax],0
								invoke StripLF,addr credits18
								invoke atodw,addr credits18
								add ebx,eax
			.endif
				
			.if m6 == 2127 
								invoke StdOut,addr sub43
								mov credits10,'4'
								mov[credits10 + eax],0
								invoke StripLF,addr credits10
								invoke atodw,addr credits10
								add ebx,eax
			.elseif m6 == 2123 
								invoke StdOut,addr sub44
								mov credits11,'3'
								mov[credits11 + eax],0
								invoke StripLF,addr credits11
								invoke atodw,addr credits11
								add ebx,eax
			.elseif m6 == 1452 
								invoke StdOut,addr sub45
								mov credits12,'3'
								mov[credits12 + eax],0
								invoke StripLF,addr credits12
								invoke atodw,addr credits12
								add ebx,eax
			.elseif m6 == 1444 
								invoke StdOut,addr sub46
								mov credits13,'3'
								mov[credits13 + eax],0
								invoke StripLF,addr credits13
								invoke atodw,addr credits13
								add ebx,eax
			.elseif m6 == 1026 
								invoke StdOut,addr sub47
								mov credits14,'3'
								mov[credits14 + eax],0
								invoke StripLF,addr credits14
								invoke atodw,addr credits14
								add ebx,eax
			.elseif m6 == 2128 
								invoke StdOut,addr sub48
								mov credits15,'4'
								mov[credits15 + eax],0
								invoke StripLF,addr credits15
								invoke atodw,addr credits15
								add ebx,eax
			.elseif m6 == 2129 
								invoke StdOut,addr sub49
								mov credits16,'3'
								mov[credits16 + eax],0
								invoke StripLF,addr credits16
								invoke atodw,addr credits16
								add ebx,eax
			.elseif m6 == 1063 
								invoke StdOut,addr sub50
								mov credits17,'3'
								mov[credits17 + eax],0
								invoke StripLF,addr credits17
								invoke atodw,addr credits17
								add ebx,eax
			.elseif m6 == 2118 
								invoke StdOut,addr sub51
								mov credits18,'3'
								mov[credits18 + eax],0
								invoke StripLF,addr credits18
								invoke atodw,addr credits18
								add ebx,eax
			.endif	
			
			.if m7 == 2127 
								invoke StdOut,addr sub43
								mov credits10,'4'
								mov[credits10 + eax],0
								invoke StripLF,addr credits10
								invoke atodw,addr credits10
								add ebx,eax
			.elseif m7 == 2123 
								invoke StdOut,addr sub44
								mov credits11,'3'
								mov[credits11 + eax],0
								invoke StripLF,addr credits11
								invoke atodw,addr credits11
								add ebx,eax
			.elseif m7 == 1452 
								invoke StdOut,addr sub45
								mov credits12,'3'
								mov[credits12 + eax],0
								invoke StripLF,addr credits12
								invoke atodw,addr credits12
								add ebx,eax
			.elseif m7 == 1444 
								invoke StdOut,addr sub46
								mov credits13,'3'
								mov[credits13 + eax],0
								invoke StripLF,addr credits13
								invoke atodw,addr credits13
								add ebx,eax
			.elseif m7 == 1026 
								invoke StdOut,addr sub47
								mov credits14,'3'
								mov[credits14 + eax],0
								invoke StripLF,addr credits14
								invoke atodw,addr credits14
								add ebx,eax
			.elseif m7 == 2128 
								invoke StdOut,addr sub48
								mov credits15,'4'
								mov[credits15 + eax],0
								invoke StripLF,addr credits15
								invoke atodw,addr credits15
								add ebx,eax
			.elseif m7 == 2129 
								invoke StdOut,addr sub49
								mov credits16,'3'
								mov[credits16 + eax],0
								invoke StripLF,addr credits16
								invoke atodw,addr credits16
								add ebx,eax
			.elseif m7 == 1063 
								invoke StdOut,addr sub50
								mov credits17,'3'
								mov[credits17 + eax],0
								invoke StripLF,addr credits17
								invoke atodw,addr credits17
								add ebx,eax
			.elseif m7 == 2118 
								invoke StdOut,addr sub51
								mov credits18,'3'
								mov[credits18 + eax],0
								invoke StripLF,addr credits18
								invoke atodw,addr credits18
								add ebx,eax
			.endif
			
			.if m8 == 2127 
								invoke StdOut,addr sub43
								mov credits10,'4'
								mov[credits10 + eax],0
								invoke StripLF,addr credits10
								invoke atodw,addr credits10
								add ebx,eax
			.elseif m8 == 2123 
								invoke StdOut,addr sub44
								mov credits11,'3'
								mov[credits11 + eax],0
								invoke StripLF,addr credits11
								invoke atodw,addr credits11
								add ebx,eax
			.elseif m8 == 1452 
								invoke StdOut,addr sub45
								mov credits12,'3'
								mov[credits12 + eax],0
								invoke StripLF,addr credits12
								invoke atodw,addr credits12
								add ebx,eax
			.elseif m8 == 1444 
								invoke StdOut,addr sub46
								mov credits13,'3'
								mov[credits13 + eax],0
								invoke StripLF,addr credits13
								invoke atodw,addr credits13
								add ebx,eax
			.elseif m8 == 1026 
								invoke StdOut,addr sub47
								mov credits14,'3'
								mov[credits14 + eax],0
								invoke StripLF,addr credits14
								invoke atodw,addr credits14
								add ebx,eax
			.elseif m8 == 2128 
								invoke StdOut,addr sub48
								mov credits15,'4'
								mov[credits15 + eax],0
								invoke StripLF,addr credits15
								invoke atodw,addr credits15
								add ebx,eax
			.elseif m8 == 2129 
								invoke StdOut,addr sub49
								mov credits16,'3'
								mov[credits16 + eax],0
								invoke StripLF,addr credits16
								invoke atodw,addr credits16
								add ebx,eax
			.elseif m8 == 1063 
								invoke StdOut,addr sub50
								mov credits17,'3'
								mov[credits17 + eax],0
								invoke StripLF,addr credits17
								invoke atodw,addr credits17
								add ebx,eax
			.elseif m8 == 2118 
								invoke StdOut,addr sub51
								mov credits18,'3'
								mov[credits18 + eax],0
								invoke StripLF,addr credits18
								invoke atodw,addr credits18
								add ebx,eax
			.endif
			
			.if m9 == 2127 
								invoke StdOut,addr sub43
								mov credits10,'4'
								mov[credits10 + eax],0
								invoke StripLF,addr credits10
								invoke atodw,addr credits10
								add ebx,eax
			.elseif m9 == 2123 
								invoke StdOut,addr sub44
								mov credits11,'3'
								mov[credits11 + eax],0
								invoke StripLF,addr credits11
								invoke atodw,addr credits11
								add ebx,eax
			.elseif m9 == 1452 
								invoke StdOut,addr sub45
								mov credits12,'3'
								mov[credits12 + eax],0
								invoke StripLF,addr credits12
								invoke atodw,addr credits12
								add ebx,eax
			.elseif m9 == 1444 
								invoke StdOut,addr sub46
								mov credits13,'3'
								mov[credits13 + eax],0
								invoke StripLF,addr credits13
								invoke atodw,addr credits13
								add ebx,eax
			.elseif m9 == 1026 
								invoke StdOut,addr sub47
								mov credits14,'3'
								mov[credits14 + eax],0
								invoke StripLF,addr credits14
								invoke atodw,addr credits14
								add ebx,eax
			.elseif m9 == 2128 
								invoke StdOut,addr sub48
								mov credits15,'4'
								mov[credits15 + eax],0
								invoke StripLF,addr credits15
								invoke atodw,addr credits15
								add ebx,eax
			.elseif m9 == 2129 
								invoke StdOut,addr sub49
								mov credits16,'3'
								mov[credits16 + eax],0
								invoke StripLF,addr credits16
								invoke atodw,addr credits16
								add ebx,eax
			.elseif m9 == 1063 
								invoke StdOut,addr sub50
								mov credits17,'3'
								mov[credits17 + eax],0
								invoke StripLF,addr credits17
								invoke atodw,addr credits17
								add ebx,eax
			.elseif m9 == 2118 
								invoke StdOut,addr sub51
								mov credits18,'3'
								mov[credits18 + eax],0
								invoke StripLF,addr credits18
								invoke atodw,addr credits18
								add ebx,eax
			.endif
			
			invoke dwtoa,ebx,addr compute2
			invoke StdOut,addr space1
			invoke StdOut,addr compute2
		
						
				invoke StdOut,addr list1
				invoke StdOut,addr user1
				invoke StdOut,addr user2
				invoke StdOut,addr user3
				invoke StdOut,addr user4
				invoke StdOut,addr user5
				
		ceeds5: 
					invoke StdOut,addr proceed1
					invoke StdIn,addr ceed7,50
					.if ceed7 == 'Y' || ceed7 == 'y'
					jmp ThirdYearSecondSemester
					.elseif ceed7 == 'N' || ceed7 == 'n'
					jmp ThirdYear
					.else
					jmp ceeds4
					.endif
ThirdYearSecondSemester:
			
					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr thirdstudent
					invoke StdOut,addr Requisites
					invoke StdOut,addr output
					
					invoke StdOut,addr pre29				
					invoke StdIn,addr input7,50
					mov[input7 + eax],0
					invoke StripLF,addr input7
					invoke atodw,addr input7
					mov input7,eax
					
					invoke StdOut,addr pre30				
					invoke StdIn,addr input8,50
					mov[input8 + eax],0
					invoke StripLF,addr input8
					invoke atodw,addr input8
					mov input8,eax
					
					invoke StdOut,addr pre31				
					invoke StdIn,addr input9,50
					mov[input9 + eax],0
					invoke StripLF,addr input9
					invoke atodw,addr input9
					mov input9,eax
					
					invoke StdOut,addr pre32				
					invoke StdIn,addr input10,50
					mov[input10 + eax],0
					invoke StripLF,addr input10
					invoke atodw,addr input10
					mov input10,eax
					
					invoke StdOut,addr pre33				
					invoke StdIn,addr input11,50
					mov[input11 + eax],0
					invoke StripLF,addr input11
					invoke atodw,addr input11
					mov input11,eax
					
					invoke StdOut,addr pre34				
					invoke StdIn,addr input12,50
					mov[input12 + eax],0
					invoke StripLF,addr input12
					invoke atodw,addr input12
					mov input12,eax
					
					invoke StdOut,addr pre35				
					invoke StdIn,addr input13,50
					mov[input13 + eax],0
					invoke StripLF,addr input13
					invoke atodw,addr input13
					mov input13,eax
					
					invoke StdOut,addr pre36				
					invoke StdIn,addr input14,50
					mov[input14 + eax],0
					invoke StripLF,addr input14
					invoke atodw,addr input14
					mov input14,eax
					
					invoke StdOut,addr pre37				
					invoke StdIn,addr input15,50
					mov[input15 + eax],0
					invoke StripLF,addr input15
					invoke atodw,addr input15
					mov input15,eax
					
					invoke ClearScreen
				mov settings3,'0'
				mov [settings3 + eax],0
				invoke StripLF,addr settings3
					invoke atodw,addr settings3
				mov ebx,eax
			
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr available1
				invoke StdOut,addr heads
				invoke StdOut,addr head15
				invoke StdOut,addr head16
				
				.if input7 >=75 && input7 <=100
				invoke StdOut,addr sub52
				mov credits19,'3'
				mov[credits19 + eax],0
				invoke StripLF,addr credits19
				invoke atodw,addr credits19
				add ebx,eax
				.endif
				
				.if input8 >=75 && input8 <=100 && input9 >=75 && input9 <=100
				invoke StdOut,addr sub53
				mov credits20,'3'
				mov[credits20 + eax],0
				invoke StripLF,addr credits20
				invoke atodw,addr credits20
				add ebx,eax
				.endif
				
				.if input10 >=75 && input10 <=100
				invoke StdOut,addr sub54
				mov credits21,'3'
				mov[credits21 + eax],0
				invoke StripLF,addr credits21
				invoke atodw,addr credits21
				add ebx,eax
				.endif
				
				.if input11 >=75 && input11 <=100
				invoke StdOut,addr sub55
				mov credits22,'4'
				mov[credits22 + eax],0
				invoke StripLF,addr credits22
				invoke atodw,addr credits22
				add ebx,eax
				.endif
				
				.if input12 >=75 && input12 <=100
				invoke StdOut,addr sub56
				mov credits23,'3'
				mov[credits23 + eax],0
				invoke StripLF,addr credits23
				invoke atodw,addr credits23
				add ebx,eax
				.endif
				
				.if input13 >=75 && input13 <=100
				invoke StdOut,addr sub57
				mov credits24,'4'
				mov[credits24 + eax],0
				invoke StripLF,addr credits24
				invoke atodw,addr credits24
				add ebx,eax
				.endif
				
				.if input14 >=75 && input14 <=100 && input15 >=75 && input15 <=100 && input8 >=75 && input8 <=100
				invoke StdOut,addr sub58
				mov credits25,'3'
				mov[credits25 + eax],0
				invoke StripLF,addr credits25
				invoke atodw,addr credits25
				add ebx,eax
				.endif
				
				invoke StdOut,addr sub59
				mov credits26,'3'
				mov[credits26 + eax],0
				invoke StripLF,addr credits26
				invoke atodw,addr credits26
				add ebx,eax
				
				invoke dwtoa,ebx,addr compute3
				invoke StdOut,addr space1
				invoke StdOut,addr compute3
				
				invoke StdOut,addr subj
				
		offer1third2: 								;--------------------------------First Input ------------------------
				invoke StdOut,addr ensub1
				invoke StdIn,addr o1,50
				mov[o1 + eax],0
				invoke StripLF,addr o1
				invoke atodw,addr o1
				mov o1,eax
				.if o1 == 1450 || o1 == 1465 || o1 == 2124 || o1 == 2130 || o1 == 2027 || o1 == 2131 || o1 == 2132 || o1 == 1044
				jmp ques1third2
				.else
				jmp offer1third2
				.endif
		ques1third2:
				invoke StdOut,addr display1
				invoke StdIn,addr p1,50
				.if p1 == 'Y' || p1 == 'y'
				jmp offer2third2
				.elseif p1 == 'N' || p1 == 'n'
				jmp SubjectDisplay8
				.else
				jmp ques1third2
				.endif
		
		offer2third2: 								;--------------------------------Second Input ------------------------
				invoke StdOut,addr ensub2
				invoke StdIn,addr o2,50
				mov[o2 + eax],0
				invoke StripLF,addr o2
				invoke atodw,addr o2
				mov o2,eax
				.if o2 == 1450 || o2 == 1465 || o2 == 2124 || o2 == 2130 || o2 == 2027 || o2 == 2131 || o2 == 2132 || o2 == 1044
				jmp ques2third2
				.else
				jmp offer2third2
				.endif
		ques2third2:
				invoke StdOut,addr display1
				invoke StdIn,addr p2,50
				.if p2 == 'Y' || p2 == 'y'
				jmp offer3third2
				.elseif p2 == 'N' || p2 == 'n'
				jmp SubjectDisplay8
				.else
				jmp ques2third2
				.endif
		
		offer3third2: 								;--------------------------------Third Input ------------------------
				invoke StdOut,addr ensub3
				invoke StdIn,addr o3,50
				mov[o3 + eax],0
				invoke StripLF,addr o3
				invoke atodw,addr o3
				mov o3,eax
				.if o3 == 1450 || o3 == 1465 || o3 == 2124 || o3 == 2130 || o3 == 2027 || o3 == 2131 || o3 == 2132 || o3 == 1044
				jmp ques3third2
				.else
				jmp offer3third2
				.endif
		ques3third2:
				invoke StdOut,addr display1
				invoke StdIn,addr p3,50
				.if p3 == 'Y' || p3 == 'y'
				jmp offer4third2
				.elseif p3 == 'N' || p3 == 'n'
				jmp SubjectDisplay8
				.else
				jmp ques3third2
				.endif
		
		offer4third2: 								;--------------------------------Fourth Input ------------------------
				invoke StdOut,addr ensub4
				invoke StdIn,addr o4,50
				mov[o4 + eax],0
				invoke StripLF,addr o4
				invoke atodw,addr o4
				mov o4,eax
				.if o4 == 1450 || o4 == 1465 || o4 == 2124 || o4 == 2130 || o4 == 2027 || o4 == 2131 || o4 == 2132 || o4 == 1044
				jmp ques4third2
				.else
				jmp offer4third2
				.endif
		ques4third2:
				invoke StdOut,addr display1
				invoke StdIn,addr p4,50
				.if p4 == 'Y' || p4 == 'y'
				jmp offer5third2
				.elseif p4 == 'N' || p4 == 'n'
				jmp SubjectDisplay8
				.else
				jmp ques4third2
				.endif
		
		offer5third2: 								;--------------------------------Fifth Input ------------------------
				invoke StdOut,addr ensub5
				invoke StdIn,addr o5,50
				mov[o5 + eax],0
				invoke StripLF,addr o5
				invoke atodw,addr o5
				mov o5,eax
				.if o5 == 1450 || o5 == 1465 || o5 == 2124 || o5 == 2130 || o5 == 2027 || o5 == 2131 || o5 == 2132 || o5 == 1044
				jmp ques5third2
				.else
				jmp offer5third2
				.endif
		ques5third2:
				invoke StdOut,addr display1
				invoke StdIn,addr p5,50
				.if p5 == 'Y' || p5 == 'y'
				jmp offer6third2
				.elseif p5 == 'N' || p5 == 'n'
				jmp SubjectDisplay8
				.else
				jmp ques5third2
				.endif
		
		offer6third2: 								;--------------------------------Sixth Input ------------------------
				invoke StdOut,addr ensub6
				invoke StdIn,addr o6,50
				mov[o6 + eax],0
				invoke StripLF,addr o6
				invoke atodw,addr o6
				mov o6,eax
				.if o6 == 1450 || o6 == 1465 || o6 == 2124 || o6 == 2130 || o6 == 2027 || o6 == 2131 || o6 == 2132 || o6 == 1044
				jmp ques6third2
				.else
				jmp offer6third2
				.endif
		ques6third2:
				invoke StdOut,addr display1
				invoke StdIn,addr p6,50
				.if p6 == 'Y' || p6 == 'y'
				jmp offer7third2
				.elseif p6 == 'N' || p6 == 'n'
				jmp SubjectDisplay8
				.else
				jmp ques6third2
				.endif
		
		offer7third2: 								;--------------------------------Seventh Input ------------------------
				invoke StdOut,addr ensub7
				invoke StdIn,addr o7,50
				mov[o7 + eax],0
				invoke StripLF,addr o7
				invoke atodw,addr o7
				mov o7,eax
				.if o7 == 1450 || o7 == 1465 || o7 == 2124 || o7 == 2130 || o7 == 2027 || o7 == 2131 || o7 == 2132 || o7 == 1044
				jmp ques7third2
				.else
				jmp offer7third2
				.endif
		ques7third2:
				invoke StdOut,addr display1
				invoke StdIn,addr p7,50
				.if p7 == 'Y' || p7 == 'y'
				jmp offer8third2
				.elseif p7 == 'N' || p7 == 'n'
				jmp SubjectDisplay8
				.else
				jmp ques7third2
				.endif
				
		offer8third2: 								;--------------------------------Seventh Input ------------------------
				invoke StdOut,addr ensub8
				invoke StdIn,addr o8,50
				mov[o8 + eax],0
				invoke StripLF,addr o8
				invoke atodw,addr o8
				mov o8,eax
				.if o8 == 1450 || o8 == 1465 || o8 == 2124 || o8 == 2130 || o8 == 2027 || o8 == 2131 || o8 == 2132 || o8 == 1044
				jmp SubjectDisplay8
				.else
				jmp offer8third2
				.endif
SubjectDisplay8:
					mov settings4,'0'
					mov [settings4 + eax],0
					invoke StripLF,addr settings4
					invoke atodw,addr settings4
					mov ebx,eax
			
					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr subj2
					invoke StdOut,addr heads
					invoke StdOut,addr head15
					invoke StdOut,addr head16
					
			.if o1 == 1450
								invoke StdOut,addr sub52
								mov credits28,'3'
								mov[credits28 + eax],0
								invoke StripLF,addr credits28
								invoke atodw,addr credits28
								add ebx,eax
			.elseif o1 == 1465
								invoke StdOut,addr sub53
								mov credits29,'3'
								mov[credits29 + eax],0
								invoke StripLF,addr credits29
								invoke atodw,addr credits29
								add ebx,eax
			.elseif o1 == 2124 
								invoke StdOut,addr sub54
								mov credits30,'3'
								mov[credits30 + eax],0
								invoke StripLF,addr credits30
								invoke atodw,addr credits30
								add ebx,eax
			.elseif o1 == 2130 
								invoke StdOut,addr sub55
								mov credits31,'4'
								mov[credits31 + eax],0
								invoke StripLF,addr credits31
								invoke atodw,addr credits31
								add ebx,eax
			.elseif o1 == 2027 
								invoke StdOut,addr sub56
								mov credits32,'3'
								mov[credits32 + eax],0
								invoke StripLF,addr credits32
								invoke atodw,addr credits32
								add ebx,eax
			.elseif o1 == 2131 
								invoke StdOut,addr sub57
								mov credits33,'4'
								mov[credits33 + eax],0
								invoke StripLF,addr credits33
								invoke atodw,addr credits33
								add ebx,eax
			.elseif o1 == 2132 
								invoke StdOut,addr sub58
								mov credits34,'3'
								mov[credits34 + eax],0
								invoke StripLF,addr credits34
								invoke atodw,addr credits34
								add ebx,eax
			.elseif o1 == 1044 
								invoke StdOut,addr sub59
								mov credits35,'3'
								mov[credits35 + eax],0
								invoke StripLF,addr credits35
								invoke atodw,addr credits35
								add ebx,eax
			.endif
			
			.if o2 == 1450
								invoke StdOut,addr sub52
								mov credits28,'3'
								mov[credits28 + eax],0
								invoke StripLF,addr credits28
								invoke atodw,addr credits28
								add ebx,eax
			.elseif o2 == 1465
								invoke StdOut,addr sub53
								mov credits29,'3'
								mov[credits29 + eax],0
								invoke StripLF,addr credits29
								invoke atodw,addr credits29
								add ebx,eax
			.elseif o2 == 2124 
								invoke StdOut,addr sub54
								mov credits30,'3'
								mov[credits30 + eax],0
								invoke StripLF,addr credits30
								invoke atodw,addr credits30
								add ebx,eax
			.elseif o2 == 2130 
								invoke StdOut,addr sub55
								mov credits31,'4'
								mov[credits31 + eax],0
								invoke StripLF,addr credits31
								invoke atodw,addr credits31
								add ebx,eax
			.elseif o2 == 2027 
								invoke StdOut,addr sub56
								mov credits32,'3'
								mov[credits32 + eax],0
								invoke StripLF,addr credits32
								invoke atodw,addr credits32
								add ebx,eax
			.elseif o2 == 2131 
								invoke StdOut,addr sub57
								mov credits33,'4'
								mov[credits33 + eax],0
								invoke StripLF,addr credits33
								invoke atodw,addr credits33
								add ebx,eax
			.elseif o2 == 2132 
								invoke StdOut,addr sub58
								mov credits34,'3'
								mov[credits34 + eax],0
								invoke StripLF,addr credits34
								invoke atodw,addr credits34
								add ebx,eax
			.elseif o2 == 1044 
								invoke StdOut,addr sub59
								mov credits35,'3'
								mov[credits35 + eax],0
								invoke StripLF,addr credits35
								invoke atodw,addr credits35
								add ebx,eax
			.endif
			
			.if o3 == 1450
								invoke StdOut,addr sub52
								mov credits28,'3'
								mov[credits28 + eax],0
								invoke StripLF,addr credits28
								invoke atodw,addr credits28
								add ebx,eax
			.elseif o3 == 1465
								invoke StdOut,addr sub53
								mov credits29,'3'
								mov[credits29 + eax],0
								invoke StripLF,addr credits29
								invoke atodw,addr credits29
								add ebx,eax
			.elseif o3 == 2124 
								invoke StdOut,addr sub54
								mov credits30,'3'
								mov[credits30 + eax],0
								invoke StripLF,addr credits30
								invoke atodw,addr credits30
								add ebx,eax
			.elseif o3 == 2130 
								invoke StdOut,addr sub55
								mov credits31,'4'
								mov[credits31 + eax],0
								invoke StripLF,addr credits31
								invoke atodw,addr credits31
								add ebx,eax
			.elseif o3 == 2027 
								invoke StdOut,addr sub56
								mov credits32,'3'
								mov[credits32 + eax],0
								invoke StripLF,addr credits32
								invoke atodw,addr credits32
								add ebx,eax
			.elseif o3 == 2131 
								invoke StdOut,addr sub57
								mov credits33,'4'
								mov[credits33 + eax],0
								invoke StripLF,addr credits33
								invoke atodw,addr credits33
								add ebx,eax
			.elseif o3 == 2132 
								invoke StdOut,addr sub58
								mov credits34,'3'
								mov[credits34 + eax],0
								invoke StripLF,addr credits34
								invoke atodw,addr credits34
								add ebx,eax
			.elseif o3 == 1044 
								invoke StdOut,addr sub59
								mov credits35,'3'
								mov[credits35 + eax],0
								invoke StripLF,addr credits35
								invoke atodw,addr credits35
								add ebx,eax
			.endif
			
			.if o4 == 1450
								invoke StdOut,addr sub52
								mov credits28,'3'
								mov[credits28 + eax],0
								invoke StripLF,addr credits28
								invoke atodw,addr credits28
								add ebx,eax
			.elseif o4 == 1465
								invoke StdOut,addr sub53
								mov credits29,'3'
								mov[credits29 + eax],0
								invoke StripLF,addr credits29
								invoke atodw,addr credits29
								add ebx,eax
			.elseif o4 == 2124 
								invoke StdOut,addr sub54
								mov credits30,'3'
								mov[credits30 + eax],0
								invoke StripLF,addr credits30
								invoke atodw,addr credits30
								add ebx,eax
			.elseif o4 == 2130 
								invoke StdOut,addr sub55
								mov credits31,'4'
								mov[credits31 + eax],0
								invoke StripLF,addr credits31
								invoke atodw,addr credits31
								add ebx,eax
			.elseif o4 == 2027 
								invoke StdOut,addr sub56
								mov credits32,'3'
								mov[credits32 + eax],0
								invoke StripLF,addr credits32
								invoke atodw,addr credits32
								add ebx,eax
			.elseif o4 == 2131 
								invoke StdOut,addr sub57
								mov credits33,'4'
								mov[credits33 + eax],0
								invoke StripLF,addr credits33
								invoke atodw,addr credits33
								add ebx,eax
			.elseif o4 == 2132 
								invoke StdOut,addr sub58
								mov credits34,'3'
								mov[credits34 + eax],0
								invoke StripLF,addr credits34
								invoke atodw,addr credits34
								add ebx,eax
			.elseif o4 == 1044 
								invoke StdOut,addr sub59
								mov credits35,'3'
								mov[credits35 + eax],0
								invoke StripLF,addr credits35
								invoke atodw,addr credits35
								add ebx,eax
			.endif
			
			.if o5 == 1450
								invoke StdOut,addr sub52
								mov credits28,'3'
								mov[credits28 + eax],0
								invoke StripLF,addr credits28
								invoke atodw,addr credits28
								add ebx,eax
			.elseif o5 == 1465
								invoke StdOut,addr sub53
								mov credits29,'3'
								mov[credits29 + eax],0
								invoke StripLF,addr credits29
								invoke atodw,addr credits29
								add ebx,eax
			.elseif o5 == 2124 
								invoke StdOut,addr sub54
								mov credits30,'3'
								mov[credits30 + eax],0
								invoke StripLF,addr credits30
								invoke atodw,addr credits30
								add ebx,eax
			.elseif o5 == 2130 
								invoke StdOut,addr sub55
								mov credits31,'4'
								mov[credits31 + eax],0
								invoke StripLF,addr credits31
								invoke atodw,addr credits31
								add ebx,eax
			.elseif o5 == 2027 
								invoke StdOut,addr sub56
								mov credits32,'3'
								mov[credits32 + eax],0
								invoke StripLF,addr credits32
								invoke atodw,addr credits32
								add ebx,eax
			.elseif o5 == 2131 
								invoke StdOut,addr sub57
								mov credits33,'4'
								mov[credits33 + eax],0
								invoke StripLF,addr credits33
								invoke atodw,addr credits33
								add ebx,eax
			.elseif o5 == 2132 
								invoke StdOut,addr sub58
								mov credits34,'3'
								mov[credits34 + eax],0
								invoke StripLF,addr credits34
								invoke atodw,addr credits34
								add ebx,eax
			.elseif o5 == 1044 
								invoke StdOut,addr sub59
								mov credits35,'3'
								mov[credits35 + eax],0
								invoke StripLF,addr credits35
								invoke atodw,addr credits35
								add ebx,eax
			.endif
			
			.if o6 == 1450
								invoke StdOut,addr sub52
								mov credits28,'3'
								mov[credits28 + eax],0
								invoke StripLF,addr credits28
								invoke atodw,addr credits28
								add ebx,eax
			.elseif o6 == 1465
								invoke StdOut,addr sub53
								mov credits29,'3'
								mov[credits29 + eax],0
								invoke StripLF,addr credits29
								invoke atodw,addr credits29
								add ebx,eax
			.elseif o6 == 2124 
								invoke StdOut,addr sub54
								mov credits30,'3'
								mov[credits30 + eax],0
								invoke StripLF,addr credits30
								invoke atodw,addr credits30
								add ebx,eax
			.elseif o6 == 2130 
								invoke StdOut,addr sub55
								mov credits31,'4'
								mov[credits31 + eax],0
								invoke StripLF,addr credits31
								invoke atodw,addr credits31
								add ebx,eax
			.elseif o6 == 2027 
								invoke StdOut,addr sub56
								mov credits32,'3'
								mov[credits32 + eax],0
								invoke StripLF,addr credits32
								invoke atodw,addr credits32
								add ebx,eax
			.elseif o6 == 2131 
								invoke StdOut,addr sub57
								mov credits33,'4'
								mov[credits33 + eax],0
								invoke StripLF,addr credits33
								invoke atodw,addr credits33
								add ebx,eax
			.elseif o6 == 2132 
								invoke StdOut,addr sub58
								mov credits34,'3'
								mov[credits34 + eax],0
								invoke StripLF,addr credits34
								invoke atodw,addr credits34
								add ebx,eax
			.elseif o6 == 1044 
								invoke StdOut,addr sub59
								mov credits35,'3'
								mov[credits35 + eax],0
								invoke StripLF,addr credits35
								invoke atodw,addr credits35
								add ebx,eax
			.endif
			
			.if o7 == 1450
								invoke StdOut,addr sub52
								mov credits28,'3'
								mov[credits28 + eax],0
								invoke StripLF,addr credits28
								invoke atodw,addr credits28
								add ebx,eax
			.elseif o7 == 1465
								invoke StdOut,addr sub53
								mov credits29,'3'
								mov[credits29 + eax],0
								invoke StripLF,addr credits29
								invoke atodw,addr credits29
								add ebx,eax
			.elseif o7 == 2124 
								invoke StdOut,addr sub54
								mov credits30,'3'
								mov[credits30 + eax],0
								invoke StripLF,addr credits30
								invoke atodw,addr credits30
								add ebx,eax
			.elseif o7 == 2130 
								invoke StdOut,addr sub55
								mov credits31,'4'
								mov[credits31 + eax],0
								invoke StripLF,addr credits31
								invoke atodw,addr credits31
								add ebx,eax
			.elseif o7 == 2027 
								invoke StdOut,addr sub56
								mov credits32,'3'
								mov[credits32 + eax],0
								invoke StripLF,addr credits32
								invoke atodw,addr credits32
								add ebx,eax
			.elseif o7 == 2131 
								invoke StdOut,addr sub57
								mov credits33,'4'
								mov[credits33 + eax],0
								invoke StripLF,addr credits33
								invoke atodw,addr credits33
								add ebx,eax
			.elseif o7 == 2132 
								invoke StdOut,addr sub58
								mov credits34,'3'
								mov[credits34 + eax],0
								invoke StripLF,addr credits34
								invoke atodw,addr credits34
								add ebx,eax
			.elseif o7 == 1044 
								invoke StdOut,addr sub59
								mov credits35,'3'
								mov[credits35 + eax],0
								invoke StripLF,addr credits35
								invoke atodw,addr credits35
								add ebx,eax
			.endif
			
			.if o8 == 1450
								invoke StdOut,addr sub52
								mov credits28,'3'
								mov[credits28 + eax],0
								invoke StripLF,addr credits28
								invoke atodw,addr credits28
								add ebx,eax
			.elseif o8 == 1465
								invoke StdOut,addr sub53
								mov credits29,'3'
								mov[credits29 + eax],0
								invoke StripLF,addr credits29
								invoke atodw,addr credits29
								add ebx,eax
			.elseif o8 == 2124 
								invoke StdOut,addr sub54
								mov credits30,'3'
								mov[credits30 + eax],0
								invoke StripLF,addr credits30
								invoke atodw,addr credits30
								add ebx,eax
			.elseif o8 == 2130 
								invoke StdOut,addr sub55
								mov credits31,'4'
								mov[credits31 + eax],0
								invoke StripLF,addr credits31
								invoke atodw,addr credits31
								add ebx,eax
			.elseif o8 == 2027 
								invoke StdOut,addr sub56
								mov credits32,'3'
								mov[credits32 + eax],0
								invoke StripLF,addr credits32
								invoke atodw,addr credits32
								add ebx,eax
			.elseif o8 == 2131 
								invoke StdOut,addr sub57
								mov credits33,'4'
								mov[credits33 + eax],0
								invoke StripLF,addr credits33
								invoke atodw,addr credits33
								add ebx,eax
			.elseif o8 == 2132 
								invoke StdOut,addr sub58
								mov credits34,'3'
								mov[credits34 + eax],0
								invoke StripLF,addr credits34
								invoke atodw,addr credits34
								add ebx,eax
			.elseif o8 == 1044 
								invoke StdOut,addr sub59
								mov credits35,'3'
								mov[credits35 + eax],0
								invoke StripLF,addr credits35
								invoke atodw,addr credits35
								add ebx,eax
			.endif
			
			invoke dwtoa,ebx,addr compute4
			invoke StdOut,addr space1
			invoke StdOut,addr compute4
			
							
				invoke StdOut,addr list1
				invoke StdOut,addr user1
				invoke StdOut,addr user2
				invoke StdOut,addr user3
				invoke StdOut,addr user4
				invoke StdOut,addr user5
				
			ceeds6: 
					invoke StdOut,addr proceed2
					invoke StdIn,addr ceed8,50
					.if ceed8 == 'Y' || ceed8 == 'y'
					jmp ThirdYearSummer
					.elseif ceed8 == 'N' || ceed8 == 'n'
					jmp ThirdYear
					.else
					jmp ceeds6
					.endif
ThirdYearSummer:
					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr thirdstudent
					invoke StdOut,addr Requisites
					invoke StdOut,addr output
					
					invoke StdOut,addr pre38				
					invoke StdIn,addr input16,50
					mov[input16 + eax],0
					invoke StripLF,addr input16
					invoke atodw,addr input16
					mov input16,eax
					
					invoke StdOut,addr pre39				
					invoke StdIn,addr input17,50
					mov[input17 + eax],0
					invoke StripLF,addr input17
					invoke atodw,addr input17
					mov input17,eax
					
					invoke StdOut,addr pre40				
					invoke StdIn,addr input18,50
					mov[input18 + eax],0
					invoke StripLF,addr input18
					invoke atodw,addr input18
					mov input18,eax
					
					invoke StdOut,addr pre41				
					invoke StdIn,addr input19,50
					mov[input19 + eax],0
					invoke StripLF,addr input19
					invoke atodw,addr input19
					mov input19,eax
					
				invoke ClearScreen
				mov settings5,'0'
				mov [settings5 + eax],0
				invoke StripLF,addr settings5
					invoke atodw,addr settings5
				mov ebx,eax
			
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr available1
				invoke StdOut,addr heads
				invoke StdOut,addr head17
				invoke StdOut,addr head18
				
				.if input16 >=75 && input16 <=100
				invoke StdOut,addr sub60
				mov credits39,'3'
				mov[credits39 + eax],0
				invoke StripLF,addr credits39
				invoke atodw,addr credits39
				add ebx,eax
				.endif
				
				.if input18 >=75 && input18 <=100 && input19 >=75 && input19 <=100 && input17 >=75 && input17 <=100
				invoke StdOut,addr sub61
				mov credits40,'4'
				mov[credits40 + eax],0
				invoke StripLF,addr credits40
				invoke atodw,addr credits40
				add ebx,eax
				.endif
				
				invoke dwtoa,ebx,addr compute5
				invoke StdOut,addr space1
				invoke StdOut,addr compute5
				
				invoke StdOut,addr subj
				
		offer1thirds: 								;--------------------------------First Input ------------------------
				invoke StdOut,addr ensub1
				invoke StdIn,addr q1,50
				mov[q1 + eax],0
				invoke StripLF,addr q1
				invoke atodw,addr q1
				mov q1,eax
				.if q1 == 2133 || q1 == 2134
				jmp ques1thirds
				.else
				jmp offer1thirds
				.endif
		ques1thirds:
				invoke StdOut,addr display1
				invoke StdIn,addr r1,50
				.if r1 == 'Y' || r1 == 'y'
				jmp offer2thirds
				.elseif r1 == 'N' || r1 == 'n'
				jmp SubjectDisplay9
				.else
				jmp ques1thirds
				.endif
		offer2thirds: 								;--------------------------------Second Input ------------------------
				invoke StdOut,addr ensub2
				invoke StdIn,addr q2,50
				mov[q2 + eax],0
				invoke StripLF,addr q2
				invoke atodw,addr q2
				mov q2,eax
				.if q2 == 2133 || q2 == 2134
				jmp SubjectDisplay9
				.else
				jmp offer2thirds
				.endif
				
SubjectDisplay9:

				mov settings6,'0'
				mov [settings6 + eax],0
				invoke StripLF,addr settings6
				invoke atodw,addr settings6
				mov ebx,eax
			
				invoke ClearScreen
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr subj2
				invoke StdOut,addr heads
				invoke StdOut,addr head17
				invoke StdOut,addr head18
				
				.if q1 == 2133
								invoke StdOut,addr sub60
								mov credits37,'3'
								mov[credits37 + eax],0
								invoke StripLF,addr credits37
								invoke atodw,addr credits37
								add ebx,eax
				.elseif q1 == 2134
								invoke StdOut,addr sub61
								mov credits38,'4'
								mov[credits38 + eax],0
								invoke StripLF,addr credits38
								invoke atodw,addr credits38
								add ebx,eax
				.endif
				
				.if q2 == 2133
								invoke StdOut,addr sub60
								mov credits37,'3'
								mov[credits37 + eax],0
								invoke StripLF,addr credits37
								invoke atodw,addr credits37
								add ebx,eax
				.elseif q2 == 2134
								invoke StdOut,addr sub61
								mov credits38,'4'
								mov[credits38 + eax],0
								invoke StripLF,addr credits38
								invoke atodw,addr credits38
								add ebx,eax
				.endif
				
				invoke dwtoa,ebx,addr compute6
				invoke StdOut,addr space1
				invoke StdOut,addr compute6
								
				invoke StdOut,addr list1
				invoke StdOut,addr user1
				invoke StdOut,addr user2
				invoke StdOut,addr user3
				invoke StdOut,addr user4
				invoke StdOut,addr user5
				
				ceeds7: 
					invoke StdOut,addr proceed3
					invoke StdIn,addr ceed9,50
					.if ceed9 == 'Y' || ceed9 == 'y'
					jmp ThirdYear
					.elseif ceed9 == 'N' || ceed9 == 'n'
					jmp Exit_
					.else
					jmp ceeds7
					.endif
					
FourthYear:
			invoke ClearScreen
			invoke StdOut,addr header
			invoke StdOut,addr header2
			invoke StdOut,addr header3
			invoke StdOut,addr header4
			invoke StdOut,addr header5
			invoke StdOut,addr header6
			invoke StdOut,addr header7
			invoke StdOut,addr header8
			invoke StdOut,addr names
			invoke StdOut,addr name1
			invoke StdOut,addr down
			invoke StdOut,addr fouthstudent
			invoke StdOut,addr sem1
			invoke StdOut,addr sem2
			invoke StdOut,addr sem3
			invoke StdOut,addr main
			invoke StdOut,addr yearlevel
			invoke StdIn,addr yearlevel4,50
		
		.if yearlevel4 == 'A' || yearlevel4 == 'a'
	     invoke ClearScreen
		jmp FourthYearFirstSemester
		.elseif yearlevel4 == 'B' || yearlevel4 == 'b'
		invoke ClearScreen
		jmp FourthYearSecondSemester
		.elseif yearlevel4 == 'C' || yearlevel4 == 'c'
		invoke ClearScreen
		jmp FourthYearSummer
		.elseif yearlevel4 == 'D' || yearlevel4 == 'd'
		jmp start
		.else
		jmp FourthYear
		.endif					
	
FourthYearFirstSemester:
					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr fouthstudent
					invoke StdOut,addr Requisites
					invoke StdOut,addr output
					
					invoke StdOut,addr pre42				
					invoke StdIn,addr asus1,50
					mov[asus1 + eax],0
					invoke StripLF,addr asus1
					invoke atodw,addr asus1
					mov asus1,eax
					
					invoke StdOut,addr pre43				
					invoke StdIn,addr asus2,50
					mov[asus2 + eax],0
					invoke StripLF,addr asus2
					invoke atodw,addr asus2
					mov asus2,eax
					
					invoke StdOut,addr pre44				
					invoke StdIn,addr asus3,50
					mov[asus3 + eax],0
					invoke StripLF,addr asus3
					invoke atodw,addr asus3
					mov asus3,eax
					
					invoke StdOut,addr pre45				
					invoke StdIn,addr asus4,50
					mov[asus4 + eax],0
					invoke StripLF,addr asus4
					invoke atodw,addr asus4
					mov asus4,eax
					
					invoke StdOut,addr pre46				
					invoke StdIn,addr asus5,50
					mov[asus5 + eax],0
					invoke StripLF,addr asus5
					invoke atodw,addr asus5
					mov asus5,eax
					
					invoke StdOut,addr pre47				
					invoke StdIn,addr asus6,50
					mov[asus6 + eax],0
					invoke StripLF,addr asus6
					invoke atodw,addr asus6
					mov asus6,eax
					
					invoke StdOut,addr pre48				
					invoke StdIn,addr asus7,50
					mov[asus7 + eax],0
					invoke StripLF,addr asus7
					invoke atodw,addr asus7
					mov asus7,eax
					
					invoke StdOut,addr pre49				
					invoke StdIn,addr asus8,50
					mov[asus8 + eax],0
					invoke StripLF,addr asus8
					invoke atodw,addr asus8
					mov asus8,eax
					
					invoke StdOut,addr pre50				
					invoke StdIn,addr asus9,50
					mov[asus9 + eax],0
					invoke StripLF,addr asus9
					invoke atodw,addr asus9
					mov asus9,eax
					
					invoke StdOut,addr pre51				
					invoke StdIn,addr asus10,50
					mov[asus10 + eax],0
					invoke StripLF,addr asus10
					invoke atodw,addr asus10
					mov asus10,eax
					
				invoke ClearScreen
				mov rog1,'0'
				mov [rog1 + eax],0
				invoke StripLF,addr rog1
					invoke atodw,addr rog1
				mov ebx,eax
			
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr available1
				invoke StdOut,addr heads
				invoke StdOut,addr head19
				invoke StdOut,addr head20
				
				.if asus1 >=75 && asus1 <=100
				invoke StdOut,addr sub62
				mov acer1,'3'
				mov[acer1 + eax],0
				invoke StripLF,addr acer1
				invoke atodw,addr acer1
				add ebx,eax
				.endif
				
				.if asus2 >=75 && asus2 <=100
				invoke StdOut,addr sub63
				mov acer2,'3'
				mov[acer2 + eax],0
				invoke StripLF,addr acer2
				invoke atodw,addr acer2
				add ebx,eax
				.endif
				
				.if asus3 >=75 && asus3 <=100
				invoke StdOut,addr sub64
				mov acer3,'3'
				mov[acer3 + eax],0
				invoke StripLF,addr acer3
				invoke atodw,addr acer3
				add ebx,eax
				.endif
				
				.if asus4 >=75 && asus4 <=100
				invoke StdOut,addr sub65
				mov acer4,'4'
				mov[acer4 + eax],0
				invoke StripLF,addr acer4
				invoke atodw,addr acer4
				add ebx,eax
				.endif
				
				.if asus5 >=75 && asus5 <=100 && asus6 >=75 && asus6 <=100
				invoke StdOut,addr sub66
				mov acer5,'4'
				mov[acer5 + eax],0
				invoke StripLF,addr acer5
				invoke atodw,addr acer5
				add ebx,eax
				.endif
				
				.if asus7 >=75 && asus7 <=100 && asus8 >=75 && asus8 <=100
				invoke StdOut,addr sub67
				mov acer6,'4'
				mov[acer6 + eax],0
				invoke StripLF,addr acer6
				invoke atodw,addr acer6
				add ebx,eax
				.endif
				
				.if asus9 >=75 && asus9 <=100 && asus10 >=75 && asus10 <=100
				invoke StdOut,addr sub68
				mov acer6,'4'
				mov[acer6 + eax],0
				invoke StripLF,addr acer6
				invoke atodw,addr acer6
				add ebx,eax
				.endif
				
				invoke dwtoa,ebx,addr rog2
				invoke StdOut,addr space1
				invoke StdOut,addr rog2
				
				invoke StdOut,addr subj
				
		offer1fourth: 								;--------------------------------First Input ------------------------
				invoke StdOut,addr ensub1
				invoke StdIn,addr s1,50
				mov[s1 + eax],0
				invoke StripLF,addr s1
				invoke atodw,addr s1
				mov s1,eax
				.if s1 == 1982 || s1 == 1110 || s1 == 2125 || s1 == 2139 || s1 == 2135 || s1 == 2136 || s1 == 2137
				jmp ques1fourth
				.else
				jmp offer1fourth
				.endif
		ques1fourth:
				invoke StdOut,addr display1
				invoke StdIn,addr t1,50
				.if t1 == 'Y' || t1 == 'y'
				jmp offer2fourth
				.elseif t1 == 'N' || t1 == 'n'
				jmp SubjectDisplay10
				.else
				jmp ques1fourth
				.endif
			
		offer2fourth: 								;--------------------------------Second Input ------------------------
				invoke StdOut,addr ensub2
				invoke StdIn,addr s2,50
				mov[s2 + eax],0
				invoke StripLF,addr s2
				invoke atodw,addr s2
				mov s2,eax
				.if s2 == 1982 || s2 == 1110 || s2 == 2125 || s2 == 2139 || s2 == 2135 || s2 == 2136 || s2 == 2137
				jmp ques2fourth
				.else
				jmp offer2fourth
				.endif
		ques2fourth:
				invoke StdOut,addr display1
				invoke StdIn,addr t2,50
				.if t2 == 'Y' || t2 == 'y'
				jmp offer3fourth
				.elseif t2 == 'N' || t2 == 'n'
				jmp SubjectDisplay10
				.else
				jmp ques2fourth
				.endif

		offer3fourth: 								;--------------------------------Third Input ------------------------
				invoke StdOut,addr ensub3
				invoke StdIn,addr s3,50
				mov[s3 + eax],0
				invoke StripLF,addr s3
				invoke atodw,addr s3
				mov s3,eax
				.if s3 == 1982 || s3 == 1110 || s3 == 2125 || s3 == 2139 || s3 == 2135 || s3 == 2136 || s3 == 2137
				jmp ques3fourth
				.else
				jmp offer3fourth
				.endif
		ques3fourth:
				invoke StdOut,addr display1
				invoke StdIn,addr t3,50
				.if t3 == 'Y' || t3 == 'y'
				jmp offer4fourth
				.elseif t3 == 'N' || t3 == 'n'
				jmp SubjectDisplay10
				.else
				jmp ques3fourth
				.endif
		
		offer4fourth: 								;--------------------------------Fourth Input ------------------------
				invoke StdOut,addr ensub4
				invoke StdIn,addr s4,50
				mov[s4 + eax],0
				invoke StripLF,addr s4
				invoke atodw,addr s4
				mov s4,eax
				.if s4 == 1982 || s4 == 1110 || s4 == 2125 || s4 == 2139 || s4 == 2135 || s4 == 2136 || s4 == 2137
				jmp ques4fourth
				.else
				jmp offer4fourth
				.endif
		ques4fourth:
				invoke StdOut,addr display1
				invoke StdIn,addr t4,50
				.if t4 == 'Y' || t4 == 'y'
				jmp offer5fourth
				.elseif t4 == 'N' || t4 == 'n'
				jmp SubjectDisplay10
				.else
				jmp ques4fourth
				.endif
				
		offer5fourth: 								;--------------------------------Fifth Input ------------------------
				invoke StdOut,addr ensub5
				invoke StdIn,addr s5,50
				mov[s5 + eax],0
				invoke StripLF,addr s5
				invoke atodw,addr s5
				mov s5,eax
				.if s5 == 1982 || s5 == 1110 || s5 == 2125 || s5 == 2139 || s5 == 2135 || s5 == 2136 || s5 == 2137
				jmp ques5fourth
				.else
				jmp offer5fourth
				.endif
		ques5fourth:
				invoke StdOut,addr display1
				invoke StdIn,addr t5,50
				.if t5 == 'Y' || t5 == 'y'
				jmp offer6fourth
				.elseif t5 == 'N' || t5 == 'n'
				jmp SubjectDisplay10
				.else
				jmp ques5fourth
				.endif
						
		offer6fourth: 								;--------------------------------Sixth Input ------------------------
				invoke StdOut,addr ensub6
				invoke StdIn,addr s6,50
				mov[s6 + eax],0
				invoke StripLF,addr s6
				invoke atodw,addr s6
				mov s6,eax
				.if s6 == 1982 || s6 == 1110 || s6 == 2125 || s6 == 2139 || s6 == 2135 || s6 == 2136 || s6 == 2137
				jmp ques6fourth
				.else
				jmp offer6fourth
				.endif
		ques6fourth:
				invoke StdOut,addr display1
				invoke StdIn,addr t6,50
				.if t6 == 'Y' || t6 == 'y'
				jmp offer7fourth
				.elseif t6 == 'N' || t6 == 'n'
				jmp SubjectDisplay10
				.else
				jmp ques6fourth
				.endif
								
		offer7fourth: 								;--------------------------------Seventh Input ------------------------
				invoke StdOut,addr ensub7
				invoke StdIn,addr s7,50
				mov[s7 + eax],0
				invoke StripLF,addr s7
				invoke atodw,addr s7
				mov s7,eax
				.if s7 == 1982 || s7 == 1110 || s7 == 2125 || s7 == 2139 || s7 == 2135 || s7 == 2136 || s7 == 2137
				jmp SubjectDisplay10
				.else
				jmp offer7fourth
				.endif

SubjectDisplay10:

				mov razer1,'0'
				mov [razer1 + eax],0
				invoke StripLF,addr razer1
				invoke atodw,addr razer1
				mov ebx,eax
			
				invoke ClearScreen
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr subj2
				invoke StdOut,addr heads
				invoke StdOut,addr head19
				invoke StdOut,addr head20
				
				.if s1 == 1982
								invoke StdOut,addr sub62
								mov dell1,'3'
								mov[dell1 + eax],0
								invoke StripLF,addr dell1
								invoke atodw,addr dell1
								add ebx,eax
				.elseif s1 == 1110
								invoke StdOut,addr sub63
								mov dell2,'3'
								mov[dell2 + eax],0
								invoke StripLF,addr dell2
								invoke atodw,addr dell2
								add ebx,eax
				.elseif s1 == 2125
								invoke StdOut,addr sub64
								mov dell3,'3'
								mov[dell3 + eax],0
								invoke StripLF,addr dell3
								invoke atodw,addr dell3
								add ebx,eax
				.elseif s1 == 2139
								invoke StdOut,addr sub65
								mov dell4,'4'
								mov[dell4 + eax],0
								invoke StripLF,addr dell4
								invoke atodw,addr dell4
								add ebx,eax
				.elseif s1 == 2135
								invoke StdOut,addr sub66
								mov dell5,'4'
								mov[dell5 + eax],0
								invoke StripLF,addr dell5
								invoke atodw,addr dell5
								add ebx,eax
				.elseif s1 == 2136
								invoke StdOut,addr sub67
								mov dell6,'4'
								mov[dell6 + eax],0
								invoke StripLF,addr dell6
								invoke atodw,addr dell6
								add ebx,eax
				.elseif s1 == 2137
								invoke StdOut,addr sub68
								mov dell7,'4'
								mov[dell7 + eax],0
								invoke StripLF,addr dell7
								invoke atodw,addr dell7
								add ebx,eax
				.endif
				
				.if s2 == 1982
								invoke StdOut,addr sub62
								mov dell1,'3'
								mov[dell1 + eax],0
								invoke StripLF,addr dell1
								invoke atodw,addr dell1
								add ebx,eax
				.elseif s2 == 1110
								invoke StdOut,addr sub63
								mov dell2,'3'
								mov[dell2 + eax],0
								invoke StripLF,addr dell2
								invoke atodw,addr dell2
								add ebx,eax
				.elseif s2 == 2125
								invoke StdOut,addr sub64
								mov dell3,'3'
								mov[dell3 + eax],0
								invoke StripLF,addr dell3
								invoke atodw,addr dell3
								add ebx,eax
				.elseif s2 == 2139
								invoke StdOut,addr sub65
								mov dell4,'4'
								mov[dell4 + eax],0
								invoke StripLF,addr dell4
								invoke atodw,addr dell4
								add ebx,eax
				.elseif s2 == 2135
								invoke StdOut,addr sub66
								mov dell5,'4'
								mov[dell5 + eax],0
								invoke StripLF,addr dell5
								invoke atodw,addr dell5
								add ebx,eax
				.elseif s2 == 2136
								invoke StdOut,addr sub67
								mov dell6,'4'
								mov[dell6 + eax],0
								invoke StripLF,addr dell6
								invoke atodw,addr dell6
								add ebx,eax
				.elseif s2 == 2137
								invoke StdOut,addr sub68
								mov dell7,'4'
								mov[dell7 + eax],0
								invoke StripLF,addr dell7
								invoke atodw,addr dell7
								add ebx,eax
				.endif
				
				.if s3 == 1982
								invoke StdOut,addr sub62
								mov dell1,'3'
								mov[dell1 + eax],0
								invoke StripLF,addr dell1
								invoke atodw,addr dell1
								add ebx,eax
				.elseif s3 == 1110
								invoke StdOut,addr sub63
								mov dell2,'3'
								mov[dell2 + eax],0
								invoke StripLF,addr dell2
								invoke atodw,addr dell2
								add ebx,eax
				.elseif s3 == 2125
								invoke StdOut,addr sub64
								mov dell3,'3'
								mov[dell3 + eax],0
								invoke StripLF,addr dell3
								invoke atodw,addr dell3
								add ebx,eax
				.elseif s3 == 2139
								invoke StdOut,addr sub65
								mov dell4,'4'
								mov[dell4 + eax],0
								invoke StripLF,addr dell4
								invoke atodw,addr dell4
								add ebx,eax
				.elseif s3 == 2135
								invoke StdOut,addr sub66
								mov dell5,'4'
								mov[dell5 + eax],0
								invoke StripLF,addr dell5
								invoke atodw,addr dell5
								add ebx,eax
				.elseif s3 == 2136
								invoke StdOut,addr sub67
								mov dell6,'4'
								mov[dell6 + eax],0
								invoke StripLF,addr dell6
								invoke atodw,addr dell6
								add ebx,eax
				.elseif s3 == 2137
								invoke StdOut,addr sub68
								mov dell7,'4'
								mov[dell7 + eax],0
								invoke StripLF,addr dell7
								invoke atodw,addr dell7
								add ebx,eax
				.endif
				
				.if s4 == 1982
								invoke StdOut,addr sub62
								mov dell1,'3'
								mov[dell1 + eax],0
								invoke StripLF,addr dell1
								invoke atodw,addr dell1
								add ebx,eax
				.elseif s4 == 1110
								invoke StdOut,addr sub63
								mov dell2,'3'
								mov[dell2 + eax],0
								invoke StripLF,addr dell2
								invoke atodw,addr dell2
								add ebx,eax
				.elseif s4 == 2125
								invoke StdOut,addr sub64
								mov dell3,'3'
								mov[dell3 + eax],0
								invoke StripLF,addr dell3
								invoke atodw,addr dell3
								add ebx,eax
				.elseif s4 == 2139
								invoke StdOut,addr sub65
								mov dell4,'4'
								mov[dell4 + eax],0
								invoke StripLF,addr dell4
								invoke atodw,addr dell4
								add ebx,eax
				.elseif s4 == 2135
								invoke StdOut,addr sub66
								mov dell5,'4'
								mov[dell5 + eax],0
								invoke StripLF,addr dell5
								invoke atodw,addr dell5
								add ebx,eax
				.elseif s4 == 2136
								invoke StdOut,addr sub67
								mov dell6,'4'
								mov[dell6 + eax],0
								invoke StripLF,addr dell6
								invoke atodw,addr dell6
								add ebx,eax
				.elseif s4 == 2137
								invoke StdOut,addr sub68
								mov dell7,'4'
								mov[dell7 + eax],0
								invoke StripLF,addr dell7
								invoke atodw,addr dell7
								add ebx,eax
				.endif
				
				.if s5 == 1982
								invoke StdOut,addr sub62
								mov dell1,'3'
								mov[dell1 + eax],0
								invoke StripLF,addr dell1
								invoke atodw,addr dell1
								add ebx,eax
				.elseif s5 == 1110
								invoke StdOut,addr sub63
								mov dell2,'3'
								mov[dell2 + eax],0
								invoke StripLF,addr dell2
								invoke atodw,addr dell2
								add ebx,eax
				.elseif s5 == 2125
								invoke StdOut,addr sub64
								mov dell3,'3'
								mov[dell3 + eax],0
								invoke StripLF,addr dell3
								invoke atodw,addr dell3
								add ebx,eax
				.elseif s5 == 2139
								invoke StdOut,addr sub65
								mov dell4,'4'
								mov[dell4 + eax],0
								invoke StripLF,addr dell4
								invoke atodw,addr dell4
								add ebx,eax
				.elseif s5 == 2135
								invoke StdOut,addr sub66
								mov dell5,'4'
								mov[dell5 + eax],0
								invoke StripLF,addr dell5
								invoke atodw,addr dell5
								add ebx,eax
				.elseif s5 == 2136
								invoke StdOut,addr sub67
								mov dell6,'4'
								mov[dell6 + eax],0
								invoke StripLF,addr dell6
								invoke atodw,addr dell6
								add ebx,eax
				.elseif s5 == 2137
								invoke StdOut,addr sub68
								mov dell7,'4'
								mov[dell7 + eax],0
								invoke StripLF,addr dell7
								invoke atodw,addr dell7
								add ebx,eax
				.endif
				
				.if s6 == 1982
								invoke StdOut,addr sub62
								mov dell1,'3'
								mov[dell1 + eax],0
								invoke StripLF,addr dell1
								invoke atodw,addr dell1
								add ebx,eax
				.elseif s6 == 1110
								invoke StdOut,addr sub63
								mov dell2,'3'
								mov[dell2 + eax],0
								invoke StripLF,addr dell2
								invoke atodw,addr dell2
								add ebx,eax
				.elseif s6 == 2125
								invoke StdOut,addr sub64
								mov dell3,'3'
								mov[dell3 + eax],0
								invoke StripLF,addr dell3
								invoke atodw,addr dell3
								add ebx,eax
				.elseif s6 == 2139
								invoke StdOut,addr sub65
								mov dell4,'4'
								mov[dell4 + eax],0
								invoke StripLF,addr dell4
								invoke atodw,addr dell4
								add ebx,eax
				.elseif s6 == 2135
								invoke StdOut,addr sub66
								mov dell5,'4'
								mov[dell5 + eax],0
								invoke StripLF,addr dell5
								invoke atodw,addr dell5
								add ebx,eax
				.elseif s6 == 2136
								invoke StdOut,addr sub67
								mov dell6,'4'
								mov[dell6 + eax],0
								invoke StripLF,addr dell6
								invoke atodw,addr dell6
								add ebx,eax
				.elseif s6 == 2137
								invoke StdOut,addr sub68
								mov dell7,'4'
								mov[dell7 + eax],0
								invoke StripLF,addr dell7
								invoke atodw,addr dell7
								add ebx,eax
				.endif
				
				.if s7 == 1982
								invoke StdOut,addr sub62
								mov dell1,'3'
								mov[dell1 + eax],0
								invoke StripLF,addr dell1
								invoke atodw,addr dell1
								add ebx,eax
				.elseif s7 == 1110
								invoke StdOut,addr sub63
								mov dell2,'3'
								mov[dell2 + eax],0
								invoke StripLF,addr dell2
								invoke atodw,addr dell2
								add ebx,eax
				.elseif s7 == 2125
								invoke StdOut,addr sub64
								mov dell3,'3'
								mov[dell3 + eax],0
								invoke StripLF,addr dell3
								invoke atodw,addr dell3
								add ebx,eax
				.elseif s7 == 2139
								invoke StdOut,addr sub65
								mov dell4,'4'
								mov[dell4 + eax],0
								invoke StripLF,addr dell4
								invoke atodw,addr dell4
								add ebx,eax
				.elseif s7 == 2135
								invoke StdOut,addr sub66
								mov dell5,'4'
								mov[dell5 + eax],0
								invoke StripLF,addr dell5
								invoke atodw,addr dell5
								add ebx,eax
				.elseif s7 == 2136
								invoke StdOut,addr sub67
								mov dell6,'4'
								mov[dell6 + eax],0
								invoke StripLF,addr dell6
								invoke atodw,addr dell6
								add ebx,eax
				.elseif s7 == 2137
								invoke StdOut,addr sub68
								mov dell7,'4'
								mov[dell7 + eax],0
								invoke StripLF,addr dell7
								invoke atodw,addr dell7
								add ebx,eax
				.endif
				
				invoke dwtoa,ebx,addr razer2
				invoke StdOut,addr space1
				invoke StdOut,addr razer2
								
				invoke StdOut,addr list1
				invoke StdOut,addr user1
				invoke StdOut,addr user2
				invoke StdOut,addr user3
				invoke StdOut,addr user4
				invoke StdOut,addr user5
				
			ceeds8: 
					invoke StdOut,addr proceed1
					invoke StdIn,addr ceed10,50
					.if ceed10 == 'Y' || ceed10 == 'y'
					jmp FourthYearSecondSemester
					.elseif ceed10 == 'N' || ceed10 == 'n'
					jmp FourthYear
					.else
					jmp ceeds8
					.endif
				
FourthYearSecondSemester:

					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr fouthstudent
					invoke StdOut,addr Requisites
					invoke StdOut,addr output
					
					invoke StdOut,addr pre52				
					invoke StdIn,addr flag1,50
					mov[flag1 + eax],0
					invoke StripLF,addr flag1
					invoke atodw,addr flag1
					mov flag1,eax
					
					invoke StdOut,addr pre53				
					invoke StdIn,addr flag2,50
					mov[flag2 + eax],0
					invoke StripLF,addr flag2
					invoke atodw,addr flag2
					mov flag2,eax
					
					invoke StdOut,addr pre54				
					invoke StdIn,addr flag3,50
					mov[flag3 + eax],0
					invoke StripLF,addr flag3
					invoke atodw,addr flag3
					mov flag3,eax
					
					invoke StdOut,addr pre55				
					invoke StdIn,addr flag4,50
					mov[flag4 + eax],0
					invoke StripLF,addr flag4
					invoke atodw,addr flag4
					mov flag4,eax
					
					invoke StdOut,addr pre56				
					invoke StdIn,addr flag5,50
					mov[flag5 + eax],0
					invoke StripLF,addr flag5
					invoke atodw,addr flag5
					mov flag5,eax
					
					invoke StdOut,addr pre57				
					invoke StdIn,addr flag6,50
					mov[flag6 + eax],0
					invoke StripLF,addr flag6
					invoke atodw,addr flag6
					mov flag6,eax
					
					invoke StdOut,addr pre58				
					invoke StdIn,addr flag7,50
					mov[flag7 + eax],0
					invoke StripLF,addr flag7
					invoke atodw,addr flag7
					mov flag7,eax
					
					invoke StdOut,addr pre59				
					invoke StdIn,addr flag8,50
					mov[flag8 + eax],0
					invoke StripLF,addr flag8
					invoke atodw,addr flag8
					mov flag8,eax
					
					invoke StdOut,addr pre70				
					invoke StdIn,addr flag9,50
					mov[flag9 + eax],0
					invoke StripLF,addr flag9
					invoke atodw,addr flag9
					mov flag9,eax
					
					invoke ClearScreen
				mov black1,'0'
				mov [black1 + eax],0
				invoke StripLF,addr black1
					invoke atodw,addr black1
				mov ebx,eax
			
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr available1
				invoke StdOut,addr heads
				invoke StdOut,addr head21
				invoke StdOut,addr head22
				
				.if flag1 >=75 && flag1 <=100
				invoke StdOut,addr sub69
				mov rogue1,'3'
				mov[rogue1 + eax],0
				invoke StripLF,addr rogue1
				invoke atodw,addr rogue1
				add ebx,eax
				.endif
				
				.if flag2 >=75 && flag2 <=100
				invoke StdOut,addr sub70
				mov rogue2,'3'
				mov[rogue2 + eax],0
				invoke StripLF,addr rogue2
				invoke atodw,addr rogue2
				add ebx,eax
				.endif
				
				.if flag3 >=75 && flag3 <=100 && flag4 >=75 && flag4 <=100
				invoke StdOut,addr sub71
				mov rogue3,'4'
				mov[rogue3 + eax],0
				invoke StripLF,addr rogue3
				invoke atodw,addr rogue3
				add ebx,eax
				.endif
				
				.if flag5 >=75 && flag5 <=100 && flag6 >=75 && flag6 <=100
				invoke StdOut,addr sub72
				mov rogue4,'3'
				mov[rogue4 + eax],0
				invoke StripLF,addr rogue4
				invoke atodw,addr rogue4
				add ebx,eax
				.endif
				
				.if flag7 >=75 && flag7 <=100 && flag3 >=75 && flag3 <=100
				invoke StdOut,addr sub73
				mov rogue5,'4'
				mov[rogue5 + eax],0
				invoke StripLF,addr rogue5
				invoke atodw,addr rogue5
				add ebx,eax
				.endif
				
				.if flag8 >=75 && flag8 <=100
				invoke StdOut,addr sub74
				mov rogue6,'4'
				mov[rogue6 + eax],0
				invoke StripLF,addr rogue6
				invoke atodw,addr rogue6
				add ebx,eax
				.endif
				
				.if flag9 >=75 && flag9 <=100 && flag3 >=75 && flag3 <=100
				invoke StdOut,addr sub75
				mov rogue7,'4'
				mov[rogue7 + eax],0
				invoke StripLF,addr rogue7
				invoke atodw,addr rogue7
				add ebx,eax
				.endif
				
				invoke dwtoa,ebx,addr black2
				invoke StdOut,addr space1
				invoke StdOut,addr black2
				
				invoke StdOut,addr subj
				
		offer1fourth2: 								;--------------------------------First Input ------------------------
				invoke StdOut,addr ensub1
				invoke StdIn,addr u1,50
				mov[u1 + eax],0
				invoke StripLF,addr u1
				invoke atodw,addr u1
				mov u1,eax
				.if u1 == 1498 || u1 == 1469 || u1 == 2138 || u1 == 1526 || u1 == 2144 || u1 == 2140 || u1 == 2141
				jmp ques1fourth2
				.else
				jmp offer1fourth2
				.endif
		ques1fourth2:
				invoke StdOut,addr display1
				invoke StdIn,addr v1,50
				.if v1 == 'Y' || v1 == 'y'
				jmp offer2fourth2
				.elseif v1 == 'N' || v1 == 'n'
				jmp SubjectDisplay11
				.else
				jmp ques1fourth2
				.endif
				
		offer2fourth2: 								;--------------------------------Second Input ------------------------
				invoke StdOut,addr ensub2
				invoke StdIn,addr u2,50
				mov[u2 + eax],0
				invoke StripLF,addr u2
				invoke atodw,addr u2
				mov u2,eax
				.if u2 == 1498 || u2 == 1469 || u2 == 2138 || u2 == 1526 || u2 == 2144 || u2 == 2140 || u2 == 2141
				jmp ques2fourth2
				.else
				jmp offer2fourth2
				.endif
		ques2fourth2:
				invoke StdOut,addr display1
				invoke StdIn,addr v2,50
				.if v2 == 'Y' || v2 == 'y'
				jmp offer3fourth2
				.elseif v2 == 'N' || v2 == 'n'
				jmp SubjectDisplay11
				.else
				jmp ques2fourth2
				.endif
				
		offer3fourth2: 								;--------------------------------Third Input ------------------------
				invoke StdOut,addr ensub3
				invoke StdIn,addr u3,50
				mov[u3 + eax],0
				invoke StripLF,addr u3
				invoke atodw,addr u3
				mov u3,eax
				.if u3 == 1498 || u3 == 1469 || u3 == 2138 || u3 == 1526 || u3 == 2144 || u3 == 2140 || u3 == 2141
				jmp ques3fourth2
				.else
				jmp offer3fourth2
				.endif
		ques3fourth2:
				invoke StdOut,addr display1
				invoke StdIn,addr v3,50
				.if v3 == 'Y' || v3 == 'y'
				jmp offer4fourth2
				.elseif v3 == 'N' || v3 == 'n'
				jmp SubjectDisplay11
				.else
				jmp ques3fourth2
				.endif
				
		offer4fourth2: 								;--------------------------------Fourth Input ------------------------
				invoke StdOut,addr ensub4
				invoke StdIn,addr u4,50
				mov[u4 + eax],0
				invoke StripLF,addr u4
				invoke atodw,addr u4
				mov u4,eax
				.if u4 == 1498 || u4 == 1469 || u4 == 2138 || u4 == 1526 || u4 == 2144 || u4 == 2140 || u4 == 2141
				jmp ques4fourth2
				.else
				jmp offer4fourth2
				.endif
		ques4fourth2:
				invoke StdOut,addr display1
				invoke StdIn,addr v4,50
				.if v4 == 'Y' || v4 == 'y'
				jmp offer5fourth2
				.elseif v4 == 'N' || v4 == 'n'
				jmp SubjectDisplay11
				.else
				jmp ques4fourth2
				.endif
				
		offer5fourth2: 								;--------------------------------Fifth Input ------------------------
				invoke StdOut,addr ensub5
				invoke StdIn,addr u5,50
				mov[u5 + eax],0
				invoke StripLF,addr u5
				invoke atodw,addr u5
				mov u5,eax
				.if u5 == 1498 || u5 == 1469 || u5 == 2138 || u5 == 1526 || u5 == 2144 || u5 == 2140 || u5 == 2141
				jmp ques5fourth2
				.else
				jmp offer5fourth2
				.endif
		ques5fourth2:
				invoke StdOut,addr display1
				invoke StdIn,addr v5,50
				.if v5 == 'Y' || v5 == 'y'
				jmp offer6fourth2
				.elseif v5 == 'N' || v5 == 'n'
				jmp SubjectDisplay11
				.else
				jmp ques5fourth2
				.endif
						
		offer6fourth2: 								;--------------------------------Sixth Input ------------------------
				invoke StdOut,addr ensub6
				invoke StdIn,addr u6,50
				mov[u6 + eax],0
				invoke StripLF,addr u6
				invoke atodw,addr u6
				mov u6,eax
				.if u6 == 1498 || u6 == 1469 || u6 == 2138 || u6 == 1526 || u6 == 2144 || u6 == 2140 || u6 == 2141
				jmp ques6fourth2
				.else
				jmp offer6fourth2
				.endif
		ques6fourth2:
				invoke StdOut,addr display1
				invoke StdIn,addr v6,50
				.if v6 == 'Y' || v6 == 'y'
				jmp offer7fourth2
				.elseif v6 == 'N' || v6 == 'n'
				jmp SubjectDisplay11
				.else
				jmp ques6fourth2
				.endif
				
		offer7fourth2: 								;--------------------------------Sixth Input ------------------------
				invoke StdOut,addr ensub7
				invoke StdIn,addr u7,50
				mov[u7 + eax],0
				invoke StripLF,addr u7
				invoke atodw,addr u7
				mov u7,eax
				.if u7 == 1498 || u7 == 1469 || u7 == 2138 || u7 == 1526 || u7 == 2144 || u7 == 2140 || u7 == 2141
				jmp SubjectDisplay11
				.else
				jmp offer7fourth2
				.endif
SubjectDisplay11:

				mov black3,'0'
				mov [black3 + eax],0
				invoke StripLF,addr black3
				invoke atodw,addr black3
				mov ebx,eax
			
				invoke ClearScreen
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr subj2
				invoke StdOut,addr heads
				invoke StdOut,addr head21
				invoke StdOut,addr head22
				
				.if u1 == 1498
								invoke StdOut,addr sub69
								mov unity1,'3'
								mov[unity1 + eax],0
								invoke StripLF,addr unity1
								invoke atodw,addr unity1
								add ebx,eax
				.elseif u1 == 1469
								invoke StdOut,addr sub70
								mov unity2,'3'
								mov[unity2 + eax],0
								invoke StripLF,addr unity2
								invoke atodw,addr unity2
								add ebx,eax
				.elseif u1 == 2138
								invoke StdOut,addr sub71
								mov unity3,'4'
								mov[unity3 + eax],0
								invoke StripLF,addr unity3
								invoke atodw,addr unity3
								add ebx,eax
				.elseif u1 == 1526
								invoke StdOut,addr sub72
								mov unity4,'3'
								mov[unity4 + eax],0
								invoke StripLF,addr unity4
								invoke atodw,addr unity4
								add ebx,eax
				.elseif u1 == 2144
								invoke StdOut,addr sub73
								mov unity5,'4'
								mov[unity5 + eax],0
								invoke StripLF,addr unity5
								invoke atodw,addr unity5
								add ebx,eax
				.elseif u1 == 2140
								invoke StdOut,addr sub74
								mov unity6,'4'
								mov[unity6 + eax],0
								invoke StripLF,addr unity6
								invoke atodw,addr unity6
								add ebx,eax
				.elseif u1 == 2141
								invoke StdOut,addr sub75
								mov unity7,'4'
								mov[unity7 + eax],0
								invoke StripLF,addr unity7
								invoke atodw,addr unity7
								add ebx,eax
				.endif
				
				.if u2 == 1498
								invoke StdOut,addr sub69
								mov unity1,'3'
								mov[unity1 + eax],0
								invoke StripLF,addr unity1
								invoke atodw,addr unity1
								add ebx,eax
				.elseif u2 == 1469
								invoke StdOut,addr sub70
								mov unity2,'3'
								mov[unity2 + eax],0
								invoke StripLF,addr unity2
								invoke atodw,addr unity2
								add ebx,eax
				.elseif u2 == 2138
								invoke StdOut,addr sub71
								mov unity3,'4'
								mov[unity3 + eax],0
								invoke StripLF,addr unity3
								invoke atodw,addr unity3
								add ebx,eax
				.elseif u2 == 1526
								invoke StdOut,addr sub72
								mov unity4,'3'
								mov[unity4 + eax],0
								invoke StripLF,addr unity4
								invoke atodw,addr unity4
								add ebx,eax
				.elseif u2 == 2144
								invoke StdOut,addr sub73
								mov unity5,'4'
								mov[unity5 + eax],0
								invoke StripLF,addr unity5
								invoke atodw,addr unity5
								add ebx,eax
				.elseif u2 == 2140
								invoke StdOut,addr sub74
								mov unity6,'4'
								mov[unity6 + eax],0
								invoke StripLF,addr unity6
								invoke atodw,addr unity6
								add ebx,eax
				.elseif u2 == 2141
								invoke StdOut,addr sub75
								mov unity7,'4'
								mov[unity7 + eax],0
								invoke StripLF,addr unity7
								invoke atodw,addr unity7
								add ebx,eax
				.endif
				
				.if u3 == 1498
								invoke StdOut,addr sub69
								mov unity1,'3'
								mov[unity1 + eax],0
								invoke StripLF,addr unity1
								invoke atodw,addr unity1
								add ebx,eax
				.elseif u3 == 1469
								invoke StdOut,addr sub70
								mov unity2,'3'
								mov[unity2 + eax],0
								invoke StripLF,addr unity2
								invoke atodw,addr unity2
								add ebx,eax
				.elseif u3 == 2138
								invoke StdOut,addr sub71
								mov unity3,'4'
								mov[unity3 + eax],0
								invoke StripLF,addr unity3
								invoke atodw,addr unity3
								add ebx,eax
				.elseif u3 == 1526
								invoke StdOut,addr sub72
								mov unity4,'3'
								mov[unity4 + eax],0
								invoke StripLF,addr unity4
								invoke atodw,addr unity4
								add ebx,eax
				.elseif u3 == 2144
								invoke StdOut,addr sub73
								mov unity5,'4'
								mov[unity5 + eax],0
								invoke StripLF,addr unity5
								invoke atodw,addr unity5
								add ebx,eax
				.elseif u3 == 2140
								invoke StdOut,addr sub74
								mov unity6,'4'
								mov[unity6 + eax],0
								invoke StripLF,addr unity6
								invoke atodw,addr unity6
								add ebx,eax
				.elseif u3 == 2141
								invoke StdOut,addr sub75
								mov unity7,'4'
								mov[unity7 + eax],0
								invoke StripLF,addr unity7
								invoke atodw,addr unity7
								add ebx,eax
				.endif
				
				.if u4 == 1498
								invoke StdOut,addr sub69
								mov unity1,'3'
								mov[unity1 + eax],0
								invoke StripLF,addr unity1
								invoke atodw,addr unity1
								add ebx,eax
				.elseif u4 == 1469
								invoke StdOut,addr sub70
								mov unity2,'3'
								mov[unity2 + eax],0
								invoke StripLF,addr unity2
								invoke atodw,addr unity2
								add ebx,eax
				.elseif u4 == 2138
								invoke StdOut,addr sub71
								mov unity3,'4'
								mov[unity3 + eax],0
								invoke StripLF,addr unity3
								invoke atodw,addr unity3
								add ebx,eax
				.elseif u4 == 1526
								invoke StdOut,addr sub72
								mov unity4,'3'
								mov[unity4 + eax],0
								invoke StripLF,addr unity4
								invoke atodw,addr unity4
								add ebx,eax
				.elseif u4 == 2144
								invoke StdOut,addr sub73
								mov unity5,'4'
								mov[unity5 + eax],0
								invoke StripLF,addr unity5
								invoke atodw,addr unity5
								add ebx,eax
				.elseif u4 == 2140
								invoke StdOut,addr sub74
								mov unity6,'4'
								mov[unity6 + eax],0
								invoke StripLF,addr unity6
								invoke atodw,addr unity6
								add ebx,eax
				.elseif u4 == 2141
								invoke StdOut,addr sub75
								mov unity7,'4'
								mov[unity7 + eax],0
								invoke StripLF,addr unity7
								invoke atodw,addr unity7
								add ebx,eax
				.endif
				
				.if u5 == 1498
								invoke StdOut,addr sub69
								mov unity1,'3'
								mov[unity1 + eax],0
								invoke StripLF,addr unity1
								invoke atodw,addr unity1
								add ebx,eax
				.elseif u5 == 1469
								invoke StdOut,addr sub70
								mov unity2,'3'
								mov[unity2 + eax],0
								invoke StripLF,addr unity2
								invoke atodw,addr unity2
								add ebx,eax
				.elseif u5 == 2138
								invoke StdOut,addr sub71
								mov unity3,'4'
								mov[unity3 + eax],0
								invoke StripLF,addr unity3
								invoke atodw,addr unity3
								add ebx,eax
				.elseif u5 == 1526
								invoke StdOut,addr sub72
								mov unity4,'3'
								mov[unity4 + eax],0
								invoke StripLF,addr unity4
								invoke atodw,addr unity4
								add ebx,eax
				.elseif u5 == 2144
								invoke StdOut,addr sub73
								mov unity5,'4'
								mov[unity5 + eax],0
								invoke StripLF,addr unity5
								invoke atodw,addr unity5
								add ebx,eax
				.elseif u5 == 2140
								invoke StdOut,addr sub74
								mov unity6,'4'
								mov[unity6 + eax],0
								invoke StripLF,addr unity6
								invoke atodw,addr unity6
								add ebx,eax
				.elseif u5 == 2141
								invoke StdOut,addr sub75
								mov unity7,'4'
								mov[unity7 + eax],0
								invoke StripLF,addr unity7
								invoke atodw,addr unity7
								add ebx,eax
				.endif
				
				.if u6 == 1498
								invoke StdOut,addr sub69
								mov unity1,'3'
								mov[unity1 + eax],0
								invoke StripLF,addr unity1
								invoke atodw,addr unity1
								add ebx,eax
				.elseif u6 == 1469
								invoke StdOut,addr sub70
								mov unity2,'3'
								mov[unity2 + eax],0
								invoke StripLF,addr unity2
								invoke atodw,addr unity2
								add ebx,eax
				.elseif u6 == 2138
								invoke StdOut,addr sub71
								mov unity3,'4'
								mov[unity3 + eax],0
								invoke StripLF,addr unity3
								invoke atodw,addr unity3
								add ebx,eax
				.elseif u6 == 1526
								invoke StdOut,addr sub72
								mov unity4,'3'
								mov[unity4 + eax],0
								invoke StripLF,addr unity4
								invoke atodw,addr unity4
								add ebx,eax
				.elseif u6 == 2144
								invoke StdOut,addr sub73
								mov unity5,'4'
								mov[unity5 + eax],0
								invoke StripLF,addr unity5
								invoke atodw,addr unity5
								add ebx,eax
				.elseif u6 == 2140
								invoke StdOut,addr sub74
								mov unity6,'4'
								mov[unity6 + eax],0
								invoke StripLF,addr unity6
								invoke atodw,addr unity6
								add ebx,eax
				.elseif u6 == 2141
								invoke StdOut,addr sub75
								mov unity7,'4'
								mov[unity7 + eax],0
								invoke StripLF,addr unity7
								invoke atodw,addr unity7
								add ebx,eax
				.endif
				
				.if u7 == 1498
								invoke StdOut,addr sub69
								mov unity1,'3'
								mov[unity1 + eax],0
								invoke StripLF,addr unity1
								invoke atodw,addr unity1
								add ebx,eax
				.elseif u7 == 1469
								invoke StdOut,addr sub70
								mov unity2,'3'
								mov[unity2 + eax],0
								invoke StripLF,addr unity2
								invoke atodw,addr unity2
								add ebx,eax
				.elseif u7 == 2138
								invoke StdOut,addr sub71
								mov unity3,'4'
								mov[unity3 + eax],0
								invoke StripLF,addr unity3
								invoke atodw,addr unity3
								add ebx,eax
				.elseif u7 == 1526
								invoke StdOut,addr sub72
								mov unity4,'3'
								mov[unity4 + eax],0
								invoke StripLF,addr unity4
								invoke atodw,addr unity4
								add ebx,eax
				.elseif u7 == 2144
								invoke StdOut,addr sub73
								mov unity5,'4'
								mov[unity5 + eax],0
								invoke StripLF,addr unity5
								invoke atodw,addr unity5
								add ebx,eax
				.elseif u7 == 2140
								invoke StdOut,addr sub74
								mov unity6,'4'
								mov[unity6 + eax],0
								invoke StripLF,addr unity6
								invoke atodw,addr unity6
								add ebx,eax
				.elseif u7 == 2141
								invoke StdOut,addr sub75
								mov unity7,'4'
								mov[unity7 + eax],0
								invoke StripLF,addr unity7
								invoke atodw,addr unity7
								add ebx,eax
				.endif
				
				invoke dwtoa,ebx,addr black4
				invoke StdOut,addr space1
				invoke StdOut,addr black4
								
				invoke StdOut,addr list1
				invoke StdOut,addr user1
				invoke StdOut,addr user2
				invoke StdOut,addr user3
				invoke StdOut,addr user4
				invoke StdOut,addr user5
				
				ceeds9: 
					invoke StdOut,addr proceed2
					invoke StdIn,addr ceed11,50
					.if ceed11 == 'Y' || ceed11 == 'y'
					jmp FourthYearSummer
					.elseif ceed11 == 'N' || ceed11 == 'n'
					jmp FourthYear
					.else
					jmp ceeds9
					.endif
				
FourthYearSummer:
				
					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr fouthstudent
					invoke StdOut,addr Requisites
					invoke StdOut,addr output
					
					invoke StdOut,addr pre71				
					invoke StdIn,addr toshiba1,50
					mov[toshiba1 + eax],0
					invoke StripLF,addr toshiba1
					invoke atodw,addr toshiba1
					mov toshiba1,eax
					
				invoke ClearScreen
				mov mouse1,'0'
				mov [mouse1 + eax],0
				invoke StripLF,addr mouse1
					invoke atodw,addr mouse1
				mov ebx,eax
			
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr available1
				invoke StdOut,addr heads
				invoke StdOut,addr head23
				invoke StdOut,addr head24
				
				.if toshiba1 >=75 && toshiba1 <=100
				invoke StdOut,addr sub76
				mov lenovo1,'3'
				mov[lenovo1 + eax],0
				invoke StripLF,addr lenovo1
				invoke atodw,addr lenovo1
				add ebx,eax
				.endif
				
				invoke dwtoa,ebx,addr mouse2
				invoke StdOut,addr space1
				invoke StdOut,addr mouse2
				
				invoke StdOut,addr subj
					.if toshiba1 >=75 && toshiba1 <=100		
		offer1fourths: 								;--------------------------------First Input ------------------------
				invoke StdOut,addr ensub1
				invoke StdIn,addr wx1,50
				mov[wx1 + eax],0
				invoke StripLF,addr wx1
				invoke atodw,addr wx1
				mov wx1,eax
				.if wx1 == 2142
				jmp SubjectDisplay13
				.else
				jmp offer1fourths
				.endif
					.else
					jmp ceeds10
					.endif
SubjectDisplay13:
				mov black3,'0'
				mov [black3 + eax],0
				invoke StripLF,addr black3
				invoke atodw,addr black3
				mov ebx,eax
			
				invoke ClearScreen
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr subj2
				invoke StdOut,addr heads
				invoke StdOut,addr head23
				invoke StdOut,addr head24
				
				.if wx1 == 2142
								invoke StdOut,addr sub76
								mov key1,'3'
								mov[key1 + eax],0
								invoke StripLF,addr key1
								invoke atodw,addr key1
								add ebx,eax
				.endif
				
				invoke dwtoa,ebx,addr black4
				invoke StdOut,addr space1
				invoke StdOut,addr black4
								
				invoke StdOut,addr list1
				invoke StdOut,addr user1
				invoke StdOut,addr user2
				invoke StdOut,addr user3
				invoke StdOut,addr user4
				invoke StdOut,addr user5
				
				ceeds10: 
					invoke StdOut,addr proceed3
					invoke StdIn,addr ceed12,50
					.if ceed12 == 'Y' || ceed12 == 'y'
					jmp FourthYear
					.elseif ceed12 == 'N' || ceed12 == 'n'
					jmp Exit_
					.else
					jmp ceeds10
					.endif
FifthYear:

		invoke ClearScreen
		invoke StdOut,addr header
		invoke StdOut,addr header2
		invoke StdOut,addr header3
		invoke StdOut,addr header4
		invoke StdOut,addr header5
		invoke StdOut,addr header6
		invoke StdOut,addr header7
		invoke StdOut,addr header8
		invoke StdOut,addr names
		invoke StdOut,addr name1
		invoke StdOut,addr down
		invoke StdOut,addr fifthstudent
		invoke StdOut,addr sem1
		invoke StdOut,addr sem2
		invoke StdOut,addr sem4
		invoke StdOut,addr yearlevel
		invoke StdIn,addr yearlevel5,50
		
		.if yearlevel5 == 'A' || yearlevel5 == 'a'
			invoke ClearScreen
			jmp FifthYearFirstSemester
		.elseif yearlevel5 == 'B' || yearlevel5 == 'b'
			invoke ClearScreen
			jmp FifthYearSecondSemester
		.elseif yearlevel5 == 'C' || yearlevel5 == 'c'
			jmp start
		.else 
			jmp SecondYear
		.endif
FifthYearFirstSemester:
					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr fifthstudent
					invoke StdOut,addr Requisites
					invoke StdOut,addr output
					
					invoke StdOut,addr pre72				
					invoke StdIn,addr star1,50
					mov[star1 + eax],0
					invoke StripLF,addr star1
					invoke atodw,addr star1
					mov star1,eax
					
					invoke StdOut,addr pre73				
					invoke StdIn,addr star2,50
					mov[star2 + eax],0
					invoke StripLF,addr star2
					invoke atodw,addr star2
					mov star2,eax
					
					invoke StdOut,addr pre74				
					invoke StdIn,addr star3,50
					mov[star3 + eax],0
					invoke StripLF,addr star3
					invoke atodw,addr star3
					mov star3,eax
					
					invoke StdOut,addr pre75				
					invoke StdIn,addr star4,50
					mov[star4 + eax],0
					invoke StripLF,addr star4
					invoke atodw,addr star4
					mov star4,eax
					
					invoke StdOut,addr pre76				
					invoke StdIn,addr star5,50
					mov[star5 + eax],0
					invoke StripLF,addr star5
					invoke atodw,addr star5
					mov star5,eax
					
					invoke StdOut,addr pre77				
					invoke StdIn,addr star6,50
					mov[star6 + eax],0
					invoke StripLF,addr star6
					invoke atodw,addr star6
					mov star6,eax
					
					invoke StdOut,addr pre79				
					invoke StdIn,addr star8,50
					mov[star8 + eax],0
					invoke StripLF,addr star8
					invoke atodw,addr star8
					mov star8,eax
					
					invoke StdOut,addr pre81				
					invoke StdIn,addr star10,50
					mov[star10 + eax],0
					invoke StripLF,addr star10
					invoke atodw,addr star10
					mov star10,eax
					
				invoke ClearScreen
				mov galaxy1,'0'
				mov [galaxy1 + eax],0
				invoke StripLF,addr galaxy1
					invoke atodw,addr galaxy1
				mov ebx,eax
			
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr available1
				invoke StdOut,addr heads
				invoke StdOut,addr head25
				invoke StdOut,addr head26
				
				.if star1 >=75 && star1 <=100 && star2 >=75 && star2 <=100 && star3 >=75 && star3 <=100
				invoke StdOut,addr sub77
				mov moon1,'4'
				mov[moon1 + eax],0
				invoke StripLF,addr moon1
				invoke atodw,addr moon1
				add ebx,eax
				.endif
				
				.if star4 >=75 && star4 <=100 && star5 >=75 && star5 <=100 && star6 >=75 && star6 <=100
				invoke StdOut,addr sub78
				mov moon2,'4'
				mov[moon2 + eax],0
				invoke StripLF,addr moon2
				invoke atodw,addr moon2
				add ebx,eax
				.endif
				
				.if star3 >=75 && star3 <=100
				invoke StdOut,addr sub79
				mov moon3,'4'
				mov[moon3 + eax],0
				invoke StripLF,addr moon3
				invoke atodw,addr moon3
				add ebx,eax
				.endif
				
				.if star8 >=75 && star8 <=100
				invoke StdOut,addr sub80
				mov moon4,'3'
				mov[moon4 + eax],0
				invoke StripLF,addr moon4
				invoke atodw,addr moon4
				add ebx,eax
				.endif
				
				.if star8 >=75 && star8 <=100
				invoke StdOut,addr sub81
				mov moon5,'1'
				mov[moon5 + eax],0
				invoke StripLF,addr moon5
				invoke atodw,addr moon5
				add ebx,eax
				.endif
				
				.if star10 >=75 && star10 <=100
				invoke StdOut,addr sub82
				mov moon6,'4'
				mov[moon6 + eax],0
				invoke StripLF,addr moon6
				invoke atodw,addr moon6
				add ebx,eax
				.endif
				
				invoke dwtoa,ebx,addr galaxy2
				invoke StdOut,addr space1
				invoke StdOut,addr galaxy2
				
				invoke StdOut,addr subj
				
		offer1fifth: 								;--------------------------------First Input ------------------------
				invoke StdOut,addr ensub1
				invoke StdIn,addr w1,50
				mov[w1 + eax],0
				invoke StripLF,addr w1
				invoke atodw,addr w1
				mov w1,eax
				.if w1 == 2143 || w1 == 2145 || w1 == 2146 || w1 == 1532 || w1 == 2147 || w1 == 2148
				jmp ques1fifth
				.else
				jmp offer1fifth
				.endif
		ques1fifth:
				invoke StdOut,addr display1
				invoke StdIn,addr x1,50
				.if x1 == 'Y' || x1 == 'y'
				jmp offer2fifth
				.elseif x1 == 'N' || x1 == 'n'
				jmp SubjectDisplay14
				.else
				jmp ques1fifth
				.endif
						
		offer2fifth: 								;--------------------------------Second Input ------------------------
				invoke StdOut,addr ensub2
				invoke StdIn,addr w2,50
				mov[w2 + eax],0
				invoke StripLF,addr w2
				invoke atodw,addr w2
				mov w2,eax
				.if w2 == 2143 || w2 == 2145 || w2 == 2146 || w2 == 1532 || w2 == 2147 || w2 == 2148
				jmp ques2fifth
				.else
				jmp offer2fifth
				.endif
		ques2fifth:
				invoke StdOut,addr display1
				invoke StdIn,addr x2,50
				.if x2 == 'Y' || x2 == 'y'
				jmp offer3fifth
				.elseif x2 == 'N' || x2 == 'n'
				jmp SubjectDisplay14
				.else
				jmp ques2fifth
				.endif
								
		offer3fifth: 								;--------------------------------Third Input ------------------------
				invoke StdOut,addr ensub3
				invoke StdIn,addr w3,50
				mov[w3 + eax],0
				invoke StripLF,addr w3
				invoke atodw,addr w3
				mov w3,eax
				.if w3 == 2143 || w3 == 2145 || w3 == 2146 || w3 == 1532 || w3 == 2147 || w3 == 2148
				jmp ques3fifth
				.else
				jmp offer3fifth
				.endif
		ques3fifth:
				invoke StdOut,addr display1
				invoke StdIn,addr x3,50
				.if x3 == 'Y' || x3 == 'y'
				jmp offer4fifth
				.elseif x3 == 'N' || x3 == 'n'
				jmp SubjectDisplay14
				.else
				jmp ques3fifth
				.endif
										
		offer4fifth: 								;--------------------------------Fourth Input ------------------------
				invoke StdOut,addr ensub4
				invoke StdIn,addr w4,50
				mov[w4 + eax],0
				invoke StripLF,addr w4
				invoke atodw,addr w4
				mov w4,eax
				.if w4 == 2143 || w4 == 2145 || w4 == 2146 || w4 == 1532 || w4 == 2147 || w4 == 2148
				jmp ques4fifth
				.else
				jmp offer4fifth
				.endif
		ques4fifth:
				invoke StdOut,addr display1
				invoke StdIn,addr x4,50
				.if x4 == 'Y' || x4 == 'y'
				jmp offer5fifth
				.elseif x4 == 'N' || x4 == 'n'
				jmp SubjectDisplay14
				.else
				jmp ques4fifth
				.endif
												
		offer5fifth: 								;--------------------------------Fifth Input ------------------------
				invoke StdOut,addr ensub5
				invoke StdIn,addr w5,50
				mov[w5 + eax],0
				invoke StripLF,addr w5
				invoke atodw,addr w5
				mov w5,eax
				.if w5 == 2143 || w5 == 2145 || w5 == 2146 || w5 == 1532 || w5 == 2147 || w5 == 2148
				jmp ques5fifth
				.else
				jmp offer5fifth
				.endif
		ques5fifth:
				invoke StdOut,addr display1
				invoke StdIn,addr x5,50
				.if x5 == 'Y' || x5 == 'y'
				jmp offer6fifth
				.elseif x5 == 'N' || x5 == 'n'
				jmp SubjectDisplay14
				.else
				jmp ques4fifth
				.endif
		
		offer6fifth: 								;--------------------------------Sixth Input ------------------------
				invoke StdOut,addr ensub6
				invoke StdIn,addr w6,50
				mov[w6 + eax],0
				invoke StripLF,addr w6
				invoke atodw,addr w6
				mov w6,eax
				.if w6 == 2143 || w6 == 2145 || w6 == 2146 || w6 == 1532 || w6 == 2147 || w6 == 2148
				jmp SubjectDisplay14
				.else
				jmp offer6fifth
				.endif
							
SubjectDisplay14:

				mov galaxy3,'0'
				mov [galaxy3 + eax],0
				invoke StripLF,addr galaxy3
				invoke atodw,addr galaxy3
				mov ebx,eax
			
				invoke ClearScreen
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr subj2
				invoke StdOut,addr heads
				invoke StdOut,addr head25
				invoke StdOut,addr head26
				
				.if w1 == 2143
								invoke StdOut,addr sub77
								mov comet1,'4'
								mov[comet1 + eax],0
								invoke StripLF,addr comet1
								invoke atodw,addr comet1
								add ebx,eax
								
				.elseif w1 == 2145
								invoke StdOut,addr sub78
								mov comet2,'4'
								mov[comet2 + eax],0
								invoke StripLF,addr comet2
								invoke atodw,addr comet2
								add ebx,eax
				
				.elseif w1 == 2146
								invoke StdOut,addr sub79
								mov comet3,'4'
								mov[comet3 + eax],0
								invoke StripLF,addr comet3
								invoke atodw,addr comet3
								add ebx,eax
								
				.elseif w1 == 1532
								invoke StdOut,addr sub80
								mov comet4,'3'
								mov[comet4 + eax],0
								invoke StripLF,addr comet4
								invoke atodw,addr comet4
								add ebx,eax
								
				.elseif w1 == 2147
								invoke StdOut,addr sub81
								mov comet5,'1'
								mov[comet5 + eax],0
								invoke StripLF,addr comet5
								invoke atodw,addr comet5
								add ebx,eax
				
				.elseif w1 == 2148
								invoke StdOut,addr sub82
								mov comet6,'4'
								mov[comet6 + eax],0
								invoke StripLF,addr comet6
								invoke atodw,addr comet6
								add ebx,eax
				.endif
				
				.if w2 == 2143
								invoke StdOut,addr sub77
								mov comet1,'4'
								mov[comet1 + eax],0
								invoke StripLF,addr comet1
								invoke atodw,addr comet1
								add ebx,eax
								
				.elseif w2 == 2145
								invoke StdOut,addr sub78
								mov comet2,'4'
								mov[comet2 + eax],0
								invoke StripLF,addr comet2
								invoke atodw,addr comet2
								add ebx,eax
				
				.elseif w2 == 2146
								invoke StdOut,addr sub79
								mov comet3,'4'
								mov[comet3 + eax],0
								invoke StripLF,addr comet3
								invoke atodw,addr comet3
								add ebx,eax
								
				.elseif w2 == 1532
								invoke StdOut,addr sub80
								mov comet4,'3'
								mov[comet4 + eax],0
								invoke StripLF,addr comet4
								invoke atodw,addr comet4
								add ebx,eax
								
				.elseif w2 == 2147
								invoke StdOut,addr sub81
								mov comet5,'1'
								mov[comet5 + eax],0
								invoke StripLF,addr comet5
								invoke atodw,addr comet5
								add ebx,eax
				
				.elseif w2 == 2148
								invoke StdOut,addr sub82
								mov comet6,'4'
								mov[comet6 + eax],0
								invoke StripLF,addr comet6
								invoke atodw,addr comet6
								add ebx,eax
				.endif
				
				.if w3 == 2143
								invoke StdOut,addr sub77
								mov comet1,'4'
								mov[comet1 + eax],0
								invoke StripLF,addr comet1
								invoke atodw,addr comet1
								add ebx,eax
								
				.elseif w3 == 2145
								invoke StdOut,addr sub78
								mov comet2,'4'
								mov[comet2 + eax],0
								invoke StripLF,addr comet2
								invoke atodw,addr comet2
								add ebx,eax
				
				.elseif w3 == 2146
								invoke StdOut,addr sub79
								mov comet3,'4'
								mov[comet3 + eax],0
								invoke StripLF,addr comet3
								invoke atodw,addr comet3
								add ebx,eax
								
				.elseif w3 == 1532
								invoke StdOut,addr sub80
								mov comet4,'3'
								mov[comet4 + eax],0
								invoke StripLF,addr comet4
								invoke atodw,addr comet4
								add ebx,eax
								
				.elseif w3 == 2147
								invoke StdOut,addr sub81
								mov comet5,'1'
								mov[comet5 + eax],0
								invoke StripLF,addr comet5
								invoke atodw,addr comet5
								add ebx,eax
				
				.elseif w3 == 2148
								invoke StdOut,addr sub82
								mov comet6,'4'
								mov[comet6 + eax],0
								invoke StripLF,addr comet6
								invoke atodw,addr comet6
								add ebx,eax
				.endif
				
				.if w4 == 2143
								invoke StdOut,addr sub77
								mov comet1,'4'
								mov[comet1 + eax],0
								invoke StripLF,addr comet1
								invoke atodw,addr comet1
								add ebx,eax
								
				.elseif w4 == 2145
								invoke StdOut,addr sub78
								mov comet2,'4'
								mov[comet2 + eax],0
								invoke StripLF,addr comet2
								invoke atodw,addr comet2
								add ebx,eax
				
				.elseif w4 == 2146
								invoke StdOut,addr sub79
								mov comet3,'4'
								mov[comet3 + eax],0
								invoke StripLF,addr comet3
								invoke atodw,addr comet3
								add ebx,eax
								
				.elseif w4 == 1532
								invoke StdOut,addr sub80
								mov comet4,'3'
								mov[comet4 + eax],0
								invoke StripLF,addr comet4
								invoke atodw,addr comet4
								add ebx,eax
								
				.elseif w4 == 2147
								invoke StdOut,addr sub81
								mov comet5,'1'
								mov[comet5 + eax],0
								invoke StripLF,addr comet5
								invoke atodw,addr comet5
								add ebx,eax
				
				.elseif w4 == 2148
								invoke StdOut,addr sub82
								mov comet6,'4'
								mov[comet6 + eax],0
								invoke StripLF,addr comet6
								invoke atodw,addr comet6
								add ebx,eax
				.endif
				
				.if w5 == 2143
								invoke StdOut,addr sub77
								mov comet1,'4'
								mov[comet1 + eax],0
								invoke StripLF,addr comet1
								invoke atodw,addr comet1
								add ebx,eax
								
				.elseif w5 == 2145
								invoke StdOut,addr sub78
								mov comet2,'4'
								mov[comet2 + eax],0
								invoke StripLF,addr comet2
								invoke atodw,addr comet2
								add ebx,eax
				
				.elseif w5 == 2146
								invoke StdOut,addr sub79
								mov comet3,'4'
								mov[comet3 + eax],0
								invoke StripLF,addr comet3
								invoke atodw,addr comet3
								add ebx,eax
								
				.elseif w5 == 1532
								invoke StdOut,addr sub80
								mov comet4,'3'
								mov[comet4 + eax],0
								invoke StripLF,addr comet4
								invoke atodw,addr comet4
								add ebx,eax
								
				.elseif w5 == 2147
								invoke StdOut,addr sub81
								mov comet5,'1'
								mov[comet5 + eax],0
								invoke StripLF,addr comet5
								invoke atodw,addr comet5
								add ebx,eax
				
				.elseif w5 == 2148
								invoke StdOut,addr sub82
								mov comet6,'4'
								mov[comet6 + eax],0
								invoke StripLF,addr comet6
								invoke atodw,addr comet6
								add ebx,eax
				.endif
				
				.if w6 == 2143
								invoke StdOut,addr sub77
								mov comet1,'4'
								mov[comet1 + eax],0
								invoke StripLF,addr comet1
								invoke atodw,addr comet1
								add ebx,eax
								
				.elseif w6 == 2145
								invoke StdOut,addr sub78
								mov comet2,'4'
								mov[comet2 + eax],0
								invoke StripLF,addr comet2
								invoke atodw,addr comet2
								add ebx,eax
				
				.elseif w6 == 2146
								invoke StdOut,addr sub79
								mov comet3,'4'
								mov[comet3 + eax],0
								invoke StripLF,addr comet3
								invoke atodw,addr comet3
								add ebx,eax
								
				.elseif w6 == 1532
								invoke StdOut,addr sub80
								mov comet4,'3'
								mov[comet4 + eax],0
								invoke StripLF,addr comet4
								invoke atodw,addr comet4
								add ebx,eax
								
				.elseif w6 == 2147
								invoke StdOut,addr sub81
								mov comet5,'1'
								mov[comet5 + eax],0
								invoke StripLF,addr comet5
								invoke atodw,addr comet5
								add ebx,eax
				
				.elseif w6 == 2148
								invoke StdOut,addr sub82
								mov comet6,'4'
								mov[comet6 + eax],0
								invoke StripLF,addr comet6
								invoke atodw,addr comet6
								add ebx,eax
				.endif
				
				invoke dwtoa,ebx,addr galaxy4
				invoke StdOut,addr space1
				invoke StdOut,addr galaxy4
				
								
				invoke StdOut,addr list1
				invoke StdOut,addr user1
				invoke StdOut,addr user2
				invoke StdOut,addr user3
				invoke StdOut,addr user4
				invoke StdOut,addr user5
				
				ceeds11: 
					invoke StdOut,addr proceed1
					invoke StdIn,addr ceed13,50
					.if ceed13 == 'Y' || ceed13 == 'y'
					jmp FifthYearSecondSemester
					.elseif ceed13 == 'N' || ceed13 == 'n'
					jmp FifthYear
					.else
					jmp ceeds11
					.endif
FifthYearSecondSemester:
					invoke ClearScreen
					invoke StdOut,addr header
					invoke StdOut,addr header2
					invoke StdOut,addr header3
					invoke StdOut,addr header4
					invoke StdOut,addr header5
					invoke StdOut,addr header6
					invoke StdOut,addr header7
					invoke StdOut,addr header8
					invoke StdOut,addr names
					invoke StdOut,addr name1
					invoke StdOut,addr fifthstudent
					invoke StdOut,addr Requisites
					invoke StdOut,addr output
					
					invoke StdOut,addr pre82				
					invoke StdIn,addr naruto1,50
					mov[naruto1 + eax],0
					invoke StripLF,addr naruto1
					invoke atodw,addr naruto1
					mov naruto1,eax
					
					invoke StdOut,addr pre83				
					invoke StdIn,addr naruto2,50
					mov[naruto2 + eax],0
					invoke StripLF,addr naruto2
					invoke atodw,addr naruto2
					mov naruto2,eax
					
					invoke StdOut,addr pre84				
					invoke StdIn,addr naruto3,50
					mov[naruto3 + eax],0
					invoke StripLF,addr naruto3
					invoke atodw,addr naruto3
					mov naruto3,eax
					
					invoke StdOut,addr pre85				
					invoke StdIn,addr naruto4,50
					mov[naruto4 + eax],0
					invoke StripLF,addr naruto4
					invoke atodw,addr naruto4
					mov naruto4,eax
					
					invoke StdOut,addr pre86				
					invoke StdIn,addr naruto5,50
					mov[naruto5 + eax],0
					invoke StripLF,addr naruto5
					invoke atodw,addr naruto5
					mov naruto5,eax
					
					invoke StdOut,addr pre87				
					invoke StdIn,addr naruto6,50
					mov[naruto6 + eax],0
					invoke StripLF,addr naruto6
					invoke atodw,addr naruto6
					mov naruto6,eax
					
					invoke StdOut,addr pre88				
					invoke StdIn,addr naruto7,50
					mov[naruto7 + eax],0
					invoke StripLF,addr naruto7
					invoke atodw,addr naruto7
					mov naruto7,eax
					
				invoke ClearScreen
				mov tobi1,'0'
				mov [tobi1 + eax],0
				invoke StripLF,addr tobi1
					invoke atodw,addr tobi1
				mov ebx,eax
			
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr available1
				invoke StdOut,addr heads
				invoke StdOut,addr head27
				invoke StdOut,addr head28
				
				.if naruto1 >=75 && naruto1 <=100
				invoke StdOut,addr sub83
				mov sasuke1,'2'
				mov[sasuke1 + eax],0
				invoke StripLF,addr sasuke1
				invoke atodw,addr sasuke1
				add ebx,eax
				.endif
				
				.if naruto2 >=75 && naruto2 <=100
				invoke StdOut,addr sub84
				mov sasuke2,'3'
				mov[sasuke2 + eax],0
				invoke StripLF,addr sasuke2
				invoke atodw,addr sasuke2
				add ebx,eax
				.endif
				
				.if naruto3 >=75 && naruto3 <=100
				invoke StdOut,addr sub85
				mov sasuke3,'4'
				mov[sasuke3 + eax],0
				invoke StripLF,addr sasuke3
				invoke atodw,addr sasuke3
				add ebx,eax
				.endif
				
				.if naruto4 >=75 && naruto4 <=100
				invoke StdOut,addr sub86
				mov sasuke4,'4'
				mov[sasuke4 + eax],0
				invoke StripLF,addr sasuke4
				invoke atodw,addr sasuke4
				add ebx,eax
				.endif
				
				.if naruto5 >=75 && naruto5 <=100
				invoke StdOut,addr sub87
				mov sasuke5,'3'
				mov[sasuke5 + eax],0
				invoke StripLF,addr sasuke5
				invoke atodw,addr sasuke5
				add ebx,eax
				.endif
				
				.if naruto6 >=75 && naruto6 <=100
				invoke StdOut,addr sub88
				mov sasuke6,'4'
				mov[sasuke6 + eax],0
				invoke StripLF,addr sasuke6
				invoke atodw,addr sasuke6
				add ebx,eax
				.endif
				
				.if naruto7 >=75 && naruto7 <=100
				invoke StdOut,addr sub89
				mov sasuke7,'3'
				mov[sasuke7 + eax],0
				invoke StripLF,addr sasuke7
				invoke atodw,addr sasuke7
				add ebx,eax
				.endif
				
				invoke dwtoa,ebx,addr tobi2
				invoke StdOut,addr space1
				invoke StdOut,addr tobi2
				
				invoke StdOut,addr subj
				
		offer1fifth2: 							;--------------------------------First Input ------------------------
				invoke StdOut,addr ensub1
				invoke StdIn,addr y1,50
				mov[y1 + eax],0
				invoke StripLF,addr y1
				invoke atodw,addr y1
				mov y1,eax
				.if y1 == 1481 || y1 == 2126 || y1 == 2149 || y1 == 2150 || y1 == 2151 || y1 == 2152 || y1 == 2174
				jmp ques1fifth2
				.else
				jmp offer1fifth2
				.endif
		ques1fifth2:
				invoke StdOut,addr display1
				invoke StdIn,addr z1,50
				.if z1 == 'Y' || z1 == 'y'
				jmp offer2fifth2
				.elseif z1 == 'N' || z1 == 'n'
				jmp SubjectDisplay15
				.else
				jmp ques1fifth2
				.endif
						
		offer2fifth2: 							;--------------------------------Second Input ------------------------
				invoke StdOut,addr ensub2
				invoke StdIn,addr y2,50
				mov[y2 + eax],0
				invoke StripLF,addr y2
				invoke atodw,addr y2
				mov y2,eax
				.if y2 == 1481 || y2 == 2126 || y2 == 2149 || y2 == 2150 || y2 == 2151 || y2 == 2152 || y2 == 2174
				jmp ques2fifth2
				.else
				jmp offer2fifth2
				.endif
		ques2fifth2:
				invoke StdOut,addr display1
				invoke StdIn,addr z2,50
				.if z2 == 'Y' || z2 == 'y'
				jmp offer3fifth2
				.elseif z2 == 'N' || z2 == 'n'
				jmp SubjectDisplay15
				.else
				jmp ques2fifth2
				.endif
								
		offer3fifth2: 							;--------------------------------Third Input ------------------------
				invoke StdOut,addr ensub3
				invoke StdIn,addr y3,50
				mov[y3 + eax],0
				invoke StripLF,addr y3
				invoke atodw,addr y3
				mov y3,eax
				.if y3 == 1481 || y3 == 2126 || y3 == 2149 || y3 == 2150 || y3 == 2151 || y3 == 2152 || y3 == 2174
				jmp ques3fifth2
				.else
				jmp offer3fifth2
				.endif
		ques3fifth2:
				invoke StdOut,addr display1
				invoke StdIn,addr z3,50
				.if z3 == 'Y' || z3 == 'y'
				jmp offer4fifth2
				.elseif z3 == 'N' || z3 == 'n'
				jmp SubjectDisplay15
				.else
				jmp ques3fifth2
				.endif
										
		offer4fifth2: 							;--------------------------------Fourth Input ------------------------
				invoke StdOut,addr ensub4
				invoke StdIn,addr y4,50
				mov[y4 + eax],0
				invoke StripLF,addr y4
				invoke atodw,addr y4
				mov y4,eax
				.if y4 == 1481 || y4 == 2126 || y4 == 2149 || y4 == 2150 || y4 == 2151 || y4 == 2152 || y4 == 2174
				jmp ques4fifth2
				.else
				jmp offer4fifth2
				.endif
		ques4fifth2:
				invoke StdOut,addr display1
				invoke StdIn,addr z4,50
				.if z4 == 'Y' || z4 == 'y'
				jmp offer5fifth2
				.elseif z4 == 'N' || z4 == 'n'
				jmp SubjectDisplay15
				.else
				jmp ques4fifth2
				.endif
												
		offer5fifth2: 							;--------------------------------Fifth Input ------------------------
				invoke StdOut,addr ensub5
				invoke StdIn,addr y5,50
				mov[y5 + eax],0
				invoke StripLF,addr y5
				invoke atodw,addr y5
				mov y5,eax
				.if y5 == 1481 || y5 == 2126 || y5 == 2149 || y5 == 2150 || y5 == 2151 || y5 == 2152 || y5 == 2174
				jmp ques5fifth2
				.else
				jmp offer5fifth2
				.endif
		ques5fifth2:
				invoke StdOut,addr display1
				invoke StdIn,addr z5,50
				.if z5 == 'Y' || z5 == 'y'
				jmp offer6fifth2
				.elseif z5 == 'N' || z5 == 'n'
				jmp SubjectDisplay15
				.else
				jmp ques5fifth2
				.endif
														
		offer6fifth2: 							;--------------------------------Sixth Input ------------------------
				invoke StdOut,addr ensub6
				invoke StdIn,addr y6,50
				mov[y6 + eax],0
				invoke StripLF,addr y6
				invoke atodw,addr y6
				mov y6,eax
				.if y6 == 1481 || y6 == 2126 || y6 == 2149 || y6 == 2150 || y6 == 2151 || y6 == 2152 || y6 == 2174
				jmp ques6fifth2
				.else
				jmp offer6fifth2
				.endif
		ques6fifth2:
				invoke StdOut,addr display1
				invoke StdIn,addr z6,50
				.if z6 == 'Y' || z6 == 'y'
				jmp offer7fifth2
				.elseif z6 == 'N' || z6 == 'n'
				jmp SubjectDisplay15
				.else
				jmp ques6fifth2
				.endif
				
		offer7fifth2: 							;--------------------------------Seventh Input ------------------------
				invoke StdOut,addr ensub7
				invoke StdIn,addr y7,50
				mov[y7 + eax],0
				invoke StripLF,addr y7
				invoke atodw,addr y7
				mov y7,eax
				.if y7 == 1481 || y7 == 2126 || y7 == 2149 || y7 == 2150 || y7 == 2151 || y7 == 2152 || y7 == 2174
				jmp SubjectDisplay15
				.else
				jmp offer7fifth2
				.endif
SubjectDisplay15:
				mov tobi3,'0'
				mov [tobi3 + eax],0
				invoke StripLF,addr tobi3
				invoke atodw,addr tobi3
				mov ebx,eax
			
				invoke ClearScreen
				invoke StdOut,addr header
				invoke StdOut,addr header2
				invoke StdOut,addr header3
				invoke StdOut,addr header4
				invoke StdOut,addr header5
				invoke StdOut,addr header6
				invoke StdOut,addr header7
				invoke StdOut,addr header8
				invoke StdOut,addr names
				invoke StdOut,addr name1
				invoke StdOut,addr subj2
				invoke StdOut,addr heads
				invoke StdOut,addr head27
				invoke StdOut,addr head28
				
				.if y1 == 1481
								invoke StdOut,addr sub83
								mov sakura1,'2'
								mov[sakura1 + eax],0
								invoke StripLF,addr sakura1
								invoke atodw,addr sakura1
								add ebx,eax
				.elseif y1 == 2126
								invoke StdOut,addr sub84
								mov sakura2,'3'
								mov[sakura2 + eax],0
								invoke StripLF,addr sakura2
								invoke atodw,addr sakura2
								add ebx,eax
				.elseif y1 == 2149
								invoke StdOut,addr sub85
								mov sakura3,'4'
								mov[sakura3 + eax],0
								invoke StripLF,addr sakura3
								invoke atodw,addr sakura3
								add ebx,eax
				.elseif y1 == 2150
								invoke StdOut,addr sub86
								mov sakura4,'4'
								mov[sakura4 + eax],0
								invoke StripLF,addr sakura4
								invoke atodw,addr sakura4
								add ebx,eax
				.elseif y1 == 2151
								invoke StdOut,addr sub87
								mov sakura5,'3'
								mov[sakura5 + eax],0
								invoke StripLF,addr sakura5
								invoke atodw,addr sakura5
								add ebx,eax
				.elseif y1 == 2152
								invoke StdOut,addr sub88
								mov sakura6,'4'
								mov[sakura6 + eax],0
								invoke StripLF,addr sakura6
								invoke atodw,addr sakura6
								add ebx,eax
				.elseif y1 == 2174
								invoke StdOut,addr sub89
								mov sakura7,'3'
								mov[sakura7 + eax],0
								invoke StripLF,addr sakura7
								invoke atodw,addr sakura7
								add ebx,eax
				.endif
				
				.if y2 == 1481
								invoke StdOut,addr sub83
								mov sakura1,'2'
								mov[sakura1 + eax],0
								invoke StripLF,addr sakura1
								invoke atodw,addr sakura1
								add ebx,eax
				.elseif y2 == 2126
								invoke StdOut,addr sub84
								mov sakura2,'3'
								mov[sakura2 + eax],0
								invoke StripLF,addr sakura2
								invoke atodw,addr sakura2
								add ebx,eax
				.elseif y2 == 2149
								invoke StdOut,addr sub85
								mov sakura3,'4'
								mov[sakura3 + eax],0
								invoke StripLF,addr sakura3
								invoke atodw,addr sakura3
								add ebx,eax
				.elseif y2 == 2150
								invoke StdOut,addr sub86
								mov sakura4,'4'
								mov[sakura4 + eax],0
								invoke StripLF,addr sakura4
								invoke atodw,addr sakura4
								add ebx,eax
				.elseif y2 == 2151
								invoke StdOut,addr sub87
								mov sakura5,'3'
								mov[sakura5 + eax],0
								invoke StripLF,addr sakura5
								invoke atodw,addr sakura5
								add ebx,eax
				.elseif y2 == 2152
								invoke StdOut,addr sub88
								mov sakura6,'4'
								mov[sakura6 + eax],0
								invoke StripLF,addr sakura6
								invoke atodw,addr sakura6
								add ebx,eax
				.elseif y2 == 2174
								invoke StdOut,addr sub89
								mov sakura7,'3'
								mov[sakura7 + eax],0
								invoke StripLF,addr sakura7
								invoke atodw,addr sakura7
								add ebx,eax
				.endif

				.if y3 == 1481
								invoke StdOut,addr sub83
								mov sakura1,'2'
								mov[sakura1 + eax],0
								invoke StripLF,addr sakura1
								invoke atodw,addr sakura1
								add ebx,eax
				.elseif y3 == 2126
								invoke StdOut,addr sub84
								mov sakura2,'3'
								mov[sakura2 + eax],0
								invoke StripLF,addr sakura2
								invoke atodw,addr sakura2
								add ebx,eax
				.elseif y3 == 2149
								invoke StdOut,addr sub85
								mov sakura3,'4'
								mov[sakura3 + eax],0
								invoke StripLF,addr sakura3
								invoke atodw,addr sakura3
								add ebx,eax
				.elseif y3 == 2150
								invoke StdOut,addr sub86
								mov sakura4,'4'
								mov[sakura4 + eax],0
								invoke StripLF,addr sakura4
								invoke atodw,addr sakura4
								add ebx,eax
				.elseif y3 == 2151
								invoke StdOut,addr sub87
								mov sakura5,'3'
								mov[sakura5 + eax],0
								invoke StripLF,addr sakura5
								invoke atodw,addr sakura5
								add ebx,eax
				.elseif y3 == 2152
								invoke StdOut,addr sub88
								mov sakura6,'4'
								mov[sakura6 + eax],0
								invoke StripLF,addr sakura6
								invoke atodw,addr sakura6
								add ebx,eax
				.elseif y3 == 2174
								invoke StdOut,addr sub89
								mov sakura7,'3'
								mov[sakura7 + eax],0
								invoke StripLF,addr sakura7
								invoke atodw,addr sakura7
								add ebx,eax
				.endif				
				
				.if y4 == 1481
								invoke StdOut,addr sub83
								mov sakura1,'2'
								mov[sakura1 + eax],0
								invoke StripLF,addr sakura1
								invoke atodw,addr sakura1
								add ebx,eax
				.elseif y4 == 2126
								invoke StdOut,addr sub84
								mov sakura2,'3'
								mov[sakura2 + eax],0
								invoke StripLF,addr sakura2
								invoke atodw,addr sakura2
								add ebx,eax
				.elseif y4 == 2149
								invoke StdOut,addr sub85
								mov sakura3,'4'
								mov[sakura3 + eax],0
								invoke StripLF,addr sakura3
								invoke atodw,addr sakura3
								add ebx,eax
				.elseif y4 == 2150
								invoke StdOut,addr sub86
								mov sakura4,'4'
								mov[sakura4 + eax],0
								invoke StripLF,addr sakura4
								invoke atodw,addr sakura4
								add ebx,eax
				.elseif y4 == 2151
								invoke StdOut,addr sub87
								mov sakura5,'3'
								mov[sakura5 + eax],0
								invoke StripLF,addr sakura5
								invoke atodw,addr sakura5
								add ebx,eax
				.elseif y4 == 2152
								invoke StdOut,addr sub88
								mov sakura6,'4'
								mov[sakura6 + eax],0
								invoke StripLF,addr sakura6
								invoke atodw,addr sakura6
								add ebx,eax
				.elseif y4 == 2174
								invoke StdOut,addr sub89
								mov sakura7,'3'
								mov[sakura7 + eax],0
								invoke StripLF,addr sakura7
								invoke atodw,addr sakura7
								add ebx,eax
				.endif
				
				.if y5 == 1481
								invoke StdOut,addr sub83
								mov sakura1,'2'
								mov[sakura1 + eax],0
								invoke StripLF,addr sakura1
								invoke atodw,addr sakura1
								add ebx,eax
				.elseif y5 == 2126
								invoke StdOut,addr sub84
								mov sakura2,'3'
								mov[sakura2 + eax],0
								invoke StripLF,addr sakura2
								invoke atodw,addr sakura2
								add ebx,eax
				.elseif y5 == 2149
								invoke StdOut,addr sub85
								mov sakura3,'4'
								mov[sakura3 + eax],0
								invoke StripLF,addr sakura3
								invoke atodw,addr sakura3
								add ebx,eax
				.elseif y5 == 2150
								invoke StdOut,addr sub86
								mov sakura4,'4'
								mov[sakura4 + eax],0
								invoke StripLF,addr sakura4
								invoke atodw,addr sakura4
								add ebx,eax
				.elseif y5 == 2151
								invoke StdOut,addr sub87
								mov sakura5,'3'
								mov[sakura5 + eax],0
								invoke StripLF,addr sakura5
								invoke atodw,addr sakura5
								add ebx,eax
				.elseif y5 == 2152
								invoke StdOut,addr sub88
								mov sakura6,'4'
								mov[sakura6 + eax],0
								invoke StripLF,addr sakura6
								invoke atodw,addr sakura6
								add ebx,eax
				.elseif y5 == 2174
								invoke StdOut,addr sub89
								mov sakura7,'3'
								mov[sakura7 + eax],0
								invoke StripLF,addr sakura7
								invoke atodw,addr sakura7
								add ebx,eax
				.endif		

				.if y6 == 1481
								invoke StdOut,addr sub83
								mov sakura1,'2'
								mov[sakura1 + eax],0
								invoke StripLF,addr sakura1
								invoke atodw,addr sakura1
								add ebx,eax
				.elseif y6 == 2126
								invoke StdOut,addr sub84
								mov sakura2,'3'
								mov[sakura2 + eax],0
								invoke StripLF,addr sakura2
								invoke atodw,addr sakura2
								add ebx,eax
				.elseif y6 == 2149
								invoke StdOut,addr sub85
								mov sakura3,'4'
								mov[sakura3 + eax],0
								invoke StripLF,addr sakura3
								invoke atodw,addr sakura3
								add ebx,eax
				.elseif y6 == 2150
								invoke StdOut,addr sub86
								mov sakura4,'4'
								mov[sakura4 + eax],0
								invoke StripLF,addr sakura4
								invoke atodw,addr sakura4
								add ebx,eax
				.elseif y6 == 2151
								invoke StdOut,addr sub87
								mov sakura5,'3'
								mov[sakura5 + eax],0
								invoke StripLF,addr sakura5
								invoke atodw,addr sakura5
								add ebx,eax
				.elseif y6 == 2152
								invoke StdOut,addr sub88
								mov sakura6,'4'
								mov[sakura6 + eax],0
								invoke StripLF,addr sakura6
								invoke atodw,addr sakura6
								add ebx,eax
				.elseif y6 == 2174
								invoke StdOut,addr sub89
								mov sakura7,'3'
								mov[sakura7 + eax],0
								invoke StripLF,addr sakura7
								invoke atodw,addr sakura7
								add ebx,eax
				.endif		
				
				.if y7 == 1481
								invoke StdOut,addr sub83
								mov sakura1,'2'
								mov[sakura1 + eax],0
								invoke StripLF,addr sakura1
								invoke atodw,addr sakura1
								add ebx,eax
				.elseif y7 == 2126
								invoke StdOut,addr sub84
								mov sakura2,'3'
								mov[sakura2 + eax],0
								invoke StripLF,addr sakura2
								invoke atodw,addr sakura2
								add ebx,eax
				.elseif y7 == 2149
								invoke StdOut,addr sub85
								mov sakura3,'4'
								mov[sakura3 + eax],0
								invoke StripLF,addr sakura3
								invoke atodw,addr sakura3
								add ebx,eax
				.elseif y7 == 2150
								invoke StdOut,addr sub86
								mov sakura4,'4'
								mov[sakura4 + eax],0
								invoke StripLF,addr sakura4
								invoke atodw,addr sakura4
								add ebx,eax
				.elseif y7 == 2151
								invoke StdOut,addr sub87
								mov sakura5,'3'
								mov[sakura5 + eax],0
								invoke StripLF,addr sakura5
								invoke atodw,addr sakura5
								add ebx,eax
				.elseif y7 == 2152
								invoke StdOut,addr sub88
								mov sakura6,'4'
								mov[sakura6 + eax],0
								invoke StripLF,addr sakura6
								invoke atodw,addr sakura6
								add ebx,eax
				.elseif y7 == 2174
								invoke StdOut,addr sub89
								mov sakura7,'3'
								mov[sakura7 + eax],0
								invoke StripLF,addr sakura7
								invoke atodw,addr sakura7
								add ebx,eax
				.endif			
				
				invoke dwtoa,ebx,addr tobi4
				invoke StdOut,addr space1
				invoke StdOut,addr tobi4
								
				invoke StdOut,addr list1
				invoke StdOut,addr user1
				invoke StdOut,addr user2
				invoke StdOut,addr user3
				invoke StdOut,addr user4
				invoke StdOut,addr user5
				
				ceeds12: 
					invoke StdOut,addr proceed3
					invoke StdIn,addr ceed14,50
					.if ceed14 == 'Y' || ceed14 == 'y'
					jmp FifthYear
					.elseif ceed14 == 'N' || ceed14 == 'n'
					jmp Exit_
					.else
					jmp ceeds12
					.endif
Exit_:
invoke ExitProcess,0
end start