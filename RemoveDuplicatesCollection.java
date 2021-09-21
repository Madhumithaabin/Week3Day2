package Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		Set<String> test = new LinkedHashSet<String>();
		String[] split = text.split(" ");
		for (String result : split) {
			test.add(result);
		}
		String resultstring = "";
		for (String uniq : test) {
			resultstring += " " + uniq;
		}
		System.out.println("Displaying the String without duplicate words :" + resultstring);

	}

}
