package day_09;

public class Soru_4 {
    public static void main(String[] args) {

        /*
        //Kullanıcıdan bir şifre isteyip aşağıdaki şartları kontrol edin
        // ve kullanıcıya düzeltmesi gereken tüm eksiklikleri söyleyin.
        //Eğer tüm şartları sağlarsa şifre başarıyla kaydedildi yazdırın.
        //ilk harf küçük harf olmalı
        //son karakter rakam olmalı
        //sifre boşluk içermemeli
        //uzunluğu en az 10 karakter olmalı.

         */

        String sifre="aCAabc15  b";
        boolean flag=true;
        char sonHarf=sifre.charAt(sifre.length()-1);

        if (!(sifre.charAt(0)<='z'&& sifre.charAt(0)>='a')){
            flag=false;
            System.out.println("lutfen ilk harfi kucuk giriniz.");
        }
        if (!(sifre.length()==10)){
            flag=false;
            System.out.println("lutfen sifeniz 10 karakter olmali.");
        }
        if (sifre.contains(" ")){
            flag=false;
            System.out.println("sifre bosluk icermemeli");
        }
        if (!(Character.isDigit(sonHarf))){
            System.out.println("lutfen son harfi rakam giriniz.");
              flag=false;
        }
        if (flag)
            System.out.println("sifre basariyla kaydedildi.");
    }




}
