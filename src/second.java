public class second {

        public static void main(String[] args) {

            double a = 3.0;
            double b = 4.0;

            double c = Math.sqrt(a * a + b * b);

            double area = 0.5 * a * b;

            double perimeter = a + b + c;

            System.out.println("Довжина катету a: " + a);
            System.out.println("Довжина катету b: " + b);
            System.out.println("Довжина гіпотенузи c: " + c);
            System.out.println("Площа прямокутного трикутника: " + area);
            System.out.println("Периметр прямокутного трикутника: " + perimeter);
        }
    }

}
