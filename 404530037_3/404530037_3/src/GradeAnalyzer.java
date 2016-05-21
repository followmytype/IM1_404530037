import java.util.ArrayList;

/**
 * 
 * @author 資管一 404530037 陳志嘉
 *
 */
public class GradeAnalyzer {

	ArrayList<Double> Grades = new ArrayList<Double>();

	double sum;
	double average;
	double staDeviation;
	double powsum;

	int aplus = 0;
	int a = 0;
	int aminus = 0;
	int bplus = 0;
	int b = 0;
	int bminus = 0;
	int cplus = 0;
	int c = 0;
	int cminus = 0;
	int d = 0;
	int f = 0;

	void addGrade(double Grade) {
		if (Grade >= 0 && Grade < 60)
			f++;
		if (Grade >= 60 && Grade < 70)
			d++;
		if (Grade >= 70 && Grade < 72)
			cminus++;
		if (Grade >= 72 && Grade < 78)
			c++;
		if (Grade >= 78 && Grade < 80)
			cplus++;
		if (Grade >= 80 && Grade < 82)
			bminus++;
		if (Grade >= 82 && Grade < 88)
			b++;
		if (Grade >= 88 && Grade < 90)
			bplus++;
		if (Grade >= 90 && Grade < 92)
			aminus++;
		if (Grade >= 92 && Grade < 98)
			a++;
		if (Grade >= 98 && Grade < 110)
			aplus++;

		Grades.add(Grade);

		if (Grade < 0 || Grade >= 110)
			Grades.remove(Grade);
	}

	public void analyzeGrades() {

		for (double score : Grades) {
			sum += score;
			powsum += Math.pow(score, 2);
		}

		average = sum / Grades.size();

		// 公式似乎錯了, -2.
		staDeviation = Math.sqrt(powsum / Grades.size() - Math.pow(average, 2));
	}

	public String toString() {
		return "You entered " + Grades.size()
				+ " valid grades from 0 to 110. Invalid grades are ignored!\nThe average = " + average
				+ " with a standard deviation = " + staDeviation + "\nThe grade distribution is:\nA+ = " + aplus
				+ " \nA  = " + a + " \nA- = " + aminus + " \nB+ = " + bplus + " \nB  = " + b + " \nB- = " + bminus
				+ " \nC+ = " + cplus + " \nC  = " + c + " \nC- = " + cminus + "\nD  = " + d + " \nF  = " + f;

	}
}