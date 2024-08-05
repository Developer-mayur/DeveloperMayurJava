// 6) Write a java program to find all possible palindrom of given String.
	// Sample Input: “aaabbbacccababacccaabb”
class all{
    static void pelindrome(String st){
        System.out.println("1");
        String s=st;
        int count=0;
        boolean flag=true;
        for(int i=0; i<s.length(); i++) {
            flag=true;
            String word = "" ;
            for (int j=i; j<s.length(); j++) {
                  word = word+s.charAt(j);
                  String word2 = "";
                  for (int k=j; k>=i; k--) {
                    word2 = word2+s.charAt(k);
                  String word3 = "";
                    if(word.equals(word2)){
                        for(int l=j-1; l>=0; l--){
                            word3 =  s.charAt(l)+word3;
                            if(word3.equals(word)){
                            flag=false;
                            break;
                            } 
                        }
                        if(flag){
                        System.out.print(word+" ");
                        count++;
                        }
                    }
                  }
            }
        }System.out.print("\n"+count);
    }
}
public class j6_str_0pelindrome {
    public static void main(String[] args) {
        String s = "aaabbbacccababacccaabb";
        all.pelindrome(s);

    }
}
