package project1;

public class SalaryCalculation1 {
	public static double cnt(Employee employee, double oth, double leaves) {
        double basicSalary = employee.getBasicSalary();
        double homeallowances = employee.getHomeallowances();
        double transportallowances = employee.getTransportallowances();
        double deductions = employee.getDeductions();
         
    
        double otpr = basicSalary / 230; 
        double otp = oth * otpr;

        double grossSalary = basicSalary + homeallowances + transportallowances + otp;

        double leaveDeduction = basicSalary / 26 * leaves;
        
        double totalDeductions = deductions ;
        
        double tax = 0.18 * basicSalary ;
        
        
        double netSalary = grossSalary - totalDeductions-tax - leaveDeduction;
        return netSalary;
    }
}


