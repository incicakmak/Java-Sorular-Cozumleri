package day_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_5 {

    public static void main(String[] args) {
/*
        Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan

        kismini list olarak bize donduren bir method olusturun
*/

        istenmeyenHarfSil(isimDondur());

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


    public  static List<String> istenmeyenHarfSil(List<String>isimListesi){

        isimDondur();
     List<String> yenilist=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("LUTFEN SİLMEK İSTEDİGİNİZ İSMİ GİRİNİZ.");
        String isim=scan.next().substring(0,1);

        for (int i = 0; i <isimListesi.size() ; i++) {

                if (!isimListesi.get(i).contains(isim))
                    yenilist.add(isimListesi.get(i));
        }

  return yenilist;
    }



}
