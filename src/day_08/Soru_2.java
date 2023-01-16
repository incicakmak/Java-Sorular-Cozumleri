package day_08;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru_2 {

    public static void main(String[] args) {

    /*
         --BONUS--  ---SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---
            (Eliminate duplicates)
    ENG:
    Write a method that returns a new array by eliminating the duplicate values in the array using the following method header
    Write a test program that reads in ten integers, invokes the method, and displays the result.
            (Tekrarlananları çıkar)
    TÜR:
    Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
    On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
            ---->>>
    public static int[] eliminateDuplicates(int[] list)
    ÖRNEK:
    On sayi giriniz:
            1 2 3 2 1 6 3 4 5 2
    ÇIKTI:
    Birbirinden farkli girilen sayilar: 1 2 3 6 4 5
     */
        int[] eliminateDuplicates = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};

        System.out.println(Arrays.toString(eliminateDuplicates(eliminateDuplicates)));

    }
    public static int[] eliminateDuplicates(int [] eliminateDuplicates) {
      
        List<Integer> list=new ArrayList<>();

        for (int each:eliminateDuplicates
             ) {
            if (!list.contains(each))
                list.add(each);
        }
         eliminateDuplicates=new int[list.size()];

        for (int i = 0; i <list.size() ; i++) {
            eliminateDuplicates[i]=list.get(i);
        }

        return eliminateDuplicates ;
    }
}


