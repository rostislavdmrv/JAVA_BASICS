package Exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //входни данни - OK
        //сума от пилешки менюта = бр. пил. менюта * 10.35 - OK
        //сума от рибни менюта = бр. рибни менюта * 12.40 - OK
        //сума от вегетариански менюта = бр. вег. менюта * 8.15 - OK
        //сума за всички менюта = сума от пилешки менюта + сума от рибни менюта + сума от вегетариански менюта - OK
        //сума за десерт = 20% от сума за всички менюта - ok
        //сума за доставка = 2.50 - ok
        //крайна сума = сума за всички менюта + сума за десерт + доставка - ok
        //принтираме крайната сума - ok

        int countChickenMenus = Integer.parseInt(scanner.nextLine());
        int countFishMenus = Integer.parseInt(scanner.nextLine());
        int countVegetarianMenus = Integer.parseInt(scanner.nextLine());

        double priceChickenMenus = countChickenMenus * 10.35;
        double priceFishMenus = countFishMenus * 12.40;
        double priceVegetarianMenus = countVegetarianMenus * 8.15;
        double priceAllMenus = priceChickenMenus + priceFishMenus + priceVegetarianMenus;

        double priceDessert = 0.2 * priceAllMenus;
        double priceDelivery = 2.50;

        double totalPrice = priceAllMenus + priceDessert + priceDelivery;
        System.out.println(totalPrice);
    }
}
