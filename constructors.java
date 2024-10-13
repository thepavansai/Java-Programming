import java.util.*;
import java.io.*;
class Cat{
    static int noofcats=0;
    String name;
    String sound;
    Cat(){
        System.out.println("Cat Constructor is called");
        noofcats++;
    }
    Cat(String name){
        this();
        this.name=name;
        System.out.println(name);
    }
    Cat(String name, String sound){
        this(name);
        this.sound=sound;
        System.out.println(sound);

    }
    static void soundd(){//No need for creation of class object
        System.out.println("Meow Meow");
    }
    Cat(Cat cati) {
        this();//call default constructor
        sound = cati.sound;
        name = cati.name;
        System.out.println("Copy Constructor is called");
        //noofcats++;
    }
}
public class constructors {
    static{System.out.println("static block is invoked");}
    public static void main(String [] Phantom){
       Cat i= new Cat();
       Cat h=new Cat();
       Cat b= new Cat(i);
       Cat.soundd();
       Cat x= new Cat("Neko","Kyon-kyon");
       System.out.println(Cat.noofcats);
    }
}
