//assignment 2 task10
import java.util.Scanner;

public class t14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;

        for (int i = start; i < end; i++) {
            if (i % multiple == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
