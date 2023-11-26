package Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double exPrice = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll= Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());
        double totalSum = 0.0;

        int toysCount = puzzle + doll + bear + minions + truck;
        double sum = puzzle * 2.60 + doll * 3 + bear * 4.10 + minions * 8.20 + truck * 2;

        if (toysCount >= 50) {
            totalSum = sum - (sum *0.25);
            totalSum = totalSum - (totalSum*0.1);
            //sum = sum * 0.75; // sum = sum - (sum * 0,25);
        }
        else {
            totalSum= sum -(sum*0.1);//sum = sum * 0.9; // sum = sum - (sum * 0.10);
        }

        double leftM = Math.abs(exPrice-totalSum);
        if (totalSum >= exPrice) {
            System.out.printf("Yes! %.2f lv left.",leftM);
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.",leftM);
        }
    }
}
//Scanner scanner = new Scanner(System.in);
//
//        double exPrice = Double.parseDouble(scanner.nextLine());
//        int puzzles = Integer.parseInt(scanner.nextLine());
//        int dolls = Integer.parseInt(scanner.nextLine());
//        int bears = Integer.parseInt(scanner.nextLine());
//        int minions = Integer.parseInt(scanner.nextLine());
//        int trucks = Integer.parseInt(scanner.nextLine());
//
//        // пъзел - 2.60 , кукла - 3, мече - 4,10, миньон - 8.20 , камионче - 2
//        // пресмятаме общия брой на всички играчки
//        int toysCount = puzzles + dolls + bears + minions + trucks;
//        // пресмятаме общата сума на играчките
//        double sum = puzzles * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2;
//
//        // проверяваме дали бройката на играчките е по-голяма от 50
//        if (toysCount >= 50) {
//            sum = sum * 0.75; // sum = sum - (sum * 0,25);
//        }
//        // пресмятаме наема, който ни е 10% от сумата
//        sum = sum * 0.9; // sum = sum - (sum * 0.10);
//
//        if (exPrice <= sum) {
//            System.out.printf("Yes! %.2f lv left.", sum - exPrice);
//        } else {
//            System.out.printf("Not enough money! %.2f lv needed.", exPrice - sum);
//        }