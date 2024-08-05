// 12) Input data exactly in the following format, and print sum of all integer values.
// Sample Input: “67, 89, 23, 67, 12, 55, 66”. 
// (Hint use String class split method and Integer class parseInt method)

public class j12_StrTOint {
    public static void main(String[] args) {
        String s = "67, 89, 23, 67, 12, 55, 66";
        String s2[] = s.split(", ");
        int sum=0;
        for(String ss : s2){
            sum = sum+Integer.parseInt(ss);
        }
        System.out.println("Total Sum is : "+sum);
    }
}
