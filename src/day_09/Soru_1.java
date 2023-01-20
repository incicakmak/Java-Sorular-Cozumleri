package day_09;

public class Soru_1 {

    public static void main(String[] args) {

// verilen bir cumlede istenen kelime varsa
// kaç kere kullanıldıgını yazdırın
    String cumle="java ile hersey kolay ve hersey güzel." ;
String istenenKelime="ay";

kullanimSayisiBul(cumle,istenenKelime);

    }

    private static void kullanimSayisiBul(String cumle, String istenenKelime) {

        int flag=0;

        for (int i = 0; i <=cumle.length()-istenenKelime.length() ; i++) {

            if (cumle.substring(i,i+istenenKelime.length()).equals(istenenKelime))
                flag++;

        }
        if (flag==0) System.out.println("istenen kelime yok.");
        else System.out.println("istenen kelime cumlede "+flag+" kadar vardir");

    }


}
