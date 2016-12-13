public class ComparableCircle extends Circle implements Comparable{

    final double PI=3.1415926;
    double radius;

    ComparableCircle(){

    }
    ComparableCircle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*PI;
    }
    public int compareTo(Object arg0) {
        return 0;
    }
    public double getPrimeter() {
        return 0;
    }

}