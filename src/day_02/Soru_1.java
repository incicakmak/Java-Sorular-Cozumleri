package day_02;

import java.util.Arrays;

public class Soru_1 {
    public static void main(String[] args) {

        //Example 1: Size verilen pozitif ve negatif sayilar iceren bir  integer array'deki
        // "en buyuk negatif" ve "en kucuk pozitif" elemani bulunuz.

        int [] arr = {-1,6,-5,-9,10,5,77,-3,-6,-9,-4,-1,0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int maxNegatif=arr [0];
        int minPozitif=arr [arr.length-1];

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]>0)
                if(arr[i]<= minPozitif)
                    minPozitif=arr[i];


            if (arr[i]<0) {
                if (arr[i] >= arr[0])
                    maxNegatif = arr[i];

            }
        }

        System.out.println(" minimum pozitif: "+minPozitif +" max negatif:  "+maxNegatif);
    }


}
