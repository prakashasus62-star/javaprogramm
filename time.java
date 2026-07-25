import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String time = sc.next();
        String[] t = time.split(":");

        int hour = Integer.parseInt(t[0]);

        if (hour >= 12) {
            System.out.println("PM");
        } else {
            System.out.println("AM");
        }
    }
}
