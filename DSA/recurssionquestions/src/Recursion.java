import java.util.*;
public class Recursion {
    public static void main(String[] args) {
//        fun2(7);
//        System.out.println(sum(6));
//        String str="ababa";
//        int x=0;
//        int e=str.length()-1;
//        System.out.println(isPalindraome(str,x,e));
//        System.out.println( maxpiece(23,11,9,12));
//        subset("abc","",0);
//        toh(8,'A','B','C');
//        int arr[] ={10,20,15};
//        int n = arr.length;
//        System.out.println(countsubset(arr,n,35));
    }
    static void fun(int n){
        if(n==0){
            return;
        }

            System.out.println(n);
            fun(n-1);
     System.out.println(n);

    }
    static void fun2(int n){
        if(n==0){
            return ;
        }
        fun2(n/2);
        System.out.println(n%2);
    }
    static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }
    static int sum(int n){
        if(n==0) return 0;
        return n+sum(n-1);
    }
    static boolean isPalindraome(String str,int start,int end){
        if(start>=end) return true;
        return (str.charAt(start) == str.charAt(end) && isPalindraome(str,start+1,end-1));
    }
    static int maxpiece(int n, int a, int b, int c) {
        // Base case: if n is zero, no further cuts are needed
        if (n == 0) return 0;
        // If n is negative, it's impossible to make further cuts
        if (n < 0) return -1;
        // Recursively check the maximum pieces by cutting lengths a, b, and c
        int res = Math.max(
                maxpiece(n - a, a, b, c),
                Math.max(maxpiece(n - b, a, b, c), maxpiece(n - c, a, b, c))
        );
        // If no valid cuts are possible, return -1
        if (res == -1) return -1;
        // Add 1 to the result to account for the current cut
        return res + 1;
    }
    static void subset(String s,String curr,int i){

        if(i==s.length()){
            System.out.println(curr);
            return;
        }
        subset(s,curr,i+1);
        subset(s,curr+s.charAt(i),i+1);
    }
   static void toh(int n,char A,char B,char C){
        if(n==1){
            System.out.println("move 1 disc from "+A+" to "+C);
            return;
        }
        toh(n-1,A,C,B);
        System.out.println("move "+n+" disc from "+A+" to "+C);
        toh(n-1,B,A,C);
   }
   static int jes(int n,int k){
        if(n==1){
            return 0;
        }
        else{
            return (jes(n-1,k)+k)%n;
        }
   }
   static int countsubset(int arr[],int n,int sum){
        if(n==0){
            return(sum==0) ? 1 : 0;
        }
        return countsubset(arr,n-1,sum)+countsubset(arr,n-1,sum-arr[n-1]);
   }

}


