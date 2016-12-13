package Class_Object;

/**
 * Created by Snoopy on 2016/12/7.
 */

public class TotalArea {
    public static void main(String []args){
        Circle [] circleArray;
        circleArray = creatCircleArray();
        printCircleArray(circleArray);
    }

    private static Circle[] creatCircleArray() {
        Circle [] circleArray = new Circle[5];
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle(Math.random()*100);
        }
        return circleArray;
    }

    private static void printCircleArray(Circle[] circleArray) {
        System.out.printf("%-30s%-15s\n","Radius","Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());
        }
        System.out.println("------------------------------------------");
        System.out.printf("%-30s%-15f","The total area of circles is ",sum(circleArray));
    }

    private static double sum(Circle[] circleArray) {
        double sum = 0;
        for (int i = 0; i < circleArray.length; i++) {
            sum += circleArray[i].getArea();
        }
        return sum;
    }
}