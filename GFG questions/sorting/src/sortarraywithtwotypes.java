import java.util.Arrays;

public class sortarraywithtwotypes {
    public static void main(String[] args) {
        int [] arr={0,1,1,0,0,0,1,1};
        function(arr,arr.length);
        System.out.println(Arrays.toString(arr));


    }
    static void function(int arr[],int n){
        int i =-1,j=n-1;
        while(true){
            do{i++;} while (arr[i]==0);
            do{j--;} while (arr[j]==1);
            if(i>=j)
                return;
            swap(arr,i,j);

        }

    }

    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
