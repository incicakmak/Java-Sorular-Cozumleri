package day_10;

public class Soru_2 {
    public static void main(String[] args) {

        /*
        Bir sayının Mükemmel bir sayı olup olmadığını bulan metod yaz.
Mükemmel sayı : Mükemmel sayı,sayılarteorisinde, kendisi hariç pozitif tam bölenlerinin
 toplamı kendisine eşit olansayı. Diğer bir ifadeyle, birmükemmel sayı, bütün pozitif
 tam bölenlerinin toplamının yarısına eşittir. 6=> 1 2 3 Mükemmel sayıdır.

         */

        int sayi=6;
        mukemmelSayiMi(sayi);


    }

    private static void mukemmelSayiMi(int sayi) {

        int toplam=0;

        for (int i = 1; i <sayi ; i++) {

            if (sayi%i==0){
                toplam+=i;
            }

        }
        if (toplam==sayi){
            System.out.println("mükemmel sayi");
        }else {
            System.out.println("mukemmel sayi degil");
        }
    }


}
