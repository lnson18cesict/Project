package Day_1;

import java.util.Scanner;

public class  Menu {
	static Employee[] employee; 
	public static void main(String[] args) {
		System.out.println("1. Create employee: ");
		System.out.println("2. Show the existing employee: ");
		System.out.println("3. Exit: ");
		System.out.println("--------------------------------------");
		int inputNumber = 0;

		do {

			Scanner scInput = new Scanner(System.in);
			System.out.println("nhap chuc nang ban muon:");
			inputNumber = scInput.nextInt();
			System.out.print("number:" + inputNumber);
			Object employeeNo;
			switch (inputNumber) {
			case 1:
				addEmployyee();
				break;
			case 2:
				System.out.println(" Show the existing employee: ");
				showEmployee();

				break;
			case 3:

				break;

			default:
				break;
			}
		} while (inputNumber != 3);

	}

	private static void showEmployee() {
		// TODO Auto-generated method stub
		System.out.println("STT    name      Salary        JobName");
		for(int i=0;i<employee.length;i++) {
			
			
		}
		
	}

	private static void addEmployyee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ban muon nhap them bao nhieu employee");
		int n = sc.nextInt();
		employee= new Employee[n];

		for (int i =0 ;i<employee.length;i++) {
			Scanner sc1 = new Scanner(System.in);
			
			
			System.out.println("name :");
			String name = sc1.nextLine();
			
			System.out.println("salary :");
			double salary = sc1.nextDouble();
			
			System.out.println("Job :");
			String Job = sc1.next();
			
			//Employee employee= new Employee( (i+1),name, salary, Job2);
			Employee employee = new Employee((i+1),name, salary, Job);
			employee[i] = employee;
			
		}
		
	}	

	}

