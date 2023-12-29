package Arrays_List;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        /*
 {"5","3",".",".","7",".",".",".","."}
{"6",".",".","1","9","5",".",".","."}
{".","9","8",".",".",".",".","6","."}
{"8",".",".",".","6",".",".",".","3"}
{"4",".",".","8",".","3",".",".","1"}
{"7",".",".",".","2",".",".",".","6"}
{".","6",".",".",".",".","2","8","."}
{".",".",".","4","1","9",".",".","5"}
{".",".",".",".","8",".",".","7","9"}
        * */
        char[][] board={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','.','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'},
        };
        System.out.println(isValidSudoku(board));
    }
    public static boolean isValidSudoku(char[][] board) {

        // satir kontrol
        for(int i=0;i<board.length;i++){
            Set<Character> unique=new HashSet<>();
            for(int j=0;j<board.length;j++){

                if(board[i][j]=='.'){
                    continue;
                }
                if(unique.contains(board[i][j])){
                   return false;
                }
                unique.add(board[i][j]);
            }
        }
        // sütün  kontrol
        for(int i=0;i<board.length;i++){
            Set<Character> unique=new HashSet<>();
            for(int j=0;j<board.length;j++){

                if(board[j][i]=='.'){
                    continue;
                }
                if(unique.contains(board[j][i])){
                    return false;
                }

                unique.add(board[j][i]);

            }
        }
        // 3*3 lük matris kontroolleri
        for(int i=0;i<board.length;i+=3){
            for(int j=0;j<board.length;j+=3){
                Set<Character> unique=new HashSet<>();
                for(int k=i,count=0;count<3;k++,count++){
                   for(int  l=j,cnt=0;cnt<3;l++,cnt++){
                       if(board[k][l]=='.') continue;
                       if(unique.contains(board[k][l])){
                           return false;
                       }
                       unique.add(board[k][l]);
                   }
                }
            }
        }
return  true;
}
}
