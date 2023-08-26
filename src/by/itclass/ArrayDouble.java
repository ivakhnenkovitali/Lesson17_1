package by.itclass;

public class ArrayDouble {
    private int head;//хранит индекс последнего добавленного элемента
    private double[] items;

    public ArrayDouble(int size) {
        items = new double[size];
    }

    public double get(int index) {
        return items[index];
    }

    public void add(double value) {
        items[head++] = value;
    }
}
