public class FoodTest {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int num = 0;
        double total = 0;
        double discount = 0;
        double amount = 0;
        do{

            System.out.println("=== FOOD MENU ==="); 
            System.out.println("Enter: ");
            System.out.println("1. Rice = 1,500");
            System.out.println("2. Chicken = 2,000");
            System.out.println("3. Fish = 1,200");
            System.out.println("4. Yam = 1,800");
            System.out.println("5. Exit");

            num = input.nextInt();

            Food rice = new Food("Rice", 1500);
            Food chicken = new Food("Chicken", 2000);
            Food fish = new Food("Fish", 1200);
            Food yam = new Food("Yam", 1800);

            switch (num) {
                case 1:
                    total += rice.getPrice();
                    break;
                case 2:
                    total += chicken.getPrice();
                    break;
                case 3:
                    total += fish.getPrice();
                    break;
                case 4:
                    total += yam.getPrice();
                    break;
                case 5:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println(num +" is an invalid option");
                    break;
            }

            if (num == 5) {
                break;
            }


            if (total >= 10000) {

                discount = total * 0.10;


            }
            amount = total - discount;

        }while(num != 5);

            System.out.println("Total: " + total);
            System.out.println("Discount: " + discount);
            System.out.println("Amount to pay: " + amount);




    }

}
