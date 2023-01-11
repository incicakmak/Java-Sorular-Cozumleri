package day_03;

public class Soru_1 {

    public static void main(String[] args) {

// kullanıcıdan iki sayi alın ebob ve ekok bulun.

        int s1 = 20;
        int s2 = 35;
        int ebob = 1;


        for (int i = 1; i <= s1; i++) {

            if (s1 % i == 0 && s2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println("ebob : "+ebob);
        System.out.println("ekok : "+ s1*s2/ebob);


        for (int i = s1 ; i < s2*s1;  i++) {
            if (i%s2==0 && i%s1==0) {
                System.out.println(i + "  : ekok");
                break;
            } }

    }
}