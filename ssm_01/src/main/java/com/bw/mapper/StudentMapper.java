package com.bw.mapper;

import java.util.List;

import com.bw.bean.Student;

public interface StudentMapper {

	List getlist();

	void add(Student stu);

	void update(Student stu);

}
