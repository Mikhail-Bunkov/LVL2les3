package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] words = {"Тундра","Облако","Собака","Лапти"," Тундра", "Лапти","Лапти","ЕщеЧТОТО","ЕщеЧТОТО","ЕщеЧТОТО"};
        System.out.println(Arrays.toString(words));
        HashMap<String, Integer> hmap = new HashMap<>();
        for (String x: words) {
            hmap.put(x, hmap.getOrDefault(x,0)+1);
        }
        System.out.println(hmap);


        Phonebook phBook = new Phonebook();
        phBook.add("Карсаров", "23532523522");
        phBook.add("Курсенко", "7967967523522");
        phBook.add("Кипрев", "11124556522");
        phBook.add("Маев", "90586532112");
        phBook.add("Иваченко", "44662222122");
        System.out.println("Номер телефона: "+phBook.get("Кипрев"));
        System.out.println("Номер телефона: "+phBook.get("Карсаров"));
    }
}
