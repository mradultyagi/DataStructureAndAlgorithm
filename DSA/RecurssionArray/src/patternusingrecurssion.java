import java.util.Arrays;

public class patternusingrecurssion {
//    ****
//    ***
//    **
//    *
    public static void main(String[] args) {
//        int n=4;
        int [] arr={4,3,2,1};
        bubblesort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
        
    }
//    static void pattern(int r,int c){
//        if(r==0){
//            return;
//        }
//        if(c<r){
//            System.out.print("*");
//            pattern(r,c+1);
//        }else {
//            System.out.println();
//            pattern(r-1,0);
//        }
//
//
//    }
//    static void pattern2(int r,int c){
//        if(r==0){
//            return;
//        }
//        if(c<r){
//
//            pattern2(r,c+1);
//            System.out.print("*");
//        }else {
//
//            pattern2(r-1,0);
//            System.out.println();
//        }
//
//
//    }
static void bubblesort(int [] arr,int r,int c){
    if(r==0){
        return;
    }
    if(c<r){

        if(arr[c]>arr[c+1]){
            int temp=arr[c];
            arr[c]=arr[c+1];
            arr[c+1]=temp;
        }
        bubblesort(arr,r,c+1);
    }else {
        bubblesort(arr,r-1,0);
    }


}


}
