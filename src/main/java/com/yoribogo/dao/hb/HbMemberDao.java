package com.yoribogo.dao.hb;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yoribogo.dao.MemberDao;
import com.yoribogo.entity.Member;
import com.yoribogo.entity.MemberRole;

@Repository
public class HbMemberDao implements MemberDao{

	@Autowired
	private SessionFactory sessionFactory;
	
/*	@Override
	public int insert(Member member) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.save(member);
		
		System.out.println(member);
		return 1;
	}*/

	@Override
	public int insert(Member member) {

		Session session = sessionFactory.getCurrentSession();
		
		session.save(member);
		
		System.out.println(member);
		
		return 1;
	}
	
}