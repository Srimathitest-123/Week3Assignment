package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeAssignment2Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(11);
		numbers.add(4);
		numbers.add(6);
		numbers.add(7);
		
		/*numbers.add(9);
		numbers.add(7);
		numbers.add(8);
		numbers.add(4);
		numbers.add(1);
		numbers.add(2);*/
		List<Integer> numbers2=new ArrayList<Integer>();
		numbers2.add(1);
		numbers2.add(2);
		numbers2.add(8);
		numbers2.add(4);
		numbers2.add(9);
		numbers2.add(7);
		Collections.sort(numbers);//2,3,4,6,7,11
		System.out.println(numbers);
		Collections.sort(numbers2);//1,2,4,7,8,9
		System.out.println(numbers2);
		
		if (numbers.equals(numbers2)==true)
		{
			System.out.println("Equal");

		}
		else
		{
			System.out.println("not Equal");

		}
		
		/*int result=0; //0-true, 1-false
		String match="";
		String notmatch="";

		for(int i=0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));

			if (result==0)
			{
				for(int j=0;i<numbers2.size();j++)
				{
					if(numbers.get(i).equals(numbers.get(j))
					{
						result=0;
						match=match+","+numbers.get(i);
						break;
					}
					else
					{
						result=1;
					}
				}
			}
			else
			{
				break;
			}

		}
		System.out.println("matching values "+ match);
		if(result==0)
		{
			System.out.println("matching "+ match);
		}
		else
		{
			System.out.println("not matching ");

		}*/
		




	}

}
