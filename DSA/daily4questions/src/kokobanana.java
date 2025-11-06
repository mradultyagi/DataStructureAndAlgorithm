public class kokobanana {
    public static void main(String[] args) {
        int[] arr = {30,11,23,4,20};
        int h = 5;
        System.out.println(bs(arr, h)); // print the result
    }

    static int bs(int[] arr, int h) {
        int low = 1; // low cannot be zero, avoid division by zero
        int high = max(arr);
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            double thrs = func(arr, mid);
            if (thrs <= h) {
                ans = mid;
                high = mid - 1; // move left to minimize time
            } else {
                low = mid + 1; // move right to increase time
            }
        }
        return ans;
    }

    static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static double func(int[] arr, double mid) {
        double thrs = 0;
        for (int i = 0; i < arr.length; i++) {
            thrs = thrs + Math.ceil(arr[i] / mid); // ensure division is done with double
        }
        return thrs;
    }
}
