package day_10;

import java.util.ArrayList;

public class Soru_1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Ahmet");
        list.add("Ozan");
        list.add("Eda");
        list.add("Ahu");

        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }

        for (String str : list) {
            System.out.println(str); // ozan ahu yazdirir.
        }}}


