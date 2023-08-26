import by.itclass.ArrayGeneric;

public class Runner_exm2 {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[5];
        Double[] arr2 = new Double[5];
        String[] arr3 = new String[5];

        //По умолчанию при создании объекта
        //параметризированного класса, вместо параметра
        //будет использован тип Object (если не указан иной)
        ArrayGeneric array1 = new ArrayGeneric(arr1);
        array1.add(1);
        array1.add(1.928398);
        array1.add("IT CLASS");

        //Создание объекта параметризированного класса
        //с явным указанием, какой тип данных будет
        //использован вместо параметра T
        //В качестве значения параметры T может быть
        //задан любой ССЫЛОЧНЫЙ тип данных
        ArrayGeneric<Integer> array2 = new ArrayGeneric<>(arr1);

        ArrayGeneric<Double> array3 = new ArrayGeneric<>(arr2);

        ArrayGeneric<String> array4 = new ArrayGeneric<>(arr3);
        array4.add("java");
        //array4.add(1);!ОШИБКА. Принимает только String
    }
}
