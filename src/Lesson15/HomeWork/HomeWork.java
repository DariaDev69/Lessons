package Lesson15.HomeWork;

public class HomeWork {
    static void time() {

        int hour = 0;
        HOUR: while (hour<6) {
            int minute = -1;
            MINUTE: do {
                minute++;
                if (hour > 1 && minute % 10 == 0) {
                    break HOUR;
                }
                int second = 0;
                SECOND: while (second<60) {
                        if (second*hour>minute) {
                            continue MINUTE;
                        }
                        System.out.println(hour + ":" + minute + ":" + second);
                        second++;
                    }
            } while (minute<59);
            hour++;
        }
    }

    public static void main(String[] args) {
        time();
    }
}