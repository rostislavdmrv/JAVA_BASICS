package ForLoopExercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWasher = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        int countToys = 0;
        double savedMoney = 0;
        double giftSum = 0;

        for (int birthday = 1; birthday <= age; birthday++) {
            if (birthday % 2 == 0) {
                giftSum += 10;
                savedMoney += giftSum - 1;
            } else {
                countToys++;
            }
        }
        double totalSum = (countToys * pricePerToy) + savedMoney;

        if (totalSum >= priceWasher) {
            double leftMoney = totalSum - priceWasher;
            System.out.printf("Yes! %.2f", leftMoney);
        } else {

            double needMoney = priceWasher - totalSum;
            System.out.printf("No! %.2f", needMoney);
        }
    }
}
