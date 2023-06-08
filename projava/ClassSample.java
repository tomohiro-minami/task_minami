package projava;

public class ClassSample{
	record Student(String name, int score) {}
	public static void main (String[]args) {
		var s = new Student("kis", 89);
		System.out.println(s);
	}
		
}