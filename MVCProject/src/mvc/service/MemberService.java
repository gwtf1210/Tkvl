package mvc.service;

import java.util.ArrayList;

import mvc.vo.Member;

// client(MemberController)�� ���� ���� ���� �޼ҵ尡 ǥ�õǴ� �������̽�
public interface MemberService {
	
	// MemberController�� �̿� ������ �޼ҵ� ���
	public ArrayList<Member> selelectAll();
	public Member selectOne(String id);
	public void insert(Member m);
	public void delete(String id);
	public ArrayList<Member> search(String condition, String word);
	public void modify(Member m);
}
