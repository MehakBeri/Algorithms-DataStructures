/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.ds;

import java.util.HashSet;

/**
 *remove duplicates in an unsorted linked list
 * @author Mehak Beri
 */
class Node1{
int data;
Node1 next;
	public Node1(int n)
	{
		data=n;
		next=null;
	}
	public void appendAtEnd(int n)
	{
		Node1 newNode= new Node1(n);
		Node1 thisNode=this;
		while(thisNode.next!=null)
		{
			thisNode=thisNode.next;
		}
		thisNode.next=newNode;
	}	
	public Node1 deleteNode(Node1 head, int n)
	{
Node1 curr= head;
if(head.data==n)
{
	head=head.next;
	return head;
}
while(curr.next.data!=n)
{ curr= curr.next; }
curr.next=curr.next.next;
return head;
	}
	public Node1 deleteDuplicates(Node1 head)
	{
		Node1 temp=head;
		HashSet<Integer> hset= new HashSet<Integer>();
		while(temp!=null)
		{
			if(hset.contains(temp.data))
				{
					head= deleteNode(head, temp.data);
				}
			else
			{
				hset.add(temp.data);
			}
			temp=temp.next;
		}
                return head;
	}
        
        //without buffer
        public Node1 delDup(Node1 head)
        {
            //Node1 previous=head;
            Node1 current= head.next;
            while(current!=null)
            {
                Node1 runner=head;
                while(runner!=current)
                {
                    if(runner.data==current.data)
                    {
                        head=deleteNode(head, runner.data);
                        break ; //all other duplicates already removed
                    }
                    runner=runner.next;
                }
                current=current.next;
                //previous=current;
            }
            return head;
        }
        

}
public class removeDuplicatesLL {
 
public static void main(String[] args)
{
	Node1 n= new Node1(1);
	n.appendAtEnd(2);
	n.appendAtEnd(23);
	n.appendAtEnd(12);
	n.appendAtEnd(3);
	n.appendAtEnd(2);
	n.appendAtEnd(23);
	n.appendAtEnd(12);
	n.appendAtEnd(23);
	printLinkedList(n);
	//n.deleteDuplicates(n);
        n.delDup(n);
	printLinkedList(n);
}

public static void printLinkedList(Node1 head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }


}
