package com.inter;

interface Seoul{}
class Boat{}

// interface IShape�� ��� �޾� �߻�޼ҵ带 �ϼ� ���� ���� ��. ���� ��� ����
public class ICircle extends Boat implements IShape, Seoul{
	int r;
	
	public ICircle(int r) {
		this.r = r;
	}
	
	@Override
	public double getArea() {
		return Math.PI * r * r;
	}

	@Override
	public double getCircum() {
		return 2 * Math.PI *r;
	}

}
