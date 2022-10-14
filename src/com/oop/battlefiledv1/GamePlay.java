package com.oop.battlefiledv1;

import java.util.ArrayList;

public class GamePlay {
	private ArrayList<Integer> locations;
	
	public String checkYourself(int userGuess) {
		String result = "miss";
		
		int index = locations.indexOf(userGuess);
		
		if(index>= 0) {
			locations.remove(index);
			if(locations.isEmpty()) {
				result = "kill";
			}else {
				result = "hit";
			}
		}
		return result;
	}
	
	public void setLocationCell(ArrayList<Integer> locs) {
		locations = locs;
	}

}
