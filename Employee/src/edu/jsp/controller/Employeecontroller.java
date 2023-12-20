 package edu.jsp.controller;

import java.util.ArrayList;

import edu.jsp.model.Employeemodel;

public class Employeecontroller extends Employeemodel
{
	
	
	public static ArrayList<Employeemodel>Employee = new ArrayList<>();

	public Employeecontroller(String Ename, String Eaddress, int salary, int Eid, String Bond) 
	{
		super(Ename, Eaddress, salary, Eid, Bond);
		
	}
	
	
	
	
	public void saveEmp(Employeecontroller emp1)
	{
		Employee.add(emp1);
		
			
	}
	
	
	
	
	
	
	public static boolean removeEmployee(int id) {
        return Employee.removeIf(e -> e.getEid() == id);
    }
	
	
	public static ArrayList<Employeemodel> viewEmp()
	{
		return Employee;
	}

	
	
	
	 public static  boolean updateEmployee(Employeemodel updatedEmployee) {
	        for (int i = 0; i < Employee.size(); i++) {
	            if (Employee.get(i).getEid() == updatedEmployee.getEid()) {
	                Employee.set(i, updatedEmployee);
	                return true;
	            }
	        }
	        return false;
	    }
	}
		

