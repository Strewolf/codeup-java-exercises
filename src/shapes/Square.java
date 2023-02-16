package shapes;

public class Square extends Rectangle {
 public Square(double side){
     super(side,side);
 }

 public double getArea(){
     double area = Math.pow( length, 2);
     return area;
 }

 public double getPerimeter(){
     double perimeter = length * 4;
     return perimeter;
 }
}
