package com.basic;

public class WrapperTest {
    public static void main(String[] args) {
        int num = 99; // �⺻��
        //�⺻���� �����͸� ���������� �ٲ�
        // Wrapper class�� �̿��Ѵ�
        
        Integer num2 = new Integer(num);
        
        num2++; // num = num +1  ���ο��� auto-unboxing�� �Ͼ�� ������ �ϰ� �ٽ� auto-boxing�� �Ͼ
        System.out.println(num2);
        
        double y= num2.doubleValue();
        int x = num2.intValue(); // unboxing
        int e = Integer.parseInt("555");
        
        System.out.println(x);
        System.out.println(y);
        
        double q = 3.14;
        
        Double qq = new Double(q);
        double z = Double.parseDouble("4.05");
        
        System.out.println(qq);
    }
}