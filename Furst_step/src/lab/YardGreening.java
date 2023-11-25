package lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());

        double totalPrice = area *7.61;
        double discount = totalPrice*0.18;
        double price = totalPrice-discount;

        System.out.printf("The final price is: %f lv.\n",price);
        System.out.printf("The discount is: %f lv.",discount);
    }
}
