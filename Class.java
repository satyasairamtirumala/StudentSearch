package collections;

import java.util.Comparator;

public  class Class implements Comparator<Class> {

	int id;
	String name;
	double marks;
	public Class(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Class [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compare(Class o1, Class o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}
}
	
	


