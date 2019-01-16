package com.basic;

public class StringTest {

    public static void main(String[] args) {
        String s = "mylimeorange";
        String t = new String("Mylimeorange");
        String x = "mylimeorange";
        
        System.out.println(s.length());  // ���̸� ��Ÿ���ִ°�
        System.out.println(s.charAt(3)); // String���� ����� �����Ҷ�
        System.out.println(s.isEmpty()); // ����ִ��� ������ �˷���
        System.out.println(s.endsWith("e")); // ���������ڰ� e���� �˷���
        System.out.println(s.substring(2,6)); // 2<= <6���� �� ���
        System.out.println(s.substring(7)); // 7���� ~ �� ���
        System.out.println(s.contains("b")); // b�� �ִ��� ������ �˷���
        
        System.out.println();
        if(s == t) { // �ּҰ� ��  s = constant pool(class area)  t = heap�� �����Ѵ�.
            System.out.println("s==t");
        }
        if(s.equals(t)) { // ���� ��
            System.out.println("s.equals(t)");
        }
        if(s==x) {
            System.out.println("s==x");
        }
        
        //string�� ������������ ������ �ȵȴ�. final
        
        String ss = s.toUpperCase(); // �ҹ��� -> �빮�ڷ� �ٲٴ°�
        System.out.println(ss);
        
        String sss = s.concat("hello"); // s��� ���ڿ� �ڿ� hello��� ���ڿ��� ����
        System.out.println(sss);
        
        
        s = s+"gogogo"; // s�ڿ� gogogo��
        System.out.println(s);
        System.out.println(x);
        
        
//      ���� �����Ϳ� ������ ������ Ŭ����
        System.out.println();
        StringBuilder sb =new StringBuilder("mylimeorange"); // string����� new�� �� ���� �ؾ���
        sb.append("App"); // �ڿ� ���̴°�  String.concat�̶� �Ȱ��� ���
        System.out.println(sb);
        
        sb.setLength(5);
        System.out.println(sb);
        
        sb.insert(2, 'q');
        System.out.println(sb);
    }
}
