package Quiz1;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char gender;
        double h;
        int k,age;

        //input data
        System.out.print("Enter gender: ");
        gender = sc.next().charAt(0);;
        System.out.print("Enter high: ");
        h = sc.nextDouble();
        System.out.print("Enter kilogram: ");
        k = sc.nextInt();
        System.out.print("Enter age: ");
        age = sc.nextInt();

        double p_m =  66.5 + (13.75 *k) + (5.003 * h) - (6.775 * age);

        System.out.println(p_m);






    }
}
