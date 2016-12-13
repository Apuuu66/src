import java.math.BigInteger;

public class findDivideFiveSix{
    public static void main(String []args){
        int count = 0;
        long a = Long.MAX_VALUE;
        String value = Long.toString(a);
        BigInteger n = new BigInteger(value);
        BigInteger one = BigInteger.ONE;
        BigInteger five = new BigInteger("5");
        BigInteger six = new BigInteger("6");
        BigInteger zero = BigInteger.ZERO;
        while(count<10){
            if((n.remainder(five).equals(zero)) || n.remainder(six).equals(zero)){
                System.out.println(n);
                count++;
            }

            n = n.add(one);
        }
    }
}
