package Assignments;

import java.util.*;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 3, 2, 11, 4, 6, 7 };
		List<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			num.add(data[i]);
		}

		Collections.sort(num);
		int size = num.size();
		System.out.println("Elements in the list :" + num);

		System.out.println("Second largest element in the list is :" + num.get(size - 2));
	}

}
