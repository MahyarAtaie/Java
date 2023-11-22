package zoo;

public class reptiles implements animal {
	String Name;
	String Color;
	int Age;

	
	public reptiles(String name, String color, int age) {
		
		Name = name;
		Color = color;
		Age = age;
	}


	@Override
	public String toString() {
		return "reptiles [Name=" + Name + ", Color=" + Color + ", Age=" + Age + "]";
	}


	public static void main(String[] args) {
	

	}

}
