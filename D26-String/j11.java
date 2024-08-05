// 11.> Input name of a person and count how many vowels it contains. Use String class methods.
public class j11 {
    public static void main(String[] args) {
        String s ="WAP";
        s=s.toLowerCase();
        int count=0;
       
        for (int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                
                System.out.println("words is : "+s.charAt(i));
                count++;

            }
        }
        System.out.println("total : "+count);
    }
}