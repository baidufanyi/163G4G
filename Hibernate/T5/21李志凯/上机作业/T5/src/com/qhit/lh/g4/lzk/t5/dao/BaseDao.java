package com.qhit.lh.g4.lzk.t5.dao;

import java.util.List;

import com.qhit.lh.g4.lzk.t5.bean.Dept;

public interface BaseDao<Emp> {
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public List<Object> queryAll(String tableName);
	public Emp getObjectById(Class<Dept> class1, int i);
	Object getObjectById();
}
