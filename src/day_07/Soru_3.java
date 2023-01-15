package day_07;

import java.util.Arrays;
import java.util.Scanner;

public class Soru_3 {

    public static void main(String[] args) {

        /*
        Kullanıcıdan Arrayin uzunlugunu isteyin.
    Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
    İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen array'in uzunlugunu giriniz.");
        int uzunluk= scan.nextInt();
        int [] arr=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {

            System.out.println("lutfen array'in elemanlarını giriniz.");
            int eleman=scan.nextInt();
            arr[i]=eleman;

        }

        System.out.println(Arrays.toString(arr));



    }




}
