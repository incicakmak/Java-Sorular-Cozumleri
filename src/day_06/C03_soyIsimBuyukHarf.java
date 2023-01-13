package day_06;

import java.util.Map;

public class C03_soyIsimBuyukHarf {

    public static void main(String[] args) {

        Map<Integer,String> kursiyerMap=MapMethodDepo.kursiyerMapOlustur();

        kursiyerMap=MapMethodDepo.soyIsimleriBuyukHarfYap(kursiyerMap);




    }



}
