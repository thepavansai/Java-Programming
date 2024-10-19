package Array;
class test {
    static void min(int []x){
        int m=x[0];
        for(int i=0;i<x.length;i++){
            if(m>x[i]){
                m=x[i];
            }
        }
        System.out.println(m);
    }
    static void fill(int [][] multi,int x){
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                multi[i][j] = (i + j) * x;
            }
        }
    }
    static void print(int[][] multi){
        for(var u: multi){
            for(var k:u){
                System.out.print(k+"\t");
            }
            System.out.println();
        }
    }
}

public class arrayss {
    public static void main(String[] Pavan){
    //int []inte=new int[10];
        int []inte={17,2,34,42,25,16};
        for(int x :inte) {
            System.out.print(x + "\t");
        }
        System.out.println();
        test.min(inte);
        //System.out.println();
        int [][] multi= new int[2][2];
        test.fill(multi,5);
        test.print(multi);
        //Jagged array
        System.out.println();
        int[][] jg= new int[3][];
        jg[0]= new int[7];
        jg[1]= new int[4];
        jg[2]= new int[5];
        test.fill(jg,6);
        test.print(jg);

    }
}
