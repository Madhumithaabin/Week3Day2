package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(7);
		num.add(6);
		num.add(8);
		Collections.sort(num);
		
		int i, numberofindex = 0;
		int size=num.size();
		System.out.print("Elements in List are :");
		for (i = 0; i < size; i++)
			System.out.print(num.get(i) + " ");
		System.out.print("\nMissing element from List : ");
		for (i = 0; i < num.get(size - 1); i++) {
			if (num.get(numberofindex) != i + 1) {
				System.out.print(i + 1 + " ");

			} else {
				numberofindex++;
			}
		}

	}

}
