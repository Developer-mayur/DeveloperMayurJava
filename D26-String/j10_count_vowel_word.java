// 10) WAP to count the word whose first letter is  vowel. 

public class j10_count_vowel_word {
    public static void main(String[] args) {
        String s ="WAP to count the word whose first letter is  vowel";
        String[] words = s.split(" ");
        int count=0;
       
        for (int i=0; i<words.length; i++) {
            if(words[i].charAt(0)=='a'||words[i].charAt(0)=='e'||words[i].charAt(0)=='i'|words[i].charAt(0)=='o'|words[i].charAt(0)=='u'){
                
                System.out.println("words is : "+words[i]);
                count++;

            }
        }
        System.out.println("total : "+count);
    }
}