package day_03;

import java.sql.Array;
import java.util.Arrays;

public class Soru_4 {

    public static void main(String[] args) {


/*
    Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
eski array'e yeni degeri atayıp yazdırın

 String[] arr = {"ali", "ayse", "hasan", "hü"};

*/
        String[] arr = {"ali", "ayse", "hasan", "hü"};

String eleman="inci";

        System.out.println(Arrays.toString(elemanEkle(arr,eleman)));
    }

public  static String [] elemanEkle(String [] arr,String eleman){

String [] yeniArr=new String[arr.length+1];



    for (int i = 0; i < arr.length ; i++) {

        yeniArr[i]=arr[i];

    }
    yeniArr[arr.length]=eleman;


return yeniArr;
}
}