package day_09;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {

        /*

       - Diziyi rastgele elemanlarla doldurunuz.
        -(Dizinin boyutu 10 olarak tanımlansın fakat diziye 5 tane eleman eklensin) (elemanEkle)
        - Dizi elemanlarını listeleyen kodu yazınız.(listele)
        -Dizinin en küçük elemanını bulunuz ve yazdırınız. (enKüçükElemanBul)
        -Var olan bu diziyi sıralı bir dizi haline getiriniz. Bu sirali tamsayı dizisi üzerinde;
        Kullanıcı bize bir sayi veriyor ve bu sayiyi diziden silmemizi istiyor. Silme islemini yaptiktan sonra,
        bosalan dizi elemanının yerini, o elamanin sagindakileri, sola kaydirarak doldurmak istiyoruz.
        Böylelikle dizimizde bosluk kalmayacak ve yine sıralı olacaktır.
        (Aynı elemandan birden fazla var ise ilk bulunan eleman silinsin).
        Bu islemi yapan metodu yazınız. (elemanSil)Ayrıca kullanıcı tarafından belirlenen bir elemanı diziye ekleyen bir metot yazınız.
        Bu durumda da dizi elemanları sağa kayacaktır. (yeniElemanEkle)
         */

        int []arr=new int[10];
        elemanEkle(arr);
        listeleme(arr);
        enKucukElemanBul(arr);
        Arrays.sort(arr);
        arr=silVeKaydir(arr);
        yeniElemanEkle(arr);
    }

    private static void yeniElemanEkle(int[] diz) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen diziye eklemek  istediginiz sayiyi giriniz");
        int girilenSayi=scan.nextInt();
        int[] yeni=new int[diz.length+1];//arriyin içeriği değişmedği içi yeni bir +1 ile arr oluşturduk
        int j=0;//yeni arrayin indexi
        for (int i = 0; i <diz.length ; i++) {
            yeni[j]=diz[i];
            j++;
        }
        //   System.out.println(Arrays.toString(yeni));
        yeni[j]=girilenSayi;
        //   System.out.println(Arrays.toString(yeni));
        Arrays.sort(yeni);
        System.out.println(Arrays.toString(yeni));
    }
    public static int[] silVeKaydir(int [] diz) {
        System.out.println(Arrays.toString(diz));
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen diziden silmek istediginiz sayiyi giriniz");
        int girilenSayi=scan.nextInt();
        int[] arryeni=new int[diz.length-1];
        int j=0;
        int flag=0;
        for (int i = 0; i <diz.length ; i++) {
            if (flag<1){
                if (diz[i]==girilenSayi){
                    i++;
                    flag++;
                }
            }if (j<arryeni.length)
                arryeni[j]=diz[i];
            j++;
        }
        System.out.println(Arrays.toString(arryeni));
        return arryeni;
    }


    public static void enKucukElemanBul(int [] dizi) {
        int enKucukEleman=dizi[0];
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]!=0)
                if (dizi[i]<enKucukEleman){
                    enKucukEleman=dizi[i];

                }

        }
        System.out.println(enKucukEleman);
    }

    public static void listeleme(int []dizi) {

        System.out.println(Arrays.toString(dizi));
    }


    public static void elemanEkle(int[] arr) {
        Random rnd=new Random();
        for (int i = 0; i < 5; i++) {
            arr[i]= rnd.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

    }


    }




