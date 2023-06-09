package chapter03.use;

import chapter03.used.AddCalc;
import chapter03.used.Calculator;
import chapter03.used.SubCalc;

/**
 * インタフェース依存を確認する
 *
 */

public class Call {

	public static void main(String[] args) {
		Calculator calculator = new SubCalc();
		Integer result = calculator.calc(10, 5);
		System.out.println("計算結果は「" + result + "」です。");
		
		// TODO 自動生成されたメソッド・スタブ

	}
}
