/*
 * PTra14_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice14.ptra14;

public class PTra14_02 {

	public static void main(String[] args) {

	}

	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */

	public class DBCourse implements practice14.common.Course {

		public String getCourseName() {
			return "【Eラーニング】DB基礎";
		}

		public String[] getCourseUnit() {
			String[] array = {"DB基礎","SQL基礎", "正規化", "SQL応用"};
			return array;
		}

	}

}
