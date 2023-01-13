package day_06;

import java.util.ArrayList;
import java.util.List;

public class Soru_3 {
    public static void main(String[] args) {

        /*
        Bir Stringdeki benzersiz karakterleri
         Array String olarak döndüren bir kod yazın.
            ( mülakat sorusu )
    Örnek:
    String str="Javacokkolay"

    İpucu: İçiçe for looplar, String Manupulations
     ve ifler kullanrak çözebilrsiniz.
    Stringdeki bir harfi Stringde bulunan diger harfler ile
    karşılaştırıpkonteynıra atacaksınız bu yüzden iç içe loop kullanmak mantıklı duruyor
         */

        String str = "Javacokkolay";

        String[] strArr = str.split("");
        List<String> strList = new ArrayList<>();


        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {

                if (strArr[i].equalsIgnoreCase(strArr[j]))
                    if (!strList.contains(strArr[i])) {
                        strList.add(strArr[i]);
                    }  }
        }
        System.out.println(strList);
    }
}