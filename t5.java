import java.util.Scanner;

public class t5 {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the temperature: ");
            int temperature = scanner.nextInt();

            if (temperature < 0) {
                System.out.println("It's cold outside.");
            } else {
                System.out.println("It's warm outside.");
            }
        }
    }



