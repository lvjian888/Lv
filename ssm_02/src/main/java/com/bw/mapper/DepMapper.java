package com.bw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.bean.Dep;

public interface DepMapper {

	List getlist(@Param("name")String name);


	List getdep();


	void add(Dep dep);


	void update(Dep dep);


	void del(String id);

}
