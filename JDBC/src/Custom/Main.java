package Custom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import Connet.*;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = Connect_Mysql.getMyConnection();
		Statement statement =  connection.createStatement();

		
		Scanner scanner = new Scanner(System.in);
		int inputNumber;
		do {
			System.out.println("-----MENU----- ");
			System.out.println("1: Them");
			System.out.println("2: Sửa  ");
			System.out.println("3: Xóa ");
			System.out.println("4: Hiển thị");
			System.out.println("-------------------------------");
			inputNumber = scanner.nextInt();
			switch (inputNumber) {
			case 1:
				System.out.println("Nhap so lương nv muon them: ");
				int num;
				Scanner key = new Scanner(System.in);
				num = key.nextInt();
				for (int i = 1; i <= num; i++) {
					System.out.println("Nhap thong tin nv thu: " + i);
					
					Scanner key1 = new Scanner(System.in);
					System.out.println("ID: ");
					int id = key1.nextInt();

					Scanner key4 = new Scanner(System.in);
					System.out.println("LastName: ");
					String LastName = key4.nextLine();

					Scanner key2 = new Scanner(System.in);
					System.out.println("FirstName: ");
					String FirstName = key2.nextLine();

					Scanner key3 = new Scanner(System.in);
					System.out.println("Age: ");
					int Age = key1.nextInt();
					Customer customer = new Customer(id, LastName, FirstName, Age);
					//Customer_mysql.addCustomer(customer);
					String sql = "Insert into persons (ID, LastName, FirstName, Age )  values ('"+id+"', '"+LastName+"', '"+FirstName+"', '"+Age+"')";
					statement.executeUpdate(sql);
				}
				
				break;
			case 2:
				// Phần này sửa e chưa làm được ạ 
				break;
			case 3:
				System.out.println("Nhap id ban muon xoa: ");
				Scanner key1 = new Scanner(System.in);
				System.out.println("ID: ");
				int id = key1.nextInt();
				String sql2 = "DELETE FROM persons WHERE 	ID = '"+id+"';";
				int rowCount = statement.executeUpdate(sql2);
				System.out.println("Row Count affected = " + rowCount);
				break;
			case 4:
				String sql3 = "Select ID, LastName, FirstName, Age from persons ";
				ResultSet rs = statement.executeQuery(sql3);
				while (rs.next()) {
					int id1 = rs.getInt("ID");
					String LastName = rs.getString("LastName");
					String FirstName = rs.getString("FirstName");
					int age = rs.getInt("Age");
					System.out.println("-------");
					System.out.println("id: " + id1);
					System.out.println("LastName: " + LastName);
					System.out.println("FirstName: " + FirstName);
					System.out.println("Age: " + age);
				}
				break;
			}
			

		} while (inputNumber != 3);
	}

	/*
	 * private static void Insert() throws SQLException { // TODO Auto-generated
	 * method stub
	 * 
	 * 
	 * 
	 * }
	 */


	
}
