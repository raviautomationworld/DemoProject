package selenium;

import java.util.ArrayList;

public class RemoveDublicateObjectFromList {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		
		
		//[1,2,2,3,3,]
		
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(3);
		al.add(3);
		
		al.forEach(a -> {
			System.out.println(a);
			});
		
		System.out.println(al);
		
		for(int i = 0;i<al.size();i++)
		{
			for(int j = 0;j<i;j++)
			{
					if(al.get(i)==al.get(j))
					{
				
					al.remove(i);
					}
			}
					
		}
		
		System.out.println("Removed dublicates from list::"+al);
		

	}
	}


