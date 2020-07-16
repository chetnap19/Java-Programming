public class EmpWageCheckUC9{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static void computeEmpWage(final Company company){
		//variable
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= company.getMaxHrsInMonth() && totalWorkingDays <  company.getTotalWorkingDays()){
			totalWorkingDays++;
			final int value = (int) Math.floor(Math.random() * 10) % 3;
			switch(value){
				case 1:
					empHrs = 4;
					break;
				case 2:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
					break;
			}
			totalEmpHrs+=empHrs;
			System.out.println("Day#: "+totalWorkingDays + " Emp Hrs: "+ empHrs);
		}
		final int wage = totalEmpHrs * company.getEmpRate();
		company.setTotalEmpWage(wage);
	}
	public static void main(String[] args){
		//for Apple
		final Company apple = new Company("Apple", 20, 20, 100);
	        computeEmpWage(apple);
		System.out.println("Total Emp wage for"+apple.getName() +": "+ apple.getTotalEmpWage());

		//for Samsung
		final Company samsung = new Company("Samsung", 22, 30, 120);
	        computeEmpWage(samsung);
		System.out.println("Total Emp wage for"+samsung.getName() +": "+ samsung.getTotalEmpWage());
	}
}

class Company{
	private String name;
	private int empRate;
	private int totalWorkingDays;
	private int maxHrsInMonth;
     private int totalEmpWage;

	public Company(){
	
}
	public Company(final String name, final int empRate, final int totalWorkingDays, final int maxHrsInMonth){
		this.name = name;
		this.empRate = empRate;
		this.totalWorkingDays = totalWorkingDays;
		this.maxHrsInMonth = maxHrsInMonth;
	}
	public void setName(final String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void setEmpRate(final int empRate){
		this.empRate = empRate;
	}

        public int getEmpRate(){
		return empRate;
	}

	public void setTotalWorkingDays(final int totalWorkingDays){
		this.totalWorkingDays = totalWorkingDays;
	}

	public int getTotalWorkingDays(){
		return totalWorkingDays;
	}

	public void setMaxHrsInMonth(final int monHrsInMonth){
		this.maxHrsInMonth = maxHrsInMonth;
	}

	public int getMaxHrsInMonth(){
		return maxHrsInMonth;
	}
	
	public void setTotalEmpWage(final int totalEmpWage){
		this.totalEmpWage = totalEmpWage;
	}

	public int getTotalEmpWage(){
		return totalEmpWage;
	}
}


