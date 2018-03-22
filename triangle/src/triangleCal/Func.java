package triangleCal;

public class Func {

	private final double exp = 1e-6;
	private Triangle t;
	private int ans = -1;
	
	public Func(){
		
	}
	
	public void setFunc(double a, double b, double c){//题目要求的函数
		t = new Triangle(a, b, c);
		
		if(isTriangle()){//能否构成三角形
			if(isEquilateral()){//正三角形
				ans = 1;
				System.out.println("正三角形");
			}
			else if(isIsosceles()){//等腰
				ans = 2;
				System.out.println("等腰三角形");
			}	
			else{//非等边
				ans = 0;
				System.out.println("非等边三角形");
			}
		}else{//构不成三角形 not a triangle
			ans = -1;
			System.out.println("构不成三角形");
		}
	}
	
	public int getAns() {//test获取结果
		return ans;
	}

	public boolean isEquilateral(){//判断等边【单个函数不验证是否能构成三角形
		if(Math.abs(t.getA() - t.getB()) < exp && Math.abs(t.getA() - t.getC()) < exp)
			return true;
		return false;
	}
	
	public boolean isIsosceles(){//判断等腰【单个函数不验证是否能构成三角形
		if(Math.abs(t.getA() - t.getB()) < exp || Math.abs(t.getA() - t.getC()) < exp || Math.abs(t.getB() - t.getC()) < exp)
			return true;
		return false;
	}
	
	public boolean isTriangle(){//判断是否为三角形
		if(t.getA() < exp || t.getB() < exp || t.getC() < exp)//边长大于0
			return false;
		if(t.getA() + t.getB() < t.getC() + exp || Math.abs(t.getA() - t.getB()) > t.getC() - exp )//两边之和大于第三边，两边之差小于第三边
			return false;
		return true;
	}

}
