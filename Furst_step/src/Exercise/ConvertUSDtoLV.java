package Exercise;

import java.util.Scanner;

public class ConvertUSDtoLV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        double lv = usd *1.79549;

        System.out.println(lv);


    }
}
