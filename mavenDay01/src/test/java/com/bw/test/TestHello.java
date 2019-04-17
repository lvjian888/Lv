package com.bw.test;

import org.junit.Test;

import com.bw.bean.Hello;

public class TestHello {
    @Test
    public void testHello(){
    	Hello hello=new Hello();
    	String sayHello = hello.sayHello();
    	System.out.println(sayHello);
    }
}
