public class packages_within_D_Days_ {
    public static int findDays(int[] weights, int cap) {
        int days = 1; //First day.
        int load = 0;
//        int n = weights.length; //size of array.
        for (int weight : weights) {
            if (load + weight > cap) {
                days += 1; //move to next day
                load = weight; //load the weight.
            } else {
                //load the weight on the same day.
                load += weight;
            }
        }
        return days;
    }

    public static int leastWeightCapacity(int[] weights, int d) {
        //Find the maximum and the summation:
        int low = Integer.MIN_VALUE, high = 0;
        for (int weight : weights) {
            high += weight;
            low = Math.max(low, weight);
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int numberOfDays = findDays(weights, mid);
            if (numberOfDays <= d) {
                //eliminate right half
                high = mid - 1;
            } else {
                //eliminate left half
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int ans = leastWeightCapacity(weights, d);
        System.out.println("The minimum capacity should be: " + ans);
    }
}

