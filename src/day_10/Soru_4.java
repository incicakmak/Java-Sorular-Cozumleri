package day_10;

import java.util.Scanner;

public class Soru_4 {

    public static void main(String[] args) {

        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen harfi yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz.");
        String harf=scan.next();

        if ('a'<=harf.charAt(0) && 'z'>=harf.charAt(0))
            System.out.println(harf.toUpperCase());
        else
            System.out.println("girilen  harf buyuktur.");


    }


}
