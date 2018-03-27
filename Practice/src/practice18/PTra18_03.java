/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> arraylist = new ArrayList<>();
		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] array = line.split(",");
                Player p = new Player();
                p.setName(array[1]);
                p.setCountry(array[2]);
                p.setTeam(array[3]);
                p.setPosition(array[0]);

                arraylist.add(p);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

//		System.out.println(arraylist.get(1).getTeam());

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
		for (int i = arraylist.size() - 1; i >= 0 ; i--) {
			if (arraylist.get(i).getTeam().equals("レアル・マドリード") || arraylist.get(i).getTeam().equals("バルセロナ")) {
				arraylist.remove(i);
			}
		}

		// ★ 削除後のArrayListの中身を全件出力してください
		int i = 1;
		for (Player value : arraylist) {
        	System.out.println(i + " : " + value);
        	i++;
        }

	}
}
