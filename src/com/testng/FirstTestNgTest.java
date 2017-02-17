package com.testng;

import org.testng.annotations.Test;

public class FirstTestNgTest 
{
@Test(priority=1)
public static void firstTest()
{
	System.out.println("First");
}
@Test(priority=2)
public static void yahooTest()
{
	System.out.println("yahoo");
}
@Test(enabled=false)
public static void secondTest()
{
	System.out.println("Second");
}
}
