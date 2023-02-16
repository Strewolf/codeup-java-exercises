package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
       this.length = length;
       this.width = width;
    }
    public void setLength(){
        this.length = length;
    }
    public void setWidth(){
         this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public double getPerimeter(){
        return (2 * length)+(2 * width);
    }
}
