package selenium;

public class PalandromeWithString {

	public static void main(String[] args) {
		
		
		String org = "madam";
		
		
		
		String rev = "";
		
		int len = org.length();
		
		for(int i = len-1;i>=0;i--)
		{
			rev = rev + org.charAt(i);
			
		}
		
		System.out.println(rev);
		
		if(rev.equals(org))
		{
		
			System.out.println("Given string is Palandrome");
		}
		else
		{
			System.out.println("Given string is NOT Palandrome");
		}
		

	}

}
