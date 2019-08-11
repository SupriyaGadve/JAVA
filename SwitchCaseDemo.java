package SWITCHCASE;

import java.util.Scanner;

public class SwitchCaseDemo {

    public static void main(String[] args) {
        int ch, a, b;

        System.out.print("Menu: \n" +
                "1. Addition \n" +
                "2. Subtraction \n" +
                "3. Multiplication \n" +
                "4. Division \n" +
                "5. Modulus \n" +
                "6. Compare \n");


        System.out.print("Enter your choice:");
        Scanner scanner = new Scanner(System.in);
        ch = scanner.nextInt();


       if(ch>6){

           System.out.println("Please choose correct option.");

       }else {
           System.out.print("Enter the two numbers:");

       }

        a = scanner.nextInt();
        b = scanner.nextInt();
        switch (ch) {

            case 1:
                System.out.println("The Addition is: " + (a + b));
                break;
            case 2:
                System.out.println("The Subtraction is: " + (a - b));
                break;
            case 3:
                System.out.println("The Multiplication is: " + (a * b));
                break;
            case 4:
                System.out.println("The Division is: " + (a / b));
                break;
            case 5:
                System.out.println("The Modulus is: " + (a % b));
                break;
            case 6:
                if (a > b) {
                    System.out.println("The Greater Number is: " + a);
                } else
                    System.out.println("The Greater Number is: " + b);
                break;


        }
    }
}
