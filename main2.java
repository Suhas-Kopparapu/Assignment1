package Sesion3;
import Session4.*;

public class main2 extends Employee {
	public static void main(String[] args){
		main2 m = new main2();
		m.PName = "protected check";
	/* here the prtected variable or method it can be accessed only by the extended class
		not by importing the package , here m3 cannot access it
		*/
	}

}
class main3 {
	main3 m3 = new main3();
	
}
