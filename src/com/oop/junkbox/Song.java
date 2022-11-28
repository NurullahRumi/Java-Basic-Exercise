package com.oop.junkbox;

public class Song{
	private final String title;
	private final String artist;
	private final String genre;
	private final int year;
	private final int timesPlayed;
	
	public Song(String title, String artist, String genre, int year, int timesPlayed) {
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.year = year;
		this.timesPlayed = timesPlayed;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}
	
	public String getGenre() {
		return genre;
	}

	public int getYear() {
		return year;
	}

	public int getTimesPlayed() {
		return timesPlayed;
	}
	
	@Override
	public String toString() {
		return title;
	}
	
	@Override
	public boolean equals(Object o ) {
		Song other = (Song) o;
		return getTitle().equals(other.getTitle());
	}
	
	@Override
	public int hashCode() {
		return title.hashCode();
	}
	
}
