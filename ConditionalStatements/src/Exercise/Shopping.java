package Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        /*
        Видеокарта – 250 лв./бр.
        Процесор – 35% от цената на закупените видеокарти/бр.
        Рам памет – 10% от цената на закупените видеокарти/бр.
         */
        double videoCardsTotalPrice = videoCards * 250;
        double processorPrice = videoCardsTotalPrice * 0.35;
        double ramPrice = videoCardsTotalPrice * 0.10;

        double totalPrice = videoCardsTotalPrice + processorPrice * processors + ram * ramPrice;

        if (videoCards > processors) {
            totalPrice *= 0.85;
        }

        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }


    }
}
