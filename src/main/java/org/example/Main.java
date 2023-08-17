package org.example;

/**
 * This is the Main class.
 *
 * @author Vitaliy Batura
 */
public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(30);
        myArrayList.add(31);
        myArrayList.add(32);
        myArrayList.add(33);
        myArrayList.add(35);
        myArrayList.insert(44, 4);
        myArrayList.insert(49, 0);
        myArrayList.remove(4);
        myArrayList.remove(1);
        myArrayList.quickSort(myArrayList, 0, myArrayList.length - 1);
        myArrayList.clear();

        for (int i = 0; i < myArrayList.length; i++) {
            System.out.println(myArrayList.get(i));
        }
        System.out.println(myArrayList.length);

        MyArrayList<String> myArrayList2 = new MyArrayList<>();
        myArrayList2.add("Грушин");
        myArrayList2.add("Бананов");
        myArrayList2.add("Абрикосов");
        myArrayList2.add("Вишневский");
        myArrayList2.add("Дынин");
        myArrayList2.insert("Ежевикин", 4);
        myArrayList2.insert("Желудёв", 0);
        myArrayList2.remove(4);
        myArrayList2.remove(1);
        myArrayList2.quickSort(myArrayList2, 0, myArrayList2.length - 1);
        myArrayList2.clear();

        for (int i = 0; i < myArrayList2.length; i++) {
            System.out.println(myArrayList2.get(i));
        }
        System.out.println(myArrayList2.length);
    }
}
