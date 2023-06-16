//EXERCISE 10B SELECTION SORT
import java.util.*;
class SelSort
{
 static void selectionSort(int array[])
 {
int size = array.length;
for (int step = 0; step < size - 1; step++) 
{
int min_idx = step;
for (int i = step + 1; i< size; i++)
{
 if (array[i] < array[min_idx]) 
 {
min_idx = i;
 }
 }
 // put min at the correct position
int temp = array[step];
array[step] = array[min_idx];
array[min_idx] = temp;
 }
 }
 public static void main(String args[]) 
 {
int a[] = new int[6];
System.out.println("EXERCISE 10B SELECTION SORT");
System.out.println("========================");
Scanner in=new Scanner(System.in);
System.out.println("Enter any 6 values");
for(int i=0; i<6; i++)
a[i]=in.nextInt();
selectionSort(a);
System.out.println("Sorted Array in Ascending Order: ");
System.out.println(Arrays.toString(a));
 }
}
