package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeAssignment4Missingnumber 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(10);
		numbers.add(6);
		numbers.add(8);


		Collections.sort(numbers);
		System.out.println(numbers);
		for(int i =0;i<numbers.size()-1;i++)
		{
			//if(i!=numbers.size())
			//{
				int k=numbers.get(i);
				if(numbers.get(i+1)==(k+1))
				{
					System.out.println("no missing number");
				}
				else
				{
					System.out.println("missing number "+ (k+1));
				}
			//}

		}
		int[] a= {6,2,5,9};
		Arrays.sort(a); //sort the array 2,5,6,9
		int start=1;
		int end=a[a.length-1]; //assume the array is not empty
		System.out.println("Missing numbers between "+start+" and "+end);
		for(int i=start;i<=end;i++)
		{
			if((Arrays.binarySearch(a, i))<0)
			{
				System.out.println(i+ " ");
			}
		}
		
		
		


	}

}
