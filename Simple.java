import java.util.Scanner;
public class Simple {
    public static void main(String[] args){
        // Amstrong number
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int original=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            int fact=1;
            for(int i=1; i<=digit; i++){
                fact=fact*i;

            }
            sum=fact+sum;
            num=num/10;
        }
        if(sum==original){
            System.out.println("Strong number");
        }
        else{
            System.out.println("not a amstrong number");
        }

        }
    }
    

