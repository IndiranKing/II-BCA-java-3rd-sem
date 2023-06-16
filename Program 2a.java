//Exercise 2A- Stack Using Linked list
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
class Stack1
{
LNode push(int d,LNode head)
{ 
LNode temp = new LNode(d);
if(head==null)
head=temp;
else
{
temp.next=head;
head=temp;
}
return head;
}
LNode pop(LNode head)
{
if(head==null)
 System.out.println("Stack is underflow");
else
{
head=head.next;
System.out.println("\n The top element is removed");
}
return head;
}
void display(LNode head)
 {
 if(head==null)
 {
System.out.println("Stack is empty");
return;
 }
 LNode temp=head;
 System.out.println(" The elements in the stack are : ");
 while(temp!=null)
 {
System.out.print(temp.data+" ");
temp=temp.next;
 }
 }
 
boolean isEmpty(LNode head)
{
if(head==null)
return true;
else
return false;
}
int peek(LNode head)
{
if(head==null)
{
System.out.println("Stack is empty");
return 0 ;
}
System.out.print("\n Top element is: ");
return head.data;
}
} //Class Stack1
class StackDemo
{
public static void main(String[] args)
{
Stack1 s=new Stack1();
LNode head=null;
Scanner in=new Scanner(System.in);
System.out.println("EXERCISE 02 A STACK USING LINKED LIST ");
System.out.println("******************************");
System.out.println("1.PUSH");
System.out.println("2.POP");
System.out.println("3.PEEK");
System.out.println("4.IS EMPTY"); 
System.out.println("5.DISPLAY");
System.out.println("6.EXIT");
 do
{
System.out.println("\n Enter your choice : ");
int choice=in.nextInt();
switch(choice)
{
case 1: 
System.out.println(" Enter the value ");
head=s.push(in.nextInt(),head);
break;
case 2: 
head=s.pop(head);
break;
case 3: 
System.out.println(s.peek(head));
break;
case 4: 
System.out.println("Stack is empty? : "+ s.isEmpty(head));
break;
case 5: 
s.display(head); 
break;
case 6: System.exit(0);
break;
default: System.out.println("\n Wrong Choice!");
 break;
}
}while(true);
}
}
