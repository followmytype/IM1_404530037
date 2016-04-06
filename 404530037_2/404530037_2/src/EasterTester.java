/*
 * [A]90
 * [TA's Advise]
 * 1.題目並沒有要求要寫Scanner, 請依照題目要求作撰寫, 若之後作業若想以Scanner進行撰寫請務必寫例外處理, 產生例外未處理將以程式錯誤進行扣分.
 * 2.常見的數學method可以記一下: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * 3.之後可以嘗試在javadoc中寫一些註解.
 * 4.實作演算法要確判斷下的夠完全喔.
 * 5.輸出格式請依照題目要求.
 * */

import java.util.Scanner;

public class EasterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 其實不用產生物件, 直接透過靜態函式進行呼叫就好, 函式名稱未依規定撰寫, -5
		Easter Year = new Easter();
		Scanner scanner = new Scanner(System.in);
		System.out.println(Year.getEaster(2001));
		System.out.println(Year.getEaster(2012));
		System.out.print("Enter the year:");
		System.out.println(Year.getEaster(scanner.nextInt()));
	}

}
