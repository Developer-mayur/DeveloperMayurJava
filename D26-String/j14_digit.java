// 14) WAP check if a String contains only digits?

import java.util.Scanner;

public class j14_digit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String Check only Contain with noms or not : ");
        String str = sc.next();

        int i;
        for(i=0; i<str.length(); i++){
            if(str.charAt(i)>='0'&& str.charAt(i)<='9'){}
            else{
            System.out.println("Entered String is NOT fully contain with num's: ");
            break;
            }
        }
        if(i==str.length()){
            System.out.println("You Entred String is Contaoins Only with NUm's :");
        }
    }
}
