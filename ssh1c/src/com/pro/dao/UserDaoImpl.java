package com.pro.dao;

import com.pro.domain.Users;

public class UserDaoImpl extends BaseDaoImpl<Users,Long> implements UserDao {

//	@Override
//	public void add(Users user) {
//		// TODO Auto-generated method stub
//		this.getHibernateTemplate().save(user);
//	}
//	public List query(DetachedCriteria dc,int currentPage,int pagesize){
//		return this.getHibernateTemplate().findByCriteria(dc, (currentPage-1)*pagesize,pagesize);
//	}
//	@Override
//	public int getTotalReord(DetachedCriteria dc) {
//		// TODO Auto-generated method stub
//		return this.getHibernateTemplate().findByCriteria(dc).size();
//	}
}
