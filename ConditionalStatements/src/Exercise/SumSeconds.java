package Exercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // трите времена на тримата спортисти
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        // сумираме времето им в секунди
        int sum = first + second + third;

        // намираме минутите и секундите от сумираното време в секунди
        int min = sum / 60; // сумата от секунди разделям на 60, за да видя колко са минутите
        int sec = sum % 60;

        // минути:секунди
        if (sec < 10) {
            System.out.printf("%d:0%d", min, sec);
        } else {
            System.out.printf("%d:%d", min, sec);
        }


    }
}
