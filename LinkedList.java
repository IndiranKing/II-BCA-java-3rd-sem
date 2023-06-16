// 01 B- List using Linked List
import java.util.*;
class LLNode
{
	int data;
	LLNode next;
	LLNode(int data)
	{
		this.data=data;
		this.next=null;
	}
}

class LinkedList
{
	LLNode head;
	LLNode insertInBeg(int key,LLNode head)
	{
		LLNode temp=new LLNode(key);
		if(head==null)
		head=temp;
		else
		{
			temp.next=head;
			head=temp;
		}
		return head; 
	}
	
	LLNode insertInEnd(int key,LLNode head)
	{
		LLNode temp=new LLNode(key);
		LLNode temp1=head;
		if(temp1==null)
		head=temp;
		else
		{
			while(temp1.next!=null)
			temp1=temp1.next;
			temp1.next=temp;
		}
		return head;
	}
	
	LLNode insertAtPos(int key,int pos,LLNode head)
	{
		LLNode temp=new LLNode(key);
		if(pos==1)
		{
			temp.next=head;
			head=temp;
		}
		else
		{
			LLNode temp1=head;
			for(int i=1;temp1!=null && i<pos;i++)
			temp1=temp1.next;
			temp.next=temp1.next;
			temp1.next=temp;
		}
		return head;
	}
	
	LLNode delete(int pos,LLNode head)
	{
		LLNode temp=head;
		if(pos==1)
			head=temp.next;
		else
		{
			for(int i=1;temp!=null && i<pos;i++)
				temp=temp.next;
				temp.next=temp.next.next;
		}
		return head;
	}
	
	int length(LLNode head)
	{
		LLNode temp=head;
		int c=0;
		if(temp==null)
			return 0;
		else
		{ 
			while(temp!=null)
			{
				temp=temp.next;
				c++;
			}
	}
	return c;
	}
	
	void display(LLNode head)
	{
		LLNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.head=null; int value;
		Scanner in=new Scanner(System.in);
		System.out.println("EXERCISE 01 B LIST USING LINKED LIST ");
		System.out.println("*************************************");
		System.out.println(" 1.Insert In End");
		System.out.println(" 2.Insert In Beg");
		System.out.println(" 3.Insert At a Particular Position");
		System.out.println(" 4.Delete at a Position");
		System.out.println(" 5.Length");
		System.out.println(" 6.Display");
		System.out.println(" 7.EXIT");
	do
	{
		System.out.print("\n Enter your choice : ");
		int n=in.nextInt();
		switch(n)
		{
		case 1: System.out.println(" Enter the value ");
		value=in.nextInt();
		l.head=l.insertInEnd(value,l.head);
		break;
		
		case 2: System.out.println("\n Enter the value");
		l.head=l.insertInBeg(in.nextInt(),l.head);
		break;
		
		case 3: System.out.println("\n Enter the value & the position");
		l.head=l.insertAtPos(in.nextInt(),in.nextInt(),l.head);
		break;
 
		case 4: System.out.println("\n Enter the Position");
		int position=in.nextInt(); 
		l.head=l.delete(position,l.head);
		break;
 
		case 5: System.out.println("The length of linked list ");
		System.out.println(l.length(l.head));
		break;
 
		case 6: System.out.println("The elements in the list are");
		l.display(l.head);
		break;
 
		case 7: System.exit(0);
		break;
 
		default: System.out.println("\n Wrong Choice!");
		}
	}while(true); 
  }
}
