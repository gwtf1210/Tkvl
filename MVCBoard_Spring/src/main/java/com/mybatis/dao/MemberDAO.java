package com.mybatis.dao;

import com.mybatis.vo.Member;

public interface MemberDAO {
	public Member selectOne(String id);
}
