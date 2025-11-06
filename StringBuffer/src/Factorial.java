import java.math.BigInteger;

class Factorial {

    static BigInteger fact(int num) {
        BigInteger ans = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(fact(234567));
    }

}
