package day_06;

import java.util.Map;

public class C01_kursiyerIsimArama {
    public static void main(String[] args) {

        Map<Integer, String> kursiyerMap =MapMethodDepo.kursiyerMapOlustur();

        System.out.println(kursiyerMap);

        System.out.println(kursiyerMap.keySet());

        System.out.println(kursiyerMap.values());

        // verilen bir ismin kursiyerMap'de olup olmadigini kontrol edip
        //true yada false donduren bir method yazdirin.

        boolean sonuc=MapMethodDepo.isimİleKursiyerArama(kursiyerMap,"fatma");

        System.out.println(sonuc);

    }



}
