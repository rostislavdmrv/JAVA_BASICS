package Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни
        int priceTrainings = Integer.parseInt(scanner.nextLine());
        //2. цена за кецове = цена за тренировки - 40% (0.4)
        double priceTrainers = priceTrainings - 0.4 * priceTrainings; //0.6 * priceTrainings;
        //3. цена за екип = цена за кецове - 20% (0.2)
        double priceSuit = priceTrainers - 0.2 * priceTrainers; //0.8 * priceTrainers;
        //4. цена за топка = 1 /4 от цена за екип
        double priceBall = priceSuit / 4;
        //5. цена за аксесоари = 1 / 5 от цена за топка
        double priceAcc = priceBall / 5;
        //6. разходи = цена за тренировки (входни данни)
        //		+ цена за кецове
        //		+ цена за топка
        //		+ цена за екип
        //		+ цена за аксесоари
        double expenses = priceTrainings + priceTrainers + priceBall + priceSuit + priceAcc;
        //7. отпечатваме разходи
        System.out.println(expenses);
    }
}
