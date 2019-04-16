package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bw.mapper.StudentMapper;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
   @Autowired
   private StudentMapper mapper;

@Override
public List getlist(String sname) {
	// TODO Auto-generated method stub
	return mapper.getlist(sname);
}
   
}
