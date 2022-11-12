package com.oop.junkbox;

import java.util.Collections;
import java.util.List;

public class JunkBox1 {

	public static void main(String[] args) {
		JunkBox1 j = new JunkBox1();
		j.go();
	}
	
	public void go() {
		List<Song> songs = MockSongs.getSongs();
		Collections.sort(songs);
		System.out.println(songs);
	}

}
