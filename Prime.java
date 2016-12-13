import java.math.BigInteger;
public class Prime {
    public static void main(String[] args) {
        int count = 0;
        long x = Long.MAX_VALUE;
        String sc = Long.toString(x);
        BigInteger big = new BigInteger(sc);
        while (count < 5) {
            big = big.nextProbablePrime();
            System.out.println(big);
            count++;
        }
    }
}