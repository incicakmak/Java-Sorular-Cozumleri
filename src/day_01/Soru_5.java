package day_01;

public class Soru_5 {
    public static void main(String[] args) {

        //Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
        //ipucu:
        //Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile yapabilirsiniz.

        String ay = "subat";
        int gun = 3;


        switch (ay) {

            case "ocak":
                if (gun < 21)
                    System.out.println("oglak");
                else if (gun >= 21)
                    System.out.println("kova");
                break;
            case "subat":
                if (gun < 21)
                    System.out.println("kova");
                else if (gun >= 21)
                    System.out.println("balık");
                break;
            case "mart":
                if (gun < 21)
                    System.out.println("balık");
                else if (gun >= 21)
                    System.out.println("");
                break;
            case "nisan":
                if (gun < 21)
                    System.out.println("oglak");
                else if (gun >= 21)
                    System.out.println("kova");
                break;
            case "mayıs":
                if (gun < 21)
                    System.out.println("oglak");
                else if (gun >= 21)
                    System.out.println("kova");
                break;


        }
    }}
