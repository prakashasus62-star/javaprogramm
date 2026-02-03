public class circle {
    double radius;
    public circle(double radius){
        this.radius=radius;

    }
    class circles{
        public static void diameter(circle obj) {
            System.out.println(obj.radius*obj.radius);

            
        }


    }
    public class Innercircle {
    public static void main(String[] args) {
        circle d1=new circle(10);
        circles.diameter(d1);
    
        
    }
    }
}

