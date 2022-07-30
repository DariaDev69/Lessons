package Lesson18;

import java.util.Arrays;

public class Lesson183 {
    public static void main(String[] args) {

        int []array1 = {1,9,3,-8,0,5,4,1};

        for (int i=0; i<array1.length;i++) { // Вывод в консоль всех элементов массива array1 для ознакомления перед использованием методов.
            System.out.print(array1[i]+" ");
        }
        System.out.println();

        Arrays.sort(array1); // Пример использования метода sort(array) для сортировки массива array1.
        // Внимание! вызов метода sort(array) происходит только через класс Arrays.

        for (int i=0; i<array1.length;i++) { // Вывод в консоль всех элементов массива array1 после использования метода sort(array).
            System.out.print(array1[i]+" ");
        }
        System.out.println();

        int index1 = Arrays.binarySearch(array1,-8); // пример использования метода binarySearch (array, value) в отсортированном массиве array1.
        System.out.println(index1);
    }
}












