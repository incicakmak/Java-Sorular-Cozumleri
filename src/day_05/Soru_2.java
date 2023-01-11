package day_05;

import java.util.Arrays;

public class Soru_2 {
    public static void main(String[] args) {

    /*
    Soru 2- Verilen int array’deki her elementin karelerini alip,
    karelerinin toplamini
    yazdiran bir method olusturun.



     */
        int[] arr = {3, 5, 2, 0, 6, 5};
        karesiniAl(arr);
        karesiniAlTopla(arr);
    }

    public static void karesiniAl(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void karesiniAlTopla(int[] arr) {
        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            toplam+=arr[i];
        }
        System.out.println(toplam);
    }
}