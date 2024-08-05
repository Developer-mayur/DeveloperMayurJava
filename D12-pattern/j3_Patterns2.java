import java.net.SocketPermission;
import java.util.Scanner;
class Patterns2{
    Scanner sc = new Scanner(System.in);
    //1.
    // 12345
    //  1234
    //   123
    //    12
    //     1
    
    void reverse_12345_1234_RTrangle1(){
        System.out.print("Enter any num to 12345  = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1;k<=i-1; k++)
            System.out.print(" ");
            for(int j=1; j<=n-i+1; j++){
                    System.out.print(j);
            }System.out.println();
         }
    }
    //2.
    // 55555
    //  4444
    //   333
    //    22
    //     1
    
    void reverse_555_44_3_RTrangle2(){
        System.out.print("Enter any num to 12345  = ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int k=1;k<=n-i; k++)
            System.out.print(" ");
            for(int j=n; j>=n-i+1; j--){
                    System.out.print(i);
            }System.out.println();
         }
    }
    //3.
    // 12345
    //  1__4
    //   1_3
    //    12
    //     1
    
    void reverse_112345_1_4_1_3_RTrangle3(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=i-1;k++)
            System.out.print(" ");
            for(int j=1; j<=n-i+1; j++){
                if(i==1||j==1||j==n-i+1)
                    System.out.print(j);
                    else
                    System.out.print("_");
            }System.out.println();
         }
    }
    //4.
    // 55555
    //  4__4
    //   3_3
    //    22
    //     1
    
    void reverse_555_4__4_3_3RTrangle4(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        int k=1;
        for(int i=n; i>=1; i--){
            for(k=1; k<=n-i;k++)
            System.out.print(" ");
            for(int j=1; j<=i; j++){
                if(i==1||i==j||j==1)
                    System.out.print(i);
                    else
                    System.out.print("_");
            }System.out.println();
         }
    }
    //5.
    // ABCDE
    //  A__D
    //   A_C
    //    AB
    //     A
    // 
    void reverse_ABCD_A_D_B_C_RTrangl5(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
           char character=65;
            for(int k=1; k<=i-1;k++)
            System.out.print(" ");
            for(int j=1; j<=n-i+1; j++){
                if(i==1||j==1||j==n-i+1)
                    System.out.print(character);
                    else
                    System.out.print("_");
                    character++;
            }System.out.println();
         }
    }
    
    //6.
    // ABCDE
    //  ABCD
    //   ABC
    //    AB
    //     A
    
    void reverse_ABCDE_ABCD_ABC_RTrangle6(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
           char character=65;
            for(int k=1; k<=i-1;k++)
            System.out.print(" ");
            for(int j=1; j<=n-i+1; j++){
                    System.out.print(character);
                    character++;
            }System.out.println();
         }
    }
    //7.
    // 11111
    //  2222
    //   333
    //    44
    //     5
    
    void reverse_11111_2222_333_RTrangle7(){
        System.out.print("Enter any num to 12345  = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1;k<=i-1; k++)
            System.out.print(" ");
            for(int j=1; j<=n-i+1; j++){
                    System.out.print(i);
            }System.out.println();
         }
    }
    //8.
    //        *
    //      * *
    //    * * *
    //  * * * *
    //* * * * *
    
    void reverse_S_Oposite_RTrangle8(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++)
            System.out.print(" ");
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }System.out.println();
         }
    }
    //9.
    //      1
    //     1 2
    //    1 2 3
    //   1 2 3 4
    //  1 2 3 4 5
       
    void peramid_1_12_9(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++)
            System.out.print(" ");
            for(int j=1; j<=i; j++){
                    System.out.print(j+" ");
            }System.out.println();
         }
    }
    //10.
    //     A
    //    A B
    //   A B C
    //  A B C D
    // A B C D E  
    
    
    void peramid_A_AspB_10(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            char character=65;
            for(int k=1; k<=n-i; k++)
            System.out.print(" ");
            for(int j=1; j<=i; j++){
                    System.out.print(character+" ");
                    character++;
            }System.out.println();
         }
    }
    //11.
    //      X 
    //     X X 
    //    X__X
    //   X____X
    //  X X X X X
    
    void peramid_x_xsbx_11(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++)
            System.out.print(" ");
            for(int j=1; j<=i; j++){
                if(j==1||j==i||i==n)
                    System.out.print("x ");
                    else
                    System.out.print("  ");
            }System.out.println();
         }
    }
    //12.
    //      *
    //     ***
    //    *****
    //   *******
    //  *********
    
    void peramid_S_odd_12(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++)
            System.out.print(" ");
            for(int j=1; j<=i*2-1; j++){
                    System.out.print("*");
            }System.out.println();
         }
    }
    //13.
    //     1
    //    123
    //   12345
    //  1234567
    // 123456789
    
    
    void peramid_1_123_odd_13(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++)
            System.out.print(" ");
            for(int j=1; j<=i*2-1; j++){
                    System.out.print(j);
            }System.out.println();
         }
    }
    //14.
    //     A
    //    ABC
    //   ABCDE
    //  ABCDEEF
    // ABCDEFGHI
    
    void peramid_A_ABC_odd_14(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            char character=65;
            for(int k=1; k<=n-i; k++)
            System.out.print(" ");
            for(int j=1; j<=i*2-1; j++){
                    System.out.print(character);
                    character++;
            }System.out.println();
         }
    }
    //15
    //     *
    //    *_*
    //   *___* 
    //  *_____* 
    // *********
    void peramid_S_OR_sp_hollow_15(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++)
            System.out.print(" ");
            for(int j=1; j<=i*2-1; j++){
                if(j==1||i==n||j==i*2-1)
                   System.out.print("*");
                else
                   System.out.print("_");   
            }System.out.println();
         }
    }
    //16.
    //     1
    //    1 1
    //   1 2 1
    //  1 3 3 1
    // 1 4 6 4 1
    
    void peramid_1_11_121_1331_pascal_16(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++)
            System.out.print(" ");
            for(int j=1; j<=i; j++){
                if(j==1||i==j)  //first last
                System.out.print(1+" ");
                else if(i-1==j)   //
                System.out.print(j+" ");
                else
                System.out.print("  ");
            }System.out.println();
         }
    }
    //17.
    //     1
    //    1*1
    //   1***1
    //  1*****1
    // 111111111
    
    void peramid_1_1S1_17(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++)
            System.out.print(" ");
            for(int j=1; j<=i*2-1; j++){
                if(j==1||i==n||j==i*2-1)
                    System.out.print("1");
                else
                    System.out.print("*");
            }System.out.println();
         }
    }
    // 18.
    //     A
    //    B B
    //   C   C 
    //  D     D
    // EEEEEEEEE
    
    void peramid_A_BSB_CSSSC_18(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        char character=65;
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++)
            System.out.print(" ");
            for(int j=1; j<=i*2-1; j++){
                if(j==1||i==n||j==i*2-1)
                    System.out.print(character);
                else
                    System.out.print(" ");
            }System.out.println();
            character++;
         }
    }
    //19.
    //     #
    //    *#* 
    //   **#** 
    //  ***#*** 
    // ****#****
    
    void peramid_H_SHS_SSHSS_19(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++)
            System.out.print(" ");
            for(int j=1; j<=i*2-1; j++){
                if(j==(i*2)/2)
                    System.out.print("#");
                else
                    System.out.print("*");
            }System.out.println();
         }
    }
    //20.
    // *********
    //  ******* 
    //   ***** 
    //    ***
    //     * 
    
    void peramid_SSSSS_SSS_S_20(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int k=1; k<n-i+1; k++)
                System.out.print(" ");
            for(int j=1; j<=i*2-1; j++){
                 System.out.print("*");
            }System.out.println();
         }
    }
    //21.
    // * * * * * 
    //  * * * * 
    //   * * * 
    //    * * 
    //     *
    
    void peramid_rev_SSS_SS_S_21(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int k=1; k<n-i+1; k++)
                System.out.print(" ");
            for(int j=1; j<=i; j++){
                 System.out.print("* ");
            }System.out.println();
         }
    }
    //22.
    // 123456789
    //  1234567
    //   12345
    //    123
    //     1
    
    void peramid_rev_12345_123_1_22(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int k=1; k<n-i+1; k++)
                System.out.print(" ");
            for(int j=1; j<=i*2-1; j++){
                 System.out.print(j);
            }System.out.println();
         }
    }
    //23.
    // A B C D E
    //  A B C D
    //   A B C
    //    A B
    //     A
    
    void peramid_rev_ABCDE_ABCD_23(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
        char character=65;
            for(int k=1; k<n-i+1; k++)
                System.out.print(" ");
            for(int j=1; j<=i; j++){
                 System.out.print(character+" ");
                 character++;
            }System.out.println();
         }
    }
    //24.
    // 5 5 5 5 5
    //  4 4 4 4
    //   3 3 3
    //    2 2
    //     1
    
    void peramid_rev_333_22_1_24(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int k=1; k<n-i+1; k++)
                System.out.print(" ");
            for(int j=1; j<=i; j++){
                 System.out.print(i+" ");
            }System.out.println();
         }
    }
    //25.
    // 123456789
    //  1     7
    //   1   5
    //    1 3
    //     1
    
    void peramid_rev_1to9_1Hopllow_25(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int k=1; k<n-i+1; k++)
                System.out.print(" ");
            for(int j=1; j<=i*2-1; j++){
                if(j==1||j==1*2-1)
                 System.out.print(j);
                 else
                 System.out.print(" ");
            }System.out.println();
         }
    }
    //26.
    // 123456789
    //  1+++++7
    //   1+++5
    //    1+3
    //     1
    void peramid_rev_1to9_1plus7_26(){
        System.out.print("Enter any num to exchange 26 = ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int k=1; k<=n-i; k++)
                System.out.print(" ");
            for(int j=1; j<=i*2-1; j++){
                if(j==1||i==n||i*2-1==j) 
                System.out.print(j);
                else
                System.out.print("+");
            }System.out.println();
         }
    }
    //27.
    // x
    // xx
    // xxx
    // xxxx
    // xxx
    // xx
    // x
    
    
    void Arrow_x__xx__xxx_xx_x_27(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        int temp=n-1;
        int local=n-1;
        for(int i=1; i<=n*2-1; i++){
            if(i>n){
            for(int j=1; j<=temp; j++){
                System.out.print("x");
                local=j-1;
               }
            }else{
                for(int j=1; j<=i; j++)
                System.out.print("x");
               }System.out.println();
               temp=local;
            }
         }
    //28.
    // 1
    // 12
    // 123
    // 1234
    // 123
    // 12
    // 1
    
    void Arrow_num_28(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        int temp=n-1;
        int local=n-1;
        for(int i=1; i<=n*2-1; i++){
            if(i>n){
            for(int j=1; j<=temp; j++){
                System.out.print(j);
                local=j-1;
               }
            }else{
                for(int j=1; j<=i; j++)
                System.out.print(j);
               }System.out.println();
               temp=local;
            }
         }
    //29.
    //    1
    //   12
    //  123
    // 1234
    //  123
    //   12
    //    1
    
    void Arrow_num_rev_29(){
        System.out.print("Enter any num to exchange  29 = ");
        int n = sc.nextInt();
        int temp=n-1;
        int local=n-1;
        for(int i=1; i<=(n*2)-1; i++){
            if(i>n){
            for(int k=n; k>temp;k--){
            System.out.print(" ");
            }    
            for(int j=1; j<=temp; j++){
                System.out.print(j);
                local=j-1;
               }
            }else{
                for(int k=1; k<=n-i;k++)
                System.out.print(" ");
                for(int j=1; j<=i; j++)
                System.out.print(j);
               }System.out.println();
               temp=local;
            }
         }
    //30.
    // 1
    // 1 2
    // 1  3
    // 1   4
    // 1  3
    // 1 2
    // 1
    
    void Arrow_hollow_30(){
        System.out.print("Enter any num to exchange = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(j==1||i==j)
                 System.out.print(" "+j);
                else
                 System.out.print("  "); 
            }System.out.println();
         }
         for(int i=n-1; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(j==1||i==j)
                 System.out.print(" "+j);
                else
                 System.out.print("  "); 
            }System.out.println();
         }
    }
    //31.
    //    *
    //   *_*
    //  *_*_*
    // *_*_*_*
    //  *_*_*
    //   *_*
    //    *  
    void Dymond_S_SP_31(){
        System.out.print("Enter any num to exchange 26 = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++)
                System.out.print(" ");
            for(int j=1; j<=i; j++){
                System.out.print("*");
                if(i>1&&j<i)
                System.out.print("_");
            }System.out.println();
         }
         for(int i=1; i<=n-1; i++){
            for(int k=1; k<=i; k++)
                System.out.print(" ");
            for(int j=i; j<=n-1; j++){
                System.out.print("*");
                if(i<n-1&&j<n-1)
                System.out.print("_");
            }System.out.println();
         }
    }
    //32.
    //    *
    //   ***
    //  ***** 
    // ******* 
    //  ***** 
    //   *** 
    //    *
    // 
    void Dymond_S_32(){
        System.out.print("Enter any num to exchange 26 = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++)
                System.out.print(" ");
            for(int j=1; j<=i*2-1; j++){
                System.out.print("*");
            }System.out.println();
         }
         for(int i=n-1; i>=1; i--){
            for(int k=1; k<=n-i; k++)
                System.out.print(" ");
            for(int j=1; j<=i*2-1; j++){
                System.out.print("*");
            }System.out.println();
         }
    }
    //33.
    //    *
    //   *_* 
    //  *___* 
    // *_____*
    //  *___*         
    //   *_*
    //    *
    
    void Dymond_SP_HOllow_33(){
        System.out.print("Enter any num to exchange 26 = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++)
                System.out.print(" ");
            for(int j=1; j<=i*2-1; j++){
                if(j==1||j==i*2-1)
                System.out.print("*");
                else
                System.out.print("_");
            }System.out.println();
         }
         for(int i=n-1; i>=1; i--){
            for(int k=1; k<=n-i; k++)
                System.out.print(" ");
            for(int j=1; j<=i*2-1; j++){
                if(j==1||j==i*2-1)
                System.out.print("*");
                else
                System.out.print("_");
            }System.out.println();
         }
    }
    // 34.
//  ______
//  |\  /|
//  | \/ |
//  | /\ |
//  |/  \|
//  ------
     
     void Timmer_34(){
     System.out.print("Enter any num to exchange 26 = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            // for(int k=1; k<=n-i; k++)
            //     System.out.print(" ");
            for(int j=1; j<=n; j++){
                if(i==1)
                System.out.print("_");
                else if(i==n)
                System.out.print("-");
                else if(j==1||j==n)
                System.out.print("|" );
                else if(i+j==n+1)
                System.out.print("/");
                else if(i==j)
                System.out.print("\\");
                else
                System.out.print(" ");
            }System.out.println();
         }
    }
    //35.

    //     1
    //    212
    //   32123
    //  4321234
    // 543212345
    
    void peramid_1_212_32123_35(){
        System.out.print("Enter any num to exchange 26 = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n-1; j++)
                System.out.print(" ");
            for(int k=i; k>=1; k--)
                System.out.print(k);
            for(int l=2; l<i+1; l++)
                System.out.print(l);
            System.out.println();
         }
    }
    //36.

  //  *        *
  //  **      **
  //  ***    ***
  //  ****  ****
  //  **********

    void singh_pattern_36(){
        System.out.print("Enter any num to exchange 26 = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print("*");
            for(int k=1; k<=(n*2)-(i*2); k++)
                System.out.print(" ");
            for(int l=1; l<=i; l++)    
                System.out.print("*");
            System.out.println();
         }
    }
    //37.

    // **********
    // ****  ****
    // ***    ***
    // **      **
    // *        *
    
    void rev_singh_pattern_37(){
        System.out.print("Enter any num to exchange 26 = ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++)
                System.out.print("*");
            for(int k=1; k<=(i*2); k++)
                System.out.print(" ");
            for(int l=1; l<=n-i; l++)    
                System.out.print("*");
            System.out.println();
         }
    }
    //38.
    // **********
    // ****  ****
    // ***    ***
    // **      **
    // *        *
    // *        *
    // **      **
    // ***    ***
    // ****  ****
    // **********
    
    void full_singh_pattern_38(){
        System.out.print("Enter any num to exchange 26 = ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++)
                System.out.print("*");
            for(int k=1; k<=(i*2); k++)
                System.out.print(" ");
            for(int l=1; l<=n-i; l++)    
                System.out.print("*");
            System.out.println();
         }
         for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print("*");
            for(int k=1; k<=(n*2)-(i*2); k++)
                System.out.print(" ");
            for(int l=1; l<=i; l++)    
                System.out.print("*");
            System.out.println();
         }
    }
    //39.
    //     1
    //     2
    //     3
    //     4
    // 123454321
    //     4
    //     3
    //     2
    //     1

    void plus_39(){
        System.out.print("Enter any num to exchange 26 = ");
        int n = sc.nextInt();
        for(int i=1; i<=n*2-1; i++){
            for(int j=1; j<=n*2-1; j++){
            if(j==n && i<n)
                System.out.print(i);
            else if(i==n)
                 if(j>n)
                 System.out.print(n*2-j);
                 else
                System.out.print(j);
            else if(i>n&&j==n)
                System.out.print(n*2-i);
            else
            System.out.print(" ");
            }System.out.println();
         }
    }
    //40.
    //      1               
    //     101            
    //    10101         
    //   1010101           
    //  101010101   
    // 10101010101
    

    void peramid_1_101_10101_40(){
        System.out.print("Enter any num to exchange 26 = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            for(int k=1; k<=i*2-1; k++){
                System.out.print(k%2);
            }System.out.println();
         }
    }

    //41.
   //*          *
    // *      *
    //   *  *
    //     *
    //    *  *
    //  *      *
    //*          *
     

    void STR_X_41(){
        System.out.print("Enter any num to exchange 26 = ");
        int a=10,b=20;
        
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
            if(i==j||i+j==n+1)
                System.out.print("*");
                else
                System.out.print(" ");
            }System.out.println();
         }
    }
    
}
public class j3_Patterns2 {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        Patterns2 pa = new Patterns2();
        pa.reverse_12345_1234_RTrangle1();
        // pa.reverse_555_44_3_RTrangle2();
        // pa.reverse_112345_1_4_1_3_RTrangle3();
        // pa.reverse_555_4__4_3_3RTrangle4();
        // pa.reverse_ABCD_A_D_B_C_RTrangl5();
        // pa.reverse_ABCDE_ABCD_ABC_RTrangle6();
        // pa.reverse_11111_2222_333_RTrangle7();
        // pa.reverse_S_Oposite_RTrangle8();
        // pa.peramid_1_12_9();
        // pa.peramid_A_AspB_10();
        // pa.peramid_x_xsbx_11();
        // pa.peramid_S_odd_12();
        // pa.peramid_1_123_odd_13();
        // pa.peramid_A_ABC_odd_14();
        // pa.peramid_S_OR_sp_hollow_15();
        // pa.peramid_1_11_121_1331_pascal_16();
        // pa.peramid_1_1S1_17();
        // pa.peramid_A_BSB_CSSSC_18();
        // pa.peramid_H_SHS_SSHSS_19();
        // pa.peramid_SSSSS_SSS_S_20();
        // pa.peramid_rev_SSS_SS_S_21();
        // pa.peramid_rev_12345_123_1_22();
        // pa.peramid_rev_ABCDE_ABCD_23();
        // pa.peramid_rev_333_22_1_24();
        // pa.peramid_rev_1to9_1Hopllow_25();
        // pa.peramid_rev_1to9_1plus7_26();
        // pa.Arrow_x__xx__xxx_xx_x_27();
        // pa.Arrow_num_28();
        // pa.Arrow_num_rev_29();
        // pa.Arrow_hollow_30();
        // pa.Dymond_S_SP_31();
        // pa.Dymond_S_32();
        // pa.Dymond_SP_HOllow_33();
        pa.Timmer_34();
        // pa.peramid_1_212_32123_35();
        // pa.singh_pattern_36();
        // pa.rev_singh_pattern_37();
        // pa.full_singh_pattern_38();
        // pa.plus_39();
        // pa.peramid_1_101_10101_40();
        // pa.STR_X_41();


    }
}
