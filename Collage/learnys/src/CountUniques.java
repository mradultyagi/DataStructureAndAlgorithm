public class CountUniques {
    public static void main(String[] args) {
        int[] arr={10,2,3,4,2,5,6,4,2,3,6};
     unique(arr);
    }
    static void unique(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];
        int k =0;
        
        for (int i = 0; i < arr.length; i++) {
            boolean isunique = true;
            for (int j = 0; j <temp.length ; j++) {
                if(arr[i]==temp[j]){
                    isunique = false;
                    break;
                }
            }
            if(isunique){
                temp[k]=arr[i];
                k++;
            }

        }
        int sum =0;

        for (int j = 0; j < temp.length; j++) {
            sum+=temp[j];
        }
        System.out.println(k +" "+sum);


    }
}
