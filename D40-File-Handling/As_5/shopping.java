// Que. 7 Write a program to store your shopping details in a binary file(shopping.dat) with
// information itemName, price, quantity. (Use ObjectOutputStream to store Item class
// object).
import java.io.File;
import java.io.Serializable;
import  java.io.ObjectOutputStream;
public class shopping implements Serializable{
   private String itemName;
    private int price;
    private int quantity;

     public shopping(){
      this.price = 0;
       this.quantity = 0;

     }
   public shopping(String itemName,int price,int quantity){
     this.price = price;
    this.itemName = itemName;
    this.quantity = quantity;
    }
   public String toString(){
    return itemName+""+price+""+quantity;
   }
}



public class  Shop{

  public static void main(String[] args) {
    shopping s= new shopping();
    try{
    File f = new File("shopping.dat");


    }
    catch(Exception e){
      System.out.println("dfhbdh");
    }

    
  }
}
