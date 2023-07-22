package Linked_List;

import java.util.*;
class Node{
	int data;
	Node next;
	
	Node(){
		next=null;
	}
	Node(int n){
		data=n;
		next=null;
	}
	void insertAtLast(Node head,int n) {
		Node newnode = new Node(n);
		Node temp=head;
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
	}
	void insertAtFirst(Node head,int n) {
		Node newnode = new Node(n);
	    newnode.next=head.next;
	    head.next=newnode;
	}
	void insertAtMiddle(Node head,int n,int pos) {
		Node newnode = new Node(n);
		Node temp1=head;
		Node temp2=head;
		
		while(pos-->=0) {
			temp2=temp1;
			temp1=temp1.next;
		}
		temp2.next=newnode;
		newnode.next=temp1;
	}
	void display(Node head) {
		Node temp=head.next;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	void deletionAtFirst(Node head) {
		head.next=head.next.next;
	}
	
	void deletionAtMiddle(Node head,int pos) {
		Node temp=head;
		while(pos-->0) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
	void deletionAtEnd(Node head) {
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
	}
	
	
}


class Main {
	public static void main(String[] vdkh) {
		Node head= new Node();
		Node ob =new Node();
		ob.insertAtLast(head, 10);
		ob.insertAtLast(head, 20);
		ob.insertAtLast(head, 30);
		ob.display(head);
		ob.insertAtFirst(head, 0);
		ob.insertAtMiddle(head, 25, 3);
		ob.display(head);
		ob.deletionAtEnd(head);
		ob.display(head);
		
	}
}
