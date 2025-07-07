import java.util.Scanner;

public class TicTacToe{
    static char[][] board = {
        {' ',' ',' '},
        {' ',' ',' '},
        {' ',' ',' '}
    };

    static void printBoard(){
        for(int i=0;i<3;i++){
            System.out.println(board[i][0]+ " | "+board[i][1] +" | "+board[i][2]);
        }
    }

    static boolean checkWin(char player){

        //check horizontal and vertical
        for(int i = 0;i<3;i++){
            if((board[i][0]==player && board[i][1]==player && board[i][2]==player) || (board[0][i]==player && board[1][i]==player && board[2][i]==player)) return true;
        }

        //check diagonals
        return ((board[0][0]==player && board[1][1]==player && board[2][2]==player) || (board[0][2]==player && board[1][1]==player && board[2][0]==player));
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the game!");
        Scanner sc= new Scanner(System.in);
        char currPlayer = 'x';
        int row = -1;
        int col = -1;
        int moves =0;
        while(true){
            printBoard();
            System.out.println("current player: " + currPlayer);
            System.out.println("choose the row and col");
            row = sc.nextInt();
            col = sc.nextInt();

            //validating rows and cols
            if((row<0 && row>2)|| (col<0 && col>2)){
                System.out.println("choose vaid rows and cols");
                continue;
            }

            //update board
            board[row][col]=currPlayer;
            moves++;

            
            if(checkWin(currPlayer)){
                System.out.println("player "+currPlayer+ " wins");
                printBoard();
                break;
            }
            if(moves>=9){
                System.out.println("match draw");
                break;
            }
            currPlayer = currPlayer=='x'?'o':'x';

        }
        sc.close();
    }
}
