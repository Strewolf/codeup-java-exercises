package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
       this.length = length;
       this.width = width;
    }
    public void setLength(){
        return this.length = length;
    }
    public void setWidth(){
        return this.width = width;
    }

}
