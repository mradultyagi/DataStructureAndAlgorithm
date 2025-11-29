public class MaxGame {
    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 2,4};
        int n = arr.length;
        System.out.println(sol(arr, 0, n - 1));
    }

    static int sol(int[] arr, int i, int j) {
        if (i == j) return arr[i];
        if (i + 1 == j) return Math.max(arr[i], arr[j]);
        int pickI = arr[i] + Math.min(sol(arr, i + 2, j), sol(arr, i + 1, j - 1));
        int pickJ = arr[j] + Math.min(sol(arr, i + 1, j - 1), sol(arr, i, j - 2));

        return Math.max(pickI, pickJ);
    }
}
