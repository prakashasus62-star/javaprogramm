class Prakash{
    public void married(){
        System.out.println("married no k");
    }

}
class Prakashson extends Prakash {
    public void married(){
        System.out.println("i Married only k");
    }
}
public class Methodoverriding {
    public static void main(String[] args) {
        Prakashson s1=new Prakashson();
        s1.married();
    }

}
