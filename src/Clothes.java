
public class Clothes {	
	int code;
	String brand;
	String type;
	String size;
	String color;
	
	
	public Clothes() {
	}
	
	public Clothes(int code, String brand) {
		this.code = code;
		this.brand = brand;
	}
	
	public Clothes(int code, String brand, String type, String size, String color) {
		this.code = code;
		this.brand = brand;
		this.type = type;
		this.size = size;
		this.color = color;	
	}
	
	public void printInfo() {
	  System.out.println("code:" + code + "brand:"+ brand + "type:"+ type + "size:"+ size + "color:" + color );
	}
	}
	
	