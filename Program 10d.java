//EXERCISE 10D RADIX SORT
import java.util.*;
class RadixSort 
{
 // Using counting sort to sort the elements in the basis of significant places
 static void countingSort(int array[], int size, int place) 
 {
int output[] = new int[size + 1];
int max = array[0];
for (int i = 1; i< size; i++) 
{
 if (array[i] > max)
max = array[i];
 }
int count[] = new int[max + 1];
for (int i = 0; i< max; ++i)
count[i] = 0;
// Calculate count of elements
for (int i = 0; i< size; i++)
count[(array[i] / place) % 10]++;
 // Calculate cumulative count
for (int i = 1; i< 10; i++)
count[i] += count[i - 1];
 // Place the elements in sorted order
for (int i = size - 1; i>= 0; i--)
{
output[count[(array[i] / place) % 10] - 1] = array[i];
count[(array[i] / place) % 10]--;
 }
 for (int i = 0; i< size; i++)
array[i] = output[i];
 }
 // Function to get the largest element from an array
 static int getMax(int array[], int n) 
 {
int max = array[0];
for (int i = 1; i< n; i++)
if (array[i] > max)
max = array[i];
return max;
 }
 // function to implement radix sort
 static void radixSort(int array[], int size) 
 {
 // Get maximum element
 int max = getMax(array, size);
 // Apply counting sort to sort elements based on place value.
 for (int place = 1; max / place > 0; place *= 10)
countingSort(array, size, place);
 }
 public static void main(String args[])
 {
int a[] = new int[6];
System.out.println("EXERCISE 10D RADIX SORT");
System.out.println("=======================");
Scanner in=new Scanner(System.in);
System.out.println("Enter any 6 values");
for(int i=0; i<6; i++)
a[i]=in.nextInt();
radixSort(a,6);
System.out.println("Sorted Array in Ascending Order: ");
System.out.println(Arrays.toString(a));
 }
}
