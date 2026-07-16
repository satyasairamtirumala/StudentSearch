package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Class> ar=new ArrayList<Class>();
		ar.add(new Class(10, "satya", 92.2));
		ar.add(new Class(11, "rajesh", 85));
		ar.add(new Class(5, "aditya", 100));
		ar.add(new Class(1, "sam", 34));
		ar.add(new Class(2, "jan", 33));
		System.out.println("Enter the choice");
		int op=sc.nextInt();
		Comparator<Class> c=null;
		if(op==1) {
			c=new Sid();
		}
		else if(op==2) {
			c=new SName();
		}
		else if(op==3) {
			c=new Marks();
		}
		else {
			c=new Sid();
		}
		Collections.sort(ar,c);
		System.out.println(ar);
	}

	

}
