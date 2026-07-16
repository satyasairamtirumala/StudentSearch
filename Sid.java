package collections;

import java.util.Comparator;

public class Sid  implements Comparator<Class>{

	@Override
	public int compare(Class o1, Class o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}
}
