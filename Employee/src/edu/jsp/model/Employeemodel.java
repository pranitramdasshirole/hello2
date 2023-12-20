package edu.jsp.model;

public class Employeemodel 
{
    private String Ename;
    private String Eaddress;
    private int salary;
    private int Eid;
    private String Bond;
    
    
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getEaddress() {
		return Eaddress;
	}
	public void setEaddress(String eaddress) {
		Eaddress = eaddress;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getBond() {
		return Bond;
	}
	public void setBond(String bond) {
		Bond = bond;
	}
    
	
	public Employeemodel(String Ename, String Eaddress,int salary , int Eid ,String Bond) {
		super();
		this.Ename = Ename;
	    this.Eaddress = Eaddress;
		this.salary = salary;
		this.Eid = Eid;
		this.Bond=Bond;
	}
	
	
	
	@Override
	public String toString() {
		return "Employeemodel [Ename=" + Ename+ ", Eaddress=" + Eaddress + ", Salary"
				+ salary + ", Eid=" + Eid + " bond "+ Bond +"]";
	}
	
	
	
	
    
}
