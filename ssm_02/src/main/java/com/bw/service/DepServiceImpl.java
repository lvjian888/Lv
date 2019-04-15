package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bw.bean.Dep;
import com.bw.mapper.DepMapper;

@Service
@Transactional
public class DepServiceImpl  implements DepService{
    @Autowired
    private DepMapper mapper;

	@Override
	public List getlist(String name) {
		// TODO Auto-generated method stub
		return mapper.getlist(name);
	}

	@Override
	public List getdep() {
		// TODO Auto-generated method stub
		return mapper.getdep();
	}

	@Override
	public void add(Dep dep) {
		// TODO Auto-generated method stub
		mapper.add(dep);
	}

	@Override
	public void update(Dep dep) {
		// TODO Auto-generated method stub
		mapper.update(dep);
	}

	@Override
	public void del(String id) {
		// TODO Auto-generated method stub
		mapper.del(id);
	}
}
