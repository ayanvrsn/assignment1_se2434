 import java.util.Scanner;
//assignment 2 task3

public class t7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperature = scanner.nextDouble();

        boolean isHigh = temperature > 37;
        boolean isLow = temperature < 36;

        if (isHigh) {
            System.out.println("High body temperature");
        } else if (isLow) {
            System.out.println("Low body temperature");
        } else {
            System.out.println("Normal body temperature");
        }
    }
}
