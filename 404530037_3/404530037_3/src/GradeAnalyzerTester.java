/*
 * [A]96
 * [TA's Advise]
 * 1. �p���~, �n�`�N�@�U��!
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {

		GradeAnalyzer ex = new GradeAnalyzer();
		String TempInput = "";

		while (true) {
			TempInput = JOptionPane.showInputDialog(null, ":::Please insert one score:::");
			if (TempInput.equalsIgnoreCase("q")) {
				break;
			}
			try {
				ex.addGrade(Double.parseDouble(TempInput));
			} catch (Exception e) {
				System.out.println("Please insert valid score");
			}
		}
		// �ʤ֧P�_�O�_�Ӽ�<2, -2.
		ex.analyzeGrades();
		System.out.println(ex);
	}

}
