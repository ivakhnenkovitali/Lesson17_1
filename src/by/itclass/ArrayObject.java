package by.itclass;

public class ArrayObject {
    private int head;//хранит индекс последнего добавленного элемента
    private Object[] items;

    public ArrayObject(int size) {
        items = new Object[size];
    }

    public Object get(int index) {
        return items[index];
    }

    public void add(Object value) {
        items[head++] = value;
    }
}
