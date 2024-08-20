import java.util.Scanner;

public class j3_Dmart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
       
        String gift="unkown";

        System.out.print("Enter Date MM/DD/YY : ");
        String date = sc.next();

        System.out.print("Enter Your Gender in Male for 'M' and femal for 'F' : ");
        char gender = sc.next().charAt(0);
         if(gender=='m' ||gender=='M'){
            gift = "Ladgerbag";
            
         }else if(gender=='F' ||gender=='f'){
            gift = "Cadeberry";
         }else{
            System.out.println("Re-Run Code You enterd wrong gender give only m for mal and f for femal : ");
         }

        System.out.print("Ask user for  carry bag yes for 'Y' or no for 'N' put : ");
        char carryb = sc.next().charAt(0);
        int carryBag=0;
        if(carryb=='Y' || carryb=='y'){
            carryBag = 10;
        }else if(carryb=='N' || carryb=='n'){
            carryBag = 0;
        }else{
            System.out.println("Re-Run Code You enterd wrong answer for  carry  bag only yes for y no for n : ");
        }

        String  item1="Unkonwn",item2="Unkonwn",item3="Unkonwn",item4="Unkonwn",item5="Unkonwn",item6="Unkonwn",item7="Unkonwn",item8="Unkonwn",item9="Unkonwn",item10="Unkonwn";

        // String  item1,item2,item3,item4,item5,item6,item7,item8,item9,item10;
        int quantity1=0,quantity2=0,quantity3=0,quantity4=0,quantity5=0,quantity6=0,quantity7=0,quantity8=0,quantity9=0,quantity10=0;
        int price1=0,price2=0,price3=0,price4=0,price5=0,price6=0,price7=0,price8=0,price9=0,price10=0;
        int total1=0,total2=0,total3=0,total4=0,total5=0,total6=0,total7=0,total8=0,total9=0,total10=0;
        int totalD1=0,totalD2=0,totalD3=0,totalD4=0,totalD5=0,totalD6=0,totalD7=0,totalD8=0,totalD9=0,totalD10=0;


        // System.out.print("Enter 1 for item 1 : ");
        int item = 1;
        if(item == 1){

            System.out.print("Enter 1st item Name : ");
             item1 = sc.next();
            System.out.print("Enter Quantity of item : ");
             quantity1 = sc.nextInt();
            System.out.print("Enter Price : ");
             price1 = sc.nextInt();

            if(quantity1>4){
                 total1 = price1*quantity1;
                 totalD1 = (total1-((price1*5)/100)*quantity1);
            }else{
                 totalD1 = price1*quantity1;
                 total1 = price1*quantity1;
            }
            item = 2;
            //----------------------------------------------------------------

        if(item == 2){
            System.out.print("Enter 2nd item Name : ");
            item2 = sc.next();
            System.out.print("Enter Quantity of item : ");
            quantity2 = sc.nextInt();
            System.out.print("Enter Price : ");
            price2 = sc.nextInt();

            total2 = price2*quantity2;
            totalD2 = price2*quantity2;  
            item = 3;
            //----------------------------------------------------------------
  

        }if(item == 3){
            System.out.print("Enter  3rd item Name : ");
            item3 = sc.next();
            System.out.print("Enter Quantity of item : ");
            quantity3 = sc.nextInt();
            System.out.print("Enter Price : ");
            price3 = sc.nextInt();

            total3 = price3*quantity3;
            totalD3 = price3*quantity3;  
            item = 4;
           //----------------------------------------------------------------
  
        }
        // if(item == 4){
    //         System.out.print("Enter 4rth item Name : ");
    //         item4 = sc.next();
    //         System.out.print("Enter Quantity of item : ");
    //         quantity4 = sc.nextInt();
    //         System.out.print("Enter Price : ");
    //         price4 = sc.nextInt();

    //         total4 = price4*quantity4; 
    //         totalD4 = price4*quantity4;  
    //         item = 5;

    //     //    ----------------------------------------------------------------
  

    //     }if(item == 5){
    //         System.out.print("Enter 5th item Name : ");
    //         item5 = sc.next();
    //         System.out.print("Enter Quantity of item : ");
    //         quantity5 = sc.nextInt();
    //         System.out.println("Enter Price : ");
    //         price5 = sc.nextInt();

    //         total5 = price5*quantity5;  
    //         totalD5 = (total5-((price5*10)/100)*quantity5);
    //         item = 6; 
    //      //----------------------------------------------------------------

    //     }if(item == 6){
    //         System.out.print("Enter 6th item Name : ");
    //         item6 = sc.next();
    //         System.out.print("Enter Quantity of item : ");
    //         quantity6 = sc.nextInt();
    //         System.out.print("Enter Price : ");
    //         price6 = sc.nextInt();

    //         total6 = price6*quantity6;  
    //         totalD6 = price6*quantity6;  
    //         item = 7;
    //     //----------------------------------------------------------------
  
    //     }if(item == 7){
    //         System.out.print("Enter 7th item Name : ");
    //         item7 = sc.next();
    //         System.out.print("Enter Quantity of item : ");
    //         quantity7 = sc.nextInt();
    //         System.out.print("Enter Price : ");
    //         price7 = sc.nextInt();

    //         total7 = price7*quantity7;
    //         totalD7 = price7*quantity7; 

    //         item = 8; 
    //      //----------------------------------------------------------------
    //     }if(item == 8){
    //         System.out.print("Enter 8th item Name : ");
    //         item8 = sc.next();
    //         System.out.print("Enter Quantity of item : ");
    //         quantity8 = sc.nextInt();
    //         System.out.print("Enter Price : ");
    //         price8 = sc.nextInt();

    //         total8 = price8*quantity8; 
    //         totalD8 = price8*quantity8; 
    //         item = 9; 
    //      //----------------------------------------------------------------
    //     }if(item == 9){
    //         System.out.print("Enter 9th item Name : ");
    //         item9 = sc.next();
    //         System.out.print("Enter Quantity of item : ");
    //         quantity9 = sc.nextInt();
    //         System.out.print("Enter Price : ");
    //         price9 = sc.nextInt();

    //         total9 = price9*quantity9;  
    //         totalD9 = price9*quantity9;  
    //         item = 10;
    //      //----------------------------------------------------------------
    //     }if(item == 10){
    //         System.out.print("Enter 10th item Name : ");
    //         item10 = sc.next();
    //         System.out.print("Enter Quantity of item : ");
    //         quantity10 = sc.nextInt();
    //         System.out.print("Enter Price : ");
    //         price10 = sc.nextInt();
        
    //         total10 = price10*quantity10;  
    //         totalD10 = ((price10*15)/100)*quantity10;
    //     }
    }else{
            System.out.println("------Re-Run Program------");
         }

        //----------------2nd Toal Bill WIthot Gst ------------------------ 


        // int totalbill = total1+total2+total3+total4+total5+total6+total7+total8+total9+total10;
int totalbill = (total1+total2+total3+total4);
        int gst = (totalbill*10)/100;
        int totalbillGstCB = (totalbill+carryBag+gst);


        // ------------3rd part Tota Disscounted  Bill & GST-------------

        // int totalbillD = (totalD1+totalD2+totalD3+totalD4+totalD5+totalD6+totalD7+totalD8+totalD9+totalD10);
int totalbillD =(totalD1+totalD2+totalD3+totalD4);
         if(totalbillD>5000 && totalbillD<10000){
            totalbillD = ((totalbillD*10)/100)+totalbillD;
            
         }else{
            totalbillD = ((totalbillD*15)/100)+totalbillD;
         }

         int totalbillDGstCB = (totalbillD+carryBag+gst);
        


         //-------------------4rd-Printing Area---------------


        System.out.println("                                  D-Mart                                     ");
        System.out.println("Name : "+name+ "                                                  DAte : "+date);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Item Name         Quantity         Price         Total         After-Discount");
        System.out.println(item1+ "\t\t+"+quantity1+  "\t\t"+price1+ "\t\t"+total1+ "\t\t"+totalD1);
        System.out.println(item2+ "\t\t+" +quantity2+ "\t\t"+price2+ "\t\t"+total2+ "\t\t"+totalD2);
        System.out.println(item3+ "\t\t+" +quantity3+ "\t\t"+price3+ "\t\t"+total3+ "\t\t" +totalD3);
        System.out.println(item4+ "\t\t+" +quantity4+ "\t\t"+price4+ "\t\t"+total4+ "\t\t" +totalD4);
        System.out.println(item5+ "\t\t+" +quantity5+ "\t\t"+price5+ "\t\t"+total5+ "\t\t" +totalD5);
        System.out.println(item6+ "\t\t+" +quantity6+ "\t\t"+price6+ "\t\t"+total6+ "\t\t" +totalD6);
        System.out.println(item7+ "\t\t+" +quantity7+ "\t\t"+price7+ "\t\t"+total7+ "\t\t" +totalD7);
        System.out.println(item8+ "\t\t+" +quantity8+ "\t\t"+price8+ "\t\t"+total8+ "\t\t" +totalD8);
        System.out.println(item9+ "\t\t+" +quantity9+ "\t\t"+price9+ "\t\t"+total9+ "\t\t" +totalD9);
        System.out.println(item10+"\t\t+" +quantity10+"\t\t"+price10+"\t\t"+total10+"\t\t"+totalD10);
        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                                                   "+totalbill+"                "+totalbillD);

        System.out.println("Gift :- "+gift+"                                                              \n");
        System.out.println("Carry Bag : "+carryb+"                                        "+carryBag+"               "+carryBag);
        System.out.println("GST (10%)"+"                                           "+gst+"               "+gst+"    ");
       
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("                                                   "+totalbillGstCB+"              "+totalbillDGstCB+"\n");

        System.out.println("                     Thank YOu For Visit D-Mart                              \n");
        System.out.println("------------------------------------------------------------------------------");
    

    //     String  item1="Unkonwn",item2="Unkonwn",item3="Unkonwn",item4="Unkonwn",item5="Unkonwn",item6="Unkonwn",item7="Unkonwn",item8="Unkonwn",item9="Unkonwn",item10="Unkonwn";
    //     int quantity1=0,quantity2=0,quantity3=0,quantity4=0,quantity5=0,quantity6=0,quantity7=0,quantity8=0,quantity9=0,quantity10=0;
    //     int price1=0,price2=0,price3=0,price4=0,price5=0,price6=0,price7=0,price8=0,price9=0,price10=0;
    //     int total1,total2,total3,total4,total5,total6,total7,total8,total9,total10;
    //     int totalD1,totalD2,totalD3,totalD4,totalD5,totalD6,totalD7,totalD8,totalD9,totalD10;
    }
}

