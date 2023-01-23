package day_10;

import java.util.Scanner;

public class Soru_5 {

    public static void main(String[] args) {

       /* Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                Ad ve soyadın baş harfleri büyük olmalıdır
        Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
                Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti 😉
        Giriş :
        		 > Gandalf Grey 5632458796323456
        Çıktı
                > İsim : G*** G**
        	     > CCN : ******9632
                */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String ad= scan.next();
        ad= ad.substring(0,1).toUpperCase()+ad.substring(1).replaceAll("\\w", "*") ;


        System.out.println("Lutfen soyadinizi giriniz");
        String soyad= scan.next();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).replaceAll("\\w", "*");;


        System.out.println("Lutfen kredi karti numaranizi giriniz");
        String kartNo=scan.next();
        if (kartNo.length()!= 16)
            System.out.println("hatali kart numarasi");

        kartNo=kartNo.substring(0,kartNo.length()-4).replaceAll("\\d","*")+kartNo.substring(kartNo.length()-4);
        System.out.println(ad+"  "+soyad+"   "+"   "+kartNo);
    }



}
