import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        int countNoshuvka = Integer.parseInt(scanner.nextLine());
        int countTranstort = Integer.parseInt(scanner.nextLine());
        int countMuzei = Integer.parseInt(scanner.nextLine());

        int noshPerson = 20;
        double tranPerson = 1.60;
        int muzPerson = 6;

        int allNosh =  countNoshuvka * noshPerson;
        double allKarti = countTranstort * tranPerson;
        double allmuzei = countMuzei * muzPerson;

        double totalGroup = allNosh + allKarti +allmuzei;
        double allGroup = countPeople * totalGroup;

        double moreRazhodi = allGroup + (allGroup * 0.25);

        System.out.printf("%.2f",moreRazhodi);


    }
}
