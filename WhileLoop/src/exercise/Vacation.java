package exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationCost = Double.parseDouble(scanner.nextLine()); // пари, нужни за екскурзията
        double availableCash = Double.parseDouble(scanner.nextLine()); // пари, които аз притежавам

        int allDays = 0; // всички дни
        int spendDays = 0; // дните, в които Джеси само харчи

        while (availableCash < vacationCost && spendDays < 5) {
            String action = scanner.nextLine(); // действие - spend / save
            double cash = Double.parseDouble(scanner.nextLine()); // сумата, която ще спести или похарчи

            allDays++; // увеличавам всички дни, докато цикълът се върти

            if (action.equals("spend")) {
                availableCash = availableCash - cash; // от моите пари изваждам сумата, която тя харчи
                spendDays++; // увеличавам дните, в които харчи
                if (availableCash < 0) { // ако моите пари са станали по-малки от 0, искам да ми ги сетнеш на 0
                    availableCash = 0;
                }
            } else if (action.equals("save")) {
                availableCash = availableCash + cash;
                spendDays = 0;
            }
        }
        if (availableCash >= vacationCost) {
            System.out.printf("You saved the money for %d days.", allDays);
        }
        if (spendDays == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", allDays);
        }
    }
}
