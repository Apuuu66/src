package Class_Object;

/**
 * Created by Snoopy on 2016/12/6.
 */
public class Circle {
    private double radius =1.0;
    private static int numOfObjects = 0;
    public Circle(){
        numOfObjects++;
    }

    public Circle(double newRadius){
        radius = newRadius;
        numOfObjects++;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getRadius(){
        return radius;
    }
    public int getNumOfObjects(){
        return numOfObjects;
    }

    public void setRadius(double newRadius){
        radius = (newRadius>0)?newRadius:0;
    }
}
