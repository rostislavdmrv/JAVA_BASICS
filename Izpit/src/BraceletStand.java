import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        final int N = 5;

        Scanner scanner = new Scanner(System.in);
        double gjobni = Double.parseDouble(scanner.nextLine());
        double moneyPerDay = Double.parseDouble(scanner.nextLine());
        double razhodiZaCeliaPeriod = Double.parseDouble(scanner.nextLine());
        double pricePresent = Double.parseDouble(scanner.nextLine());

        double spesteniPari = N * gjobni;
        double speceleniPari = N * moneyPerDay;
        double allSpesteni = spesteniPari+speceleniPari;
        double razhodi = allSpesteni -razhodiZaCeliaPeriod;

        if(razhodi>pricePresent){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.",razhodi);
        }
        else{
            double diff = Math.abs(razhodi-pricePresent);
            System.out.printf("Insufficient money: %.2f BGN.",diff);
        }




    }
}
