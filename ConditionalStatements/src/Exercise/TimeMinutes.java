package Exercise;

import java.util.Scanner;

public class TimeMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int totalMin = hour * 60 + min + 15; // превръщаме часовете в минути, прибавяме минутите и отделно още 15мин.

        hour = totalMin / 60; // от всички минути намираме часовете с целочислено деление
        min = totalMin % 60; // от всички минути намираме останалите минути

        if (hour > 23) { // ако часът е по-голям от 23, става равен на 0
            hour = 0;
        }

        System.out.printf("%d:%02d", hour, min); // Печатането на резултата с водеща нула може да се осъществи и чрез шаблона %02d,
        // чрез който можем да покажем, че искаме нашето число да се състои от две цифри

        // if (minutes < 10){
        //    output = String.format("%d:0%d",hour,minutes);
        //}else {
        //    output = String.format("%d:%d",hour,minutes);
        //}
    }
}
