class Animal{
    //int id;
    void eat(){
        System.out.println("Eating....");
    }
}
class Neko extends Animal{
    void meow(){
        System.out.println("Meow Meow");
    }
}
class Orange extends Neko{
    void color(){
        System.out.println("Orange Cat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Bow Bow Bow ...");
    }
}
public class inheritance_concepts {
    public static void main(String[] phantom){
        //extends key word is used to use inheritance
        Orange x=new Orange();
        x.color();
        x.eat();
        x.meow();
        Dog dg=new Dog();
        dg.eat();
        dg.bark();
    }
}
