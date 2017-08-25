package assignment;

import java.util.Scanner;   //importing scanner

public class Assignment1_2 {   //class definition
	 
	 static int Add(int a,int b)  //separate method containing addition logic
	{
		
		while(b!=0)              //if this condition is true enter the loop
		{
			int carry=a & b;     //Taking carry by performing bitwise 'and' operation
			
			a= a ^ b;           //performing sum  of two bits by XOR operation 
			
			b= carry<<1;       //Shifting carry by 1 to perform addition
			
		}
		
		return a;            //if condition in while loop is false then directly return this
}
	

	public static void main(String[] args) {     //main method starts here
		
		Scanner sc= new Scanner(System.in);        //Creating object
		
		System.out.println("Enter the two numbers.");  //message for user
		
		int x=  sc.nextInt();               //taking first input number from user
		
		int y= sc.nextInt();                 // taking second input number from user
		
		
		int sum=Add(x,y);  //calling of function Add performing addition and storing it into sum
		
		System.out.println("The sum of two numbers is " + sum + ".");  //printing the sum value by printing variable value sum
		
	}

}
