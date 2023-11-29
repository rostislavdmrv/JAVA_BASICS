import java.util.Scanner;

public class cut {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int goals = Integer.parseInt(scanner.nextLine());
    int money = 0;
    while (money < goals) {
        String command = scanner.nextLine();
        if (command.equals("closed"))
        {
            break;
        }
        else {
            if (command.equals("haircut")) {
                String underComm = scanner.nextLine();
                if (underComm.equals("mens")) {
                    money += 15;

                } else if (underComm.equals("ladies")) {
                    money += 20;

                } else if (underComm.equals("kids")) {
                    money += 10;
                }
            } else if (command.equals("color")) {
                String deistie = scanner.nextLine();
                if (deistie.equals("touch up")) {
                    money += 20;

                } else if (deistie.equals("full color")) {
                    money += 30;
                }

            }
            command = scanner.nextLine();
        }


    }
    if (money >= goals) {
        System.out.printf("You have reached your target for the day!%n");
    } else {
        int diff = Math.abs(money - goals);
        System.out.printf("Target not reached! You need %dlv. more.%n", diff);

    }
    System.out.printf("Earned money: %dlv.", money);

}
}
