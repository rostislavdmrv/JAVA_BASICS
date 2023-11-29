import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String sezon = scanner.nextLine();
        double nosh =0;
        double total = 0;
        switch (sezon){
            case "spring":
                if (countPeople <= 5){
                    nosh = 50;
                    total = nosh * countPeople;

                }
                else{
                    nosh = 48;
                    total = nosh * countPeople;
                }
                break;
            case "summer" :
                if (countPeople <= 5){
                    nosh = 48.50;
                    total = (nosh * countPeople)*0.85;

                }
                else{
                    nosh = 45;
                    total = (nosh * countPeople)*0.85;
                }
                break;
            case "winter" :
                if (countPeople <= 5){
                    nosh = 86;
                    total = (nosh * countPeople)*1.08;

                }
                else{
                    nosh = 85;
                    total = (nosh * countPeople)*1.08;
                }
                break;
            case "autumn":
                if (countPeople <= 5){
                    nosh = 60;
                    total = nosh * countPeople;
                }
                else{
                    nosh = 49.50;
                    total = nosh * countPeople;
                }
                break;
        }
        System.out.printf("%.2f leva.",total);
    }
}
