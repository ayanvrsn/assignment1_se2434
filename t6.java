import java.util.Scanner;
//assignment 2 task2
public class t6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18 && age <= 28) {
            System.out.println(name + ", come to the military registration and enlistment office");
        }
    }
}
