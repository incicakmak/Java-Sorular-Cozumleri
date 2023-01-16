package day_08;

public class Soru_1 {
    public static void main(String[] args) {

        /*
         Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
          ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
    Örnek:
    inputarr[]=   {1,2,3,4,5,6,7}
    output:         4
    İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz.
    Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir,
     Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
         */

        int arr []=   {5,6,7,8};
        System.out.println(ortadakiEleman(arr));

    }

    public static int ortadakiEleman(int[] arr){
      int ortadakiSayi=0;
      if (arr.length%2==0){
          System.out.println("array'in uzunlugu çift sayıdır.");
      }

if (arr.length%2!=0) {
    ortadakiSayi = arr[(arr.length - 1) / 2];
}
     return  ortadakiSayi;
    }

}
