package com.practies;

public class BasicFunctions 
{
	public static void main(String[] args) 
	{
		
	BasicFunctions fun=new BasicFunctions(); 
		//fun.function3();
		String	res1=fun.function4();
		System.out.println(res1);
	}
	
	
	//non static function without returning value
		public void function3()
		{
			System.out.println("This is non static function without returning value");
		}
		//non static function with returning value
		
		public String function4()
		{
			System.out.println("This is non static function with returning value");
			return "Fail";
		}
		
}
