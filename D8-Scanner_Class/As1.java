 class Test {
// 1.	 The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area.

 void One(){
float l= 70;
float P= 230;
float b= (P/2)-l;
float a =b*l;
    System.out.println("Breath of reactangle\t"  +b);
    System.out.println("Area of reactangle\t"    +a);
  }


// 2. The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter. 

 void two(){
float a=96;
float b=8;
float l=a/b;
 System.out.println("lenth of reactangle\t" +l);
 float Pe = (l+b)*2;
System.out.println("perimeter of reactangle\t" +Pe);
    
}

// 3. How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm? 
void three()
{
  float tl= 13;
  float tb =7;
  float ta=tl*tb;
  float  wl =520;
  float wb= 140;
  float wa = wl*wb;
  System.out.println("area of tiles ="+ta);
  System.out.println(" area of wall="+wa);
  float no = wa/ta;
  System.out.println(" total no. of tiles="+no);
}

// 4. Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m. 
void four()
{
  int a=20,b=30,c=50,d=100,e=80;
  int avg=(a+b+c+d+e)/5;
  System.out.println("the average of no="+avg);
  }
  
// 5. If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per m², find the breadth of the park and its perimeter. Also, find the area of the field.
void Five(){
float lengh= 20,Breath,area,peri,cost=1600,rate=25;

area=cost/rate;
Breath=area/lengh;
peri= 2*(lengh+Breath);

System.out.println(area+"     "+peri);
  }

// 6.Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter 36 cm.
void triangle(){

float a=10,b=9,c,peri=36;

c= peri-(a+b);
System.out.println(c);
}

// 7. Find the height of a triangle whose base is 50 cm and whose area is 500 cm².
void  trangle_a(){
float a=500,h,b=50;
h=a*2/(b);
System.out.println(h);
}


// 8. Find the base of a triangle whose altitude is 20 cm and area is 0.8 m².
void  trangle_ati(){
float atti=20,a= 0.8f,b;
// 100cm = 1m  =>      0.8m=  100*0.8  = 8cm
a=a*100;
b=a*2/(atti);



System.out.println(b);

}


// 9. Find the area of an equilateral triangle, the length of whose sides is 12 cm.
void    equilateral(){
float s=12,a;

//  1.73=  underroot 3  by 4  side ka square
//  
a= (1.73f*s*s)/4;
System.out.println(a);
}




// 10. Find the area of an isosceles right angled triangle of equal sides 15 cm each.
void isosceles(){

float s=15f,a;

a=0.5f*s*s;
System.out.println("area =" +a);
}


// 11. The base and height of a triangle are in the ratio 8 : 5 and its area is 320 m². Find the height and base of the triangle.

int a=8,b=5;
int c=1;
 double area = 320;
   




 }

                    
public class As1{
                    


  public static void main(String[] args) {
Test Obj  = new Test();
    
    //  Obj.One();
    // Obj.two();
    // Obj.three();
    //  Obj.four();
    // Obj.Five();
    // Obj.triangle();
    // Obj.trangle_a();
    // Obj.trangle_ati();
    Obj.equilateral();
    Obj.isosceles();
  }
}


 
