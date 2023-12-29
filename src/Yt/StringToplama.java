package Yt;
import java.lang.String;


public class StringToplama {
    public static void main(String[] args) {
        System.out.println(topla("13","13"));
    }
    public static String topla(String s1,String s2){
        String kucuk="";
        String buyuk="";
       if(s1.length()>=s2.length()){
            kucuk=s2;
            buyuk=s1;
       }else{
           kucuk=s1;
           buyuk=s2;
       }
       kucuk=reverseString(kucuk);

       while (kucuk.length()<buyuk.length()){
           kucuk+="0";
       }
       kucuk=reverseString(kucuk);
        s1=kucuk;
        s2=buyuk;
String cozum="";
int elde=0;
int sonuc=0;
if(s1.length()>1){
    for(int i=s1.length()-1;i>=0;i--){
        int a=Character.getNumericValue(s1.charAt(i));
        int b=Character.getNumericValue(s2.charAt(i));
         sonuc=a+b+elde;
        int basamakT=0;
        String son=sonuc+"";
        if(sonuc>=10){
            elde=Integer.parseInt(son.substring(0,1));
            basamakT=Integer.parseInt(son.substring(1,2));
            cozum+=basamakT;
            if(i==0){
                cozum+=elde;
            }
        }else{
            cozum+=sonuc+"";
            elde=0;
        }
    }
}else {
    int a=Character.getNumericValue(s1.charAt(0));
    int b=Character.getNumericValue(s2.charAt(0));
    sonuc=a+b;
    cozum+=sonuc;
    cozum=reverseString(cozum);
}
return reverseString(cozum);
    }
    private static String reverseString(String kucuk) {
        String don="";
        for(int i=kucuk.length()-1;i>=0;i--){
            don+=kucuk.charAt(i);
        }
        return don;
    }
}