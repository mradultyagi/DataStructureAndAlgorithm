public class armstrontInRange {
    public static void main(String[] args) {
        int n=100;
        int m= 999;
        armstrong(n,m);

    }
    static void armstrong(int n,int m){

        for (int i = n+1; i <m ; i++) {
            int digits =0;
            int number =i;
            while(number!=0){
                number=number/10;
                digits++;
            }
            int ans=0;
            int temp=i;
            while(temp !=0){
                int digit = temp %10;
                ans +=Math.pow(digit,digits);
                temp = temp/10;
            }
            if(ans==i){
                System.out.println(i);
            }

        }

    }

}
