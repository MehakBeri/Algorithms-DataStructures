// Java program to find n'th node from end using slow and
// fast pointers
class LinkedList
{
	Node head; // head of the list

	/* Linked List node */
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Function to get the nth node from end of list */
	void printNthFromLast(int n)
	{
		int len=0;
		Node temp = head;
		while(temp!=null)
		{
		    len++;
                    temp=temp.next;
		}
                System.out.println("length is "+len);
		temp=head;
		int t=0;
                if(len-n >= 0)
                {
		while(t<len-n)
		{
		    temp=temp.next;
		    t++;
		}
        
	
			System.out.println("Node no. "+n+" from last is "+
							temp.data);
                }
                else
                {
                    System.out.println("n is greater than the length of the LL!");
                }
		}
	

	/* Inserts a new Node at front of the list. */
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/*Drier program to test above methods */
	public static void main(String [] args)
	{
		LinkedList llist = new LinkedList();
		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(35);

		llist.printNthFromLast(1);
	}
        
        //delete LL!!
        void deleteList()
    {
        head = null;
    }
 
} 
