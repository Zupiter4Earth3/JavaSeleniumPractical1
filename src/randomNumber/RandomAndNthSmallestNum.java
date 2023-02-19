package randomNumber;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RandomAndNthSmallestNum {
	

	public static void main(String[] args) {
		Set<Integer> numbers = new TreeSet<Integer>();
		Random rdn = new Random();
		
		while(numbers.size()!=500) {
			numbers.add(rdn.nextInt(999));
			
		}
		System.out.println("Random numbers:" + numbers);
		System.out.println("Total random numbers: "+ numbers.size());
		// Converting HashSet to Array
        Integer[] numbersArray = numbers.toArray(new Integer[numbers.size()]);
        
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the nth position of smallest number");
		int nthOfSmallestNum = input.nextInt();
        System.out.println(nthOfSmallestNum + "th smallest number is: "
                + numbersArray[nthOfSmallestNum-1]);
        

	}

}
