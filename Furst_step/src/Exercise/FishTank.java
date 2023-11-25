package Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни - OK
        //2. обем в куб. см = дължина * ширина * височина
        //3. преобразуваме обема от куб.см в литри -> куб. см / 1000 или куб. см * 0.001
        //4. колко литра са нужни = обем в литри *  % свободно пространство

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volumeCm = length * width * height;
        double volumeLiters = volumeCm * 0.001;
        double needLiters = volumeLiters * (1 - percent / 100.0);
        System.out.println(needLiters);
    }
}
