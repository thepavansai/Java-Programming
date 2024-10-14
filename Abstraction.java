abstract class Toyota{
    Toyota(){
        System.out.println("Toyota Group");
    }
    abstract void top_speed();//we cannot use if class is not abstract
}
class Supra extends Toyota{
    void top_speed(){
        System.out.println("Speed of Supra: 312 Mph");
    }

}
class Lexus extends Toyota{
    void top_speed(){
        System.out.println("Lexus speed: 125Mph");
    }//either implement parent abstract method or make class abstract
}
public class Abstraction {
    public static void main(String[] args){
        Supra xs= new Supra();
        xs.top_speed();
        Lexus lx= new Lexus();
        lx.top_speed();
    }
}
/*
    Class must be abstract if methods  of class or abstract and not vice versa.
    Either implement method in subclass or make class abstract
 */