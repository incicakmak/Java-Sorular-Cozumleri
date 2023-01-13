package day_06;

public class Soru_1 {

    public static void main(String[] args) {


        /*
          Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
          Örnek:
           Sayı: 1238
           Sayının Tersi: 8321
         */

           String input="125389";
           String yeniInput="";



        for (int i = input.length()-1; i >=0 ; i--) {

            yeniInput=yeniInput+input.substring(i,i+1);

        }
        System.out.println(yeniInput);

    }



}
