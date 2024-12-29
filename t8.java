import java.util.Scanner;
//assignment 2 task4

public class t8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age < 20 || age > 60) {
            System.out.println("You don’t have to work.");
        }
    }
}
