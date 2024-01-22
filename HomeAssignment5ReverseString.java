package week3.day2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeAssignment5ReverseString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> name=new ArrayList<String>();
		name.add("HCL");
		name.add("Wipro");
		name.add("Aspire Systems");
		name.add("CTS");
		Collections.sort(name);
		System.out.println(name);

		int count=name.size();
		System.out.println(count);

		for(int i= count-1;i>=0;i--)		
		{
			System.out.println(name.get(i));
		}
		

	}

}
