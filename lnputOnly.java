import java.util.Scanner;

public class lnputOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // String input
        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.println("You entered number: " + num);
        System.out.println("You entered name: " + name);

        sc.close();
    }
}
