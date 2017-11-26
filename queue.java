/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.ds;

/**
 *
 * @author Mehak Beri
 */
class queue{
	Node front, back;
	class Node{
		Object item;
		Node next;
		public Node(Object i)
		{
			item=i;
			next=null;
		}
	}
	void enqueue(Object item)
	{
		Node n= new Node(item);
		if(front==null)
		{
			front=n;
			back=front;
		} else
{
			back.next=n;
                        back=n;
		}
	}
	Object dequeue()
	{
		if(front==null)
		{
			return null;
		}
		else
		{
			Node ans= front;
			front=front.next;
			return ans.item;
		}
	}
	public static void main(String[] args)
	{
		 queue q= new queue();
		 q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
			System.out.println("queue front: "+q.front.item+" queue back: "+q.back.item);
                        System.out.println("dequeuing elements: "+q.dequeue());
                        System.out.println("queue front: "+q.front.item+" queue back: "+q.back.item);
                        System.out.println("dequeuing elements: "+q.dequeue());
                        System.out.println("queue front: "+q.front.item+" queue back: "+q.back.item);
                        System.out.println("dequeuing elements: "+q.dequeue());
                        System.out.println("queue front: "+q.front.item+" queue back: "+q.back.item);
                        System.out.println("dequeuing elements: "+q.dequeue());
	}
}
