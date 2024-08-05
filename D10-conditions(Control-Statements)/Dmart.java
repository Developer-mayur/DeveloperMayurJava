import java.util.Scanner;
class Dm{
public void  Sell(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter you Name ");
String Name = sc.nextLine();
System.out.println("Enter you Gender ");
char Gender = sc.next().charAt(0);

 
float Gst,Total_All,TotalAtLast,TotalAtMrp,TotalAtAf, TotalLast,Final;
String Gift ;
System.out.println("Enter Date in(dd/mm/yy) formate ");
String date = sc.next();
 


System.out.println("Enter Item name 01");
String Item_1 = sc.next();
System.out.println("Enter  quantity  of\t"+Item_1);
int  Qt1 = sc.nextInt();
System.out.println("Enter Item price");
int P1 = sc.nextInt();


System.out.println("Enter Item name 02");
String Item_2 = sc.next();
System.out.println("Enter  quantity  of\t"+Item_2);
int  Qt2 = sc.nextInt();
System.out.println("Enter Item 2 price");
int P2 = sc.nextInt();
 

System.out.println("Enter Item name 03");
String Item_3 = sc.next();
System.out.println("Enter  quantity  of\t"+Item_3);
int Qt3 = sc.nextInt();
System.out.println("Enter Item 3 price");
int P3 = sc.nextInt();

System.out.println("Enter Item name 04");
String Item_4 = sc.next();
System.out.println("Enter  quantity  of\t"+Item_4);
int  Qt4 = sc.nextInt();
System.out.println("Enter Item 4 price");
int P4 = sc.nextInt();

System.out.println("Enter Item name 05");
String Item_5 = sc.next();
System.out.println("Enter  quantity  of\t"+Item_5);
int  Qt5 = sc.nextInt();
System.out.println("Enter Item 6 price");
int P5 = sc.nextInt();

System.out.println("Enter Item name 06");
String Item_6 = sc.next();
System.out.println("Enter  quantity  of\t"+Item_6);
int  Qt6 =  sc.nextInt();
System.out.println("Enter Item  6 price");
int P6 = sc.nextInt();


System.out.println("Enter Item name 07");
String Item_7 = sc.next();
System.out.println("Enter  quantity  of\t"+Item_7);
int  Qt7 = sc.nextInt();
System.out.println("Enter Item 7 price");
int P7 = sc.nextInt();

System.out.println("Enter Item name 08");
String Item_8 = sc.next();
System.out.println("Enter  quantity  of\t"+Item_8);
int  Qt8 = sc.nextInt();
System.out.println("Enter Item  8 price");
int P8 = sc.nextInt();

System.out.println("Enter Item name 09");
String Item_9 = sc.next();
System.out.println("Enter  quantity  of\t"+Item_9);
int  Qt9 = sc.nextInt();
System.out.println("Enter Item  9 price");
int P9 = sc.nextInt();

System.out.println("Enter Item name 10");
String Item_10 = sc.next();
System.out.println("Enter  quantity  of\t"+Item_10);
int  Qt10 =sc.nextInt();
System.out.println("Enter Item 10 price");
int P10 = sc.nextInt();
float   total1= P1*Qt1;
float   total2= P1*Qt1;
float   total3= P1*Qt1;
float   total4= P1*Qt1;
float   total5= P1*Qt1;
float   total6= P1*Qt1;
float   total7= P1*Qt1;
float   total8= P1*Qt1;
float   total9= P1*Qt1;
float   total10= P1*Qt1;
Total_All= total1+total2+total3+total4+total5+total6+total7+total8+total9+total10;
System.out.println(Total_All);
float Af_1,Af_2,Af_10,Dis_1,Dis_2,Dis_10,Total_2,total_10;


Dis_1=total1*5/100;
Dis_2=total2*10/100;
Dis_10=total10*15/100;
float TotalAf ;

                                                                   
 if(Gender =='F' || Gender == 'f'){
Gift = "Cadebbery";
System.out.println("cadebbery");
}
else{
      Gift = "Lager wallet";
      System.out.println("Lager wallet");
}


 if (Qt1>=4||Qt1<=4){
Af_1 = total1-Dis_1;
 System.out.println("discount  5%\t"+Af_1);


 if(Qt1<=4){
 Af_1 = total1;
 System.out.println("discount  5%\t"+Af_1);
  
 if(Qt5>=1||Total_All<=5000)
                {
                Af_2 = total2-Dis_2;
                   System.out.println("discount 10%\t"+Af_2);  

                    if(Qt10>=1)
                      {
                      Af_10 = total10-Dis_10;
                      System.out.println("discount 15%\t"+Af_10); 
                      TotalAf= Af_1+total2+total3+total4+Af_2+total6+total7+total8+total9+Af_10;
                      if (Total_All<=5000){
                         System.out.println("Do  you want carry bag Y/n ?");
                          char bag=sc.next().charAt(0);
                                          if(bag =='y' || bag == 'Y'){
                                                int bae =10;
                                         float  TotalP = Total_All*10/100;
                                          float Total = Total_All+TotalP;
                                        System.out.println( Total); 
                                        Gst = Total*10/100;
                                           TotalAtMrp =Total+Gst;
            
                             if(Total_All>=5000||Total_All<=10000||Total_All<=5000)
                             {
                              TotalP = Total_All*10/100;
                              Total = Total_All+TotalP;
                             System.out.println( Total); 
                             Gst = Total*10/100;
                                TotalAtMrp =Total+Gst; 
                                                                   
                              if(Total_All>=10000||Total_All<=5000){ 
                                TotalP =Total_All*15/100;  
                                Total = Total_All+TotalP;
                                System.out.println( Total);
                                Gst = Total*10/100;
                                TotalLast =TotalAtMrp;                        
                                System.out.println("Do  you want carry bag Y/n ?");
                                if(bag =='y' || bag == 'Y'){
                                    int ba = 10;
                                TotalLast = TotalAtMrp+10;
                                
                                         

                                

                                                
                                                                                              
                                    if(TotalAf>=5000||TotalAf<=10000||TotalAf<=5000){
                                    float TotalAfP = TotalAf*10/100;
                                    System.out.println(TotalAfP);
                                     Gst = Total*10/100;
                                    TotalAtAf =TotalAf+Gst;
                                    

                                    
                                    
                                         if(TotalAf>=10000||TotalAf<=5000)
                                         {
                                         TotalAfP =TotalAf*15/100;
                                         TotalAtLast= TotalAf-TotalAfP;
                                         System.out.println(TotalAf);
                                         Gst = TotalAf*10/100;
                                         TotalAtAf =Total+Gst;
                                         Final = TotalAtAf;


                                         
 








             
 


  
  


 System.out.println(                          "\t\t\t\t\tD-Mart"                                                                                      );      
 System.out.println(  "Name :"+Name+        "\t\t\t\t\t\t\t\t\t"  	+	"Date:"+date                                );
 System.out.println(   "------------------------------------------------------------------------------------------------------"            );     
 System.out.println("Item Name	       Quantity                Price                    Total              After-Discount	"	                                );                      
 System.out.println( Item_1+  "\t\t\t"         +Qt1+    "\t\t\t"   +P1 +   "\t\t\t"    +total1+ "Rs" +"\t\t\t"     +Af_1+    "Rs"                               );
 System.out.println( Item_2+  "\t\t\t"         +Qt2+    "\t\t\t"   +P2+    "\t\t\t"    +total2+ "Rs" +"\t\t\t"     +total2+  "RS"                                );
 System.out.println( Item_3+  "\t\t\t"         +Qt3+    "\t\t\t"   +P3 +   "\t\t\t"    +total3+ "Rs" +"\t\t\t"     +total3+  "RS "                            );
 System.out.println( Item_4+  "\t\t\t"         +Qt4+    "\t\t\t"   +P4 +   "\t\t\t"    +total4+ "Rs" +"\t\t\t"     +total4+  "RS "                             );
 System.out.println( Item_5+  "\t\t\t"         +Qt5+    "\t\t\t"   +P5 +   "\t\t\t"    +total5+ "Rs" +"\t\t\t"     +Af_2+    "RS"                             );
 System.out.println( Item_6+  "\t\t\t"         +Qt6+    "\t\t\t"   +P6 +   "\t\t\t"    +total6+ "Rs" +"\t\t\t"     +total6+  "RS "                             );
 System.out.println( Item_7+  "\t\t\t"         +Qt7+    "\t\t\t"   +P7 +   "\t\t\t"    +total7+ "Rs" +"\t\t\t"     +total7+  "RS "                             );
 System.out.println( Item_8+  "\t\t\t"         +Qt8+    "\t\t\t"   +P8 +   "\t\t\t"    +total8+ "Rs" +"\t\t\t"     +total8+  "RS "                             );
 System.out.println( Item_9+  "\t\t\t"         +Qt9+    "\t\t\t"   +P9 +   "\t\t\t"    +total9+ "Rs" +"\t\t\t"     +total9+  "RS "                               );
 System.out.println( Item_10+ "\t\t\t"         +Qt10+   "\t\t\t"   +P10+   "\t\t\t"    +total10+"Rs" +"\t\t\t"     +Af_10+   "Rs "                                );
 System.out.println(   "------------------------------------------------------------------------------------------------------"            );
 System.out.println(                 "\t\t\t\t\t\t\t"  +  "                A.P                    D.P	                        ");
 System.out.println(              "\t\t\t\t\t\t\t\t\t"  +                Total_All+"    \t       "+TotalAf                 );
 System.out.println("Gift :-" +Gift+     "\t\t\t\t\t\t\t"            +   "0.0                    0.0"           );
 System.out.println("Carry Bag : "+bag+  "\t\t\t\t\t\t\t\t"           +     ba +"    \t\t       "+bae                   );                   
 System.out.println("GST(10%)"     +  "\t\t\t\t\t\t\t\t"           +     Gst+"                  "+Gst               );                    
 System.out.println("------------------------------------------------------------------------------------------------------"  );
 System.out.println(       "\t\t\t\t\t\t\t\t\t"           +     TotalLast+"   \t\t      "+Final                        );               
 System.out.println(                                                                                               );
 System.out.println(         "\t\t\t\t"+          "Thank You To Vist D-Mart"                                                        );
 System.out.println("------------------------------------------------------------------------------------------------------"  );
  }
}
}
}
}
}
}
}
}
}
 }






}
}













public class Dmart{
 
public static void main (String[]args){
      Dm  Obj = new Dm();  
// Obj.Info();
 Obj.Sell();
 
}
}
