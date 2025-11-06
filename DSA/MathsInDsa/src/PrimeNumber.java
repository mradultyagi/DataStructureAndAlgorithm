public class PrimeNumber {
    public static void main(String[] args) {
        int n=23;
        for (int i = 1; i<=n; i++) {
            System.out.println(i + " " + isprime(i));

        }
    }
    static boolean isprime (int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i <n-1; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
