package triangleCal;

public class Func {

	private final double exp = 1e-6;
	private Triangle t;
	private int ans = -1;
	
	public Func(){
		
	}
	
	public void setFunc(double a, double b, double c){//��ĿҪ��ĺ���
		t = new Triangle(a, b, c);
		
		if(isTriangle()){//�ܷ񹹳�������
			if(isEquilateral()){//��������
				ans = 1;
				System.out.println("��������");
			}
			else if(isIsosceles()){//����
				ans = 2;
				System.out.println("����������");
			}	
			else{//�ǵȱ�
				ans = 0;
				System.out.println("�ǵȱ�������");
			}
		}else{//������������ not a triangle
			ans = -1;
			System.out.println("������������");
		}
	}
	
	public int getAns() {//test��ȡ���
		return ans;
	}

	public boolean isEquilateral(){//�жϵȱߡ�������������֤�Ƿ��ܹ���������
		if(Math.abs(t.getA() - t.getB()) < exp && Math.abs(t.getA() - t.getC()) < exp)
			return true;
		return false;
	}
	
	public boolean isIsosceles(){//�жϵ�����������������֤�Ƿ��ܹ���������
		if(Math.abs(t.getA() - t.getB()) < exp || Math.abs(t.getA() - t.getC()) < exp || Math.abs(t.getB() - t.getC()) < exp)
			return true;
		return false;
	}
	
	public boolean isTriangle(){//�ж��Ƿ�Ϊ������
		if(t.getA() < exp || t.getB() < exp || t.getC() < exp)//�߳�����0
			return false;
		if(t.getA() + t.getB() < t.getC() + exp || Math.abs(t.getA() - t.getB()) > t.getC() - exp )//����֮�ʹ��ڵ����ߣ�����֮��С�ڵ�����
			return false;
		return true;
	}

}
