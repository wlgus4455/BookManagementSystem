import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		ClothesManager clothestManager= new ClothesManager(input);
		
		int num = 0;
		while (num !=5) {
		System.out.println("< Clothes Management System Menu>");
		System.out.println("1. Add Clothes");
		System.out.println("2. Delete Clothes");
		System.out.println("3. Edit Clothes");
		System.out.println("4. View Clothes");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1-5:");
		num = input.nextInt();
		if(num==1) {
			clothestManager.addClothes();
		}
		else if (num==2) {
			clothestManager.deleteClothes();
		}
		else if (num==3) {
			clothestManager.editClothes();
		}
		else if (num==4) {
			clothestManager.viewClothes();
		}
		else {
			        continue;
		}
	
	}

  }
}