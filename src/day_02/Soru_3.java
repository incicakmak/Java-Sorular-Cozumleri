package day_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru_3 {

    public static void main(String[] args) {

        /*

        Soru 22-)
        Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
        Giriş :
        30 ve 40

        Beklenen Çıktı:
        30 ve 40 için EBOB= 10
        30 ve 40 için EKOK= 120
        ipucu:
        Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.

         */

        int sayi1=30;
        int sayi2=40;
        int ebob=1;

        List<Integer> ortakPozBol=new ArrayList<>();


        for (int i = 1; i <=sayi2 ; i++) {
            if (sayi2%i==0 && sayi1%i==0 )
                ortakPozBol.add(i);
        }
        ebob=ortakPozBol.get(ortakPozBol.size()-1);

        System.out.println(ortakPozBol);
        System.out.println(ebob);

        int ekok=1;

        ekok=(sayi2*sayi1)/ebob;

        System.out.println(ekok);

    }


}
