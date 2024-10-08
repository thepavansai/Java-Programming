package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_Op {
    public static void main(String[] args){
        //Key Value Pairs hashmap
        //Hash Map Implements Map Interface
        //values can be duplicated but not keys

        HashMap<Integer,String> hm= new HashMap<Integer,String>();
        //put method
        hm.put(145,"Phantom");
        hm.put(123,"Random");
        hm.put(135,"Phantom");
        System.out.println(hm);
        System.out.println(hm.size());
        hm.remove(123);//based on key
        System.out.println(hm);
        System.out.println(hm.get(1345));
        System.out.println(hm.keySet());//Only keys
        System.out.println(hm.values());//Only Values
        System.out.println(hm.entrySet());//Both Keys and Values
       // Iterator it= new hm.itrator();
        for(Object x:hm.keySet()){
            System.out.println(x+"  "+hm.get(x));
        }
        Iterator<Map.Entry<Integer, String>> it= hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> x= it.next();
            System.out.println(x.getKey()+"  "+x.getValue());
        }
        //Clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
