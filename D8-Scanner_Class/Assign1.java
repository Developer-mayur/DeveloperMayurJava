class all{
    // 1. The perimeer of rectangle is 230cm. if the length of the rectangle is 70 cm.,
//  Find its breath and Area.
// Perimeter of Rectangle is P = 2(L+b)  
// Area of rectangle is A = L*b;
void area_rectangle(){
    int p = 230,l=70,b;
        b = (2*l-p)/2;
        int area = l*b;
        System.out.println("1.1.Brith of the rectangle is = "+b);
        System.out.println("1.2.Area of the rectangle is = "+area); 
}

//2. The area of a rectangle is 96 cm2. if the breath of the rectangle is 8cm,
//  find its length and perimeter.
void second(){
    int area=96,breath=8,length,perimeter;

    length = area/breath;
    perimeter = 2*(length*breath);
    System.out.println("\n2.1.Perimeter of ractangle is = "+perimeter);
    System.out.println("2.2.legth of the rectangle is = "+length);
}

// 3. How many tiles whose length and breath are 13 cm and 7 cm respectavely are needed to cover
//  a rectangular region whose length and breath are 520 cm and 140 cm ?
void third(){
    int length=13,breath=7,wlength=520,wbreath=140,total_tiles;

    int area_r = wlength*wbreath;
    int area_t = length*breath;
    total_tiles=area_r/area_t;
     System.out.println("3.\nTotal of tiles is = "+total_tiles);
}

//4. find the cost of tiling a rectangular plot of land 300m.long
//  and 150 m. wide at the rate of 6$ per hundrade square m.
void fourth(){
    int length=300,wide=150,rate=6,cost;
    int plot = length*wide;
    int plot_per100 = plot/100;
    cost = plot_per100*6;
    System.out.println("\n4. cost of tiing is = "+cost);
}

//5. if it costs 1600 rs. to fence a rectangular park of length 20 m. at the rate of 25 rs. per m^2,
// find the breath of the park and its perimeter. also , find the area of the field.
void fifth(){
    int total_cost=1600,length=20,rate=25,breath,perimeter;
    
    int total_area=total_cost/rate;
        breath = total_area/length;
        perimeter = 2*(length*breath);
    
    System.out.println("\n5.1.Total Area of park is = "+total_area);
    System.out.println("5.2. Breath is = "+breath);
    System.out.println("5.3. perimeter of park is = "+perimeter);
}
    // 6.Find the area of a triangle, sides of 
    // which are 10 cm and 9 cm and the perimeter 36 cm.
   
    //Traingle :-
    // 1.area of T = 1/2(height*base)
    // 2. perimeter of T = a+b+c;

    void sixth() {
        int sideA=10,sideB=9,perimeterT=36,areaT,sideC;
        sideC = perimeterT-sideA-sideB;
        areaT = (sideA*sideB)/2;

        System.out.println("\n6.Area of Traingle is = "+areaT);
    }

// 7. Find the height of a triangle whose base is
//  50 cm and whose area is 500 cm².

void seventh(){
    int base=50,area=500,height;
    // h = (2*A)/b
    height = (2*area)/base;
    System.out.println("\n7. height of the traingle is = "+height);
}

// 8. Find the base of a triangle whose altitude is 20cm
//  and area is 0.8 m².
// Equilateral Traingsle :-
//1. area of ET  = (√3*a²)/4
//2. perimeter of ET = 3*a;
//3. area  when ph is gven = (b*ph)/2

void eighth(){
    float base,altitude=20,area=0.8f;
    base = (2*area)/20;
    System.out.println("\n8. base is = "+base);
}

// 9.Find the area of an equilateral triangle, the length of
//  whose sides is 12 cm.

void nineth(){
   
}


void sqrt(){
    /// Java Program to find square
// root of a number
     double x=5;
	// for 0 and 1, the square roots are themselves
	if (x < 2)
	System.out.println(x);

	// considering the equation values
	double y = x;
	double z = (y + (x / y)) / 2;
    // System.out.println("\n"+z+" , "+y);

	// as we want to get upto 5 decimal digits, the
	// absolute difference should not exceed 0.00001
	while (Math.abs(y - z) >= 0.00001) {
    // System.out.println(z+" , "+y);

	y = z;
	z = (y + (x / y)) / 2;
	}
	System.out.println(z);
}

//10. Find the area of an isosceles right angled triangle of 
// equal sides 15 cm each.

// isosceles right angled triangle :-
// tere are two sides equal:
// 1. area isoscele T = (1/4)*base*√4a²-b;
// 2. perimeter isoscele T = 2*a+c;
// 3.area of Right Angle iso T = (base*height)/2;

void tenth(){
    float base=15,height=15,area;
    area = (base*height)/2;
    System.out.println("\n10. Area of right angle isoscele traingle is = "+area);
}

//11. The base and height of a triangle are in the ratio 8 : 5
//  and its area is 320 m². Find the height and base of the triangle.
void eleven(){

}

//12. Find the area of a right angled triangle whose hypotenuse is 13 cm and one 
// of its sides containing the right angle is 12 cm. Find the length of the other side.

//pythagoras therome :
// (H)² =(P)²+(B)²

void twelve(){
    float hypotenus=13,side=12,area;
    float  base =((hypotenus*hypotenus)-(side*side))/10*2;
    area = (base*side)/2;
    System.out.println("\n12. Area of Right Angle Traingle is = "+area);
    System.out.println("12.2 other side means Base is = "+base);
}

// 13. The area of a right triangle is 184 cm² and one 
// of its legs is 16 cm long. Find the length of other leg.

void thirteen(){
    float oneleg=16,area=184,secondleg;
    secondleg=(2*area)/oneleg;
    System.out.println("\n13. other leg is = "+secondleg);
}
//14. The length of one of the diagonals of a field in the
// form of a quadrilateral is 46 m. The perpendicular distance of the 
// other two vertices from the diagonal are 13 m and 10 m, find the area of the field.
void fourtin(){
    float base=46,h1=13,h2=10,area;

    area =  (h1+h2)*base/2;
    System.out.println("\n14. area of the fieled is = "+area);
}
// 15. Shelly has a rectangular garden of length 22 m and breath 15 m. Her friend
//  Rachel has a square garden of side 21 m. Whose garden is bigger and by how much?
// 1.Area of rectangle is = l*b;
// 2. Perimeter = 2(l*b);
// 3. area of Squar is = a*a;
// perimeter = 4a;

void fiftin(){
    float sLength=22,sBreath=15,Rside=21,totalAS,totalAR;

    totalAR = 4*Rside;
    totalAS = 2*(sLength*sBreath);
    if(totalAR<totalAS)System.out.println("\n15. Rachel garden is greater than Shelly is = "+(totalAR-totalAS));
    else
    System.out.println("\n15. Shelly garden is greater than Rachel is = "+(totalAS-totalAR));
    // System.out.println("\n 15.1 reachal Garden is = "+totalAR);
    // System.out.println("\n 15.2 Shelly Garden is = "+totalAS);
    // System.out.println("15.3 ");
}

// 17. Luci is making a display board for the school exhibition. The display board is a 3 m by 2 m rectangle.
//  He needs to add a ribbon border around the entire display board. What is the length of ribbon that he needs?
void seventeen(){
    float BoardL=3,BoardB=2,perimeter;
    perimeter = 2*(BoardL+BoardB);
    System.out.println("\n17. Luci Required total rebbon of meter ="+perimeter);
}
// 18.18. Ron jogs around a rectangular park of length 50 m and breadth 30 m. If he takes 10 rounds of the park each day,
//  how much distance does he cover in a day in km?

void Eighteen(){
    float parkL=50,parkB=30,totalRun;
    totalRun = (2*(parkB+parkL)*10)/1000;
    System.out.println("\n18. Ron is Total cover in a day is = "+totalRun+" killometer");
}
//19. A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 am are kept on a table.
//  Which shape has more volume?
//1. volume of cube is = side*side*side;
//2. volume of cuboid is = length*breath*height;

void nineteen(){
    int cubeSide=7,cuboidL=7,cuboidB=4,cuboidH=8,cube,cuboid;

    cube = cubeSide*cubeSide*cubeSide;
    cuboid = cuboidL*cuboidB*cuboidH;
    if(cube>cuboid) System.out.println("\n19. cube is greater than cuboid is = "+(cube-cuboid));
   else
    System.out.println("\n19.cuboid is greater than cube is = "+(cuboid-cube));
}
// 20. What is the volume of a brick of ice-cream with length 25 cm, breadth 10 cm and
//  height 8 cm?
void twenty(){
    int brickL=25,brickH=8,brickB=10,volumeB;
    volumeB=brickB*brickH*brickL;
    System.out.println("\n20. Volume of brick of ice-creame is = "+volumeB);
}
//21. A brick measures 15 cm in length, 8 cm in breadth and 5 cm in height.
//  How many bricks will be used to make a wall of length 15 m, breadth 10 m and height 8 metres?
void twentyone(){
    int brickL=15,brickB=8,brickH=5,wallH=8,wallB=10,wallL=15,wall,brick,totakBrick;
    brick = brickB*brickH*brickL;
    wall = wallB*wallH*wallL;
    totakBrick = wall/brick;
    System.out.println("\n21. Total bricks Required is = "+totakBrick);
}
// 22.22. A pond is 50 m long, 30 m wide and 2 m deep.
//  Find the capacity of the pond in cubic metre.
void twentytwo(){
    int pondL=50,pondB=30,pondD=2,capicity;
    capicity = pondL*pondB*pondD;
    System.out.println("\n22. TOtal capicity of pond is = "+capicity);
}
//23. Find the number of cubical boxes of cubical side 3 cm 
// which can be accommodated in carton of dimensions 15 cm × 9 cm × 12 cm.
void twentythired(){
    int cartona,a=15,b=9,c=12,side=3,cube,totalcube;
    cartona = a*b*c;
    cube = side*side*side;
    totalcube = cartona/cube;
    System.out.println("\n23. total cubes are in the cartn is = "+totalcube);
} 
//24.24. How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be
//  required for a wall 20 m long, 2 m high and 0.75 m thick? If bricks sell at $900 per thousand what will it cost to build the wall?
void twefour(){
    float brickl=25,brickw=10,brickt=7.5f,walll=20*100,wallh=2*100,wallt=0.75f*100,brick,wall,reqbrick, rate=900;

    brick = brickl*brickt*brickw;
    wall = wallh*walll*wallt;
    reqbrick = wall/brick;
    float totalCost = reqbrick*0.9f;
    System.out.println("\n24.1. Total cost is = "+totalCost);
    System.out.println("\n24.2. Total Required brick is = "+reqbrick); 
    System.out.println("\n24.3. Total rate is = "+rate); 

}
}


public class Assign1{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System .in);
        all obj = new all();   
        // obj.third(); 
        // obj.fourth();   
        // obj.fifth();  
        // obj.sixth(); 
        // obj.seventh();
        // obj.eighth();
        // obj.sqrt();
        // obj.tenth();
        // obj.twelve();
        // obj.thirteen();
        // obj.fourtin();
        // obj.fiftin();
        // obj.seventeen();
        // obj.Eighteen();
        // obj.nineteen();
        // obj.twenty();
        // obj.twentyone();
        // obj.twentythired();
        obj.twefour();

    }
}
