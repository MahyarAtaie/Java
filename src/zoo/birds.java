package zoo;

public class birds implements animal {
	
	String Names;
	String Color;
	int Age;
	
	
	
	
	
	
	public birds(String names, String color, int age) {
		
		Names = names;
		Color = color;
		Age = age;
	}






	@Override
	public String toString() {
		return "birds [Names=" + Names + ", Color=" + Color + ", Age=" + Age + "]";
	}






	public static void main(String[] args) {
	
	}

}
