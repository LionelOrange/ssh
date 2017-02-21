package com.pro.dao;

import org.hibernate.criterion.DetachedCriteria;

import com.pro.domain.Users;
import com.pro.service.UserServiceDao;
import com.pro.util.PageUtil;

public class UserAction extends BaseAction{
	private Users user;
	private UserServiceDao serviceDao;
	
	public void setServiceDao(UserServiceDao serviceDao) {
		this.serviceDao = serviceDao;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	public String add(){
		serviceDao.save(user);
		return "success";
	}
	public String query(){
		DetachedCriteria dc=DetachedCriteria.forClass(Users.class);
		PageUtil.pageTool(request,serviceDao,dc,PageUtil.PAGESIZE,"userList");
		return "success";
	}
	public String say(){
		return "df";
	}
}
