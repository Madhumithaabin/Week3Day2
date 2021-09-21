package Assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "PayPal India";
		// 1.Convert it into a character array
		char[] charArray = test.toCharArray();
//		2.Declare a Set as charSet for Character
		Set<Character> charSet = new HashSet<Character>();
//		3.Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new HashSet<Character>();

//		4.Iterate character array and add it into charSet
//5.If the character is already in the charSet then, add it to the dupCharSet
		for (int i = 0; i < charArray.length; i++) {
			if (charSet.add(charArray[i]) == false) {
				dupCharSet.add(charArray[i]);
			}

		}

//	6.Check the dupCharSet elements and remove those in the charSet

		charSet.removeAll(dupCharSet);
		System.out.println("DupCharSet elements in the charSet are removed:" + dupCharSet);

		System.out.println("Charset after removing empty space ");
//7.Iterate using charSet

		for (char finalseyt : charSet) {

			// 8.Check the iterator variable isn't equals to an empty space

			if (!Character.isSpace(finalseyt)) {
//		9.print it
				System.out.print(finalseyt + " ");

			}
		}

	}

}
