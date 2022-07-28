package Lesson18;

public class Lesson18 {
    public static void main(String[] args) {
        int [] array1; // объявление массива
        String [] array2;
        double [] [] array3;
        int [] [] array10;
        double [] array5;
        double [] array7;

        array1 = new int [8]; // размещение массива с указанием его размера (8)
        array2 = new String[3];
        array3 = new double[4][2]; // массив array3 двумерный и имеет 4 одномерных массива длиной по 2
        array10 = new int[3][]; // массив array10 двумерный и имеет 3 одномерных массива разной длины
        array5 = new double[2];
        array7 = new double[2];

        array2[0]="privet"; // статическая инициализация массива array2
        array2[1]="poka";
        array2[2]="ok";

        array5[0]=2.5; // статическая инициализация массива array5
        array5[1]=3.5;

        array7=array5; // статическая инициализация

        array3[1] = array5;

    }
}


















