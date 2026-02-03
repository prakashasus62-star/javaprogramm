import java.util.*;
import java.time.LocalTime;
import java.time.Duration;
public class Time {
    public static void main(String[] args) {
        Scanner d1=new Scanner(System.in);
        String start=d1.nextLine();
        String end=d1.nextLine();
        LocalTime startime=LocalTime.parse(start);
        LocalTime endTime=LocalTime.parse(end);
        Duration duration=Duration.between(startime, endTime);
        Long hours=duration.toHours();
        Long mini=duration.toMinutes();
        System.out.println(hours);
        System.out.println(mini);
        d1.close();



        


    }
    
}
