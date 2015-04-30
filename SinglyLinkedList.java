/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class SinglyLinkedList<E>
{
	private Node<E> head;
	public SinglyLinkedList(){
		head = null;
	}
	public void add(E item){
		if(head == null){
			head = new Node<E>(item);
		}
		else{
			Node<E> temp = head;
			
			while (temp.next != null){
				temp = temp.next;
			}
			temp.next = new Node<E>(item);
		}
	}
	public String traverse(){
		Node<E> nodeRef = head;
		String result = "";
		while(nodeRef != null){
			result += "[" + nodeRef.data.toString() + "]" + " ";
			nodeRef = nodeRef.next;
		}
		return result;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		SinglyLinkedList<String> sll = new SinglyLinkedList<String>();
		sll.add("head");
		sll.add("shoulder");
		sll.add("knees");
		sll.add("toes");
		System.out.println(sll.traverse());
	}
}
