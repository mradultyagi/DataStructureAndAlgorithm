public class KclosestNoOfx {
    public static void main(String[] args) {

    }
    static void kClosest(int [] arr,int x,int n){
        //x=number,n=kitne nikalne hai closest
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < n; i++) {
            int min_diff=Integer.MAX_VALUE;
            int min_diff_index=-1;
            for (int j = 0; j < arr.length; j++) {
                if(visited[j]==false&& Math.abs(arr[j]-x)<=min_diff){
                    min_diff=Math.abs(arr[j]-x);
                     min_diff_index=j;
                }
            }
            System.out.println(arr[min_diff_index]+" ");
            visited[min_diff_index]=true;
        }
    }
    //using heap

}
