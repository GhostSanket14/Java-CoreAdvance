package All_Java_basics;

public class string {

	public static void main(String[] args) {

		String a="ABC";

		System.out.println(a.substring(1,3)); // BC
		
		if(a.contains("B")) {
			System.out.println("TRUE");
		}
		
		for(int i=0; i<a.length(); i++) {
			System.out.println(a.length());
		}
		
	}
}