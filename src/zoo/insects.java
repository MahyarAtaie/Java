package zoo;

public class insects  implements animal {
String name;
String color;
int Age;






	public insects(String name, String color, int age) {

	this.name = name;
	this.color = color;
	Age = age;
}






	@Override
	public String toString() {
		return "insects [name=" + name + ", color=" + color + ", Age=" + Age + "]";
	}






	public static void main(String[] args) {
		
	}

}
