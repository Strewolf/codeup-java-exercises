package shapes;

public class ShapesTest {
    public static void main( String[] args){
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
        Measurable myShape = new Square(7);
        Measurable myShape1 = new Rectangle(4,5);
//
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}
