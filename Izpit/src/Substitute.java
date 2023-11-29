import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean flag = true;

        for (int i = K; i <= 8; i++) {
            for (int j = 9; j >= L; j--) {
                for (int k = M; k <= 8 ; k++) {
                    for (int l = 9; l >= N; l--) {
                        boolean check = i % 2 == 0 && k % 2 == 0 && l % 2 != 0 && j % 2 != 0;

                        int firstCol = i * 10 + j;
                        int secondCol = k * 10 + l;

                        if(check && firstCol == secondCol){
                            System.out.println("Cannot change the same player.");
                        }
                        else if(check && firstCol != secondCol){
                            System.out.printf("%d%d - %d%d%n", i, j, k, l);
                            counter++;
                        }
                        if(counter >= 6){
                            flag = false;
                        }
                        if(!flag){
                            break;
                        }
                    }
                    if(!flag){
                        break;
                    }
                }
                if(!flag){
                    break;
                }
            }
            if(!flag){
                break;
            }
        }
    }
}
