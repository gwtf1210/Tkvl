package mvc.service;

import java.util.ArrayList;

import mvc.vo.Member;

// client(MemberController)를 위한 서비스 제공 메소드가 표시되는 인터페이스
public interface MemberService {
	
	// MemberController가 이용 가능한 메소드 목록
	public ArrayList<Member> selelectAll();
	public Member selectOne(String id);
	public void insert(Member m);
	public void delete(String id);
	public ArrayList<Member> search(String condition, String word);
	public void modify(Member m);
}
