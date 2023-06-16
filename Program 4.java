PROGRAM:// 4 PRIORITY QUEUE
import java.util.*;
class LNode
{
int data;
 int priority;
LNode next;
LNode(int d,int p)
{
data=d;
 priority=p;
}
}
class Queue
{
LNode enqueue(LNode head,int d, int p)
{
LNode tmp=new LNode(d,p);
if(head==null)
head=tmp;
else
{ 
 LNode tmp1=head;
if (tmp.priority<=tmp1.priority)
{
tmp.next=head;
head=tmp;
}
else
 {
while(tmp1.next!=null && tmp1.next.priority<= tmp.priority)
tmp1=tmp1.next;
 tmp.next=tmp1.next;
tmp1.next=tmp;
 }
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
 System.out.println("The job with the highest Priority is removed from the Queue"); 
 }
return head;
}
void display(LNode head)
{
System.out.println("\n The elements in the Queue are : ");
if(head==null)
{
System.out.println("Queue is Empty");
return;
}
LNode tmp=head;
while(tmp!=null)
{
System.out.print(tmp.data+" ");
System.out.print(tmp.priority+ " ");
tmp=tmp.next;
System.out.println();
}
}
}
class PriorityQueueDemo
{
 public static void main(String[] args)
 {
 Queue q=new Queue();
 LNode head=null;
 Scanner in=new Scanner(System.in);
 System.out.println("EXERCISE 04 PRIORITY QUEUE USING SINGLY LINKED LIST "); 
 System.out.println("**********************************************");
 
 System.out.println("\n******** MENU *******");
 System.out.println("\n 1.ENQUEUE");
 System.out.println("\n 2.DEQUEUE");
 System.out.println("\n 3.DISPLAY");
 System.out.println("\n 4.EXIT");
 do
 {
System.out.println("\n Enter your choice : ");
 int choice=in.nextInt();
switch(choice)
{
 case 1: 
 System.out.println("\n Enter the Job number and Priority");
 head=q.enqueue(head,in.nextInt(),in.nextInt());
 break;
 case 2: 
 head=q.dequeue(head);
 break;
 case 3: 
 q.display(head); 
 break;
 case 4: 
 System.exit(0);
 break;
 default: 
 System.out.println("\n Wrong Choice!");
 break;
}
 }while(true);
 }
}
