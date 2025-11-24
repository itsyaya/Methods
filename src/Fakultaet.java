import java.math.BigInteger;

public class Fakultaet {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(7));
        System.out.println(factorial(12));
        
    }
    public static BigInteger factorial(int n){
       if (n < 0){
        throw new IllegalArgumentException("Not Valid");
       }
       BigInteger result = BigInteger.ONE;
       for (int i = 2; i <= n; i++){
        result = result.multiply(BigInteger.valueOf(i));
       }
       return result;
    }
}
