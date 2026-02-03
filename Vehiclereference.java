package polymorphism;
class Vehicle{
    public void move() {
        System.out.println("my appa suggestion is no sec");
        
    }
}
class Tvs extends Vehicle{
    public  void move() {
        System.out.println("my amma suggestion is  new Tvs bike ");
        
    }
}
class Bike extends Tvs{
    public  void move() {
        System.out.println("my own suggestion is mT15 ");
        
    }
}


public class Vehiclereference {
public static void main(String[] args) {
        // Tvs c1=new Tvs();
        // c1.move();
        Bike d1=new Bike();
        d1.move();
    
    
}
}
