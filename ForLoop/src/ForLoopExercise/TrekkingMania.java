package ForLoopExercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfGroups = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= numberOfGroups ; i++) {
            int numberOfPeopleInGroup = Integer.parseInt(scanner.nextLine());

            if (numberOfPeopleInGroup <= 5) {
                musala += numberOfPeopleInGroup;

            } else if (numberOfPeopleInGroup <= 12) {
                monblan += numberOfPeopleInGroup;

            }else if (numberOfPeopleInGroup <= 25) {
                kilimandjaro += numberOfPeopleInGroup;

            }else if (numberOfPeopleInGroup <= 40) {
                k2 += numberOfPeopleInGroup;

            }else if (numberOfPeopleInGroup  > 40) {
                everest += numberOfPeopleInGroup;


            }
        }
        int totalPeople = musala + monblan + kilimandjaro + k2 + everest;
        System.out.printf("%.2f%%%n", (musala * 1.00/ totalPeople) * 100);
        System.out.printf("%.2f%%%n",  (monblan * 1.00/ totalPeople) * 100);
        System.out.printf("%.2f%%%n", (kilimandjaro * 1.00/ totalPeople) * 100);
        System.out.printf("%.2f%%%n", (k2 * 1.00 / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (everest * 1.00 / totalPeople) * 100);
    }
}
