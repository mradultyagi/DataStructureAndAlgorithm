public class ArraySum {
    public static int addNumbers(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }
        return sum;

    }


    public static void main(String[] args) {
        System.out.println("arrays sum");
        int[] arr={1,2,3,4};
        int sum = addNumbers(arr);
        System.out.println("sum of given array is "+sum);

    }

}
