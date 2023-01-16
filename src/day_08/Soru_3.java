package day_08;

public class Soru_3 {
    public static void main(String[] args) {
/*
            Bir arıtma tesisinde arıtılan su miktarı günde 5000 metreküptür.
            Arıtılan her 1 metreküp  suyun birim arıtma bedeli arıtılan su hacmine göre değişmektedir.
            Tarife aşağıdaki gibidir:

            2.5 TL (0 – 30.000 metreküp arası)
            3.0 TL (30.000 – 50.000 metreküp arası)
            3,5 TL ( >50.000 metreküp )

            Buna göre, 1 yıl boyunca gün gün arıtma masraflarını toplam olarak bulan ve aşağıdaki
            ekran görüntüsüne sahip olacak bir program hazırlayınız.


            Arıtma Tesisi Günlük Arıtma Masrafı Listesi
                    ……………………………………………….
            1.Gün Sonunda Masraf = …….. TL
            2.Gün Sonunda Masraf = ………TL
*/

        double gunlukmasraf=0;
        double toplammasraf=0;
        int hacim=0;
        System.out.println("Arıtma Tesisi Günlük Arıtma Masrafı Listesi");
        System.out.println("................................");
        for (int i = 1; i <=365 ; i++) {
            hacim = i * 5000;
            if (hacim <= 30000) {
                gunlukmasraf = 5000 * 2.5;
                toplammasraf += gunlukmasraf;
                System.out.println(i + ". Gün Sonunda Masraf = " + toplammasraf + "TL");
            } else if (hacim <= 50000) {
                gunlukmasraf = 5000 * 3;
                toplammasraf += gunlukmasraf;
                System.out.println(i + ". Gün Sonunda Masraf = " + toplammasraf + "TL");
            } else {
                gunlukmasraf = 5000 * 3.5;
                toplammasraf += gunlukmasraf;
                System.out.println(i + ". Gün Sonunda Masraf = " + toplammasraf + "TL");
            }

        }
    }
}