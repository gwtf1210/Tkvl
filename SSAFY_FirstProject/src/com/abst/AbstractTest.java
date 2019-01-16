package com.abst;
/* ���-extends
 * 1. ���� ���
 * �θ� Ŭ�������� �޼ҵ带 �ϼ��ؼ� �����ִ� ���
 * 
 * 2. Ÿ�� ��� : �߻� Ŭ����, interface
 * �θ� Ŭ�������� �߻�(�̿ϼ�) �޼ҵ带 �ڽĿ��� ������
 */

// abstract class (�߻� Ŭ����): Ŭ���� ���ο� �߻� �޼ҵ尡 ����. �̿ϼ� Ŭ����.
abstract class MyAbstract{
	// abstract method(�߻�޼ҵ�) : �ٵ�({})�� ���� �޼ҵ�.�̿ϼ��� �޼ҵ�.Ű���� abstract�� �ٿ���
	public abstract void run();
	
	// concrete method(���� �޼ҵ�) : �ٵ� �ִ� �޼ҵ�
	public void stop() {
		System.out.println("stop");
	}
}
// �ڽ� Ŭ�������� ��� ���� �Ŀ� �θ� ������ �ִ� �߻�޼ҵ带 �ϼ�
class MyAbstractChild extends MyAbstract{

	@Override
	public void run() {
		System.out.println("run~~~");
	}
}

public class AbstractTest {
	public static void main(String[] args) {
//		MyAbstract m = new MyAbstract(); // ��ü ���� �ȵ�
		
	}
}
