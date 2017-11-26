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
class stack{
	Node top;
        int size;
	class Node{
		Object item;
		Node next;
                public Node(Object i)
                {
                     item=i;
                     next=null;
                     
                }
	}
	void push(Object item)
	{
            Node n= new Node(item);
		if(top==null)
		{
                    
                    top=n;
		} else
		{
                    
                    n.next=top;
                    top=n;
		}
                size++;
	}
	Object pop()
	{
		if(top==null)
		{
			return null;
		}else
		{
			Node ans=top;
                        top=top.next;
                        size--;
			return ans.item;
		}
                
	}
        Object top()
        {
            return top.item;
        }
        public static void main(String[] args)
        {
            stack s= new stack();
            s.push(5);
            s.push(7);
            System.out.println("top: "+s.top());
            System.out.println(s.size);
            s.push(20);
            s.push(1);
            System.out.println("top: "+s.top());
            System.out.println("popped: "+s.pop());
            System.out.println("popped: "+s.pop());
            System.out.println(s.size);
            System.out.println("popped: "+s.pop());
            System.out.println("popped: "+s.pop());
            System.out.println("popped: "+s.pop());
        }
}

