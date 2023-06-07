package projava;

import java.util.ArrayList;
import java.util.List;

public class StreamSample2{
	public static void main(String[]args) {
		var data = List.of("apple", "banana", "grape");
		var result = false;
		for (var fruit : data) {
		    if (fruit.contains("p")) {
		        result |= true;
		    }
		}
		System.out.println(result);
	}
	
}
		
	