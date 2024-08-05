// 8) WAP to find out total occurrence of each letter in string.
	//  Sample Input: “aabbccddd”
   //Output:   a- 2 times
			// b- 2 times
			// c- 2 times
			// d- 3 times

public class j8_count {
   public static void main(String[] args) {
    String s= "baabbaccdd";
    for(int i=0; i<s.length(); i++){
        int count=0;
        boolean flag=true;
        for(int j=0; j<i; j++){
            if(s.charAt(j)==s.charAt(i)){
                flag = false;
            }
        }
        if(flag){
            for(int k=i; k<s.length(); k++){
                if(s.charAt(i)==s.charAt(k))
                count++;
            }
        System.out.println(s.charAt(i)+" : "+count);
        }
    }
   } 
}
