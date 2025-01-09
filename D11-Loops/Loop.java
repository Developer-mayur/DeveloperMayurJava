import java.util.Scanner;
class loops{
    // 33)WAP to print Alphabets in reversing order.
    void Alpha_Revers_33(){
        Scanner sc = new Scanner(System.in);
           int x =sc.nextInt();
           
        char i ;
        i=(char)x;
        while(i>=65){
            System.out.print(" "+i);
            i++;

            if (i==91){
                break;
            }
        }
    }



}

public class Loop {
    public static void main(String[] args) {
        loops l = new loops();
        l.Alpha_Revers_33();
     }
}





 