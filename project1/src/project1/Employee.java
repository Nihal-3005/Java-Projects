package project1;

public class Employee {
	private int eid;
	private String ename;
	private String edep;
	private String eworkingday;
	private String dy;
	private double transportallowances;
	private double basicSalary;
	private double homeallowances;
	private double deductions;
	
	
	
	public void SetEid(int eid) {
		this.eid=eid;
	}
	public void SetEname(String ename) {
		this.ename=ename;
	}
	public void SetEdep(String edep) {
		this.edep=edep;
	}
	public void SetEworkingday(String eworkingday) {
		this.eworkingday=eworkingday;
	}
	public void SetTransportallowances(double transportallowances) {
		this.transportallowances=transportallowances;
	}
	public void SetDy(String dy) {
		this.dy=dy;
	}
	public void SetBasicSalary(double basicSalary) {
		this.basicSalary =basicSalary;
	}
	public void SetHomeallowances(double homeallowances) {
		this.homeallowances=homeallowances;
	}
	public void SetDeductions(double deductions) {
		this.deductions=deductions;
	}

	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public String getEdep() {
		return edep;
	}
	public String getEworkingday() {
		return eworkingday;
	}
	public double getTransportallowances() {
		return transportallowances;
	}
	public double getBasicSalary() {
        return basicSalary;
    }
    public double getHomeallowances() {
        return homeallowances;
    }
    public double getDeductions() {
        return deductions;
    }
    public String getDy() {
    	return dy;
    }
}
	

