package day_05;

import java.util.ArrayList;
import java.util.List;

public class Soru_1 {
    public static void main(String[] args) {


        /*

        Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif

        tamsayilari bir liste olarak bize yazdiran bir method olusturun.

         */

        int input=55;
        tamBolenBulma(input);

    }
public static void tamBolenBulma(int sayi){

    List<Integer> sayininBolenlerListesi=new ArrayList<>();

    for (int i = 1; i <=sayi ; i++) {
        if (sayi%i==0)
            sayininBolenlerListesi.add(i);
    }
    System.out.println(sayininBolenlerListesi);
}

}
