package chapter03.used;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Spring boot起動クラス
 *
 */
@SpringBootApplication
public class DependencyInjectionSampleApplication {
	/**
	 * mainメソッド
	 * @param args
	 */

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionSampleApplication.class, args)
		.getBean(DependencyInjectionSampleApplication.class).execute();
	}
	/**
	 * 注入される箇所(インタフェース)
	 */
	@Autowired
	Greet greet;
	/**
	 * 実行メソッド
	 */
	private void execute() {
		greet.greeting();
	}
}
