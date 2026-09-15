public class PrimeNumber {
   public static void main(String[] args) {
       java.util.Scanner input = new java.util.Scanner(System.in);
       int count = 0;
       System.out.print("Enter a number: ");
       int num = input.nextInt();
       for (int i = 1; i <=num; i++) {
           if (num % i == 0) {
               count++;
           }
       }
       if(count == 2){
           System.out.print("is a prime number");

       }
       else{
           System.out.print("is not prime number");
       }
       }
   }

