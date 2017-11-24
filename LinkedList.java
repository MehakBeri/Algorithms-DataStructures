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

class Node{
    private int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    public int getData()
    {
        return data;
    }
    public void appendToTail(int n)
    {
        Node end= new Node(n);
        Node curr=this;
        while(curr.next!=null)
        {
            curr=curr.next;
            
        }
        curr.next=end;
    }
    public void deleteNode(Node head, int n)
    {
        if(head.data==n)
        {
            head=head.next;
        }
        Node curr=head;
        while(curr.next.data!=n)
        {
            curr=curr.next;
        }
        curr.next= curr.next.next;
    }
}
public class LinkedList {
    public static void main(String[] args)
    {
        Node n= new Node(1);
        n.appendToTail(2);
        n.appendToTail(3);
        n.appendToTail(4);
        
        printLinkedList(n);
        n.deleteNode(n, 2);
        printLinkedList(n);
    }
    
    public static void printLinkedList(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.getData()+" ");
            head=head.next;
        }
        System.out.println();
    }
}
