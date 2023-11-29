package exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volume = width * length * height; 

        String input = scanner.nextLine(); // или команда Done или число, което отговаря на моите кутии
        while (!input.equals("Done")){
            int boxes = Integer.parseInt(input); // парсвам към int и това са моите кутии
            volume -= boxes;
            if (volume <= 0) {
                break;
            }
            input = scanner.nextLine();
        }
        if (volume <= 0){
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
        } else {
            System.out.printf("%d Cubic meters left.", volume);
        }

    }
}
