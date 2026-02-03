public class engine {
    int hp;
    public engine(int hp){
        this.hp=hp;
        
    }
}
class car{
    engine e1=new engine(10);
    
    }
class cardriver{
    public static void main(String[] args) {
        car c1=new car();
        System.out.println(c1.e1.hp);

}
}
