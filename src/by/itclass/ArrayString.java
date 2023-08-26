package by.itclass;

public class ArrayString {
    private int head;//хранит индекс последнего добавленного элемента
    private String[] items;

    public ArrayString(int size) {
        items = new String[size];
    }

    public String get(int index) {
        return items[index];
    }

    public void add(String value) {
        items[head++] = value;
    }
}
