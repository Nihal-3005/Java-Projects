package project1;
import java.util.*;

public class PayslipGeneration {
   public static void main(String [] args) {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter Employee ID : ");
	   int id=scanner.nextInt();
	   scanner.nextLine();
	   System.out.println("Enter Employee name : ");
	   String name=scanner.nextLine();
	   System.out.println("Enter Date : ");
	   String date=scanner.nextLine();
	   Employee e=new Employee();
	   e.SetEid(id);
	   e.SetEname(name);
	   e.SetEdep("Developer");
	   e.SetEworkingday("26");
	   e.SetBasicSalary(30000);
	   e.SetHomeallowances(2000);
	   e.SetTransportallowances(1000);
	   e.SetDeductions(300);
	   e.SetDy(date);
	   
	   
       System.out.print("Enter overtime hours: ");
       double oth = scanner.nextDouble();
       System.out.print("Enter leaves: ");
       double leaves = scanner.nextDouble();
	   
      
	   double netSalary = SalaryCalculation1.cnt(e, oth , leaves);
       
      System.out.println("--------------------------------SALARY SLIP--------------------------------------");
      System.out.println("Company Name        : "+"Evergreen Technologies Pvt. LTd Pune."+ "  Month & Year: "+e.getDy());
      System.out.println("Empolyee Name       : "+e.getEname() );
      System.out.println("Empolyee ID         : "+e.getEid()  +"                 Empolyee Working days : "+e.getEworkingday());
      System.out.println("Empolyee Department : "+e.getEdep() +"           Leave                 : "+ leaves  );
      System.out.println("---------------------------------------------------------------------------------");
      System.out.println("Description             Earnings Amount      Deductions Amount");
      System.out.println("---------------------------------------------------------------------------------");
      System.out.println("Basic Salary            "+e.getBasicSalary());
      System.out.println("Home Allowances         "+e.getHomeallowances());
      System.out.println("Transport Allowances    "+e.getTransportallowances());
      System.out.println("Overtime Pay            "+e.getBasicSalary() / 230 * oth);
      System.out.println("Other Deductions                             " + (e.getDeductions()));
      System.out.println("Leaves Deductions                            " + (e.getBasicSalary() / 26 * leaves));
      System.out.println("Tax                                          " + 0.18 * e.getBasicSalary() );
      System.out.println("_________________________________________________________________________________");
      System.out.println("Net Salary              " + netSalary);
      
      scanner.close();
   }
}

