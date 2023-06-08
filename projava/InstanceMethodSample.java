package projava;

public class InstanceMethodSample{
	record Student(String name, int englishScore, int mathScore) {
		int average() {
			return(this.englishScore() + this.mathScore()) / 2;
			}
		void showResult() {
	        System.out.println("%sさんの平均点は%d点です".formatted(name(), average()));
		}
	}
	public static void main (String[]args) {
		var kis = new Student("kis",60,80);
		var a = kis.average();
		System.out.println("平均点は%d点です" .formatted(a));
	}
}

	
	