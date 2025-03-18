public class Leetcode999 {
    static boolean checkUp(int row,int col,char[][] board){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='p') return true;
            else if (board[i][col]!='.' && board[i][col]!='p') return false;
        }
        return false;
    }
    static boolean checkDown(int row,int col,char[][] board){
        for(int i=row+1;i<8;i++){
            if(board[i][col]=='p') return true;
            else if (board[i][col]!='.' && board[i][col]!='p') return false;
        }
        return false;
    }
    static boolean checkLeft(int row,int col,char[][] board){
        for(int i=col-1;i>=0;i--){
            if(board[row][i]=='p') return true;
            else if (board[row][i]!='.' && board[row][i]!='p') return false;
        }
        return false;
    }
    static boolean checkRight(int row,int col,char[][] board){
        for(int i=col+1;i<8;i++){
            if(board[row][i]=='p') return true;
            else if (board[row][i]!='.' && board[row][i]!='p') return false;
        }
        return false;
    }
    static int numRookCaptures(char[][] board) {
        int res=0;

        //find i and j index of the rook
        int i=0,j=0;
        boolean flag=false;
        for(i=0;i<board.length;i++){
            for(j=0;j<board[i].length;j++){
                if(board[i][j]=='R'){
                    flag=true;
                    break;
                }
            }
            if (flag) break;
        }
        res+=checkUp(i,j,board)?1:0;
        res+=checkLeft(i,j,board)?1:0;
        res+=checkDown(i,j,board)?1:0;
        res+=checkRight(i,j,board)?1:0;



        return res;
    }
    public static void main(String[] args) {
        System.out.println(numRookCaptures(new char[][] {
            {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', 'p', '.', '.', '.', '.'},
            {'.', '.', '.', 'R', '.', '.', '.', 'p'},
            {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', 'p', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'}
        }));
    }
}
