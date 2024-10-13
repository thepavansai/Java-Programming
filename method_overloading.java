class Mathematics{
    int sum(int a, int b){
        return a+b;
    }
    double sum(double a, double b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
public class method_overloading {
    public static void main(String [] Phantom){
        //changing no of arguments
        //changing data types
        //not possible by changing return type
        Mathematics m= new Mathematics();
        System.out.println("Sum of int 7 ,9 : "+m.sum(7,9));
        System.out.println("Sum of double 8.9,9.6 : "+m.sum(8.9,9.6));
        System.out.println("Sum of int 8,6,3 : "+m.sum(8,6,3));

    }
}
