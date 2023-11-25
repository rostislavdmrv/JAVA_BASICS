package Exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //найлон, боя, разредител, торбички, майстори

        //1. входни данни
        //2. сума за найлон = (количество найлон + 2) * цена на найлон (1.50)
        //3. сума за боя =  (количество боя + 10%) * цена на боя (14.50)
        //4. сума за разредител = количество разредител * цена на разредителя (5.00)
        //5. сума за торбички = 0.40
        //6. сума за материали = сума за найлон + сума за боя + сума за разредител + сума за торбички
        //7. сума за майстори = часове работа * цена за 1 час (30% от сумата за материали)
        //8. обща сума = сума за материали + сума за майстори
        //печатаме обща сума

        int quantityNylon = Integer.parseInt(scanner.nextLine());
        int quantityPaint = Integer.parseInt(scanner.nextLine());
        int quantityDiluent = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double sumNylon = (quantityNylon + 2) * 1.50;
        double sumPaint = (quantityPaint + 0.1 * quantityPaint) * 14.50;
        double sumDiluent = quantityDiluent * 5.00;
        double sumBags = 0.40;

        double sumMaterials = sumNylon + sumPaint + sumDiluent + sumBags;
        double sumWorkers = hours * (0.3 * sumMaterials);
        double totalSum = sumMaterials + sumWorkers;
        System.out.print(totalSum);
    }
}
