package Session4;

public class Employee {
 //declaring variables of 4 different access modifiers
	private int salary;
	public String name;
	final String Cname="Pega Systems";
	protected String PName;
	
	public void setsalary(int arg1){
		this.salary = arg1;
	}
    public void getsalary(){
    	System.out.println("The salary of the employee is " +this.salary);
    }	
    public void getempdetails(){
    	displaydetails();
    }
	//Declaring methods of 4 different access modifiers
	private void displaydetails(){
		System.out.println("Employee name is " +this.name+ " his company name is "+this.Cname+"the project name is"+this.PName);
    	this.getsalary();
	}
	}
class main1{
	public static void main(String[] args){
		/* this class here explains the different ways of accessing
		 the prvate methods and variables and availability of other variables */
		
		
		Employee e1 = new Employee();
		e1.name = "Suhas";
		e1.PName = "Pega marketing";
		e1.setsalary(1000000);// we are able to access salary variable only through set method and displaye through display method defined
		e1.getempdetails();
	}
}
