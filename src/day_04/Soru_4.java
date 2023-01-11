package day_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_4 {

    public static void main(String[] args) {

        /*
        Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize

       liste olarak dondurecek bir method olusturun.

         */
        System.out.println(isimDondur());

    }


    public static List <String>  isimDondur(){

        List<String> isimListesi=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        String isim="";
        do {
            System.out.println("lutfen isim giriniz.Bitirmek istediğinizde Q ya basiniz.");
            isim = scan.nextLine();
            if (isim.equalsIgnoreCase("q"))
                break;
            isimListesi.add(isim);
        }

       while (!isim.equalsIgnoreCase("q"));

        return isimListesi;
    }

}
