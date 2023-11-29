package exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double changeInLeva = Double.parseDouble(scanner.nextLine());
        double changeInSt =  Math.round(changeInLeva * 100);
        int countCoins = 0;

        while (changeInSt > 0){
            if (changeInSt >= 200) { // = 2лв.
                changeInSt -= 200;
                countCoins++;
            } else if (changeInSt >= 100) { // = 1лв.
                changeInSt -= 100;
                countCoins++;
            } else if (changeInSt >= 50) { // = 50ст.
                changeInSt -= 50;
                countCoins++;
            } else if (changeInSt >= 20) { // = 20ст.
                changeInSt -= 20;
                countCoins++;
            } else if (changeInSt >= 10) { // = 10ст.
                changeInSt -= 10;
                countCoins++;
            } else if (changeInSt >= 5) { // = 5ст.
                changeInSt -= 5;
                countCoins++;
            } else if (changeInSt >= 2) { // = 2ст.
                changeInSt -= 2;
                countCoins++;
            } else if (changeInSt >= 1) { // = 1ст.
                changeInSt -= 1;
                countCoins++;
            }
        }
        System.out.println(countCoins);
    }
}
