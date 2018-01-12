package Clone;

public class EmployeeBirth implements Cloneable{
		private int year;
		private int month;
		private int day;

		public EmployeeBirth(int year, int month, int day) {
			super();
			this.year = year;
			this.month = month;
			this.day = day;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		@Override
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}

	}



