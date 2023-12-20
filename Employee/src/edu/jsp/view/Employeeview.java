package edu.jsp.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import edu.jsp.controller.Employeecontroller;
import edu.jsp.model.Employeemodel;

public class Employeeview {

	public static void main(String[] args) throws NumberFormatException, IOException {

		ArrayList<Employeemodel> e;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 Employeecontroller emp1 =new Employeecontroller("pranit","Nerul",1,1,"4"); 
		System.out.println("Welcome to our system");

		while (true) {
			System.out.println("Enter your choice:\n1.Add\n2.Display\n3.Delete\n4.Update\n5.Exit");
			int c = Integer.parseInt(br.readLine());

			if (c == 1) {
				System.out.println("Enter Your Name");
				String name = br.readLine();

				System.out.println("Enter user Eaddress:");
				String Eaddress = br.readLine();

				System.out.println("Enter user salary:");
				int salary = Integer.parseInt(br.readLine());

				System.out.println("Enter user Eid:");
				int Eid = Integer.parseInt(br.readLine());

				System.out.println("Enter user Bond:");
				String Bond = br.readLine();

				Employeecontroller emp2 = new Employeecontroller(name, Eaddress, salary, Eid, Bond);
				emp1.saveEmp(emp2);

			}
			if (c == 2) {
				System.out.println("Enter arraylist is:");
				e = Employeecontroller.viewEmp();
				System.out.println(e);

			}
			if (c==3) {
				  Scanner scanner = new Scanner(System.in);

			        System.out.print("Enter ID of the employee to remove: ");
			        int id = scanner.nextInt();

			        if (Employeecontroller.removeEmployee(id)) {
			            System.out.println("Employee removed successfully!");
			        } else {
			            System.out.println("No employee found with the given ID.");
			        }
			}
			
			if (c==4) {
				 
				        System.out.print("Enter ID of the employee to update: ");
				        Scanner scanner=new Scanner(System.in);
						int Eid = scanner.nextInt();

				        Employeemodel existingEmployee = findEmployeeById(Eid);

				        if (existingEmployee != null) {
				            System.out.println("Enter updated details:");
				            System.out.println("Enter Your Name");
							String name = br.readLine();

							System.out.println("Enter user Eaddress:");
							String Eaddress = br.readLine();

							System.out.println("Enter user salary:");
							int salary = Integer.parseInt(br.readLine());

							System.out.println("Enter user Eid:");
							int Eid1 = Integer.parseInt(br.readLine());

							System.out.println("Enter user Bond:");
							String Bond = br.readLine();

				            Employeemodel updatedEmployee =new Employeemodel(name, Eaddress, salary, Eid1, Bond);         		
				            		if (Employeecontroller.updateEmployee( updatedEmployee)) {
				                System.out.println("Employee updated successfully!");
				            } else {
				                System.out.println("Failed to update employee.");
				            }
				        } else {
				            System.out.println("No employee found with the given ID.");
				        }
				    }
		
	
			
			if (c == 5) {
				System.out.println("thanks you for using my appliction......");
				break;
				}
		}}

	 private static Employeemodel findEmployeeById(int id) {
	        List<Employeemodel> employees = Employeecontroller.viewEmp();
	        for (Employeemodel employee : employees) {
	            if (employee.getEid() == id) {
	                return employee;
	            }
	        }
	        return null;
	    }

	

	}

