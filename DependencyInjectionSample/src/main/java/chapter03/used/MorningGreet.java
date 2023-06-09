package chapter03.used;

import org.springframework.stereotype.Component;

@Component
public class MorningGreet implements Greet {
	/**
	 * Greet実装クラス
	 * 朝の挨拶を行う
	 */

	@Override
	public void greeting() {
		System.out.println("------------");
		System.out.println("おはようございます");
		System.out.println("------------");
		
	}

}
