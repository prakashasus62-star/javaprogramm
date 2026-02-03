import java .util.Scanner;
public class Basic {
    public static void main(String[] args){
        // System.out.println(Byte.MAX_VALUE);
        // System.out.println(Byte.MIN_VALUE);
        // int b=(int)90;
        // System.out.println(b);
        // int a=10;
        // int c=(a==b)?a:b;
        // System.out.println(c);
        // int day=4;
        // switch (day) {
        //     case 1:
        //         System.out.println("Momday");
        //         break;
        //         case 2:
        //             System.out.println("tuesday");
        //             break;
        //             case 3:
        //                 System.out.println("wednesday");
        //                 break;
        
        //     default:
        //         System.out.println("entha davum illa");
        //         break;
        // }
        // for(int i=1; i<=3; i++){
        //     for(int j=1; j<=5; j++){
        //         System.out.println(j);
        //     }
        // }

        // int sum=0;
        // for(int j=1; j<=3; j++){
        //     sum=sum+j;
        //     System.out.println(j);
           
        // }
        //  System.out.println(sum);
        // //  reverse programm
        // int num=122;
        // int rev=0;
        // while(num!=0){
        //     int rem=num%10;
        //     rev=rev*10+rem;
        //     num=num/10;
        // }
        // System.out.println(rev);
        // int num=5;
        // boolean isprime=true;
        // for(int i=2;i<=num-1;i++){
        //     if (num%i==0) {
        //         System.out.println("not a peime number");
        //         isprime=false;
        //         break;
                
        //     }
        // }
        // if(isprime==true){
        //     System.out.println("prime number");
        // }
        // int n1=2;
        // int n2=10;
        // int i,j;
        // for(i=n1; i<=n2; i++){
        //     for (j=2; j<=i; j++){
        //         if(i%j==0){
        //             break;
        //         }
        //     }
        //     if(i==j){
        //         System.out.println(j+"");
        //     }
        // // }
        // Scanner sc=new Scanner (System.in);
        // int n1=sc.nextInt();
        // int n2=sc.nextInt();
        // int i,j;
        // for (i=n1; i<=n2; i++){
        //     for(j=2; j<=i; j++){
        //         if(i%j==0){
        //             break;
        //         }
        //     }
        //     if(i==j){
        //         System.out.print(j+"");
        //     }
        // }
        // sc.close();
        // Scanner sc =new Scanner(System.in);
        // int num=sc.nextInt();
        // int perfect=0;
        // for(int i=1; i<=num/2; i++){
        //     if(num%i==0){
        //         perfect=perfect+i;
        //     }
        // }
        // if(perfect==num){
        //     System.out.println("perfect number");
        // }
        // else{
        //     System.out.println("not a perfect number");
        // }
        // sc.close();
        // Scanner sc= new Scanner(System.in);
        // int n=sc.nextInt();
        // for(int i=1; i<=n/2; i++){
        //     if(n%i==0){
        //         System.out.println(i);
        //     }
        // }
        // Amstrong number
        // Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        // int original=num;
        // int sum=0;
        // while(num>0){
        //     int digit=num%10;
        //     sum=sum+digit*digit*digit;
        //     num=num/10;
        // }
        // if(sum==original){
        //     System.out.println("Amstrong number");        }
        //     else{
        //         System.out.println("not a Amstrong number");
        //     }
        // //     sc.close();
        // Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        // int original=num;
        // int sum=0;
        // while(num>0){
        //     int digit=num%10;
        //     int fact=1;
        //     for(int i=1; i<=digit; i++){
        //         fact=fact*i;
        //     }
        //     sum=sum+fact;
        //     num=num/10;
        // }
        // if(sum==original){
        //     System.out.println("Strong number");

        // }
        // else{
        //     System.out.println("not a Strong number:");
        // }
        // sc.close(); 
        // fibnoacci series
        // int n=5;
        // int a=0,b=1;
        // for(int i=1; i<=n; i++){
        //     System.out.println(a+" ");
        //     int c=a+b;
        //     a=b;
        //     b=c;

        // }
        // sum
        //  Scanner sc=new Scanner (System.in);
        //  int num=sc.nextInt();
        //  int sum=0;
        //  while(num>0){
        //     int digit=num%10;
        //     sum=sum+digit;
        //     num=num/10;


        //  }
        //  System.out.println(sum);
        //  sc.close();
        // all digit 1 sum:
        int n=789;
        if(n==0){
            System.out.println(0);
        }
        else{
            int r=n%9;
            if(r==0){
                System.out.println(9);
            }
            else{
                System.out.println(r);
            }
        }
        }





        }
