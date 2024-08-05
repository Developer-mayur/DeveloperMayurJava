// Que. 7 Write a program to store your shopping details in a binary file(shopping.dat) with
// information itemName, price, quantity. (Use ObjectOutputStream to store Item class
// object).

import java.io.Serializable;
public class shopping implements Serializable{
   private String itemName;
    private int price;
    private int quantity;

     public shopping(){}
   public shopping(String itemName,int price,int quantity){
     this.price = price;
    this.itemName = itemName;
    this.quantity = quantity;
    }
   public String toString(){
    return itemName+ " "+price+" "+quantity;
   }
}


