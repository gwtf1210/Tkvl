package com.basic;

public class StringTest {

    public static void main(String[] args) {
        String s = "mylimeorange";
        String t = new String("Mylimeorange");
        String x = "mylimeorange";
        
        System.out.println(s.length());  // 길이를 나타내주는것
        System.out.println(s.charAt(3)); // String에서 어떤값을 추출할때
        System.out.println(s.isEmpty()); // 비어있는지 없는지 알려줌
        System.out.println(s.endsWith("e")); // 마지막글자가 e인지 알려줌
        System.out.println(s.substring(2,6)); // 2<= <6사이 값 출력
        System.out.println(s.substring(7)); // 7부터 ~ 값 출력
        System.out.println(s.contains("b")); // b가 있는지 없는지 알려줌
        
        System.out.println();
        if(s == t) { // 주소값 비교  s = constant pool(class area)  t = heap에 존재한다.
            System.out.println("s==t");
        }
        if(s.equals(t)) { // 내용 비교
            System.out.println("s.equals(t)");
        }
        if(s==x) {
            System.out.println("s==x");
        }
        
        //string은 원본데이터의 수정이 안된다. final
        
        String ss = s.toUpperCase(); // 소문자 -> 대문자로 바꾸는거
        System.out.println(ss);
        
        String sss = s.concat("hello"); // s라는 문자열 뒤에 hello라는 문자열을 붙임
        System.out.println(sss);
        
        
        s = s+"gogogo"; // s뒤에 gogogo에
        System.out.println(s);
        System.out.println(x);
        
        
//      원본 데이터에 수정이 가능한 클래스
        System.out.println();
        StringBuilder sb =new StringBuilder("mylimeorange"); // string뺴고는 new로 다 만들어서 해야함
        sb.append("App"); // 뒤에 붙이는거  String.concat이랑 똑같은 기능
        System.out.println(sb);
        
        sb.setLength(5);
        System.out.println(sb);
        
        sb.insert(2, 'q');
        System.out.println(sb);
    }
}
