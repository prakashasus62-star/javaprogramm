public class Bankaccount {
    private String balance;
    private double withdraw;
    public void setbalance(String balance){
        this.balance=balance;

    }
    public String getbalance(){
        return balance;
    }
    public void setwithdraw(double withdraw){
        this.withdraw=withdraw;
    }
    public double getwithdraw(){
        return withdraw;
    }
    public static void main(String[] args) {
        int minimumbalance=0;
        if (minimumbalance<1) {
            
        System.out.print("depositemoney");
        }
        Bankaccount s1=new Bankaccount();
        s1.setbalance("5000");
        System.out.println(s1.getbalance());
        int balanceok=5000;
        if (balanceok>3000) {
            
        System.out.print("withdrawmoney");
        }
        s1.setwithdraw(3000);
        System.out.println(s1.getwithdraw());
        double balance=2000;
        if (balance==2000) {
            System.out.println("currentbalnce"+balance);
            
        }
    }
    
    
}
class Parent{
    String name;
    int age;
    public static void imp(String name,int age) {
        this.name=name;
        this.age=age;

        
    }
}
class child extends Parent{
    String person;
    double rollnum;
    public static void imp2(String person,double rollnum ) {
        this.person=person;
        this.rollnum=rollnum;
        
    }
}
class s1{
    public static void main(String[] args) {
        child d1=new child();
    }
}
