public class Calculator {
    public static void main(String[] args) {
        calculator();
    }
    public static void calculator() {
        int num = 0;
        while (num != 5) {


            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.println("Enter: ");

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            num = input.nextInt();

            switch (num) {
                case 1:
                    addition();
//                calculator();
                    break;
                case 2:
                    subtraction();
//                calculator();
                    break;
                case 3:
                    multiplication();
//                calculator();
                    break;
                case 4:
                    division();
//                calculator();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid option");
//                calculator();
                    break;
            }
            if(num == 5) {
                break;
            }


        }


        }
        public static void addition () {
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter second number: ");
            int num2 = input.nextInt();
            int result = num1 + num2;
            System.out.println(result);
        }

        public static void subtraction () {
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter second number: ");
            int num2 = input.nextInt();
            int result = num1 - num2;
            System.out.println(result);
        }

        public static void multiplication () {
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter second number: ");
            int num2 = input.nextInt();
            int result = num1 * num2;
            System.out.println(result);
        }

        public static void division () {
            int result = 0;
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            try {
                result = (num1 / num2);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

            System.out.println(result);
        }

}
