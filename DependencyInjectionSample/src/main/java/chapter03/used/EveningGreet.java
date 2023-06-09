package chapter03.used;

public class EveningGreet implements Greet {
	/**
	 * Greet実装クラス
	 * 夕方の挨拶を行う
	 */

	@Override
	public void greeting() {
		System.out.println("------------");
		System.out.println("こんばんは");
		System.out.println("------------");

	}

}
