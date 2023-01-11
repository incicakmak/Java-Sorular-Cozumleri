package day_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru_3 {
    public static void main(String[] args) {

      //  Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
       // elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.

        String[] arr = {"ali", "ayse", "hasan", "hüSEYİN","hasan","ayse"};

        System.out.println(Arrays.toString(tekrarEdeniSil(arr)));
    }

    private static String [] tekrarEdeniSil(String[] arr) {

      List< String> liste=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!liste.contains(arr[i]))
                liste.add(arr[i]);
        }

        String yeniArr []=new String[liste.size()];
        for (int i = 0; i < liste.size() ; i++) {
            yeniArr[i]=liste.get(i);
        }

     return yeniArr;
    }


}
