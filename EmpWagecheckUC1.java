
/**
 * The Employee check class
 */
public class EmpWagecheckUC1 {


	private static final int IS_FULL_TIME=1;

	public static void main(String [] args){
		// Calling function
		empCheck();
	}
	/**
	 * Check employee is present
	 * */

	public static void empCheck(){

		double ranNumber = Math.floor(Math.random() * 10) % 2;
		if(IS_FULL_TIME == ranNumber){
			System.out.println("Employee is Present");
		}else{
			System.out.println("Employee is Absent");
		}
	}
}

