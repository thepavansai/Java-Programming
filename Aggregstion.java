class Address{
    String city, state, country;
    Address(String city ,String state,String country){
        this.city=city;
        this.state=state;
        this.country=country;
    }
}
class Person{
    int ssn;
    String name;
    Address address;
    Person(int ssn,String name,Address address){
        this.ssn=ssn;
        this.name=name;
        this.address=address;
    }
    void disp(){
        System.out.println("SSN : "+ssn+"\tName : "+name+"\nCity : "+address.city+"\tState : "+address.state+"\tCountry : "+address.country);
    }
}
public class Aggregstion {
    public static void main(String [] pavan){
        Address a= new Address("Los Vegas","Los Angeles","United States");
        Person p= new Person(6969,"Man of Steel",a);
        p.disp();
    }
}
