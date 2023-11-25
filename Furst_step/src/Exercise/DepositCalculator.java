package Exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int time =Integer.parseInt(scanner.nextLine());
        double  interest = Double.parseDouble(scanner.nextLine());

        double all_interest = depositSum * (interest/100);
        double forOneYear = all_interest/12;
        double price = depositSum + (time * forOneYear);

        System.out.println(price);
    }
}
