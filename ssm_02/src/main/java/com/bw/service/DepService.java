package com.bw.service;

import java.util.List;

import com.bw.bean.Dep;

public interface DepService {

	List getlist(String name);

	List getdep();

	void add(Dep dep);

	void update(Dep dep);

	void del(String id);

}
