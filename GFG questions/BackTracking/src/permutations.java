public class permutations {
    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0, str.length() - 1);

    }
    static String swap(String s,int i ,int j){
        char[] arr= s.toCharArray();
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return new String(arr);
    }
    static void permute(String str,int l,int r){
        if(l==r){
            System.out.println(str);
            return;
        }
        else {
            for (int i = l; i <=r ; i++) {
                str=swap(str,i,l);
                permute(str,l+1,r);
                str=swap(str,l,i);


            }
        }
    }
}
