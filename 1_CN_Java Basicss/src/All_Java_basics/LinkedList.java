package All_Java_basics;
import java.util.Scanner;
import java.io.*;

public class LinkedList {
	static class Node { // A static sub-class is created.

		int data;
		Node next;
		
		Node(int d) {
			data = d;
			next = null;
		}
	}
	public static Node insert()	{
		Scanner sc=new Scanner(System.in);
		Node head=null;
		int data=sc.nextInt();
		while(data!=-1) {
		Node new_node = new Node(data);
		new_node.next = null;
		
		if (head == null) {	// If the LL is empty.
			head = new_node;
		}
		else {	// If the LL is not empty.
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			// Insert the new_node at last node
			last.next = new_node;
		}
		data=sc.nextInt();
		}
		return head;
	}
	public static void printList(Node head)
	{
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;	// Go to next node
		}
		System.out.println();
	}
	public static Node deleteByKey(Node head, int key) // BELOW temp != null basically means LL is empty OR not.
	{
		Node temp = head, prev = null;
		// CASE 1:If head node itself holds the key to be deleted
		if (temp != null && temp.data == key) {
			head = temp.next; // Changed head
			System.out.println(key + " : deleted");
			return head;
		}
		// CASE 2:If the key is somewhere other than at head
		while (temp != null && temp.data != key) {	// If temp does not hold key, continue to next node
			prev = temp;
			temp = temp.next;
		} 
		if (temp != null) { // If the key was present, it should be at temp Therefore the temp shall not be null
			// Since the key is at temp Unlink temp from linked list
			prev.next = temp.next;

			System.out.println(key + " : deleted");
			return head;
		}
		// CASE 3: The key is not present
		if (temp == null) { // If key was not present in linked list head should be null
			System.out.println(key + " not found");
		}
		return head;
	}

	// method to create a Singly linked list with n nodes
	public static void main(String[] args)
	{
		/* Start with the empty list. */
		LinkedList list = new LinkedList();
		Node head =insert();
		printList(head);

		head=deleteByKey(head, 1);
		printList(head);

		head=deleteByKey(head, 4);
		printList(head);

		head=deleteByKey(head, 10);
		printList(head);
	}
}