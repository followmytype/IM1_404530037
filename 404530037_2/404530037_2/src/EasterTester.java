/*
 * [A]90
 * [TA's Advise]
 * 1.�D�بèS���n�D�n�gScanner, �Ш̷��D�حn�D�@���g, �Y����@�~�Y�Q�HScanner�i�漶�g�аȥ��g�ҥ~�B�z, ���ͨҥ~���B�z�N�H�{�����~�i�榩��.
 * 2.�`�����ƾ�method�i�H�O�@�U: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * 3.����i�H���զbjavadoc���g�@�ǵ���.
 * 4.��@�t��k�n�T�P�_�U����������.
 * 5.��X�榡�Ш̷��D�حn�D.
 * */

import java.util.Scanner;

public class EasterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ꤣ�β��ͪ���, �����z�L�R�A�禡�i��I�s�N�n, �禡�W�٥��̳W�w���g, -5
		Easter Year = new Easter();
		Scanner scanner = new Scanner(System.in);
		System.out.println(Year.getEaster(2001));
		System.out.println(Year.getEaster(2012));
		System.out.print("Enter the year:");
		System.out.println(Year.getEaster(scanner.nextInt()));
	}

}
