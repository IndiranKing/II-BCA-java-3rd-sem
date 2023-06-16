//EXERCISE 9B BINARY SEARCH
import java.util.*;
class BinSer
{ 
public static void binarySearch(int arr[], int first, int last, int key)
{ 
int mid = (first + last)/2; 
while( first <= last )
{ 
if ( arr[mid] < key )
{ 
first = mid + 1; 
}
else if ( arr[mid] == key )
{ 
System.out.println("Element is found at index: " + mid); 
break; 
}
else
{ 
last = mid - 1; 
} 
mid = (first + last)/2; 
 } 
 if ( first > last )
 { 
System.out.println("Element is not found!"); 
 } 
} 
public static void main(String args[])
{ 
int arr[] = new int[6];
System.out.println("EXERCISE 9B BINARY SEARCH");
System.out.println("=========================");
Scanner in=new Scanner(System.in);
System.out.println("Enter any 6 values in Ascending Order");
for(int i=0; i<6; i++)
arr[i]=in.nextInt();
System.out.println("Enter the search key");
int key = in.nextInt();
int last=arr.length-1; 
binarySearch(arr,0,last,key); 
} 
}