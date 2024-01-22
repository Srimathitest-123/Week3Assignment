package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeAssignment3Largest {
	
	public static void main(String[] args) {
	
	List<Integer> numbers=new ArrayList<Integer>();
	numbers.add(3);
	numbers.add(2);
	numbers.add(11);
	numbers.add(6);
	numbers.add(7);
Collections.sort(numbers);
int size1=numbers.size();
System.out.println("Total numbers count "+ numbers.size());
System.out.println("Values "+ numbers);

System.out.println("2nd Max "+ numbers.get(size1-2));


	
	}
	

}
