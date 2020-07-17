import java.util.*;

public interface IComputeEmpWage{
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
	public void computeEmpWage();
	public int getTotalWage(String company);
}

public class CompanyEmpWage{
	//use final keyword

	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;


public CompanyEmpWage(String company, int empRatePerHours, int numOfWorkingDays, int maxHoursPerMonth) {
	//use this constructor
      this.company = company;
      this.empRatePerHours = empRatePerHours;
      this.numOfWorkingDays = numOfWorkingDays;
      this.maxHoursPerMonth = maxHoursPerMonth;
      totalEmpWage = 0;
   }

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
   public String toString() {
      return "Total Employee Wage for Company:" +company+" is: "+ totalEmpWage;
   }
}

public class EmpWageBuilder implements IComputeEmpWage {
	//Constans
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;
	private ArrayList<CompanyEmpWage> companyEmpWageArrayList;
	private ArrayList<Integer> dailyWageList<>();
}

	public EmpWageBuilderArray() {
		companyEmpWageArrayList = new ArrayList<>();
		dailyWageList = new ArrayList<>();
	}

	public void addCompanyEmpWage(String company, int empRatePerHours, int numOfWorkingDays, int maxHoursPerMonth) {
		CompanyEmpWage companyEmpWage  = new CompanyEmpWage(company, empRatePerHours, numOfWorkingDays, maxHoursPerMonth);
		companyEmpWageArrayList.add(companyEmpWage);
	}

	public void computeEmpWage() {
		for (int i = 0; i < companyEmpWageArrayList.size(); i++){
			CompanyEmpWage companyEmpWage = companyEmpWageArrayList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}
        
        public void computeDailyWage(){
		for (int i=0; i < companyEmpWageArrayList.size(); i++){
			CompanyEmpWage companyEmpWage = companyEmpWageArrayList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}


	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		//Variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
      //Computation
      System.out.println("Welcome to Employee Wage Computation");
      while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
         totalWorkingDays++;
         int empCheck = (int) Math.floor(Math.random() * 10) % 3;
         switch(empCheck) {
            case IsPartTime:
               empHrs = 8;
               break;
            case IsFullTime:
               empHrs = 12;
               break;
            default:
               empHrs = 0;
         }
         totalEmpHrs += empHrs;
         System.out.println("Day#: " + totalWorkingDays + "Employee Hours: " + empHrs);
      }
      return totalEmpHrs * companyEmpWage.empRatePerHours;
   }

	public static void main(String[] args) {
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("DMart", 20, 20, 100);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 50);
		empWageBuilder.computeEmpWage();
	}
}
