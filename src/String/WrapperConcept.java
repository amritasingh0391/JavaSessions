package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WrapperConcept {

	public static void main(String[] args) {
		
		String X = "100";
		System.out.println(X+20);
		
		//String to int
		int i = Integer.parseInt(X);
		System.out.println(i+20);
		
		String Y = "100USD";
		//int j = Integer.parseInt(Y);
		System.out.println(Y+20);//
		String Curr[] = Y.split("USD");
		System.out.println(Arrays.toString(Curr));
		int k = Integer.parseInt(Curr[0]);
		System.out.println(k+20);
		
		//String to Double
		String Z= "12.33";
		System.out.println(Z+20);
		double d = Double.parseDouble(Z);
		System.out.println(d+20);
		
		//String to Boolean
		String headless = "true";
		Boolean W = Boolean.parseBoolean(headless);
		System.out.println(W);
		
		//int to String
		int K= 100;
		String K1 = String.valueOf(K);
		System.out.println(K1);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
	

	}

}
