package triangleCal;

public class Triangle {
	
	private double a, b, c;//三角形的三条边
	
	public Triangle(){//默认边长为1的等边三角形
		setA(1);
		setB(1);
		setC(1);
	}
	
	public Triangle(double la, double lb, double lc){//输入三角形的三条边长
		setA(la);
		setB(lb);
		setC(lc);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
}
