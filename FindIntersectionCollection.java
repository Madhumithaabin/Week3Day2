package Assignments;

import java.util.List;
import java.util.ArrayList;

public class FindIntersectionCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> num1 = new ArrayList<Integer>();
		List<Integer> num2 = new ArrayList<Integer>();
		num1.add(3);
		num1.add(2);
		num1.add(11);
		num1.add(4);
		num1.add(6);
		num1.add(7);
		num2.add(1);
		num2.add(2);
		num2.add(8);
		num2.add(4);
		num2.add(9);
		num2.add(7);
		num1.retainAll(num2);
		System.out.println("Elements in first list are :" + num1);
		System.out.println("Elements in second list are :" + num2);
		System.out.print("Elements common in both list are :");
		for (int result : num1) {
			System.out.print(result + " ");
		}

	}

}
