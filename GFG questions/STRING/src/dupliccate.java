import java.awt.*;
import java.util.*;
import java.util.List;

public class dupliccate {
    static List<String> a1 = new ArrayList<>();
    public static void main(String[] args) {
//        String s = "geeksforgeeks";
//        printdup2(s);
//        String s1 = "geeksforgeeks";
//        String s2 = "frogw";
//        System.out.println(ispresent(s1, s2));
//        String str="geeks";
//        genAllSubSeq(str,"");
//        System.out.println(a1);

//        System.out.println(findPermutation("abcd"));;
//        System.out.println(binary(""));

//        String str[] = {"2","22","222", "3", "33", "333",
//                "4", "44", "444", "5", "55", "555"
//                , "6", "66", "666", "7", "77", "777",
//                "7777", "8", "88", "888", "9", "99", "999", "9999"};
//        String str2 ="GEEKSFORGEEKS";
//        System.out.println(printSeq(str,str2));

        String str = "aab";
        System.out.println(countPS(str));





//        String s1="XY";
//        String s2="12";
//        String[] result={"43","$32"};
//        for (String res:result){
//            if(validsuffel(s1,s2,res)){
//                System.out.println("valid");
//            }
//            else{
//                System.out.println("invalid");
//            }
//        }
//        System.out.println();


    }

    static boolean ispresent(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        for (int i = 0; i < n1 - n2; i++) {
            if (anagram(s2, s1, i)) {
                return true;
            }

        }
        return false;
    }
//    static void printduplicate(String s){
//        char[] arr = s.toCharArray();
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length;) {
//            int count =1;
//            while(i+count<arr.length && arr[i] == arr[i+count]){
//                count++;
//            }
//            if(count >1){
//                System.out.println("[" + arr[i] + "," + count +"]");
//            }
//            i+=count;
//        }
//    }
//
//    static void printdup2(String s){
//        HashMap<Character,Integer> freq = new HashMap<>();
//        for(char c :s.toCharArray()){
//            freq.put(c, freq.getOrDefault(c,0)+1);
//        }
//        for (Map.Entry<Character,Integer> it : freq.entrySet()){
//            if(it.getValue() >1){
//
//                System.out.print("['" + it.getKey() + "', " + it.getValue() + "], ");
//            }
//        }
//
//
//
//
//    }
//
//    static boolean CheckRotation(String s1,String s2){
//        s1 += s1;
//        return s1.contains(s2);
//    }


    static boolean anagram(String pat, String txt, int i) {
        int count[] = new int[256];
        for (int j = 0; j < pat.length(); j++) {
            count[pat.charAt(j)]++;
            count[txt.charAt(i + j)]--;
        }
        for (int j = 0; j < 256; j++) {
            if (count[j] != 0) {
                return false;
            }
        }

        return true;
    }

    static boolean validsuffel(String s1, String s2, String result) {
        if (s1.length() + s2.length() != result.length()) {
            return false;
        }
        char[] f = s1.toCharArray();
        char[] s = s2.toCharArray();
        char[] r = result.toCharArray();

        Arrays.sort(f);
        Arrays.sort(s);
        Arrays.sort(r);

        int i = 0, j = 0, k = 0;

        while (k < r.length) {
            if (i < f.length && f[i] == r[k]) {
                i++;
            }
            else if (j < s.length && s[j] == r[k]) {
                j++;
            }
            else {
                return false;
            }
            k++;

        }
        if(i < f.length|| j < s.length) {
            return false;
        }
        return true;
    }


    //COUNT AND SAY PROBLEM

     public static String countandsay(int n){
        if(n==1){
            return "1";
        }
        String result="1";
        for (int i = 2; i <=n; i++) {
            result=getCount(result);
        }
        return result;
    }
    public static String getCount(String s){
        StringBuilder sb = new StringBuilder();
        char c=s.charAt(0);
        int count =1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == c){
                count++;
            }else{
                sb.append(count);
                sb.append(c);
                c=s.charAt(i);
                count=1;
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }


//LONGEST PALLInDROME

    static String longestPalindrome(String s) {

        if(s==null || s.length()<1 ) return "";
        int start =0,end=0;

        for (int i = 0; i < s.length(); i++) {
            int len1= expandAroundCenter(s,i,i);
            int len2= expandAroundCenter(s,i,i+1);
            int len =Math.max(len1,len2);

            //strictly longer k liye +1 joda
            if(len > end-start +1 ){
                start = i-(len-1)/2;
                end=i+len/2;
            }

        }
        return s.substring(start,end+1);



    }
    public static int expandAroundCenter(String s,int left ,int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

//Printinng All Subsequences

    public static void genAllSubSeq(String s, String ans){
        if(s.length()==0){
            a1.add(ans);
            return;
        }

//        genAllSubSeq(s.substring(1),ans+s.charAt(0));
        genAllSubSeq(s.substring(1),ans);
        genAllSubSeq(s.substring(1),ans+s.charAt(0));
    }

    //print all permutation

    static ArrayList<String> findPermutation(String s){
        ArrayList<String> result = new ArrayList<>();

        char[] arr = s.toCharArray();
        permute(arr,0,result);
        return result;


    }
    public static void permute(char[] arr, int index, ArrayList<String> result){
        if(index == arr.length-1){
            result.add(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr,index,i);
            permute(arr,index+1,result);
            swap(arr,index,i);
        }
    }
    public static void swap( char[] arr,int i,int j) {
        char temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }

    static int binary(String s){
        int ans =0;
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='0'){
                count++;
            }
            else count--;

            if(count==0){
                ans++;
            }
        }
        if(ans!=0){
        return ans;
        }
        else return -1;
    }

    //WORD WRAP
    //HARD DYNAMIC PROBLEM

    public int solveWordWrap(int [] arr,int k){
        int n = arr.length;
        int[] arr1=new int [n+1];
        Arrays.fill(arr1,Integer.MAX_VALUE);
        arr1[n]=0;
        for (int i = n-1; i >=0 ; i--) {
            int linelen=-1;
            for (int j = 1; j < n; j++) {
                linelen += arr[j]+1;
                if(linelen > k) break;
                int cost=(j==n-1) ? 0 :(k-linelen)*(k-linelen);
                if(arr1[j+1] != Integer.MAX_VALUE) {
                    arr1[i] = Math.min(arr1[i], cost + arr1[j + 1]);

                }
            }
        }
        return arr1[0];
    }

    //next permutation GFG
// very very important
    static void nxtper(int[] arr){
        int n = arr.length;
        int i;
        for (i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                break;
            }
        }
        if(i>0){
            int j =n-1;
            while(j>i && arr[j]<=arr[i]){
                j--;
            }
            swap2(arr,i,j);

        }
        reverse(arr, i+1,n-1);

    }

    public static void swap2( int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap2(nums, start, end);
            start++;
            end--;
        }
    }


    //Paranthesis checker

    public boolean isBalanced(String s){
        int ans =0;
        int n =s.length();
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                char top=stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    //Mobile Keypad
    static String printSeq(String arr[],String input){
        String output="";
        int n = input.length();
        for (int i = 0; i < n; i++) {
            if(input.charAt(i)==' '){
                output =output + "0";
            }
            else {
                int position = input.charAt(i)-'A';
                output = output + arr[position];

            }
        }
        return output;
    }
    static int cntRev(String str){
        int len =str.length();
        if(len%2 !=0){
            return -1;
        }
        int open =0,close=0;
        for (int i = 0; i < len; i++) {
            char c=str.charAt(i);
            if(c=='{'){
                open++;
            }
            else{
                if(open>0){
                    open--;
                }
                else{
                    close++;

                }
            }
        }
        return ((open+1)/2 +(close+1)/2);
    }

    //ALL PALLINDROMIC SEQUENCE
    static int countPS(String s) {
        int n=s.length();
        int ans =0;
        for (int center = 0; center < 2*n -1; center++) {
            int left=center/2;
            int right=left+(center%2);

            while(left>=0 && right < n && s.charAt(left) == s.charAt(right)){
                ans++;
                left--;
                right++;
            }
        }


        return ans;

    }
    //Count in the 2d array
    static int KMPcount(String pat,String txt){
        int m = pat.length();
        int n = txt.length();

        int [] lps=new int [m];
        computeLPSArray(pat,m,lps);

        int i=0;
        int j=0;
        int count =0;

        while((n-i)>=(m-i)){
            if(pat.charAt(j)==txt.charAt(i)){
                j++;
                i++;
            }
            if(j==m){
                count++;
                j=lps[j-1];
            }
            else if(i<n && pat.charAt(j) != txt.charAt(i)){
                if(j != 0)
                    j=lps[j-1];
                else
                    i +=1;
            }
        }
        return count;




    }

    static void computeLPSArray(String pat,int m,int[] lps){
        int len =0;
        lps[0] =0;

        int i=1;

        while(i<m){
            if(pat.charAt(i)==pat.charAt(len)){
                len ++;
                lps[i] = len;
                i++;
            }
            else{
                if(len!=0){
                    len = lps[len-1];

                }
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

//public  static List<List<Integer>> searWord(char[][] grid,String word) {
//        List<List<Integer>> ans = new ArrayList<>();
//        int
//}

}
