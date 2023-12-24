package CandyCrush;

import javax.swing.*;
import java.util.Scanner;

public class CandyCrush {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[][] board = {
                {'1', '1', '4', '5', '2', '6', '5', '5', '6', '7'},
                {'1', '2', '2', '2', '2', '6', '9', '6', '2', '8'},
                {'8', '5', '2', '1', '8', '8', '8', '7', '3', '4'},
                {'4', '2', '1', '6', '7', '7', '7', '3', '5', '1'},
                {'4', '2', '4', '6', '7', '1', '1', '5', '6', '2'},
                {'4', '2', '1', '6', '9', '4', '6', '1', '9', '9'},
                {'4', '2', '7', '4', '9', '9', '9', '9', '1', '2'},
                {'1', '2', '2', '2', '2', '6', '9', '6', '2', '8'},
                {'8', '5', '2', '1', '8', '8', '8', '7', '3', '4'},
                {'4', '2', '1', '6', '9', '4', '6', '1', '9', '9'}
        };

        while (true){
            printBoard(board);
            System.out.println();
            System.out.print("Satir gir: ");
            int col=scanner.nextInt();
            System.out.print("Sutun gir : ");
            int row=scanner.nextInt();
            if(col<0 || col>=board.length || row<0 || row>=board.length) {
                System.out.println("Hatali Satir veya sütün girdiniz tekrar deneyin!");
                continue;
            }
            if(col==0 && row==0){
                System.out.println("GÜLE GÜLE !!!");
                break;
            }
            gameBoard(col-1,row-1,board);
            System.out.println();
            printBoard(board);
            System.out.println();

        }


    }
    public static void gameBoard(int col,int row,char[][] board){
        char temp=board[col][row];
        drawBoard(col,row,board,temp);
    }
    public static void drawBoard(int col,int row,char[][] board,int temp){
        if(col<0 || col>=board.length || row<0 || row>=board.length || board[col][row]!=temp){
           // System.out.println("Hata");
            return;
        }
        board[col][row]='X';

        // sağa
        drawBoard(col,row+1,board,temp);
        // sola
        drawBoard(col,row-1,board,temp);
        //yukari
        drawBoard(col-1,row,board,temp);
        // asagi
        drawBoard(col+1,row,board,temp);
    }
    public static void printBoard(char[][] board){
        for (char[] x : board){
            for (char y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }

}

/*public class CandyCrush {
    public static void main(String[] args) {
        char[][] board={
                {'1','1','4','5','2','6','5','5','6','7'},
                {'1','2','2','2','2','6','9','6','2','8'},
                {'8','5','2','1','8','8','8','7','3','4'},
                {'4','2','1','6','7','7','7','3','5','1'},
                {'4','2','4','6','7','1','1','5','6','2'},
                {'4','2','1','6','9','4','6','1','9','9'},
                {'4','2','7','4','9','9','9','9','1','2'},
                {'1','2','2','2','2','6','9','6','2','8'},
                {'8','5','2','1','8','8','8','7','3','4'},
                {'4','2','1','6','9','4','6','1','9','9'}
        };
        for (char[] x: board){
            for (char a: x){
                System.out.print(a+" ");
            }
            System.out.println();
        }
        System.out.println();

        gameBoard(3,1,board);
        for (char[] x: board){
            for (char a: x){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }

    public static char[][] gameBoard(int col,int row, char[][] board){

        // sag
        if(row<board[row].length-1 && board[col][row]==board[col][row+1]){
            board[col][row]='X';
            gameBoard(col,row+1,board);
            board[col][row+1]='X';
        }
        // asagi
          else if(col<board.length-1 && board[col][row]==board[col+1][row]){
            board[col][row]='X';
            gameBoard(col+1,row,board);
            board[col+1][row]='X';
        }
           // sol
           else if(row>0 && board[col][row]==board[col][row-1]){
               board[col][row]='X';
               gameBoard(col,row-1,board);
               board[col][row-1]='X';
           }


        // yukari
       else if(col>0 && board[col][row]==board[col-1][row]){
            board[col][row]='X';
            gameBoard(col-1,row,board);
            board[col-1][row]='X';
        }




        return board;
    }
}*/
