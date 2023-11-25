package lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dog =Integer.parseInt(scanner.nextLine());
        int cat =Integer.parseInt(scanner.nextLine());
        double priceDog = 2.5 * dog;
        double priceCat = 4* cat;
        double totalPrice = priceCat+priceDog;

        System.out.printf("%f lv.",totalPrice);

    }
}
