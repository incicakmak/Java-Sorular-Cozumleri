package day_01;

import java.util.Scanner;

public class Soru_1 {


    public static void main(String[] args) {


// kullanicidan alinan String bir ifadenin icindeki
        // sayisal degerlerin toplamini veren method yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz.");
         String girilenCumle=scan.nextLine();



        System.out.println(sayisalDegerleriTopla(girilenCumle));

    }

    public static int sayisalDegerleriTopla(String girilenCumle) {
        int toplam=0;
        String [] girilenCumleArr=girilenCumle.split("");
        for (int i = 0; i <girilenCumleArr.length ; i++) {
            if (Character.isDigit(girilenCumleArr[i].charAt(0)))
                toplam+=Integer.valueOf(girilenCumleArr[i]);

        }


        return toplam;
    }


}