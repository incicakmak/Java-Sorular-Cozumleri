package day_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru_2 {

    public static void main(String[] args) {
/*
        Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
        ( mülakat sorusu )
        Örnek:
        String str="Javacokkolay"
        Yinelenen karakterler : [a, o, k]
        İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
                Stringdeki bir harfi Stringde bulunan diger harfler ile
                 karşılaştırıpkonteynıra atacaksınız bu yüzden iç içe loop kullanmak mantıklı duruyor
                --------------------------------------------------------
*/
        String str="Javacokkolay";

        System.out.println(Arrays.toString(yinelenenEleman(str)));


    }
    public static String [] yinelenenEleman(String str){

        List <String> list=new ArrayList<>();

        String[] strArr=str.split("");

        int flag=0;

        for (int i = 0; i <strArr.length ; i++) {

            for (String each: strArr
                 ) {
                if (strArr[i].equalsIgnoreCase(each)){
                    flag++;
                }
            }
            if (flag>1) {
                if (!list.contains(strArr[i])) {
                    list.add(strArr[i]);
        }
            }
            flag=0;
        }
        strArr=new String[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            strArr[i]=list.get(i);
        }

return  strArr;
    }

}
