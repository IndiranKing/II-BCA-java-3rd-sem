// 01 A- List using Array
import java.util.*;
class MyArray 
{
public static void main (String[] args)
	{
		int pen[]= new int[5];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any 5 values");
 
		for(int i=0; i<5; i++)
			pen[i]=in.nextInt();
		System.out.println("EXERCISE 01 A LIST USING ARRAY ");
		System.out.println("******************************");
		System.out.println("Entered values are:");
 
		for(int i=0; i<5; i++)
		{
			System.out.print("Number "+ i + ":" +" ");
			System.out.println(pen[i]+" "); 
		}
	}
}
