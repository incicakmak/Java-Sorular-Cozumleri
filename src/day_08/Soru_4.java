package day_08;

import java.util.Scanner;

public class Soru_4 {
    public static void main(String[] args) {

        /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u
     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.
     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.
     Test Data:
     we  yada  %
     Beklenen Çıktı:
     Yanlis karakter girdiniz!
            */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz.");
        String krk=scan.next();

        if (krk.length()>1){
            System.out.println("lutfen tek karekter giriniz.");
        }
        if (krk.length()==1){
            if (krk.charAt(0)>='a' && krk.charAt(0)<='z'){
                if (krk.equalsIgnoreCase("a")|| krk.equalsIgnoreCase("e")||krk.equalsIgnoreCase("i")||krk.equalsIgnoreCase("o")||krk.equalsIgnoreCase("u")){
                    System.out.println(krk+" harfi sesli harftir.");
                }else System.out.println(krk+" harfi sessiz harftir.");
            }else System.out.println("yanlis karakter girdiniz.");
        }
    }



}
