package com.oop.collection_api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


        int[] v = new int[4];
        v[0]= 4;
        v[1]= 5;
        v[2]= 6;
        v[3]= 7;

        System.out.println(v[3]);
		
        Collection values = new ArrayList(); // don't have index, cannot insert in between
        values.add(4);
        values.add(8);
        values.add(5);
        values.add("Rumi");


        System.out.println(values);

        Iterator it = values.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }



        List<Integer> value_list = new ArrayList<>(); // works with index, but can have duplicate values, sorted by index

        value_list.add(6);  //Integer v= new Integer(4);
        value_list.add(4);
        value_list.add(9);
        value_list.add(2,12);

        for(Object i:value_list){
            System.out.println(i);
        }
        
        /* 
        LinkedList vs ArrayList
        1. Both have Index
        2. Both can have duplicate values
        3. sorted by index
        But when we fetch value 
            - ArrayList is way faster then LinkedList
        And when we Insert, Update and delete value
            - LinkedList is way faster then ArrayList
         */

	    List<String> value_link_list = new LinkedList<>();
	    value_link_list.add("Rumi");
	    value_link_list.add("Ananta");
	    value_link_list.add("Rumi");
	    value_link_list.add(1, "Jeki");
	
	    for(String s:value_link_list){
	        System.out.println(s);
	    }


        Set<Integer> value_set = new HashSet<Integer>(); // cannot insert in between, always have unique values, not sorted
        value_set.add(4);
        value_set.add(7);
        value_set.add(9);
        value_set.add(23);

        for(int i:value_set){
            System.out.println(i);
        }


        Set<Integer> value_tree = new TreeSet<>(); // cannot insert in between, always have unique values, sorted by value
        value_tree.add(2);
        value_tree.add(7);
        value_tree.add(3);
        value_tree.add(3);

        System.out.println(value_tree);


        Map<Integer, String> m = new HashMap<>(); //( key, value)

        m.put(1, "Rumi");
        m.put(2, "Ananta");
        m.put(3, "Ananda");

        System.out.println(m);
	}

}
