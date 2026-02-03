
package polymorphism;
class Animal{
    public void sound() {
        System.out.println("brks");
        
    }
}
class Dog extends Animal{
    public void sound() {
        System.out.println("brks");
        
    }
}
class   Cat extends Dog{
    public  void sound() {
        System.out.println("meow");
        
    }
}


public class Dogref {
    public static void main(String[] args) {
        Animal a;
        a=new Dog();
        a.sound();


    }
    
    
}
