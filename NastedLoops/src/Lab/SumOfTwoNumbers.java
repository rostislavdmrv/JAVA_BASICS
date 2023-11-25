package Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        boolean isValidComb = false;
        int count = 0;
        for (int i = start; i <= end; i++) {// za purvoto chislo
            for (int j = start; j <= end; j++) { // za vtoroto chislo
                count++;
                int sum = i + j;
                if (sum == magicNum) {
                    System.out.printf("Combination N:%d ", count);
                    System.out.printf("(%d + %d = %d)%n", i, j, magicNum);
                    isValidComb = true;
                    break;
                }
            }
            if (isValidComb){
                break;
            }
        }

        if (!isValidComb) {
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }
    }
}
