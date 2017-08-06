import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListMain {
	public static void findDuplicate(ArrayList<String>arrayList,ArrayList<String>arrayList2)
	{
		System.out.println("enter a string to check for duplicate and delete");
		String a=new Scanner(System.in).nextLine();
		for(String h : arrayList)
		{
			


			if(h.equals(a))
			{
				
			arrayList2.remove(h);
			
		
			}
			
		
		}
		
		System.out.println(arrayList2.toString());
	}
public static void main(String[]args)
{
	ArrayList<String>arrayList=new ArrayList<String>();
	arrayList.add("abc");
	arrayList.add("efg");
	arrayList.add("hij");
	arrayList.add("abc");
	System.out.println(arrayList.toString());
	
	ArrayList<String>arrayList2=new ArrayList<String>(arrayList);
    findDuplicate(arrayList,arrayList2);
	
	
	
}
}
