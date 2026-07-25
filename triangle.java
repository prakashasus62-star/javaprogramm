import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();

        if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
            System.out.println("Right");
        } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
            System.out.println("Obtuse");
        } else {
            System.out.println("Acute");
        }

        sc.close();
    }
}
