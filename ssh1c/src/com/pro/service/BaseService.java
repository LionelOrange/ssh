package com.pro.service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface BaseService {
	/**
	 * 按主键数组
	 * @param args
	 * @throws Exception
	 */
	public abstract void deleteByParam(Serializable[] args);
	
	public abstract void saveByParam(Serializable[] args);
	
	public abstract void delete(Serializable entity);
	/**
	 * 基本保存方法
	 * @param entity
	 * @throws Exception
	 */
	public abstract void save(Serializable entity);

	/**
	 * 基本更新方法
	 * @param entity
	 * @throws Exception
	 */
	public abstract void update(Serializable entity);

	/**
	 * 按主键查
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public abstract Object findById(Serializable id);

	/**
	 * 按条件查
	 * @param dc
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public abstract List findByCriteria(DetachedCriteria dc);
	
	/**
	 * 按条件分页
	 * @param firstResult
	 * @param maxResults
	 * @param dc
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public abstract List findByCriteria(int currentPage, int pageSize,DetachedCriteria dc);

	/**
	 * 求满足条件的行数
	 * @param dc
	 * @return
	 * @throws Exception
	 */
	public abstract int getRowCount(DetachedCriteria dc);
	
	
	public abstract List findByHql(String hql);
	
	public abstract List findByHql(String hql, Object... values);
	
	public abstract void bulkUpdate(String hql);
	public abstract void bulkUpdate(String hql, Object... values);
	
}
