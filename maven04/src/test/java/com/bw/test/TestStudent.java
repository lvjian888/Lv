package com.bw.test;

import org.junit.Test;

import com.bw.bean.Student;

public class TestStudent {
     @Test
     public void testStudent(){
    	 Student s = new Student();
    	 System.out.println(s.study());
     }
}
