package java8concepts;

public class MemebrInnerClassJava7 {
	
	/*
	 * non static class is created in side the class and outside the method
	 */
	
	private int data = 20;
	class MemebrClass{
		
		void msg()
		{
			System.out.println("data is "+data);
		}
		
	}

	public static void main(String[] args) {
	
		MemebrInnerClassJava7 obj = new MemebrInnerClassJava7();
		
		MemebrInnerClassJava7.MemebrClass mIn= obj.new MemebrClass();
		
		mIn.msg();
		
	}

}
