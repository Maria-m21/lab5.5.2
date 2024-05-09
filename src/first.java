import java.util.Random;
public class first {

        public static void main(String[] args) {

            Random random = new Random();
            int randomNumber = random.nextInt(41) - 20;
            System.out.println("Випадкове натуральне число: " + randomNumber);
        }


}
