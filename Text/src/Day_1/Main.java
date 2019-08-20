package Day_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Job job1 = new Job("HR");
		Job job2 = new Job("BA");
		Job job3 = new Job("Tester");
		Job job4 = new Job("Deveoper");
		Job job5 = new Job("CEO");
		
		Employee nv1 = new Employee(1, "Nguyen van a \n", 3000, job1);
		Employee nv2 = new Employee(2, "Nguyen van b \n", 3000, job2);
		Employee nv3 = new Employee(3, "Nguyen van c \n", 3000, job3);
		Employee nv4 = new Employee(4, "Nguyen van d \n", 3000, job4);
		Employee nv5 = new Employee(5, "Nguyen van e \n", 3000, job5);
		/*System.out.println("ID: " + nv1.id + "\nName: " + nv1.name + "Salary: " + nv1.salary + "\nJob: " + nv1.job.namee);
		System.out.println("ID: " + nv2.id + "\nName: " + nv2.name + "Salary: " + nv2.salary + "\nJob: " + nv2.job.namee);
		System.out.println("ID: " + nv3.id + "\nName: " + nv3.name + "Salary: " + nv3.salary + "\nJob: " + nv3.job.namee);
		System.out.println("ID: " + nv4.id + "\nName: " + nv4.name + "Salary: " + nv4.salary + "\nJob: " + nv4.job.namee);
		System.out.println("ID: " + nv5.id + "\nName: " + nv5.name + "Salary: " + nv5.salary + "\nJob: " + nv5.job.namee);*/
		Employee[] employeeArray = new Employee[5];
		
		employeeArray[0] =  nv1;
			/*Scanner in = new Scanner(System.in);
			System.out.println("Nhap ID: ");
			nv1.id = in.nextInt(); 
			System.out.println("Nhap Name: ");
			Scanner in2 = new Scanner(System.in);
			nv1.name = in2.nextLine();
			System.out.println("Nhap Salary: ");
			Scanner in3 = new Scanner(System.in);
			nv1.salary = in3.nextDouble();*/
		employeeArray[1] =  nv2;
			/*Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ID: ");
			nv2.id = sc.nextInt(); 
			System.out.println("Nhap Name: ");
			Scanner sc2 = new Scanner(System.in);
			nv2.name = sc2.nextLine();
			System.out.println("Nhap Salary: ");
			Scanner sc3 = new Scanner(System.in);
			nv3.salary = sc3.nextDouble();*/
		employeeArray[2] =  nv3;
		employeeArray[3] =  nv4;
		employeeArray[4] =  nv5;
		
		for(int i = 0; i< employeeArray.length; i++ ) {
			System.out.println("ID: " + employeeArray[i].id + "\nName: " + employeeArray[i].name + "Salary: " + employeeArray[i].salary + "\nJob: " + employeeArray[i].job.namee);
		}
		
		
	}
	
	
}