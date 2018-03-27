/*
 * PTra18_04.java
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

public class PTra18_04 {

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


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		while (true) {
			int rand = new java.util.Random().nextInt(arraylist.size());

			if (arraylist.get(rand).getPosition().equals("GK")) {
				System.out.println(arraylist.get(rand).getName());
				break;
			}
		}

		int dfCnt = 0;

		while (true) {
			int rand = new java.util.Random().nextInt(arraylist.size());

			if (arraylist.get(rand).getPosition().equals("DF")) {
				System.out.println(arraylist.get(rand).getName());
				dfCnt++;
				if (dfCnt == 4) break;
			}
		}

		int mfCnt = 0;

		while (true) {
			int rand = new java.util.Random().nextInt(arraylist.size());

			if (arraylist.get(rand).getPosition().equals("MF")) {
				System.out.println(arraylist.get(rand).getName());
				mfCnt++;
				if (mfCnt == 4) break;
			}
		}

		int fwCnt = 0;

		while (true) {
			int rand = new java.util.Random().nextInt(arraylist.size());

			if (arraylist.get(rand).getPosition().equals("FW")) {
				System.out.println(arraylist.get(rand).getName());
				fwCnt++;
				if (fwCnt == 2) break;
			}
		}

	}
}
