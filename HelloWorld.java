package Java8Programs;

import java.util.Scanner;

public class HelloWorld 
{
	public static void main(String[] args) 
	{		
		
	 Scanner sc = new Scanner(System.in);	
	 System.out.println("Are you hungry?");
	 String input = sc.nextLine();
	 
	 if(input.equalsIgnoreCase("yes"))
	 {
	   System.out.println("eat samosa");
	 }
	 else
	 {
		System.out.println("do your homework");
	 }
	}
}
