public class t12 {
    public static void main(String[] args) {
        int sum = 0, product = 1;
        boolean hasEven = false; // Для проверки наличия четных чисел

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) sum += i; // Суммируем числа, делящиеся на 3
            if (i % 2 == 0) {
                product *= i; // Умножаем четные числа
                hasEven = true; // Если встретилось четное число
            }
        }

        System.out.println("Сумма чисел, делящихся на 3: " + sum);
        System.out.println(hasEven ? "Произведение четных чисел: " + product : "Четные чисел не найдено.");
    }
}