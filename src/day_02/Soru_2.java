package day_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru_2 {

    public static void main(String[] args) {

/*
        Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
		 * Input1={1,2,3,4}
		 * Input2={5,6}
		 * Çıktı={1,2,3,4,5,6}
         */
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 4, 6, 8, 9, 10, 11};
        yeniArrayYap(arr1, arr2);
    }

    private static void yeniArrayYap(int[] arr1, int[] arr2) {


        List<Integer> ikiArrayBiYerde = new ArrayList<>();


        for (int value : arr1) {
            ikiArrayBiYerde.add(value);

        }

        for (int i : arr2) {
            if (!ikiArrayBiYerde.contains(i))
                ikiArrayBiYerde.add(i);

        }

        System.out.println(ikiArrayBiYerde);

        int [] yeniArray = new int [ikiArrayBiYerde.size()];


        for (int i = 0; i < yeniArray.length ; i++) {

            yeniArray[i]=ikiArrayBiYerde.get(i);
        }
        System.out.println(Arrays.toString(yeniArray));
        }

        }





