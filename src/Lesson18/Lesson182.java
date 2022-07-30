package Lesson18;

public class Lesson182 {
    public static void main(String[] args) {
       // int [] array0 = new int [-3]; // аутпут выдаст Исключение (отрицательная длина массива).

        int [] array = new int [3];
        array [0] = 1;
        array [1] = 2;
        array [2] = 3;
      //  array [3] = 5; // аутпут выдаст Исключение (выход за длину массива, 3-го индекса в массиве нет).


        int [][]array2 = new int [3][];
        //System.out.println(array2[0][1]);// аутпут выдаст Исключение (так как массивы array2, из которых он состоит ещё не определены, вернее имеют дефолтные значения null).
    }
}
