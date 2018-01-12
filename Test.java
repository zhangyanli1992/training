package Clone;
	public class Test {
		public static void main(String[] args) throws CloneNotSupportedException {
			EmployeeBirth eb = new EmployeeBirth(2000, 10, 10);

			Employee e = new Employee("NDX", 20, "N", 200.0, 1, eb);
			
			Employee e1 = (Employee) e.clone();
			
			e1.getEmpBirth().setYear(1);
			
			System.out.println(e1.getEmpBirth().getYear());
			System.out.println(e.getEmpBirth().getYear());
			
		}
	}
		


