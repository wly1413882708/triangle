package triangleCal;

public class Triangle {
	
	private int a, b, c;//�����ε�������
	
	public Triangle(int la, int lb, int lc){//���������ε������߳�
		setA(la);
		setB(lb);
		setC(lc);
	}

	public double getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
}
