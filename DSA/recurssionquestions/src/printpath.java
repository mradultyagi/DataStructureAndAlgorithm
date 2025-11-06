import java.util.Arrays;

//BACKTRACKING2
public class printpath {
    public static void main(String[] args) {
        boolean [] [] condition ={
                {true,true,true},{true,true,true},{true,true,true}
        };
        int [][] path=new int[condition.length][condition[0].length];
        allpathprint("",condition,0,0,path,1);

    }
    static void allpathprint(String p,boolean[][] maze,int r,int c,int[][] path,int step){
        if(r==maze.length-1&&c==maze[0].length-1){
            path[r][c]=step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        //array recurssion for printing path

        if(!maze[r][c]){
            return;
        }
        //neeche wali line se false mai kr dega vo jo bhi ek baar visit ho gya taki dobara na aa ske

        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1){
            allpathprint(p+'R',maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1){
            allpathprint(p+'D',maze,r,c+1,path,step+1);
        }
        if(c>1){
            allpathprint(p+'L',maze,r,c-1,path,step+1);
        }
        if(r>1){
            allpathprint(p+'U',maze,r-1,c,path,step+1);
        }
        //yha backtracking impliment hogi jo changes uppar ho gye hai unhe reverte krna padega
        //BACKTRACKING
        maze[r][c]=true;
        path[r][c]=0;

    }
}
