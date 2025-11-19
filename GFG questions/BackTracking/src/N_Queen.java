public class N_Queen {
    static final int N = 3;
    boolean [][] board = new boolean[N][N];
    public static void main(String[] args) {
        N_Queen obj = new N_Queen();
        obj.solve();

    }
    boolean solve(){
        if(!solveRec(0))
            return false;
        else {
            printMatrix(board);
            return true;
        }

    }
    boolean isSafe(int row, int col){
        for (int i = 0; i < col; i++) {
            if(board[row][i])
                return false;
        }
        for (int i=row,j=col;i>=0 && j>=0;i--,j--) {
            if(board[i][j])
                return false;
        }
        for (int i=row,j=col;i<N && j>=0;i++,j--){
            if(board[i][j]){
                return false;
            }
        }
        return true;

    }
    boolean solveRec(int col){
        if(col == N ) return  true;
        for (int i = 0; i < N; i++) {
            if(isSafe(i,col)){
                board[i][col]=true;
                if(solveRec(col+1))
                    return true;
                board[i][col]=false;
            }
        }
        return false;
    }
    void printMatrix(boolean[][] mat){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(mat[i][j]){
                    System.out.print("Q ");
                }
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }


}
