package Task;

import java.util.Comparator;
import java.util.HashMap;

public class ComparatorByBroi implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 == o2) {
			return 1;
		}
		return (o1 - o2)*-1;
	}

	



	

	
	
}
