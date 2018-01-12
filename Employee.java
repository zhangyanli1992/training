package Clone;

public class Employee implements Cloneable{
	private String name;
	private int age;
	private String sex;
	private double salary;
	private int level;
	private EmployeeBirth empBirth;

	public Employee() {

	}

	public Employee(String name, int age, String sex, double salary, int level,
			EmployeeBirth empBirth) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
		this.level = level;
		this.empBirth = empBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public EmployeeBirth getEmpBirth() {
		return empBirth;
	}

	public void setEmpBirth(EmployeeBirth empBirth) {
		this.empBirth = empBirth;
	}

	public String toString() {
		return "[name=" + name + ",age=" + age + ", sex=" + sex + ",salary="
				+ salary + ",level=" + level + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
