package com.oop.junkbox;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JunkBox1 {

	public static void main(String[] args) {
		JunkBox1 j = new JunkBox1();
		j.go();
	}
	
	public void go() {
		List<Song> songs = new Songs().getSongs();
		
		//All the songs that fall under some genre of "Rock"
		List<Song> rockSongs = songs.stream().filter(so -> so.getGenre().contains("Rock")).collect(Collectors.toList());
		System.out.println(rockSongs);
		
		//only songs that fall under the genre of "Rock"
		List<Song> onlyRockSongs = songs.stream().filter(so -> so.getGenre().equals("Rock")).collect(Collectors.toList());
		System.out.println(onlyRockSongs);
		
		
		List<String> genres = songs.stream().map(s -> s.getGenre()).distinct().collect(Collectors.toList());
		System.out.println(genres);
		
		String songTitle = "With the Little help from My Friends";
		List<String> result = songs.stream().filter(s->s.getTitle().equals(songTitle)).map(s->s.getArtist()).filter(artist->!artist.equals("Joe Cocker")).collect(Collectors.toList());
		System.out.println(result);
		
//		songs.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
//		System.out.println(songs);
//		
//		songs.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
//		System.out.println(songs);
//		
//		//HashSet implemented. But not sorted.
//		Set<Song> setSongs = new HashSet<>(songs);
//		System.out.println(setSongs);
//		
//		//TreeSet implemented. No duplicate and sorted
//		Set<Song> treeSongs = new TreeSet<>((one, two) -> one.getTitle().compareTo(two.getTitle()));
//		treeSongs.addAll(songs);
//		System.out.println(treeSongs);
	}

}
