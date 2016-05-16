import java.util.*;

public class task2 {
	
	public static void getMonthName(int monthNum) {
		if (monthNum == 1) {
			System.out.println("Январь");
		}
		if (monthNum == 2) {
			System.out.println("Февраль");
		}
		if (monthNum == 3) {
			System.out.println("Март");
		}
		if (monthNum == 4) {
			System.out.println("Апрель");
		}
		if (monthNum == 5) {
			System.out.println("Май");
		}
		if (monthNum == 6) {
			System.out.println("Июнь");
		}
		if (monthNum == 7) {
			System.out.println("Июль");
		}
		if (monthNum == 8) {
			System.out.println("Август");
		}
		if (monthNum == 9) {
			System.out.println("Сентябрь");
		}
		if (monthNum == 10) {
			System.out.println("Октябрь");
		}
		if (monthNum == 11) {
			System.out.println("Ноябрь");
		}
		if (monthNum == 12) {
			System.out.println("Декабрь");
		}
	}
	public static void main(String[] args) {
		System.out.println("Введите число от 1 до 12");
		boolean err;
			do {
				err = true;
				Scanner sc = new Scanner(System.in);
				if (sc.hasNextInt()) {
					int monthNum = sc.nextInt();
					
					if (monthNum < 1) {
						System.out.println("Введите число больше 1");
						
					}
					if (monthNum > 12) {
						System.out.println("Введите число меньше 12");
						
					}
					if (monthNum <= 12&&monthNum >=1) {
						getMonthName(monthNum);
						err = false;
					}
				} else {
					System.out.println("Введите целое число!");
					
				}
			} while (err);
	}
}
