import java.util.*;

public class Control_statements {
   static void oper(int a, int b,char ch){
        int v=0;
        if(ch=='+'){
            v=a+b;
        }
        else if(ch=='-'){
            v=a-b;
        }
        else if(ch=='/'){
            v=a/b;
        }
        else if(ch == '%'){
            v=a%b;
        }
        System.out.println(v);
    }
    public static void main(String[] Pavan){
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x and y values.");
        x=sc.nextInt();
        y= sc.nextInt();
        System.out.println("Enter + ,-,% ,/");
        char ch;
        ch=sc.next().charAt(0);
        //int a=x,b=y;
        oper(x,y,ch);
        int c;
        System.out.println("Enter the 1 to continue 0 exit else show default behaviour.");
        c=sc.nextInt();
        switch (c){
            case 1:
                oper(x,y,'+');
                break;
            case 0:
                System.exit(1);
                break;
            default:
                System.out.println("Default");

        }

        sc.close();

    }
}
