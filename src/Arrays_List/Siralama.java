package Arrays_List;

import java.util.Arrays;

public class Siralama {
    public static void main(String[] args) {
        int[] dizi={8,3,1,89,0,5};
        int index=0,max=0,temp=0;
        for(int i=0;i<dizi.length;i++){
            index=i;
            max=dizi[i];
            for(int j=i;j<dizi.length;j++){
                if(max<dizi[j]){
                    max=dizi[j];
                    index=j;
                }
            }

            temp=dizi[i];
            dizi[i]=dizi[index];
            dizi[index]=temp;
        }
        for(var i: dizi){
            System.out.print(i+" ");
        }
    }
    public static int[] siralama(int[] dizi){



        return dizi;
    }
}
