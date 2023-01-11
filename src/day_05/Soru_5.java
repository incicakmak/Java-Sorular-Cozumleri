package day_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_5 {


    public static void main(String[] args) {
        /*
        Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci

        sayisini bir list olarak donduren bir method olusturun.
         */


        System.out.println(fibonacciDizisi());


    }

    public static List<Integer> fibonacciDizisi(){

        Scanner scan=new Scanner(System.in);
        System.out.println("kaç tane fibonacci dizisi istiyorsanız o sayıyı giriniz.");
        int adet=scan.nextInt();
        List<Integer> fibonacciDizisi=new ArrayList<>();

        if(adet==0)
            System.out.println("bir liste olusturamam.");
        else if (adet==1) {
          fibonacciDizisi.add(0);
        } else if (adet==2) {
          fibonacciDizisi.add(0);
          fibonacciDizisi.add(1);

        }else {
            int sayi1=0;
            int sayi2=1;
            int sayi3=1;
            fibonacciDizisi.add(sayi1);
            fibonacciDizisi.add(sayi2);
            fibonacciDizisi.add(sayi3);
            int sayac=3;
do {
    sayi1=sayi2;
    sayi2=sayi3;
    sayi3=sayi1+sayi2;
    sayac++;

    fibonacciDizisi.add(sayi3);
}
            while (sayac!=adet);
        }
        return fibonacciDizisi;
    }
}
