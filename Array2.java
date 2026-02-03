import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = 0;
        if (s1.hasNextInt()) {
            size = s1.nextInt();
        } else {
            System.out.println("Invalid size! Please enter an integer.");
            return;
        }

        int[] arr = new int[size];
        int sum = 0;

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (s1.hasNextInt()) {
                arr[i] = s1.nextInt();
            } else {
                System.out.println("Invalid input! Only integers allowed.");
                return;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                sum = sum + arr[i];
            }
        }

        System.out.println("Sum of odd index elements = " + sum);
        s1.close();
    }
}
