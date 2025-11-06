public class symmetry {
    public static void main(String[] args) {
        int count=0;
        for (int i =1200; i <= 1230; i++) {
            String str =Integer.toString(i);
            if(str.length()%2!=0)
                continue;
            int sum1 =0;
            int sum2=0;
            for (int j = 0; j < str.length()/2; j++) {
                sum1+=str.charAt(j);

            }
            for (int j = str.length()/2; j < str.length(); j++) {
                sum2+=str.charAt(j);
            }
        if(sum1 == sum2){
            System.out.println(i);
            count++;
        }
        }
        System.out.println(count);

    }

}
