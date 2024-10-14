class Human{

}
class Logan extends Human{
    static void call(Human x){
        if( x instanceof Logan){
            Logan p= (Logan)x;//Down Casting
            System.out.println("Down Casting is done");
        }
    }
}
public class Down_casting_with_instanceof {
    public static void main(String [] batman){
        Human w= new Logan();
        Logan.call(w);
    }
}
