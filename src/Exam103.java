
public class Exam103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emp = new Employee[3];
		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee("FirstName" + i, "LastName" + i, "Position" + i, 50000 + i);
		}
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].getFirstName() + ":" + emp[i].getLastName() + ":" + emp[i].getPosition() + ":"
					+ emp[i].getSalary());
		}
	}

}
