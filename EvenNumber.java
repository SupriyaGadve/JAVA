/*EvenNumber*/

import java.util.*;



public class EvenNumber {


    public static void main(String[] args) {

        int num;
        Scanner num = new Scanner(System.in);


        System.out.println("Enter the number =");


        if (num%2 == 0) {
            System.out.println("The entered number is Even number.");
        } else {
            System.out.println("The entered number is Odd Number.");
        }


    }
}