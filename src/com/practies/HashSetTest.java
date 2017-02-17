package com.practies;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args)
	{
		Set<String> s=new HashSet<>();
		s.add("Selenium");
		s.add("Qtp");
		s.add("LR");
		s.add("Etl");
		s.add("Selenium");
		System.out.println(s.size());
		Iterator<String> iterator=s.iterator();
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}

}
