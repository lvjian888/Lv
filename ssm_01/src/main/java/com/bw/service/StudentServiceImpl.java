package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bw.bean.Student;
import com.bw.mapper.StudentMapper;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
     @Autowired
     private StudentMapper mapper;

	public List getlist() {
		// TODO Auto-generated method stub
		return mapper.getlist();
	}

	@Override
	public void add(Student stu) {
		// TODO Auto-generated method stub
		mapper.add(stu);
	}

	@Override
	public void update(Student stu) {
		// TODO Auto-generated method stub
		mapper.update(stu);
	}
}
