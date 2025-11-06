public class MaxPoints {
    public static void main(String[] args) {
        int [] arr={6,2,3,4,5,6,1};
        System.out.println(maxpoint(arr,3));;

    }
    static int maxpoint(int [] arr,int k){
        int sum =0;
        int i =0;
        int n = arr.length-1;
        if(arr[i]>arr[n]){
                sum+=arr[i];
                i++;
        }
        else {
            sum+=arr[n];
            n--;
        }

        return sum;

    }
}

