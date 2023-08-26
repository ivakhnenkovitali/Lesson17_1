package by.itclass;

//Класс является оберткой над массивом
//и предосталвяет методы по доступу к элементам массива
public class ArrayInt {
    private int head;//хранит индекс последнего добавленного элемента
    private int[] items;

    public ArrayInt(int size) {
        items = new int[size];
    }

    public int get(int index) {
        return items[index];
    }

    public void add(int value) {
        items[head++] = value;
    }
}
