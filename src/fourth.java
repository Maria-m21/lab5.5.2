import java.util.Random;
import java.util.Scanner;
public class fourth {



        public static void main(String[] args) {

            Random random = new Random();

            int number1 = random.nextInt(3) + 1;
            int number2 = random.nextInt(3) + 1;
            int number3 = random.nextInt(3) + 1;

            System.out.println("Вітаємо у грі \"Лотерея\"!");
            System.out.println("Спробуйте відгадати послідовність трьох чисел від 1 до 3.");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть перше число: ");
            int guess1 = scanner.nextInt();
            System.out.print("Введіть друге число: ");
            int guess2 = scanner.nextInt();
            System.out.print("Введіть третє число: ");
            int guess3 = scanner.nextInt();

            if (guess1 == number1 && guess2 == number2 && guess3 == number3) {
                System.out.println("Вітаємо! Ви відгадали правильну послідовність!");
            } else {
                System.out.println("Спробуйте ще раз. Правильна послідовність: " + number1 + ", " + number2 + ", " + number3);
            }
        }



}
