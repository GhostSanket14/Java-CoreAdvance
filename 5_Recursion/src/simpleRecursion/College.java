package simpleRecursion;

import java.util.*;

public class College{

	void show1() {
		System.out.println("Institution");
		}
}
class Teacher extends College{
void show2(){
System.out.println("teaches");
}
} 

class student extends Teacher{ 
	void show3(){
		System.out.println("studies");
	}
	
public static void main(String args[]){ 
	student d=new student();
d.show1();
d.show2();
d.show3();
}
}