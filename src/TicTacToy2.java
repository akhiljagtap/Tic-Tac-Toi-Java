import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class TicTacToy2 {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col <board[row].length ; col++) {
                System.out.println(board[row][col] = ' ');
            }
        }
        char PLAYER = 'X';
        boolean isGameOver = false;
        while (!isGameOver){
            printBoard(board);
            System.out.println("enter...  ");
            Scanner input = new Scanner(System.in);
            int row = input.nextInt();
            int col = input.nextInt();
            if (board[row][col] == ' '){
                board[row][col] = PLAYER;
                System.out.println("player " + PLAYER + " has enter");
                isGameOver = isWinner(board,PLAYER);
                if(isGameOver){
                    System.out.println("player " + PLAYER + " has won ");
                }
                if(PLAYER =='X'){
                    PLAYER ='O';

                }else {
                    PLAYER = 'X';
                }

            }else {
                System.out.println("Invalid input please try again!! ");
            }

       }


    }
    static void printBoard(char[][]board){
        char[][] borad = new char[3][3];
        for (int row = 0; row <board.length ; row++) {
            for (int col = 0; col <board[row].length; col++) {
                System.out.print(board[row][col]+" | ");

            }
            System.out.println( );

        }
    }
    static boolean isWinner(char[][] board,char Player){
        for (int row = 0; row <board.length ; row++) {
            if(board[row][0] == Player && board[row][1] == Player && board[row][2] == Player){
                return  true;
            }
        }
        for (int col = 0; col <board[0].length ; col++) {
            if(board[0][col] == Player && board [1][col] == Player && board[2][col] == Player){
                return true;

            }

        }
        if (board[0][0] == Player && board[1][1] == Player && board[2][1] ==Player){
            return  true;
        }
        if(board[0][2] == Player && board[1][1] ==Player && board[2][1] ==Player){
            return true;
        }
        return false;

    }


}
