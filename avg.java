import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int mark = sc.nextInt();
            sum += mark;
        }

        double average = (double) sum / n;

        System.out.printf("%.2f", average);

        sc.close();
    }
}
