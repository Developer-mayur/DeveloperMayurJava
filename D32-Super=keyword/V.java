 
public class V {
        
    public V(int a){
   System.out.println("V  A contructor"); 
}

}

class  b extends V{
    
public  b(){
super(3);
    System.out.println("b contructor");
}

        
}



class c extends  b{
    public  c(){
        System.out.println("c contructor");

    }
    
    public static void main(String[] args) {
        c g = new c();
        
    }
    
    
}









