package algorithm.kai.utilities;

//����һ���Լ��ĵ�
public class MyPoint {
	
	//ѡ��ʹ����double���ͣ�����int����
	//������Ϊ��δ���ĸ��ּ���/����У��Ҹо�double���Ǹ��ӷ��㣨�����Ǽ��㣬���Ǵ��ε�ʱ��
	double x;
	double y;
	
	public MyPoint() {
		x = 0;
		y = 0;
	}
	
	public MyPoint(MyPoint point1) {
		this.x = point1.x;
		this.y = point1.y;
	}
	
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}

}
