package collections;

import java.util.Comparator;

public class Marks implements Comparator<Class> {

	@Override
	public int compare(Class o1, Class o2) {
		// TODO Auto-generated method stub
		return (int)o1.marks-(int)o2.marks;
	}

}
