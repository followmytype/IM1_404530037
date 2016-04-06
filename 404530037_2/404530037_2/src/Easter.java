
public class Easter {
	public static String getEaster(int year) {
		int a = year % 19;
		int b = year % 4;
		int c = year % 7;
		int k = year / 100;// Math.floor(), -2
		int p = ((13 + 8 * k) / 25);
		int q = (k / 4);
		int M = (15 - p + k - q) % 30;
		int N = (4 + k - q) % 7;
		int d = (19 * a + M) % 30;
		int e = (2 * b + 4 * c + 6 * d + N) % 7;
		if (d == 29 && e == 6)
			// March? No! it's April! -3
			return ("Easter is on 19 March," + year);
		if (d == 28 && e == 6 && (11 * M + 11) % 30 < 19)
			return ("Easter is on 18 March," + year);
		if (d + e < 10) {
			return ("Easter is on " + (d + e + 22) + " March," + year);
		} else {
			return ("Easter is on " + (d + e - 9) + " April," + year);
		}

	}
}
