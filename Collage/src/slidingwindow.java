import java.util.Scanner;

public class slidingwindow {
    public static void main(String[] args) {
        int arr[] = {1,12,-5,-6,50,3};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        double result = maxsubarraysum(arr, arr.length,k);
        System.out.println(result);
    }

    public static double maxsubarraysum(int[] arr, int n, int k) {
        double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        maxSum=Math.floor(maxSum/k);
        double currentSum = maxSum;

        for (int i = k; i < n; i++) {
            currentSum += arr[i] - arr[i - k];  // Slide the window
            maxSum = Math.max(maxSum, Math.floor(currentSum/k));  // Update max sum if needed
        }

        return maxSum;  // Return the maximum sum
    }
}
