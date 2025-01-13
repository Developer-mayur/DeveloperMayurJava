package Exp;

import java.util.Scanner;

// Write a program to obtain two numbers and print their quotient. In case of an exception print the exception message.
// Input format :
// Provide a single line of input separated by a space. Obtain the integers N1 and N2.
// Output format :
// Display the quotient if there is no exception; otherwise, print the exception message.
// Refer to the sample output for reference.
// Code constraints :
// Integers only.
// Sample test cases :
// Input 1 :
// 44 2
// Output 1 :
// 22
// Input 2 :
// 2 0
// Output 2 :
// java.lang.ArithmeticException


 import  java.util.*;
public class Q1 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("inter input");
             int a =sc.nextInt();
             int b =sc.nextInt();

             try{
                int c =a/b;
            System.out.println(c);        
             }
              catch(ArithmeticException e){
                System.out.println(" java.lang.ArithmeticException");
              }
             
            //  System.out.println(a);
            //  System.out.println(b);






    }
    
}
