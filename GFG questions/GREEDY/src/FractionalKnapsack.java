import java.util.Arrays;

public class FractionalKnapsack {
    static class pair {
        int weight;
        int value;
        public pair(int wt, int val){
            this.weight = wt;
            this.value = val;
        }
    }
//    abstract static class Item implements Comparable<Item>{
//        int wt,val;
//        public Item(int w,int v){
//            this.val=v;
//            this.wt=w;
//        }
//        public int compareTo(Item i){
//            return (wt)*(i.val)-(val)*(i.wt);
//        }
//    }
    public static void main(String[] args) {
        pair[] arr={new pair(50,600),new pair(20,500),new pair(30,400)};
        int curr_cap =70;
        System.out.println(FractionalKnapsackk(arr,curr_cap));

    }
    static double FractionalKnapsackk(pair[] arr,int curr_cap){
        double res =0;
        Arrays.sort(arr,(a,b) ->{
            double r1=(double)a.value/a.weight;
            double r2=(double)b.value/b.weight;
            return Double.compare(r2,r1);//for descending r2 pahele likha
        });
        for (FractionalKnapsack.pair pair : arr) {
            if (pair.weight <= curr_cap) {
                res += pair.value;
                curr_cap -= pair.weight;
            } else {
                res += (pair.value * ((double) curr_cap / pair.weight));
                break;
            }

        }
        return res;
    }

}
