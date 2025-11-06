import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.Stack;

public class GFG_SHEET {
    public static void main(String[] args) {
//        Stack s= new Stack();
//        s.push(1);
//        s.push(2);
//        System.out.println(s.peek());
//        System.out.println(s.pop());
//        System.out.println(s.peek());
//        s.push(2);
//        System.out.println(s.peek());
//        System.out.println(s.size());

//        int arr[] ={6,2,5,4,1,5,6};
//        int x=LargestRectangleHistogram(arr,arr.length);
//        System.out.println(x);
          int[] arr={60,20,50,40,10,50,60};
          System.out.println(MaxArea(arr, arr.length));
//        int n =arr.length;
//        nxtgrt(arr,n);

//        Mystack s = new Mystack(5);
//        s.push(10);
//        s.push(20);
//        System.out.println(s.pop());
//        s.push(30);


    }

    //Array implimentation of stack
    static class Mystack {
        int arr[];
        int cap;
        int top;

        Mystack(int c) {
            top = -1;
            cap = c;
            arr = new int[cap];
        }

        void push(int x) {
            top++;
            arr[top] = x;
        }

        int pop() {
            int res = arr[top];
            top--;
            return res;
        }

        int size() {
            return top + 1;
        }

        boolean isempty() {
            return (top == -1);
        }
    }

    // Stock Span (no of cons days smaller or equal  including curr day )

    public static void StockSpan(int[] arr, int n) {
        Stack<Integer> s=new Stack<>();
        s.push(0);
        System.out.println(1);

        int span;
        for (int i = 01; i <n  ; i++) {
            while (s.isEmpty()==false && arr[i]>= arr[s.peek()]){
                s.pop();

            }
            span=s.isEmpty()?i+1:i-s.peek();
            System.out.println(span);
            s.push(i);
        }
    }

    public static void prevgreatest(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        System.out.println(-1);
        for (int i = 1; i < n; i++) {
            while (s.isEmpty()==false && arr[i]>=s.peek()){
                s.pop();
            }
            int pg = s.isEmpty()?-1:s.peek();
            System.out.println(pg);
            s.push(arr[i]);

        }

    }

    public static void nxtgrt(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[n];
        res[n-1]=-1;
        s.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (s.empty() == false && s.peek() <= arr[i]) {
                s.pop();
            }
            if (s.empty()) {
                res[i] = -1;
            } else {
                res[i] = s.peek();
            }
            s.push(arr[i]);


        }
        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);
        }
    }

     public static int LargestRectangleHistogram(int [] arr,int n) {


        int res =0;
         for (int i = 0; i < n; i++) {
             int curr = arr[i];
             for (int j = i-1; j >=0 ; j--) {
                 if(arr[i]<= arr[j]){
                     curr += arr[i];
                 }
                 else{
                     break;
                 }
             }
             for (int j = i+1; j <n ; j++) {
                 if(arr[j]>= arr[i]){
                     curr += arr[i];
                 }
                 else{
                     break;
                 }
             }
             res=Math.max(res,curr);
         }
         return res;

     }
     public static int MaxArea(int arr[] ,int n){
        Stack<Integer> s = new Stack<>();
        int res =0;
        for (int i = 0; i < n; i++) {
             while (!s.isEmpty() && arr[s.peek()]>arr[i]){
                 int x = s.pop();
                 int curr=arr[x]* (s.isEmpty()?i:(i-(s.peek())-1));
                 res= Math.max(res,curr);
             }
             s.push(i);
         }
         while (!s.isEmpty()){
             int x = s.pop();
             int curr=arr[x]*(s.isEmpty()?n:(n-s.peek()-1));
             res = Math.max(res,curr);
         }
         return res;

     }
        public int findSmallestInteger(int[] nums, int value) {
        HashSet<Integer> s = new HashSet<>();
        int n = nums.length;
        int arr[] = new int[value];
            for (int i = 0; i < n; i++) {
                int rem =nums[i]%value;
                if(rem >= 0){
                    arr[rem]++;
                }
                else{
                    arr[rem+value]++;
                }
            }
            int min=Integer.MAX_VALUE;
            int y=0;
            for (int i : arr) {
                if(arr[i]<min){
                    min=arr[i];
                    y=i;
                }
            }
            return (value * y)+value;
//            Set<Integer> sortedSet = new TreeSet<>(s);
//            int t=s.size();
//            for (int i = 0; i < t; i++) {
//                if(s.contains(i)){
//                    return i;
//                }
//                else return i;
//            }

    }

    static int postfix(String s){
        Stack<Integer> st = new Stack<>();

        int n = s.length();
        for (int i = 0; i < n; i++) {
            char t = s.charAt(i);
            if(Character.isDigit(t)){
                st.push(t-'0');
            }
            else {
                int val1=st.pop();
                int val2=st.pop();
                switch (t){
                    case '+':
                        st.push(val1+val2);
                        break;
                    case '-':
                        st.push(val1 - val2);
                        break;
                    case '*':
                        st.push(val1 * val2);
                        break;
                    case '/':
                        st.push(val1 / val2);
                        break;
                }
            }
        }
        return st.pop();
    }
    


}
