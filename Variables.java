public class Variables {
    public static void main(String [] args){
        int x;//declaration
        x=69;//assignment;
        int y=96;//declaration + Assignment;
        int z=89,p=67;//same datatype multiple variables
        System.out.println(x+" "+y+" "+" "+z+" "+p);
        //Primitive data types byte,short,int, long without decimal
        //with decimal float,double
        //char for single character
        //boolean true/false
        //Non-Primitive String ArrayList HashMap Hashset
        byte by=127;
        short sh=3277;
        int it=327779;
        long li=123456789L;
        float fi=0.97f;
        double db=7.89;
        char ch='A';
        String str="Pavan";
        boolean b=true;
        System.out.println(by+"\t"+sh+"\t"+it+"\t"+li);
        System.out.println(fi+"\t"+ch+"\t"+db);
        System.out.println(str+"\t"+b);
        //Statically typed
        char i='\u0000';
        System.out.println("Overflow when Narrowing: "+(byte)sh+"\t"+i);

    }
}
