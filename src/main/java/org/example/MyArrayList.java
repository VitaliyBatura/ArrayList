package org.example;

/**
 * MyArrayList is a resizable array implementation in Java. MyArrayList grows dynamically.
 * It has the following methods:
 * get element by index;
 * add element;
 * remove element by index;
 * insert element by index;
 * clear array;
 * quick sort method.
 *
 * @param <T> this array stores in itself elements of type T.
 */
public class MyArrayList<T> {

    private Object[] data;
    public int length;

    public MyArrayList() {
        this.data = new Object[1];
        length = 0;
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return.
     * @return the element at the specified position in this list.
     * @throws IndexOutOfBoundsException - if the index is out of range.
     */
    public T get(int index) {

        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
        return (T) this.data[index];
    }

    /**
     * Appends the specified element to the end of this list.
     *
     * @param element element to be appended to this list.
     */
    public void add(T element) {

        if (this.length == this.data.length) {
            Object[] data2 = new Object[this.length * 2];
            for (int i = 0; i < this.length; i++) {
                data2[i] = this.data[i];
            }
            this.data = data2;
        }
        this.data[this.length] = element;
        this.length += 1;
    }

    /**
     * Removes the element at the specified position in this list. Shifts any subsequent elements to the left.
     *
     * @param index index of the element to be removed.
     * @throws IndexOutOfBoundsException - if the index is out of range.
     */
    public void remove(int index) {

        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
        Object[] data2 = new Object[this.length - 1];
        for (int i = 0; i < index; i++) {
            data2[i] = this.data[i];
        }
        for (int i = index; i < this.length - 1; i++) {
            data2[i] = this.data[i + 1];
        }
        this.length -= 1;
        this.data = data2;
    }

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position and any subsequent elements to the right.
     *
     * @param element element to be inserted.
     * @param index   index at which the specified element is to be inserted.
     * @throws IndexOutOfBoundsException - if the index is out of range.
     */
    public void insert(T element, int index) {

        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
        this.add(element);
        for (int i = this.length - 1; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }
        this.data[index] = element;
    }

    /**
     * Removes all elements from this list. The list will be empty after this call returns.
     */
    public void clear() {

        int length = this.length;
        for (int i = 0; i < length; i++) {
            remove(0);
        }
    }

    /**
     * Sorts the elements of the array in O(N*logN) time.
     * This method is using a recursive algorithm.
     *
     * @param array list to be sorted by the quick sort method.
     * @param low   first index of the array to be sorted.
     * @param high  last index of the array to be sorted.
     * @param <T>   object that should implement interface Comparable.
     */
    public <T extends Comparable<T>> void quickSort(MyArrayList<T> array, int low, int high) {

        if (array.length == 0)
            return;
        if (low >= high)
            return;
        T middle = array.get((int) (Math.random() * (high - low) + low));
        int i = low;
        int j = high;
        while (i <= j) {
            while (array.get(i).compareTo(middle) < 0) {
                i++;
            }
            while (middle.compareTo(array.get(j)) < 0) {
                j--;
            }
            if (i <= j) {
                T temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }

    /**
     * Replaces the element at the specified position in this list with the specified element.
     *
     * @param index   index of the element to replace.
     * @param element element to be stored at the specified position.
     * @throws IndexOutOfBoundsException - if the index is out of range.
     */
    public void set(int index, T element) {

        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
        data[index] = element;
    }
}
