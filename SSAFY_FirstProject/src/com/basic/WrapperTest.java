package com.basic;

public class WrapperTest {
    public static void main(String[] args) {
        int num = 99; // 기본형
        //기본형의 데이터를 참조형으로 바꿈
        // Wrapper class를 이용한다
        
        Integer num2 = new Integer(num);
        
        num2++; // num = num +1  내부에서 auto-unboxing이 일어나고 연상을 하고 다시 auto-boxing이 일어남
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