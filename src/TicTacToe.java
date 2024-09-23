import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }

        }
        //suppose this is current player:
        char player = 'X';
        boolean gameOver = false; //there is no game over
        Scanner input = new Scanner(System.in);
        while (!gameOver) { //this loop is actually run until our game is not ended
            printBoard(board); //firstly we print the board
            System.out.println("player" + player + "has enter ");
            int row = input.nextInt();
            int col = input.nextInt();
            if(board[row][col] == ' '){
                board[row][col] = player;
                gameOver = haveWon(board,player);
                if(gameOver){
                    System.out.println("player" + player + "has been won ");
                }else {
                   if(player == 'X'){
                      player ='O';
                   }else {
                       player = 'X';
                   }
                }
            }else {
                System.out.println("invalid activity ");
            }
        }
//        printBoard(board);

    }

    public static boolean haveWon(char[][] board,char player){
        //for row
        for (int row = 0; row < board.length; row++) {
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return  true;
            }
        }
        //for col
        for (int col = 0; col < board.length; col++) {
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return  true;
            }
        }

        //for diagonal
        if(board[0][0] == player && board[1][1] == player && board[2][2]==player){
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][1] == player){
            return true;
        }
        return false;


    }


    public static void printBoard(char[][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col <board[row].length ; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();

        }

    }
}