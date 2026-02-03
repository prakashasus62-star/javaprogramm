// public class constructor {
//     String name;
//     int age;
//     public constructor(){
//         System.out.println("not value");

//     }
//     public constructor(String name){
//         this.name=name;

//     }
//     public constructor(String name,int age){
//         this.name=name;
//         this.age=age;

//     }
//     public static void main(String[] args) {
//         constructor s1=new constructor();
//         // constructor s2=new constructor("pk");
//         // System.out.println(s2.name);
//         constructor s3=new constructor("prakash",19);
//         System.out.println(s3.name);
//         System.out.println(s3.age);     
        
//     }
    
// }
public class constructor {
    String name;
    int salary;
    public constructor(){
        System.out.println("not value");

    }
    public constructor(String name){
        this.name=name;

    }
        public constructor(String name,int salary){
        this(name);
        this.salary=salary;

    }
    public static void main(String[] args) {
        constructor s1=new constructor();
        constructor s3=new constructor("prakash",19);
        System.out.println(s3.name);
        System.out.println(s3.salary);
        
    }
    


    
}
