
// 13)WAP check if two Strings are anagrams of each other?
// (Hint Anagram words: LISTEN - SILENT 
				//   TRIANGLE - INTEGRAL)

import java.util.Scanner;
import java.util.Arrays;

public class j13_Anagrams {
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Anagram Words : ");
		String name1 = sc.next();
		String name2 = sc.next();
		boolean flag=true;
		 char arr[] = name1.toCharArray();
		 char arr2[] = name2.toCharArray();
		 Arrays.sort(arr);
		 Arrays.sort(arr2);

		if(name1.length()==name2.length()){


			if(arr.length==arr2.length){
			for (int j=0; j<name2.length(); j++) {
				if(arr[j]==arr2[j]){
					flag=false;
				}else{
					flag=true;
			    System.out.println("You Entered String is not Anagram :");
					break;
				}
			}

		if(!flag)
			System.out.println("You Entered String is Anagram :");
	  }
	   }else{
		System.out.println("You Entered String is not Anagram :");
	  }
	}
}
