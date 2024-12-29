import java.util.Scanner;
//assignment 2 task6
public class t10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String input;

        while (true) {
            input = scanner.nextLine();

            if (input.equals("ENTER")) {
                break;
            }

            sum += Integer.parseInt(input);
        }

        System.out.println("Sum: " + sum);
    }
}
