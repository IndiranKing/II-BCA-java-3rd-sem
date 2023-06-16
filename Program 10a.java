//EXERCISE 10A BUBBLE SORT
import java.util.*;
class BubSort 
{
 static void bubbleSort(int array[]) 
 {
int size = array.length;
for (int i = 0; i< size - 1; i++)
 for (int j = 0; j < size - i - 1; j++)
 if (array[j] > array[j + 1])
 {
 int temp = array[j];
array[j] = array[j + 1];
array[j + 1] = temp;
 }
 }
 public static void main(String args[])
 {
int a[] = new int[6];
System.out.println("EXERCISE 10A BUBBLE SORT");
System.out.println("========================");
 Scanner in=new Scanner(System.in);
System.out.println("Enter any 6 values");
for(int i=0; i<6; i++)
a[i]=in.nextInt();
bubbleSort(a);
System.out.println("Sorted Array in Ascending Order:");
System.out.println(Arrays.toString(a));
 }
}
