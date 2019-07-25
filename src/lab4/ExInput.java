package lab4;

import java.util.Scanner;

public class ExInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // input integer
        System.out.print("Please, enter an integer: ");
        int x = scanner.nextInt();

        System.out.println("Your entered integer: "+x);


        //input double
        System.out.print("Please, enter double: ");
        double y = scanner.nextDouble();

        System.out.println("Your entered double: "+y);

        //input String
        System.out.print("Please, enter you name: ");
        String s = scanner.nextLine();

        System.out.println("You name is: "+s);




    }
}
