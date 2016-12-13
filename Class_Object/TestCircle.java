package Class_Object;

/**
 * Created by Snoopy on 2016/12/6.
 */
public class TestCircle {
    public static void main(String []args){
        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius "+circle1.getRadius()+" is "+circle1.getArea());
        Circle circle2 = new Circle(3);
        System.out.println("The area of the circle of radius "+circle2.getRadius()+" is "+circle2.getArea());
    }
}
