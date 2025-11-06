public class ProductOfDigits {

        public static void main(String[] args) {
            System.out.println(prod(540));
        }
        static int prod(int n){
            if(n%10==n){
                return n;
            }
            return prod(n/10)*(n%10);
        }

}
