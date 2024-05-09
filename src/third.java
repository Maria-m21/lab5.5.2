import java.util.Random;
public class third {
    public static void main(String[] args) {

            Random random = new Random();

            int randomNumber = random.nextInt(101);

            String numberAsString = Integer.toString(randomNumber);

            int digitCount = numberAsString.length();

            System.out.println("Випадкове число: " + randomNumber);
            System.out.println("Кількість цифр у числі: " + digitCount);
        }


}
