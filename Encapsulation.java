class Atm {
    private int Atmid;
    private String Location;
    public void setatmid(int Atmid){
        this.Atmid=Atmid;

    }
    public int getatmid(){
        return Atmid;
        

    }
    public void setLocation(String Location){
        this.Location=Location;

    }
    public String getLocation(){
        return Location;
        

    }
    
    
}
public class Encapsulation {
    public static void main(String[] args) {
        Atm s1=new Atm();
        s1.setatmid(123);
        System.out.println(s1.getatmid());
        s1.setLocation("Sankagiri R.s");
        System.out.println(s1.getLocation());
    }
}
