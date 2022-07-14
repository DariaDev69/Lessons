package Lesson15;

public class Lesson15 {
    public static void main(String[] args) {
/*
        boolean b = true;
        int a = 1;

        while (b) {
            System.out.println(a);
            if (a%3==0 && a%7==0) {
                b=false;
            }
            a++;
        }

        int i = 5; //6,7,8,9,10,11,12!!!!!
        while (i++<10) {
            i++;
        }
        System.out.println(i);

        int d = 1;
        do {
            System.out.println(d);
            d++;
        } while  (d<=10);
*/

        int hour=0;

        OUTER: do {
            int minute=0;
            INNER: while (minute<60) {
                System.out.println(hour + ":" + minute);
                minute++;
            }
            hour++;
        } while (hour<24);
    }
}