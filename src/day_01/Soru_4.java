package day_01;

public class Soru_4 {
    public static void main(String[] args) {
/*
        Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina

        :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
                yazdirin.
        */

     String input="java ile hayati yasa";

     if (input.length()%2==0)
         input=input.substring(0,input.length()/2)+":)"+input.substring(input.length()/2);
       else
           input=input.substring(0,(input.length()-1)/2+1)+":("+input.substring(input.length()/2+2);

        System.out.println(input);

    }


}
