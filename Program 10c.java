//EXERCISE 10C INSERTION SORT
import java.util.*;
class InsertionSort
{
 static void insertionSort(int array[])
 {
int size = array.length;
for (int step = 1; step < size; step++)
{
int key = array[step];
int j = step - 1;
 while (j >= 0 && key < array[j])
{
array[j + 1] = array[j];
 --j;
 }
 // Place key at after the element just smaller than it.
array[j + 1] = key;
 }
 }
 public static void main(String args[]) 
 {
int a[] = new int[6];
System.out.println("EXERCISE 10C INSERTION SORT");
System.out.println("===========================");
Scanner in=new Scanner(System.in);
System.out.println("Enter any 6 values");
for(int i=0; i<6; i++)
 a[i]=in.nextInt();
insertionSort(a);
System.out.println("Sorted Array in Ascending Order: ");
System.out.println(Arrays.toString(a));
 }
}
