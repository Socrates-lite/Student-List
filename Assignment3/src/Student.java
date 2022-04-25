import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.xml.soap.Node;

public class Student implements StudentList {
	
	private int snumber;
	private double marks;
	private int size;

	
	private Student head;
	private Student next;
	

	
	
	
	public Student(int snumber, double marks) {
		this.snumber = snumber;
		this.marks = marks;
	}
	
	public Student() {

		head = null;
	}
		public Student(Student next) {
			
			this.next = next;
		
	}
	
	
	@Override
	public boolean isEmpty() { //user check method
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public int size() {//user check method
		// TODO Auto-generated method stub
		return size;
	}
	



	@Override
	public void add(int snumber, double marks) {    //Every time you read in a line from the file, dynamically create a new node containing that
													//student’s number and mark, and insert it in the correct position in the linked list. For
		
		// TODO Auto-generated method stub
		
		Student new_entry = new Student(snumber,marks); 
		
		Student prev = null;
		Student curr = head;
		
		while(curr != null && curr.marks > marks ) {
			prev = curr;
			curr = prev.next;
		}
		
		if(curr == head) {
			new_entry.next = head; 
			head = new_entry; // assigning head to the value if it is the lowest
		}
		
		else{
			prev.next = new_entry;
			new_entry.next = curr;
		}
	
	}
	
	public int findSize() {
		return findSize(head);
	
	}
	
	private int findSize(Student h) {
		if(h == null) return 0;
		
		
		return 1 + findSize(h.next);
	}
	
	public Student findMedian() {
		
		return findMedian(head, findSize() / 2);
	}
	
	private Student findMedian(Student h, int i) {
		
		if(i == 0) return h;
		return findMedian(h.next, i--);
	}
	


	@Override
	public void printList() {
		// TODO Auto-generated method stub
		System.out.println("Student Number: 	Marks: ");
		System.out.println("==================	===========");
		
		Student curr = head;
		
		while(curr != null) {
			System.out.println(String.format("%-23d $%.1f", curr.snumber, curr.marks));
			curr = curr.next;
		}
		
	}


}
