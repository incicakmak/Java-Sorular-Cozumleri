package day_07;

import java.util.Arrays;
import java.util.Scanner;

public class day_04 {
    public static void main(String[] args) {

        /*
         Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir
         Integer Array dizesini Reverse olarak (tersten) yazdırınız.
    İpucu:  int arrReverse[] diye bir array oluşturun ve
     kullancıya oluşturdugunuz arrayi buna tersten assign edin..
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen array'in uzunlugunu giriniz.");
        int uzunluk = scan.nextInt();
        int[] arr = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {

            System.out.println("lutfen array'in elemanlarını giriniz.");
            int eleman = scan.nextInt();
            arr[i] = eleman;
        }
        int arrReverse[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            arrReverse[i] = arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(arrReverse));

    }
}