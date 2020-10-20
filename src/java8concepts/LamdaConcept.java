package java8concepts;

import java8functionalinterfaces.WebPage;

public class LamdaConcept {

	public static void main(String[] args) {
	
		WebPage obj=(value)->{System.out.println("Hello My name is "+value);};
		obj.msg("Ravi");
		
		/*
		 *Prior to Java 8
		WebPage obj = new WebPage() {
			
			@Override
			public void msg() {
			System.out.println("Hello Ravi");
				
			}
		};
		
		obj.msg();
*/
	}

}
