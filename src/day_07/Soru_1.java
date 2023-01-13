package day_07;

public class Soru_1 {

    public static void main(String[] args) {

        /*
        Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.

    Örnek
    String str : ade1r4d3
    Int toplam : 8
    İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
    Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz
         */


        String str =" ade1r74d3";
    str=str.replaceAll("\\D","");
    String [] strArr=str.split("");
    int toplam=0;

        for (String each: strArr
             ) {

            toplam+=Integer.parseInt(each);
        }

        System.out.println(toplam);



    }



}
