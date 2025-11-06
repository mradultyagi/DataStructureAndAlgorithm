public class leaderElement {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
          int [] arr={2,3,4,2,31,32,2};
          int n= arr.length;
          leader(arr,n);


    }

    static void leader(int arr[], int n) {
        int cr = arr[n - 1];
        System.out.print(cr);
        System.out.print(",");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > cr) {
                cr = arr[i];
                System.out.print(cr);
                System.out.println(",");
            }


        }
    }
}