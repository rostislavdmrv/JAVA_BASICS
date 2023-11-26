package Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine(); // Roses, Dahlias, Tulips, Narcissus, Gladiolus
        int flowersCount = Integer.parseInt(scanner.nextLine()); // брой цветя
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.0; // общата сума

        switch (flower) {
            case "Roses":
                totalPrice = flowersCount * 5; // totalPrice = бройката цветя * 5 (за една бройка)
                if (flowersCount > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.10); // totalPrice = totalPrice * 0.90;
                }
                break;
            case "Dahlias":
                totalPrice = flowersCount * 3.80;
                if (flowersCount > 90) {
                    totalPrice = totalPrice - (totalPrice * 0.15); // totalPrice = totalPrice * 0.85;
                }
                break;
            case "Tulips":
                totalPrice = flowersCount * 2.80;
                if (flowersCount > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.15); // totalPrice = totalPrice * 0.85;
                }
                break;
            case "Narcissus":
                totalPrice = flowersCount * 3;
                if (flowersCount < 120) {
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                break;
            case "Gladiolus":
                totalPrice = flowersCount * 2.50;
                if (flowersCount < 80) {
                    totalPrice = totalPrice + (totalPrice * 0.20);
                }
                break;
        }
        if (totalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flower, budget - totalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
        }
    }
}
