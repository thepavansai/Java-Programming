package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListOP {
    public static void main(String[] args){
        //String sy;
        //sy="Heterogeneous Array List Declarations"+"\nArrayList y=new ArrayList();"+"\nList myl= ArrayList();";
        Scanner sc= new Scanner(System.in);
        //System.out.println("Hello World");
        //System.out.println(sy+"\nEnter String:  ");

       // String st= sc.nextLine();
       //String [] x= st.split(" ");
        //ArrayList<String> s= new ArrayList<>(Arrays.asList(st.split(" ")));
       // System.out.println(s);
        ArrayList<Integer> my_list = new ArrayList<>();
        //Adding Data
        my_list.add(10);
        my_list.add(69);
        my_list.add(13);
        my_list.add(null);
        my_list.add(45);
        my_list.add(80);
        my_list.add(450);
        System.out.println("Array List data : "+ my_list);
        System.out.println("ArrayList size: "+ my_list.size());
        my_list.remove(4);//passing index to remove
        System.out.println("Removed element at 0 \nArray List data : "+ my_list);
        System.out.println("ArrayList size: "+ my_list.size()+"\nEnter Element to add :");

        //int new_i = sc.nextInt();
        //my_list.add(5, new_i);
        System.out.println("Array List data : "+ my_list);
        System.out.println("ArrayList size: "+ my_list.size());
        my_list.removeIf(n->n==null);//filter
        System.out.println("Array List data : "+ my_list);
        System.out.println("ArrayList size: "+ my_list.size());
        Collections.sort(my_list);
        System.out.println("Array List data : "+ my_list);
        //System.out.println("ArrayList size: "+my_list.size());
        //Modifying
        my_list.set(1,69);
        System.out.println("Array List data : "+ my_list);
        System.out.println("ArrayList size: "+ my_list.size());
        //Accessing an element using get method
        System.out.println("Element at index 4 "+my_list.get(4));
        my_list.sort(Collections.reverseOrder());
        System.out.println(my_list);
        //set function to insert at index;
        my_list.set(my_list.size()-1,1345);
        System.out.println(my_list+"\nAccessing Individual elements" );

        /*float f=26.343443f;
        System.out.printf("Hello %.2f",f);*/
        /*for(Object i:my_list){
            System.out.println(i);
        }*
        Using Iterator*/
        Iterator it=my_list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            //it.next();
        }
        System.out.println(my_list.isEmpty());
        my_list.clear();
        System.out.println(my_list.isEmpty());
        sc.close();
    }
}
