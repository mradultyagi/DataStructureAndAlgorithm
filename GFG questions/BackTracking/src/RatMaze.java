public class RatMaze {
    static int N =4;
    static int [][] maze = {
            {1,0,1,0},
            {1, 1, 1, 1},
            {0, 1, 0, 0},
            {0, 1, 1, 0}

    };
    static int[][] sol = new int[N][N];
    public static void main(String[] args) {
        RatMaze rm = new RatMaze();
        if(!rm.mazeSolve()){
            System.out.println("no solution");
        }

    }
    static boolean isSafe(int i , int j){
        return i<N && j<N && maze[i][j]==1;
    }
    static boolean mazeSolve(){
        if(!solvemazeRec(0, 0))
            return false;
        else {
            printMatrix(sol);
            return true;
        }
    }
    static boolean solvemazeRec(int i,int j){
        if(i==N-1 && j ==N-1 && isSafe(i,j)) {
            sol[i][j]=1;
            return true; 
        }
        if(isSafe(i, j)){
            sol[i][j]=1;
            if(solvemazeRec(i + 1, j)) return true;
            else if (solvemazeRec(i, j + 1)) {
                return true;
            }
            sol[i][j]=0;
        }
        return false;

    }
    static void printMatrix(int[][] mat){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
