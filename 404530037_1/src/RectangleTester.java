
public class RectangleTester {
	
	double Height, Width, X, Y;
	
	RectangleTester(double height, double width, double x, double y){
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
	
	String ToString(){
		return "Height=" + Height + ",Width=" + Width + ",X=" + X + ",Y=" + Y
				+ "\nArea=" + (Height*Width) + ",Perimemter=" + (Height+Width)*2;
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