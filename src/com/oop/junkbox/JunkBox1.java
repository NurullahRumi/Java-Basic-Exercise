package com.oop.junkbox;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JunkBox1 {

	public static void main(String[] args) {
		JunkBox1 j = new JunkBox1();
		j.go();
	}
	
	public void go() {
		List<Song> songs = MockSongs.getSongs();
		System.out.println(songs);
			
		songs.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
		System.out.println(songs);
		
		songs.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
		System.out.println(songs);
		
		//HashSet implemented. But not sorted.
		Set<Song> setSongs = new HashSet<>(songs);
		System.out.println(setSongs);
		
		//TreeSet implemented. No duplicate and sorted
		Set<Song> treeSongs = new TreeSet<>((one, two) -> one.getTitle().compareTo(two.getTitle()));
		treeSongs.addAll(songs);
		System.out.println(treeSongs);
	}

}
