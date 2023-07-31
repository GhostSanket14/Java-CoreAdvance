package OOPs1_polymorphism;

public class usingCar {

	public static void main(String[] args) {

		vehicle V=new car(); // This is polymorphism. As every car is also a vehicle.
				// Here basically v can point to anywhere, either itself or all of its subclasses.
		
		// but here the v can use only vehicle specific elements. and elements that are common in both car and vehicle. Eg. print()
		
//		V.printC(); // V cant call the function of car
		V.printV(); // V can call the function of vehicle
		
	}
}