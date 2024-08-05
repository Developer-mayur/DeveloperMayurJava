// 7)WAP to remove the duplicate letters from given String.
//     Sample Input: “aabbccddd”
//     Output: “abcd”

public class j7_duplicate {
    public static void main(String[] args) {
        String s = "aabbccddd";
        for(int i=0; i<s.length(); i++){
        boolean flag=true;
            for(int j=0; j<i; j++){
            if(s.charAt(i)==s.charAt(j)){
                flag=false;
            }
        }if(flag)
        System.out.print(s.charAt(i));
      }
    }
}
