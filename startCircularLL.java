/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.ds;

/**
 * find the starting point of a loop in a circular linked list
 *floyd's circle finding algorithm
 * @author Mehak Beri
 */
class link_list
{
	Node head;
	class Node
	{
		int data;
		Node next;
		public Node(int d)
		{
			data=d;
			next=null;
		}
	}
	void push(int add)
	{
		Node a= new Node(add);
		a.next=head;
		head=a;
	}
	void setNext(int loop)
	{
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		Node last=temp;
		temp=head;
		while(temp.data!=loop)
		{
		temp=temp.next;
		}
		last.next=temp;
	}
	
	void detectCircle()
	{
		Node slowPtr= head.next;
		Node fastPtr=head.next.next;
		boolean isCircular=false;
		//detect loop
		while( slowPtr.next!=null ||  fastPtr.next.next!=null)
		{
                    System.out.println("slow: "+slowPtr.data+" fast: "+fastPtr.data);
			if(slowPtr==fastPtr)
			{ 
				isCircular=true;
                                System.out.println(isCircular+ " meeting point at "+slowPtr.data);
                                break;
			}
                        else{
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
                        }
		}
		
		if(isCircular)
		{
			slowPtr=head;
                        System.out.println("slow at: "+slowPtr.data+" fast at: "+fastPtr.data);
                        Node ans=slowPtr;
			while(slowPtr!=fastPtr)
			{
                            ans=slowPtr;
				slowPtr=slowPtr.next;
				fastPtr=fastPtr.next.next;
			}
			System.out.println("loop starts at "+ans.data);
		}
	}

	public static void main(String[] args)
	{
		link_list a= new link_list();
		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
		a.push(5);
		a.setNext(3);
                a.detectCircle();
	}
}
