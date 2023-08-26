import java.util.ArrayList;

public class Runner_exm3 {
    public static void main(String[] args) {
        //Ранее для хранения набора элементов
        //использовались массивы
        String[] arr = new String[5];

        //Collection API предоставляет классы, обекты который
        //также позволяют хранить набора однотипных элементов
        //и дополнительно имеют методы для возможности
        //манипуляции этими элементами
        ArrayList<String> list1 = new ArrayList<>();

        //Доабвление элементов в коллекцию
        list1.add("Java");
        list1.add("Course");
        list1.add("IT");
        list1.add("CLASS");

        System.out.println(list1);
    }
}
