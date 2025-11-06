import java.util.Scanner;
public class vowelsinstring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        sc.nextLine(); 
        String S=sc.nextLine();
        int k = sc.nextInt();
        int x=wb(S,k);
        System.out.println(x);



    }
    static int wb(String str, int k){


        int ans=0;
        for(int i=0;i<k;i++){
//            if(d.contains(Character.toString((str.charAt(i))))){
//                ans++;
//            }
            if(str.charAt(i)=='w' || str.charAt(i)=='W'){
               ans++;
            }

        }
        int x=ans;
        int maxi = ans;
        for(int i=k;i<str.length();i++){
//            if(d.contains(Character.toString((str.charAt(i))))){
//                x += 1;
//            }
            if(str.charAt(i)=='w' || str.charAt(i)=='W'){
                x++;
            }

//            if(d.contains(Character.toString((str.charAt(i-k))))){
//                x -= 1;
//            }
            if(str.charAt(i)=='w' || str.charAt(i-k)=='W'){
                x++;
            }

            maxi = Math.min(x,maxi);
        }
        return maxi;
    }
}