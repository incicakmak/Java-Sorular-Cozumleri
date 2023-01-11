package day_05;

import java.util.ArrayList;
import java.util.List;

public class Soru_4 {

    public static void main(String[] args) {
        /*
        Soru 5- Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri

        ayri bir liste olarak veren bir program yazin.
         */
        int [] arr1={3,5,4,7,8,7,9,2,1,3,77,77};
        int [] arr2={3,44,4,7,11,7,9,77,1,3,77};

        List<Integer> list=new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length ; j++) {

                if (arr1[i]==arr2[j]){
                    if (!list.contains(arr1[i]))
                        list.add(arr1[i]);
                }
            }
        }
        System.out.println(list);
    }

}
