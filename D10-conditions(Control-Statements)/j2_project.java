import java.util.Scanner;

class all{
    Scanner sc = new Scanner(System.in);
    // 1. Take values of length and breadth of a rectangle from user and check if it is square or not.
    
    void first(){
        System.out.print("Enter Length of rectangle = ");
        float length = sc.nextFloat();
        System.out.print("Enter Breath of rectangle = ");
        float breath = sc.nextFloat();
        if(length==breath)
        System.out.println("This is a Rectangle ");
        else
        System.out.println("this is a Rectangle");
    }
//2.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
// Ask user for quantity
// Suppose, one unit will cost 100.
// Judge and print total cost for user

   void second(){
    System.out.print("Enter quantity of product = ");
    int quantity = sc.nextInt();
    System.out.print("Enter price of product = ");
    int price = sc.nextInt();

    if(quantity >= 1000)
    System.out.println("Total amount with 10% disscount is = "+(quantity*price)/10);
    else
    System.out.println("Total Amount is = "+(quantity*price));
   }
// 3.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
// Ask user for their salary and year of service and print the net bonus amount.

void thired(){
    System.out.print("\nEnter Your Year Of Service = ");
    int year = sc.nextInt();
    System.out.println("Enter Your Salary = ");
    int salary = sc.nextInt();

    if(year>5)
    System.out.println("Your Total Bonus is = "+(salary*5/100));
    else
    System.out.println("You are not aligibal for bonus");
}

//4.A school has following rules for grading system:
// a. Below 25 - F
// b. 25 to 45 - E
// c. 45 to 50 - D
// d. 50 to 60 - C
// e. 60 to 80 - B
// f. Above 80 - A
// Ask user to enter marks and print the corresponding grade.

void fourth(){
    System.out.print("\nPlease Enter your marks = ");
    int marks = sc.nextInt();

    if(marks>=80)
    System.out.println("your Grade is A");
    else if(marks>=60)
    System.out.println("Your Grade is B ");
    else if(marks>=50)
    System.out.println("Your Grade is C ");
    else if(marks>=45)
    System.out.println("Your Grade is D ");
    else if(marks>=25)
    System.out.println("Your Grade is E ");
    else 
    System.out.println("Your Grade is F ");
}
//5.Take input of age of 3 people by user and determine oldest and youngest among them.

void fifth(){
    System.out.print("\nPlease Enter First Person Age = ");
    int age1 = sc.nextInt();
    System.out.print("Please Enter Second Person Age = ");
    int age2 = sc.nextInt();
    System.out.print("Please Enter Thired Person Age = ");
    int age3 = sc.nextInt();

    if(age1>age2){
    if(age1>age3){
    System.out.println("\nFirst Person is Oldest = "+age1);
    if(age2>age3){
    System.out.println("Second  Person is  Midddel = "+age2);
    System.out.println("Thired Person is Youngest  Of THem = "+age3);
    }else {
    System.out.println("Thired Person is Middel Of THem = "+age3);
    System.out.println("Second  Person is  Youngest Of Them = "+age2);
    }}else{ 
    System.out.println("\nThired Person is Oldest of THem = "+age3);
    System.out.println("First  Person is  Midddel Of Them = "+age1);
    System.out.println("Second  Person is  Youngest of Them = "+age2);
    }
    }
    else if(age2>age3)
    {
        System.out.println("\nSecond  Person is  Odldest of Them = "+age2);
     if(age1>age3){
        System.out.println("First Person is Middel Of Them = "+age1);
        System.out.println("Thired Person is Youngest of THem = "+age3);
     }else{
        System.out.println("Thired Person is Middel Of THem = "+age3);
        System.out.println("First Person is Youngest of THem = "+age1);
     }
    }else{
        System.out.println("\nThired Person is Oldest of THem = "+age3);
    if(age1>age2){
       System.out.println("First Person is Middel Of Them = "+age1);
    System.out.println("Second Person is Youngest of THem = "+age2);
    }else{
       System.out.println("Second  Person is  Middel of Them = "+age2);
       System.out.println("First Person is Youngest of THem = "+age1); 
    }}
}
//6. Write a program to print absolute vlaue of a number entered by user. E.g.-
// INPUT: 1        OUTPUT: 1
// INPUT: -1        OUTPUT: 1

void sixth(){
    System.out.print("Enter The Valve = ");
    int input = sc.nextInt();

    if(input<0){
        input = input*(-1);
        System.out.println("Entered Value is = "+input);
    }
    else{
        System.out.println("Absolute Value is = "+input);
    }
}

//7. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
// Take following input from user
// Number of classes held
// Number of classes attended.
// And print
// percentage of class attended
// Is student is allowed to sit in exam or not.

void seventh(){
    float percentage;
    System.out.print("\nEnter Total Classes Are Held = ");
    float classesH = sc.nextFloat();
    System.out.print("Enter TOtal Attened Classes Of Student = ");
    float attenedC = sc.nextFloat();
    percentage = (attenedC*100)/classesH;
    System.out.println("\nTotal Percentage Of Student is = "+percentage+"%");

    if(percentage<75)
        System.out.println("You Are Not Eligible TO Give Exam");
    else  
        System.out.println("You AARE Eligible For Exam");
}
//8. Modify the above question to allow student to sit if he/she has medical cause. 
// Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

void eighth(){
// boolean Y=true,N=false,student;
System.out.print("Enter Student Have any cause or not give 'true' & 'false' = ");
// char n = sc.next().charAt(0);
boolean n = sc.nextBoolean();
if(n)
System.out.println("Yes Student have Medical cause");
else
System.out.println("No Student does't have any Medical Cause");

}
//9. Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).

void nineth(){
    System.out.print("Enter any Character = ");
    char input = sc.next().charAt(0);

    if(input >='a' && input <='z' ){
System.out.println("\nthis character is small latter");
    }else if(input >='A' && input <='Z'){
        System.out.println("\nTHis character in Capital Lateer");
    }else{
        System.out.println("\nDefault");
    }
}
//10.Write a program to check if a year is leap year or not.
// If a year is divisible by 4 then it is leap year but if the year
//  is century year like 2000, 1900, 2100 then it must be divisible by 400.

void tenth(){
    System.out.print("Enter year Checking it is Leap Year Or Not = ");
    int year = sc.nextInt();

    if(year%4==0){
        System.out.println("Entered Year is a Leap Year = "+year);
    }else{
        System.out.println("Entered year is Not Leap Yea = "+year);
    }
}

//11. Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
// if employee is female, then she will work only in urban areas.
// if employee is a male and age is in between 20 to 40 then he may work in anywhere
// if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
// And any other input of age should print "ERROR".

void elewenth(){
    System.out.print("\nPlease Enter Person Age = ");
    int age = sc.nextInt();
    System.out.print("Please Enter Gender 'm' or 'f' = ");
    char gender = sc.next().charAt(0);
    System.out.print("Please Enter Martial Status 'y' or 'n' = ");
    char martial = sc.next().charAt(0);

    if(gender == 'f' || age>=40 && age<=60){
        System.out.println("work only Urbun Area");
    }else if(gender == 'm' && age>=20 && age<=40){
        System.out.println("Work Anywhere");
    }else{
        System.out.println("'Error'");
    }
}

//12.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
// INPUT : 1234        OUTPUT : 4321
// INPUT : 5982        OUTPUT : 2895 


void twelth(){
    System.out.print("\nPlease Enter a Number for Revers = ");
    int num = sc.nextInt();
    int copyO=num;
    int r,reverse=0;
    while(num!=0){
        r=num%10;
        reverse=reverse*10+r;
        num=num/10;
    }

       System.out.println("Entered Number is "+copyO+"and Revers is = "+reverse);
}
//13. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
// Test Data
// Input number: 3
// Expected Output :
// Wednesday

void therteen(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A Number that change in weekday 1 to 7 = ");
int num=sc.nextInt();
if(num==1)
System.out.println("\nMonday");
if(num==2)
System.out.println("\nTuesday");
if(num==3)
System.out.println("\nWednessday");
if(num==4)
System.out.println("\nThusday");
if(num==5)
System.out.println("\nFriday");
if(num==6)
System.out.println("\nSatrday");
if(num==7)
System.out.println("\nSunday");
}

//14.Write a program to accept percantage from the user and
// display grade according to the following criteria
// Marks	  		Grade
// > 90       		 A
// >80 and <=90		 B
// >=60 and <=80	 C
// below 60		     D

void Fourteen(){
    Scanner sc = new Scanner(System.in);
   System.out.print("Enter Marks to provide Grade ");
   int marks = sc.nextInt();

   if(marks>90)
   System.out.println("Your Grade is A");
   else if(marks>80 && marks<=90)
   System.out.println("Your Grade is b");
   else if(marks>=60 && marks<=80)
   System.out.println("Your Grade is C");
   else
   System.out.println("Your Grade is D");
}

//15. Write a java program to accept the cost price of a bike
// and display the road tax to be paid according to the 
// following criteria.
// Cost Price(In Rs)		Tax
//  > 100000			    15%
//  >50000 and <=100000	    10%
//  <=50000			         5%

void fifteen(){
    Scanner sc = new Scanner(System.in);
   System.out.print("Enter Proce of a Bike = ");
   int price = sc.nextInt();

   if(price>100000)
    System.out.println("Toatal Tax of Bike is = "+(price/15));
   else if(price<100000 && price>50000)
   System.out.println("Toatal Tax of Bike is = "+(price/10));
   else 
   System.out.println("Toatal Tax of Bike is = "+(price/5));
}

// 1. WAP to calculate area of circle
// area of circle = pai*R²;
void one1(){
    System.out.print("Enter Radius of circle");
    float radius = sc.nextFloat();
    float pai = 3.14f;
    float areaOC = pai*radius*radius;
    System.out.println("Area of Circle = "+areaOC);
}
// 2. WAP to calculate area of rectangle
 void two2(){
    System.out.println("Area of Rectangle");
    System.out.print("Enter Length = ");
    float Length = sc.nextFloat();
    System.out.print("Enter Breath = ");
    float Breath = sc.nextFloat();

    System.out.println("Area of Rectangle is = "+(Length*Breath));
 }

//  3. WAP to calculate the percentage of students

void three3(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first subject Marks = ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd subject Marks = ");
    int b = sc.nextInt();
    System.out.print("Enter 3rd subject Marks = ");
    int c = sc.nextInt();
    System.out.print("Enter 4rth subject Marks = ");
    int d = sc.nextInt();
    System.out.print("Enter 5th subject Marks = ");
    int e = sc.nextInt();

    int percentage = ((a+b+c+d+e))/5;
    System.out.print("Percentage of Student is = "+percentage+"%");
}

// 4. WAP to exchange value to two variable with third variable and without third variable


void four4(){
    int n = 5;
    int m = 10;
    int temp = n;
    n=m;
    m=temp;
    System.out.println("swapping Value of n=5,m=10 n="+n+",m="+m);


    int k=5,l=10;
    k=k+l;
    l=k-l;
    k=k-l;
    System.out.println("Swapping Vlaue Without thired Variable k=5,l=10 After k="+k+",l="+l);
}

// 5. WAP to exchange value of two variable without using third variable and arithmetic operator
//// Bitwise ^ operator

void five5(){
    int p=5,q=10;
    p=p^q;
    q=q^p;
    p=p^q;
    System.out.println("Swapping Vlaue With Bitwise Operator p=5,q=10 After p="+p+",q="+q);
}
//6. WAP to find greater among two number
void six6(){
    System.out.print("Enter first input = ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd input = ");
    int b = sc.nextInt();

    if(a>b)
    System.out.println("A is Greatest Among Of them  a is = "+a);
    else 
    System.out.println("B is Greatest Among Of them  b is = "+b);
}
//7. WAP to find greater among three number
 void seven7(){
    System.out.print("Enter first input = ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd input = ");
    int b = sc.nextInt();
    System.out.print("Enter 3rd input = ");
    int c = sc.nextInt();

    if(a>b && a>c)
        System.out.println("A is greater = "+a);
    else if(b>c && b>a)
        System.out.println("B is greater = "+b);
    else
        System.out.println("C is Greater Number = "+c);
 }

//8. WAP to check wheather number is even or odd
 void eight8(){
    System.out.print("Enter  input = ");
    int a = sc.nextInt();
    if(a%2==0)
    System.out.println("Enterd Number is even = "+a);
    else
    System.out.println("Enterd Number is odd = "+a);
 }

 //9. WAP to check wheater number is positive or negative
void nine9(){
    System.out.print("Enter  input = ");
    // int a = sc.nextInt();
    float a = sc.nextFloat();
    if(a>0)
    System.out.println("Enterd Number is POsitive = "+a);
    else
    System.out.println("Enterd Number is Negative = "+a);
}
// 10. Print number between 1 to 5 in word format 
 void ten10(){
    System.out.print("Enter  input = ");
    int num = sc.nextInt();
    switch (num) {
     case 1:
     System.out.println("a");
     break;
    case 2:
    System.out.println("b");
    break;
    case 3:
     System.out.println("c");
     break;
     case 4:
     System.out.println("d");
    break;
    case 5:
     System.out.println("e");
    break;
    default:
    System.out.println("Default");       
    break;
    }
 }
//11. Find even odd using switch case 
void eleven11(){
    System.out.print("Enter  input for finding Even Or Odd Value = ");
    int num = sc.nextInt();
    num = num%2;
    switch (num) {
     case 0:
     System.out.println("ENtered Num is Even");
     break;
    default:
    System.out.println("Entered Num is Odd");
    break;
}
}
//12. Check given character is vowel or not using switch case 

void tvelew12(){
    System.out.print("Enter  input = ");
    char cha = sc.next().charAt(0);
    switch (cha) {
     case 'a':
     System.out.println("a");
     break;
    case 'e':
    System.out.println("b");
    break;
    case 'i':
     System.out.println("c");
     break;
     case 'o':
     System.out.println("d");
    break;
    case 'u':
     System.out.println("e");
    break;
    default:
    System.out.println("Default");       
    break;
    }
}

//13. Program to perform arithmetic operation using switch case

void thirteen13(){
    System.out.print("Enter 1 FOR Addition ");
    System.out.print("Enter 2 For Substraction ");
    System.out.print("Enter 3 For Multiplication ");
    System.out.print("Enter 4 For DIvision ");

    System.out.print("Enter  input = ");
    int input = sc.nextInt();
    if(input>=1 && input<=4){
    System.out.print("Enter  input = ");
    int a = sc.nextInt();
    System.out.print("Enter  input = ");
    int b = sc.nextInt();
    switch (input) {
        case 1:System.out.println("Addition of two value is = "+(a+b));break;
        case 2:System.out.println("Addition of two value is = "+(a-b));break;
        case 3:System.out.println("Addition of two value is = "+(a*b));break;
        case 4:System.out.println("Addition of two value is = "+(a/b));break;
        default:System.out.println("input is INvalid");break;
    }
}else System.out.println("Invalid Input");
}

//14. WAP to find lowest number among four different number 

void fourteen14(){
    System.out.println("Enter four numbers ");
        System.out.print("first = ");
        int num1=sc.nextInt();
        System.out.print("first = ");
        int num2=sc.nextInt();
        System.out.print("first = ");
        int num3=sc.nextInt();
        System.out.print("first = ");
        int num4=sc.nextInt();

        if(num1<num2||num1<num3||num1<num4){
            System.out.println(num1+" is lowest number to num2,num3 and num4.");
        }
        else if(num2<num1||num2<num3||num2<num4){
            System.out.println(num2+" is lowest number to num1,num3 and num4.");
        }
        else if(num3<num2||num3<num2||num3<num4){
            System.out.println(num3+" is lowest number to num1,num2 and num4.");
        }
        else {
            System.out.println(num4+" is lowest number to num1,num2 and num3.");
        }
}

//15. WAP to check given year is a leap year or not 
void fifteen15(){
    System.out.print("enter any year = ");
    int year=sc.nextInt();
    if(year%400==0||year%4==0 && year%100!=0){
        System.out.println("This year is leap year");
    }
    else{
        System.out.println("This year is not leap year");
    }
 }
// 16. W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit. 
// For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius.
//  If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit. 
void sixteen16(){
    System.out.print("Enter any value = ");
        int value=sc.nextInt();
        System.out.print("do you want to change 'C' or 'F' = ");
        char ch=sc.next().charAt(0);
        float celsius,fahrenhite;
        if(ch=='c'||ch=='C'){
            celsius=(value-32)*5/9;
            System.out.println("Celsius = "+celsius);
        }
        else if(ch=='f'||ch=='F'){
            fahrenhite=(9/5)*value+32;
            System.out.println("Fahrenhite = "+fahrenhite);
        }
        else{
            System.out.println("Default character");
        }
} 
//17. W.A.P to check the sign of given number. 

void seventeen17(){
   
}
//18. W.A.P to check whether given number is even or odd Without using % operator. 
void eighteen18(){
    System.out.print("Enter any value for check even odd without module = ");
    int value=sc.nextInt();
    if((value/2)*2==value)
        System.out.println("Given Value is even = "+value);
    else
        System.out.println("Given Number is Odd = "+value); 
}

//19. W.A.P to check whether the traingle is equilateral, scalene, or isosceles. Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length. 
// Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal. Scalene triangle: A scalene triangle is a triangle that has three unequal sides. 

void nineteen19(){
    System.out.println("Enter three Sides of Traingle ");
    System.out.println("sideA = ");
    int sideA = sc.nextInt();
    System.out.println("sideB = ");
    int sideB = sc.nextInt();
    System.out.println("sideC = ");
    int sideC = sc.nextInt();

    if(sideA==sideB&&sideA==sideC)
        System.out.println("Traingle is Eqivelent");
    else if(sideA==sideB || sideA==sideC || sideB==sideC)
        System.out.println("Taingle is Isoscel");
    else 
    System.out.println("Traingle is Sceleten");
}


//20. W.A.P to check whether a charachter is an alphabet or not.
void twenty20(){
    System.out.print("Enter a character and checking is character or not = ");
    char input = sc.next().charAt(0);

    if(input>='a' || input<='z')
        System.out.println("INput is Character");
    else 
        System.out.println("Input IS Not Character");    
    }
//21. Java program to check whether the triangle is valid or not if angles are given.
//  Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180. 

void twenty21(){
    System.out.println("Enter three angle of Traingle to check valid or not valid Traingle ");
    System.out.print("angleA = ");
    int angleA = sc.nextInt();
    System.out.print("angleB = ");
    int angleB = sc.nextInt();
    System.out.print("angleC = ");
    int angleC = sc.nextInt();

    if(angleA+angleB+angleC == 180)
        System.out.println("Traingle  ahve valid angle ");
    else 
        System.out.println("Taingle is  Not Valid");
}
// 22. Write a Java program to check whether a number is divisible by 5 and 11 or not. 
void twenty22(){
    System.out.println("Enter a Num to check number is divisible by 5 or 11 = ");
    int number = sc.nextInt();
    if(number/5==0 ||number/11==0)
        System.out.println("Num is divisible by 5 or 11");
    else
        System.out.println("Num is Not Divisible by 5 or 11");
}
//23. Write a Java program to input day number and print week day. 
void twenty23(){
    System.out.print("Enter  input 1 to 7 check a week  day = ");
    int num = sc.nextInt();
    switch (num) {
     case 1:
     System.out.println("Monday");
     break;
    case 2:
    System.out.println("Tuesday");
    break;
    case 3:
     System.out.println("Wednesday");
     break;
     case 4:
     System.out.println("Thuseday");
    break;
    case 5:
     System.out.println("Friday");
    break;
    case 6:
     System.out.println("Satday");
    break;
    case 7:
     System.out.println("Sunday");
    break;
    default:
    System.out.println("Default");       
    break;
    }
}
//24. Write a Java program to count total number of notes in given amount. 
void twenty24(){
    System.out.print("Enter a amount = ");
    int money = sc.nextInt();
    int n500,n200,n100,n50,n20,n10,n5,n2,n1;
    
    if(money>=500){
        n500 = money/500;
        money -= n500*500;
        System.out.println(" 500 = "+n500);
    }if(money>=200){
        n200 = money/200;
        money -= n200*200;
        System.out.println(" 200 = "+n200);
    }if(money>=100){
        n100 = money/100;
        money -= n100*100; 
        System.out.println(" 100 = "+n100);
    }if(money>=50){
        n50 = money/50;
        money -= n50*50; 
        System.out.println(" 50 = "+n50);
    }if(money>=20){
        n20 = money/20;
        money -= n20*20;
        System.out.println(" 20 = "+n20);
    }if(money>=10){
        n10 = money/10;
        money -= n10*10; 
        System.out.println(" 10 = "+n10);
    }if(money>=5){
        n5 = money/5;
        money -= n5*5; 
        System.out.println(" 5 = "+n5);
    }if(money>=2){
        n2 = money/2;
        money -= n2*2; 
        System.out.println(" 2 = "+n2);
    }if(money>=1){
        n1 = money/1;
        money -= n1*1; 
        System.out.println(" 1 = "+n1);
    }
}
//25. Write a Java program to calculate profit or loss. 

void twenty25(){
    System.out.print(" Enter a buy value = ");
    int buy =sc.nextInt();
    System.out.print(" Enter a buy value = ");
    int sell =sc.nextInt();

    if(buy<sell)
        System.out.println("Total profit is = "+(sell-buy));
    else
        System.out.println("Total loss is = "+(buy-sell));
}

// 26. Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
// 	Percentage >= 90% : Grade A 
// 	Percentage >= 80% : Grade B 
// 	Percentage >= 70% : Grade C 
// 	Percentage >= 60% : Grade D 
// 	Percentage >= 40% : Grade E 
// 	Percentage < 40% : Grade F
void percentage_std26(){
    System.out.print("Enter Physics subject Marks = ");
    int a = sc.nextInt();
    System.out.print("Enter Chemisry subject Marks = ");
    int b = sc.nextInt();
    System.out.print("Enter Maths subject Marks = ");
    int c = sc.nextInt();
    System.out.print("Enter Hindi subject Marks = ");
    int d = sc.nextInt();
    System.out.print("Enter English subject Marks = ");
    int e = sc.nextInt();

    int percentage = ((a+b+c+d+e))/5;
    // System.out.print("Percentage of Student is = "+percentage);
    if(percentage>=90)
    System.out.println("YOUR Grade is A of = "+percentage+"%");
    else if(percentage>=80)
    System.out.println("YOUR Grade is B of = "+percentage+"%");
    else if(percentage>=70)
    System.out.println("YOUR Grade is C of = "+percentage+"%");
    else if(percentage>=60)
    System.out.println("YOUR Grade is D of = "+percentage+"%");
    else if(percentage>=40)
    System.out.println("YOUR Grade is E  of = "+percentage+"%");
    else
    System.out.println("You Are Fail and Grade is F = "+percentage+"%");
}

//27. Write a Java program to input basic salary of an employee and calculate its Gross salary according to following:
// Basic Salary <= 10000 : HRA = 20%, DA = 80% 
// Basic Salary <= 20000 : HRA = 25%, DA = 90% 
// Basic Salary > 20000 : HRA = 30%, DA = 95% 

void salaryEmp27(){
    System.out.print("Enter  Your Basic Salary = ");
    int salary = sc.nextInt();
    int total_salary;
    if(salary<=10000){
        total_salary = ((salary*20/100)+(salary*80/100)+salary);
    System.out.println("YOUR Total salary is = "+total_salary);
    }else if(salary<20000){
    total_salary = ((salary*25/100)+(salary*90/100)+salary);
    System.out.println("YOUR  Total salary is = "+total_salary);
    }else{
        total_salary = ((salary*30/100)+(salary*95/100)+salary);
    System.out.println("You  Total salary is = "+total_salary);
    }
}
// 28. Write a C program to input electricity unit charges and calculate total electricity bill according to the given condition: 
// For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit above 250 Rs.
//  1.50/unit An additional surcharge of 20% is added to the bill. 
 void bill_28(){
    System.out.print("Enter Your Electricity Bill = ");
    float bill = sc.nextInt();
    float total_bill;
    if(bill<=50){
        total_bill = (bill*0.50f);
    System.out.println("1.YOUR Total Electricity bill is = "+total_bill);
    }else if(bill<=100){
    total_bill = (bill*0.75f);
    System.out.println("2.YOUR  Total Electricity bill is = "+total_bill);
    }else if(bill>100&&bill<250){
        total_bill = (bill*1.20f);
    System.out.println("3.You  Total Electricity bill is = "+total_bill);
    }else{
        total_bill=((bill*1.50f)+(bill*20/100));
    System.out.println("4.You  Total Electricity bill is = "+total_bill);
    }
 }
//29. Write a program to input choice from user. If user enter ‘+’ as choice then calculate addition of 2 number. 
// If Choice ‘>’ then check which number is greaterst. If choice is ‘==’ then check both number is equal or not.
void As_userplus29(){
    System.out.print("Enter any sign like == checkig or + adding or > greater use key is 1,2,3 = ");
    int input = sc.nextInt();
    if(input>=1 && input<=3){
    System.out.print("Enter first input = ");
    int a = sc.nextInt();
    System.out.print("Enter  Second input = ");
    int b = sc.nextInt();

    if(input==1){
        if(a==b)
        System.out.println("There are two values equal a and b");
        else
        System.out.println("there no equal values");
    }else if(input==2){
        a=a+b;
        System.out.println("sum of a+b is = "+(a+b));
    }else{
        if(a>b)
        System.out.println("A is greater then b"+a);
        else
        System.out.println("B is greater then a"+b);
    }
    }else{
        System.out.println("Invailid Input");
        }
}
}

public class j2_project {
    public static void main(String[] args){
// Scanner sc = new Scanner(System.in);

        all obj = new all();
        // obj.first();
        // obj.second();
        // obj.fourth();
        // obj.fifth();
        // obj.sixth();
        // obj.seventh();
        // obj.eighth();
        // obj.nineth();
        // obj.tenth();
        // obj.elewenth();
        // obj.twelth();
        // obj.therteen();
        // obj.Fourteen();
        // obj.fifteen();
        // obj.one1();
        // obj.two2();
        // obj.three3();
        // obj.four4();
        // obj.five5();
        // obj.six6();
        // obj.seven7();
        // obj.eight8();
        // obj.nine9();
        // obj.ten10();
        // obj.eleven11();
        // obj.tvelew12();
        // obj.thirteen13();
        // obj.fourteen14();
        // obj.fifteen15();
        // obj.sixteen16();
        // obj.seventeen17();
        // obj.eighteen18();
        // obj.nineteen19();
        // obj.twenty20();
        // obj.twenty21();
        // obj.twenty22();
        // obj.twenty23();
        // obj.twenty24();
        // obj.twenty25();
        // obj.percentage_std26();
        // obj.salaryEmp27();
        // obj.bill_28();
        obj.As_userplus29();
    }
}
