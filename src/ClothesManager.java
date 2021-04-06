import java.util.Scanner;

public class ClothesManager {
		Clothes clothes;
		Scanner input;
	    ClothesManager(Scanner input) {
	    	this.input = input;
	    }
		
	    public void addClothes() {
	    
			clothes = new Clothes();
			System.out.print("Clothes Code:");
			clothes.code = input.nextInt();
			
			System.out.print("Clothes Brand:");
			clothes.brand = input.next();
			
			System.out.print("Clothes Type:");
			clothes.type = input.next();
			
			System.out.print("Clothes Size:");
			clothes.size = input.next();
			
			System.out.print("Clothes Color:");
			clothes.color = input.next();
			
			}

		public void deleteClothes() {
		
			System.out.print("Clothes Code:");
			int clothescode = input.nextInt();		
			if (clothes == null) {
				return;
			}
			if (clothes.code==clothescode) {
				clothes = null;
				System.out.println("the clothes is deleted");
			}
		}

		public void editClothes() {
			
			System.out.print("Clothes Code:");
			int clothescode = input.nextInt();	
			if (clothes.code==clothescode) {
				System.out.println("the clothes to be edited is " + clothescode);
		    }
		}

		public void viewClothes() {
			
			System.out.print("Clothes Code:");
			int clothescode = input.nextInt();		
			if (clothes.code == clothescode) {
				clothes.printInfo();
		}
	}
}