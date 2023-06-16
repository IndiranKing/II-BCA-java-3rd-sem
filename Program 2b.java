//Exercise 2B- Queue Using Linked List
import java.util.*;
class LNode
{
int data;
LNode next;
LNode(int d)
{
data=d;
}
}
class Queue
{
LNode enqueue(int a, LNode head)
{
LNode temp=new LNode(a);
if(head==null)
head=temp;
else
{ 
LNode temp1=head;
while(temp1.next!=null)
temp1=temp1.next;
temp1.next=temp;
}
return head;
 }
 LNode dequeue(LNode head)
 {
 if(head==null)
 System.out.println("Queue is underflow");
 else
{
head=head.next;
System.out.println("The front element is removed");
} 
return head;
 }
 void display(LNode head)
 {
if(head==null)
{
System.out.println("Queue is empty");
return;
}
LNode temp=head;
System.out.println("\n The elements in the queue are : ");
while(temp!=null)
{
System.out.print(temp.data+" ");
temp=temp.next;
}
}
}//class Queue
class QueueDemo
{
public static void main(String[] args)
{
 Queue q=new Queue();
 LNode head=null;
 Scanner in=new Scanner(System.in);
 System.out.println("EXERCISE 02 B QUEUE USING SINGLY LINKED LIST ");
 System.out.println("**********************************************");
 System.out.println("\n1.ENQUEUE");
 System.out.println("\n2.DEQUEUE");
 System.out.println("\n3.DISPLAY");
 System.out.println("\n4.EXIT");
 do
 {
 System.out.println("\n Enter your choice : ");
 switch(in.nextInt())
 {
case 1: 
System.out.println("\n Enter the value ");
head=q.enqueue(in.nextInt(),head);
break;
case 2: 
head=q.dequeue(head);
break;
case 3: 
 q.display(head); 
break;
case 4: System.exit(0);
break;
default: System.out.println("\n Wrong Choice!");
 break;
 }
 }while(true);
 }
}
