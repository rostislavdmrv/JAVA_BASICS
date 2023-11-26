package Exercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // прочитаме цяло число от конзолата
        int num = Integer.parseInt(scanner.nextLine());

        // създавам си променлива, която да пази бонуса
        double bonus = 0.0;

        // проверка в кой интервал се намира нашето число
        if (num <= 100) {
            bonus = 5;
        } else if (num > 1000) {
            bonus = num * 0.1; // 10% = 0.1
        } else { // числото да е по-голямо от 100 и по-малко от 1000
            bonus = num * 0.2;
        }

        // изчисляване на допълнителни бонус точки
        if (num % 2 == 0) { // проверка за четно число
            bonus = bonus + 1; // bonus += 1;
        } else if (num % 10 == 5) { // числото след == е нашият остатък или това, на което искаме числото да завърши
            bonus = bonus + 2;
        }

        // извеждаме бонус точките и бонус точките + числото
        System.out.println(bonus);
        System.out.println(num + bonus);


    }
}
