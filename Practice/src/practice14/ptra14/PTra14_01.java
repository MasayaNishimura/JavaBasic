/*
 * PTra14_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice14.ptra14;

public class PTra14_01 {

	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】Java」
	 * 単元
	 * 		式と演算
	 * 		制御構文
	 * 		メソッド
	 * 		配列
	 * 		オブジェクト指向
	 * 		継承
	 * 		高度な継承
	 */

	public static void main(String[] args) {

	}

	public class JavaCourse implements practice14.common.Course {
		String PREFIX = "【Eラーニング】";

		/**
		 * コースの名称を取得します。
		 * 例）Java、DB基礎、IT基礎　など
		 * @return	単元の名称
		 */
		public String getCourseName() {
			return "Java";
		}

		/**
		 * コースの単元を取得します
		 * 例）プログラミングの書き方、式と演算子　など
		 * @return
		 */
		public String[] getCourseUnit() {
			String[] array = {"プログラミングの書き方","式と演算子"};
			return array;
		}
	}

}
