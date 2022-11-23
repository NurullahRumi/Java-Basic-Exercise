package com.oop.streampipeline;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		List<Friend> friends = List.of(new Friend("Ananta",30),new Friend("Rumi", 31),new Friend("Jickrul", 32),new Friend("Ananda", 29),new Friend("Mamun", 30));
		Stream<Friend> stream = friends.stream();
		Stream<Friend> limit = stream.limit(3);
		
		System.out.println(limit.sorted((one,two) -> one.getName().compareTo(two.getName())).collect(Collectors.toList()));
	}

}
