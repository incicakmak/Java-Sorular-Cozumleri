package day_09;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {

        //Kullanıcıdan gün numarasını alıp haftaiçi yada haftasonu yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun numarasini giriniz.");
        int gunNo= scan.nextInt();

        switch (gunNo){

            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println(" hafta icidir.");
                break;
            case 6 :
            case 7 :
                System.out.println(" hafta sonudur.");
                break;
            default:
                System.out.println("gecersiz gun numarasi");
        }


    }



}
