public class BankTest {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter account name: ");
        String name = input.nextLine();
        System.out.print("Enter account balance: ");
        double balance = input.nextDouble();

        Bank bank1 = new Bank(name,balance);
        int num = 0;
        while(num !=5){

            System.out.println("Enter: ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");

            num = input.nextInt();
            switch(num){
                case 1:
                    System.out.println(bank1.getBalance());
                    break;
                case 2:
                    System.out.println("Enter deposit amount amount: ");
                    double depositAmount = input.nextDouble();
                    bank1.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter withdraw amount amount: ");
                    double withdrawAmount = input.nextDouble();
                    bank1.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Enter transfer amount amount: ");
                    double transferAmount = input.nextDouble();
                    bank1.transfer(transferAmount);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println(num +" is an invalid option");
                    break;

            }
            if(num == 5){
                break;
            }
        }
    }
}
