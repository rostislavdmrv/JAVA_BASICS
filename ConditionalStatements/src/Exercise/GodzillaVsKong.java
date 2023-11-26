package Exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmPrice = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double pricePerStatist = Double.parseDouble(scanner.nextLine());
        double sumDress = statist * pricePerStatist;

        double decor = filmPrice*0.1;
        if ( statist >= 150) {
            sumDress = sumDress * 0.9;

        }
        double totalPrice = decor + sumDress;
        double leftM = Math.abs(filmPrice-totalPrice);
        if(filmPrice >= totalPrice){
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.",leftM);
        }
        else {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.",leftM);
        }
    }
}


//public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double budget = Double.parseDouble(scanner.nextLine());
//        int statists = Integer.parseInt(scanner.nextLine());
//        double clothesPrice = Double.parseDouble(scanner.nextLine());
//
//        double decor = budget * 0.1; // декорът ни е 10% от общия бюджет
//        double allClothesPrice = statists * clothesPrice; // цената на всички дрехи за статистите
//
//        if (statists > 150) {
//            // allClothesPrice = allClothesPrice * 0.9;
//            allClothesPrice = allClothesPrice - (allClothesPrice * 0.1);
//        }
//        double totalSum = allClothesPrice + decor;
//
//        if (totalSum > budget) {
//            System.out.println("Not enough money!");
//            System.out.printf("Wingard needs %.2f leva more.", totalSum - budget);
//        } else {
//            System.out.println("Action!");
//            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalSum);
//        }