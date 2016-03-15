/*
 * [A]96
 * [TA's advise]
 * 1.之後請依照作業要求格式印出.
 * 2.並未使用getWidth(),getHeight()去進行Area與Perimeter的運算, 此部分扣2分.
 * 3.並未Override toString(), 此部分扣2分.
 * */
 
public class RectangleTester {

	double Height, Width, X, Y;

	/*
	 * RectangleTester(){this(-1,-1,-1,-1);}//建議加上空白建構子讓程式更完整.
	 * */
	
	RectangleTester(double height, double width, double x, double y) {
		Height = height;
		Width = width;
		X = x;
		Y = y;
	}

	double getHeight() {
		return Height;
	}

	double getWidth() {
		return Width;
	}

	double getX() {
		return X;
	}

	double getY() {
		return Y;
	}

	//這樣沒有override到喔, Object Class中的toString()格式為:public String toString(){}
	String ToString() {
		return "Height=" + Height + ",Width=" + Width + ",X=" + X + ",Y=" + Y + "\nArea=" + (Height * Width)
				+ ",Perimemter=" + (Height + Width) * 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleTester Retangle1 = new RectangleTester(18, 57, 15, 25);
		RectangleTester Retangle2 = new RectangleTester(47, 60, 12, 0);

		System.out.println();
		System.out.println("Rectangle#1 " + Retangle1.ToString());
		System.out.println("Rectangle#2 " + Retangle2.ToString());

	}

}