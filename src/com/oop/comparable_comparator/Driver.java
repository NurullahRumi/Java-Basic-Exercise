package com.oop.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Donner> donners = new ArrayList<>();
		
		donners.add(new Donner("Rumi",29,"Male",300));
		donners.add(new Donner("Ananta",30,"Male",200));
		donners.add(new Donner("Liza",27,"Female",600));
		
		
		//Collections.sort(donners);
		
		
		
		Comparator<Donner> com = new Comparator<Donner>() {

			@Override
			public int compare(Donner o1, Donner o2) {
				if(o1.getAmount() > o2.getAmount()) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		
		Collections.sort(donners,com);
		
		
		for(Donner a:donners) {
			System.out.println(a);
		}
	}

}
