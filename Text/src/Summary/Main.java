package Summary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static CanBo canBo = null;
	public static ArrayList arrayList = new ArrayList();
	public static Scanner scanner = new Scanner(System.in);
	public static int inputNumber = 0;

	public static void main(String[] args) {
		showMenu();
	}

	public static void showMenu() {
		do {
			System.out.println("-----MENU----- ");
			System.out.println("1: Nhap danh sach can bo");
			System.out.println("2: Tim kiem ");
			System.out.println("3: Hien thi ");
			System.out.println("-------------------------------");
			inputNumber = scanner.nextInt();
			switch (inputNumber) {
			case 1:
				Nhap();
				break;
			case 2:
				// Search();
				break;
			case 3:
				Show();
				break;
			}

		} while (inputNumber != 3);
	}

	public static void Nhap() {
		// TODO Auto-generated method stub
		do {
			System.out.println("Nhap nghe nghiep(Cong Nhan, Ky su, Nhan Vien)");
			Scanner sc = new Scanner(System.in);
			String NgheNgiep = sc.nextLine();
			
			if(NgheNgiep.equals("Cong Nhan")) {
				System.out.println("Nhap so Cong Nhan: ");
				int num;
				Scanner key = new Scanner(System.in);
				num = key.nextInt();
				for(int i=1; i<=num; i++) {
					System.out.println("Nhap thong tin Cong Nhan thu: "+i);
					
					Scanner key1 = new Scanner(System.in);
					System.out.println("Ho ten: ");
					String HoTen = key1.nextLine();
					
					System.out.println("Nam Sinh: ");
					double NamSinh = key.nextDouble();
					
					Scanner key2 = new Scanner(System.in);
					System.out.println("Dia chi: ");
					String DiaChi = key2.nextLine();
					
					Scanner key3 = new Scanner(System.in);
					System.out.println("Gioi Tinh: ");
					String GioiTinh = key3.nextLine();
					canBo = new CongNhan();
					arrayList.add(canBo);
				
				}
			}
				if(NgheNgiep.equals("Ky su")) {
					System.out.println("Nhap so ky su: ");
					Scanner keyy = new Scanner(System.in);
					int num = keyy.nextInt();
					for(int i=1; i<=num; i++) {
						System.out.println("Nhap thong tin Cong Nhan thu: "+i);
						
						Scanner key1 = new Scanner(System.in);
						System.out.println("Ho ten: ");
						String HoTen = key1.nextLine();
						
						System.out.println("Nam Sinh: ");
						double NamSinh = key1.nextDouble();
						Scanner key2 = new Scanner(System.in);
						System.out.println("Dia chi: ");
						String DiaChi = key2.nextLine();
						Scanner key3 = new Scanner(System.in);
						System.out.println("Gioi Tinh: ");
						String GioiTinh = key3.nextLine();
						canBo = new KySu();
						arrayList.add(canBo);
					
					}
				}
					if(NgheNgiep.equals("Nhan Vien")) {
						System.out.println("Nhap so Cong Nhan: ");
						Scanner keyy1 = new Scanner(System.in);
						int num = keyy1.nextInt();
						for(int i=1; i<=num; i++) {
							System.out.println("Nhap thong tin Cong Nhan thu: "+i);
							
							Scanner key1 = new Scanner(System.in);
							System.out.println("Ho ten: ");
							String HoTen = key1.nextLine();
							System.out.println("Nam Sinh: ");
							double NamSinh = key1.nextDouble();
							Scanner key2 = new Scanner(System.in);
							System.out.println("Dia chi: ");
							String DiaChi = key2.nextLine();
							Scanner key3 = new Scanner(System.in);
							System.out.println("Gioi Tinh: ");
							String GioiTinh = key3.nextLine();
							canBo = new NhanVien();
							arrayList.add(canBo);
						
						}
						
					}
				System.out.print("Nhap (Co/Khong) neu muon tiep tuc hay dừng lại: ");
				Scanner key4 = new Scanner(System.in);
				if(key4.nextLine().equals("Khong")) {
					break;
				}
			
		}while(true);
	}
	public static void Show() {
		//phần này em chưa làm được ạ.
	}
}
