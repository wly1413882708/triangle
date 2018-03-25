package triangleCal;

public class Func {

	private Triangle t;
	private int ans = -1;
	
	public Func(){
		
	}
	
	public void setFunc(int a, int b, int c){//��ĿҪ��ĺ���
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
		if(t.getA() == t.getB() && t.getA() == t.getC())
			return true;
		return false;
	}
	
	public boolean isIsosceles(){//�жϵ�����������������֤�Ƿ��ܹ���������
		if(t.getA() == t.getB() || t.getA() == t.getC() || t.getB() == t.getC())
			return true;
		return false;
	}
	
	public boolean isTriangle(){//�ж��Ƿ�Ϊ������
		if(t.getA() <= 0 || t.getB() <= 0 || t.getC() <= 0)//�߳���С��0
			return false;
		if(t.getA() + t.getB() <= t.getC() || Math.abs(t.getA() - t.getB()) >= t.getC() )//����֮�ʹ��ڵ����ߣ�����֮��С�ڵ�����
			return false;
		return true;
	}

}
