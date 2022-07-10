package Lesson13.HomeWork;

public class Month {
    int numberOfMonth;

    void getNumberOfMonth (int numberOfMonth) {
        this.numberOfMonth = numberOfMonth;
    }

    public static void main(String[] args) {
        Month test = new Month();
        test.getNumberOfMonth(5);

        switch (test.numberOfMonth) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days.");
            case 4, 6, 9, 11 -> System.out.println("30 days.");
            case 2 -> System.out.println("28 days.");
            default -> System.out.println("Number of month isn't correct.");
        }
    }
}