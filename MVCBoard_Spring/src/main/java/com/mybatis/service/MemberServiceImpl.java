package com.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.dao.MemberDAO;
import com.mybatis.vo.Member;

@Service("mservice")
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO dao;

	@Override
	public Member selectOne(String id) {
		System.out.println("service : " + id);
		return dao.selectOne(id);
	}
}
