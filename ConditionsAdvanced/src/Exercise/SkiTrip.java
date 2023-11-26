package Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String typePremesis = scanner.nextLine(); // "room for one person", "apartment" или "president apartment"
        String positiveNegative = scanner.nextLine(); // "positive"  или "negative"
        double nightPrice = 0.0;
        double discount = 0.0;
        double nights = days - 1; //11 дни = 10 нощувки
        double total = 0;

        switch (typePremesis) {
            case "room for one person":
                nightPrice = 18.0;
                total = nights * nightPrice;
                break;
            case "apartment":
                nightPrice = 25.0;
                total = nights * nightPrice;
                if (nights <= 10) {
                    total = total * 0.70;
                } else if (nights > 10 && nights <= 15) {
                    total = total * 0.65;
                } else {
                    total = total * 0.50;
                }
                break;
            case "president apartment":
                nightPrice = 35.0;
                total = nights * nightPrice;
                if (nights <= 10) {
                    total = total * 0.90;

                } else if (nights > 10 && nights <= 15) {
                    total = total * 0.85;
                } else {
                    total = total * 0.80;
                }
                break;
        }
        if (positiveNegative.equals("positive")) {
            total = total * 1.25;
            System.out.printf("%.2f", total);

        } else if (positiveNegative.equals("negative")) {
            total = total * 0.90;
            System.out.printf("%.2f", total);
        }
    }
}
