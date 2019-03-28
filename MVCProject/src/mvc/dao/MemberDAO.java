package mvc.dao;

import java.util.ArrayList;

import mvc.service.MemberService;
import mvc.vo.Member;

// DAO(Data Access Object : 单捞磐 贸府 按眉 CRUD : create, read, update, delete)
public class MemberDAO implements MemberService {

	ArrayList<Member> list;

	public MemberDAO() {
		list = new ArrayList<>();
		list.add(new Member("123", "tommy", "seoul", "010-2345-6789"));
		list.add(new Member("456", "jane kimberly", "la", "010-3345-4789"));
		list.add(new Member("789", "billy joel", "london", "010-6545-5677"));
	}

	public void go() {

	}

	@Override
	public ArrayList<Member> selelectAll() {
		return list;
	}

	@Override
	public Member selectOne(String id) {
		for (Member m : list) {
			if (m.getId().equals(id)) {
				return m;
			}
		}
		return null;
	}

	@Override
	public void insert(Member m) {
		list.add(m);
	}

	@Override
	public void delete(String id) {
		Member m = selectOne(id);
		if (m == null) {
			return;
		} else {
			list.remove(m);
			return;
		}
	}

	@Override
	public ArrayList<Member> search(String condition, String word) {
		ArrayList<Member> temp = new ArrayList<>();

		if (condition.equals("name")) {
			for (Member m : list) {
				if (m.getName().equals(word)) {
					temp.add(m);
				}
			}

		} else if (condition.equals("address")) {
			for (Member m : list) {
				if (m.getAddress().equals(word)) {
					temp.add(m);
				}
			}
		} else if (condition.equals("tel")) {
			for (Member m : list) {
				if (m.getTel().equals(word)) {
					temp.add(m);
				}
			}
		}
		return temp;
	}

	@Override
	public void modify(Member m) {
		for(Member om : list) {
			if(om.getId().equals(m.getId())) {
				om.setName(m.getName());
				om.setAddress(m.getAddress());
				om.setTel(m.getTel());
				return;
			}
		}
	}
}
