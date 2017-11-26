/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.ds;

/**
 *add two numbers stored in reverse in a linked list
 * @author Mehak Beri
 */
class ll{
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int d)
		{
			data=d;
			next=null;
		}
		
	}
	void push(int a)
	{
		Node add= new Node(a);
		add.next=head;
		head=add;
	}
	static ll add(Node head1, Node head2)
	{
		Node t1= head1;
		Node t2= head2;
		if(t1==null && t2==null)
		{
			return null;
}
		ll sum= new ll(); //315 and 592 gives 808
		int s=0;
		int carry=0;
		
		while(t1!=null || t2!=null)
		{
			int tone= (t1==null)?0:t1.data;
                        int ttwo= (t2==null)?0:t2.data;
			s=(tone+ttwo+carry)%10;
			carry=(tone+ttwo+carry)/10;
			sum.push(s);	
                        
                            t1=t1.next;
                        
			
                            t2=t2.next;
                        
		}
                if(carry>0)
                {
                    sum.push(carry);
                }
                
                return sum;
                
              
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

		public static void main(String[] args)
		{

			ll one= new ll();
			one.push(3);
			one.push(1);
			one.push(5);
                        one.print();
			ll two= new ll();
			two.push(5);
			two.push(9);
			two.push(2);
                        two.print();
                        ll three= add(one.head,two.head);
                        three.print();
		}

	}


