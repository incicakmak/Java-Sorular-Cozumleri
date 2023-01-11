package day_02;

public class Soru_5 {
    public static void main(String[] args) {

        //Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan
        // //bir method yazın. Method bize çıktıyı döndürsün.

        int input = 0;


        System.out.println(faktoriyelHesaplama(input));
    }
        public static int faktoriyelHesaplama(int input) {
            int sonuc =1;
            if (input < 0)
                System.out.println("negatif sayilarin faktoriyeli olmaz.");
            if (input == 0)
                System.out.println("0! = 1");

            if (input>0){
                for (int i = 1; i <= input; i++) {
                    sonuc *= i;
                }



            }
            return sonuc;
        }}