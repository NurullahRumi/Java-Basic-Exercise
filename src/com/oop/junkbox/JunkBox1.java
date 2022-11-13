package com.oop.junkbox;
import java.util.Comparator;
import java.util.List;

public class JunkBox1 {

	public static void main(String[] args) {
		JunkBox1 j = new JunkBox1();
		j.go();
	}
	
	public void go() {
		List<Song> songs = MockSongs.getSongs();
		System.out.println(songs);
		
		songs.sort(new Comparator<Song>() {   // Inner Class

			@Override
			public int compare(Song o1, Song o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});
		
		System.out.println(songs);
		
		songs.sort(new Comparator<Song>() {
			@Override
			public int compare(Song o1, Song o2) {
				return o1.getArtist().compareTo(o2.getArtist());
			}
		});
		
		System.out.println(songs);
	}

}
