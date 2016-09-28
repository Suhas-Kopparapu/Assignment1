package Session4;

public class main4 {
	public static void main(String[] args){
		Employee e3 = new Employee();
		// private variables and method cannot be accessed by e3 object
		System.out.println(e3.Cname);//accessed default level variable
		e3.setsalary(100);
		e3.getsalary();//public method is accessed same applies for variable
		e3.name="chetan";
		System.out.println(e3.name);//accessing public variable
		
		
	}

}
