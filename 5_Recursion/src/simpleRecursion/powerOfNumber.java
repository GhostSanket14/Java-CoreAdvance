package simpleRecursion;

public class powerOfNumber {

	
	public static int power(int base, int power) {
		if(power==0) {
			return 1;
		}
		int smlAns=power(base, power-1);
		return base*smlAns;
	}
		
	public static void main(String[] args) {
		powerOfNumber obj=new powerOfNumber();
		System.out.println(obj.power(4,3));
	}
}