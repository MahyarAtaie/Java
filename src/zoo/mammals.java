package zoo;

public class mammals  implements animal {
String Name;
String Color;
int Age;

	public mammals(String name, String color, int age) {
	
	Name = name;
	Color = color;
	Age = age;
}

	@Override
	public String toString() {
		return "mammals [Name=" + Name + ", Color=" + Color + ", Age=" + Age + "]";
	}

	public static void main(String[] args) {
		

	}

}
