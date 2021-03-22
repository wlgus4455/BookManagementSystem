import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num !=6) {
		System.out.println("< Book Management System Menu>");
		System.out.println("1. Add Book");
		System.out.println("2. Delete Book");
		System.out.println("3. Edit Book");
		System.out.println("4. View Book");
		System.out.println("5. Show a Menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1-6:");
		num=input.nextInt();
		if(num==1) {
			addbook();
		}
		else if (num==2) {
			deleteBook();
		}
		else if (num==3) {
			editBook();
		}
		else if (num==4) {
			viewbook();
		}
		else {
			        continue;
		}
	}

  }

	public static void addbook() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number:");
		int booknumber = input.nextInt();
		System.out.print("Book Title:");
		String booktitle = input.next();
		System.out.print("Book Genre:");
		String bookgenre = input.next();
		System.out.print("Book Writer:");
		String bookwriter = input.next();
		System.out.print("Book Publisher:");
		String bookpublisher = input.next();
		
	}

	public static void deleteBook() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number:");
		int booknumber = input.nextInt();		
	}

	public static void editBook() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number:");
		int booknumber = input.nextInt();		
	}

	public static void viewbook() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number:");
		int booknumber = input.nextInt();		
	}
}