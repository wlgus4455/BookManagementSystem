import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num !=6) {
		System.out.println("< Clothes Management System Menu>");
		System.out.println("1. Add Clothes");
		System.out.println("2. Delete Clothes");
		System.out.println("3. Edit Clothes");
		System.out.println("4. View Clothes");
		System.out.println("5. Show a Menu");
		System.out.println("6. Exit");
		System.out.print("Select one number between 1-6:");
		num=input.nextInt();
		if(num==1) {
			addClothes();
		}
		else if (num==2) {
			deleteClothes();
		}
		else if (num==3) {
			editClothes();
		}
		else if (num==4) {
			viewClothes();
		}
		else {
			        continue;
		}
	}

  }

	public static void addClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes Number:");
		int booknumber = input.nextInt();
		
		System.out.print("Clothes Title:");
		String booktitle = input.next();
		
		System.out.print("ClothesGenre:");
		String bookgenre = input.next();
		
		System.out.print("Clothes Writer:");
		String bookwriter = input.next();
		
		System.out.print("Clothes Publisher:");
		String bookpublisher = input.next();
		
		
	}

	public static void deleteClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number:");
		int booknumber = input.nextInt();		
	}

	public static void editClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number:");
		int booknumber = input.nextInt();		
	}

	public static void viewClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number:");
		int booknumber = input.nextInt();		
	}
}