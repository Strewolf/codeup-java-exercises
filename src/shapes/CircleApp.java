package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args){
        System.out.println("enter a radius that to get the area and circumference:");
        Input input = new Input();
        double in = input.getDouble();
        Circle circle = new Circle(in);
        double area = circle.getArea();
        double circumference  = circle.getCircumference();
        System.out.printf("this is the area: %.2f%nThis is the circumference: %.2f", area, circumference);
    }

}
