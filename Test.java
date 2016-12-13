
import java.math.BigInteger;
import java.util.*;
//四则运算器
public class Test{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String[] splited;
        if((str.indexOf('/') != -1)){
            splited = str.split("/");
            String a = splited[0];
            String b = splited[1];
            BigInteger first = new BigInteger(a);
            BigInteger second = new BigInteger(b);
            BigInteger result = first.divide(second);
            System.out.println(result);
        }
        else if((str.indexOf('+') != -1)){
            splited = str.split("/+");
            String a = splited[0];
            String b = splited[1];
            BigInteger first = new BigInteger(a);
            BigInteger second = new BigInteger(b);
            BigInteger result = first.add(second);
            System.out.println(result);
        }
        else if((str.indexOf('-') != -1)) {
            splited = str.split("-");
            String a = splited[0];
            String b = splited[1];
            BigInteger first = new BigInteger(a);
            BigInteger second = new BigInteger(b);
            BigInteger result = first.subtract(second);
            System.out.println(result);
        }
        else if((str.indexOf('*') != -1)){
            splited = str.split("/*");
            String a = splited[0];
            String b = splited[1];
            BigInteger first = new BigInteger(a);
            BigInteger second = new BigInteger(b);
            BigInteger result = first.multiply(second);
            System.out.println(result);
        }
    }
}
