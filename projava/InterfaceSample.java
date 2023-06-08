package projava;

import java.util.List;

public class InterfaceSample{
	interface Named{
		String name();
	}
	record Student(String name, int score) implements Named {}
	record Teacher(String name, String suject) implements Named {}
	
	public static void main(String[]args) {
		var people = List.of(new Student("kis", 80), new Teacher("hosoya", "math"));
		for (var p : people) {
			var n = p.name();
			System.out.println("こんにちは%sさん".formatted(n));
		}		
	}
}