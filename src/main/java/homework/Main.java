package homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {




        //Задание 1. Делаю так, чтобы проверяющему было лучше видно, где реализация заданий. Если так делать не надо, скажите на вебинаре об этом, пожалуйста.
        List<String> arr = new ArrayList<>();
        arr.add("Тундра");
        arr.add("Тундра");
        arr.add("Колодец");
        arr.add("Жижа");
        arr.add("Жижа");
        arr.add("Яблоко");
        arr.add("Яблоко");
        arr.add("Хомяк");
        arr.add("Жижа");
        arr.add("Тундра");
        arr.add("Мороз");
        arr.add("Злато");

        String name1;
        for (int j = 0; j <= arr.size()-1; j++) {
            int index=0;
            String name = arr.get(j);
            for (int i = arr.size()-1; i >=0; i--) {
                name1 = arr.get(i);
                if(name == name1){
                    index++;
                }
            }
            System.out.println(name + index);
            if (index!=1){
                for (int i = 1; i <= arr.size()-1; i++) {
                    name1 = arr.get(i);
                    if(name == name1){
                        arr.remove(i);
                    }
                }
            }
        }
        //Конец Задания 1.






    }
}
