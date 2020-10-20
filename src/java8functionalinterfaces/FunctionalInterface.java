package java8functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface {

	public static void main(String[] args) {
		
		System.out.println("=============Function Functional Interface=========================");
		
		//function interface
		
		Function<String, Integer> func1 = (x)->x.length();
		
		System.out.println(func1.apply("Hello Sir"));
		
		System.out.println("=============Function Functional Interface with andThen method=========================");
		//chaining with function interface
		
		Function<Integer, Integer> func2 = (x)-> x * 2;

		int result = func1.andThen(func2).apply("Ravi");
		
		System.out.println(result);
		
		System.out.println("=============BiFunction Functional Interface=========================");
		
		BiFunction<Integer, Integer, Integer> bFunc = (i,j)-> i*j;
		
		int bResult = bFunc.apply(10, 20);
		
		System.out.println(bResult);
		
		System.out.println("=============Predicate Functional Interface=========================");
		
		Predicate<Integer> pFunc = (x)-> x>5;
		
		boolean b= pFunc.test(10);
		
		System.out.println(b);
		
		System.out.println("=============Consumer Functional Interface=========================");
		
		Consumer<String> cFunc = (s)->s.length();
		
		cFunc.accept("Sudha Rani");
		
	
		

	}

}
