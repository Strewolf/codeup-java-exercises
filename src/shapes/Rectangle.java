package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length, double width) {
        super(length, width);
    }
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        double area =length * width;
//        return area;
//    }
//
//    public double getPerimeter(){
//        double perimeter = (2 * length)+(2 * width);
//        return perimeter;
//    }
}
