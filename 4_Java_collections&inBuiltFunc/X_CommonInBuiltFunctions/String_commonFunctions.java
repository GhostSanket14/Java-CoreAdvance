package X_CommonInBuiltFunctions;

import java.util.Arrays;

public class String_commonFunctions {

	public static void main(String srgs[]) {

		// STRING BUFFER.
		
		StringBuffer sb=new StringBuffer("GHost");
		System.out.println(sb);
		
		sb.append("14");
		System.out.println(sb);
		sb.insert(1,"Kolhapur"); // This will insert at index 1.
		System.out.println(sb);	
		sb.reverse();
		System.out.println(sb);
	
	}
}