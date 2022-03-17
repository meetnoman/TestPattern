 
package triangle.pattern;

 
 



public class TrianglePattern extends java.lang.Object {

  public enum TriangleType {Equilateral, Isosceles, Scalene, NotATriangle}

  static int  side1,side2,side3;
  public TrianglePattern(int a,int b, int c){
      side1=a;
      side2=b;
      side3=c;
  }
  
public static TriangleType checkTriangle(int side_a, int side_b, int side_c){
    if(side1==side2 && side1==side3){
    return TriangleType.Equilateral;
    }
    else if(side1==side2 || side1==side3 || side2==side3){
            return TriangleType.Isosceles;
    }
    else if(side1!=side2 || side1!=side3 || side2!=side3){
            return TriangleType.Scalene;
    }
    return TriangleType.NotATriangle;
} 


public static void main(String[] args) {
        // TODO code application logic here
        int a=5,b=5,c=5;
    TrianglePattern obj= new TrianglePattern(a,b,c);
    
System.out.println("Usage: java TriangleTest side_a side_b side_c");
if(a==0){
System.out.println("Value for side a is not in the range of permitted values.");
}
else if(b==0){
System.out.println("Value for side b is not in the range of permitted values.");
}
else if(c==0){
System.out.println("Value for side c is not in the range of permitted values.");
}
else{
    checkTriangle( a, b, c);
    System.out.print("Triangle Type: "+ checkTriangle( a, b, c));
}


 
}

        
        
     
    
}
