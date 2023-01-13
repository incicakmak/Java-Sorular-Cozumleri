package day_06;

import java.util.Map;

public class C02_batchListesiYazdirma {
    public static void main(String[] args) {

        Map<Integer, String> kursiyerMap =MapMethodDepo.kursiyerMapOlustur();

        // verilen bir batch'in sinif listesini yazdirma

        MapMethodDepo.sinifListesiYazdirma(kursiyerMap,"108");

    }



}
