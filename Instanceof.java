interface Supreme{}
class Mini implements Supreme{
    public void min(){
        System.out.println("Mini's Method");
    }
}
class Pro implements Supreme{
    public void proo(){
        System.out.println("Pro's Method");
    }
}
class Pulli{
    void makei(Supreme x){
        if(x instanceof Mini){
            //x.min();
            Mini m=(Mini)x;
            m.min();
        }
        if(x instanceof Pro){
            Pro p= (Pro)x;
            p.proo();
        }
    }
}
public class Instanceof {
    public static void main(String [] phantom){
        Supreme sp= new Pro();
        Pulli p= new Pulli();
        p.makei(sp);
        Supreme s= new Mini();
        p.makei(s);
    }

}
