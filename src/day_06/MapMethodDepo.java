package day_06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapMethodDepo {

    //bize kursiyerMap donduren bir method olusturalım.

    public static Map<Integer, String> kursiyerMapOlustur() {

    Map<Integer, String> kursiyerMap = new HashMap<>();

    kursiyerMap.put(10,"inci-cakmak-108-05");
    kursiyerMap.put(11,"sumeyye-alakbk-108-05");
    kursiyerMap.put(12,"ali-cak-105-05");
    kursiyerMap.put(13,"ayse-mak-103-04");
    kursiyerMap.put(14,"taha-cakmak-105-08");
    kursiyerMap.put(15,"inci-tuna-104-06");
    kursiyerMap.put(16,"yagız-yas-107-06");
    kursiyerMap.put(17,"yasin-cakmak-110-03");
    kursiyerMap.put(18,"ayse-alakbk-104-04");
    kursiyerMap.put(18,"elif-dogan-108-05");

return kursiyerMap;
}


    public static boolean isimİleKursiyerArama(Map<Integer, String> kursiyerMap, String isim) {

        /*
        1-tum value'leri bir collection olarak kaydedelim.
        2- for each kullanarak her bir valu'yu ele alalım.
        3- "-" split kullanarak value'yu array halinde yazdiralim.
        4-split yaptigimiz arrayden isim bilgisini alalaım.
        5-her value'den aldigimiz isim aranan isimle ayni ise
        6-true dondurup for each'i bitirelim.
         */

        Collection<String> valuesCollection=kursiyerMap.values();


        for (String eachValue:valuesCollection
             ) {
            String[] valueArr = eachValue.split("-");
            String valudekiIsim = valueArr[0];
            if (valudekiIsim.equalsIgnoreCase(isim))
                return true;
        }
return false;
    }


    public static void sinifListesiYazdirma(Map<Integer, String> kursiyerMap, String batch) {

        Collection<String> kursiyerValueCollection=kursiyerMap.values();

        System.out.println("isim          soyisim");

        for (String eachValue:kursiyerValueCollection
             ) {

            String[] valueArr=eachValue.split("-");

            if (valueArr[2].equalsIgnoreCase(batch)){

                System.out.println(valueArr[0]+"    "+valueArr[1]);

            }
        }



    }

    public static Map<Integer, String> soyIsimleriBuyukHarfYap(Map<Integer, String> kursiyerMap) {



        return kursiyerMap;
    }
}
