package Assignments;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		List<Integer> num = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		int i, j, count;
		for (i = 0; i < arr.length; i++) {
			num.add(arr[i]);
		}
		System.out.println("Elements in a list are :" + num);

		for (i = 0; i < num.size(); i++) {
			count = 0;
			for (j = i + 1; j < num.size(); j++) {
				if (num.get(i) == num.get(j)) {
					result.add(num.get(i));
					count = 1;
				}
				if (count != 0)
					break;

			}
		}
		System.out.print("Duplicate Elements in a list are : ");

		for (int finallist : result) {

			System.out.print(finallist + " ");

		}

	}

}
