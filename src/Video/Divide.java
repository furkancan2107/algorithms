package Video;
/*
* çarpma mod alma bolen kulllanmadan bölümü bulma
* */
public class Divide {
    public static void main(String[] args) {
        System.out.println(divide(12,6));
    }
    public static int divide(int bolunen,int bolen) {
        int sayac = 0;
        while (bolunen >= bolen) {
            bolunen -= bolen;
            sayac++;
        }
        return sayac;
    }
}
