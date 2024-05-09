package org.example;
import java.util.ArrayList;
import java.util.Iterator;

//Task 1

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Элемент 1");
        arrayList.add("Элемент 2");
        arrayList.add("Элемент 3");
        arrayList.add("Элемент 4");

        System.out.println("Обход ArrayList с использованием цикла for:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println();

        System.out.println("Обход ArrayList с использованием цикла for-each:");
        for (String element : arrayList) {
            System.out.println(element);
        }
        System.out.println();

        System.out.println("Обход ArrayList с использованием цикла while:");
        int index = 0;
        while (index < arrayList.size()) {
            System.out.println(arrayList.get(index));
            index++;
        }
        System.out.println();

        System.out.println("Обход ArrayList с использованием итератора:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    //Task 2

}