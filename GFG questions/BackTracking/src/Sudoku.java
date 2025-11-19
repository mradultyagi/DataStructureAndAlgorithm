public class Sudoku {
    int N =4;
    int[][] mat = {
            {1, 0, 0, 4},
            {0, 0, 1, 0},
            {4, 0, 0, 2},
            {0, 1, 0, 0}
    };
    public static void main(String[] args) {
        Sudoku s = new Sudoku();
        if (s.solve()) {
            s.print();
        } else {
            System.out.println("No solution");
        }

    }
    boolean isSafe(int i,int j,int x){
        for (int k = 0; k < N; k++) {
            if(mat[k][j]==x || mat[i][k]==x){
                return false;
            }
        }
        int s = (int) Math.sqrt(N);
        int rs= i-i%s;
        int cs= j-j%s;
        for (int r = 0; r < s; r++) {
            for (int c = 0; c < s; c++) {
                if(mat[r +rs][c +cs]==x)
                    return false;
            }
        }
        return true;


    }
    boolean solve(){
        int i = -1, j = -1;
        boolean empty = false;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if(mat[i][j]==0){
                    empty=true;
                    break;

                }
            }
            if(empty) break;
        }
        if(i==N) return true;
        for (int x = 1; x <=N; x++) {
            if(isSafe(i,j,x)){
                mat[i][j]=x;
                if(solve()) return true;
                mat[i][j]=0;
            }
        }
        return false;
    }
    void print() {
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                System.out.print(mat[r][c] + " ");
            }
            System.out.println();
        }
    }

}
