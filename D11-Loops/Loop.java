import java.util.Scanner;
class loops{
    Scanner sc = new Scanner(System.in);

// 61)WAP to find out all the leap years between two entered years
void  SixteyOne(){
   int y1= sc.nextInt();
   int y2= sc.nextInt();
int p;
while(y1<=y2){
System.out.println(y1);
p=y1%10;
System.out.println(p);

y1++;
}


}



}

public class Loop {
    public static void main(String[] args) {
        loops l = new loops();
        l.SixteyOne();
     }
}





 