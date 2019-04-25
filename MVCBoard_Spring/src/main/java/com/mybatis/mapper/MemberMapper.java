package com.mybatis.mapper;

import com.mybatis.vo.Member;

public interface MemberMapper {
	public Member selectOne(String id);
}
