
class Linkedlist{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
		
	}
	void push(int a)
	{
		Node added= new Node(a);
		added.next=head;
		head=added;
	}
	void print()
	{
		Node temp= head;
                
		while(temp!=null)
{
System.out.print(temp.data+" ");
temp=temp.next;
}
                System.out.println();
	}
	void reverse()
	{
                System.out.println("reversing");
		Node prev=null;
		Node curr=head;
                Node next;
		while(curr!=null)
		{
			next=curr.next; //increment and save next node
			curr.next= prev; //reverse one arrow
			prev=curr; //increment prev node
			curr= next; //increment current node
		}
                head=prev;
	}
	public static void main(String[] args)
	{
		Linkedlist l= new Linkedlist();
		l.push(1);
		l.push(5);
		l.push(20);
		l.push(13);
		l.push(19);
		l.print();
                Linkedlist m= new Linkedlist();
		m.push(11);
		m.push(52);
		m.push(2);
		m.push(103);
		m.push(1);
		m.print();
		l.reverse();
                
                l.print();
		m.reverse();
                m.print();
	}
}
