package day_10;

public class Soru_3 {
    public static void main(String[] args) {


//  Verilen bir dizi’de ilk 2 en büyük sayıyı bulan metod..

        int[] arr = {3, 75, 2, 0,4, 1, 5,7};

        enBuyukIkiSayiBul(arr);
    }

    private static void enBuyukIkiSayiBul(int[] arr) {

        int enBuyuk=arr[0];
        int enIkinciBuyuk=arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if (enBuyuk<=arr[i]){
                enBuyuk=arr[i];
                    }
                }
        System.out.println(enBuyuk);
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]<enBuyuk){
                if (arr[i]>=enIkinciBuyuk)
                {
                    enIkinciBuyuk=arr[i];
                }
            }
        }
        System.out.println(enIkinciBuyuk);
            }

        }


