//EXERCISE 9A LINEAR SEARCH
import java.util.*;
class LinSer
{ 
public static int linearSearch(int arr[], int key)
{ 
for(int i=0;i<arr.length;i++)
{ 
if(arr[i] == key)
{ 
 return i; 
} 
} 
return -1; 
} 
public static void main(String args[])
{ 
int a[] = new int[6];
System.out.println("EXERCISE 9A LINEAR SEARCH");
System.out.println("=========================");
 Scanner in=new Scanner(System.in);
System.out.println("Enter any 6 values");
for(int i=0; i<6; i++)
a[i]=in.nextInt();
System.out.println("Enter the search key");
int key = in.nextInt();
int index = linearSearch(a, key);
if (index == -1)
System.out.println(key+" is not found...");
else
System.out.println(key+" is found at index: "+index); 
} 
} 
