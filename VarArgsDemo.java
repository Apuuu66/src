/**
 * Created by Snoopy on 2016/12/6.
 */
public class VarArgsDemo {
    public static void main(String []args){
        printMax(34,2,4,6,3,45,5,2,13,65);
        printMax(new double[]{3,5,2,765,2,142,54});
    }
    public static void printMax(double...numbers) {
        if (numbers.length == 0)
            System.out.println("No argument passed!");
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > result)
                result = numbers[i];
        System.out.println("The max value is "+result);
    }
}
