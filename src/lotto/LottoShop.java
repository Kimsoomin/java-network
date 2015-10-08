package lotto;

import java.util.Scanner;

/**
 * @file_name : SBS.java
 * author     : soomin0322@naver.com
 * date       : 2015. 10. 7.
 * story      : 로또 추첨(스윙)
 */
public class LottoShop {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		Scanner scanner = new Scanner(System.in);
		int [][] arr = new int [5][5];
		lotto.sort(arr);
		System.out.println("행운의 로또");
		lotto.inputMoney(scanner.nextInt());
		System.out.println(lotto.printLotto());
	}
}
