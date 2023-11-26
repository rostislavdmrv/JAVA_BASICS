package Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSec = Double.parseDouble(scanner.nextLine());

        double result = distance * timeInSec; // общия резултат на Иван
        double slowDown = Math.floor(distance / 15) * 12.5; // забавяне - на всеки 15м той губи 12.5сек.

        double finalResult = result + slowDown; // финален резултат - общ резултат на Иван + забавянето

        if (finalResult < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalResult);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(record - finalResult));
        }
    }
}
