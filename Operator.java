public class Operator {
    public static void main(String [] pavan){
        int x=9;
        System.out.println(x+++"\t"+x+"\t"+ ++x +"\t"+ --x);
        int xy=15;
        boolean y=true;
        System.out.println(~xy +"\t"+!y+"\n"+y);
        int a=9, b=2;
        System.out.println("a=9, b=2 \n"+ (a+b) + "\t "+( a-b )+ "\t"+a*b+"\t"+(a%b)+"\t"+(a/b));
        System.out.println(10<<2);
        System.out.println(1024>>8);
        System.out.println(18 & 6);
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println(true || false);
        System.out.println(3 | 2);
        System.out.print((2>5)?9:0);
        //adding short
        short i=9;
        short u=34;
        short px=(short)(i+u);
        System.out.println(px);
    }
}
