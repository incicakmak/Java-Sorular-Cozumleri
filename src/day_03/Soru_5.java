package day_03;

public class Soru_5 {

    public static void main(String[] args) {

        // Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran biri
        //method olusturun.
        int[][] arr = {{3, 2, 1}, {-2, 5, 7}, {2, 5}, {-4, -8}};

   ciftSayilariBul(arr);
    }


public static  void ciftSayilariBul(int [][]arr){

        int toplam=0;

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length ; j++) {

            if (arr[i][j]%2==0)
                toplam+=arr[i][j];

        }

    }

    System.out.println(toplam);


}





}
