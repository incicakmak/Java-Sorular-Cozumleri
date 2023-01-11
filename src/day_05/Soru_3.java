package day_05;

public class Soru_3 {
    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
         */

        String input = "çocuklar bile biliyor Ali Ayşe'yi seviyor.";
        String harf = "b";

        kullanilmisMi(input, harf);

    }
public static void kullanilmisMi(String input,String harf){
        String [] inputArr=new String[input.length()];
        inputArr=input.split("");
   int flag=0;

    for (int i = 0; i <inputArr.length ; i++) {

        if (inputArr[i].equalsIgnoreCase(harf))
            flag++;
    }
       if (flag==0)
           System.out.println("bu harf cumlede hic kullanilmamistir.");
        else System.out.println(harf+" harfi cumlede "+ flag+ " kez kullanilmistir.");

}

}
