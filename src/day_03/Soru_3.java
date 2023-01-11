package day_03;

public class Soru_3 {
    public static void main(String[] args) {


        //verilen bir strig arraydeki en uzun ve en kısa kelimeleri yazdıran method yazınız.

        String[] arr = {"ali", "ayse", "hasan", "hü"};

        String enUzun = arr[0];
        String enKisa = arr[0];

        for (String each:arr
             ) {
            if (enKisa.length()>=each.length())
                enKisa=each;
            if (enUzun.length()<=each.length())
                enUzun=each;
        }

        System.out.println(enKisa);
        System.out.println(enUzun);

        for (int i = 0; i < arr.length ; i++) {

            if (enKisa.length()>=arr[i].length())
                enKisa=arr[i];
            if (enUzun.length()<=arr[i].length())
                enUzun=arr[i];

        }
        System.out.println("****************************");
        System.out.println(enKisa);
        System.out.println(enUzun);

    }




}