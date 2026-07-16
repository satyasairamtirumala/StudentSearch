package collections;

import java.util.Comparator;

public class SName implements Comparator<Class> {

	@Override
	public int compare(Class o1, Class o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
