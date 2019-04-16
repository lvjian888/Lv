package com.bw.service;

import java.util.List;

import com.bw.bean.Student;

public interface StudentService {

	List getlist();

	void add(Student stu);

	void update(Student stu);

}
