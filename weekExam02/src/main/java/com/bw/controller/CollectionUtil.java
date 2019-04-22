package com.bw.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionUtil {

	
	public boolean notEmpty(List list){//判断List集合是否有元素，对象为空或对象中没有元素
	     if (list.isEmpty()) {
			return true;
		} else {
            return false;
		}
	}
	public boolean notEmpty(Set set){//判断Set集合是否有元素，对象为空或对象中没有元素
	     if (set.isEmpty()) {
			return true;
		} else {
           return false;
		}
	}
	public boolean notEmpty(Map map){//判断map集合是否有元素，对象为空或对象中没有元素
	     if (map.isEmpty()) {
			return true;
		} else {
           return false;
		}
	}

}
