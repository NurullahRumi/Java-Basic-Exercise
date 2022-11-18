package com.oop.junkbox;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
	
	public static List<Song> getSongs(){
		ArrayList<Song> songs = new ArrayList<>();
		songs.add(new Song("tumi amar 53 tas","Bappa",5.52));
		songs.add(new Song("akta gupon kotha","Topu",4.52));
		songs.add(new Song("3 din tor barit","Momotaz",3.52));
		songs.add(new Song("haaste dekho gaite dekho","LRB",5.52));
		songs.add(new Song("haaste dekho gaite dekho","LRB",5.52));
		return songs;
	}
}
