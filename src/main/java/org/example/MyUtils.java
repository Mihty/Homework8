package org.example;
import java.util.ArrayList;
import java.util.List;

//Task 2
public class MyUtils {

    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static List<Integer> getOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }


    public static List<String> convertToStringList(List<Integer> numbers) {
        List<String> stringList = new ArrayList<>();
        for (int number : numbers) {
            stringList.add(String.valueOf(number));
        }
        return stringList;
    }

    public static List<String> doubling(List<String> strings) {
        List<String> doubledStrings = new ArrayList<>();
        for (String str : strings) {
            doubledStrings.add(str + str);
        }
        return doubledStrings;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Сумма элементов списка: " + getSum(numbers));
        System.out.println("Нечетные числа из списка: " + getOddNumbers(numbers));
        System.out.println("Преобразование списка в список строк: " + convertToStringList(numbers));

        List<String> strings = new ArrayList<>();
        strings.add("2i");

        System.out.println("Дублирование и конкатенация каждой строки в списке: " + doubling(strings));
    }
}