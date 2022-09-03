package com.oop.hashmap;

import java.util.HashMap;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap happy = new HashMap();
        happy.put("a",10); //(String, Integer)
        happy.put(1,"test"); //(Integer, String)
        happy.put(2,10); //(Integer, Integer)
        happy.put("any","anything"); //(String, String)
        happy.put(3,30); //(String, String)

        System.out.println(happy);
        System.out.println(happy.get("any"));


        HashMap<String, String> userInfo = new HashMap<>();
        userInfo.put("NR26","123456");
        userInfo.put("AR01","abc123");
        userInfo.put("GM01","safd12");
        userInfo.remove("GM01");

        System.out.println(userInfo);
        System.out.println(userInfo.size());
        System.out.println(userInfo.containsKey("NR26"));
        System.out.println(userInfo.containsValue("abc123"));
	}

}
