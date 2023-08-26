import by.itclass.ArrayInt;
import by.itclass.ArrayObject;

public class Runner_exm1 {
    public static void main(String[] args) {
        //Параметр. классы (Generics)
        ArrayInt arrayInt1 = new ArrayInt(5);
        arrayInt1.add(10);
        arrayInt1.add(15);
        arrayInt1.add(5);

        int value = arrayInt1.get(0);
        System.out.println(value);

        System.out.println(arrayInt1.get(1));


        //Создать класс ArrayDouble, содержащий определение
        //такое же как и ArrayInt, но хранящий
        //в массиве элементы типа double

        //Создать класс ArrayString, содержащий определение
        //такое же как и ArrayInt, но хранящий
        //в массиве элементы типа String

        //Класс позволяет хранить данные разного типа
        //и определяет общую логику для манипуляции этими данными
        //Храним объекты String
        ArrayObject arrayObj1 = new ArrayObject(5);
        arrayObj1.add(1);
        arrayObj1.add(1.4848);
        arrayObj1.add(true);
        arrayObj1.add("Java");
        arrayObj1.add("IT CLASS");

        System.out.println(arrayObj1.get(0));
        System.out.println(arrayObj1.get(1));

        //Храним объекты Integer
        ArrayObject arrayObj2 = new ArrayObject(5);
        arrayObj2.add(1);
        arrayObj2.add(10);
        arrayObj2.add(20);
        arrayObj2.add(25);

        System.out.println(arrayObj2.get(1));
        System.out.println(arrayObj2.get(2));
    }
}
