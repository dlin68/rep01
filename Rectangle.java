//Daniel Lin
//Band c
//9/19/2022
import java.util.Scanner; //import javax.*;
public class Rectangle
{
	public static void main (String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please Enter Length:");
		int a = keyboard.nextInt();
		System.out.println("Please Enter Width:");
		int b = keyboard.nextInt();
		int area = a*b;
		System.out.println("The area of a rectangle is " +area);
	}
}