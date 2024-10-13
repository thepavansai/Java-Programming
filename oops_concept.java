import java.util.*;
import java.io.*;
class Account{
    double account_number;
    String name;
    float amount;
    void createAccount(double account_number,String name,float amount){
        this.account_number=account_number;
        this.amount=amount;
        this.name=name;
    }
    void deposit(float amt){
        amount+=amt;
    }
    void withdraw(float amt){
        if(amt>amount){
            System.out.println("Insufficient Funds.");
        }
        else{
            amount-=amt;
            System.out.println("Transaction Successful");
        }
    }
    void checkBalance( ){
        System.out.println("Available Funds: "+amount);
    }
    void display(){
        System.out.println("Name : "+name+"\tAcc Number : "+account_number+"\tFunds : "+amount);
    }
}
class Student{
    int id=0;
    String name="I'm Batman";
    void insert(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println("Name : "+id+"\tId : "+name);
    }
}
public class oops_concept {
    public static void main(String[] Phantom){
        /*
        Object any entity that has state and behaviour
        Class collection of objects
        Inheritance when one object acquires all the properties and behaviour of parent object
        Polymorphism performing same task in different ways
        Abstraction Hiding internal details and showing only functionalities only
        Encapsulation Binding code and data together
         */
        Student s=new Student();
        s.display();
        s.insert(9,"Phantom");
        s.display();
       // new Student().display(); Anonymous
        //System.out.println("\n");
        Account a=new Account();
        a.createAccount(698,"Phantom",6000);
        a.display();
        a.deposit(600);
        a.checkBalance();
        a.withdraw(6500);
        a.checkBalance();

    }
}
