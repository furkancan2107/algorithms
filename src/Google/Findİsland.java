package Google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Findİsland {
    public static void main(String[] args) {
        int[][] island = {
                { 1, 0, 0, 0, 0, 0, 1, 0, 0, 1 },
                { 0, 1, 0, 1, 1, 1, 0, 0, 1, 1 },
                { 0, 0, 1, 0, 1, 0, 1, 1, 1, 0 },
                { 1, 1, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 1, 0, 1, 1, 0, 0, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0, 1, 0, 0, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 1, 0, 0, 1 },
                { 0, 1, 0, 1, 1, 1, 0, 0, 1, 1 },
                { 0, 0, 1, 0, 1, 0, 1, 1, 1, 0 },
                { 1, 1, 0, 0, 1, 0, 0, 0, 0, 0 }
        };
        List<int[]> finds=new ArrayList<>();
        findBorder(island,finds);

        for (int[] i : finds){
            findInside(i[0],i[1],finds,island);
        }

    }
    public static boolean isContains(List<int[]> finds,int col,int row){

       return false;
    }
    public static boolean validMatrix(int[][] array,int col,int row){
      return col>=0 && col< array.length && row>=0 && row<array[0].length;
    }
    // köşelerdeki 1 lere bağlantısı oa-lan 1 leri bul findse ekle
    public static List<int[]> findInside(int col,int row,List<int[]> finds,int[][] array){

            // sağ kontrol
            if(row>0 && array[col][row-1]==1){

                    int[] newInt={col,row};
                    if(isContains(finds,col,row)){
                        finds.add(newInt);
                        findInside(col,row-1,finds,array);
                    }


            }
            // sol kontrol
            if(row<array[0].length-1 && array[col][row+1]==1){
                int[] newInt={col,row};
                if(isContains(finds,col,row)){

                    finds.add(newInt);
                    findInside(col,row+1,finds,array);
                }
            }
            // yukarı kontrol
            if(col>0 && array[col-1][row]==1){
                int[] newInt={col,row};
                if(isContains(finds,col,row)){

                    finds.add(newInt);
                    findInside(col-1,row,finds,array);
                }
            }
            // asaği kontrol
            if(col<array.length-1 && array[col+1][row]==1){
                int[] newInt={col,row};
                if(isContains(finds,col,row)){

                    finds.add(newInt);
                    findInside(col+1,row,finds,array);
                }
            }


        for(int[] i : finds){
            System.out.println(Arrays.toString(i));
        }
        return finds;
    }
    // köşelerdeki 1 leri bul
    public static List<int[]> findBorder(int[][] array,List<int[]> finds){
        List<int[]> border=new ArrayList<>();
        // üst
        for(int i=0;i<array[0].length;i++){
            if(array[0][i]==1){
                int[] newInt={0,i};
                border.add(newInt);
                finds.add(newInt);
            }
        }
        // asaği
        for(int i=0;i<array[array.length-1].length;i++){
            if(array[array.length-1][i]==1){
                int[] newInt={array.length-1,i};
                border.add(newInt);
                finds.add(newInt);
            }
        }
        // sağ
        for(int i=1;i< array.length-1;i++){
            if(array[i][0]==1){
                int[] newInt={i,0};
                border.add(newInt);
                finds.add(newInt);
            }
        }
        // sol
        for(int i=1;i< array.length-1;i++){
            if(array[i][array.length-1]==1){
                int[] newInt={i, array.length-1};
                border.add(newInt);
                finds.add(newInt);
            }
        }

        return border;
    }
}
