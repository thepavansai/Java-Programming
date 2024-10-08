package Collections;

import java.util.*;


public class HS_Operations {
    public static void main(String[] args){
        HashSet<String> my_set= new HashSet<String>();
        my_set.add("Hi");
        my_set.add("hello");
        my_set.add("Hi");
        my_set.add(null);
        my_set.add("69");
        my_set.add("Pavan");
        System.out.println(my_set);
        my_set.remove("69");
        System.out.println("HashSet uses value as arg in remove function \nInsertion is not possible in hash set as No indexing in Set Collections,i.e get , insert are not possible.\n"+my_set);
        //Converting in ArrayList is one way to insertion
        ArrayList<String> aset= new ArrayList<String>(my_set);
        System.out.println(aset);
        aset.set(0,"Phantom");
        System.out.println(aset);
        for(Object x:my_set){
            System.out.print(x+"\t");
        }
        Iterator it=my_set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(my_set.size());
        my_set.clear();
        System.out.println(my_set);


    }
}
