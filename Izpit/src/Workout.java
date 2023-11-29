import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOFTraining = Integer.parseInt(scanner.nextLine());
        double km = Double.parseDouble(scanner.nextLine());
        int sum =0 ;
        double currentKm = km;
        for (int i = 0 ; i < daysOFTraining;i++)
        {
            int  percent = Integer.parseInt(scanner.nextLine());
            km  = km + km*(percent/100.0);
            currentKm += km;
        }

        if (currentKm >=1000){
            double diff =Math.abs(currentKm-1000);
            System.out.printf("You've done a great job running %.0f more kilometers!",Math.ceil(diff));

        }
        else {
            double diff =Math.abs(currentKm-1000);
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers",Math.ceil(diff));

        }
    }


}
