package Lesson18;

public class Lesson185 {
    public static void maxMin (double [] array) {
        double max = array [0];
        double min = array [0];

        for (int i=0;i<array.length;i++) {
            if (array[i]>max) {
                max = array[i];
            }
            if (array[i]<min) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
    }

    public static void main(String[] args) {
        //double [] array1 = {1.05, -3.14, 0.0, 0.5, 9.19, -3.0};
        maxMin(new double [] {2.5, -1, 3.0}); // пример записи массива в скобках ()
    }
}