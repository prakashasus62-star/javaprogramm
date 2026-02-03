import java.util.Scanner;
class sample{
    public static void main(String[] args){
        // Scanner dc=new Scanner(System.in);
        // int n=dc.nextInt();
        // if(n==0){
        //     System.out.println(0);
        // }
        // else{
        //     int r=n%9;
        //     if(r==0){
        //         System.out.println(9);
                

        //     }
        //     else{
        //         System.out.println(r);
        //     }
        // }
        // Scanner sc=new  Scanner (System.in);
        // int n=sc.nextInt();
        // int original=n;
        // int rev=0;
        // while(n!=0){
        //     int digit=n%10;
        //     rev=rev*10+digit;
        //     n=n/10;
        // }
        // if(original==rev){
        //     System.out.println("Palindrome");

        // }
        // else{
        //     System.out.println("Not a palindrome");
        // }
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int original = n;   // store original number
int rev = 0;

while (n != 0) {
    int digit = n % 10;
    rev = rev * 10 + digit;
    n = n / 10;
}

if (original == rev) {
    System.out.println("Palindrome");
} else {
    System.out.println("Not a palindrome");
}


    }
}