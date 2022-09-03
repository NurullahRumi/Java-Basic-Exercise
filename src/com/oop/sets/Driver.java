package com.oop.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//////////////////////HastSet start///////////////////
		System.out.println("HashSet start here.");
		//create
		HashSet<String> h = new HashSet<>();
		
		//Insert
		h.add("Monkey");        
		h.add("Horse");
		h.add("Cows");
		h.add("Monkey");
		h.add("cat");             
		h.add("pig");  
		
		//Delete/Remove
		h.remove("cat");     
		
		//Search
		if(h.contains("Cows")){
		System.out.println("Cows is here.");
		}
		
		//Size of HashSet
		System.out.println(h.size());
		
		// All elements of set
		System.out.println(h);
		
		//Iterator
		Iterator<String> it = h.iterator();
		
		while(it.hasNext()){
		System.out.println(it.next());
		}
		
		System.out.println("HashSet end here.");
		System.out.println();
		
		// Insert/add - O(1);
		// Search/Contains - O(1);
		// Delete/Remove - O(1);
		// elements serial will not surely be as it is inserted.
		// Duplicate value not allowed.
		
		
		////////////////////// HastSet end///////////////////
		
		
		
		////////////////////// ArrayList start///////////////////
		System.out.println("ArrayList start here.");
		
		//Create
		ArrayList<String> a = new ArrayList<>();
		
		//Insert
		a.add("kamal");
		a.add("Jamal");
		a.add("Samal");
		a.add("kamal");
		
		//Search
		if(a.contains("kamal")){
		System.out.println("Kamal is here.");
		};
		
		//Delete/remove
		a.remove("Jamal");
		
		// Size 
		System.out.println(a.size());
		
		// All elements
		System.out.println(a);
		
		//Iterator
		Iterator<String> it1 = a.iterator();
		
		while(it1.hasNext()){
		System.out.println(it1.next());
		}
		// for(int i =0 ; i< a.size(); i++){
		//     System.out.println(it1.next());
		// }
		
		System.out.println("ArrayList end here.");
		System.out.println();
		
		//elements serial will be as it is inserted.
		// Duplicate value allowed.
		
		
		////////////////////// HastSet end//////////////////////
		
		////////////////////// LinkedList start///////////////////
		System.out.println("LinkList starts here.");
		
		
		//create
		LinkedList<Integer> l = new LinkedList<>();
		
		//Insert
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(2);
		l.add(4);
		
		//Search
		if(l.contains(1)){
		System.out.println("1 is present here.");
		}
		
		//Delete/remove
		l.remove(4);
		
		//Size
		System.out.println(l.size());
		
		//Iterator
		Iterator<Integer> it2 = l.iterator();
		
		while(it2.hasNext()){
		System.out.println(it2.next());
		}
		
		
		// All elements
		System.out.println(l);
		
		System.out.println("LinkList starts here.");
		System.out.println();
		
		//elements serial will be as it is inserted.
		//Duplicate value allowed.
		
		
		
		////////////////////// LinkList end///////////////////
		
		///////////////////// Array start ////////////////////
		String[] array = {"a","b","c","d"}; 
		System.out.println(array[1]);  
		
		// Insert/add - O(1);
		// Search/Contains - O(n);
		// Delete/Remove - O(n);
		//elements will be sorted.
		//Duplicate value allowed.
		
		///////////////////// Array end //////////////////////
	}

}
