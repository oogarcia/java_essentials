package helloWorld;

import libs.Input;

public class Hello2 {

	public static void main(String args[])
	{
		System.out.println("ingresa algo");
		String name = Input.get_string();
		System.out.println("hello, "+ name + "\n");   
	}
}