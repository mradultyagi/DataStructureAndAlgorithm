import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    static class Activity{
        int start;
        int end;
        public Activity(int starr,int end ){
            this.start=starr;
            this.end=end;
        }
    }
    public static void main(String[] args) {
        Activity[] arr ={new Activity(12,25),new Activity(10,20),new Activity(20,30)};
        System.out.println(maxActivity(arr));

    }
    static int maxActivity(Activity[] arr){
        Arrays.sort(arr, Comparator.comparingInt(activity -> activity.end));
        int res =1;
        int prev=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].start >=arr[prev].end){
                res++;
                prev=i;
            }
        }

        return res;
    }
    static int maxActivity2(int[] start,int [] end,int n){
        int [][] activity = new int[n][2];
        for (int i = 0; i < n; i++) {
            activity[i][0]=start[i];
            activity[i][1]=end[i];
        }
        Arrays.sort(activity,Comparator.comparingInt(a -> a[1]));
        int res =1;
        int prev =activity[0][1];
        for (int i = 1; i < n; i++) {
            if(activity[i][0]>=prev){
                res++;
                prev=activity[i][1];
            }
        }
        return res;
    }
}
