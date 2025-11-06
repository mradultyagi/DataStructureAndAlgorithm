public class euclid {
    public static void main(String[] args) {

    }
//    static int gcd(int a,int b){
//        while(a!=b){
//            if(a>b)
//                a=a-b;
//            else
//                b=b-a;
//        }
//        return a;
//    }
    static int gcd (int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}
