// 9) WAP to find word of maximum length in given String.
// Sample Input: “Dear Student ,You have need to work hard”
// `	Output: “Student”

public class j9 {
    public static void main(String[] args) {
        String s ="Dear Student ,You have need to work hard";
        String[] words = s.split(" ");
        
        int maxword =0;
        String word="";
        for (int i = 0; i <words.length; i++) {
            if(words[i].length()>maxword){
                maxword = words[i].length();
                word = words[i];
            }
        }
        System.out.println("maximum Length Word : "+maxword);
        System.out.println("Word is : "+word);
    }
}
