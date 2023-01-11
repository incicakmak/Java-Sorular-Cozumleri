package day_04;

public class Soru_2 {
    public static void main(String[] args) {

       // Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin

        //toplaminini yazdiran bir method olusturun.

        int[][] arr = {{3,1,2,4},{1,2,0},{3,4,5},{10},{2,7}};

        sonElemanTopla(arr);

    }


public  static void sonElemanTopla( int[][] arr){

        int toplam=0;

    for (int i = 0; i <arr.length ; i++) {
        for (int j = arr[i].length-1; j <arr[i].length ; j++) {
            toplam+=arr[i][j];

        }
    }
    System.out.println(toplam);


}
}
