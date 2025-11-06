public class AllPathsMaze {
    public static void main(String[] args) {
        boolean [] [] condition ={
                {true,true,true},{true,true,true},{true,true,true}
        };
        allpath("",condition,0,0);


    }
    //boolean is used for giving inputs of restriction
    static void allpath(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1&&c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        //neeche wali line se false mai kr dega vo jo bhi ek baar visit ho gya taki dobara na aa ske

        maze[r][c]=false;
        if(r<maze.length-1){
            allpath(p+'R',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allpath(p+'D',maze,r,c+1);
        }
        if(c>1){
            allpath(p+'L',maze,r,c-1);
        }
        if(r>1){
            allpath(p+'U',maze,r-1,c);
        }
        //yha backtracking impliment hogi jo changes uppar ho gye hai unhe reverte krna padega
        //BACKTRACKING
        maze[r][c]=true;

    }
}
//giving recurssion overflow
