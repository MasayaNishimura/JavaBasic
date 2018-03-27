package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car1.serialNo = 1;
		car2.serialNo = 2;
		car3.serialNo = 3;

		car1.color = "RED";
		car2.color = "BLUE";
		car3.color = "GREEN";

		car1.gasoline = 45;
		car2.gasoline = 40;
		car3.gasoline = 35;

		final int distance = 300;
		int runDis1 = 0;

		while (true) {
			runDis1 += car1.run();
			if (car1.gasoline == 0 && 300 - runDis1 > 0) {
				System.out.println("car1 : 目的地に到達できませんでした");
				break;
			}
			if (car1.gasoline >= 0 && 300 - runDis1 <= 0) {
				System.out.println("car1 : 目的地にまで" + (45 - car1.gasoline) + "時間かかりました。\n残りのガソリンは、" + car1.gasoline + "リットルです");
				break;
			}
		}

		int runDis2 = 0;

		while (true) {
			runDis2 += car2.run();
			if (car2.gasoline == 0 && 300 - runDis2 > 0) {
				System.out.println("car2 : 目的地に到達できませんでした");
				break;
			}
			if (car2.gasoline >= 0 && 300 - runDis2 <= 0) {
				System.out.println("car2 : 目的地にまで" + (40 - car2.gasoline) + "時間かかりました。\n残りのガソリンは、" + car2.gasoline + "リットルです");
				break;
			}
		}

		int runDis3 = 0;

		while (true) {
			runDis3 += car3.run();
			if (car3.gasoline == 0 && 300 - runDis3 > 0) {
				System.out.println("car3 : 目的地に到達できませんでした");
				break;
			}
			if (car3.gasoline >= 0 && 300 - runDis3 <= 0) {
				System.out.println("car3 : 目的地にまで" + (35 - car3.gasoline) + "時間かかりました。\n残りのガソリンは、" + car3.gasoline + "リットルです");
				break;
			}
		}

	}
}
