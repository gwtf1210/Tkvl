package com.mybatis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mybatis.mapper.MemberMapper;
import com.mybatis.vo.Member;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	MemberMapper mapper;

	@Override
	public Member selectOne(String id) {
		System.out.println("dao : " + id);
		return mapper.selectOne(id);
	}

}
