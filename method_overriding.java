//Runtime polymorphism
class Bank{
    int interest(){
        return 6;
    }
}
class UnionBank extends Bank{
    int interest(){
        return 8;
    }
}
class Axis extends Bank{
    int interest(){
        return 9;
    }
}
class State_Bank_Of_India extends Bank{
    int interest(){
        return 10;
    }
}
public class method_overriding {
    public static void main(String [] Phantom){
        Bank b= new Bank();
        System.out.println("Bank base interest : "+b.interest());
        State_Bank_Of_India s= new State_Bank_Of_India();
        System.out.println("Sbi interest Rate : "+s.interest());
        Axis A= new Axis();
        System.out.println("Axis Bank : "+A.interest());
        UnionBank u= new UnionBank();
        System.out.println("Union Bank : "+u.interest());
    }
}
