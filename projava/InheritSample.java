package projava;

import java.util.List;

public class InheritSample{
	static abstract class User{
		String name;
		
		User(String name){
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
	}
	static class Student extends User{
		int score;
		
	    Student(String name, int score){
	    	super(name);
	    	this.score = score;	
	}
	public int getScore() {
		return score;
	}
}
	
	static class Teacher extends User{
		String subject;
		
		Teacher(String name, String subject){
			super(name);
			this.subject = subject;
		}
		public String getSubject() {
			return subject;
		}
	}
	public static void main(String[]args) {
		List<User> people = List.of(
				new Student("kis", 80),
				new Teacher("hosoya", "Math"));
		for(var p : people) {
			System.out.println("こんにちは%sさん".formatted(p.getName()));
		}
		}
				
	}
	
	
	
	
	
	
	
	
	
	
	
	