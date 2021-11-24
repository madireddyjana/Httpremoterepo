package validationofanemail;

class Employees {

	String emaild;

	Employees(String emailid) {
		this.emaild = emailid;
	}

}

public class EmployeesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declare an array of Strings
		Employees[] arr;

		arr = new Employees[5];

		arr[0] = new Employees("geetha@gmail.com");
		arr[1] = new Employees("john@outlook.com");
		arr[2] = new Employees("jana@yahoo.com");
		arr[3] = new Employees("varsha@gmail.com");
		arr[4] = new Employees("hari@gmail.com");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Employees of email id = " + arr[i].emaild);
		}

	}

}
