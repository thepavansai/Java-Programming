import java.time.*;
interface mclaren{
    void model();
    default void msg(){
        System.out.println("McLaren default method");
    }
    static LocalDateTime LTime(){
        return LocalDateTime.now();
    }
}
interface Car{
    void type();
}
class My_car implements Car, mclaren{
    public void type(){
        System.out.println("Car");
    }
    public void model(){
        System.out.println("2023 McLaren Artura");
    }
}
public class Interfaces {
    public static void main(String [] args){
    My_car mc= new My_car();
    mc.type();
    mc.msg();
    mc.model();
    System.out.println(mclaren.LTime());
    }
}

/*
    Interface with no member marker/tagged Interface.
    only abstract methods ,default, static
    multiple inheritance
    only static and final variables

 */